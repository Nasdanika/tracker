/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.IssueRelationship;
import org.nasdanika.tracker.Note;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.User;
import org.nasdanika.tracker.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getArtifactVersion <em>Artifact Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getFixedInVersion <em>Fixed In Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends CDOObjectImpl implements Issue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrackerPackage.Literals.ISSUE;
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
	public User getReporter() {
		return (User)eGet(TrackerPackage.Literals.ISSUE__REPORTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(User newReporter) {
		eSet(TrackerPackage.Literals.ISSUE__REPORTER, newReporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return (Category)eGet(TrackerPackage.Literals.ISSUE__CATEGORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		eSet(TrackerPackage.Literals.ISSUE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return (String)eGet(TrackerPackage.Literals.ISSUE__SUMMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		eSet(TrackerPackage.Literals.ISSUE__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(TrackerPackage.Literals.ISSUE__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(TrackerPackage.Literals.ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getArtifactVersion() {
		return (Version)eGet(TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactVersion(Version newArtifactVersion) {
		eSet(TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION, newArtifactVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getTargetVersion() {
		return (Version)eGet(TrackerPackage.Literals.ISSUE__TARGET_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(Version newTargetVersion) {
		eSet(TrackerPackage.Literals.ISSUE__TARGET_VERSION, newTargetVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getFixedInVersion() {
		return (Version)eGet(TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedInVersion(Version newFixedInVersion) {
		eSet(TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION, newFixedInVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueRelationship> getRelationships() {
		return (EList<IssueRelationship>)eGet(TrackerPackage.Literals.ISSUE__RELATIONSHIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getAssignedTo() {
		return (Developer)eGet(TrackerPackage.Literals.ISSUE__ASSIGNED_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedTo(Developer newAssignedTo) {
		eSet(TrackerPackage.Literals.ISSUE__ASSIGNED_TO, newAssignedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Note> getNotes() {
		return (EList<Note>)eGet(TrackerPackage.Literals.ISSUE__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getSubscribers() {
		return (EList<User>)eGet(TrackerPackage.Literals.ISSUE__SUBSCRIBERS, true);
	}

} //IssueImpl
