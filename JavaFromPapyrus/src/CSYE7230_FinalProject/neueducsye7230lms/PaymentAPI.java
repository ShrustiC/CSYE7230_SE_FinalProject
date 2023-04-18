/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payment API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPaymentID <em>Payment ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPayementDate <em>Payement Date</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getPaymentAPI()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface PaymentAPI extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment ID</em>' attribute.
	 * @see #setPaymentID(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getPaymentAPI_PaymentID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentID();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPaymentID <em>Payment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment ID</em>' attribute.
	 * @see #getPaymentID()
	 * @generated
	 */
	void setPaymentID(String value);

	/**
	 * Returns the value of the '<em><b>Payement Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payement Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payement Date</em>' attribute.
	 * @see #setPayementDate(Date)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getPaymentAPI_PayementDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getPayementDate();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getPayementDate <em>Payement Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payement Date</em>' attribute.
	 * @see #getPayementDate()
	 * @generated
	 */
	void setPayementDate(Date value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getPaymentAPI_Amount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.PaymentAPI#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

} // PaymentAPI
