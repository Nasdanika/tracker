/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.tracker.Group;
import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.Organization;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationImpl#getIncrements <em>Increments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends ArtifactImpl implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationMember> getMembers() {
		return (EList<OrganizationMember>)eDynamicGet(TrackerPackage.ORGANIZATION__MEMBERS, TrackerPackage.Literals.ORGANIZATION__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(TrackerPackage.ORGANIZATION__GROUPS, TrackerPackage.Literals.ORGANIZATION__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Increment> getIncrements() {
		return (EList<Increment>)eDynamicGet(TrackerPackage.ORGANIZATION__INCREMENTS, TrackerPackage.Literals.ORGANIZATION__INCREMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.ORGANIZATION__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ORGANIZATION__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ORGANIZATION__INCREMENTS:
				return ((InternalEList<?>)getIncrements()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.ORGANIZATION__MEMBERS:
				return getMembers();
			case TrackerPackage.ORGANIZATION__GROUPS:
				return getGroups();
			case TrackerPackage.ORGANIZATION__INCREMENTS:
				return getIncrements();
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
			case TrackerPackage.ORGANIZATION__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends OrganizationMember>)newValue);
				return;
			case TrackerPackage.ORGANIZATION__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case TrackerPackage.ORGANIZATION__INCREMENTS:
				getIncrements().clear();
				getIncrements().addAll((Collection<? extends Increment>)newValue);
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
			case TrackerPackage.ORGANIZATION__MEMBERS:
				getMembers().clear();
				return;
			case TrackerPackage.ORGANIZATION__GROUPS:
				getGroups().clear();
				return;
			case TrackerPackage.ORGANIZATION__INCREMENTS:
				getIncrements().clear();
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
			case TrackerPackage.ORGANIZATION__MEMBERS:
				return !getMembers().isEmpty();
			case TrackerPackage.ORGANIZATION__GROUPS:
				return !getGroups().isEmpty();
			case TrackerPackage.ORGANIZATION__INCREMENTS:
				return !getIncrements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrganizationImpl
