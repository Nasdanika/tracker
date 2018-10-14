/**
 */
package org.nasdanika.tracker;

import java.util.Date;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Note#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Note#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Note#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getNote()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Note extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Developer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developer</em>' reference.
	 * @see #setDeveloper(Developer)
	 * @see org.nasdanika.tracker.TrackerPackage#getNote_Developer()
	 * @model
	 * @generated
	 */
	Developer getDeveloper();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Note#getDeveloper <em>Developer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developer</em>' reference.
	 * @see #getDeveloper()
	 * @generated
	 */
	void setDeveloper(Developer value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getNote_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Note#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getNote_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Note#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Note
