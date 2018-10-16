/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.IssueRelationshipType#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.IssueRelationshipType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.IssueRelationshipType#getBlockingDirection <em>Blocking Direction</em>}</li>
 *   <li>{@link org.nasdanika.tracker.IssueRelationshipType#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface IssueRelationshipType extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationshipType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationshipType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Blocking Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.tracker.IssueRelationshipBlockingDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates blocking direction. E.g. "Parent" relationship is source blocking. The source issue (parent) is blocked by the target (child).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blocking Direction</em>' attribute.
	 * @see org.nasdanika.tracker.IssueRelationshipBlockingDirection
	 * @see #setBlockingDirection(IssueRelationshipBlockingDirection)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType_BlockingDirection()
	 * @model
	 * @generated
	 */
	IssueRelationshipBlockingDirection getBlockingDirection();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationshipType#getBlockingDirection <em>Blocking Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Direction</em>' attribute.
	 * @see org.nasdanika.tracker.IssueRelationshipBlockingDirection
	 * @see #getBlockingDirection()
	 * @generated
	 */
	void setBlockingDirection(IssueRelationshipBlockingDirection value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(IssueRelationshipType)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssueRelationshipType_Opposite()
	 * @model
	 * @generated
	 */
	IssueRelationshipType getOpposite();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.IssueRelationshipType#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(IssueRelationshipType value);

} // IssueRelationshipType
