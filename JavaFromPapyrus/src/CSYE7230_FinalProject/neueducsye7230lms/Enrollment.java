/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrollmentID <em>Enrollment ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrolledOn <em>Enrolled On</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>Enrollment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrollment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment ID</em>' attribute.
	 * @see #setEnrollmentID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getEnrollment_EnrollmentID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEnrollmentID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrollmentID <em>Enrollment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment ID</em>' attribute.
	 * @see #getEnrollmentID()
	 * @generated
	 */
	void setEnrollmentID(String value);

	/**
	 * Returns the value of the '<em><b>Enrolled On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enrolled On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrolled On</em>' attribute.
	 * @see #setEnrolledOn(Date)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getEnrollment_EnrolledOn()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getEnrolledOn();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Enrollment#getEnrolledOn <em>Enrolled On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrolled On</em>' attribute.
	 * @see #getEnrolledOn()
	 * @generated
	 */
	void setEnrolledOn(Date value);

} // Enrollment
