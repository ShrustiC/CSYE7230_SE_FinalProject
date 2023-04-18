/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolID <em>School ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolName <em>School Name</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getSchool()
 * @model
 * @generated
 */
public interface School extends EObject {
	/**
	 * Returns the value of the '<em><b>School ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School ID</em>' attribute.
	 * @see #setSchoolID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getSchool_SchoolID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSchoolID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolID <em>School ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School ID</em>' attribute.
	 * @see #getSchoolID()
	 * @generated
	 */
	void setSchoolID(String value);

	/**
	 * Returns the value of the '<em><b>School Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School Name</em>' attribute.
	 * @see #setSchoolName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getSchool_SchoolName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSchoolName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.School#getSchoolName <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>School Name</em>' attribute.
	 * @see #getSchoolName()
	 * @generated
	 */
	void setSchoolName(String value);

} // School
