/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentID <em>Student ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentName <em>Student Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getUniversity <em>University</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getMajor <em>Major</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getEnrolledCourses <em>Enrolled Courses</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getCompleteCourses <em>Complete Courses</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent()
 * @model
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Student ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student ID</em>' attribute.
	 * @see #setStudentID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_StudentID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStudentID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentID <em>Student ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student ID</em>' attribute.
	 * @see #getStudentID()
	 * @generated
	 */
	void setStudentID(String value);

	/**
	 * Returns the value of the '<em><b>Student Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Student Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student Name</em>' attribute.
	 * @see #setStudentName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_StudentName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStudentName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getStudentName <em>Student Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student Name</em>' attribute.
	 * @see #getStudentName()
	 * @generated
	 */
	void setStudentName(String value);

	/**
	 * Returns the value of the '<em><b>University</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>University</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>University</em>' attribute.
	 * @see #setUniversity(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_University()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUniversity();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getUniversity <em>University</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>University</em>' attribute.
	 * @see #getUniversity()
	 * @generated
	 */
	void setUniversity(String value);

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_Major()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getMajor();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(String value);

	/**
	 * Returns the value of the '<em><b>Enrolled Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrolled Courses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled Courses</em>' attribute.
	 * @see #setEnrolledCourses(Object)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_EnrolledCourses()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getEnrolledCourses();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getEnrolledCourses <em>Enrolled Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrolled Courses</em>' attribute.
	 * @see #getEnrolledCourses()
	 * @generated
	 */
	void setEnrolledCourses(Object value);

	/**
	 * Returns the value of the '<em><b>Complete Courses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete Courses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete Courses</em>' attribute.
	 * @see #setCompleteCourses(Object)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getStudent_CompleteCourses()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Object getCompleteCourses();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Student#getCompleteCourses <em>Complete Courses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete Courses</em>' attribute.
	 * @see #getCompleteCourses()
	 * @generated
	 */
	void setCompleteCourses(Object value);

} // Student
