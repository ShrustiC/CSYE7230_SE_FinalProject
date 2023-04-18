/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Certificate;
import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl#getCertificateID <em>Certificate ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl#getCertificateName <em>Certificate Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.CertificateImpl#getIssueDate <em>Issue Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificateImpl extends MinimalEObjectImpl.Container implements Certificate {
	/**
	 * The default value of the '{@link #getCertificateID() <em>Certificate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateID()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateID() <em>Certificate ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateID()
	 * @generated
	 * @ordered
	 */
	protected String certificateID = CERTIFICATE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCertificateName() <em>Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateName()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificateName() <em>Certificate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificateName()
	 * @generated
	 * @ordered
	 */
	protected String certificateName = CERTIFICATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected Date issueDate = ISSUE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.CERTIFICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificateID() {
		return certificateID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateID(String newCertificateID) {
		String oldCertificateID = certificateID;
		certificateID = newCertificateID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_ID, oldCertificateID, certificateID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificateName() {
		return certificateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificateName(String newCertificateName) {
		String oldCertificateName = certificateName;
		certificateName = newCertificateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_NAME, oldCertificateName, certificateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(Date newIssueDate) {
		Date oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.CERTIFICATE__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_ID:
				return getCertificateID();
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_NAME:
				return getCertificateName();
			case Neueducsye7230lmsPackage.CERTIFICATE__ISSUE_DATE:
				return getIssueDate();
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
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_ID:
				setCertificateID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_NAME:
				setCertificateName((String)newValue);
				return;
			case Neueducsye7230lmsPackage.CERTIFICATE__ISSUE_DATE:
				setIssueDate((Date)newValue);
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
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_ID:
				setCertificateID(CERTIFICATE_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_NAME:
				setCertificateName(CERTIFICATE_NAME_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.CERTIFICATE__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
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
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_ID:
				return CERTIFICATE_ID_EDEFAULT == null ? certificateID != null : !CERTIFICATE_ID_EDEFAULT.equals(certificateID);
			case Neueducsye7230lmsPackage.CERTIFICATE__CERTIFICATE_NAME:
				return CERTIFICATE_NAME_EDEFAULT == null ? certificateName != null : !CERTIFICATE_NAME_EDEFAULT.equals(certificateName);
			case Neueducsye7230lmsPackage.CERTIFICATE__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
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
		result.append(" (certificateID: ");
		result.append(certificateID);
		result.append(", certificateName: ");
		result.append(certificateName);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(')');
		return result.toString();
	}

} //CertificateImpl
