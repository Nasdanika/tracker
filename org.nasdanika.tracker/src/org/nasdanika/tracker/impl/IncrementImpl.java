/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Increment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IncrementImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncrementImpl extends CDOObjectImpl implements Increment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncrementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.INCREMENT;
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
		return (String)eDynamicGet(TrackerPackage.INCREMENT__NAME, TrackerPackage.Literals.INCREMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.INCREMENT__NAME, TrackerPackage.Literals.INCREMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.INCREMENT__DESCRIPTION, TrackerPackage.Literals.INCREMENT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.INCREMENT__DESCRIPTION, TrackerPackage.Literals.INCREMENT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(TrackerPackage.INCREMENT__VERSIONS, TrackerPackage.Literals.INCREMENT__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Increment> getChildren() {
		return (EList<Increment>)eDynamicGet(TrackerPackage.INCREMENT__CHILDREN, TrackerPackage.Literals.INCREMENT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.INCREMENT__VERSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVersions()).basicAdd(otherEnd, msgs);
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
			case TrackerPackage.INCREMENT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case TrackerPackage.INCREMENT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.INCREMENT__NAME:
				return getName();
			case TrackerPackage.INCREMENT__DESCRIPTION:
				return getDescription();
			case TrackerPackage.INCREMENT__START:
				return getStart();
			case TrackerPackage.INCREMENT__END:
				return getEnd();
			case TrackerPackage.INCREMENT__VERSIONS:
				return getVersions();
			case TrackerPackage.INCREMENT__CHILDREN:
				return getChildren();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrackerPackage.INCREMENT__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.INCREMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.INCREMENT__START:
				setStart((Date)newValue);
				return;
			case TrackerPackage.INCREMENT__END:
				setEnd((Date)newValue);
				return;
			case TrackerPackage.INCREMENT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case TrackerPackage.INCREMENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Increment>)newValue);
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
			case TrackerPackage.INCREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.INCREMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.INCREMENT__START:
				setStart(START_EDEFAULT);
				return;
			case TrackerPackage.INCREMENT__END:
				setEnd(END_EDEFAULT);
				return;
			case TrackerPackage.INCREMENT__VERSIONS:
				getVersions().clear();
				return;
			case TrackerPackage.INCREMENT__CHILDREN:
				getChildren().clear();
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
			case TrackerPackage.INCREMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.INCREMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.INCREMENT__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case TrackerPackage.INCREMENT__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case TrackerPackage.INCREMENT__VERSIONS:
				return !getVersions().isEmpty();
			case TrackerPackage.INCREMENT__CHILDREN:
				return !getChildren().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eDynamicGet(TrackerPackage.INCREMENT__START, TrackerPackage.Literals.INCREMENT__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eDynamicSet(TrackerPackage.INCREMENT__START, TrackerPackage.Literals.INCREMENT__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eDynamicGet(TrackerPackage.INCREMENT__END, TrackerPackage.Literals.INCREMENT__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eDynamicSet(TrackerPackage.INCREMENT__END, TrackerPackage.Literals.INCREMENT__END, newEnd);
	}

} //IncrementImpl
