/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorID <em>Instructor ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorName <em>Instructor Name</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getInstructor()
 * @model
 * @generated
 */
public interface Instructor extends User {
	/**
	 * Returns the value of the '<em><b>Instructor ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructor ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructor ID</em>' attribute.
	 * @see #setInstructorID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getInstructor_InstructorID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstructorID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorID <em>Instructor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructor ID</em>' attribute.
	 * @see #getInstructorID()
	 * @generated
	 */
	void setInstructorID(String value);

	/**
	 * Returns the value of the '<em><b>Instructor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructor Name</em>' attribute.
	 * @see #setInstructorName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getInstructor_InstructorName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstructorName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Instructor#getInstructorName <em>Instructor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructor Name</em>' attribute.
	 * @see #getInstructorName()
	 * @generated
	 */
	void setInstructorName(String value);

} // Instructor
