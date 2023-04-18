/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.Student;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getUniversity <em>University</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.StudentImpl#getCompleteCourses <em>Complete Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentID() <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentID()
	 * @generated
	 * @ordered
	 */
	protected String studentID = STUDENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected static final String STUDENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStudentName() <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudentName()
	 * @generated
	 * @ordered
	 */
	protected String studentName = STUDENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniversity() <em>University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversity()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIVERSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniversity() <em>University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniversity()
	 * @generated
	 * @ordered
	 */
	protected String university = UNIVERSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final String MAJOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected String major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrolledCourses() <em>Enrolled Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledCourses()
	 * @generated
	 * @ordered
	 */
	protected static final Object ENROLLED_COURSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrolledCourses() <em>Enrolled Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledCourses()
	 * @generated
	 * @ordered
	 */
	protected Object enrolledCourses = ENROLLED_COURSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteCourses() <em>Complete Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteCourses()
	 * @generated
	 * @ordered
	 */
	protected static final Object COMPLETE_COURSES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompleteCourses() <em>Complete Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteCourses()
	 * @generated
	 * @ordered
	 */
	protected Object completeCourses = COMPLETE_COURSES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentID(String newStudentID) {
		String oldStudentID = studentID;
		studentID = newStudentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__STUDENT_ID, oldStudentID, studentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudentName(String newStudentName) {
		String oldStudentName = studentName;
		studentName = newStudentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__STUDENT_NAME, oldStudentName, studentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniversity() {
		return university;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniversity(String newUniversity) {
		String oldUniversity = university;
		university = newUniversity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__UNIVERSITY, oldUniversity, university));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(String newMajor) {
		String oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEnrolledCourses() {
		return enrolledCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrolledCourses(Object newEnrolledCourses) {
		Object oldEnrolledCourses = enrolledCourses;
		enrolledCourses = newEnrolledCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__ENROLLED_COURSES, oldEnrolledCourses, enrolledCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCompleteCourses() {
		return completeCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteCourses(Object newCompleteCourses) {
		Object oldCompleteCourses = completeCourses;
		completeCourses = newCompleteCourses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.STUDENT__COMPLETE_COURSES, oldCompleteCourses, completeCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_ID:
				return getStudentID();
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_NAME:
				return getStudentName();
			case Neueducsye7230lmsPackage.STUDENT__UNIVERSITY:
				return getUniversity();
			case Neueducsye7230lmsPackage.STUDENT__MAJOR:
				return getMajor();
			case Neueducsye7230lmsPackage.STUDENT__ENROLLED_COURSES:
				return getEnrolledCourses();
			case Neueducsye7230lmsPackage.STUDENT__COMPLETE_COURSES:
				return getCompleteCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_ID:
				setStudentID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_NAME:
				setStudentName((String)newValue);
				return;
			case Neueducsye7230lmsPackage.STUDENT__UNIVERSITY:
				setUniversity((String)newValue);
				return;
			case Neueducsye7230lmsPackage.STUDENT__MAJOR:
				setMajor((String)newValue);
				return;
			case Neueducsye7230lmsPackage.STUDENT__ENROLLED_COURSES:
				setEnrolledCourses(newValue);
				return;
			case Neueducsye7230lmsPackage.STUDENT__COMPLETE_COURSES:
				setCompleteCourses(newValue);
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
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_ID:
				setStudentID(STUDENT_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_NAME:
				setStudentName(STUDENT_NAME_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.STUDENT__UNIVERSITY:
				setUniversity(UNIVERSITY_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.STUDENT__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.STUDENT__ENROLLED_COURSES:
				setEnrolledCourses(ENROLLED_COURSES_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.STUDENT__COMPLETE_COURSES:
				setCompleteCourses(COMPLETE_COURSES_EDEFAULT);
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
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_ID:
				return STUDENT_ID_EDEFAULT == null ? studentID != null : !STUDENT_ID_EDEFAULT.equals(studentID);
			case Neueducsye7230lmsPackage.STUDENT__STUDENT_NAME:
				return STUDENT_NAME_EDEFAULT == null ? studentName != null : !STUDENT_NAME_EDEFAULT.equals(studentName);
			case Neueducsye7230lmsPackage.STUDENT__UNIVERSITY:
				return UNIVERSITY_EDEFAULT == null ? university != null : !UNIVERSITY_EDEFAULT.equals(university);
			case Neueducsye7230lmsPackage.STUDENT__MAJOR:
				return MAJOR_EDEFAULT == null ? major != null : !MAJOR_EDEFAULT.equals(major);
			case Neueducsye7230lmsPackage.STUDENT__ENROLLED_COURSES:
				return ENROLLED_COURSES_EDEFAULT == null ? enrolledCourses != null : !ENROLLED_COURSES_EDEFAULT.equals(enrolledCourses);
			case Neueducsye7230lmsPackage.STUDENT__COMPLETE_COURSES:
				return COMPLETE_COURSES_EDEFAULT == null ? completeCourses != null : !COMPLETE_COURSES_EDEFAULT.equals(completeCourses);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (studentID: ");
		result.append(studentID);
		result.append(", studentName: ");
		result.append(studentName);
		result.append(", university: ");
		result.append(university);
		result.append(", major: ");
		result.append(major);
		result.append(", enrolledCourses: ");
		result.append(enrolledCourses);
		result.append(", completeCourses: ");
		result.append(completeCourses);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
