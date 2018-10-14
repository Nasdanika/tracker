/**
 */
package org.nasdanika.tracker.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#isReleased <em>Released</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends CDOObjectImpl implements Version {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.VERSION;
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
	public String getNumber() {
		return (String)eGet(TrackerPackage.Literals.VERSION__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		eSet(TrackerPackage.Literals.VERSION__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eGet(TrackerPackage.Literals.VERSION__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eSet(TrackerPackage.Literals.VERSION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment getIncrement() {
		return (Increment)eGet(TrackerPackage.Literals.VERSION__INCREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(Increment newIncrement) {
		eSet(TrackerPackage.Literals.VERSION__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReleased() {
		return (Boolean)eGet(TrackerPackage.Literals.VERSION__RELEASED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleased(boolean newReleased) {
		eSet(TrackerPackage.Literals.VERSION__RELEASED, newReleased);
	}

} //VersionImpl
