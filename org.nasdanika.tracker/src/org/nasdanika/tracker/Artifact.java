/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Maven artifact, a.k.a. Component. Artifacts can be of different types such as services, libraries, tools (Eclipse plug-ins), documentation, organization info sites. 
 * There are two special cases of artifacts:
 * 
 * - Organizations - artifacts with users as members who work as developers on organization's artifacts. For an organization a deliverable is an organization's site which provides information about the organization, its developers and its artifacts.
 * - Projects - artifacts without binary deliverables. Projects typically would have a site containing project documentation. There is no special "Project" class in the model.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Artifact#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssueRelationshipTypes <em>Issue Relationship Types</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssueStatuses <em>Issue Statuses</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssueResolutions <em>Issue Resolutions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssuePriorities <em>Issue Priorities</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends Knowledge {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact ID, shall be unique within the group ID. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maven group ID, e.g. ``org.nasdanika.tracker``. If there is no dot in the group ID it is appended to the container's or group's group ID. If it is blank, it is inherited from group/container group ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group ID</em>' attribute.
	 * @see #setGroupID(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_GroupID()
	 * @model
	 * @generated
	 */
	String getGroupID();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getGroupID <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group ID</em>' attribute.
	 * @see #getGroupID()
	 * @generated
	 */
	void setGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Developers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Developer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact is worked on by developers playing different roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Developers</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Developers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Developer> getDevelopers();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts can be nested. A typical case is artirfacts owned by an organization, which is a special type of an artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Artifact> getModules();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts have zero or more Issues associated with them - something which has to be taken care of in order to deliver a new version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

	/**
	 * Returns the value of the '<em><b>Versions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Version}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifacts have multiple versions which can be used by different other artifact's versions.
	 * For projects versions are means for grouping of issues, a.k.a. phases/milestones.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Versions</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Versions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Version> getVersions();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue categories.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference.
	 * @see #setCategories(Category)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Categories()
	 * @model containment="true"
	 * @generated
	 */
	Category getCategories();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getCategories <em>Categories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' containment reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Category value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Private model elements are visible only by the members of containing organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Issue Relationship Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Relationship Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Relationship Types</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_IssueRelationshipTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueRelationshipType> getIssueRelationshipTypes();

	/**
	 * Returns the value of the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Statuses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Statuses</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_IssueStatuses()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueStatus> getIssueStatuses();

	/**
	 * Returns the value of the '<em><b>Issue Resolutions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssueResolution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Resolutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Resolutions</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_IssueResolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssueResolution> getIssueResolutions();

	/**
	 * Returns the value of the '<em><b>Issue Priorities</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.IssuePriority}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Priorities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Priorities</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_IssuePriorities()
	 * @model containment="true"
	 * @generated
	 */
	EList<IssuePriority> getIssuePriorities();

} // Artifact
