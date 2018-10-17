/**
 */
package org.nasdanika.tracker.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.cdo.security.SecurityPackage;

import org.nasdanika.tracker.Artifact;
import org.nasdanika.tracker.Availability;
import org.nasdanika.tracker.Capability;
import org.nasdanika.tracker.Category;
import org.nasdanika.tracker.Developer;
import org.nasdanika.tracker.Group;
import org.nasdanika.tracker.Increment;
import org.nasdanika.tracker.Issue;
import org.nasdanika.tracker.IssuePriority;
import org.nasdanika.tracker.IssueRelationship;
import org.nasdanika.tracker.IssueRelationshipBlockingDirection;
import org.nasdanika.tracker.IssueRelationshipType;
import org.nasdanika.tracker.IssueResolution;
import org.nasdanika.tracker.IssueStatus;
import org.nasdanika.tracker.Knowledge;
import org.nasdanika.tracker.Note;
import org.nasdanika.tracker.Organization;
import org.nasdanika.tracker.OrganizationMember;
import org.nasdanika.tracker.ProgressReport;
import org.nasdanika.tracker.Release;
import org.nasdanika.tracker.Requirement;
import org.nasdanika.tracker.Role;
import org.nasdanika.tracker.Skill;
import org.nasdanika.tracker.SkillLevel;
import org.nasdanika.tracker.Technology;
import org.nasdanika.tracker.Tracker;
import org.nasdanika.tracker.TrackerFactory;
import org.nasdanika.tracker.TrackerPackage;
import org.nasdanika.tracker.User;
import org.nasdanika.tracker.Version;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrackerPackageImpl extends EPackageImpl implements TrackerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trackerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass developerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueResolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issuePriorityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass progressReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueRelationshipBlockingDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skillLevelEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.tracker.TrackerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrackerPackageImpl() {
		super(eNS_URI, TrackerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TrackerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrackerPackage init() {
		if (isInited) return (TrackerPackage)EPackage.Registry.INSTANCE.getEPackage(TrackerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrackerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrackerPackageImpl theTrackerPackage = registeredTrackerPackage instanceof TrackerPackageImpl ? (TrackerPackageImpl)registeredTrackerPackage : new TrackerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		SecurityPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTrackerPackage.createPackageContents();

		// Initialize created meta-data
		theTrackerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrackerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrackerPackage.eNS_URI, theTrackerPackage);
		return theTrackerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracker() {
		return trackerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracker_Name() {
		return (EAttribute)trackerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracker_Users() {
		return (EReference)trackerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracker_AutoCreateUsers() {
		return (EAttribute)trackerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracker_Organizations() {
		return (EReference)trackerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTracker_Description() {
		return (EAttribute)trackerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Name() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_EMail() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Comment() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Url() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Avatar() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Timezone() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Membership() {
		return (EReference)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Id() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_GroupID() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Developers() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Modules() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Issues() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Versions() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Categories() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Roles() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_Private() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_IssueRelationshipTypes() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_IssueStatuses() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_IssueResolutions() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_IssuePriorities() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRole_Developers() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganization() {
		return organizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Members() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Groups() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Increments() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganization_SitesUrl() {
		return (EAttribute)organizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganization_Technologies() {
		return (EReference)organizationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Description() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Children() {
		return (EReference)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Members() {
		return (EReference)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Artifacts() {
		return (EReference)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Private() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Number() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Description() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Date() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVersion_Increment() {
		return (EReference)versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersion_Released() {
		return (EAttribute)versionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_AssignedTo() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCategory_Description() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Reporter() {
		return (EReference)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Category() {
		return (EReference)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Summary() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Description() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_ArtifactVersion() {
		return (EReference)issueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_TargetVersion() {
		return (EReference)issueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_FixedInVersion() {
		return (EReference)issueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_OutboundRelationships() {
		return (EReference)issueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_InboundRelationships() {
		return (EReference)issueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_AssignedTo() {
		return (EReference)issueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Notes() {
		return (EReference)issueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Subscribers() {
		return (EReference)issueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Children() {
		return (EReference)issueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Private() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Status() {
		return (EReference)issueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Resolution() {
		return (EReference)issueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_Submitted() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_LastUpdate() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssue_EstimatedEffort() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssue_Requirements() {
		return (EReference)issueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncrement() {
		return incrementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrement_Name() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrement_Description() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncrement_Versions() {
		return (EReference)incrementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncrement_Children() {
		return (EReference)incrementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrement_Start() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncrement_End() {
		return (EAttribute)incrementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrganizationMember() {
		return organizationMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationMember_User() {
		return (EReference)organizationMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationMember_Roles() {
		return (EReference)organizationMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationMember_Availability() {
		return (EReference)organizationMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrganizationMember_Skills() {
		return (EReference)organizationMemberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrganizationMember_Description() {
		return (EAttribute)organizationMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeveloper() {
		return developerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeveloper_OrganizationMember() {
		return (EReference)developerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeveloper_Roles() {
		return (EReference)developerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeveloper_Description() {
		return (EAttribute)developerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueRelationship() {
		return issueRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssueRelationship_Target() {
		return (EReference)issueRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssueRelationship_Type() {
		return (EReference)issueRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueRelationship_Description() {
		return (EAttribute)issueRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueStatus() {
		return issueStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueStatus_Name() {
		return (EAttribute)issueStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueStatus_Description() {
		return (EAttribute)issueStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueResolution() {
		return issueResolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueResolution_Name() {
		return (EAttribute)issueResolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueResolution_Description() {
		return (EAttribute)issueResolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssuePriority() {
		return issuePriorityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuePriority_Name() {
		return (EAttribute)issuePriorityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssuePriority_Description() {
		return (EAttribute)issuePriorityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNote_Developer() {
		return (EReference)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Comment() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Date() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNote_Private() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgressReport() {
		return progressReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressReport_PeriodStart() {
		return (EAttribute)progressReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressReport_PeriodEnd() {
		return (EAttribute)progressReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressReport_TimeSpent() {
		return (EAttribute)progressReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgressReport_RemainingEffort() {
		return (EAttribute)progressReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Name() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapability_Description() {
		return (EAttribute)capabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Description() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Capability() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Optional() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKnowledge() {
		return knowledgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKnowledge_Experts() {
		return (EReference)knowledgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAvailability_Increment() {
		return (EReference)availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Availability() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Comment() {
		return (EAttribute)availabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnology_Releases() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTechnology_Children() {
		return (EReference)technologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelease() {
		return releaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkill() {
		return skillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Level() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSkill_Description() {
		return (EAttribute)skillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkill_Knowledge() {
		return (EReference)skillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIssueRelationshipBlockingDirection() {
		return issueRelationshipBlockingDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSkillLevel() {
		return skillLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIssueRelationshipType() {
		return issueRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueRelationshipType_Name() {
		return (EAttribute)issueRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueRelationshipType_Description() {
		return (EAttribute)issueRelationshipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIssueRelationshipType_BlockingDirection() {
		return (EAttribute)issueRelationshipTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIssueRelationshipType_Opposite() {
		return (EReference)issueRelationshipTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackerFactory getTrackerFactory() {
		return (TrackerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		trackerEClass = createEClass(TRACKER);
		createEAttribute(trackerEClass, TRACKER__NAME);
		createEAttribute(trackerEClass, TRACKER__DESCRIPTION);
		createEAttribute(trackerEClass, TRACKER__AUTO_CREATE_USERS);
		createEReference(trackerEClass, TRACKER__USERS);
		createEReference(trackerEClass, TRACKER__ORGANIZATIONS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__COMMENT);
		createEAttribute(userEClass, USER__URL);
		createEAttribute(userEClass, USER__AVATAR);
		createEAttribute(userEClass, USER__TIMEZONE);
		createEReference(userEClass, USER__MEMBERSHIP);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__ID);
		createEAttribute(artifactEClass, ARTIFACT__GROUP_ID);
		createEReference(artifactEClass, ARTIFACT__DEVELOPERS);
		createEReference(artifactEClass, ARTIFACT__MODULES);
		createEReference(artifactEClass, ARTIFACT__ISSUES);
		createEReference(artifactEClass, ARTIFACT__VERSIONS);
		createEReference(artifactEClass, ARTIFACT__CATEGORIES);
		createEReference(artifactEClass, ARTIFACT__ROLES);
		createEAttribute(artifactEClass, ARTIFACT__PRIVATE);
		createEReference(artifactEClass, ARTIFACT__ISSUE_RELATIONSHIP_TYPES);
		createEReference(artifactEClass, ARTIFACT__ISSUE_STATUSES);
		createEReference(artifactEClass, ARTIFACT__ISSUE_RESOLUTIONS);
		createEReference(artifactEClass, ARTIFACT__ISSUE_PRIORITIES);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);
		createEReference(roleEClass, ROLE__DEVELOPERS);

		organizationEClass = createEClass(ORGANIZATION);
		createEReference(organizationEClass, ORGANIZATION__MEMBERS);
		createEReference(organizationEClass, ORGANIZATION__GROUPS);
		createEReference(organizationEClass, ORGANIZATION__INCREMENTS);
		createEAttribute(organizationEClass, ORGANIZATION__SITES_URL);
		createEReference(organizationEClass, ORGANIZATION__TECHNOLOGIES);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__ID);
		createEAttribute(groupEClass, GROUP__PRIVATE);
		createEAttribute(groupEClass, GROUP__DESCRIPTION);
		createEReference(groupEClass, GROUP__CHILDREN);
		createEReference(groupEClass, GROUP__MEMBERS);
		createEReference(groupEClass, GROUP__ARTIFACTS);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__NUMBER);
		createEAttribute(versionEClass, VERSION__DESCRIPTION);
		createEAttribute(versionEClass, VERSION__DATE);
		createEReference(versionEClass, VERSION__INCREMENT);
		createEAttribute(versionEClass, VERSION__RELEASED);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEAttribute(categoryEClass, CATEGORY__DESCRIPTION);
		createEReference(categoryEClass, CATEGORY__ASSIGNED_TO);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__SUMMARY);
		createEReference(issueEClass, ISSUE__REPORTER);
		createEReference(issueEClass, ISSUE__CATEGORY);
		createEAttribute(issueEClass, ISSUE__DESCRIPTION);
		createEReference(issueEClass, ISSUE__ARTIFACT_VERSION);
		createEReference(issueEClass, ISSUE__TARGET_VERSION);
		createEReference(issueEClass, ISSUE__FIXED_IN_VERSION);
		createEReference(issueEClass, ISSUE__OUTBOUND_RELATIONSHIPS);
		createEReference(issueEClass, ISSUE__INBOUND_RELATIONSHIPS);
		createEReference(issueEClass, ISSUE__ASSIGNED_TO);
		createEReference(issueEClass, ISSUE__NOTES);
		createEReference(issueEClass, ISSUE__SUBSCRIBERS);
		createEReference(issueEClass, ISSUE__CHILDREN);
		createEAttribute(issueEClass, ISSUE__PRIVATE);
		createEReference(issueEClass, ISSUE__STATUS);
		createEReference(issueEClass, ISSUE__RESOLUTION);
		createEAttribute(issueEClass, ISSUE__SUBMITTED);
		createEAttribute(issueEClass, ISSUE__LAST_UPDATE);
		createEAttribute(issueEClass, ISSUE__ESTIMATED_EFFORT);
		createEReference(issueEClass, ISSUE__REQUIREMENTS);

		issueRelationshipTypeEClass = createEClass(ISSUE_RELATIONSHIP_TYPE);
		createEAttribute(issueRelationshipTypeEClass, ISSUE_RELATIONSHIP_TYPE__NAME);
		createEAttribute(issueRelationshipTypeEClass, ISSUE_RELATIONSHIP_TYPE__DESCRIPTION);
		createEAttribute(issueRelationshipTypeEClass, ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION);
		createEReference(issueRelationshipTypeEClass, ISSUE_RELATIONSHIP_TYPE__OPPOSITE);

		issueRelationshipEClass = createEClass(ISSUE_RELATIONSHIP);
		createEReference(issueRelationshipEClass, ISSUE_RELATIONSHIP__TARGET);
		createEReference(issueRelationshipEClass, ISSUE_RELATIONSHIP__TYPE);
		createEAttribute(issueRelationshipEClass, ISSUE_RELATIONSHIP__DESCRIPTION);

		issueStatusEClass = createEClass(ISSUE_STATUS);
		createEAttribute(issueStatusEClass, ISSUE_STATUS__NAME);
		createEAttribute(issueStatusEClass, ISSUE_STATUS__DESCRIPTION);

		issueResolutionEClass = createEClass(ISSUE_RESOLUTION);
		createEAttribute(issueResolutionEClass, ISSUE_RESOLUTION__NAME);
		createEAttribute(issueResolutionEClass, ISSUE_RESOLUTION__DESCRIPTION);

		issuePriorityEClass = createEClass(ISSUE_PRIORITY);
		createEAttribute(issuePriorityEClass, ISSUE_PRIORITY__NAME);
		createEAttribute(issuePriorityEClass, ISSUE_PRIORITY__DESCRIPTION);

		incrementEClass = createEClass(INCREMENT);
		createEAttribute(incrementEClass, INCREMENT__NAME);
		createEAttribute(incrementEClass, INCREMENT__DESCRIPTION);
		createEAttribute(incrementEClass, INCREMENT__START);
		createEAttribute(incrementEClass, INCREMENT__END);
		createEReference(incrementEClass, INCREMENT__VERSIONS);
		createEReference(incrementEClass, INCREMENT__CHILDREN);

		organizationMemberEClass = createEClass(ORGANIZATION_MEMBER);
		createEReference(organizationMemberEClass, ORGANIZATION_MEMBER__USER);
		createEAttribute(organizationMemberEClass, ORGANIZATION_MEMBER__DESCRIPTION);
		createEReference(organizationMemberEClass, ORGANIZATION_MEMBER__ROLES);
		createEReference(organizationMemberEClass, ORGANIZATION_MEMBER__AVAILABILITY);
		createEReference(organizationMemberEClass, ORGANIZATION_MEMBER__SKILLS);

		developerEClass = createEClass(DEVELOPER);
		createEReference(developerEClass, DEVELOPER__ORGANIZATION_MEMBER);
		createEAttribute(developerEClass, DEVELOPER__DESCRIPTION);
		createEReference(developerEClass, DEVELOPER__ROLES);

		noteEClass = createEClass(NOTE);
		createEReference(noteEClass, NOTE__DEVELOPER);
		createEAttribute(noteEClass, NOTE__COMMENT);
		createEAttribute(noteEClass, NOTE__DATE);
		createEAttribute(noteEClass, NOTE__PRIVATE);

		progressReportEClass = createEClass(PROGRESS_REPORT);
		createEAttribute(progressReportEClass, PROGRESS_REPORT__PERIOD_START);
		createEAttribute(progressReportEClass, PROGRESS_REPORT__PERIOD_END);
		createEAttribute(progressReportEClass, PROGRESS_REPORT__TIME_SPENT);
		createEAttribute(progressReportEClass, PROGRESS_REPORT__REMAINING_EFFORT);

		capabilityEClass = createEClass(CAPABILITY);
		createEAttribute(capabilityEClass, CAPABILITY__NAME);
		createEAttribute(capabilityEClass, CAPABILITY__DESCRIPTION);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);
		createEReference(requirementEClass, REQUIREMENT__CAPABILITY);
		createEAttribute(requirementEClass, REQUIREMENT__OPTIONAL);

		knowledgeEClass = createEClass(KNOWLEDGE);
		createEReference(knowledgeEClass, KNOWLEDGE__EXPERTS);

		availabilityEClass = createEClass(AVAILABILITY);
		createEReference(availabilityEClass, AVAILABILITY__INCREMENT);
		createEAttribute(availabilityEClass, AVAILABILITY__AVAILABILITY);
		createEAttribute(availabilityEClass, AVAILABILITY__COMMENT);

		technologyEClass = createEClass(TECHNOLOGY);
		createEReference(technologyEClass, TECHNOLOGY__RELEASES);
		createEReference(technologyEClass, TECHNOLOGY__CHILDREN);

		releaseEClass = createEClass(RELEASE);

		skillEClass = createEClass(SKILL);
		createEAttribute(skillEClass, SKILL__LEVEL);
		createEAttribute(skillEClass, SKILL__DESCRIPTION);
		createEReference(skillEClass, SKILL__KNOWLEDGE);

		// Create enums
		issueRelationshipBlockingDirectionEEnum = createEEnum(ISSUE_RELATIONSHIP_BLOCKING_DIRECTION);
		skillLevelEEnum = createEEnum(SKILL_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		trackerEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordRealm());
		userEClass.getESuperTypes().add(theSecurityPackage.getLoginPasswordHashUser());
		artifactEClass.getESuperTypes().add(this.getKnowledge());
		organizationEClass.getESuperTypes().add(this.getArtifact());
		progressReportEClass.getESuperTypes().add(this.getNote());
		knowledgeEClass.getESuperTypes().add(this.getCapability());
		technologyEClass.getESuperTypes().add(this.getKnowledge());
		releaseEClass.getESuperTypes().add(this.getKnowledge());

		// Initialize classes, features, and operations; add parameters
		initEClass(trackerEClass, Tracker.class, "Tracker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTracker_Name(), ecorePackage.getEString(), "name", null, 1, 1, Tracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracker_Description(), ecorePackage.getEString(), "description", null, 0, 1, Tracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTracker_AutoCreateUsers(), ecorePackage.getEBoolean(), "autoCreateUsers", null, 0, 1, Tracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracker_Users(), this.getUser(), null, "users", null, 0, -1, Tracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracker_Organizations(), this.getOrganization(), null, "organizations", null, 0, -1, Tracker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_EMail(), ecorePackage.getEString(), "eMail", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Url(), ecorePackage.getEString(), "url", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Avatar(), ecorePackage.getEString(), "avatar", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Timezone(), ecorePackage.getEString(), "timezone", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Membership(), this.getOrganizationMember(), this.getOrganizationMember_User(), "membership", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_Id(), ecorePackage.getEString(), "id", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_GroupID(), ecorePackage.getEString(), "groupID", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Developers(), this.getDeveloper(), null, "developers", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Modules(), this.getArtifact(), null, "modules", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Issues(), this.getIssue(), null, "issues", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Versions(), this.getVersion(), null, "versions", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Categories(), this.getCategory(), null, "categories", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_Roles(), this.getRole(), null, "roles", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArtifact_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IssueRelationshipTypes(), this.getIssueRelationshipType(), null, "issueRelationshipTypes", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IssueStatuses(), this.getIssueStatus(), null, "issueStatuses", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IssueResolutions(), this.getIssueResolution(), null, "issueResolutions", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_IssuePriorities(), this.getIssuePriority(), null, "issuePriorities", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRole_Developers(), this.getDeveloper(), this.getDeveloper_Roles(), "developers", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganization_Members(), this.getOrganizationMember(), null, "members", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Groups(), this.getGroup(), null, "groups", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Increments(), this.getIncrement(), null, "increments", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganization_SitesUrl(), ecorePackage.getEString(), "sitesUrl", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganization_Technologies(), this.getTechnology(), null, "technologies", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Id(), ecorePackage.getEString(), "id", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Children(), this.getGroup(), null, "children", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Members(), this.getOrganizationMember(), null, "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Artifacts(), this.getArtifact(), null, "artifacts", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Number(), ecorePackage.getEString(), "number", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Description(), ecorePackage.getEString(), "description", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVersion_Increment(), this.getIncrement(), this.getIncrement_Versions(), "increment", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Released(), ecorePackage.getEBoolean(), "released", null, 0, 1, Version.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_AssignedTo(), this.getDeveloper(), null, "assignedTo", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Reporter(), this.getUser(), null, "reporter", null, 1, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Category(), this.getCategory(), null, "category", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Description(), ecorePackage.getEString(), "description", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_ArtifactVersion(), this.getVersion(), null, "artifactVersion", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_TargetVersion(), this.getVersion(), null, "targetVersion", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_FixedInVersion(), this.getVersion(), null, "fixedInVersion", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_OutboundRelationships(), this.getIssueRelationship(), null, "outboundRelationships", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_InboundRelationships(), this.getIssueRelationship(), this.getIssueRelationship_Target(), "inboundRelationships", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_AssignedTo(), this.getDeveloper(), null, "assignedTo", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Notes(), this.getNote(), null, "notes", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Subscribers(), this.getUser(), null, "subscribers", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Children(), this.getIssue(), null, "children", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Status(), this.getIssueStatus(), null, "status", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Resolution(), this.getIssueResolution(), null, "resolution", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Submitted(), ecorePackage.getEDate(), "submitted", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_LastUpdate(), ecorePackage.getEDate(), "lastUpdate", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_EstimatedEffort(), ecorePackage.getEDoubleObject(), "estimatedEffort", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssue_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueRelationshipTypeEClass, IssueRelationshipType.class, "IssueRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueRelationshipType_Name(), ecorePackage.getEString(), "name", null, 0, 1, IssueRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueRelationshipType_Description(), ecorePackage.getEString(), "description", null, 0, 1, IssueRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueRelationshipType_BlockingDirection(), this.getIssueRelationshipBlockingDirection(), "blockingDirection", null, 0, 1, IssueRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueRelationshipType_Opposite(), this.getIssueRelationshipType(), null, "opposite", null, 0, 1, IssueRelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueRelationshipEClass, IssueRelationship.class, "IssueRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIssueRelationship_Target(), this.getIssue(), this.getIssue_InboundRelationships(), "target", null, 0, 1, IssueRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIssueRelationship_Type(), this.getIssueRelationshipType(), null, "type", null, 0, 1, IssueRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, IssueRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueStatusEClass, IssueStatus.class, "IssueStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueStatus_Name(), ecorePackage.getEString(), "name", null, 0, 1, IssueStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueStatus_Description(), ecorePackage.getEString(), "description", null, 0, 1, IssueStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueResolutionEClass, IssueResolution.class, "IssueResolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssueResolution_Name(), ecorePackage.getEString(), "name", null, 0, 1, IssueResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssueResolution_Description(), ecorePackage.getEString(), "description", null, 0, 1, IssueResolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issuePriorityEClass, IssuePriority.class, "IssuePriority", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssuePriority_Name(), ecorePackage.getEString(), "name", null, 0, 1, IssuePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssuePriority_Description(), ecorePackage.getEString(), "description", null, 0, 1, IssuePriority.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incrementEClass, Increment.class, "Increment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncrement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrement_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncrement_End(), ecorePackage.getEDate(), "end", null, 0, 1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncrement_Versions(), this.getVersion(), this.getVersion_Increment(), "versions", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncrement_Children(), this.getIncrement(), null, "children", null, 0, -1, Increment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(organizationMemberEClass, OrganizationMember.class, "OrganizationMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrganizationMember_User(), this.getUser(), this.getUser_Membership(), "user", null, 1, 1, OrganizationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrganizationMember_Description(), ecorePackage.getEString(), "description", null, 0, 1, OrganizationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationMember_Roles(), this.getDeveloper(), this.getDeveloper_OrganizationMember(), "roles", null, 0, -1, OrganizationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationMember_Availability(), this.getAvailability(), null, "availability", null, 0, -1, OrganizationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrganizationMember_Skills(), this.getSkill(), null, "skills", null, 0, -1, OrganizationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(developerEClass, Developer.class, "Developer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeveloper_OrganizationMember(), this.getOrganizationMember(), this.getOrganizationMember_Roles(), "organizationMember", null, 0, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeveloper_Description(), ecorePackage.getEString(), "description", null, 0, 1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeveloper_Roles(), this.getRole(), this.getRole_Developers(), "roles", null, 0, -1, Developer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNote_Developer(), this.getDeveloper(), null, "developer", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Private(), ecorePackage.getEBoolean(), "private", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(progressReportEClass, ProgressReport.class, "ProgressReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgressReport_PeriodStart(), ecorePackage.getEDate(), "periodStart", null, 0, 1, ProgressReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressReport_PeriodEnd(), ecorePackage.getEDate(), "periodEnd", null, 0, 1, ProgressReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressReport_TimeSpent(), ecorePackage.getEDoubleObject(), "timeSpent", null, 0, 1, ProgressReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgressReport_RemainingEffort(), ecorePackage.getEDoubleObject(), "remainingEffort", null, 0, 1, ProgressReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapability_Name(), ecorePackage.getEString(), "name", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapability_Description(), ecorePackage.getEString(), "description", null, 0, 1, Capability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Description(), ecorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Capability(), this.getCapability(), null, "capability", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(knowledgeEClass, Knowledge.class, "Knowledge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKnowledge_Experts(), this.getSkill(), this.getSkill_Knowledge(), "experts", null, 0, -1, Knowledge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAvailability_Increment(), this.getIncrement(), null, "increment", null, 1, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Availability(), ecorePackage.getEInt(), "availability", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnology_Releases(), this.getRelease(), null, "releases", null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnology_Children(), this.getTechnology(), null, "children", null, 0, -1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(releaseEClass, Release.class, "Release", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(skillEClass, Skill.class, "Skill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkill_Level(), this.getSkillLevel(), "level", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkill_Description(), ecorePackage.getEString(), "description", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkill_Knowledge(), this.getKnowledge(), this.getKnowledge_Experts(), "knowledge", null, 0, 1, Skill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(issueRelationshipBlockingDirectionEEnum, IssueRelationshipBlockingDirection.class, "IssueRelationshipBlockingDirection");
		addEEnumLiteral(issueRelationshipBlockingDirectionEEnum, IssueRelationshipBlockingDirection.NONE);
		addEEnumLiteral(issueRelationshipBlockingDirectionEEnum, IssueRelationshipBlockingDirection.SOURCE);
		addEEnumLiteral(issueRelationshipBlockingDirectionEEnum, IssueRelationshipBlockingDirection.TARGET);

		initEEnum(skillLevelEEnum, SkillLevel.class, "SkillLevel");
		addEEnumLiteral(skillLevelEEnum, SkillLevel.NOVICE);
		addEEnumLiteral(skillLevelEEnum, SkillLevel.INTERMEDIATE);
		addEEnumLiteral(skillLevelEEnum, SkillLevel.EXPERT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Issue tracker for Maven projects. "
		   });
		addAnnotation
		  (trackerEClass,
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getTracker_Name(),
		   source,
		   new String[] {
			   "documentation", "Role name, e.g. \"Architect\"."
		   });
		addAnnotation
		  (getTracker_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getTracker_AutoCreateUsers(),
		   source,
		   new String[] {
			   "documentation", "If this attribute is set to true users are automatically created by getUser(String) method.\nThis attribute shall be set to true in SSO deployments where users are authenticated\nby external systems which pass user ID\'s to the application."
		   });
		addAnnotation
		  (userEClass,
		   source,
		   new String[] {
			   "documentation", ""
		   });
		addAnnotation
		  (getUser_Name(),
		   source,
		   new String[] {
			   "documentation", "User name, e.g. \"Joe Smith\""
		   });
		addAnnotation
		  (getUser_EMail(),
		   source,
		   new String[] {
			   "documentation", "User e-mail."
		   });
		addAnnotation
		  (getUser_Comment(),
		   source,
		   new String[] {
			   "documentation", "Comment in markdown."
		   });
		addAnnotation
		  (getUser_Url(),
		   source,
		   new String[] {
			   "documentation", "User \"home page\", e.g. Github profile or an entry in the organization directory."
		   });
		addAnnotation
		  (getUser_Avatar(),
		   source,
		   new String[] {
			   "documentation", "URL of a user picture."
		   });
		addAnnotation
		  (getUser_Timezone(),
		   source,
		   new String[] {
			   "documentation", "Time zone of user location."
		   });
		addAnnotation
		  (artifactEClass,
		   source,
		   new String[] {
			   "documentation", "Maven artifact, a.k.a. Component. Artifacts can be of different types such as services, libraries, tools (Eclipse plug-ins), documentation, organization info sites. \nThere are two special cases of artifacts:\n\n- Organizations - artifacts with users as members who work as developers on organization\'s artifacts. For an organization a deliverable is an organization\'s site which provides information about the organization, its developers and its artifacts.\n- Projects - artifacts without binary deliverables. Projects typically would have a site containing project documentation. There is no special \"Project\" class in the model.\n"
		   });
		addAnnotation
		  (getArtifact_Id(),
		   source,
		   new String[] {
			   "documentation", "Artifact ID, shall be unique within the group ID. "
		   });
		addAnnotation
		  (getArtifact_GroupID(),
		   source,
		   new String[] {
			   "documentation", "Maven group ID, e.g. ``org.nasdanika.tracker``. If there is no dot in the group ID it is appended to the container\'s or group\'s group ID. If it is blank, it is inherited from group/container group ID."
		   });
		addAnnotation
		  (getArtifact_Developers(),
		   source,
		   new String[] {
			   "documentation", "Artifact is worked on by developers playing different roles."
		   });
		addAnnotation
		  (getArtifact_Modules(),
		   source,
		   new String[] {
			   "documentation", "Artifacts can be nested. A typical case is artirfacts owned by an organization, which is a special type of an artifact."
		   });
		addAnnotation
		  (getArtifact_Issues(),
		   source,
		   new String[] {
			   "documentation", "Artifacts have zero or more Issues associated with them - something which has to be taken care of in order to deliver a new version."
		   });
		addAnnotation
		  (getArtifact_Versions(),
		   source,
		   new String[] {
			   "documentation", "Artifacts have multiple versions which can be used by different other artifact\'s versions.\nFor projects versions are means for grouping of issues, a.k.a. phases/milestones."
		   });
		addAnnotation
		  (getArtifact_Categories(),
		   source,
		   new String[] {
			   "documentation", "Issue categories."
		   });
		addAnnotation
		  (getArtifact_Private(),
		   source,
		   new String[] {
			   "documentation", "Private model elements are visible only by the members of containing organization."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "User/member role."
		   });
		addAnnotation
		  (getRole_Name(),
		   source,
		   new String[] {
			   "documentation", "Role name, e.g. \"Architect\"."
		   });
		addAnnotation
		  (getRole_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (organizationEClass,
		   source,
		   new String[] {
			   "documentation", "Organization is a development team with developers or a grouping of organizations."
		   });
		addAnnotation
		  (getOrganization_Members(),
		   source,
		   new String[] {
			   "documentation", "Organization members participating in development of organization\'s artifacts in different roles."
		   });
		addAnnotation
		  (getOrganization_Groups(),
		   source,
		   new String[] {
			   "documentation", "Artifacts can be organized into groups."
		   });
		addAnnotation
		  (getOrganization_Increments(),
		   source,
		   new String[] {
			   "documentation", "Organization\'s work is organized into increments."
		   });
		addAnnotation
		  (getOrganization_SitesUrl(),
		   source,
		   new String[] {
			   "documentation", "Base URL for artifact sites. Full URL of an artifact site is formed by adding group id, artifact id, and version to the base URL."
		   });
		addAnnotation
		  (getOrganization_Technologies(),
		   source,
		   new String[] {
			   "documentation", "Technologies used in the organization."
		   });
		addAnnotation
		  (groupEClass,
		   source,
		   new String[] {
			   "documentation", "Time zone of user location."
		   });
		addAnnotation
		  (getGroup_Name(),
		   source,
		   new String[] {
			   "documentation", "Group name."
		   });
		addAnnotation
		  (getGroup_Id(),
		   source,
		   new String[] {
			   "documentation", "Group ID. If group ID does not contain a dot it is considered relative to the parent organization/group id and full group id is formed by appending this group ID to the container group ID "
		   });
		addAnnotation
		  (getGroup_Private(),
		   source,
		   new String[] {
			   "documentation", "Private model elements are visible only by the members of containing organization."
		   });
		addAnnotation
		  (getGroup_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getGroup_Children(),
		   source,
		   new String[] {
			   "documentation", "Groups form a hierarchy."
		   });
		addAnnotation
		  (getGroup_Members(),
		   source,
		   new String[] {
			   "documentation", "Containing organization members \"aligned\" with this group, i.e. having expertise in technologies used by the group artifacts and familiarity with the group artifacts. Typically group members would also be developers of group artifacts. "
		   });
		addAnnotation
		  (getGroup_Artifacts(),
		   source,
		   new String[] {
			   "documentation", "Group artifacts."
		   });
		addAnnotation
		  (versionEClass,
		   source,
		   new String[] {
			   "documentation", "Artifacts have multiple versions. \nVersion URL is constructed by adding version number to the artifact URL."
		   });
		addAnnotation
		  (getVersion_Number(),
		   source,
		   new String[] {
			   "documentation", "Version number, unique withing group ID/artifact ID."
		   });
		addAnnotation
		  (getVersion_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getVersion_Date(),
		   source,
		   new String[] {
			   "documentation", "Date when a version is planned to be released or was released."
		   });
		addAnnotation
		  (getVersion_Increment(),
		   source,
		   new String[] {
			   "documentation", "Increment in which a version was released or is planned to be released. \nThis relationship is used for capacity planning.\n"
		   });
		addAnnotation
		  (categoryEClass,
		   source,
		   new String[] {
			   "documentation", "Issue category."
		   });
		addAnnotation
		  (getCategory_Name(),
		   source,
		   new String[] {
			   "documentation", "Category name."
		   });
		addAnnotation
		  (getCategory_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getCategory_AssignedTo(),
		   source,
		   new String[] {
			   "documentation", "If this reference is set all issues reported to this category get assigned to the referenced developer."
		   });
		addAnnotation
		  (issueEClass,
		   source,
		   new String[] {
			   "documentation", "Issue is something that needs to be acted upon to modify the state of the artifact. It is a \"command\" which may or may not be \"executed\".\n"
		   });
		addAnnotation
		  (getIssue_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIssue_ArtifactVersion(),
		   source,
		   new String[] {
			   "documentation", "Artifact verion where issue was discovered (for bugs)."
		   });
		addAnnotation
		  (getIssue_TargetVersion(),
		   source,
		   new String[] {
			   "documentation", "Version in which this issue is planned to be resolved/closed."
		   });
		addAnnotation
		  (getIssue_FixedInVersion(),
		   source,
		   new String[] {
			   "documentation", "Artifact version where issue was resolved/closed, e.g. but fixed."
		   });
		addAnnotation
		  (getIssue_OutboundRelationships(),
		   source,
		   new String[] {
			   "documentation", "Relationships with other issues. Relationships can be cross-deliverable. E.g. a quality improvement project spanning many components may \ncontain issues related to issues in those components. "
		   });
		addAnnotation
		  (getIssue_InboundRelationships(),
		   source,
		   new String[] {
			   "documentation", "Relationships with other issues. Relationships can be cross-deliverable. E.g. a quality improvement project spanning many components may \ncontain issues related to issues in those components. "
		   });
		addAnnotation
		  (getIssue_AssignedTo(),
		   source,
		   new String[] {
			   "documentation", "Developer assigned to work on the issue/own it. \nThe developer may work on the issue with other developers and people outside of the team, but they are a go-to person for any questions about the issue.\nFor small components this relationship might be implicit - the owner of the component also owns component issues."
		   });
		addAnnotation
		  (getIssue_Subscribers(),
		   source,
		   new String[] {
			   "documentation", "Users monitoring the issue and getting notified of changes in the issue."
		   });
		addAnnotation
		  (getIssue_Children(),
		   source,
		   new String[] {
			   "documentation", "Issues can be nested. Issue containment is equivalent to parent/child issue relationship.\nEither or both can be used depending on a situation. \n\nExplicit issue nesting is conceptually similar to a project plan where a larger parent issue is resolved\nby resolving child issues."
		   });
		addAnnotation
		  (getIssue_Private(),
		   source,
		   new String[] {
			   "documentation", "Private model elements are visible only by the members of containing organization."
		   });
		addAnnotation
		  (getIssue_EstimatedEffort(),
		   source,
		   new String[] {
			   "documentation", "Estimated effort in hours."
		   });
		addAnnotation
		  (getIssueRelationshipType_Name(),
		   source,
		   new String[] {
			   "documentation", "Relationship name."
		   });
		addAnnotation
		  (getIssueRelationshipType_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIssueRelationshipType_BlockingDirection(),
		   source,
		   new String[] {
			   "documentation", "Indicates blocking direction. E.g. \"Parent\" relationship is source blocking. The source issue (parent) is blocked by the target (child)."
		   });
		addAnnotation
		  (issueRelationshipEClass,
		   source,
		   new String[] {
			   "documentation", "Relationship between issues."
		   });
		addAnnotation
		  (getIssueRelationship_Target(),
		   source,
		   new String[] {
			   "documentation", "Relationship target issue. The container is the source."
		   });
		addAnnotation
		  (getIssueRelationship_Type(),
		   source,
		   new String[] {
			   "documentation", "Relationship type."
		   });
		addAnnotation
		  (getIssueRelationship_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIssueStatus_Name(),
		   source,
		   new String[] {
			   "documentation", "Status name."
		   });
		addAnnotation
		  (getIssueStatus_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIssueResolution_Name(),
		   source,
		   new String[] {
			   "documentation", "Resolution name."
		   });
		addAnnotation
		  (getIssueResolution_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIssuePriority_Name(),
		   source,
		   new String[] {
			   "documentation", "Status name."
		   });
		addAnnotation
		  (getIssuePriority_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (incrementEClass,
		   source,
		   new String[] {
			   "documentation", "Time period during which an organization works on issues in its components. \nIncrements can be nested. \n\nIn the long term time periods can be years or quarters. In this case assignments of versions to increments would be a roadmap subject to change. Versions in this case would be more like \"roadmap items\"  or \"milestones\" - defined at a high level to be refined later.\nIn near term increments would be sprints and version to increment assignment would be used for capacity planning.\n\n"
		   });
		addAnnotation
		  (getIncrement_Name(),
		   source,
		   new String[] {
			   "documentation", "Increment name. E.g. \"2019\" or \"Sprint 1\"."
		   });
		addAnnotation
		  (getIncrement_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getIncrement_Start(),
		   source,
		   new String[] {
			   "documentation", "Increment start date."
		   });
		addAnnotation
		  (getIncrement_End(),
		   source,
		   new String[] {
			   "documentation", "Increment end date."
		   });
		addAnnotation
		  (getIncrement_Versions(),
		   source,
		   new String[] {
			   "documentation", "Versions planned for this increment or released in this increment."
		   });
		addAnnotation
		  (getIncrement_Children(),
		   source,
		   new String[] {
			   "documentation", "Increments can be nested. E.g.  Sprints can be nested into year or quarter increments."
		   });
		addAnnotation
		  (organizationMemberEClass,
		   source,
		   new String[] {
			   "documentation", "A member of a development team."
		   });
		addAnnotation
		  (getOrganizationMember_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getOrganizationMember_Roles(),
		   source,
		   new String[] {
			   "documentation", "Developer may play different roles for different artifacts/components."
		   });
		addAnnotation
		  (developerEClass,
		   source,
		   new String[] {
			   "documentation", "Roles an organization member plays in development of the containing artifact."
		   });
		addAnnotation
		  (getDeveloper_OrganizationMember(),
		   source,
		   new String[] {
			   "documentation", "Organization member."
		   });
		addAnnotation
		  (getDeveloper_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (getDeveloper_Roles(),
		   source,
		   new String[] {
			   "documentation", "Developer roles."
		   });
		addAnnotation
		  (noteEClass,
		   source,
		   new String[] {
			   "documentation", "A note/comment for an issue."
		   });
		addAnnotation
		  (getNote_Private(),
		   source,
		   new String[] {
			   "documentation", "Private model elements are visible only by the members of containing organization."
		   });
		addAnnotation
		  (progressReportEClass,
		   source,
		   new String[] {
			   "documentation", "Progress reports are submitted by developers working on issues and are aggregated for issues/versions/projects. \nProgress reports are used in reporting. E.g. building a burndown chart for an increment or earned value/remaining effort calculation for a version and/or increment.\n\nFor progress reports it is recommended to have comments in the format:\n\n* Progress - what was done.\n* Plans - what is planned for the next reporting period (day/week)\n* Problems - impediments and risks which may need to be addressed."
		   });
		addAnnotation
		  (getProgressReport_TimeSpent(),
		   source,
		   new String[] {
			   "documentation", "Time spent in hours."
		   });
		addAnnotation
		  (getProgressReport_RemainingEffort(),
		   source,
		   new String[] {
			   "documentation", "Remaining effort estimation."
		   });
		addAnnotation
		  (capabilityEClass,
		   source,
		   new String[] {
			   "documentation", "Something that might be required to, say, implement an issue."
		   });
		addAnnotation
		  (getCapability_Name(),
		   source,
		   new String[] {
			   "documentation", "Increment name. E.g. \"2019\" or \"Sprint 1\"."
		   });
		addAnnotation
		  (getCapability_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "documentation", "Requirement of a capability."
		   });
		addAnnotation
		  (getRequirement_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
		addAnnotation
		  (knowledgeEClass,
		   source,
		   new String[] {
			   "documentation", "Base abstract class for something which people can be experienced in - technologies and artifacts."
		   });
		addAnnotation
		  (availabilityEClass,
		   source,
		   new String[] {
			   "documentation", "Number of hours an organization member can spend working on organization\'s artifacts in a particular increment. It is used incremente planning when artifact versions are assigned to increments."
		   });
		addAnnotation
		  (getAvailability_Availability(),
		   source,
		   new String[] {
			   "documentation", "Availability in hours."
		   });
		addAnnotation
		  (getAvailability_Comment(),
		   source,
		   new String[] {
			   "documentation", "Comment in markdown."
		   });
		addAnnotation
		  (technologyEClass,
		   source,
		   new String[] {
			   "documentation", "Technology, e.g. Java, .Net, AWS, RabbitMQ"
		   });
		addAnnotation
		  (getTechnology_Children(),
		   source,
		   new String[] {
			   "documentation", "Technology forms a tree."
		   });
		addAnnotation
		  (releaseEClass,
		   source,
		   new String[] {
			   "documentation", "Technology release. E.g. Java 10."
		   });
		addAnnotation
		  (getSkill_Description(),
		   source,
		   new String[] {
			   "documentation", "Description in markdown."
		   });
	}

} //TrackerPackageImpl
