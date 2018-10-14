/**
 */
package org.nasdanika.tracker;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Progress Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Progress reports are submitted by developers working on issues and are aggregated for issues/versions/projects. Used in building burndown charts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.ProgressReport#getPeriodStart <em>Period Start</em>}</li>
 *   <li>{@link org.nasdanika.tracker.ProgressReport#getPeriodEnd <em>Period End</em>}</li>
 *   <li>{@link org.nasdanika.tracker.ProgressReport#getTimeSpent <em>Time Spent</em>}</li>
 *   <li>{@link org.nasdanika.tracker.ProgressReport#getRemainingEffort <em>Remaining Effort</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getProgressReport()
 * @model
 * @generated
 */
public interface ProgressReport extends Note {
	/**
	 * Returns the value of the '<em><b>Period Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period Start</em>' attribute.
	 * @see #setPeriodStart(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getProgressReport_PeriodStart()
	 * @model
	 * @generated
	 */
	Date getPeriodStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.ProgressReport#getPeriodStart <em>Period Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Start</em>' attribute.
	 * @see #getPeriodStart()
	 * @generated
	 */
	void setPeriodStart(Date value);

	/**
	 * Returns the value of the '<em><b>Period End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period End</em>' attribute.
	 * @see #setPeriodEnd(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getProgressReport_PeriodEnd()
	 * @model
	 * @generated
	 */
	Date getPeriodEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.ProgressReport#getPeriodEnd <em>Period End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period End</em>' attribute.
	 * @see #getPeriodEnd()
	 * @generated
	 */
	void setPeriodEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Spent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Spent</em>' attribute.
	 * @see #setTimeSpent(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getProgressReport_TimeSpent()
	 * @model
	 * @generated
	 */
	String getTimeSpent();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.ProgressReport#getTimeSpent <em>Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Spent</em>' attribute.
	 * @see #getTimeSpent()
	 * @generated
	 */
	void setTimeSpent(String value);

	/**
	 * Returns the value of the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Remaining effort estimation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Effort</em>' attribute.
	 * @see #setRemainingEffort(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getProgressReport_RemainingEffort()
	 * @model
	 * @generated
	 */
	String getRemainingEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.ProgressReport#getRemainingEffort <em>Remaining Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Effort</em>' attribute.
	 * @see #getRemainingEffort()
	 * @generated
	 */
	void setRemainingEffort(String value);

} // ProgressReport
