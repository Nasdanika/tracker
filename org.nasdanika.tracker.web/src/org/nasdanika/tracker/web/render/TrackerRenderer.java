package org.nasdanika.tracker.web.render;

import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.tracker.Tracker;

public class TrackerRenderer extends TrackerBaseRenderer<Tracker> {

	public TrackerRenderer(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, Tracker eObject) {
		super(context, eObject);
	}

}
