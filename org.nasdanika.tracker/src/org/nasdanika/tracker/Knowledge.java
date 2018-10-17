/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base abstract class for something which people can be experienced in - technologies and artifacts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Knowledge#getExperts <em>Experts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getKnowledge()
 * @model abstract="true"
 * @generated
 */
public interface Knowledge extends Capability {
	/**
	 * Returns the value of the '<em><b>Experts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Skill}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Skill#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experts</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getKnowledge_Experts()
	 * @see org.nasdanika.tracker.Skill#getKnowledge
	 * @model opposite="knowledge"
	 * @generated
	 */
	EList<Skill> getExperts();

} // Knowledge
