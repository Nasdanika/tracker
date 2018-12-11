package org.nasdanika.tracker.web.route;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Tag;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.ViewGenerator;
import org.nasdanika.html.app.impl.BootstrapContainerApplication;
import org.nasdanika.html.app.impl.ViewGeneratorImpl;
import org.nasdanika.html.bootstrap.Color;
import org.nasdanika.html.bootstrap.Theme;
import org.nasdanika.html.emf.Renderer;
import org.nasdanika.html.fontawesome.FontAwesomeFactory;
import org.nasdanika.html.jstree.JsTreeContextMenuItem;
import org.nasdanika.html.jstree.JsTreeFactory;
import org.nasdanika.html.jstree.JsTreeNode;
import org.nasdanika.tracker.Tracker;
import org.nasdanika.web.QueryParameter;
import org.nasdanika.web.RouteMethod;
import org.nasdanika.web.TargetParameter;

public class TrackerRoute extends TrackerBaseRoute<Tracker> {

	public TrackerRoute() throws Exception {
		super();
	}
	
	@RouteMethod(comment="For initial testing")
	public Object getIndexHtml(
			@ContextParameter CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context,
			@TargetParameter Tracker target) throws Exception {
		Application app = new BootstrapContainerApplication(Theme.Litera, true) {
			
			{
				container.border(Color.DANGER);
				header.border(Color.DANGER).background(Color.PRIMARY);
				navigationBar.border(Color.DANGER);
				navigationPanel.border(Color.DANGER).widthAuto();
				footer.border(Color.DANGER);
				contentPanel.border(Color.DANGER);
			}
			
		};
		Tag treeContainer = app.getHTMLPage().getFactory().div();
		app.header("header").navigationBar("navigation bar").navigationPanel(treeContainer).contentPanel("content").footer("footer");
		
		JsTreeFactory jsTreeFactory = JsTreeFactory.INSTANCE;
		jsTreeFactory.cdn(app.getHTMLPage());
		
		FontAwesomeFactory.INSTANCE.cdn(app.getHTMLPage());
				
		app.getHTMLPage().body(jsTreeFactory.bind(treeContainer, jsTreeFactory.buildAjaxJsTree("jstree.json", "contextmenu.json")));	
		
		System.out.println(context.getView().getProvider());
		System.out.println(context.getView().getResourceSet());		
		EList<AdapterFactory> adapterFactories = context.getView().getResourceSet().getAdapterFactories();
		adapterFactories.add(new AdapterFactoryImpl());
		System.out.println(adapterFactories);		
		return app;
	}
	
	@RouteMethod(comment="For initial testing")
	public Object getContextmenuJson(
			@ContextParameter CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context,
			@QueryParameter("id") String nodeId,
			@TargetParameter Tracker target) throws Exception {
		
		JsTreeFactory jsTreeFactory = JsTreeFactory.INSTANCE;		
		JsTreeContextMenuItem item = jsTreeFactory.jsTreeContextMenuItem();
		item.label("Do it "+nodeId);
		item.icon("far fa-user");
		item.action("window.location.href='http://www.nasdanika.org'; console.log('hey');");
		
		JSONObject menu = new JSONObject();
		menu.put("do-it", item.toJSON());
		return menu;
	}
	
	@RouteMethod(comment="For initial testing")
	public Object getJstreeJson(
			@ContextParameter CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context,
			@QueryParameter("id") String nodeId,
			@TargetParameter Tracker target) throws Exception {

		JsTreeFactory jsTreeFactory = JsTreeFactory.INSTANCE;		
		JSONArray ret = new JSONArray();
		
		ViewGenerator actionRenderer = new ViewGeneratorImpl(null, null);
		Renderer renderer = createRenderer(context, target);
		
		if ("#".equals(nodeId)) {
			JsTreeNode rootNode = actionRenderer.jsTreeNode(renderer.getViewAction(), true);
			ret.put(rootNode.toJSON());
		} else {			
			JsTreeNode childNode = jsTreeFactory.jsTreeNode();
			childNode.icon("far fa-user");
			childNode.text("Child of "+nodeId);
			childNode.hasChildren();
			childNode.id(jsTreeFactory.getHTMLFactory().nextId());
			
			ret.put(childNode.toJSON());
		}
		
		return ret;
	}
	

}
