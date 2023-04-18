/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recruiter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecuiterID <em>Recuiter ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecruiterName <em>Recruiter Name</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getRecruiter()
 * @model
 * @generated
 */
public interface Recruiter extends User {
	/**
	 * Returns the value of the '<em><b>Recuiter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recuiter ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recuiter ID</em>' attribute.
	 * @see #setRecuiterID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getRecruiter_RecuiterID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRecuiterID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecuiterID <em>Recuiter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recuiter ID</em>' attribute.
	 * @see #getRecuiterID()
	 * @generated
	 */
	void setRecuiterID(String value);

	/**
	 * Returns the value of the '<em><b>Recruiter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recruiter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recruiter Name</em>' attribute.
	 * @see #setRecruiterName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getRecruiter_RecruiterName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRecruiterName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Recruiter#getRecruiterName <em>Recruiter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recruiter Name</em>' attribute.
	 * @see #getRecruiterName()
	 * @generated
	 */
	void setRecruiterName(String value);

} // Recruiter
