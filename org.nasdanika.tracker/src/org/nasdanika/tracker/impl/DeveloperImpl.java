/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.Role;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.DeveloperImpl#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.DeveloperImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeveloperImpl extends CDOObjectImpl implements Developer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeveloperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.DEVELOPER;
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
	public OrganizationMember getDeveloper() {
		return (OrganizationMember)eGet(TrackerPackage.Literals.DEVELOPER__DEVELOPER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeveloper(OrganizationMember newDeveloper) {
		eSet(TrackerPackage.Literals.DEVELOPER__DEVELOPER, newDeveloper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eGet(TrackerPackage.Literals.DEVELOPER__ROLES, true);
	}

} //DeveloperImpl
