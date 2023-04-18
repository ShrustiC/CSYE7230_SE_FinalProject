/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Instructor;
import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl#getInstructorID <em>Instructor ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.InstructorImpl#getInstructorName <em>Instructor Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructorImpl extends UserImpl implements Instructor {
	/**
	 * The default value of the '{@link #getInstructorID() <em>Instructor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructorID()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructorID() <em>Instructor ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructorID()
	 * @generated
	 * @ordered
	 */
	protected String instructorID = INSTRUCTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstructorName() <em>Instructor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructorName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUCTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstructorName() <em>Instructor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructorName()
	 * @generated
	 * @ordered
	 */
	protected String instructorName = INSTRUCTOR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.INSTRUCTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructorID() {
		return instructorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructorID(String newInstructorID) {
		String oldInstructorID = instructorID;
		instructorID = newInstructorID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_ID, oldInstructorID, instructorID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstructorName() {
		return instructorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstructorName(String newInstructorName) {
		String oldInstructorName = instructorName;
		instructorName = newInstructorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_NAME, oldInstructorName, instructorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_ID:
				return getInstructorID();
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_NAME:
				return getInstructorName();
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
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_ID:
				setInstructorID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_NAME:
				setInstructorName((String)newValue);
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
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_ID:
				setInstructorID(INSTRUCTOR_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_NAME:
				setInstructorName(INSTRUCTOR_NAME_EDEFAULT);
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
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_ID:
				return INSTRUCTOR_ID_EDEFAULT == null ? instructorID != null : !INSTRUCTOR_ID_EDEFAULT.equals(instructorID);
			case Neueducsye7230lmsPackage.INSTRUCTOR__INSTRUCTOR_NAME:
				return INSTRUCTOR_NAME_EDEFAULT == null ? instructorName != null : !INSTRUCTOR_NAME_EDEFAULT.equals(instructorName);
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
		result.append(" (instructorID: ");
		result.append(instructorID);
		result.append(", instructorName: ");
		result.append(instructorName);
		result.append(')');
		return result.toString();
	}

} //InstructorImpl
