/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Payment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getOnlinePayment()
 * @model
 * @generated
 */
public interface OnlinePayment extends EObject {
	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' attribute.
	 * @see #setPaymentType(String)
	 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getOnlinePayment_PaymentType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentType();

	/**
	 * Sets the value of the '{@link CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' attribute.
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(String value);

} // OnlinePayment
