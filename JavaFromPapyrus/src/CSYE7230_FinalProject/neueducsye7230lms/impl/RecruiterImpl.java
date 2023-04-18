/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.Recruiter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recruiter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl#getRecuiterID <em>Recuiter ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.RecruiterImpl#getRecruiterName <em>Recruiter Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecruiterImpl extends UserImpl implements Recruiter {
	/**
	 * The default value of the '{@link #getRecuiterID() <em>Recuiter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecuiterID()
	 * @generated
	 * @ordered
	 */
	protected static final String RECUITER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecuiterID() <em>Recuiter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecuiterID()
	 * @generated
	 * @ordered
	 */
	protected String recuiterID = RECUITER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecruiterName() <em>Recruiter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecruiterName()
	 * @generated
	 * @ordered
	 */
	protected static final String RECRUITER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecruiterName() <em>Recruiter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecruiterName()
	 * @generated
	 * @ordered
	 */
	protected String recruiterName = RECRUITER_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecruiterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.RECRUITER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecuiterID() {
		return recuiterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecuiterID(String newRecuiterID) {
		String oldRecuiterID = recuiterID;
		recuiterID = newRecuiterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.RECRUITER__RECUITER_ID, oldRecuiterID, recuiterID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecruiterName() {
		return recruiterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecruiterName(String newRecruiterName) {
		String oldRecruiterName = recruiterName;
		recruiterName = newRecruiterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.RECRUITER__RECRUITER_NAME, oldRecruiterName, recruiterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.RECRUITER__RECUITER_ID:
				return getRecuiterID();
			case Neueducsye7230lmsPackage.RECRUITER__RECRUITER_NAME:
				return getRecruiterName();
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
			case Neueducsye7230lmsPackage.RECRUITER__RECUITER_ID:
				setRecuiterID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.RECRUITER__RECRUITER_NAME:
				setRecruiterName((String)newValue);
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
			case Neueducsye7230lmsPackage.RECRUITER__RECUITER_ID:
				setRecuiterID(RECUITER_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.RECRUITER__RECRUITER_NAME:
				setRecruiterName(RECRUITER_NAME_EDEFAULT);
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
			case Neueducsye7230lmsPackage.RECRUITER__RECUITER_ID:
				return RECUITER_ID_EDEFAULT == null ? recuiterID != null : !RECUITER_ID_EDEFAULT.equals(recuiterID);
			case Neueducsye7230lmsPackage.RECRUITER__RECRUITER_NAME:
				return RECRUITER_NAME_EDEFAULT == null ? recruiterName != null : !RECRUITER_NAME_EDEFAULT.equals(recruiterName);
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
		result.append(" (recuiterID: ");
		result.append(recuiterID);
		result.append(", recruiterName: ");
		result.append(recruiterName);
		result.append(')');
		return result.toString();
	}

} //RecruiterImpl
