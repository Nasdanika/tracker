/**
 */
package org.nasdanika.tracker;

import org.nasdanika.cdo.security.LoginPasswordHashUser;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.User#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.User#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.tracker.User#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.User#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.User#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link org.nasdanika.tracker.User#getTimezone <em>Timezone</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getUser()
 * @model
 * @generated
 */
public interface User extends LoginPasswordHashUser {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User name, e.g. "Joe Smith"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User e-mail.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_EMail()
	 * @model
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Comment in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User "home page", e.g. Github profile or an entry in the organization directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of a user picture.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Avatar</em>' attribute.
	 * @see #setAvatar(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_Avatar()
	 * @model
	 * @generated
	 */
	String getAvatar();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getAvatar <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar</em>' attribute.
	 * @see #getAvatar()
	 * @generated
	 */
	void setAvatar(String value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time zone of user location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getUser_Timezone()
	 * @model
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.User#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

} // User
