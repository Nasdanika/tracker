/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Availability;
import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.AvailabilityImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.AvailabilityImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.AvailabilityImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends CDOObjectImpl implements Availability {
	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final int AVAILABILITY_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.AVAILABILITY;
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
	public Increment getIncrement() {
		return (Increment)eDynamicGet(TrackerPackage.AVAILABILITY__INCREMENT, TrackerPackage.Literals.AVAILABILITY__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment basicGetIncrement() {
		return (Increment)eDynamicGet(TrackerPackage.AVAILABILITY__INCREMENT, TrackerPackage.Literals.AVAILABILITY__INCREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(Increment newIncrement) {
		eDynamicSet(TrackerPackage.AVAILABILITY__INCREMENT, TrackerPackage.Literals.AVAILABILITY__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAvailability() {
		return (Integer)eDynamicGet(TrackerPackage.AVAILABILITY__AVAILABILITY, TrackerPackage.Literals.AVAILABILITY__AVAILABILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(int newAvailability) {
		eDynamicSet(TrackerPackage.AVAILABILITY__AVAILABILITY, TrackerPackage.Literals.AVAILABILITY__AVAILABILITY, newAvailability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eDynamicGet(TrackerPackage.AVAILABILITY__COMMENT, TrackerPackage.Literals.AVAILABILITY__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eDynamicSet(TrackerPackage.AVAILABILITY__COMMENT, TrackerPackage.Literals.AVAILABILITY__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.AVAILABILITY__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case TrackerPackage.AVAILABILITY__AVAILABILITY:
				return getAvailability();
			case TrackerPackage.AVAILABILITY__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrackerPackage.AVAILABILITY__INCREMENT:
				setIncrement((Increment)newValue);
				return;
			case TrackerPackage.AVAILABILITY__AVAILABILITY:
				setAvailability((Integer)newValue);
				return;
			case TrackerPackage.AVAILABILITY__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrackerPackage.AVAILABILITY__INCREMENT:
				setIncrement((Increment)null);
				return;
			case TrackerPackage.AVAILABILITY__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case TrackerPackage.AVAILABILITY__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrackerPackage.AVAILABILITY__INCREMENT:
				return basicGetIncrement() != null;
			case TrackerPackage.AVAILABILITY__AVAILABILITY:
				return getAvailability() != AVAILABILITY_EDEFAULT;
			case TrackerPackage.AVAILABILITY__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
		}
		return super.eIsSet(featureID);
	}

} //AvailabilityImpl
