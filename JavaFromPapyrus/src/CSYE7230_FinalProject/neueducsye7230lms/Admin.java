/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Admin#getAdminID <em>Admin ID</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends Role {
	/**
	 * Returns the value of the '<em><b>Admin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin ID</em>' attribute.
	 * @see #setAdminID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getAdmin_AdminID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAdminID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Admin#getAdminID <em>Admin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin ID</em>' attribute.
	 * @see #getAdminID()
	 * @generated
	 */
	void setAdminID(String value);

} // Admin
