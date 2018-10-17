/**
 */
package org.nasdanika.tracker;

import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Issue is something that needs to be acted upon to modify the state of the artifact. It is a "command" which may or may not be "executed".
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Issue#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getReporter <em>Reporter</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getArtifactVersion <em>Artifact Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getFixedInVersion <em>Fixed In Version</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getOutboundRelationships <em>Outbound Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getInboundRelationships <em>Inbound Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getSubmitted <em>Submitted</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getEstimatedEffort <em>Estimated Effort</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Issue#getRequirements <em>Requirements</em>}</li>
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
	 * Version in which this issue is planned to be resolved/closed.
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
	 * Artifact version where issue was resolved/closed, e.g. but fixed.
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
	 * Returns the value of the '<em><b>Outbound Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships with other issues. Relationships can be cross-deliverable. E.g. a quality improvement project spanning many components may 
	 * contain issues related to issues in those components. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound Relationships</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_OutboundRelationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueRelationship> getOutboundRelationships();

	/**
	 * Returns the value of the '<em><b>Inbound Relationships</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueRelationship}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.tracker.IssueRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships with other issues. Relationships can be cross-deliverable. E.g. a quality improvement project spanning many components may 
	 * contain issues related to issues in those components. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Relationships</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_InboundRelationships()
	 * @see org.nasdanika.tracker.IssueRelationship#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<IssueRelationship> getInboundRelationships();

	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Developer assigned to work on the issue/own it. 
	 * The developer may work on the issue with other developers and people outside of the team, but they are a go-to person for any questions about the issue.
	 * For small components this relationship might be implicit - the owner of the component also owns component issues.
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
	 * Users monitoring the issue and getting notified of changes in the issue.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscribers</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Subscribers()
	 * @model
	 * @generated
	 */
	EList<User> getSubscribers();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issues can be nested. Issue containment is equivalent to parent/child issue relationship.
	 * Either or both can be used depending on a situation. 
	 * 
	 * Explicit issue nesting is conceptually similar to a project plan where a larger parent issue is resolved
	 * by resolving child issues.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getChildren();

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Private model elements are visible only by the members of containing organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(IssueStatus)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Status()
	 * @model
	 * @generated
	 */
	IssueStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(IssueStatus value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' reference.
	 * @see #setResolution(IssueResolution)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Resolution()
	 * @model
	 * @generated
	 */
	IssueResolution getResolution();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getResolution <em>Resolution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(IssueResolution value);

	/**
	 * Returns the value of the '<em><b>Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submitted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submitted</em>' attribute.
	 * @see #setSubmitted(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Submitted()
	 * @model
	 * @generated
	 */
	Date getSubmitted();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getSubmitted <em>Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted</em>' attribute.
	 * @see #getSubmitted()
	 * @generated
	 */
	void setSubmitted(Date value);

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Update</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(Date)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_LastUpdate()
	 * @model
	 * @generated
	 */
	Date getLastUpdate();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Estimated effort in hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Estimated Effort</em>' attribute.
	 * @see #setEstimatedEffort(Double)
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_EstimatedEffort()
	 * @model
	 * @generated
	 */
	Double getEstimatedEffort();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Issue#getEstimatedEffort <em>Estimated Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Effort</em>' attribute.
	 * @see #getEstimatedEffort()
	 * @generated
	 */
	void setEstimatedEffort(Double value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getIssue_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

} // Issue
