/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.Role;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.DeveloperImpl#getOrganizationMember <em>Organization Member</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.DeveloperImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.DeveloperImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeveloperImpl extends CDOObjectImpl implements Developer {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeveloperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.DEVELOPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationMember getOrganizationMember() {
		return (OrganizationMember)eDynamicGet(TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER, TrackerPackage.Literals.DEVELOPER__ORGANIZATION_MEMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationMember basicGetOrganizationMember() {
		return (OrganizationMember)eDynamicGet(TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER, TrackerPackage.Literals.DEVELOPER__ORGANIZATION_MEMBER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationMember(OrganizationMember newOrganizationMember, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOrganizationMember, TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganizationMember(OrganizationMember newOrganizationMember) {
		eDynamicSet(TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER, TrackerPackage.Literals.DEVELOPER__ORGANIZATION_MEMBER, newOrganizationMember);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(TrackerPackage.DEVELOPER__ROLES, TrackerPackage.Literals.DEVELOPER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.DEVELOPER__DESCRIPTION, TrackerPackage.Literals.DEVELOPER__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.DEVELOPER__DESCRIPTION, TrackerPackage.Literals.DEVELOPER__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				OrganizationMember organizationMember = basicGetOrganizationMember();
				if (organizationMember != null)
					msgs = ((InternalEObject)organizationMember).eInverseRemove(this, TrackerPackage.ORGANIZATION_MEMBER__ROLES, OrganizationMember.class, msgs);
				return basicSetOrganizationMember((OrganizationMember)otherEnd, msgs);
			case TrackerPackage.DEVELOPER__ROLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRoles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				return basicSetOrganizationMember(null, msgs);
			case TrackerPackage.DEVELOPER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				if (resolve) return getOrganizationMember();
				return basicGetOrganizationMember();
			case TrackerPackage.DEVELOPER__ROLES:
				return getRoles();
			case TrackerPackage.DEVELOPER__DESCRIPTION:
				return getDescription();
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
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				setOrganizationMember((OrganizationMember)newValue);
				return;
			case TrackerPackage.DEVELOPER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case TrackerPackage.DEVELOPER__DESCRIPTION:
				setDescription((String)newValue);
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
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				setOrganizationMember((OrganizationMember)null);
				return;
			case TrackerPackage.DEVELOPER__ROLES:
				getRoles().clear();
				return;
			case TrackerPackage.DEVELOPER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case TrackerPackage.DEVELOPER__ORGANIZATION_MEMBER:
				return basicGetOrganizationMember() != null;
			case TrackerPackage.DEVELOPER__ROLES:
				return !getRoles().isEmpty();
			case TrackerPackage.DEVELOPER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //DeveloperImpl
