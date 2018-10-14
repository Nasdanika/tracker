/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.cdo.security.LoginPasswordCredentials;
import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.cdo.security.impl.LoginUserImpl;

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
 * </ul>
 *
 * @generated
 */
public class UserImpl extends LoginUserImpl<LoginPasswordCredentials> implements User {
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
		return (byte[])eGet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordHash(byte[] newPasswordHash) {
		eSet(SecurityPackage.Literals.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH, newPasswordHash);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TrackerPackage.Literals.USER__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TrackerPackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEMail() {
		return (String)eGet(TrackerPackage.Literals.USER__EMAIL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMail(String newEMail) {
		eSet(TrackerPackage.Literals.USER__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return (String)eGet(TrackerPackage.Literals.USER__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		eSet(TrackerPackage.Literals.USER__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eGet(TrackerPackage.Literals.USER__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(TrackerPackage.Literals.USER__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvatar() {
		return (String)eGet(TrackerPackage.Literals.USER__AVATAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvatar(String newAvatar) {
		eSet(TrackerPackage.Literals.USER__AVATAR, newAvatar);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimezone() {
		return (String)eGet(TrackerPackage.Literals.USER__TIMEZONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimezone(String newTimezone) {
		eSet(TrackerPackage.Literals.USER__TIMEZONE, newTimezone);
	}

} //UserImpl
