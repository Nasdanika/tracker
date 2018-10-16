/**
 */
package org.nasdanika.tracker.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Note;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.NoteImpl#getDeveloper <em>Developer</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.NoteImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.NoteImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.NoteImpl#isPrivate <em>Private</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends CDOObjectImpl implements Note {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.NOTE;
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
	public Developer getDeveloper() {
		return (Developer)eDynamicGet(TrackerPackage.NOTE__DEVELOPER, TrackerPackage.Literals.NOTE__DEVELOPER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer basicGetDeveloper() {
		return (Developer)eDynamicGet(TrackerPackage.NOTE__DEVELOPER, TrackerPackage.Literals.NOTE__DEVELOPER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeveloper(Developer newDeveloper) {
		eDynamicSet(TrackerPackage.NOTE__DEVELOPER, TrackerPackage.Literals.NOTE__DEVELOPER, newDeveloper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eDynamicGet(TrackerPackage.NOTE__COMMENT, TrackerPackage.Literals.NOTE__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eDynamicSet(TrackerPackage.NOTE__COMMENT, TrackerPackage.Literals.NOTE__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eDynamicGet(TrackerPackage.NOTE__DATE, TrackerPackage.Literals.NOTE__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eDynamicSet(TrackerPackage.NOTE__DATE, TrackerPackage.Literals.NOTE__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return (Boolean)eDynamicGet(TrackerPackage.NOTE__PRIVATE, TrackerPackage.Literals.NOTE__PRIVATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		eDynamicSet(TrackerPackage.NOTE__PRIVATE, TrackerPackage.Literals.NOTE__PRIVATE, newPrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.NOTE__DEVELOPER:
				if (resolve) return getDeveloper();
				return basicGetDeveloper();
			case TrackerPackage.NOTE__COMMENT:
				return getComment();
			case TrackerPackage.NOTE__DATE:
				return getDate();
			case TrackerPackage.NOTE__PRIVATE:
				return isPrivate();
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
			case TrackerPackage.NOTE__DEVELOPER:
				setDeveloper((Developer)newValue);
				return;
			case TrackerPackage.NOTE__COMMENT:
				setComment((String)newValue);
				return;
			case TrackerPackage.NOTE__DATE:
				setDate((Date)newValue);
				return;
			case TrackerPackage.NOTE__PRIVATE:
				setPrivate((Boolean)newValue);
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
			case TrackerPackage.NOTE__DEVELOPER:
				setDeveloper((Developer)null);
				return;
			case TrackerPackage.NOTE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TrackerPackage.NOTE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TrackerPackage.NOTE__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
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
			case TrackerPackage.NOTE__DEVELOPER:
				return basicGetDeveloper() != null;
			case TrackerPackage.NOTE__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case TrackerPackage.NOTE__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case TrackerPackage.NOTE__PRIVATE:
				return isPrivate() != PRIVATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //NoteImpl
