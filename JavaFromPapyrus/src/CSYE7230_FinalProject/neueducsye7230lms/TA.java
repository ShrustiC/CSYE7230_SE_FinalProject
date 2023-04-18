/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaID <em>Ta ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaName <em>Ta Name</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getTA()
 * @model
 * @generated
 */
public interface TA extends User {
	/**
	 * Returns the value of the '<em><b>Ta ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ta ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ta ID</em>' attribute.
	 * @see #setTaID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getTA_TaID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTaID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaID <em>Ta ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ta ID</em>' attribute.
	 * @see #getTaID()
	 * @generated
	 */
	void setTaID(String value);

	/**
	 * Returns the value of the '<em><b>Ta Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ta Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ta Name</em>' attribute.
	 * @see #setTaName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getTA_TaName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTaName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.TA#getTaName <em>Ta Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ta Name</em>' attribute.
	 * @see #getTaName()
	 * @generated
	 */
	void setTaName(String value);

} // TA
