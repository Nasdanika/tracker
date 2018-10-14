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
		return (Date)eGet(TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodStart(Date newPeriodStart) {
		eSet(TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_START, newPeriodStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPeriodEnd() {
		return (Date)eGet(TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodEnd(Date newPeriodEnd) {
		eSet(TrackerPackage.Literals.PROGRESS_REPORT__PERIOD_END, newPeriodEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeSpent() {
		return (String)eGet(TrackerPackage.Literals.PROGRESS_REPORT__TIME_SPENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSpent(String newTimeSpent) {
		eSet(TrackerPackage.Literals.PROGRESS_REPORT__TIME_SPENT, newTimeSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemainingEffort() {
		return (String)eGet(TrackerPackage.Literals.PROGRESS_REPORT__REMAINING_EFFORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemainingEffort(String newRemainingEffort) {
		eSet(TrackerPackage.Literals.PROGRESS_REPORT__REMAINING_EFFORT, newRemainingEffort);
	}

} //ProgressReportImpl
