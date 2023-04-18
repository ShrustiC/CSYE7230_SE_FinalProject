/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.OnlinePayment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Payment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.OnlinePaymentImpl#getPaymentType <em>Payment Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlinePaymentImpl extends MinimalEObjectImpl.Container implements OnlinePayment {
	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected String paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlinePaymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.ONLINE_PAYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(String newPaymentType) {
		String oldPaymentType = paymentType;
		paymentType = newPaymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ONLINE_PAYMENT__PAYMENT_TYPE, oldPaymentType, paymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ONLINE_PAYMENT__PAYMENT_TYPE:
				return getPaymentType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ONLINE_PAYMENT__PAYMENT_TYPE:
				setPaymentType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ONLINE_PAYMENT__PAYMENT_TYPE:
				setPaymentType(PAYMENT_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ONLINE_PAYMENT__PAYMENT_TYPE:
				return PAYMENT_TYPE_EDEFAULT == null ? paymentType != null : !PAYMENT_TYPE_EDEFAULT.equals(paymentType);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (paymentType: ");
		result.append(paymentType);
		result.append(')');
		return result.toString();
	}

} //OnlinePaymentImpl
