package org.nasdanika.tracker.web.render;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.web.CDOTransactionHttpServletRequestContext;
import org.nasdanika.html.emf.KnockoutEObjectRenderer;

/**
 * Base renderer for the tracker.
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public class TrackerBaseRenderer<T extends EObject> extends KnockoutEObjectRenderer<T> {

	protected CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context;

	public TrackerBaseRenderer(CDOTransactionHttpServletRequestContext<LoginPasswordCredentials> context, T eObject) {
		super(eObject);
		this.context = context;
	}

}
