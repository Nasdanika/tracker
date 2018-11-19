package org.nasdanika.tracker.web.route;

import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.core.ContextParameter;
import org.nasdanika.html.Tag;
import org.nasdanika.html.app.ActionRenderer;
import org.nasdanika.html.app.ActionRendererImpl;
import org.nasdanika.html.app.Application;
import org.nasdanika.html.app.BootstrapContainerApplication;
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
		Application app = new BootstrapContainerApplication(Theme.Litera) {
			
			{
				container.border(Color.DANGER);
				header.border(Color.DANGER).background(Color.PRIMARY);
				navigation.border(Color.DANGER);
				leftPanel.border(Color.DANGER).widthAuto();
				footer.border(Color.DANGER);
				content.border(Color.DANGER);
			}
			
		};
		Tag treeContainer = app.getHTMLPage().getFactory().div();
		app.header("header").navigation("navigation").leftPanel(treeContainer).content("content").footer("footer");
		
		JsTreeFactory jsTreeFactory = JsTreeFactory.INSTANCE;
		jsTreeFactory.cdn(app.getHTMLPage());
		
		FontAwesomeFactory.INSTANCE.cdn(app.getHTMLPage());
				
		app.getHTMLPage().body(jsTreeFactory.bind(treeContainer, jsTreeFactory.buildAjaxJsTree("jstree.json", "contextmenu.json")));		
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
		
		ActionRenderer actionRenderer = new ActionRendererImpl();
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
