/**
 */
package org.nasdanika.tracker.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.IssueRelationship;
import org.nasdanika.tracker.IssueResolution;
import org.nasdanika.tracker.IssueStatus;
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
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getOutboundRelationships <em>Outbound Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getInboundRelationships <em>Inbound Relationships</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getSubscribers <em>Subscribers</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getSubmitted <em>Submitted</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.nasdanika.tracker.impl.IssueImpl#getEstimatedEffort <em>Estimated Effort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends CDOObjectImpl implements Issue {
	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;
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
	 * The default value of the '{@link #getSubmitted() <em>Submitted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitted()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMITTED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEstimatedEffort() <em>Estimated Effort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedEffort()
	 * @generated
	 * @ordered
	 */
	protected static final Double ESTIMATED_EFFORT_EDEFAULT = null;

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
		return (User)eDynamicGet(TrackerPackage.ISSUE__REPORTER, TrackerPackage.Literals.ISSUE__REPORTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetReporter() {
		return (User)eDynamicGet(TrackerPackage.ISSUE__REPORTER, TrackerPackage.Literals.ISSUE__REPORTER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReporter(User newReporter) {
		eDynamicSet(TrackerPackage.ISSUE__REPORTER, TrackerPackage.Literals.ISSUE__REPORTER, newReporter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		return (Category)eDynamicGet(TrackerPackage.ISSUE__CATEGORY, TrackerPackage.Literals.ISSUE__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return (Category)eDynamicGet(TrackerPackage.ISSUE__CATEGORY, TrackerPackage.Literals.ISSUE__CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		eDynamicSet(TrackerPackage.ISSUE__CATEGORY, TrackerPackage.Literals.ISSUE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return (String)eDynamicGet(TrackerPackage.ISSUE__SUMMARY, TrackerPackage.Literals.ISSUE__SUMMARY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		eDynamicSet(TrackerPackage.ISSUE__SUMMARY, TrackerPackage.Literals.ISSUE__SUMMARY, newSummary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eDynamicGet(TrackerPackage.ISSUE__DESCRIPTION, TrackerPackage.Literals.ISSUE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eDynamicSet(TrackerPackage.ISSUE__DESCRIPTION, TrackerPackage.Literals.ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getArtifactVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__ARTIFACT_VERSION, TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetArtifactVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__ARTIFACT_VERSION, TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactVersion(Version newArtifactVersion) {
		eDynamicSet(TrackerPackage.ISSUE__ARTIFACT_VERSION, TrackerPackage.Literals.ISSUE__ARTIFACT_VERSION, newArtifactVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getTargetVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__TARGET_VERSION, TrackerPackage.Literals.ISSUE__TARGET_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetTargetVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__TARGET_VERSION, TrackerPackage.Literals.ISSUE__TARGET_VERSION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(Version newTargetVersion) {
		eDynamicSet(TrackerPackage.ISSUE__TARGET_VERSION, TrackerPackage.Literals.ISSUE__TARGET_VERSION, newTargetVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getFixedInVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__FIXED_IN_VERSION, TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetFixedInVersion() {
		return (Version)eDynamicGet(TrackerPackage.ISSUE__FIXED_IN_VERSION, TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedInVersion(Version newFixedInVersion) {
		eDynamicSet(TrackerPackage.ISSUE__FIXED_IN_VERSION, TrackerPackage.Literals.ISSUE__FIXED_IN_VERSION, newFixedInVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueRelationship> getOutboundRelationships() {
		return (EList<IssueRelationship>)eDynamicGet(TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS, TrackerPackage.Literals.ISSUE__OUTBOUND_RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IssueRelationship> getInboundRelationships() {
		return (EList<IssueRelationship>)eDynamicGet(TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS, TrackerPackage.Literals.ISSUE__INBOUND_RELATIONSHIPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer getAssignedTo() {
		return (Developer)eDynamicGet(TrackerPackage.ISSUE__ASSIGNED_TO, TrackerPackage.Literals.ISSUE__ASSIGNED_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer basicGetAssignedTo() {
		return (Developer)eDynamicGet(TrackerPackage.ISSUE__ASSIGNED_TO, TrackerPackage.Literals.ISSUE__ASSIGNED_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedTo(Developer newAssignedTo) {
		eDynamicSet(TrackerPackage.ISSUE__ASSIGNED_TO, TrackerPackage.Literals.ISSUE__ASSIGNED_TO, newAssignedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Note> getNotes() {
		return (EList<Note>)eDynamicGet(TrackerPackage.ISSUE__NOTES, TrackerPackage.Literals.ISSUE__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getSubscribers() {
		return (EList<User>)eDynamicGet(TrackerPackage.ISSUE__SUBSCRIBERS, TrackerPackage.Literals.ISSUE__SUBSCRIBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Issue> getChildren() {
		return (EList<Issue>)eDynamicGet(TrackerPackage.ISSUE__CHILDREN, TrackerPackage.Literals.ISSUE__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrivate() {
		return (Boolean)eDynamicGet(TrackerPackage.ISSUE__PRIVATE, TrackerPackage.Literals.ISSUE__PRIVATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(boolean newPrivate) {
		eDynamicSet(TrackerPackage.ISSUE__PRIVATE, TrackerPackage.Literals.ISSUE__PRIVATE, newPrivate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus getStatus() {
		return (IssueStatus)eDynamicGet(TrackerPackage.ISSUE__STATUS, TrackerPackage.Literals.ISSUE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus basicGetStatus() {
		return (IssueStatus)eDynamicGet(TrackerPackage.ISSUE__STATUS, TrackerPackage.Literals.ISSUE__STATUS, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(IssueStatus newStatus) {
		eDynamicSet(TrackerPackage.ISSUE__STATUS, TrackerPackage.Literals.ISSUE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueResolution getResolution() {
		return (IssueResolution)eDynamicGet(TrackerPackage.ISSUE__RESOLUTION, TrackerPackage.Literals.ISSUE__RESOLUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueResolution basicGetResolution() {
		return (IssueResolution)eDynamicGet(TrackerPackage.ISSUE__RESOLUTION, TrackerPackage.Literals.ISSUE__RESOLUTION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(IssueResolution newResolution) {
		eDynamicSet(TrackerPackage.ISSUE__RESOLUTION, TrackerPackage.Literals.ISSUE__RESOLUTION, newResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getSubmitted() {
		return (Date)eDynamicGet(TrackerPackage.ISSUE__SUBMITTED, TrackerPackage.Literals.ISSUE__SUBMITTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmitted(Date newSubmitted) {
		eDynamicSet(TrackerPackage.ISSUE__SUBMITTED, TrackerPackage.Literals.ISSUE__SUBMITTED, newSubmitted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastUpdate() {
		return (Date)eDynamicGet(TrackerPackage.ISSUE__LAST_UPDATE, TrackerPackage.Literals.ISSUE__LAST_UPDATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdate(Date newLastUpdate) {
		eDynamicSet(TrackerPackage.ISSUE__LAST_UPDATE, TrackerPackage.Literals.ISSUE__LAST_UPDATE, newLastUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEstimatedEffort() {
		return (Double)eDynamicGet(TrackerPackage.ISSUE__ESTIMATED_EFFORT, TrackerPackage.Literals.ISSUE__ESTIMATED_EFFORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedEffort(Double newEstimatedEffort) {
		eDynamicSet(TrackerPackage.ISSUE__ESTIMATED_EFFORT, TrackerPackage.Literals.ISSUE__ESTIMATED_EFFORT, newEstimatedEffort);
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
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInboundRelationships()).basicAdd(otherEnd, msgs);
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
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
				return ((InternalEList<?>)getOutboundRelationships()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				return ((InternalEList<?>)getInboundRelationships()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case TrackerPackage.ISSUE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case TrackerPackage.ISSUE__REPORTER:
				if (resolve) return getReporter();
				return basicGetReporter();
			case TrackerPackage.ISSUE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case TrackerPackage.ISSUE__SUMMARY:
				return getSummary();
			case TrackerPackage.ISSUE__DESCRIPTION:
				return getDescription();
			case TrackerPackage.ISSUE__ARTIFACT_VERSION:
				if (resolve) return getArtifactVersion();
				return basicGetArtifactVersion();
			case TrackerPackage.ISSUE__TARGET_VERSION:
				if (resolve) return getTargetVersion();
				return basicGetTargetVersion();
			case TrackerPackage.ISSUE__FIXED_IN_VERSION:
				if (resolve) return getFixedInVersion();
				return basicGetFixedInVersion();
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
				return getOutboundRelationships();
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				return getInboundRelationships();
			case TrackerPackage.ISSUE__ASSIGNED_TO:
				if (resolve) return getAssignedTo();
				return basicGetAssignedTo();
			case TrackerPackage.ISSUE__NOTES:
				return getNotes();
			case TrackerPackage.ISSUE__SUBSCRIBERS:
				return getSubscribers();
			case TrackerPackage.ISSUE__CHILDREN:
				return getChildren();
			case TrackerPackage.ISSUE__PRIVATE:
				return isPrivate();
			case TrackerPackage.ISSUE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case TrackerPackage.ISSUE__RESOLUTION:
				if (resolve) return getResolution();
				return basicGetResolution();
			case TrackerPackage.ISSUE__SUBMITTED:
				return getSubmitted();
			case TrackerPackage.ISSUE__LAST_UPDATE:
				return getLastUpdate();
			case TrackerPackage.ISSUE__ESTIMATED_EFFORT:
				return getEstimatedEffort();
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
			case TrackerPackage.ISSUE__REPORTER:
				setReporter((User)newValue);
				return;
			case TrackerPackage.ISSUE__CATEGORY:
				setCategory((Category)newValue);
				return;
			case TrackerPackage.ISSUE__SUMMARY:
				setSummary((String)newValue);
				return;
			case TrackerPackage.ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TrackerPackage.ISSUE__ARTIFACT_VERSION:
				setArtifactVersion((Version)newValue);
				return;
			case TrackerPackage.ISSUE__TARGET_VERSION:
				setTargetVersion((Version)newValue);
				return;
			case TrackerPackage.ISSUE__FIXED_IN_VERSION:
				setFixedInVersion((Version)newValue);
				return;
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
				getOutboundRelationships().clear();
				getOutboundRelationships().addAll((Collection<? extends IssueRelationship>)newValue);
				return;
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				getInboundRelationships().clear();
				getInboundRelationships().addAll((Collection<? extends IssueRelationship>)newValue);
				return;
			case TrackerPackage.ISSUE__ASSIGNED_TO:
				setAssignedTo((Developer)newValue);
				return;
			case TrackerPackage.ISSUE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case TrackerPackage.ISSUE__SUBSCRIBERS:
				getSubscribers().clear();
				getSubscribers().addAll((Collection<? extends User>)newValue);
				return;
			case TrackerPackage.ISSUE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Issue>)newValue);
				return;
			case TrackerPackage.ISSUE__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case TrackerPackage.ISSUE__STATUS:
				setStatus((IssueStatus)newValue);
				return;
			case TrackerPackage.ISSUE__RESOLUTION:
				setResolution((IssueResolution)newValue);
				return;
			case TrackerPackage.ISSUE__SUBMITTED:
				setSubmitted((Date)newValue);
				return;
			case TrackerPackage.ISSUE__LAST_UPDATE:
				setLastUpdate((Date)newValue);
				return;
			case TrackerPackage.ISSUE__ESTIMATED_EFFORT:
				setEstimatedEffort((Double)newValue);
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
			case TrackerPackage.ISSUE__REPORTER:
				setReporter((User)null);
				return;
			case TrackerPackage.ISSUE__CATEGORY:
				setCategory((Category)null);
				return;
			case TrackerPackage.ISSUE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case TrackerPackage.ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TrackerPackage.ISSUE__ARTIFACT_VERSION:
				setArtifactVersion((Version)null);
				return;
			case TrackerPackage.ISSUE__TARGET_VERSION:
				setTargetVersion((Version)null);
				return;
			case TrackerPackage.ISSUE__FIXED_IN_VERSION:
				setFixedInVersion((Version)null);
				return;
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
				getOutboundRelationships().clear();
				return;
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				getInboundRelationships().clear();
				return;
			case TrackerPackage.ISSUE__ASSIGNED_TO:
				setAssignedTo((Developer)null);
				return;
			case TrackerPackage.ISSUE__NOTES:
				getNotes().clear();
				return;
			case TrackerPackage.ISSUE__SUBSCRIBERS:
				getSubscribers().clear();
				return;
			case TrackerPackage.ISSUE__CHILDREN:
				getChildren().clear();
				return;
			case TrackerPackage.ISSUE__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case TrackerPackage.ISSUE__STATUS:
				setStatus((IssueStatus)null);
				return;
			case TrackerPackage.ISSUE__RESOLUTION:
				setResolution((IssueResolution)null);
				return;
			case TrackerPackage.ISSUE__SUBMITTED:
				setSubmitted(SUBMITTED_EDEFAULT);
				return;
			case TrackerPackage.ISSUE__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
				return;
			case TrackerPackage.ISSUE__ESTIMATED_EFFORT:
				setEstimatedEffort(ESTIMATED_EFFORT_EDEFAULT);
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
			case TrackerPackage.ISSUE__REPORTER:
				return basicGetReporter() != null;
			case TrackerPackage.ISSUE__CATEGORY:
				return basicGetCategory() != null;
			case TrackerPackage.ISSUE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? getSummary() != null : !SUMMARY_EDEFAULT.equals(getSummary());
			case TrackerPackage.ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TrackerPackage.ISSUE__ARTIFACT_VERSION:
				return basicGetArtifactVersion() != null;
			case TrackerPackage.ISSUE__TARGET_VERSION:
				return basicGetTargetVersion() != null;
			case TrackerPackage.ISSUE__FIXED_IN_VERSION:
				return basicGetFixedInVersion() != null;
			case TrackerPackage.ISSUE__OUTBOUND_RELATIONSHIPS:
				return !getOutboundRelationships().isEmpty();
			case TrackerPackage.ISSUE__INBOUND_RELATIONSHIPS:
				return !getInboundRelationships().isEmpty();
			case TrackerPackage.ISSUE__ASSIGNED_TO:
				return basicGetAssignedTo() != null;
			case TrackerPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
			case TrackerPackage.ISSUE__SUBSCRIBERS:
				return !getSubscribers().isEmpty();
			case TrackerPackage.ISSUE__CHILDREN:
				return !getChildren().isEmpty();
			case TrackerPackage.ISSUE__PRIVATE:
				return isPrivate() != PRIVATE_EDEFAULT;
			case TrackerPackage.ISSUE__STATUS:
				return basicGetStatus() != null;
			case TrackerPackage.ISSUE__RESOLUTION:
				return basicGetResolution() != null;
			case TrackerPackage.ISSUE__SUBMITTED:
				return SUBMITTED_EDEFAULT == null ? getSubmitted() != null : !SUBMITTED_EDEFAULT.equals(getSubmitted());
			case TrackerPackage.ISSUE__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? getLastUpdate() != null : !LAST_UPDATE_EDEFAULT.equals(getLastUpdate());
			case TrackerPackage.ISSUE__ESTIMATED_EFFORT:
				return ESTIMATED_EFFORT_EDEFAULT == null ? getEstimatedEffort() != null : !ESTIMATED_EFFORT_EDEFAULT.equals(getEstimatedEffort());
		}
		return super.eIsSet(featureID);
	}

} //IssueImpl
