/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserID <em>User ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getEmail <em>Email</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getRegistrationDate <em>Registration Date</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getStatus <em>Status</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.User#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser()
 * @model
 * @generated
 */
public interface User extends Role {
	/**
	 * Returns the value of the '<em><b>User ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User ID</em>' attribute.
	 * @see #setUserID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_UserID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserID <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User ID</em>' attribute.
	 * @see #getUserID()
	 * @generated
	 */
	void setUserID(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Registration Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registration Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registration Date</em>' attribute.
	 * @see #setRegistrationDate(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_RegistrationDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRegistrationDate();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getRegistrationDate <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registration Date</em>' attribute.
	 * @see #getRegistrationDate()
	 * @generated
	 */
	void setRegistrationDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_Status()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see #setUserType(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_UserType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserType();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUser_Contact()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.User#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

} // User
