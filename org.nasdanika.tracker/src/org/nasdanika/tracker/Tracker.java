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
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Tracker#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#isAutoCreateUsers <em>Auto Create Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Tracker#getOrganizations <em>Organizations</em>}</li>
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

} // Tracker
