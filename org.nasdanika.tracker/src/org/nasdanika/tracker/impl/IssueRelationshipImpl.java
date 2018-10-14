/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;

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
 * </ul>
 *
 * @generated
 */
public class IssueRelationshipImpl extends CDOObjectImpl implements IssueRelationship {
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
		return (Issue)eGet(TrackerPackage.Literals.ISSUE_RELATIONSHIP__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Issue newTarget) {
		eSet(TrackerPackage.Literals.ISSUE_RELATIONSHIP__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType getType() {
		return (IssueRelationshipType)eGet(TrackerPackage.Literals.ISSUE_RELATIONSHIP__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IssueRelationshipType newType) {
		eSet(TrackerPackage.Literals.ISSUE_RELATIONSHIP__TYPE, newType);
	}

} //IssueRelationshipImpl
