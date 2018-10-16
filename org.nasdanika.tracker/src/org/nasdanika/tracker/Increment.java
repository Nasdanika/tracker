/**
 */
package org.nasdanika.tracker;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time period during which an organization works on issues in its components. 
 * Increments can be nested. 
 * 
 * In the long term time periods can be years or quarters. In this case assignments of versions to increments would be a roadmap subject to change. Versions in this case would be more like "roadmap items"  or "milestones" - defined at a high level to be refined later.
 * In near term increments would be sprints and version to increment assignment would be used for capacity planning.
 * 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Increment#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Increment#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Increment#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Increment#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Increment#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Increment#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getIncrement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Increment extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment name. E.g. "2019" or "Sprint 1".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Increment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Increment#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Version}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Version#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versions planned for this increment or released in this increment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_Versions()
	 * @see org.nasdanika.tracker.Version#getIncrement
	 * @model opposite="increment"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Increment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increments can be nested. E.g.  Sprints can be nested into year or quarter increments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Increment> getChildren();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment start date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Increment#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment end date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getIncrement_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Increment#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // Increment
