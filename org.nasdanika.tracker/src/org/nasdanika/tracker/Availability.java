/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Number of hours an organization member can spend working on organization's artifacts in a particular increment. It is used incremente planning when artifact versions are assigned to increments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Availability#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Availability#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Availability#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getAvailability()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Availability extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.tracker.TrackerPackage#getAvailability_Increment()
	 * @model required="true"
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Availability#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Availability in hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see #setAvailability(int)
	 * @see org.nasdanika.tracker.TrackerPackage#getAvailability_Availability()
	 * @model
	 * @generated
	 */
	int getAvailability();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Availability#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(int value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getAvailability_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Availability#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Availability
