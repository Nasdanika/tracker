/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Organization is a development team with developers or a grouping of organizations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Organization#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Organization#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Organization#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Organization#getSitesUrl <em>Sites Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Organization#getTechnologies <em>Technologies</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends Artifact {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.OrganizationMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization members participating in development of organization's artifacts in different roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizationMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts can be organized into groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Increments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Increment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization's work is organized into increments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Increments</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_Increments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Increment> getIncrements();

	/**
	 * Returns the value of the '<em><b>Sites Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base URL for artifact sites. Full URL of an artifact site is formed by adding group id, artifact id, and version to the base URL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sites Url</em>' attribute.
	 * @see #setSitesUrl(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_SitesUrl()
	 * @model
	 * @generated
	 */
	String getSitesUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Organization#getSitesUrl <em>Sites Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sites Url</em>' attribute.
	 * @see #getSitesUrl()
	 * @generated
	 */
	void setSitesUrl(String value);

	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technologies used in the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technologies</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Technology> getTechnologies();

} // Organization
