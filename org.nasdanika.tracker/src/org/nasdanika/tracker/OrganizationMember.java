/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A member of a development team.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.OrganizationMember#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.OrganizationMember#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.OrganizationMember#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.nasdanika.tracker.OrganizationMember#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OrganizationMember extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Developer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Developer#getOrganizationMember <em>Organization Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer may play different roles for different artifacts/components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Roles()
	 * @see org.nasdanika.tracker.Developer#getOrganizationMember
	 * @model opposite="organizationMember"
	 * @generated
	 */
	EList<Developer> getRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.OrganizationMember#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Availability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Availability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Availability()
	 * @model containment="true"
	 * @generated
	 */
	EList<Availability> getAvailability();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.OrganizationMember#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // OrganizationMember
