/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Artifact;
import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.Role;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends CDOObjectImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ARTIFACT;
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
	public String getId() {
		return (String)eGet(TrackerPackage.Literals.ARTIFACT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(TrackerPackage.Literals.ARTIFACT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(TrackerPackage.Literals.ARTIFACT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(TrackerPackage.Literals.ARTIFACT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Developer> getDevelopers() {
		return (EList<Developer>)eGet(TrackerPackage.Literals.ARTIFACT__DEVELOPERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getModules() {
		return (EList<Artifact>)eGet(TrackerPackage.Literals.ARTIFACT__MODULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Issue> getIssues() {
		return (EList<Issue>)eGet(TrackerPackage.Literals.ARTIFACT__ISSUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Version> getVersions() {
		return (EList<Version>)eGet(TrackerPackage.Literals.ARTIFACT__VERSIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return (String)eGet(TrackerPackage.Literals.ARTIFACT__URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		eSet(TrackerPackage.Literals.ARTIFACT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategories() {
		return (Category)eGet(TrackerPackage.Literals.ARTIFACT__CATEGORIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(Category newCategories) {
		eSet(TrackerPackage.Literals.ARTIFACT__CATEGORIES, newCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Increment> getIncrements() {
		return (EList<Increment>)eGet(TrackerPackage.Literals.ARTIFACT__INCREMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eGet(TrackerPackage.Literals.ARTIFACT__ROLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(TrackerPackage.Literals.ARTIFACT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(TrackerPackage.Literals.ARTIFACT__DESCRIPTION, newDescription);
	}

} //ArtifactImpl
