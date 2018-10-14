/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.tracker.Organization;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationImpl#getOrgInfoArtifactID <em>Org Info Artifact ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationImpl extends ArtifactImpl implements Organization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ORGANIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationMember> getMembers() {
		return (EList<OrganizationMember>)eGet(TrackerPackage.Literals.ORGANIZATION__MEMBERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrgInfoArtifactID() {
		return (String)eGet(TrackerPackage.Literals.ORGANIZATION__ORG_INFO_ARTIFACT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrgInfoArtifactID(String newOrgInfoArtifactID) {
		eSet(TrackerPackage.Literals.ORGANIZATION__ORG_INFO_ARTIFACT_ID, newOrgInfoArtifactID);
	}

} //OrganizationImpl
