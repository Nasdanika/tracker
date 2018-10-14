/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Maven artifact, a.k.a. Component. Artifacts can be of different types such as services, libraries, tools (Eclipse plug-ins), documentation, organization info sites. 
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.tracker.Artifact#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getIncrements <em>Increments</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.Artifact#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.tracker.TrackerPackage#getArtifact()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Artifact extends CDOObject {
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Artifact name, e.g. Nasdanika Tracker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * Returns the value of the '<em><b>Modules</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Projects can be nested. E.g. Developer Experience Journey project may contain Developer Education project which can in turn contain "CIS Eclipse Help" artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modules</em>' reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Modules()
	 * @model
	 * @generated
	 */
	EList<Artifact> getModules();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Projects have zero or more Issues associated with them - something which has to be taken care of in order to deliver the project/version.
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
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL of organization's home page - absolute or relative to the base URL. 
	 * 
	 * E.g. for the Cloud & Integration Services organization:
	 * 
	 * * Absolute - http://nexus.consumer.nam.nsroot.net/sites/com.citi.169073.ccp.rel/ccp-site/current/
	 * * Relative - ccp-site/current/
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' reference.
	 * @see #setCategories(Category)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Categories()
	 * @model
	 * @generated
	 */
	Category getCategories();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getCategories <em>Categories</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Categories</em>' reference.
	 * @see #getCategories()
	 * @generated
	 */
	void setCategories(Category value);

	/**
	 * Returns the value of the '<em><b>Increments</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.tracker.Increment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increments</em>' containment reference list.
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Increments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Increment> getIncrements();

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
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description in markdown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.tracker.TrackerPackage#getArtifact_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.tracker.Artifact#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Artifact
