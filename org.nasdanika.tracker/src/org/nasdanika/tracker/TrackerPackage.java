/**
 */
package org.nasdanika.tracker;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.cdo.security.SecurityPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Issue tracker for Maven projects. 
 * <!-- end-model-doc -->
 * @see org.nasdanika.tracker.TrackerFactory
 * @model kind="package"
 * @generated
 */
public interface TrackerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.tracker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrackerPackage eINSTANCE = org.nasdanika.tracker.impl.TrackerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.TrackerImpl <em>Tracker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.TrackerImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getTracker()
	 * @generated
	 */
	int TRACKER = 0;

	/**
	 * The feature id for the '<em><b>Administrators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__ADMINISTRATORS = SecurityPackage.LOGIN_PASSWORD_REALM__ADMINISTRATORS;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__GUEST = SecurityPackage.LOGIN_PASSWORD_REALM__GUEST;

	/**
	 * The feature id for the '<em><b>Everyone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__EVERYONE = SecurityPackage.LOGIN_PASSWORD_REALM__EVERYONE;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__PACKAGES = SecurityPackage.LOGIN_PASSWORD_REALM__PACKAGES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__NAME = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__DESCRIPTION = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Auto Create Users</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__AUTO_CREATE_USERS = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__USERS = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Organizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER__ORGANIZATIONS = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Authenticate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___AUTHENTICATE__OBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___AUTHENTICATE__OBJECT;

	/**
	 * The operation id for the '<em>Get All Users</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___GET_ALL_USERS = SecurityPackage.LOGIN_PASSWORD_REALM___GET_ALL_USERS;

	/**
	 * The operation id for the '<em>Clear Permissions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___CLEAR_PERMISSIONS__EOBJECT = SecurityPackage.LOGIN_PASSWORD_REALM___CLEAR_PERMISSIONS__EOBJECT;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___IS_ADMINISTRATOR__PRINCIPAL = SecurityPackage.LOGIN_PASSWORD_REALM___IS_ADMINISTRATOR__PRINCIPAL;

	/**
	 * The operation id for the '<em>Set Password Hash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING = SecurityPackage.LOGIN_PASSWORD_REALM___SET_PASSWORD_HASH__LOGINPASSWORDHASHUSER_STRING;

	/**
	 * The operation id for the '<em>Get User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER___GET_USER__STRING = SecurityPackage.LOGIN_PASSWORD_REALM___GET_USER__STRING;

	/**
	 * The number of operations of the '<em>Tracker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACKER_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_REALM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.UserImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Member Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBER_OF = SecurityPackage.LOGIN_PASSWORD_HASH_USER__MEMBER_OF;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERMISSIONS = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PERMISSIONS;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DISABLED = SecurityPackage.LOGIN_PASSWORD_HASH_USER__DISABLED;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOGIN = SecurityPackage.LOGIN_PASSWORD_HASH_USER__LOGIN;

	/**
	 * The feature id for the '<em><b>Password Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD_HASH = SecurityPackage.LOGIN_PASSWORD_HASH_USER__PASSWORD_HASH;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__COMMENT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__URL = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Avatar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AVATAR = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__TIMEZONE = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBERSHIP = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Authorize</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP = SecurityPackage.LOGIN_PASSWORD_HASH_USER___AUTHORIZE__CONTEXT_EOBJECT_STRING_STRING_MAP;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ACCEPT__PRINCIPALVISITOR = SecurityPackage.LOGIN_PASSWORD_HASH_USER___ACCEPT__PRINCIPALVISITOR;

	/**
	 * The operation id for the '<em>Get Realm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___GET_REALM = SecurityPackage.LOGIN_PASSWORD_HASH_USER___GET_REALM;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = SecurityPackage.LOGIN_PASSWORD_HASH_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.CapabilityImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.KnowledgeImpl <em>Knowledge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.KnowledgeImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getKnowledge()
	 * @generated
	 */
	int KNOWLEDGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__NAME = CAPABILITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__DESCRIPTION = CAPABILITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE__EXPERTS = CAPABILITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_FEATURE_COUNT = CAPABILITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Knowledge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_OPERATION_COUNT = CAPABILITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.ArtifactImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__NAME = KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DESCRIPTION = KNOWLEDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__EXPERTS = KNOWLEDGE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ID = KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__GROUP_ID = KNOWLEDGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__DEVELOPERS = KNOWLEDGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__MODULES = KNOWLEDGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUES = KNOWLEDGE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__VERSIONS = KNOWLEDGE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__CATEGORIES = KNOWLEDGE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ROLES = KNOWLEDGE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__PRIVATE = KNOWLEDGE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Issue Relationship Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUE_RELATIONSHIP_TYPES = KNOWLEDGE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUE_STATUSES = KNOWLEDGE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Issue Resolutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUE_RESOLUTIONS = KNOWLEDGE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Issue Priorities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__ISSUE_PRIORITIES = KNOWLEDGE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = KNOWLEDGE_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = KNOWLEDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.RoleImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DEVELOPERS = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.OrganizationImpl <em>Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.OrganizationImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getOrganization()
	 * @generated
	 */
	int ORGANIZATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__NAME = ARTIFACT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DESCRIPTION = ARTIFACT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__EXPERTS = ARTIFACT__EXPERTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ID = ARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__GROUP_ID = ARTIFACT__GROUP_ID;

	/**
	 * The feature id for the '<em><b>Developers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__DEVELOPERS = ARTIFACT__DEVELOPERS;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MODULES = ARTIFACT__MODULES;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUES = ARTIFACT__ISSUES;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__VERSIONS = ARTIFACT__VERSIONS;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__CATEGORIES = ARTIFACT__CATEGORIES;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ROLES = ARTIFACT__ROLES;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__PRIVATE = ARTIFACT__PRIVATE;

	/**
	 * The feature id for the '<em><b>Issue Relationship Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_RELATIONSHIP_TYPES = ARTIFACT__ISSUE_RELATIONSHIP_TYPES;

	/**
	 * The feature id for the '<em><b>Issue Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_STATUSES = ARTIFACT__ISSUE_STATUSES;

	/**
	 * The feature id for the '<em><b>Issue Resolutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_RESOLUTIONS = ARTIFACT__ISSUE_RESOLUTIONS;

	/**
	 * The feature id for the '<em><b>Issue Priorities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__ISSUE_PRIORITIES = ARTIFACT__ISSUE_PRIORITIES;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__MEMBERS = ARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__GROUPS = ARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__INCREMENTS = ARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sites Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__SITES_URL = ARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION__TECHNOLOGIES = ARTIFACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_FEATURE_COUNT = ARTIFACT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_OPERATION_COUNT = ARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.GroupImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = 1;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PRIVATE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = 5;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ARTIFACTS = 6;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.VersionImpl <em>Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.VersionImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getVersion()
	 * @generated
	 */
	int VERSION = 6;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__DATE = 2;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__INCREMENT = 3;

	/**
	 * The feature id for the '<em><b>Released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION__RELEASED = 4;

	/**
	 * The number of structural features of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.CategoryImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ASSIGNED_TO = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssueImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 8;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Reporter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REPORTER = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Artifact Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ARTIFACT_VERSION = 4;

	/**
	 * The feature id for the '<em><b>Target Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TARGET_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Fixed In Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__FIXED_IN_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Outbound Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__OUTBOUND_RELATIONSHIPS = 7;

	/**
	 * The feature id for the '<em><b>Inbound Relationships</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__INBOUND_RELATIONSHIPS = 8;

	/**
	 * The feature id for the '<em><b>Assigned To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNED_TO = 9;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NOTES = 10;

	/**
	 * The feature id for the '<em><b>Subscribers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUBSCRIBERS = 11;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CHILDREN = 12;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PRIVATE = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATUS = 14;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__RESOLUTION = 15;

	/**
	 * The feature id for the '<em><b>Submitted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUBMITTED = 16;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LAST_UPDATE = 17;

	/**
	 * The feature id for the '<em><b>Estimated Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ESTIMATED_EFFORT = 18;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REQUIREMENTS = 19;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IncrementImpl <em>Increment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IncrementImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIncrement()
	 * @generated
	 */
	int INCREMENT = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.OrganizationMemberImpl <em>Organization Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.OrganizationMemberImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getOrganizationMember()
	 * @generated
	 */
	int ORGANIZATION_MEMBER = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.DeveloperImpl <em>Developer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.DeveloperImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getDeveloper()
	 * @generated
	 */
	int DEVELOPER = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssueRelationshipImpl <em>Issue Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssueRelationshipImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationship()
	 * @generated
	 */
	int ISSUE_RELATIONSHIP = 10;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssueStatusImpl <em>Issue Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssueStatusImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueStatus()
	 * @generated
	 */
	int ISSUE_STATUS = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssueResolutionImpl <em>Issue Resolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssueResolutionImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueResolution()
	 * @generated
	 */
	int ISSUE_RESOLUTION = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssuePriorityImpl <em>Issue Priority</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssuePriorityImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssuePriority()
	 * @generated
	 */
	int ISSUE_PRIORITY = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.NoteImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.ProgressReportImpl <em>Progress Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.ProgressReportImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getProgressReport()
	 * @generated
	 */
	int PROGRESS_REPORT = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.AvailabilityImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.IssueRelationshipBlockingDirection <em>Issue Relationship Blocking Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.IssueRelationshipBlockingDirection
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationshipBlockingDirection()
	 * @generated
	 */
	int ISSUE_RELATIONSHIP_BLOCKING_DIRECTION = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.SkillLevel <em>Skill Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.SkillLevel
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getSkillLevel()
	 * @generated
	 */
	int SKILL_LEVEL = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl <em>Issue Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.IssueRelationshipTypeImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationshipType()
	 * @generated
	 */
	int ISSUE_RELATIONSHIP_TYPE = 9;


	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Blocking Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION = 2;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE__OPPOSITE = 3;

	/**
	 * The number of structural features of the '<em>Issue Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Issue Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Issue Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Issue Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Issue Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_STATUS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RESOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RESOLUTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Issue Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RESOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Resolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_RESOLUTION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_PRIORITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_PRIORITY__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Issue Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_PRIORITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Issue Priority</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_PRIORITY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__END = 3;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__VERSIONS = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT__CHILDREN = 5;

	/**
	 * The number of structural features of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Increment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER__USER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER__ROLES = 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER__AVAILABILITY = 3;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER__SKILLS = 4;

	/**
	 * The number of structural features of the '<em>Organization Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Organization Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANIZATION_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Organization Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ORGANIZATION_MEMBER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER__ROLES = 2;

	/**
	 * The number of structural features of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Developer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVELOPER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Developer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DEVELOPER = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DATE = 2;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__PRIVATE = 3;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Developer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__DEVELOPER = NOTE__DEVELOPER;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__COMMENT = NOTE__COMMENT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__DATE = NOTE__DATE;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__PRIVATE = NOTE__PRIVATE;

	/**
	 * The feature id for the '<em><b>Period Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__PERIOD_START = NOTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Period End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__PERIOD_END = NOTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__TIME_SPENT = NOTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Remaining Effort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT__REMAINING_EFFORT = NOTE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Progress Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT_FEATURE_COUNT = NOTE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Progress Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRESS_REPORT_OPERATION_COUNT = NOTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.RequirementImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CAPABILITY = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OPTIONAL = 2;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__INCREMENT = 0;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__AVAILABILITY = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.TechnologyImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__DESCRIPTION = KNOWLEDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__EXPERTS = KNOWLEDGE__EXPERTS;

	/**
	 * The feature id for the '<em><b>Releases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__RELEASES = KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__CHILDREN = KNOWLEDGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = KNOWLEDGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = KNOWLEDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.ReleaseImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NAME = KNOWLEDGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__DESCRIPTION = KNOWLEDGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Experts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__EXPERTS = KNOWLEDGE__EXPERTS;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = KNOWLEDGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = KNOWLEDGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.tracker.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.tracker.impl.SkillImpl
	 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 25;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Knowledge</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__KNOWLEDGE = 2;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Tracker <em>Tracker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tracker</em>'.
	 * @see org.nasdanika.tracker.Tracker
	 * @generated
	 */
	EClass getTracker();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Tracker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Tracker#getName()
	 * @see #getTracker()
	 * @generated
	 */
	EAttribute getTracker_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Tracker#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.nasdanika.tracker.Tracker#getUsers()
	 * @see #getTracker()
	 * @generated
	 */
	EReference getTracker_Users();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Tracker#isAutoCreateUsers <em>Auto Create Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Create Users</em>'.
	 * @see org.nasdanika.tracker.Tracker#isAutoCreateUsers()
	 * @see #getTracker()
	 * @generated
	 */
	EAttribute getTracker_AutoCreateUsers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Tracker#getOrganizations <em>Organizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizations</em>'.
	 * @see org.nasdanika.tracker.Tracker#getOrganizations()
	 * @see #getTracker()
	 * @generated
	 */
	EReference getTracker_Organizations();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Tracker#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Tracker#getDescription()
	 * @see #getTracker()
	 * @generated
	 */
	EAttribute getTracker_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.tracker.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see org.nasdanika.tracker.User#getEMail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EMail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.tracker.User#getComment()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.tracker.User#getUrl()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getAvatar <em>Avatar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar</em>'.
	 * @see org.nasdanika.tracker.User#getAvatar()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Avatar();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.User#getTimezone <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timezone</em>'.
	 * @see org.nasdanika.tracker.User#getTimezone()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Timezone();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.User#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see org.nasdanika.tracker.User#getMembership()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Membership();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.tracker.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Artifact#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.tracker.Artifact#getId()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Artifact#getGroupID <em>Group ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group ID</em>'.
	 * @see org.nasdanika.tracker.Artifact#getGroupID()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_GroupID();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Developers</em>'.
	 * @see org.nasdanika.tracker.Artifact#getDevelopers()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Developers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.nasdanika.tracker.Artifact#getModules()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see org.nasdanika.tracker.Artifact#getIssues()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Issues();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.nasdanika.tracker.Artifact#getVersions()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Versions();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.tracker.Artifact#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Categories</em>'.
	 * @see org.nasdanika.tracker.Artifact#getCategories()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.nasdanika.tracker.Artifact#getRoles()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Artifact#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.nasdanika.tracker.Artifact#isPrivate()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Private();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getIssueRelationshipTypes <em>Issue Relationship Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Relationship Types</em>'.
	 * @see org.nasdanika.tracker.Artifact#getIssueRelationshipTypes()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IssueRelationshipTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getIssueStatuses <em>Issue Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Statuses</em>'.
	 * @see org.nasdanika.tracker.Artifact#getIssueStatuses()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IssueStatuses();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getIssueResolutions <em>Issue Resolutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Resolutions</em>'.
	 * @see org.nasdanika.tracker.Artifact#getIssueResolutions()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IssueResolutions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Artifact#getIssuePriorities <em>Issue Priorities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issue Priorities</em>'.
	 * @see org.nasdanika.tracker.Artifact#getIssuePriorities()
	 * @see #getArtifact()
	 * @generated
	 */
	EReference getArtifact_IssuePriorities();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.nasdanika.tracker.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Role#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Developers</em>'.
	 * @see org.nasdanika.tracker.Role#getDevelopers()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Developers();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Organization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization</em>'.
	 * @see org.nasdanika.tracker.Organization
	 * @generated
	 */
	EClass getOrganization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Organization#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.tracker.Organization#getMembers()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Organization#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.tracker.Organization#getGroups()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Organization#getIncrements <em>Increments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Increments</em>'.
	 * @see org.nasdanika.tracker.Organization#getIncrements()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Increments();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Organization#getSitesUrl <em>Sites Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sites Url</em>'.
	 * @see org.nasdanika.tracker.Organization#getSitesUrl()
	 * @see #getOrganization()
	 * @generated
	 */
	EAttribute getOrganization_SitesUrl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Organization#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technologies</em>'.
	 * @see org.nasdanika.tracker.Organization#getTechnologies()
	 * @see #getOrganization()
	 * @generated
	 */
	EReference getOrganization_Technologies();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.tracker.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.tracker.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Group#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.tracker.Group#getChildren()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Children();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see org.nasdanika.tracker.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Group#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.tracker.Group#getArtifacts()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Artifacts();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Group#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.nasdanika.tracker.Group#isPrivate()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Private();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Version <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version</em>'.
	 * @see org.nasdanika.tracker.Version
	 * @generated
	 */
	EClass getVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Version#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see org.nasdanika.tracker.Version#getNumber()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Number();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Version#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Version#getDescription()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Version#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.tracker.Version#getDate()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Date();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Version#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see org.nasdanika.tracker.Version#getIncrement()
	 * @see #getVersion()
	 * @generated
	 */
	EReference getVersion_Increment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Version#isReleased <em>Released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Released</em>'.
	 * @see org.nasdanika.tracker.Version#isReleased()
	 * @see #getVersion()
	 * @generated
	 */
	EAttribute getVersion_Released();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.tracker.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Category#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see org.nasdanika.tracker.Category#getAssignedTo()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_AssignedTo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.nasdanika.tracker.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getReporter <em>Reporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reporter</em>'.
	 * @see org.nasdanika.tracker.Issue#getReporter()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Reporter();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.nasdanika.tracker.Issue#getCategory()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.nasdanika.tracker.Issue#getSummary()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getArtifactVersion <em>Artifact Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Artifact Version</em>'.
	 * @see org.nasdanika.tracker.Issue#getArtifactVersion()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_ArtifactVersion();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getTargetVersion <em>Target Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Version</em>'.
	 * @see org.nasdanika.tracker.Issue#getTargetVersion()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_TargetVersion();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getFixedInVersion <em>Fixed In Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fixed In Version</em>'.
	 * @see org.nasdanika.tracker.Issue#getFixedInVersion()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_FixedInVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Issue#getOutboundRelationships <em>Outbound Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outbound Relationships</em>'.
	 * @see org.nasdanika.tracker.Issue#getOutboundRelationships()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_OutboundRelationships();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Issue#getInboundRelationships <em>Inbound Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound Relationships</em>'.
	 * @see org.nasdanika.tracker.Issue#getInboundRelationships()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_InboundRelationships();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To</em>'.
	 * @see org.nasdanika.tracker.Issue#getAssignedTo()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_AssignedTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Issue#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.nasdanika.tracker.Issue#getNotes()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Notes();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Issue#getSubscribers <em>Subscribers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribers</em>'.
	 * @see org.nasdanika.tracker.Issue#getSubscribers()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Subscribers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Issue#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.tracker.Issue#getChildren()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.nasdanika.tracker.Issue#isPrivate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Private();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see org.nasdanika.tracker.Issue#getStatus()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Status();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Issue#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolution</em>'.
	 * @see org.nasdanika.tracker.Issue#getResolution()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#getSubmitted <em>Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submitted</em>'.
	 * @see org.nasdanika.tracker.Issue#getSubmitted()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Submitted();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see org.nasdanika.tracker.Issue#getLastUpdate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_LastUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Issue#getEstimatedEffort <em>Estimated Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Effort</em>'.
	 * @see org.nasdanika.tracker.Issue#getEstimatedEffort()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_EstimatedEffort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Issue#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.nasdanika.tracker.Issue#getRequirements()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Requirements();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Increment <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Increment</em>'.
	 * @see org.nasdanika.tracker.Increment
	 * @generated
	 */
	EClass getIncrement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Increment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Increment#getName()
	 * @see #getIncrement()
	 * @generated
	 */
	EAttribute getIncrement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Increment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Increment#getDescription()
	 * @see #getIncrement()
	 * @generated
	 */
	EAttribute getIncrement_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Increment#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Versions</em>'.
	 * @see org.nasdanika.tracker.Increment#getVersions()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Versions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Increment#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.tracker.Increment#getChildren()
	 * @see #getIncrement()
	 * @generated
	 */
	EReference getIncrement_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Increment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.tracker.Increment#getStart()
	 * @see #getIncrement()
	 * @generated
	 */
	EAttribute getIncrement_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Increment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.tracker.Increment#getEnd()
	 * @see #getIncrement()
	 * @generated
	 */
	EAttribute getIncrement_End();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.OrganizationMember <em>Organization Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organization Member</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember
	 * @generated
	 */
	EClass getOrganizationMember();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.OrganizationMember#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember#getUser()
	 * @see #getOrganizationMember()
	 * @generated
	 */
	EReference getOrganizationMember_User();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.OrganizationMember#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember#getRoles()
	 * @see #getOrganizationMember()
	 * @generated
	 */
	EReference getOrganizationMember_Roles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.OrganizationMember#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Availability</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember#getAvailability()
	 * @see #getOrganizationMember()
	 * @generated
	 */
	EReference getOrganizationMember_Availability();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.OrganizationMember#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember#getSkills()
	 * @see #getOrganizationMember()
	 * @generated
	 */
	EReference getOrganizationMember_Skills();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.OrganizationMember#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.OrganizationMember#getDescription()
	 * @see #getOrganizationMember()
	 * @generated
	 */
	EAttribute getOrganizationMember_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Developer <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Developer</em>'.
	 * @see org.nasdanika.tracker.Developer
	 * @generated
	 */
	EClass getDeveloper();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Developer#getOrganizationMember <em>Organization Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Organization Member</em>'.
	 * @see org.nasdanika.tracker.Developer#getOrganizationMember()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_OrganizationMember();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Developer#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see org.nasdanika.tracker.Developer#getRoles()
	 * @see #getDeveloper()
	 * @generated
	 */
	EReference getDeveloper_Roles();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Developer#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Developer#getDescription()
	 * @see #getDeveloper()
	 * @generated
	 */
	EAttribute getDeveloper_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.IssueRelationship <em>Issue Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Relationship</em>'.
	 * @see org.nasdanika.tracker.IssueRelationship
	 * @generated
	 */
	EClass getIssueRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.IssueRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.tracker.IssueRelationship#getTarget()
	 * @see #getIssueRelationship()
	 * @generated
	 */
	EReference getIssueRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.IssueRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.nasdanika.tracker.IssueRelationship#getType()
	 * @see #getIssueRelationship()
	 * @generated
	 */
	EReference getIssueRelationship_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueRelationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.IssueRelationship#getDescription()
	 * @see #getIssueRelationship()
	 * @generated
	 */
	EAttribute getIssueRelationship_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.IssueStatus <em>Issue Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Status</em>'.
	 * @see org.nasdanika.tracker.IssueStatus
	 * @generated
	 */
	EClass getIssueStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueStatus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.IssueStatus#getName()
	 * @see #getIssueStatus()
	 * @generated
	 */
	EAttribute getIssueStatus_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueStatus#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.IssueStatus#getDescription()
	 * @see #getIssueStatus()
	 * @generated
	 */
	EAttribute getIssueStatus_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.IssueResolution <em>Issue Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Resolution</em>'.
	 * @see org.nasdanika.tracker.IssueResolution
	 * @generated
	 */
	EClass getIssueResolution();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueResolution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.IssueResolution#getName()
	 * @see #getIssueResolution()
	 * @generated
	 */
	EAttribute getIssueResolution_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueResolution#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.IssueResolution#getDescription()
	 * @see #getIssueResolution()
	 * @generated
	 */
	EAttribute getIssueResolution_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.IssuePriority <em>Issue Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Priority</em>'.
	 * @see org.nasdanika.tracker.IssuePriority
	 * @generated
	 */
	EClass getIssuePriority();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssuePriority#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.IssuePriority#getName()
	 * @see #getIssuePriority()
	 * @generated
	 */
	EAttribute getIssuePriority_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssuePriority#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.IssuePriority#getDescription()
	 * @see #getIssuePriority()
	 * @generated
	 */
	EAttribute getIssuePriority_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.nasdanika.tracker.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Note#getDeveloper <em>Developer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Developer</em>'.
	 * @see org.nasdanika.tracker.Note#getDeveloper()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Developer();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Note#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.tracker.Note#getComment()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Note#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.nasdanika.tracker.Note#getDate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Note#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see org.nasdanika.tracker.Note#isPrivate()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Private();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.ProgressReport <em>Progress Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Progress Report</em>'.
	 * @see org.nasdanika.tracker.ProgressReport
	 * @generated
	 */
	EClass getProgressReport();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.ProgressReport#getPeriodStart <em>Period Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period Start</em>'.
	 * @see org.nasdanika.tracker.ProgressReport#getPeriodStart()
	 * @see #getProgressReport()
	 * @generated
	 */
	EAttribute getProgressReport_PeriodStart();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.ProgressReport#getPeriodEnd <em>Period End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period End</em>'.
	 * @see org.nasdanika.tracker.ProgressReport#getPeriodEnd()
	 * @see #getProgressReport()
	 * @generated
	 */
	EAttribute getProgressReport_PeriodEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.ProgressReport#getTimeSpent <em>Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Spent</em>'.
	 * @see org.nasdanika.tracker.ProgressReport#getTimeSpent()
	 * @see #getProgressReport()
	 * @generated
	 */
	EAttribute getProgressReport_TimeSpent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.ProgressReport#getRemainingEffort <em>Remaining Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Effort</em>'.
	 * @see org.nasdanika.tracker.ProgressReport#getRemainingEffort()
	 * @see #getProgressReport()
	 * @generated
	 */
	EAttribute getProgressReport_RemainingEffort();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see org.nasdanika.tracker.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Capability#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.Capability#getName()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Capability#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Capability#getDescription()
	 * @see #getCapability()
	 * @generated
	 */
	EAttribute getCapability_Description();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.nasdanika.tracker.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Requirement#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capability</em>'.
	 * @see org.nasdanika.tracker.Requirement#getCapability()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Capability();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Requirement#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.tracker.Requirement#isOptional()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Optional();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Knowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge</em>'.
	 * @see org.nasdanika.tracker.Knowledge
	 * @generated
	 */
	EClass getKnowledge();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.tracker.Knowledge#getExperts <em>Experts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Experts</em>'.
	 * @see org.nasdanika.tracker.Knowledge#getExperts()
	 * @see #getKnowledge()
	 * @generated
	 */
	EReference getKnowledge_Experts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see org.nasdanika.tracker.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Availability#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Increment</em>'.
	 * @see org.nasdanika.tracker.Availability#getIncrement()
	 * @see #getAvailability()
	 * @generated
	 */
	EReference getAvailability_Increment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Availability#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see org.nasdanika.tracker.Availability#getAvailability()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Availability();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Availability#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.nasdanika.tracker.Availability#getComment()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Comment();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see org.nasdanika.tracker.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Technology#getReleases <em>Releases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Releases</em>'.
	 * @see org.nasdanika.tracker.Technology#getReleases()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Releases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.tracker.Technology#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.nasdanika.tracker.Technology#getChildren()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Children();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.nasdanika.tracker.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see org.nasdanika.tracker.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Skill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.nasdanika.tracker.Skill#getLevel()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.Skill#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.Skill#getDescription()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Description();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.Skill#getKnowledge <em>Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Knowledge</em>'.
	 * @see org.nasdanika.tracker.Skill#getKnowledge()
	 * @see #getSkill()
	 * @generated
	 */
	EReference getSkill_Knowledge();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.tracker.IssueRelationshipBlockingDirection <em>Issue Relationship Blocking Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Relationship Blocking Direction</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipBlockingDirection
	 * @generated
	 */
	EEnum getIssueRelationshipBlockingDirection();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.tracker.SkillLevel <em>Skill Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Skill Level</em>'.
	 * @see org.nasdanika.tracker.SkillLevel
	 * @generated
	 */
	EEnum getSkillLevel();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.tracker.IssueRelationshipType <em>Issue Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Relationship Type</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipType
	 * @generated
	 */
	EClass getIssueRelationshipType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueRelationshipType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipType#getName()
	 * @see #getIssueRelationshipType()
	 * @generated
	 */
	EAttribute getIssueRelationshipType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueRelationshipType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipType#getDescription()
	 * @see #getIssueRelationshipType()
	 * @generated
	 */
	EAttribute getIssueRelationshipType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.tracker.IssueRelationshipType#getBlockingDirection <em>Blocking Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Direction</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipType#getBlockingDirection()
	 * @see #getIssueRelationshipType()
	 * @generated
	 */
	EAttribute getIssueRelationshipType_BlockingDirection();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.tracker.IssueRelationshipType#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see org.nasdanika.tracker.IssueRelationshipType#getOpposite()
	 * @see #getIssueRelationshipType()
	 * @generated
	 */
	EReference getIssueRelationshipType_Opposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrackerFactory getTrackerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.TrackerImpl <em>Tracker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.TrackerImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getTracker()
		 * @generated
		 */
		EClass TRACKER = eINSTANCE.getTracker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKER__NAME = eINSTANCE.getTracker_Name();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKER__USERS = eINSTANCE.getTracker_Users();

		/**
		 * The meta object literal for the '<em><b>Auto Create Users</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKER__AUTO_CREATE_USERS = eINSTANCE.getTracker_AutoCreateUsers();

		/**
		 * The meta object literal for the '<em><b>Organizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACKER__ORGANIZATIONS = eINSTANCE.getTracker_Organizations();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACKER__DESCRIPTION = eINSTANCE.getTracker_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.UserImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();

		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_EMail();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__COMMENT = eINSTANCE.getUser_Comment();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__URL = eINSTANCE.getUser_Url();

		/**
		 * The meta object literal for the '<em><b>Avatar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AVATAR = eINSTANCE.getUser_Avatar();

		/**
		 * The meta object literal for the '<em><b>Timezone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__TIMEZONE = eINSTANCE.getUser_Timezone();

		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__MEMBERSHIP = eINSTANCE.getUser_Membership();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.ArtifactImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__ID = eINSTANCE.getArtifact_Id();

		/**
		 * The meta object literal for the '<em><b>Group ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__GROUP_ID = eINSTANCE.getArtifact_GroupID();

		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__DEVELOPERS = eINSTANCE.getArtifact_Developers();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__MODULES = eINSTANCE.getArtifact_Modules();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ISSUES = eINSTANCE.getArtifact_Issues();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__VERSIONS = eINSTANCE.getArtifact_Versions();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__CATEGORIES = eINSTANCE.getArtifact_Categories();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ROLES = eINSTANCE.getArtifact_Roles();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__PRIVATE = eINSTANCE.getArtifact_Private();

		/**
		 * The meta object literal for the '<em><b>Issue Relationship Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ISSUE_RELATIONSHIP_TYPES = eINSTANCE.getArtifact_IssueRelationshipTypes();

		/**
		 * The meta object literal for the '<em><b>Issue Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ISSUE_STATUSES = eINSTANCE.getArtifact_IssueStatuses();

		/**
		 * The meta object literal for the '<em><b>Issue Resolutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ISSUE_RESOLUTIONS = eINSTANCE.getArtifact_IssueResolutions();

		/**
		 * The meta object literal for the '<em><b>Issue Priorities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT__ISSUE_PRIORITIES = eINSTANCE.getArtifact_IssuePriorities();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.RoleImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '<em><b>Developers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__DEVELOPERS = eINSTANCE.getRole_Developers();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.OrganizationImpl <em>Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.OrganizationImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getOrganization()
		 * @generated
		 */
		EClass ORGANIZATION = eINSTANCE.getOrganization();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__MEMBERS = eINSTANCE.getOrganization_Members();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__GROUPS = eINSTANCE.getOrganization_Groups();

		/**
		 * The meta object literal for the '<em><b>Increments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__INCREMENTS = eINSTANCE.getOrganization_Increments();

		/**
		 * The meta object literal for the '<em><b>Sites Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION__SITES_URL = eINSTANCE.getOrganization_SitesUrl();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION__TECHNOLOGIES = eINSTANCE.getOrganization_Technologies();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.GroupImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CHILDREN = eINSTANCE.getGroup_Children();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__ARTIFACTS = eINSTANCE.getGroup_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PRIVATE = eINSTANCE.getGroup_Private();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.VersionImpl <em>Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.VersionImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getVersion()
		 * @generated
		 */
		EClass VERSION = eINSTANCE.getVersion();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__NUMBER = eINSTANCE.getVersion_Number();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DESCRIPTION = eINSTANCE.getVersion_Description();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__DATE = eINSTANCE.getVersion_Date();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION__INCREMENT = eINSTANCE.getVersion_Increment();

		/**
		 * The meta object literal for the '<em><b>Released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION__RELEASED = eINSTANCE.getVersion_Released();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.CategoryImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__ASSIGNED_TO = eINSTANCE.getCategory_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssueImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Reporter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__REPORTER = eINSTANCE.getIssue_Reporter();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CATEGORY = eINSTANCE.getIssue_Category();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUMMARY = eINSTANCE.getIssue_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Artifact Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ARTIFACT_VERSION = eINSTANCE.getIssue_ArtifactVersion();

		/**
		 * The meta object literal for the '<em><b>Target Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__TARGET_VERSION = eINSTANCE.getIssue_TargetVersion();

		/**
		 * The meta object literal for the '<em><b>Fixed In Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__FIXED_IN_VERSION = eINSTANCE.getIssue_FixedInVersion();

		/**
		 * The meta object literal for the '<em><b>Outbound Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__OUTBOUND_RELATIONSHIPS = eINSTANCE.getIssue_OutboundRelationships();

		/**
		 * The meta object literal for the '<em><b>Inbound Relationships</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__INBOUND_RELATIONSHIPS = eINSTANCE.getIssue_InboundRelationships();

		/**
		 * The meta object literal for the '<em><b>Assigned To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNED_TO = eINSTANCE.getIssue_AssignedTo();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__NOTES = eINSTANCE.getIssue_Notes();

		/**
		 * The meta object literal for the '<em><b>Subscribers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__SUBSCRIBERS = eINSTANCE.getIssue_Subscribers();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__CHILDREN = eINSTANCE.getIssue_Children();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__PRIVATE = eINSTANCE.getIssue_Private();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__STATUS = eINSTANCE.getIssue_Status();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__RESOLUTION = eINSTANCE.getIssue_Resolution();

		/**
		 * The meta object literal for the '<em><b>Submitted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUBMITTED = eINSTANCE.getIssue_Submitted();

		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LAST_UPDATE = eINSTANCE.getIssue_LastUpdate();

		/**
		 * The meta object literal for the '<em><b>Estimated Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ESTIMATED_EFFORT = eINSTANCE.getIssue_EstimatedEffort();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__REQUIREMENTS = eINSTANCE.getIssue_Requirements();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IncrementImpl <em>Increment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IncrementImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIncrement()
		 * @generated
		 */
		EClass INCREMENT = eINSTANCE.getIncrement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT__NAME = eINSTANCE.getIncrement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT__DESCRIPTION = eINSTANCE.getIncrement_Description();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__VERSIONS = eINSTANCE.getIncrement_Versions();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCREMENT__CHILDREN = eINSTANCE.getIncrement_Children();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT__START = eINSTANCE.getIncrement_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENT__END = eINSTANCE.getIncrement_End();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.OrganizationMemberImpl <em>Organization Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.OrganizationMemberImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getOrganizationMember()
		 * @generated
		 */
		EClass ORGANIZATION_MEMBER = eINSTANCE.getOrganizationMember();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MEMBER__USER = eINSTANCE.getOrganizationMember_User();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MEMBER__ROLES = eINSTANCE.getOrganizationMember_Roles();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MEMBER__AVAILABILITY = eINSTANCE.getOrganizationMember_Availability();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORGANIZATION_MEMBER__SKILLS = eINSTANCE.getOrganizationMember_Skills();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANIZATION_MEMBER__DESCRIPTION = eINSTANCE.getOrganizationMember_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.DeveloperImpl <em>Developer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.DeveloperImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getDeveloper()
		 * @generated
		 */
		EClass DEVELOPER = eINSTANCE.getDeveloper();

		/**
		 * The meta object literal for the '<em><b>Organization Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__ORGANIZATION_MEMBER = eINSTANCE.getDeveloper_OrganizationMember();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVELOPER__ROLES = eINSTANCE.getDeveloper_Roles();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVELOPER__DESCRIPTION = eINSTANCE.getDeveloper_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssueRelationshipImpl <em>Issue Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssueRelationshipImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationship()
		 * @generated
		 */
		EClass ISSUE_RELATIONSHIP = eINSTANCE.getIssueRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_RELATIONSHIP__TARGET = eINSTANCE.getIssueRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_RELATIONSHIP__TYPE = eINSTANCE.getIssueRelationship_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RELATIONSHIP__DESCRIPTION = eINSTANCE.getIssueRelationship_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssueStatusImpl <em>Issue Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssueStatusImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueStatus()
		 * @generated
		 */
		EClass ISSUE_STATUS = eINSTANCE.getIssueStatus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_STATUS__NAME = eINSTANCE.getIssueStatus_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_STATUS__DESCRIPTION = eINSTANCE.getIssueStatus_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssueResolutionImpl <em>Issue Resolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssueResolutionImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueResolution()
		 * @generated
		 */
		EClass ISSUE_RESOLUTION = eINSTANCE.getIssueResolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RESOLUTION__NAME = eINSTANCE.getIssueResolution_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RESOLUTION__DESCRIPTION = eINSTANCE.getIssueResolution_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssuePriorityImpl <em>Issue Priority</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssuePriorityImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssuePriority()
		 * @generated
		 */
		EClass ISSUE_PRIORITY = eINSTANCE.getIssuePriority();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_PRIORITY__NAME = eINSTANCE.getIssuePriority_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_PRIORITY__DESCRIPTION = eINSTANCE.getIssuePriority_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.NoteImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Developer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__DEVELOPER = eINSTANCE.getNote_Developer();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__COMMENT = eINSTANCE.getNote_Comment();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DATE = eINSTANCE.getNote_Date();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__PRIVATE = eINSTANCE.getNote_Private();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.ProgressReportImpl <em>Progress Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.ProgressReportImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getProgressReport()
		 * @generated
		 */
		EClass PROGRESS_REPORT = eINSTANCE.getProgressReport();

		/**
		 * The meta object literal for the '<em><b>Period Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_REPORT__PERIOD_START = eINSTANCE.getProgressReport_PeriodStart();

		/**
		 * The meta object literal for the '<em><b>Period End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_REPORT__PERIOD_END = eINSTANCE.getProgressReport_PeriodEnd();

		/**
		 * The meta object literal for the '<em><b>Time Spent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_REPORT__TIME_SPENT = eINSTANCE.getProgressReport_TimeSpent();

		/**
		 * The meta object literal for the '<em><b>Remaining Effort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRESS_REPORT__REMAINING_EFFORT = eINSTANCE.getProgressReport_RemainingEffort();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.CapabilityImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPABILITY__DESCRIPTION = eINSTANCE.getCapability_Description();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.RequirementImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CAPABILITY = eINSTANCE.getRequirement_Capability();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__OPTIONAL = eINSTANCE.getRequirement_Optional();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.KnowledgeImpl <em>Knowledge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.KnowledgeImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getKnowledge()
		 * @generated
		 */
		EClass KNOWLEDGE = eINSTANCE.getKnowledge();

		/**
		 * The meta object literal for the '<em><b>Experts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KNOWLEDGE__EXPERTS = eINSTANCE.getKnowledge_Experts();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.AvailabilityImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AVAILABILITY__INCREMENT = eINSTANCE.getAvailability_Increment();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__AVAILABILITY = eINSTANCE.getAvailability_Availability();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__COMMENT = eINSTANCE.getAvailability_Comment();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.TechnologyImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Releases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__RELEASES = eINSTANCE.getTechnology_Releases();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__CHILDREN = eINSTANCE.getTechnology_Children();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.ReleaseImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.SkillImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__LEVEL = eINSTANCE.getSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__DESCRIPTION = eINSTANCE.getSkill_Description();

		/**
		 * The meta object literal for the '<em><b>Knowledge</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL__KNOWLEDGE = eINSTANCE.getSkill_Knowledge();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.IssueRelationshipBlockingDirection <em>Issue Relationship Blocking Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.IssueRelationshipBlockingDirection
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationshipBlockingDirection()
		 * @generated
		 */
		EEnum ISSUE_RELATIONSHIP_BLOCKING_DIRECTION = eINSTANCE.getIssueRelationshipBlockingDirection();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.SkillLevel <em>Skill Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.SkillLevel
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getSkillLevel()
		 * @generated
		 */
		EEnum SKILL_LEVEL = eINSTANCE.getSkillLevel();

		/**
		 * The meta object literal for the '{@link org.nasdanika.tracker.impl.IssueRelationshipTypeImpl <em>Issue Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.tracker.impl.IssueRelationshipTypeImpl
		 * @see org.nasdanika.tracker.impl.TrackerPackageImpl#getIssueRelationshipType()
		 * @generated
		 */
		EClass ISSUE_RELATIONSHIP_TYPE = eINSTANCE.getIssueRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RELATIONSHIP_TYPE__NAME = eINSTANCE.getIssueRelationshipType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RELATIONSHIP_TYPE__DESCRIPTION = eINSTANCE.getIssueRelationshipType_Description();

		/**
		 * The meta object literal for the '<em><b>Blocking Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_RELATIONSHIP_TYPE__BLOCKING_DIRECTION = eINSTANCE.getIssueRelationshipType_BlockingDirection();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_RELATIONSHIP_TYPE__OPPOSITE = eINSTANCE.getIssueRelationshipType_Opposite();

	}

} //TrackerPackage
