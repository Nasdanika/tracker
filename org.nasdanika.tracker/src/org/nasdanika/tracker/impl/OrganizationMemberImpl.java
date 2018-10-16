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

import org.nasdanika.tracker.Availability;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationMemberImpl extends CDOObjectImpl implements OrganizationMember {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ORGANIZATION_MEMBER;
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
	@SuppressWarnings("unchecked")
	public EList<Developer> getRoles() {
		return (EList<Developer>)eDynamicGet(TrackerPackage.ORGANIZATION_MEMBER__ROLES, TrackerPackage.Literals.ORGANIZATION_MEMBER__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.ORGANIZATION_MEMBER__NAME, TrackerPackage.Literals.ORGANIZATION_MEMBER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.ORGANIZATION_MEMBER__NAME, TrackerPackage.Literals.ORGANIZATION_MEMBER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Availability> getAvailability() {
		return (EList<Availability>)eDynamicGet(TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY, TrackerPackage.Literals.ORGANIZATION_MEMBER__AVAILABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION, TrackerPackage.Literals.ORGANIZATION_MEMBER__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION, TrackerPackage.Literals.ORGANIZATION_MEMBER__DESCRIPTION, newDescription);
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY:
				return ((InternalEList<?>)getAvailability()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
				return getRoles();
			case TrackerPackage.ORGANIZATION_MEMBER__NAME:
				return getName();
			case TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY:
				return getAvailability();
			case TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION:
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Developer>)newValue);
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY:
				getAvailability().clear();
				getAvailability().addAll((Collection<? extends Availability>)newValue);
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION:
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
				getRoles().clear();
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY:
				getAvailability().clear();
				return;
			case TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION:
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
			case TrackerPackage.ORGANIZATION_MEMBER__ROLES:
				return !getRoles().isEmpty();
			case TrackerPackage.ORGANIZATION_MEMBER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.ORGANIZATION_MEMBER__AVAILABILITY:
				return !getAvailability().isEmpty();
			case TrackerPackage.ORGANIZATION_MEMBER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //OrganizationMemberImpl
