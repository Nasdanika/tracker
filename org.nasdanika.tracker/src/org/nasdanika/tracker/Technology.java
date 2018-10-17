/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technology, e.g. Java, .Net, AWS, RabbitMQ
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Technology#getReleases <em>Releases</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Technology#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getTechnology()
 * @model
 * @generated
 */
public interface Technology extends Knowledge {
	/**
	 * Returns the value of the '<em><b>Releases</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Release}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getTechnology_Releases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Release> getReleases();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technology forms a tree.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getTechnology_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getChildren();

} // Technology
