/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateID <em>Certificate ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateName <em>Certificate Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getIssueDate <em>Issue Date</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCertificate()
 * @model
 * @generated
 */
public interface Certificate extends EObject {
	/**
	 * Returns the value of the '<em><b>Certificate ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate ID</em>' attribute.
	 * @see #setCertificateID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCertificate_CertificateID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCertificateID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateID <em>Certificate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate ID</em>' attribute.
	 * @see #getCertificateID()
	 * @generated
	 */
	void setCertificateID(String value);

	/**
	 * Returns the value of the '<em><b>Certificate Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Certificate Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Certificate Name</em>' attribute.
	 * @see #setCertificateName(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCertificate_CertificateName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCertificateName();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getCertificateName <em>Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Certificate Name</em>' attribute.
	 * @see #getCertificateName()
	 * @generated
	 */
	void setCertificateName(String value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getCertificate_IssueDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.Certificate#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

} // Certificate
