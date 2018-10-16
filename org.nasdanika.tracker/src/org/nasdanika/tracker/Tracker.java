/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.cdo.security.LoginPasswordRealm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Tracker#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#isAutoCreateUsers <em>Auto Create Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#getSitesUrl <em>Sites Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getTracker()
 * @model
 * @generated
 */
public interface Tracker extends LoginPasswordRealm {
	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getTracker_Users()
	 * @model
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Auto Create Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this attribute is set to true users are automatically created by getUser(String) method.
	 * This attribute shall be set to true in SSO deployments where users are authenticated
	 * by external systems which pass user ID's to the application.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Create Users</em>' attribute.
	 * @see #setAutoCreateUsers(boolean)
	 * @see org.nasdanika.tracker.TrackerPackage#getTracker_AutoCreateUsers()
	 * @model
	 * @generated
	 */
	boolean isAutoCreateUsers();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Tracker#isAutoCreateUsers <em>Auto Create Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Create Users</em>' attribute.
	 * @see #isAutoCreateUsers()
	 * @generated
	 */
	void setAutoCreateUsers(boolean value);

	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getTracker_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Sites Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL for artifact sites. Full URL of an artifact site is formed by adding group id, artifact id, and version to the base URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sites Url</em>' attribute.
	 * @see #setSitesUrl(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getTracker_SitesUrl()
	 * @model
	 * @generated
	 */
	String getSitesUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Tracker#getSitesUrl <em>Sites Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sites Url</em>' attribute.
	 * @see #getSitesUrl()
	 * @generated
	 */
	void setSitesUrl(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getTracker_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Tracker#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Tracker
