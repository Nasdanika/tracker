/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Issue is something that needs to be acted upon - tracked, discussed, and elaborated to:
 * 
 * * Maybe become a work item, several work items or a part of a work item. 
 * * Yield some other result – e.g. a presentation or a whitepaper.
 * 
 * Example - an external event (e.g. PCF 1.2 upgrade or SVN -> GIT migration) may be tracked as an issue and a “block” dependency for other issues – such an issue never becomes a work item, but “unblocks” other issues (actual roadmap items) once the event occurs. 
 * 
 * A real issue entity would have many attributes and relationships, e.g. severity, priority, notes, category, type. This model contains only the most significant elements of the issue entity/class.
 * 
 * Issues may be of multiple types. E.g. an issue may be a research item, a feature request, a bug.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Issue#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getArtifactVersion <em>Artifact Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getFixedInVersion <em>Fixed In Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getSubscribers <em>Subscribers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getIssue()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Issue extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reporter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporter</em>' reference.
	 * @see #setReporter(User)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Reporter()
	 * @model required="true"
	 * @generated
	 */
	User getReporter();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getReporter <em>Reporter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporter</em>' reference.
	 * @see #getReporter()
	 * @generated
	 */
	void setReporter(User value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact verion where issue was discovered (for bugs).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Artifact Version</em>' reference.
	 * @see #setArtifactVersion(Version)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_ArtifactVersion()
	 * @model
	 * @generated
	 */
	Version getArtifactVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getArtifactVersion <em>Artifact Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Version</em>' reference.
	 * @see #getArtifactVersion()
	 * @generated
	 */
	void setArtifactVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Target Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Version</em>' reference.
	 * @see #setTargetVersion(Version)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_TargetVersion()
	 * @model
	 * @generated
	 */
	Version getTargetVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getTargetVersion <em>Target Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Version</em>' reference.
	 * @see #getTargetVersion()
	 * @generated
	 */
	void setTargetVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Fixed In Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact version where issue was implemented, e.g. but fixed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed In Version</em>' reference.
	 * @see #setFixedInVersion(Version)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_FixedInVersion()
	 * @model
	 * @generated
	 */
	Version getFixedInVersion();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getFixedInVersion <em>Fixed In Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed In Version</em>' reference.
	 * @see #getFixedInVersion()
	 * @generated
	 */
	void setFixedInVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships with other issues. Relationships can be cross-deliverable. E.g. a quality improvement project spanning many components may 
	 * contain issues related to issues in those components. For example, "Publish unit test coverage reports on component sites" issue in a quality improvement project
	 * may have a child issue "Publish unit test coverage report" in, say, "JMS Sink" component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueRelationship> getRelationships();

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer assigned to work on the issue/own it. 
	 * The developer may work on the issue with other developers and people outside of the team, but they are a go-to person for any questions about the issue.
	 * For small components this relationship might be implicit - the primary owner of the component also owns component issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference.
	 * @see #setAssignedTo(Developer)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_AssignedTo()
	 * @model
	 * @generated
	 */
	Developer getAssignedTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getAssignedTo <em>Assigned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To</em>' reference.
	 * @see #getAssignedTo()
	 * @generated
	 */
	void setAssignedTo(Developer value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Note}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Note> getNotes();

	/**
	 * Returns the value of the '<em><b>Subscribers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Users monitoring the issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Subscribers()
	 * @model
	 * @generated
	 */
	EList<User> getSubscribers();

} // Issue
