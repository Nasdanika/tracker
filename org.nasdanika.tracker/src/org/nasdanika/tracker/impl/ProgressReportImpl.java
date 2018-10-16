/**
 */
package org.nasdanika.tracker.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.tracker.ProgressReport;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.ProgressReportImpl#getPeriodStart <em>Period Start</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ProgressReportImpl#getPeriodEnd <em>Period End</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ProgressReportImpl#getTimeSpent <em>Time Spent</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ProgressReportImpl#getRemainingEffort <em>Remaining Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgressReportImpl extends NoteImpl implements ProgressReport {
	/**
	 * The default value of the '{@link #getPeriodStart() <em>Period Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date PERIOD_START_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPeriodEnd() <em>Period End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date PERIOD_END_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTimeSpent() <em>Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSpent()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIME_SPENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRemainingEffort() <em>Remaining Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingEffort()
	 * @generated
	 * @ordered
	 */
	protected static final Double REMAINING_EFFORT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.PROGRESS_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPeriodStart() {
		return (Date)eDynamicGet(TrackerPackage.PROGRESS_REPORT__PERIOD_START, TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodStart(Date newPeriodStart) {
		eDynamicSet(TrackerPackage.PROGRESS_REPORT__PERIOD_START, TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_START, newPeriodStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPeriodEnd() {
		return (Date)eDynamicGet(TrackerPackage.PROGRESS_REPORT__PERIOD_END, TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodEnd(Date newPeriodEnd) {
		eDynamicSet(TrackerPackage.PROGRESS_REPORT__PERIOD_END, TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_END, newPeriodEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTimeSpent() {
		return (Double)eDynamicGet(TrackerPackage.PROGRESS_REPORT__TIME_SPENT, TrackerPackage.Literals.PROGRESS_REPORT__TIME_SPENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpent(Double newTimeSpent) {
		eDynamicSet(TrackerPackage.PROGRESS_REPORT__TIME_SPENT, TrackerPackage.Literals.PROGRESS_REPORT__TIME_SPENT, newTimeSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRemainingEffort() {
		return (Double)eDynamicGet(TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT, TrackerPackage.Literals.PROGRESS_REPORT__REMAINING_EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingEffort(Double newRemainingEffort) {
		eDynamicSet(TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT, TrackerPackage.Literals.PROGRESS_REPORT__REMAINING_EFFORT, newRemainingEffort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.PROGRESS_REPORT__PERIOD_START:
				return getPeriodStart();
			case TrackerPackage.PROGRESS_REPORT__PERIOD_END:
				return getPeriodEnd();
			case TrackerPackage.PROGRESS_REPORT__TIME_SPENT:
				return getTimeSpent();
			case TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT:
				return getRemainingEffort();
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
			case TrackerPackage.PROGRESS_REPORT__PERIOD_START:
				setPeriodStart((Date)newValue);
				return;
			case TrackerPackage.PROGRESS_REPORT__PERIOD_END:
				setPeriodEnd((Date)newValue);
				return;
			case TrackerPackage.PROGRESS_REPORT__TIME_SPENT:
				setTimeSpent((Double)newValue);
				return;
			case TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT:
				setRemainingEffort((Double)newValue);
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
			case TrackerPackage.PROGRESS_REPORT__PERIOD_START:
				setPeriodStart(PERIOD_START_EDEFAULT);
				return;
			case TrackerPackage.PROGRESS_REPORT__PERIOD_END:
				setPeriodEnd(PERIOD_END_EDEFAULT);
				return;
			case TrackerPackage.PROGRESS_REPORT__TIME_SPENT:
				setTimeSpent(TIME_SPENT_EDEFAULT);
				return;
			case TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT:
				setRemainingEffort(REMAINING_EFFORT_EDEFAULT);
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
			case TrackerPackage.PROGRESS_REPORT__PERIOD_START:
				return PERIOD_START_EDEFAULT == null ? getPeriodStart() != null : !PERIOD_START_EDEFAULT.equals(getPeriodStart());
			case TrackerPackage.PROGRESS_REPORT__PERIOD_END:
				return PERIOD_END_EDEFAULT == null ? getPeriodEnd() != null : !PERIOD_END_EDEFAULT.equals(getPeriodEnd());
			case TrackerPackage.PROGRESS_REPORT__TIME_SPENT:
				return TIME_SPENT_EDEFAULT == null ? getTimeSpent() != null : !TIME_SPENT_EDEFAULT.equals(getTimeSpent());
			case TrackerPackage.PROGRESS_REPORT__REMAINING_EFFORT:
				return REMAINING_EFFORT_EDEFAULT == null ? getRemainingEffort() != null : !REMAINING_EFFORT_EDEFAULT.equals(getRemainingEffort());
		}
		return super.eIsSet(featureID);
	}

} //ProgressReportImpl
