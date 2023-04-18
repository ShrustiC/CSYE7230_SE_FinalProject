/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Neueducsye7230lmsFactoryImpl extends EFactoryImpl implements Neueducsye7230lmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Neueducsye7230lmsFactory init() {
		try {
			Neueducsye7230lmsFactory theNeueducsye7230lmsFactory = (Neueducsye7230lmsFactory)EPackage.Registry.INSTANCE.getEFactory(Neueducsye7230lmsPackage.eNS_URI);
			if (theNeueducsye7230lmsFactory != null) {
				return theNeueducsye7230lmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Neueducsye7230lmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neueducsye7230lmsFactoryImpl() {
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
			case Neueducsye7230lmsPackage.DOMAIN: return createDomain();
			case Neueducsye7230lmsPackage.SCHOOL: return createSchool();
			case Neueducsye7230lmsPackage.ASSESSMENT: return createAssessment();
			case Neueducsye7230lmsPackage.RESOURCE: return createResource();
			case Neueducsye7230lmsPackage.COURSE: return createCourse();
			case Neueducsye7230lmsPackage.TA: return createTA();
			case Neueducsye7230lmsPackage.USER: return createUser();
			case Neueducsye7230lmsPackage.JOB_POSTING: return createJobPosting();
			case Neueducsye7230lmsPackage.GRADE: return createGrade();
			case Neueducsye7230lmsPackage.CERTIFICATE: return createCertificate();
			case Neueducsye7230lmsPackage.COURSE_SINGLETON_FACTORY: return createCourseSingletonFactory();
			case Neueducsye7230lmsPackage.INSTRUCTOR: return createInstructor();
			case Neueducsye7230lmsPackage.ENROLLMENT: return createEnrollment();
			case Neueducsye7230lmsPackage.COMPANY: return createCompany();
			case Neueducsye7230lmsPackage.RECRUITER: return createRecruiter();
			case Neueducsye7230lmsPackage.STUDENT: return createStudent();
			case Neueducsye7230lmsPackage.ADMIN: return createAdmin();
			case Neueducsye7230lmsPackage.ONLINE_PAYMENT: return createOnlinePayment();
			case Neueducsye7230lmsPackage.CHEQUE: return createCheque();
			case Neueducsye7230lmsPackage.PAYMENT_STRATEGY: return createPaymentStrategy();
			case Neueducsye7230lmsPackage.STUDENT_SINGLETON_FACTORY: return createStudentSingletonFactory();
			case Neueducsye7230lmsPackage.EVENT: return createEvent();
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
			case Neueducsye7230lmsPackage.PAYMENT_TYPE:
				return createPaymentTypeFromString(eDataType, initialValue);
			case Neueducsye7230lmsPackage.USER_TYPE:
				return createUserTypeFromString(eDataType, initialValue);
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
			case Neueducsye7230lmsPackage.PAYMENT_TYPE:
				return convertPaymentTypeToString(eDataType, instanceValue);
			case Neueducsye7230lmsPackage.USER_TYPE:
				return convertUserTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School createSchool() {
		SchoolImpl school = new SchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TA createTA() {
		TAImpl ta = new TAImpl();
		return ta;
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
	public JobPosting createJobPosting() {
		JobPostingImpl jobPosting = new JobPostingImpl();
		return jobPosting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificate createCertificate() {
		CertificateImpl certificate = new CertificateImpl();
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseSingletonFactory createCourseSingletonFactory() {
		CourseSingletonFactoryImpl courseSingletonFactory = new CourseSingletonFactoryImpl();
		return courseSingletonFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructor createInstructor() {
		InstructorImpl instructor = new InstructorImpl();
		return instructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enrollment createEnrollment() {
		EnrollmentImpl enrollment = new EnrollmentImpl();
		return enrollment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Company createCompany() {
		CompanyImpl company = new CompanyImpl();
		return company;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Recruiter createRecruiter() {
		RecruiterImpl recruiter = new RecruiterImpl();
		return recruiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlinePayment createOnlinePayment() {
		OnlinePaymentImpl onlinePayment = new OnlinePaymentImpl();
		return onlinePayment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cheque createCheque() {
		ChequeImpl cheque = new ChequeImpl();
		return cheque;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentStrategy createPaymentStrategy() {
		PaymentStrategyImpl paymentStrategy = new PaymentStrategyImpl();
		return paymentStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudentSingletonFactory createStudentSingletonFactory() {
		StudentSingletonFactoryImpl studentSingletonFactory = new StudentSingletonFactoryImpl();
		return studentSingletonFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentType createPaymentTypeFromString(EDataType eDataType, String initialValue) {
		PaymentType result = PaymentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaymentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType createUserTypeFromString(EDataType eDataType, String initialValue) {
		UserType result = UserType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neueducsye7230lmsPackage getNeueducsye7230lmsPackage() {
		return (Neueducsye7230lmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Neueducsye7230lmsPackage getPackage() {
		return Neueducsye7230lmsPackage.eINSTANCE;
	}

} //Neueducsye7230lmsFactoryImpl
