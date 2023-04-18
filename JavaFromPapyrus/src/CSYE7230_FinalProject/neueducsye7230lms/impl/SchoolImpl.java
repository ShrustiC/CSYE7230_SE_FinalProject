/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.School;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl#getSchoolID <em>School ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.SchoolImpl#getSchoolName <em>School Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchoolImpl extends MinimalEObjectImpl.Container implements School {
	/**
	 * The default value of the '{@link #getSchoolID() <em>School ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolID()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchoolID() <em>School ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolID()
	 * @generated
	 * @ordered
	 */
	protected String schoolID = SCHOOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchoolName() <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolName()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchoolName() <em>School Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolName()
	 * @generated
	 * @ordered
	 */
	protected String schoolName = SCHOOL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.SCHOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchoolID() {
		return schoolID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchoolID(String newSchoolID) {
		String oldSchoolID = schoolID;
		schoolID = newSchoolID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.SCHOOL__SCHOOL_ID, oldSchoolID, schoolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchoolName() {
		return schoolName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchoolName(String newSchoolName) {
		String oldSchoolName = schoolName;
		schoolName = newSchoolName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.SCHOOL__SCHOOL_NAME, oldSchoolName, schoolName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_ID:
				return getSchoolID();
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_NAME:
				return getSchoolName();
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
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_ID:
				setSchoolID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_NAME:
				setSchoolName((String)newValue);
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
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_ID:
				setSchoolID(SCHOOL_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_NAME:
				setSchoolName(SCHOOL_NAME_EDEFAULT);
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
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_ID:
				return SCHOOL_ID_EDEFAULT == null ? schoolID != null : !SCHOOL_ID_EDEFAULT.equals(schoolID);
			case Neueducsye7230lmsPackage.SCHOOL__SCHOOL_NAME:
				return SCHOOL_NAME_EDEFAULT == null ? schoolName != null : !SCHOOL_NAME_EDEFAULT.equals(schoolName);
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
		result.append(" (schoolID: ");
		result.append(schoolID);
		result.append(", schoolName: ");
		result.append(schoolName);
		result.append(')');
		return result.toString();
	}

} //SchoolImpl
