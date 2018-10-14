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
 *   <li>{@link org.nasdanika.tracker.OrganizationMember#getUrl <em>Url</em>}</li>
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
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.Developer#getDeveloper <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer may play different roles for different artifacts/components.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Roles()
	 * @see org.nasdanika.tracker.Developer#getDeveloper
	 * @model opposite="developer"
	 * @generated
	 */
	EList<Developer> getRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer name, e.g. Daniel Vedamuthu.
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
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL to contact the developer - e-mail address or home page in Citi collaborate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganizationMember_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.OrganizationMember#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // OrganizationMember
