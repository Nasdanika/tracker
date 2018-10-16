/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.IssueRelationshipBlockingDirection;
import org.nasdanika.tracker.IssueRelationshipType;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl#getBlockingDirection <em>Blocking Direction</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueRelationshipTypeImpl extends CDOObjectImpl implements IssueRelationshipType {
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
	 * The default value of the '{@link #getBlockingDirection() <em>Blocking Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockingDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IssueRelationshipBlockingDirection BLOCKING_DIRECTION_EDEFAULT = IssueRelationshipBlockingDirection.NONE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueRelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE;
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
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipBlockingDirection getBlockingDirection() {
		return (IssueRelationshipBlockingDirection)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockingDirection(IssueRelationshipBlockingDirection newBlockingDirection) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION, newBlockingDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType getOpposite() {
		return (IssueRelationshipType)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType basicGetOpposite() {
		return (IssueRelationshipType)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(IssueRelationshipType newOpposite) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, TrackerPackage.Literals.ISSUE_RELATIONSHIP_TYPE__OPPOSITE, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME:
				return getName();
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION:
				return getDescription();
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION:
				return getBlockingDirection();
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION:
				setBlockingDirection((IssueRelationshipBlockingDirection)newValue);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE:
				setOpposite((IssueRelationshipType)newValue);
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
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION:
				setBlockingDirection(BLOCKING_DIRECTION_EDEFAULT);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE:
				setOpposite((IssueRelationshipType)null);
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
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION:
				return getBlockingDirection() != BLOCKING_DIRECTION_EDEFAULT;
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE__OPPOSITE:
				return basicGetOpposite() != null;
		}
		return super.eIsSet(featureID);
	}

} //IssueRelationshipTypeImpl
