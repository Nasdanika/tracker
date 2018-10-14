/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.CategoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.CategoryImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.CategoryImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends CDOObjectImpl implements Category {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.CATEGORY;
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
	public String getName() {
		return (String)eGet(TrackerPackage.Literals.CATEGORY__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TrackerPackage.Literals.CATEGORY__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getAssignedTo() {
		return (Developer)eGet(TrackerPackage.Literals.CATEGORY__ASSIGNED_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedTo(Developer newAssignedTo) {
		eSet(TrackerPackage.Literals.CATEGORY__ASSIGNED_TO, newAssignedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(TrackerPackage.Literals.CATEGORY__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(TrackerPackage.Literals.CATEGORY__DESCRIPTION, newDescription);
	}

} //CategoryImpl
