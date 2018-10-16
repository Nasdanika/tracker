/**
 */
package org.nasdanika.tracker.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.VersionImpl#isReleased <em>Released</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VersionImpl extends CDOObjectImpl implements Version {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
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
	 * The default value of the '{@link #isReleased() <em>Released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReleased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELEASED_EDEFAULT = false;

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
		return (String)eDynamicGet(TrackerPackage.VERSION__NUMBER, TrackerPackage.Literals.VERSION__NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		eDynamicSet(TrackerPackage.VERSION__NUMBER, TrackerPackage.Literals.VERSION__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.VERSION__DESCRIPTION, TrackerPackage.Literals.VERSION__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.VERSION__DESCRIPTION, TrackerPackage.Literals.VERSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return (Date)eDynamicGet(TrackerPackage.VERSION__DATE, TrackerPackage.Literals.VERSION__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		eDynamicSet(TrackerPackage.VERSION__DATE, TrackerPackage.Literals.VERSION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment getIncrement() {
		return (Increment)eDynamicGet(TrackerPackage.VERSION__INCREMENT, TrackerPackage.Literals.VERSION__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment basicGetIncrement() {
		return (Increment)eDynamicGet(TrackerPackage.VERSION__INCREMENT, TrackerPackage.Literals.VERSION__INCREMENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrement(Increment newIncrement, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newIncrement, TrackerPackage.VERSION__INCREMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(Increment newIncrement) {
		eDynamicSet(TrackerPackage.VERSION__INCREMENT, TrackerPackage.Literals.VERSION__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReleased() {
		return (Boolean)eDynamicGet(TrackerPackage.VERSION__RELEASED, TrackerPackage.Literals.VERSION__RELEASED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleased(boolean newReleased) {
		eDynamicSet(TrackerPackage.VERSION__RELEASED, TrackerPackage.Literals.VERSION__RELEASED, newReleased);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.VERSION__INCREMENT:
				Increment increment = basicGetIncrement();
				if (increment != null)
					msgs = ((InternalEObject)increment).eInverseRemove(this, TrackerPackage.INCREMENT__VERSIONS, Increment.class, msgs);
				return basicSetIncrement((Increment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.VERSION__INCREMENT:
				return basicSetIncrement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrackerPackage.VERSION__NUMBER:
				return getNumber();
			case TrackerPackage.VERSION__DESCRIPTION:
				return getDescription();
			case TrackerPackage.VERSION__DATE:
				return getDate();
			case TrackerPackage.VERSION__INCREMENT:
				if (resolve) return getIncrement();
				return basicGetIncrement();
			case TrackerPackage.VERSION__RELEASED:
				return isReleased();
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
			case TrackerPackage.VERSION__NUMBER:
				setNumber((String)newValue);
				return;
			case TrackerPackage.VERSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.VERSION__DATE:
				setDate((Date)newValue);
				return;
			case TrackerPackage.VERSION__INCREMENT:
				setIncrement((Increment)newValue);
				return;
			case TrackerPackage.VERSION__RELEASED:
				setReleased((Boolean)newValue);
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
			case TrackerPackage.VERSION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TrackerPackage.VERSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.VERSION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TrackerPackage.VERSION__INCREMENT:
				setIncrement((Increment)null);
				return;
			case TrackerPackage.VERSION__RELEASED:
				setReleased(RELEASED_EDEFAULT);
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
			case TrackerPackage.VERSION__NUMBER:
				return NUMBER_EDEFAULT == null ? getNumber() != null : !NUMBER_EDEFAULT.equals(getNumber());
			case TrackerPackage.VERSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.VERSION__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case TrackerPackage.VERSION__INCREMENT:
				return basicGetIncrement() != null;
			case TrackerPackage.VERSION__RELEASED:
				return isReleased() != RELEASED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //VersionImpl
