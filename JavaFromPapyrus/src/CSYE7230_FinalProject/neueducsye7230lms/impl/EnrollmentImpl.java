/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Enrollment;
import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl#getEnrollmentID <em>Enrollment ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.EnrollmentImpl#getEnrolledOn <em>Enrolled On</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnrollmentImpl extends MinimalEObjectImpl.Container implements Enrollment {
	/**
	 * The default value of the '{@link #getEnrollmentID() <em>Enrollment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String ENROLLMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrollmentID() <em>Enrollment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentID()
	 * @generated
	 * @ordered
	 */
	protected String enrollmentID = ENROLLMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnrolledOn() <em>Enrolled On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledOn()
	 * @generated
	 * @ordered
	 */
	protected static final Date ENROLLED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnrolledOn() <em>Enrolled On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrolledOn()
	 * @generated
	 * @ordered
	 */
	protected Date enrolledOn = ENROLLED_ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnrollmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.ENROLLMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnrollmentID() {
		return enrollmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentID(String newEnrollmentID) {
		String oldEnrollmentID = enrollmentID;
		enrollmentID = newEnrollmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ENROLLMENT__ENROLLMENT_ID, oldEnrollmentID, enrollmentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnrolledOn() {
		return enrolledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrolledOn(Date newEnrolledOn) {
		Date oldEnrolledOn = enrolledOn;
		enrolledOn = newEnrolledOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ENROLLMENT__ENROLLED_ON, oldEnrolledOn, enrolledOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLMENT_ID:
				return getEnrollmentID();
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLED_ON:
				return getEnrolledOn();
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
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLMENT_ID:
				setEnrollmentID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLED_ON:
				setEnrolledOn((Date)newValue);
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
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLMENT_ID:
				setEnrollmentID(ENROLLMENT_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLED_ON:
				setEnrolledOn(ENROLLED_ON_EDEFAULT);
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
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLMENT_ID:
				return ENROLLMENT_ID_EDEFAULT == null ? enrollmentID != null : !ENROLLMENT_ID_EDEFAULT.equals(enrollmentID);
			case Neueducsye7230lmsPackage.ENROLLMENT__ENROLLED_ON:
				return ENROLLED_ON_EDEFAULT == null ? enrolledOn != null : !ENROLLED_ON_EDEFAULT.equals(enrolledOn);
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
		result.append(" (enrollmentID: ");
		result.append(enrollmentID);
		result.append(", enrolledOn: ");
		result.append(enrolledOn);
		result.append(')');
		return result.toString();
	}

} //EnrollmentImpl
