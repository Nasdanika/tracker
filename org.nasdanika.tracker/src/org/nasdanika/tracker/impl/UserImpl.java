/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.cdo.security.impl.LoginUserImpl;

import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getPasswordHash <em>Password Hash</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getAvatar <em>Avatar</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.UserImpl#getMembership <em>Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends LoginUserImpl<LoginPasswordCredentials> implements User {
	/**
	 * The default value of the '{@link #getPasswordHash() <em>Password Hash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordHash()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] PASSWORD_HASH_EDEFAULT = null;
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
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAvatar() <em>Avatar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTimezone() <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimezone()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEZONE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getPasswordHash() {
		return (byte[])eDynamicGet(TrackerPackage.USER__PASSWORD_HASH, SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHash(byte[] newPasswordHash) {
		eDynamicSet(TrackerPackage.USER__PASSWORD_HASH, SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, newPasswordHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.USER__NAME, TrackerPackage.Literals.USER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.USER__NAME, TrackerPackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMail() {
		return (String)eDynamicGet(TrackerPackage.USER__EMAIL, TrackerPackage.Literals.USER__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMail(String newEMail) {
		eDynamicSet(TrackerPackage.USER__EMAIL, TrackerPackage.Literals.USER__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eDynamicGet(TrackerPackage.USER__COMMENT, TrackerPackage.Literals.USER__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eDynamicSet(TrackerPackage.USER__COMMENT, TrackerPackage.Literals.USER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eDynamicGet(TrackerPackage.USER__URL, TrackerPackage.Literals.USER__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eDynamicSet(TrackerPackage.USER__URL, TrackerPackage.Literals.USER__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvatar() {
		return (String)eDynamicGet(TrackerPackage.USER__AVATAR, TrackerPackage.Literals.USER__AVATAR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvatar(String newAvatar) {
		eDynamicSet(TrackerPackage.USER__AVATAR, TrackerPackage.Literals.USER__AVATAR, newAvatar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimezone() {
		return (String)eDynamicGet(TrackerPackage.USER__TIMEZONE, TrackerPackage.Literals.USER__TIMEZONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(String newTimezone) {
		eDynamicSet(TrackerPackage.USER__TIMEZONE, TrackerPackage.Literals.USER__TIMEZONE, newTimezone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OrganizationMember> getMembership() {
		return (EList<OrganizationMember>)eDynamicGet(TrackerPackage.USER__MEMBERSHIP, TrackerPackage.Literals.USER__MEMBERSHIP, true, true);
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
			case TrackerPackage.USER__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
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
			case TrackerPackage.USER__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.USER__PASSWORD_HASH:
				return getPasswordHash();
			case TrackerPackage.USER__NAME:
				return getName();
			case TrackerPackage.USER__EMAIL:
				return getEMail();
			case TrackerPackage.USER__COMMENT:
				return getComment();
			case TrackerPackage.USER__URL:
				return getUrl();
			case TrackerPackage.USER__AVATAR:
				return getAvatar();
			case TrackerPackage.USER__TIMEZONE:
				return getTimezone();
			case TrackerPackage.USER__MEMBERSHIP:
				return getMembership();
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
			case TrackerPackage.USER__PASSWORD_HASH:
				setPasswordHash((byte[])newValue);
				return;
			case TrackerPackage.USER__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.USER__EMAIL:
				setEMail((String)newValue);
				return;
			case TrackerPackage.USER__COMMENT:
				setComment((String)newValue);
				return;
			case TrackerPackage.USER__URL:
				setUrl((String)newValue);
				return;
			case TrackerPackage.USER__AVATAR:
				setAvatar((String)newValue);
				return;
			case TrackerPackage.USER__TIMEZONE:
				setTimezone((String)newValue);
				return;
			case TrackerPackage.USER__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends OrganizationMember>)newValue);
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
			case TrackerPackage.USER__PASSWORD_HASH:
				setPasswordHash(PASSWORD_HASH_EDEFAULT);
				return;
			case TrackerPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.USER__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case TrackerPackage.USER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case TrackerPackage.USER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case TrackerPackage.USER__AVATAR:
				setAvatar(AVATAR_EDEFAULT);
				return;
			case TrackerPackage.USER__TIMEZONE:
				setTimezone(TIMEZONE_EDEFAULT);
				return;
			case TrackerPackage.USER__MEMBERSHIP:
				getMembership().clear();
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
			case TrackerPackage.USER__PASSWORD_HASH:
				return PASSWORD_HASH_EDEFAULT == null ? getPasswordHash() != null : !PASSWORD_HASH_EDEFAULT.equals(getPasswordHash());
			case TrackerPackage.USER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? getEMail() != null : !EMAIL_EDEFAULT.equals(getEMail());
			case TrackerPackage.USER__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case TrackerPackage.USER__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case TrackerPackage.USER__AVATAR:
				return AVATAR_EDEFAULT == null ? getAvatar() != null : !AVATAR_EDEFAULT.equals(getAvatar());
			case TrackerPackage.USER__TIMEZONE:
				return TIMEZONE_EDEFAULT == null ? getTimezone() != null : !TIMEZONE_EDEFAULT.equals(getTimezone());
			case TrackerPackage.USER__MEMBERSHIP:
				return !getMembership().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
