/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.tracker.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrackerFactoryImpl extends EFactoryImpl implements TrackerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrackerFactory init() {
		try {
			TrackerFactory theTrackerFactory = (TrackerFactory)EPackage.Registry.INSTANCE.getEFactory(TrackerPackage.eNS_URI);
			if (theTrackerFactory != null) {
				return theTrackerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrackerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TrackerPackage.TRACKER: return (EObject)createTracker();
			case TrackerPackage.USER: return (EObject)createUser();
			case TrackerPackage.ARTIFACT: return (EObject)createArtifact();
			case TrackerPackage.ROLE: return (EObject)createRole();
			case TrackerPackage.ORGANIZATION: return (EObject)createOrganization();
			case TrackerPackage.GROUP: return (EObject)createGroup();
			case TrackerPackage.VERSION: return (EObject)createVersion();
			case TrackerPackage.CATEGORY: return (EObject)createCategory();
			case TrackerPackage.ISSUE: return (EObject)createIssue();
			case TrackerPackage.ISSUE_RELATIONSHIP_TYPE: return (EObject)createIssueRelationshipType();
			case TrackerPackage.ISSUE_RELATIONSHIP: return (EObject)createIssueRelationship();
			case TrackerPackage.ISSUE_STATUS: return (EObject)createIssueStatus();
			case TrackerPackage.ISSUE_RESOLUTION: return (EObject)createIssueResolution();
			case TrackerPackage.ISSUE_PRIORITY: return (EObject)createIssuePriority();
			case TrackerPackage.INCREMENT: return (EObject)createIncrement();
			case TrackerPackage.ORGANIZATION_MEMBER: return (EObject)createOrganizationMember();
			case TrackerPackage.DEVELOPER: return (EObject)createDeveloper();
			case TrackerPackage.NOTE: return (EObject)createNote();
			case TrackerPackage.PROGRESS_REPORT: return (EObject)createProgressReport();
			case TrackerPackage.AVAILABILITY: return (EObject)createAvailability();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TrackerPackage.ISSUE_RELATIONSHIP_BLOCKING_DIRECTION:
				return createIssueRelationshipBlockingDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TrackerPackage.ISSUE_RELATIONSHIP_BLOCKING_DIRECTION:
				return convertIssueRelationshipBlockingDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tracker createTracker() {
		TrackerImpl tracker = new TrackerImpl();
		return tracker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Artifact createArtifact() {
		ArtifactImpl artifact = new ArtifactImpl();
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization createOrganization() {
		OrganizationImpl organization = new OrganizationImpl();
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersion() {
		VersionImpl version = new VersionImpl();
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipType createIssueRelationshipType() {
		IssueRelationshipTypeImpl issueRelationshipType = new IssueRelationshipTypeImpl();
		return issueRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Increment createIncrement() {
		IncrementImpl increment = new IncrementImpl();
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrganizationMember createOrganizationMember() {
		OrganizationMemberImpl organizationMember = new OrganizationMemberImpl();
		return organizationMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Developer createDeveloper() {
		DeveloperImpl developer = new DeveloperImpl();
		return developer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationship createIssueRelationship() {
		IssueRelationshipImpl issueRelationship = new IssueRelationshipImpl();
		return issueRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueStatus createIssueStatus() {
		IssueStatusImpl issueStatus = new IssueStatusImpl();
		return issueStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueResolution createIssueResolution() {
		IssueResolutionImpl issueResolution = new IssueResolutionImpl();
		return issueResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssuePriority createIssuePriority() {
		IssuePriorityImpl issuePriority = new IssuePriorityImpl();
		return issuePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressReport createProgressReport() {
		ProgressReportImpl progressReport = new ProgressReportImpl();
		return progressReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueRelationshipBlockingDirection createIssueRelationshipBlockingDirectionFromString(EDataType eDataType, String initialValue) {
		IssueRelationshipBlockingDirection result = IssueRelationshipBlockingDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueRelationshipBlockingDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackerPackage getTrackerPackage() {
		return (TrackerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrackerPackage getPackage() {
		return TrackerPackage.eINSTANCE;
	}

} //TrackerFactoryImpl
