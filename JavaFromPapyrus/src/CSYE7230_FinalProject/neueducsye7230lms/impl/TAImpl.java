/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.TA;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl#getTaID <em>Ta ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.TAImpl#getTaName <em>Ta Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TAImpl extends UserImpl implements TA {
	/**
	 * The default value of the '{@link #getTaID() <em>Ta ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaID()
	 * @generated
	 * @ordered
	 */
	protected static final String TA_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaID() <em>Ta ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaID()
	 * @generated
	 * @ordered
	 */
	protected String taID = TA_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaName() <em>Ta Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaName()
	 * @generated
	 * @ordered
	 */
	protected static final String TA_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaName() <em>Ta Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaName()
	 * @generated
	 * @ordered
	 */
	protected String taName = TA_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.TA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaID() {
		return taID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaID(String newTaID) {
		String oldTaID = taID;
		taID = newTaID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.TA__TA_ID, oldTaID, taID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaName() {
		return taName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaName(String newTaName) {
		String oldTaName = taName;
		taName = newTaName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.TA__TA_NAME, oldTaName, taName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.TA__TA_ID:
				return getTaID();
			case Neueducsye7230lmsPackage.TA__TA_NAME:
				return getTaName();
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
			case Neueducsye7230lmsPackage.TA__TA_ID:
				setTaID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.TA__TA_NAME:
				setTaName((String)newValue);
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
			case Neueducsye7230lmsPackage.TA__TA_ID:
				setTaID(TA_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.TA__TA_NAME:
				setTaName(TA_NAME_EDEFAULT);
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
			case Neueducsye7230lmsPackage.TA__TA_ID:
				return TA_ID_EDEFAULT == null ? taID != null : !TA_ID_EDEFAULT.equals(taID);
			case Neueducsye7230lmsPackage.TA__TA_NAME:
				return TA_NAME_EDEFAULT == null ? taName != null : !TA_NAME_EDEFAULT.equals(taName);
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
		result.append(" (taID: ");
		result.append(taID);
		result.append(", taName: ");
		result.append(taName);
		result.append(')');
		return result.toString();
	}

} //TAImpl
