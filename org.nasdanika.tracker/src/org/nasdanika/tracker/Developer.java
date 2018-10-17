/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Roles an organization member plays in development of the containing artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Developer#getOrganizationMember <em>Organization Member</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Developer#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Developer#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getDeveloper()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Developer extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Organization Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.OrganizationMember#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization member.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Member</em>' reference.
	 * @see #setOrganizationMember(OrganizationMember)
	 * @see org.nasdanika.tracker.TrackerPackage#getDeveloper_OrganizationMember()
	 * @see org.nasdanika.tracker.OrganizationMember#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	OrganizationMember getOrganizationMember();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Developer#getOrganizationMember <em>Organization Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Member</em>' reference.
	 * @see #getOrganizationMember()
	 * @generated
	 */
	void setOrganizationMember(OrganizationMember value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Role#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getDeveloper_Roles()
	 * @see org.nasdanika.tracker.Role#getDevelopers
	 * @model opposite="developers"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getDeveloper_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Developer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Developer
