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
 *   <li>{@link org.nasdanika.tracker.IssueRelationship#getDescription <em>Description</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Issue#getInboundRelationships <em>Inbound Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship target issue. The container is the source.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Issue)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship_Target()
	 * @see org.nasdanika.tracker.Issue#getInboundRelationships
	 * @model opposite="inboundRelationships"
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
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(IssueRelationshipType)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship_Type()
	 * @model
	 * @generated
	 */
	IssueRelationshipType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationship#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(IssueRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationship_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // IssueRelationship
