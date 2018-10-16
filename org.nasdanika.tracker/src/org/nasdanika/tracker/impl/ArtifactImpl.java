/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Artifact;
import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Group;
import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.IssuePriority;
import org.nasdanika.tracker.IssueRelationshipType;
import org.nasdanika.tracker.IssueResolution;
import org.nasdanika.tracker.IssueStatus;
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
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getVersions <em>Versions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssueRelationshipTypes <em>Issue Relationship Types</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssueStatuses <em>Issue Statuses</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssueResolutions <em>Issue Resolutions</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.ArtifactImpl#getIssuePriorities <em>Issue Priorities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends CDOObjectImpl implements Artifact {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getGroupID() <em>Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

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
		return (String)eDynamicGet(TrackerPackage.ARTIFACT__ID, TrackerPackage.Literals.ARTIFACT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eDynamicSet(TrackerPackage.ARTIFACT__ID, TrackerPackage.Literals.ARTIFACT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return (Group)eDynamicGet(TrackerPackage.ARTIFACT__GROUP, TrackerPackage.Literals.ARTIFACT__GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return (Group)eDynamicGet(TrackerPackage.ARTIFACT__GROUP, TrackerPackage.Literals.ARTIFACT__GROUP, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		eDynamicSet(TrackerPackage.ARTIFACT__GROUP, TrackerPackage.Literals.ARTIFACT__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupID() {
		return (String)eDynamicGet(TrackerPackage.ARTIFACT__GROUP_ID, TrackerPackage.Literals.ARTIFACT__GROUP_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupID(String newGroupID) {
		eDynamicSet(TrackerPackage.ARTIFACT__GROUP_ID, TrackerPackage.Literals.ARTIFACT__GROUP_ID, newGroupID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eDynamicGet(TrackerPackage.ARTIFACT__NAME, TrackerPackage.Literals.ARTIFACT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eDynamicSet(TrackerPackage.ARTIFACT__NAME, TrackerPackage.Literals.ARTIFACT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Developer> getDevelopers() {
		return (EList<Developer>)eDynamicGet(TrackerPackage.ARTIFACT__DEVELOPERS, TrackerPackage.Literals.ARTIFACT__DEVELOPERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Artifact> getModules() {
		return (EList<Artifact>)eDynamicGet(TrackerPackage.ARTIFACT__MODULES, TrackerPackage.Literals.ARTIFACT__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Issue> getIssues() {
		return (EList<Issue>)eDynamicGet(TrackerPackage.ARTIFACT__ISSUES, TrackerPackage.Literals.ARTIFACT__ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Version> getVersions() {
		return (EList<Version>)eDynamicGet(TrackerPackage.ARTIFACT__VERSIONS, TrackerPackage.Literals.ARTIFACT__VERSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategories() {
		return (Category)eDynamicGet(TrackerPackage.ARTIFACT__CATEGORIES, TrackerPackage.Literals.ARTIFACT__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategories() {
		return (Category)eDynamicGet(TrackerPackage.ARTIFACT__CATEGORIES, TrackerPackage.Literals.ARTIFACT__CATEGORIES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategories(Category newCategories) {
		eDynamicSet(TrackerPackage.ARTIFACT__CATEGORIES, TrackerPackage.Literals.ARTIFACT__CATEGORIES, newCategories);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(TrackerPackage.ARTIFACT__ROLES, TrackerPackage.Literals.ARTIFACT__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return (Boolean)eDynamicGet(TrackerPackage.ARTIFACT__PRIVATE, TrackerPackage.Literals.ARTIFACT__PRIVATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		eDynamicSet(TrackerPackage.ARTIFACT__PRIVATE, TrackerPackage.Literals.ARTIFACT__PRIVATE, newPrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueRelationshipType> getIssueRelationshipTypes() {
		return (EList<IssueRelationshipType>)eDynamicGet(TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES, TrackerPackage.Literals.ARTIFACT__ISSUE_RELATIONSHIP_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueStatus> getIssueStatuses() {
		return (EList<IssueStatus>)eDynamicGet(TrackerPackage.ARTIFACT__ISSUE_STATUSES, TrackerPackage.Literals.ARTIFACT__ISSUE_STATUSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueResolution> getIssueResolutions() {
		return (EList<IssueResolution>)eDynamicGet(TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS, TrackerPackage.Literals.ARTIFACT__ISSUE_RESOLUTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssuePriority> getIssuePriorities() {
		return (EList<IssuePriority>)eDynamicGet(TrackerPackage.ARTIFACT__ISSUE_PRIORITIES, TrackerPackage.Literals.ARTIFACT__ISSUE_PRIORITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrackerPackage.ARTIFACT__DEVELOPERS:
				return ((InternalEList<?>)getDevelopers()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ISSUES:
				return ((InternalEList<?>)getIssues()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__VERSIONS:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
				return ((InternalEList<?>)getIssueRelationshipTypes()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
				return ((InternalEList<?>)getIssueStatuses()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
				return ((InternalEList<?>)getIssueResolutions()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
				return ((InternalEList<?>)getIssuePriorities()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.ARTIFACT__ID:
				return getId();
			case TrackerPackage.ARTIFACT__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
			case TrackerPackage.ARTIFACT__GROUP_ID:
				return getGroupID();
			case TrackerPackage.ARTIFACT__NAME:
				return getName();
			case TrackerPackage.ARTIFACT__DESCRIPTION:
				return getDescription();
			case TrackerPackage.ARTIFACT__DEVELOPERS:
				return getDevelopers();
			case TrackerPackage.ARTIFACT__MODULES:
				return getModules();
			case TrackerPackage.ARTIFACT__ISSUES:
				return getIssues();
			case TrackerPackage.ARTIFACT__VERSIONS:
				return getVersions();
			case TrackerPackage.ARTIFACT__CATEGORIES:
				if (resolve) return getCategories();
				return basicGetCategories();
			case TrackerPackage.ARTIFACT__ROLES:
				return getRoles();
			case TrackerPackage.ARTIFACT__PRIVATE:
				return isPrivate();
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
				return getIssueRelationshipTypes();
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
				return getIssueStatuses();
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
				return getIssueResolutions();
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
				return getIssuePriorities();
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
			case TrackerPackage.ARTIFACT__ID:
				setId((String)newValue);
				return;
			case TrackerPackage.ARTIFACT__GROUP:
				setGroup((Group)newValue);
				return;
			case TrackerPackage.ARTIFACT__GROUP_ID:
				setGroupID((String)newValue);
				return;
			case TrackerPackage.ARTIFACT__NAME:
				setName((String)newValue);
				return;
			case TrackerPackage.ARTIFACT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.ARTIFACT__DEVELOPERS:
				getDevelopers().clear();
				getDevelopers().addAll((Collection<? extends Developer>)newValue);
				return;
			case TrackerPackage.ARTIFACT__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Artifact>)newValue);
				return;
			case TrackerPackage.ARTIFACT__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackerPackage.ARTIFACT__VERSIONS:
				getVersions().clear();
				getVersions().addAll((Collection<? extends Version>)newValue);
				return;
			case TrackerPackage.ARTIFACT__CATEGORIES:
				setCategories((Category)newValue);
				return;
			case TrackerPackage.ARTIFACT__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case TrackerPackage.ARTIFACT__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
				getIssueRelationshipTypes().clear();
				getIssueRelationshipTypes().addAll((Collection<? extends IssueRelationshipType>)newValue);
				return;
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
				getIssueStatuses().clear();
				getIssueStatuses().addAll((Collection<? extends IssueStatus>)newValue);
				return;
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
				getIssueResolutions().clear();
				getIssueResolutions().addAll((Collection<? extends IssueResolution>)newValue);
				return;
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
				getIssuePriorities().clear();
				getIssuePriorities().addAll((Collection<? extends IssuePriority>)newValue);
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
			case TrackerPackage.ARTIFACT__ID:
				setId(ID_EDEFAULT);
				return;
			case TrackerPackage.ARTIFACT__GROUP:
				setGroup((Group)null);
				return;
			case TrackerPackage.ARTIFACT__GROUP_ID:
				setGroupID(GROUP_ID_EDEFAULT);
				return;
			case TrackerPackage.ARTIFACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrackerPackage.ARTIFACT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.ARTIFACT__DEVELOPERS:
				getDevelopers().clear();
				return;
			case TrackerPackage.ARTIFACT__MODULES:
				getModules().clear();
				return;
			case TrackerPackage.ARTIFACT__ISSUES:
				getIssues().clear();
				return;
			case TrackerPackage.ARTIFACT__VERSIONS:
				getVersions().clear();
				return;
			case TrackerPackage.ARTIFACT__CATEGORIES:
				setCategories((Category)null);
				return;
			case TrackerPackage.ARTIFACT__ROLES:
				getRoles().clear();
				return;
			case TrackerPackage.ARTIFACT__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
				getIssueRelationshipTypes().clear();
				return;
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
				getIssueStatuses().clear();
				return;
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
				getIssueResolutions().clear();
				return;
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
				getIssuePriorities().clear();
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
			case TrackerPackage.ARTIFACT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case TrackerPackage.ARTIFACT__GROUP:
				return basicGetGroup() != null;
			case TrackerPackage.ARTIFACT__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? getGroupID() != null : !GROUP_ID_EDEFAULT.equals(getGroupID());
			case TrackerPackage.ARTIFACT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TrackerPackage.ARTIFACT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.ARTIFACT__DEVELOPERS:
				return !getDevelopers().isEmpty();
			case TrackerPackage.ARTIFACT__MODULES:
				return !getModules().isEmpty();
			case TrackerPackage.ARTIFACT__ISSUES:
				return !getIssues().isEmpty();
			case TrackerPackage.ARTIFACT__VERSIONS:
				return !getVersions().isEmpty();
			case TrackerPackage.ARTIFACT__CATEGORIES:
				return basicGetCategories() != null;
			case TrackerPackage.ARTIFACT__ROLES:
				return !getRoles().isEmpty();
			case TrackerPackage.ARTIFACT__PRIVATE:
				return isPrivate() != PRIVATE_EDEFAULT;
			case TrackerPackage.ARTIFACT__ISSUE_RELATIONSHIP_TYPES:
				return !getIssueRelationshipTypes().isEmpty();
			case TrackerPackage.ARTIFACT__ISSUE_STATUSES:
				return !getIssueStatuses().isEmpty();
			case TrackerPackage.ARTIFACT__ISSUE_RESOLUTIONS:
				return !getIssueResolutions().isEmpty();
			case TrackerPackage.ARTIFACT__ISSUE_PRIORITIES:
				return !getIssuePriorities().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.ARTIFACT__DESCRIPTION, TrackerPackage.Literals.ARTIFACT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.ARTIFACT__DESCRIPTION, TrackerPackage.Literals.ARTIFACT__DESCRIPTION, newDescription);
	}

} //ArtifactImpl
