package org.nasdanika.tracker.web.route;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.cdo.web.routes.RenderingRoute;
import org.nasdanika.html.emf.Renderer;
import org.nasdanika.html.emf.RenderingException;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.html.TrackerBaseRenderer;
import org.nasdanika.tracker.html.TrackerRenderer;
import org.nasdanika.tracker.html.TrackerRenderingContext;
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
public class TrackerBaseRoute<T extends CDOObject> extends RenderingRoute<T, CDOTransactionHttpServletRequestContext<LoginPasswordCredentials>, TrackerRenderingContext> {
	
	
	protected TrackerBaseRoute() throws Exception {
		super(FrameworkUtil.getBundle(TrackerRoute.class).getBundleContext());
		registerRenderer(TrackerPackage.Literals.TRACKER, TrackerRenderer.class);
	}
	
	@Override
	protected TrackerRenderingContext createRenderingContext(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context) {
		return new TrackerRenderingContext() {
			
			@Override
			public Renderer getRenderer(EClass eClass) {
				return TrackerBaseRoute.this.createRenderer(context, eClass);
			}
			
			@Override
			public Renderer getRenderer(EObject obj) {
				return TrackerBaseRoute.this.createRenderer(context, obj);
			}
		};
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