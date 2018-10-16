/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.IssueRelationship;
import org.nasdanika.tracker.IssueRelationshipType;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueRelationshipImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueRelationshipImpl extends CDOObjectImpl implements IssueRelationship {
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
	protected IssueRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ISSUE_RELATIONSHIP;
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
	public Issue getTarget() {
		return (Issue)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP__TARGET, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetTarget() {
		return (Issue)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP__TARGET, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Issue newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, TrackerPackage.ISSUE_RELATIONSHIP__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Issue newTarget) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP__TARGET, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType getType() {
		return (IssueRelationshipType)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP__TYPE, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType basicGetType() {
		return (IssueRelationshipType)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP__TYPE, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TYPE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IssueRelationshipType newType) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP__TYPE, TrackerPackage.Literals.ISSUE_RELATIONSHIP__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION, TrackerPackage.Literals.ISSUE_RELATIONSHIP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				Issue target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS, Issue.class, msgs);
				return basicSetTarget((Issue)otherEnd, msgs);
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
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				return basicSetTarget(null, msgs);
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
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case TrackerPackage.ISSUE_RELATIONSHIP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION:
				return getDescription();
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
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				setTarget((Issue)newValue);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP__TYPE:
				setType((IssueRelationshipType)newValue);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION:
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
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				setTarget((Issue)null);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP__TYPE:
				setType((IssueRelationshipType)null);
				return;
			case TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION:
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
			case TrackerPackage.ISSUE_RELATIONSHIP__TARGET:
				return basicGetTarget() != null;
			case TrackerPackage.ISSUE_RELATIONSHIP__TYPE:
				return basicGetType() != null;
			case TrackerPackage.ISSUE_RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
		}
		return super.eIsSet(featureID);
	}

} //IssueRelationshipImpl
