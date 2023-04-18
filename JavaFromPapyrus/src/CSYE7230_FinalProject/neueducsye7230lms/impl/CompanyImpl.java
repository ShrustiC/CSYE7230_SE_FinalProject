/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Company;
import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Company</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl#getCompanyID <em>Company ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CompanyImpl#getCompanyName <em>Company Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompanyImpl extends UserImpl implements Company {
	/**
	 * The default value of the '{@link #getCompanyID() <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyID() <em>Company ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyID()
	 * @generated
	 * @ordered
	 */
	protected String companyID = COMPANY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompanyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.COMPANY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyID() {
		return companyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyID(String newCompanyID) {
		String oldCompanyID = companyID;
		companyID = newCompanyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.COMPANY__COMPANY_ID, oldCompanyID, companyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.COMPANY__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_ID:
				return getCompanyID();
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_NAME:
				return getCompanyName();
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
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_ID:
				setCompanyID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_NAME:
				setCompanyName((String)newValue);
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
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_ID:
				setCompanyID(COMPANY_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_NAME:
				setCompanyName(COMPANY_NAME_EDEFAULT);
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
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_ID:
				return COMPANY_ID_EDEFAULT == null ? companyID != null : !COMPANY_ID_EDEFAULT.equals(companyID);
			case Neueducsye7230lmsPackage.COMPANY__COMPANY_NAME:
				return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
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
		result.append(" (companyID: ");
		result.append(companyID);
		result.append(", companyName: ");
		result.append(companyName);
		result.append(')');
		return result.toString();
	}

} //CompanyImpl
