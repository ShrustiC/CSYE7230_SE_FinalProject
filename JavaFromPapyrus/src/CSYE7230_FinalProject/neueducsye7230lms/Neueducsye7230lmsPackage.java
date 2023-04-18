/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='neu.edu.csye7230.lms'"
 * @generated
 */
public interface Neueducsye7230lmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "neueducsye7230lms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CSYE7230_FinalProject/neueducsye7230lms.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSYE7230_FinalProject.neueducsye7230lms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Neueducsye7230lmsPackage eINSTANCE = CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.DomainImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Domian ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMIAN_ID = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>School ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__SCHOOL_ID = 0;

	/**
	 * The feature id for the '<em><b>School Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__SCHOOL_NAME = 1;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 2;

	/**
	 * The feature id for the '<em><b>Assessment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Assessment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ASSESSMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.ResourceImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Resource ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__LINK = 3;

	/**
	 * The feature id for the '<em><b>Resource Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__RESOURCE_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CourseImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 4;

	/**
	 * The feature id for the '<em><b>Course ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_ID = 0;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Ta</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TA = 5;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.Role <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 7;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ROLE_ID = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PASSWORD = 2;

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
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getUser()
	 * @generated
	 */
	int USER = 6;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ROLE_ID = ROLE__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = ROLE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = ROLE__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_ID = ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__REGISTRATION_DATE = ROLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATUS = ROLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = ROLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTACT = ROLE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ROLE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl <em>TA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getTA()
	 * @generated
	 */
	int TA = 5;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__ROLE_ID = USER__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__USER_TYPE = USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__CONTACT = USER__CONTACT;

	/**
	 * The feature id for the '<em><b>Ta ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__TA_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ta Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA__TA_NAME = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TA_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.JobPostingImpl <em>Job Posting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.JobPostingImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getJobPosting()
	 * @generated
	 */
	int JOB_POSTING = 8;

	/**
	 * The feature id for the '<em><b>Job ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_POSTING__JOB_ID = 0;

	/**
	 * The feature id for the '<em><b>Job Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_POSTING__JOB_NAME = 1;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_POSTING__LEVEL = 2;

	/**
	 * The number of structural features of the '<em>Job Posting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_POSTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Job Posting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_POSTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.GradeImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 9;

	/**
	 * The feature id for the '<em><b>Grade ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__GRADE_ID = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__GRADE = 1;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl <em>Certificate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCertificate()
	 * @generated
	 */
	int CERTIFICATE = 10;

	/**
	 * The feature id for the '<em><b>Certificate ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__CERTIFICATE_ID = 0;

	/**
	 * The feature id for the '<em><b>Certificate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__CERTIFICATE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE__ISSUE_DATE = 2;

	/**
	 * The number of structural features of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Certificate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CERTIFICATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CourseSingletonFactoryImpl <em>Course Singleton Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CourseSingletonFactoryImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCourseSingletonFactory()
	 * @generated
	 */
	int COURSE_SINGLETON_FACTORY = 11;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SINGLETON_FACTORY__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Course Singleton Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SINGLETON_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Course</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SINGLETON_FACTORY___GET_COURSE = 0;

	/**
	 * The number of operations of the '<em>Course Singleton Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_SINGLETON_FACTORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl <em>Instructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getInstructor()
	 * @generated
	 */
	int INSTRUCTOR = 12;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__ROLE_ID = USER__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__USER_TYPE = USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__CONTACT = USER__CONTACT;

	/**
	 * The feature id for the '<em><b>Instructor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__INSTRUCTOR_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR__INSTRUCTOR_NAME = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl <em>Enrollment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getEnrollment()
	 * @generated
	 */
	int ENROLLMENT = 13;

	/**
	 * The feature id for the '<em><b>Enrollment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__ENROLLMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Enrolled On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__ENROLLED_ON = 1;

	/**
	 * The number of structural features of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl <em>Company</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCompany()
	 * @generated
	 */
	int COMPANY = 14;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__ROLE_ID = USER__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__USER_TYPE = USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__CONTACT = USER__CONTACT;

	/**
	 * The feature id for the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__COMPANY_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY__COMPANY_NAME = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Company</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPANY_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl <em>Recruiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getRecruiter()
	 * @generated
	 */
	int RECRUITER = 15;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__ROLE_ID = USER__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__USER_TYPE = USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__CONTACT = USER__CONTACT;

	/**
	 * The feature id for the '<em><b>Recuiter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__RECUITER_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Recruiter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER__RECRUITER_NAME = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Recruiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Recruiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECRUITER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 16;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ROLE_ID = USER__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__USER_ID = USER__USER_ID;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__REGISTRATION_DATE = USER__REGISTRATION_DATE;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__USER_TYPE = USER__USER_TYPE;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__CONTACT = USER__CONTACT;

	/**
	 * The feature id for the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_ID = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STUDENT_NAME = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>University</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__UNIVERSITY = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__MAJOR = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enrolled Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ENROLLED_COURSES = USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complete Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__COMPLETE_COURSES = USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = USER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AdminImpl <em>Admin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.AdminImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getAdmin()
	 * @generated
	 */
	int ADMIN = 17;

	/**
	 * The feature id for the '<em><b>Role ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ROLE_ID = ROLE__ROLE_ID;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__USER_NAME = ROLE__USER_NAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__PASSWORD = ROLE__PASSWORD;

	/**
	 * The feature id for the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN__ADMIN_ID = ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_FEATURE_COUNT = ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Admin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_OPERATION_COUNT = ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI <em>Payment API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentAPI()
	 * @generated
	 */
	int PAYMENT_API = 18;

	/**
	 * The feature id for the '<em><b>Payment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_API__PAYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Payement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_API__PAYEMENT_DATE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_API__AMOUNT = 2;

	/**
	 * The number of structural features of the '<em>Payment API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_API_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payment API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.OnlinePaymentImpl <em>Online Payment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.OnlinePaymentImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getOnlinePayment()
	 * @generated
	 */
	int ONLINE_PAYMENT = 19;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT__PAYMENT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Online Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Online Payment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONLINE_PAYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.ChequeImpl <em>Cheque</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.ChequeImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCheque()
	 * @generated
	 */
	int CHEQUE = 20;

	/**
	 * The feature id for the '<em><b>Cheque ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__CHEQUE_ID = 0;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE__VALID_UNTIL = 1;

	/**
	 * The number of structural features of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cheque</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHEQUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.PaymentStrategyImpl <em>Payment Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.PaymentStrategyImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentStrategy()
	 * @generated
	 */
	int PAYMENT_STRATEGY = 21;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY__STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Payment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Payment Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentSingletonFactoryImpl <em>Student Singleton Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.StudentSingletonFactoryImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getStudentSingletonFactory()
	 * @generated
	 */
	int STUDENT_SINGLETON_FACTORY = 22;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_SINGLETON_FACTORY__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Student Singleton Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_SINGLETON_FACTORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Student</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_SINGLETON_FACTORY___GET_STUDENT = 0;

	/**
	 * The number of operations of the '<em>Student Singleton Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_SINGLETON_FACTORY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.EventImpl
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 23;

	/**
	 * The feature id for the '<em><b>Event ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__END_TIME = 3;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentType <em>Payment Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentType
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentType()
	 * @generated
	 */
	int PAYMENT_TYPE = 24;

	/**
	 * The meta object id for the '{@link CSYE7230_FinalProject.neueducsye7230lms.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSYE7230_FinalProject.neueducsye7230lms.UserType
	 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomianID <em>Domian ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domian ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomianID()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_DomianID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Domain#getDomainName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_DomainName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Domain#getDescription()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Description();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolID <em>School ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolID()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_SchoolID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolName <em>School Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_SchoolName();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Assessment#getAssessmentID <em>Assessment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Assessment#getAssessmentID()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_AssessmentID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Assessment#getAssessmentName <em>Assessment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessment Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Assessment#getAssessmentName()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_AssessmentName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Assessment#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Assessment#getDescription()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Description();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceID <em>Resource ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceID()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource#getDescription()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Description();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource#getLink()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Link();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceType <em>Resource Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource#getResourceType()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_ResourceType();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getCourseID <em>Course ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getCourseID()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Description();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getPrice()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Price();

	/**
	 * Returns the meta object for the reference list '{@link CSYE7230_FinalProject.neueducsye7230lms.Course#getTa <em>Ta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ta</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course#getTa()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Ta();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.TA <em>TA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TA</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.TA
	 * @generated
	 */
	EClass getTA();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaID <em>Ta ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ta ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.TA#getTaID()
	 * @see #getTA()
	 * @generated
	 */
	EAttribute getTA_TaID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaName <em>Ta Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ta Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.TA#getTaName()
	 * @see #getTA()
	 * @generated
	 */
	EAttribute getTA_TaName();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserID <em>User ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getUserID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getRegistrationDate <em>Registration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Date</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getRegistrationDate()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_RegistrationDate();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getStatus()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Status();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User#getContact()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Contact();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Role#getRoleID <em>Role ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role#getRoleID()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_RoleID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Role#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role#getUserName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_UserName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Role#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role#getPassword()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Password();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.JobPosting <em>Job Posting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job Posting</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.JobPosting
	 * @generated
	 */
	EClass getJobPosting();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getJobID <em>Job ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getJobID()
	 * @see #getJobPosting()
	 * @generated
	 */
	EAttribute getJobPosting_JobID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getJobName <em>Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getJobName()
	 * @see #getJobPosting()
	 * @generated
	 */
	EAttribute getJobPosting_JobName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.JobPosting#getLevel()
	 * @see #getJobPosting()
	 * @generated
	 */
	EAttribute getJobPosting_Level();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Grade#getGradeID <em>Grade ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Grade#getGradeID()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_GradeID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Grade#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Grade#getGrade()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Grade();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Certificate</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Certificate
	 * @generated
	 */
	EClass getCertificate();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateID <em>Certificate ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateID()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_CertificateID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateName <em>Certificate Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Certificate Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateName()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_CertificateName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Certificate#getIssueDate()
	 * @see #getCertificate()
	 * @generated
	 */
	EAttribute getCertificate_IssueDate();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory <em>Course Singleton Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Singleton Factory</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory
	 * @generated
	 */
	EClass getCourseSingletonFactory();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory#getInstance()
	 * @see #getCourseSingletonFactory()
	 * @generated
	 */
	EAttribute getCourseSingletonFactory_Instance();

	/**
	 * Returns the meta object for the '{@link CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory#getCourse() <em>Get Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Course</em>' operation.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory#getCourse()
	 * @generated
	 */
	EOperation getCourseSingletonFactory__GetCourse();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructor</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Instructor
	 * @generated
	 */
	EClass getInstructor();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorID <em>Instructor ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructor ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorID()
	 * @see #getInstructor()
	 * @generated
	 */
	EAttribute getInstructor_InstructorID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorName <em>Instructor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instructor Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorName()
	 * @see #getInstructor()
	 * @generated
	 */
	EAttribute getInstructor_InstructorName();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrollment</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Enrollment
	 * @generated
	 */
	EClass getEnrollment();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrollmentID <em>Enrollment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enrollment ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrollmentID()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_EnrollmentID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrolledOn <em>Enrolled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enrolled On</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrolledOn()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_EnrolledOn();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Company</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Company
	 * @generated
	 */
	EClass getCompany();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyID <em>Company ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyID()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_CompanyID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyName()
	 * @see #getCompany()
	 * @generated
	 */
	EAttribute getCompany_CompanyName();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter <em>Recruiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recruiter</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Recruiter
	 * @generated
	 */
	EClass getRecruiter();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecuiterID <em>Recuiter ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recuiter ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecuiterID()
	 * @see #getRecruiter()
	 * @generated
	 */
	EAttribute getRecruiter_RecuiterID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecruiterName <em>Recruiter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recruiter Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecruiterName()
	 * @see #getRecruiter()
	 * @generated
	 */
	EAttribute getRecruiter_RecruiterName();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentID <em>Student ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentID()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentName <em>Student Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Student Name</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_StudentName();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getUniversity <em>University</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>University</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getUniversity()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_University();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getMajor()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Major();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getEnrolledCourses <em>Enrolled Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enrolled Courses</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getEnrolledCourses()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_EnrolledCourses();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getCompleteCourses <em>Complete Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complete Courses</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student#getCompleteCourses()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_CompleteCourses();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Admin
	 * @generated
	 */
	EClass getAdmin();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Admin#getAdminID <em>Admin ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Admin ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Admin#getAdminID()
	 * @see #getAdmin()
	 * @generated
	 */
	EAttribute getAdmin_AdminID();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI <em>Payment API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment API</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI
	 * @generated
	 */
	EClass getPaymentAPI();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPaymentID <em>Payment ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPaymentID()
	 * @see #getPaymentAPI()
	 * @generated
	 */
	EAttribute getPaymentAPI_PaymentID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPayementDate <em>Payement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payement Date</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPayementDate()
	 * @see #getPaymentAPI()
	 * @generated
	 */
	EAttribute getPaymentAPI_PayementDate();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getAmount()
	 * @see #getPaymentAPI()
	 * @generated
	 */
	EAttribute getPaymentAPI_Amount();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment <em>Online Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Online Payment</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment
	 * @generated
	 */
	EClass getOnlinePayment();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment#getPaymentType()
	 * @see #getOnlinePayment()
	 * @generated
	 */
	EAttribute getOnlinePayment_PaymentType();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cheque</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Cheque
	 * @generated
	 */
	EClass getCheque();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Cheque#getChequeID <em>Cheque ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cheque ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Cheque#getChequeID()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_ChequeID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Cheque#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Cheque#getValidUntil()
	 * @see #getCheque()
	 * @generated
	 */
	EAttribute getCheque_ValidUntil();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy <em>Payment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Strategy</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy
	 * @generated
	 */
	EClass getPaymentStrategy();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy#getStrategy()
	 * @see #getPaymentStrategy()
	 * @generated
	 */
	EAttribute getPaymentStrategy_Strategy();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory <em>Student Singleton Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student Singleton Factory</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory
	 * @generated
	 */
	EClass getStudentSingletonFactory();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory#getInstance()
	 * @see #getStudentSingletonFactory()
	 * @generated
	 */
	EAttribute getStudentSingletonFactory_Instance();

	/**
	 * Returns the meta object for the '{@link CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory#getStudent() <em>Get Student</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Student</em>' operation.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory#getStudent()
	 * @generated
	 */
	EOperation getStudentSingletonFactory__GetStudent();

	/**
	 * Returns the meta object for class '{@link CSYE7230_FinalProject.neueducsye7230lms.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Event#getEventID <em>Event ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event ID</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event#getEventID()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventID();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Event#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event#getEventType()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EventType();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Event#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event#getStartTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link CSYE7230_FinalProject.neueducsye7230lms.Event#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event#getEndTime()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_EndTime();

	/**
	 * Returns the meta object for enum '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Payment Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentType
	 * @generated
	 */
	EEnum getPaymentType();

	/**
	 * Returns the meta object for enum '{@link CSYE7230_FinalProject.neueducsye7230lms.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.UserType
	 * @generated
	 */
	EEnum getUserType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Neueducsye7230lmsFactory getNeueducsye7230lmsFactory();

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
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.DomainImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Domian ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DOMIAN_ID = eINSTANCE.getDomain_DomianID();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DOMAIN_NAME = eINSTANCE.getDomain_DomainName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>School ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__SCHOOL_ID = eINSTANCE.getSchool_SchoolID();

		/**
		 * The meta object literal for the '<em><b>School Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__SCHOOL_NAME = eINSTANCE.getSchool_SchoolName();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>Assessment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__ASSESSMENT_ID = eINSTANCE.getAssessment_AssessmentID();

		/**
		 * The meta object literal for the '<em><b>Assessment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__ASSESSMENT_NAME = eINSTANCE.getAssessment_AssessmentName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__DESCRIPTION = eINSTANCE.getAssessment_Description();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.ResourceImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Resource ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_ID = eINSTANCE.getResource_ResourceID();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_NAME = eINSTANCE.getResource_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__DESCRIPTION = eINSTANCE.getResource_Description();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__LINK = eINSTANCE.getResource_Link();

		/**
		 * The meta object literal for the '<em><b>Resource Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__RESOURCE_TYPE = eINSTANCE.getResource_ResourceType();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CourseImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_ID = eINSTANCE.getCourse_CourseID();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DESCRIPTION = eINSTANCE.getCourse_Description();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__PRICE = eINSTANCE.getCourse_Price();

		/**
		 * The meta object literal for the '<em><b>Ta</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__TA = eINSTANCE.getCourse_Ta();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl <em>TA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getTA()
		 * @generated
		 */
		EClass TA = eINSTANCE.getTA();

		/**
		 * The meta object literal for the '<em><b>Ta ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TA__TA_ID = eINSTANCE.getTA_TaID();

		/**
		 * The meta object literal for the '<em><b>Ta Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TA__TA_NAME = eINSTANCE.getTA_TaName();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>User ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_ID = eINSTANCE.getUser_UserID();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Registration Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__REGISTRATION_DATE = eINSTANCE.getUser_RegistrationDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__STATUS = eINSTANCE.getUser_Status();

		/**
		 * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_TYPE = eINSTANCE.getUser_UserType();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CONTACT = eINSTANCE.getUser_Contact();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.Role <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.Role
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Role ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ROLE_ID = eINSTANCE.getRole_RoleID();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__USER_NAME = eINSTANCE.getRole_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__PASSWORD = eINSTANCE.getRole_Password();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.JobPostingImpl <em>Job Posting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.JobPostingImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getJobPosting()
		 * @generated
		 */
		EClass JOB_POSTING = eINSTANCE.getJobPosting();

		/**
		 * The meta object literal for the '<em><b>Job ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_POSTING__JOB_ID = eINSTANCE.getJobPosting_JobID();

		/**
		 * The meta object literal for the '<em><b>Job Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_POSTING__JOB_NAME = eINSTANCE.getJobPosting_JobName();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB_POSTING__LEVEL = eINSTANCE.getJobPosting_Level();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.GradeImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>Grade ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__GRADE_ID = eINSTANCE.getGrade_GradeID();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__GRADE = eINSTANCE.getGrade_Grade();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl <em>Certificate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCertificate()
		 * @generated
		 */
		EClass CERTIFICATE = eINSTANCE.getCertificate();

		/**
		 * The meta object literal for the '<em><b>Certificate ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__CERTIFICATE_ID = eINSTANCE.getCertificate_CertificateID();

		/**
		 * The meta object literal for the '<em><b>Certificate Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__CERTIFICATE_NAME = eINSTANCE.getCertificate_CertificateName();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CERTIFICATE__ISSUE_DATE = eINSTANCE.getCertificate_IssueDate();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CourseSingletonFactoryImpl <em>Course Singleton Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CourseSingletonFactoryImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCourseSingletonFactory()
		 * @generated
		 */
		EClass COURSE_SINGLETON_FACTORY = eINSTANCE.getCourseSingletonFactory();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_SINGLETON_FACTORY__INSTANCE = eINSTANCE.getCourseSingletonFactory_Instance();

		/**
		 * The meta object literal for the '<em><b>Get Course</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE_SINGLETON_FACTORY___GET_COURSE = eINSTANCE.getCourseSingletonFactory__GetCourse();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl <em>Instructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getInstructor()
		 * @generated
		 */
		EClass INSTRUCTOR = eINSTANCE.getInstructor();

		/**
		 * The meta object literal for the '<em><b>Instructor ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTOR__INSTRUCTOR_ID = eINSTANCE.getInstructor_InstructorID();

		/**
		 * The meta object literal for the '<em><b>Instructor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTOR__INSTRUCTOR_NAME = eINSTANCE.getInstructor_InstructorName();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl <em>Enrollment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getEnrollment()
		 * @generated
		 */
		EClass ENROLLMENT = eINSTANCE.getEnrollment();

		/**
		 * The meta object literal for the '<em><b>Enrollment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__ENROLLMENT_ID = eINSTANCE.getEnrollment_EnrollmentID();

		/**
		 * The meta object literal for the '<em><b>Enrolled On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__ENROLLED_ON = eINSTANCE.getEnrollment_EnrolledOn();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl <em>Company</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCompany()
		 * @generated
		 */
		EClass COMPANY = eINSTANCE.getCompany();

		/**
		 * The meta object literal for the '<em><b>Company ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__COMPANY_ID = eINSTANCE.getCompany_CompanyID();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPANY__COMPANY_NAME = eINSTANCE.getCompany_CompanyName();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl <em>Recruiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getRecruiter()
		 * @generated
		 */
		EClass RECRUITER = eINSTANCE.getRecruiter();

		/**
		 * The meta object literal for the '<em><b>Recuiter ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECRUITER__RECUITER_ID = eINSTANCE.getRecruiter_RecuiterID();

		/**
		 * The meta object literal for the '<em><b>Recruiter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECRUITER__RECRUITER_NAME = eINSTANCE.getRecruiter_RecruiterName();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Student ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_ID = eINSTANCE.getStudent_StudentID();

		/**
		 * The meta object literal for the '<em><b>Student Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STUDENT_NAME = eINSTANCE.getStudent_StudentName();

		/**
		 * The meta object literal for the '<em><b>University</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__UNIVERSITY = eINSTANCE.getStudent_University();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__MAJOR = eINSTANCE.getStudent_Major();

		/**
		 * The meta object literal for the '<em><b>Enrolled Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__ENROLLED_COURSES = eINSTANCE.getStudent_EnrolledCourses();

		/**
		 * The meta object literal for the '<em><b>Complete Courses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__COMPLETE_COURSES = eINSTANCE.getStudent_CompleteCourses();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AdminImpl <em>Admin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.AdminImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getAdmin()
		 * @generated
		 */
		EClass ADMIN = eINSTANCE.getAdmin();

		/**
		 * The meta object literal for the '<em><b>Admin ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN__ADMIN_ID = eINSTANCE.getAdmin_AdminID();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI <em>Payment API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentAPI()
		 * @generated
		 */
		EClass PAYMENT_API = eINSTANCE.getPaymentAPI();

		/**
		 * The meta object literal for the '<em><b>Payment ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_API__PAYMENT_ID = eINSTANCE.getPaymentAPI_PaymentID();

		/**
		 * The meta object literal for the '<em><b>Payement Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_API__PAYEMENT_DATE = eINSTANCE.getPaymentAPI_PayementDate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_API__AMOUNT = eINSTANCE.getPaymentAPI_Amount();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.OnlinePaymentImpl <em>Online Payment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.OnlinePaymentImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getOnlinePayment()
		 * @generated
		 */
		EClass ONLINE_PAYMENT = eINSTANCE.getOnlinePayment();

		/**
		 * The meta object literal for the '<em><b>Payment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONLINE_PAYMENT__PAYMENT_TYPE = eINSTANCE.getOnlinePayment_PaymentType();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.ChequeImpl <em>Cheque</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.ChequeImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getCheque()
		 * @generated
		 */
		EClass CHEQUE = eINSTANCE.getCheque();

		/**
		 * The meta object literal for the '<em><b>Cheque ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__CHEQUE_ID = eINSTANCE.getCheque_ChequeID();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHEQUE__VALID_UNTIL = eINSTANCE.getCheque_ValidUntil();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.PaymentStrategyImpl <em>Payment Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.PaymentStrategyImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentStrategy()
		 * @generated
		 */
		EClass PAYMENT_STRATEGY = eINSTANCE.getPaymentStrategy();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_STRATEGY__STRATEGY = eINSTANCE.getPaymentStrategy_Strategy();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentSingletonFactoryImpl <em>Student Singleton Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.StudentSingletonFactoryImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getStudentSingletonFactory()
		 * @generated
		 */
		EClass STUDENT_SINGLETON_FACTORY = eINSTANCE.getStudentSingletonFactory();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT_SINGLETON_FACTORY__INSTANCE = eINSTANCE.getStudentSingletonFactory_Instance();

		/**
		 * The meta object literal for the '<em><b>Get Student</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT_SINGLETON_FACTORY___GET_STUDENT = eINSTANCE.getStudentSingletonFactory__GetStudent();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.EventImpl
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Event ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_ID = eINSTANCE.getEvent_EventID();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__START_TIME = eINSTANCE.getEvent_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__END_TIME = eINSTANCE.getEvent_EndTime();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentType <em>Payment Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentType
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getPaymentType()
		 * @generated
		 */
		EEnum PAYMENT_TYPE = eINSTANCE.getPaymentType();

		/**
		 * The meta object literal for the '{@link CSYE7230_FinalProject.neueducsye7230lms.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSYE7230_FinalProject.neueducsye7230lms.UserType
		 * @see CSYE7230_FinalProject.neueducsye7230lms.impl.Neueducsye7230lmsPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //Neueducsye7230lmsPackage
