/**
 */
package org.nasdanika.tracker;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Artifacts have multiple versions. 
 * Version URL is constructed by adding version number to the artifact URL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Version#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Version#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Version#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Version#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Version#isReleased <em>Released</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getVersion()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Version extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version number, unique withing group ID/artifact ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getVersion_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Version#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getVersion_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Version#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date when a version is planned to be released or was released.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getVersion_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Version#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Increment#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Increment in which a version was released or is planned to be released. 
	 * This relationship is used for capacity planning.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increment</em>' reference.
	 * @see #setIncrement(Increment)
	 * @see org.nasdanika.tracker.TrackerPackage#getVersion_Increment()
	 * @see org.nasdanika.tracker.Increment#getVersions
	 * @model opposite="versions"
	 * @generated
	 */
	Increment getIncrement();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Version#getIncrement <em>Increment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' reference.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Increment value);

	/**
	 * Returns the value of the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Released</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Released</em>' attribute.
	 * @see #setReleased(boolean)
	 * @see org.nasdanika.tracker.TrackerPackage#getVersion_Released()
	 * @model
	 * @generated
	 */
	boolean isReleased();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Version#isReleased <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Released</em>' attribute.
	 * @see #isReleased()
	 * @generated
	 */
	void setReleased(boolean value);

} // Version
