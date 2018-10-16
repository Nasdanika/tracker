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

import org.nasdanika.tracker.Group;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.GroupImpl#isPrivate <em>Private</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends CDOObjectImpl implements Group {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.GROUP;
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
	public String getId() {
		return (String)eDynamicGet(TrackerPackage.GROUP__ID, TrackerPackage.Literals.GROUP__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(TrackerPackage.GROUP__ID, TrackerPackage.Literals.GROUP__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.GROUP__NAME, TrackerPackage.Literals.GROUP__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.GROUP__NAME, TrackerPackage.Literals.GROUP__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.GROUP__DESCRIPTION, TrackerPackage.Literals.GROUP__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.GROUP__DESCRIPTION, TrackerPackage.Literals.GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Group> getChildren() {
		return (EList<Group>)eDynamicGet(TrackerPackage.GROUP__CHILDREN, TrackerPackage.Literals.GROUP__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationMember> getMembers() {
		return (EList<OrganizationMember>)eDynamicGet(TrackerPackage.GROUP__MEMBERS, TrackerPackage.Literals.GROUP__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return (Boolean)eDynamicGet(TrackerPackage.GROUP__PRIVATE, TrackerPackage.Literals.GROUP__PRIVATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		eDynamicSet(TrackerPackage.GROUP__PRIVATE, TrackerPackage.Literals.GROUP__PRIVATE, newPrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.GROUP__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.GROUP__ID:
				return getId();
			case TrackerPackage.GROUP__NAME:
				return getName();
			case TrackerPackage.GROUP__DESCRIPTION:
				return getDescription();
			case TrackerPackage.GROUP__CHILDREN:
				return getChildren();
			case TrackerPackage.GROUP__MEMBERS:
				return getMembers();
			case TrackerPackage.GROUP__PRIVATE:
				return isPrivate();
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
			case TrackerPackage.GROUP__ID:
				setId((String)newValue);
				return;
			case TrackerPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.GROUP__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Group>)newValue);
				return;
			case TrackerPackage.GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends OrganizationMember>)newValue);
				return;
			case TrackerPackage.GROUP__PRIVATE:
				setPrivate((Boolean)newValue);
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
			case TrackerPackage.GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case TrackerPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.GROUP__CHILDREN:
				getChildren().clear();
				return;
			case TrackerPackage.GROUP__MEMBERS:
				getMembers().clear();
				return;
			case TrackerPackage.GROUP__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
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
			case TrackerPackage.GROUP__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case TrackerPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.GROUP__CHILDREN:
				return !getChildren().isEmpty();
			case TrackerPackage.GROUP__MEMBERS:
				return !getMembers().isEmpty();
			case TrackerPackage.GROUP__PRIVATE:
				return isPrivate() != PRIVATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
