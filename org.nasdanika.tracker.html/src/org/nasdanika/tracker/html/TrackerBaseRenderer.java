package org.nasdanika.tracker.html;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.html.emf.KnockoutEObjectRenderer;

/**
 * Base renderer for the tracker.
 * @author Pavel Vlasov
 *
 * @param <T>
 */
public class TrackerBaseRenderer<T extends EObject> extends KnockoutEObjectRenderer<T, TrackerRenderingContext> {

	protected TrackerBaseRenderer(T eObject, TrackerRenderingContext renderingContext) {
		super(eObject, renderingContext);
	}


}
