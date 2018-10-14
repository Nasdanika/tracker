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
 *   <li>{@link org.nasdanika.tracker.Organization#getOrgInfoArtifactID <em>Org Info Artifact ID</em>}</li>
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
	 * Development team contains developers. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrganizationMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Org Info Artifact ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maven group ID, e.g. ``com.citi.169073.ccp.rel``. Departments with blank groupID inherit it from parent/container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Org Info Artifact ID</em>' attribute.
	 * @see #setOrgInfoArtifactID(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getOrganization_OrgInfoArtifactID()
	 * @model
	 * @generated
	 */
	String getOrgInfoArtifactID();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Organization#getOrgInfoArtifactID <em>Org Info Artifact ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Org Info Artifact ID</em>' attribute.
	 * @see #getOrgInfoArtifactID()
	 * @generated
	 */
	void setOrgInfoArtifactID(String value);

} // Organization
