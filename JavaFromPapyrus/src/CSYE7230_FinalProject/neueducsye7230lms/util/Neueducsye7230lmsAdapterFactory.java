/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.util;

import CSYE7230_FinalProject.neueducsye7230lms.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage
 * @generated
 */
public class Neueducsye7230lmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Neueducsye7230lmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Neueducsye7230lmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Neueducsye7230lmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Neueducsye7230lmsSwitch<Adapter> modelSwitch =
		new Neueducsye7230lmsSwitch<Adapter>() {
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseSchool(School object) {
				return createSchoolAdapter();
			}
			@Override
			public Adapter caseAssessment(Assessment object) {
				return createAssessmentAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseCourse(Course object) {
				return createCourseAdapter();
			}
			@Override
			public Adapter caseTA(TA object) {
				return createTAAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseJobPosting(JobPosting object) {
				return createJobPostingAdapter();
			}
			@Override
			public Adapter caseGrade(Grade object) {
				return createGradeAdapter();
			}
			@Override
			public Adapter caseCertificate(Certificate object) {
				return createCertificateAdapter();
			}
			@Override
			public Adapter caseCourseSingletonFactory(CourseSingletonFactory object) {
				return createCourseSingletonFactoryAdapter();
			}
			@Override
			public Adapter caseInstructor(Instructor object) {
				return createInstructorAdapter();
			}
			@Override
			public Adapter caseEnrollment(Enrollment object) {
				return createEnrollmentAdapter();
			}
			@Override
			public Adapter caseCompany(Company object) {
				return createCompanyAdapter();
			}
			@Override
			public Adapter caseRecruiter(Recruiter object) {
				return createRecruiterAdapter();
			}
			@Override
			public Adapter caseStudent(Student object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseAdmin(Admin object) {
				return createAdminAdapter();
			}
			@Override
			public Adapter casePaymentAPI(PaymentAPI object) {
				return createPaymentAPIAdapter();
			}
			@Override
			public Adapter caseOnlinePayment(OnlinePayment object) {
				return createOnlinePaymentAdapter();
			}
			@Override
			public Adapter caseCheque(Cheque object) {
				return createChequeAdapter();
			}
			@Override
			public Adapter casePaymentStrategy(PaymentStrategy object) {
				return createPaymentStrategyAdapter();
			}
			@Override
			public Adapter caseStudentSingletonFactory(StudentSingletonFactory object) {
				return createStudentSingletonFactoryAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.School
	 * @generated
	 */
	public Adapter createSchoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Assessment
	 * @generated
	 */
	public Adapter createAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Course
	 * @generated
	 */
	public Adapter createCourseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.TA <em>TA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.TA
	 * @generated
	 */
	public Adapter createTAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.JobPosting <em>Job Posting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.JobPosting
	 * @generated
	 */
	public Adapter createJobPostingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Grade
	 * @generated
	 */
	public Adapter createGradeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate <em>Certificate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Certificate
	 * @generated
	 */
	public Adapter createCertificateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory <em>Course Singleton Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.CourseSingletonFactory
	 * @generated
	 */
	public Adapter createCourseSingletonFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor <em>Instructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Instructor
	 * @generated
	 */
	public Adapter createInstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Enrollment
	 * @generated
	 */
	public Adapter createEnrollmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Company <em>Company</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Company
	 * @generated
	 */
	public Adapter createCompanyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter <em>Recruiter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Recruiter
	 * @generated
	 */
	public Adapter createRecruiterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Student
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Admin <em>Admin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Admin
	 * @generated
	 */
	public Adapter createAdminAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI <em>Payment API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI
	 * @generated
	 */
	public Adapter createPaymentAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment <em>Online Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment
	 * @generated
	 */
	public Adapter createOnlinePaymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Cheque <em>Cheque</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Cheque
	 * @generated
	 */
	public Adapter createChequeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy <em>Payment Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.PaymentStrategy
	 * @generated
	 */
	public Adapter createPaymentStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory <em>Student Singleton Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.StudentSingletonFactory
	 * @generated
	 */
	public Adapter createStudentSingletonFactoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CSYE7230_FinalProject.neueducsye7230lms.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Neueducsye7230lmsAdapterFactory
