/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.cdo.security.impl.LoginPasswordRealmImpl;

import org.nasdanika.tracker.Organization;
import org.nasdanika.tracker.Tracker;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tracker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#isAutoCreateUsers <em>Auto Create Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackerImpl extends LoginPasswordRealmImpl implements Tracker {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.TRACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eGet(TrackerPackage.Literals.TRACKER__USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCreateUsers() {
		return (Boolean)eGet(TrackerPackage.Literals.TRACKER__AUTO_CREATE_USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCreateUsers(boolean newAutoCreateUsers) {
		eSet(TrackerPackage.Literals.TRACKER__AUTO_CREATE_USERS, newAutoCreateUsers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Organization> getOrganizations() {
		return (EList<Organization>)eGet(TrackerPackage.Literals.TRACKER__ORGANIZATIONS, true);
	}

} //TrackerImpl
