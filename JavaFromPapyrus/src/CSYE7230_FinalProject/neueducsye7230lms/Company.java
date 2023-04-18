/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyName <em>Company Name</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCompany()
 * @model
 * @generated
 */
public interface Company extends User {
	/**
	 * Returns the value of the '<em><b>Company ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company ID</em>' attribute.
	 * @see #setCompanyID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCompany_CompanyID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCompanyID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyID <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company ID</em>' attribute.
	 * @see #getCompanyID()
	 * @generated
	 */
	void setCompanyID(String value);

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCompany_CompanyName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Company#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

} // Company
