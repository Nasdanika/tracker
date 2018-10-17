/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Knowledge;
import org.nasdanika.tracker.Skill;
import org.nasdanika.tracker.SkillLevel;
import org.nasdanika.tracker.TrackerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.SkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.SkillImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.SkillImpl#getKnowledge <em>Knowledge</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkillImpl extends CDOObjectImpl implements Skill {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final SkillLevel LEVEL_EDEFAULT = SkillLevel.NOVICE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.SKILL;
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
	public SkillLevel getLevel() {
		return (SkillLevel)eDynamicGet(TrackerPackage.SKILL__LEVEL, TrackerPackage.Literals.SKILL__LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(SkillLevel newLevel) {
		eDynamicSet(TrackerPackage.SKILL__LEVEL, TrackerPackage.Literals.SKILL__LEVEL, newLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.SKILL__DESCRIPTION, TrackerPackage.Literals.SKILL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.SKILL__DESCRIPTION, TrackerPackage.Literals.SKILL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge getKnowledge() {
		return (Knowledge)eDynamicGet(TrackerPackage.SKILL__KNOWLEDGE, TrackerPackage.Literals.SKILL__KNOWLEDGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Knowledge basicGetKnowledge() {
		return (Knowledge)eDynamicGet(TrackerPackage.SKILL__KNOWLEDGE, TrackerPackage.Literals.SKILL__KNOWLEDGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledge(Knowledge newKnowledge, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newKnowledge, TrackerPackage.SKILL__KNOWLEDGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKnowledge(Knowledge newKnowledge) {
		eDynamicSet(TrackerPackage.SKILL__KNOWLEDGE, TrackerPackage.Literals.SKILL__KNOWLEDGE, newKnowledge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.SKILL__KNOWLEDGE:
				Knowledge knowledge = basicGetKnowledge();
				if (knowledge != null)
					msgs = ((InternalEObject)knowledge).eInverseRemove(this, TrackerPackage.KNOWLEDGE__EXPERTS, Knowledge.class, msgs);
				return basicSetKnowledge((Knowledge)otherEnd, msgs);
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
			case TrackerPackage.SKILL__KNOWLEDGE:
				return basicSetKnowledge(null, msgs);
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
			case TrackerPackage.SKILL__LEVEL:
				return getLevel();
			case TrackerPackage.SKILL__DESCRIPTION:
				return getDescription();
			case TrackerPackage.SKILL__KNOWLEDGE:
				if (resolve) return getKnowledge();
				return basicGetKnowledge();
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
			case TrackerPackage.SKILL__LEVEL:
				setLevel((SkillLevel)newValue);
				return;
			case TrackerPackage.SKILL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.SKILL__KNOWLEDGE:
				setKnowledge((Knowledge)newValue);
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
			case TrackerPackage.SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case TrackerPackage.SKILL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.SKILL__KNOWLEDGE:
				setKnowledge((Knowledge)null);
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
			case TrackerPackage.SKILL__LEVEL:
				return getLevel() != LEVEL_EDEFAULT;
			case TrackerPackage.SKILL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.SKILL__KNOWLEDGE:
				return basicGetKnowledge() != null;
		}
		return super.eIsSet(featureID);
	}

} //SkillImpl
