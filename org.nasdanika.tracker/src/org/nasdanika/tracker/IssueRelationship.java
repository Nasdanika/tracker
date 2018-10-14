/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship between issues.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.IssueRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.tracker.IssueRelationship#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IssueRelationship extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Issue)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship_Target()
	 * @model
	 * @generated
	 */
	Issue getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Issue value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.tracker.IssueRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target issue. Source issue is the one containing the relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.tracker.IssueRelationshipType
	 * @see #setType(IssueRelationshipType)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship_Type()
	 * @model
	 * @generated
	 */
	IssueRelationshipType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.tracker.IssueRelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(IssueRelationshipType value);

} // IssueRelationship
