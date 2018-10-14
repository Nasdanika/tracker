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
 * A role developer plays for a particular component.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Developer#getDeveloper <em>Developer</em>}</li>
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
	 * Returns the value of the '<em><b>Developer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.OrganizationMember#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Developer</em>' reference.
	 * @see #setDeveloper(OrganizationMember)
	 * @see org.nasdanika.tracker.TrackerPackage#getDeveloper_Developer()
	 * @see org.nasdanika.tracker.OrganizationMember#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	OrganizationMember getDeveloper();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Developer#getDeveloper <em>Developer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developer</em>' reference.
	 * @see #getDeveloper()
	 * @generated
	 */
	void setDeveloper(OrganizationMember value);

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

} // Developer
