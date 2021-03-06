/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
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
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#isAutoCreateUsers <em>Auto Create Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.TrackerImpl#getOrganizations <em>Organizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrackerImpl extends LoginPasswordRealmImpl implements Tracker {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isAutoCreateUsers() <em>Auto Create Users</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoCreateUsers()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_CREATE_USERS_EDEFAULT = false;
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
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.TRACKER__NAME, TrackerPackage.Literals.TRACKER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.TRACKER__NAME, TrackerPackage.Literals.TRACKER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getUsers() {
		return (EList<User>)eDynamicGet(TrackerPackage.TRACKER__USERS, TrackerPackage.Literals.TRACKER__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoCreateUsers() {
		return (Boolean)eDynamicGet(TrackerPackage.TRACKER__AUTO_CREATE_USERS, TrackerPackage.Literals.TRACKER__AUTO_CREATE_USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoCreateUsers(boolean newAutoCreateUsers) {
		eDynamicSet(TrackerPackage.TRACKER__AUTO_CREATE_USERS, TrackerPackage.Literals.TRACKER__AUTO_CREATE_USERS, newAutoCreateUsers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Organization> getOrganizations() {
		return (EList<Organization>)eDynamicGet(TrackerPackage.TRACKER__ORGANIZATIONS, TrackerPackage.Literals.TRACKER__ORGANIZATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.TRACKER__DESCRIPTION, TrackerPackage.Literals.TRACKER__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.TRACKER__DESCRIPTION, TrackerPackage.Literals.TRACKER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.TRACKER__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case TrackerPackage.TRACKER__ORGANIZATIONS:
				return ((InternalEList<?>)getOrganizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.TRACKER__NAME:
				return getName();
			case TrackerPackage.TRACKER__DESCRIPTION:
				return getDescription();
			case TrackerPackage.TRACKER__AUTO_CREATE_USERS:
				return isAutoCreateUsers();
			case TrackerPackage.TRACKER__USERS:
				return getUsers();
			case TrackerPackage.TRACKER__ORGANIZATIONS:
				return getOrganizations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrackerPackage.TRACKER__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.TRACKER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.TRACKER__AUTO_CREATE_USERS:
				setAutoCreateUsers((Boolean)newValue);
				return;
			case TrackerPackage.TRACKER__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case TrackerPackage.TRACKER__ORGANIZATIONS:
				getOrganizations().clear();
				getOrganizations().addAll((Collection<? extends Organization>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrackerPackage.TRACKER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.TRACKER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.TRACKER__AUTO_CREATE_USERS:
				setAutoCreateUsers(AUTO_CREATE_USERS_EDEFAULT);
				return;
			case TrackerPackage.TRACKER__USERS:
				getUsers().clear();
				return;
			case TrackerPackage.TRACKER__ORGANIZATIONS:
				getOrganizations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrackerPackage.TRACKER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.TRACKER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.TRACKER__AUTO_CREATE_USERS:
				return isAutoCreateUsers() != AUTO_CREATE_USERS_EDEFAULT;
			case TrackerPackage.TRACKER__USERS:
				return !getUsers().isEmpty();
			case TrackerPackage.TRACKER__ORGANIZATIONS:
				return !getOrganizations().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrackerImpl
