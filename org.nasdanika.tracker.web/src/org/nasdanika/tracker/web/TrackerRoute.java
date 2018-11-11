package org.nasdanika.tracker.web;

import org.nasdanika.web.HttpServletRequestContext;
import org.nasdanika.web.Action;
import org.nasdanika.web.ValueAction;
import org.nasdanika.web.Route;

/**
 * Route to demonstrate/test HTMLFactory capabilities
 *
 */
public class TrackerRoute implements Route {

	@Override
	public Action execute(HttpServletRequestContext context, Object... args) throws Exception {
		return new ValueAction("Tracker Works!!!");
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void close() throws Exception {
		// NOP
	}

}
