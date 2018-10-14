/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.OrganizationMemberImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrganizationMemberImpl extends CDOObjectImpl implements OrganizationMember {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganizationMemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ORGANIZATION_MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Developer> getRoles() {
		return (EList<Developer>)eGet(TrackerPackage.Literals.ORGANIZATION_MEMBER__ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TrackerPackage.Literals.ORGANIZATION_MEMBER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TrackerPackage.Literals.ORGANIZATION_MEMBER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eGet(TrackerPackage.Literals.ORGANIZATION_MEMBER__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(TrackerPackage.Literals.ORGANIZATION_MEMBER__URL, newUrl);
	}

} //OrganizationMemberImpl
