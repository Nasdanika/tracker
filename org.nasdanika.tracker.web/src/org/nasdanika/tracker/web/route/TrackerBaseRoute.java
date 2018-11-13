package org.nasdanika.tracker.web.route;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.RenderingRoute;
import org.nasdanika.html.emf.Renderer;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.web.render.TrackerBaseRenderer;
import org.nasdanika.tracker.web.render.TrackerRenderer;
import org.nasdanika.web.Resource;
import org.osgi.framework.FrameworkUtil;

/**
 * Base class for Tracker application routes.
 * It serves as a registry and a factory for renderers.
 * @author Pavel Vlasov
 *
 * @param <T>
 */
@Resource(
		value="resources/", 
		bundle="org.nasdanika.html.bootstrap", 
		path="resources/bootstrap/", 
		comment="Bootstrap resources")
public class TrackerBaseRoute<T extends CDOObject> extends RenderingRoute<T, CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>> {
	
	private class RendererEntry implements Comparable<RendererEntry> {
		
		private EClass eClass;
		private Class<? extends TrackerBaseRenderer<?>> rendererClass;

		RendererEntry(EClass eClass, Class<? extends TrackerBaseRenderer<?>> rendererClass) {
			this.eClass = eClass;
			this.rendererClass = rendererClass;
		}
		
		@Override
		public int compareTo(TrackerBaseRoute<T>.RendererEntry otherEntry) {
			if (otherEntry == this) {
				return 0;
			}
			if (otherEntry.eClass == eClass) {
				return 0;
			}
			if (otherEntry.eClass.isSuperTypeOf(eClass)) {
				return -1; // This one is more specific - shall be ahead  
			}
			if (eClass.isSuperTypeOf(otherEntry.eClass)) {
				return 1; // The other one one is more specific - this one shall be behind  
			}
			// Name comparison 
			int cmp = eClass.getEPackage().getNsURI().compareTo(otherEntry.eClass.getEPackage().getNsURI());
			return cmp == 0 ? eClass.getName().compareTo(otherEntry.eClass.getName()) : cmp;
		}
		
		Renderer createRenderer(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, CDOObject obj) throws Exception {
			if (eClass.isInstance(obj)) {
				for (Constructor<?> c: rendererClass.getConstructors()) {
					Class<?>[] pt = c.getParameterTypes();
					if (pt.length == 2 && pt[0].isInstance(context) && pt[1].isInstance(obj)) {
						return (Renderer) c.newInstance(context, obj);
					}
				}
				throw new NoSuchMethodException("Cannot construct "+rendererClass+" from "+ context +" and "+ obj);
			}
			throw new IllegalArgumentException(obj + " is not an instance of "+eClass.getName());
		}
		
	}
	
	private List<RendererEntry> renderers = new ArrayList<>();
	
	protected TrackerBaseRoute() throws Exception {
		super(FrameworkUtil.getBundle(TrackerRoute.class).getBundleContext());
		renderers.add(new RendererEntry(TrackerPackage.Literals.TRACKER, TrackerRenderer.class));
		
		Collections.sort(renderers);
	}

	@Override
	protected Renderer createRenderer(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, CDOObject obj) throws Exception {
		for (RendererEntry re: renderers) {
			if (re.eClass.isInstance(obj)) {
				return re.createRenderer(context, obj);
			}
		}
		throw new IllegalStateException("No renderer found for "+obj);
	}

	
	
}

/*
Tracker	
User	
Developer	Roles an organization member plays in development of the containing artifact.
Group	Time zone of user location.
Artifact	Maven artifact, a.k.a.
Role	User/member role.
Organization	Organization is a development team with developers or a grouping of organizations.
OrganizationMember	A member of a development team.


Category	Issue category.
Issue	Issue is something that needs to be acted upon to modify the state of the artifact.
IssuePriority	
IssueRelationship	Relationship between issues.
IssueRelationshipType	
IssueResolution	
IssueStatus	
Note	A note/comment for an issue.

Increment	Time period during which an organization works on issues in its components.
Version	Artifacts have multiple versions.


Availability	Number of hours an organization member can spend working on organization’s artifacts in a particular increment.
Capability	Something that might be required to, say, implement an issue.
Knowledge	Base abstract class for something which people can be experienced in - technologies and artifacts.
ProgressReport	Progress reports are submitted by developers working on issues and are aggregated for issues/versions/projects.
Release	Technology release. E.g.
Requirement	Requirement of a capability.
Skill	
Technology	Technology, e.g. Java, .Net, AWS, RabbitMQ
*/