package org.nasdanika.tracker.web;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.model.CDOPackageRegistry;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOCommitContext;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.transaction.CDOTransactionHandler2;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.nasdanika.cdo.CDOSessionInitializer;
import org.nasdanika.cdo.security.SecurityFactory;
import org.nasdanika.core.CoreUtil;
import org.nasdanika.core.CoreUtil.TokenSource;
import org.nasdanika.tracker.Tracker;
import org.nasdanika.tracker.TrackerFactory;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.User;
import org.osgi.service.component.ComponentContext;


public class TrackerSessionInitializerComponent implements CDOSessionInitializer {
	
	private List<String> initialContent = new ArrayList<>();
	
	public void activate(ComponentContext componentContext) {
		Object ic = componentContext.getProperties().get("initial-content");
		TokenSource pts = token -> System.getProperties().get(token);
		if (ic instanceof String) {
			initialContent.add(CoreUtil.interpolate((String) ic, pts));
		} else if (ic instanceof String[]) {
			for (String ice: (String[]) ic) {
				initialContent.add(CoreUtil.interpolate(ice, pts));
			}
		}		
	}	
	
	@Override
	public void init(CDOSession session) {
		System.out.println("Initializing session");
		
		// Register packages
		CDOPackageRegistry packageRegistry = session.getPackageRegistry();
		packageRegistry.putEPackage(TrackerPackage.eINSTANCE);

		packageRegistry.putEPackage(TrackerPackage.eINSTANCE);
		
		// Populate with initial data if empty.
		CDOTransaction transaction = session.openTransaction();				
		try {
			String resourceName = "/nasdanika-shinobi-tracker";
			if (!transaction.hasResource(resourceName) ) {
				CDOResource cRes = transaction.createResource(resourceName);
				
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
				resourceSet.getPackageRegistry().put(TrackerPackage.eNS_URI, TrackerPackage.eINSTANCE);
				boolean contentLoaded = false;

                List<Runnable> toRunOnCommitted = new ArrayList<>();

                transaction.addTransactionHandler(new CDOTransactionHandler2() {

                    @Override
                    public void committedTransaction(CDOTransaction transaction, CDOCommitContext ctx) {
                        for (Runnable r: toRunOnCommitted) {
                            r.run();
                        }
                    }

                    @Override
                    public void committingTransaction(CDOTransaction arg0, CDOCommitContext arg1) {
                        // NOP
                    }

                    @Override
                    public void rolledBackTransaction(CDOTransaction arg0) {
                        // NOP
                    }

                });
				
				for (String ic: initialContent) {
					if (!CoreUtil.isBlank(ic)) {
						File file = new File(ic);
						if (file.isFile()) {												
							URI uri = URI.createFileURI(file.getAbsolutePath());
							Resource resource = resourceSet.getResource(uri, true);
							System.out.println("Loaded " + uri);
			
							// Retrieve contents
							for (EObject eObject : resource.getContents()) {
								cRes.getContents().add(EcoreUtil.copy(eObject));
							}
							contentLoaded = true;

							toRunOnCommitted.add(new Runnable() {

	                            @Override
	                            public void run() {
	                                System.out.println("--- "+file.getName()+" ---");
	                                for (EObject obj: cRes.getContents()) {
	                                    dump(obj, 4);
	                                }
	                            }
	                            
	                        });
						} else {
							System.err.println("Initial content file does not exist or not a file: "+file.getAbsolutePath());
						}
					}
				}
				
				if (!contentLoaded) {
					// Creating tracker with admin user and guest					
					Tracker tracker = TrackerFactory.eINSTANCE.createTracker();
					tracker.setName("Nasdanika Shinobi Tracker");
					cRes.getContents().add(tracker);
					
					User admin = TrackerFactory.eINSTANCE.createUser();
					admin.setLogin("admin");
					admin.setName("Administrator");
					tracker.getUsers().add(admin);
					tracker.setPasswordHash(admin, "admin");
					
					tracker.setGuest(SecurityFactory.eINSTANCE.createGuest());	
					
					toRunOnCommitted.add(new Runnable() {

                        @Override
                        public void run() {
                            System.out.println("--- Programmatic ---");
                            for (EObject obj: cRes.getContents()) {
                                dump(obj, 4);
                            }
                        }
                        
                    });
				}
				
			}
			
			transaction.commit();
			transaction.close();
		} catch (CommitException e) {
			e.printStackTrace();
		}
	}
	
    @SuppressWarnings("unchecked")
    private void dump(EObject obj, int indent) {
        if (obj != null) {
            for (int i=0; i<indent; ++i) {
                System.out.print(" ");
            }
            if (obj instanceof CDOObject) {
                StringBuilder sb = new StringBuilder();
                CDOIDUtil.write(sb, ((CDOObject) obj).cdoID());
                System.out.print("["+sb+"] ");
            }
            System.out.print(obj.eClass().getName()+" ");
            System.out.println();
            for (EReference ref: obj.eClass().getEAllReferences()) {
                if (ref.isContainment()) {
                    for (int i=0; i<indent+2; ++i) {
                        System.out.print(" ");
                    }
                    System.out.println(ref.getName());
                    if (ref.isMany()) {
                        for (Object rv: ((Collection<Object>) obj.eGet(ref))) {
                            dump((EObject) rv, indent+4);
                        }
                    } else {
                        dump((EObject) obj.eGet(ref), indent+4);
                    }
                }
            }
        }
    }

}

