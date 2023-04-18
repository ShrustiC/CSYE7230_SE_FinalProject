/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Assessment;
import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl#getAssessmentID <em>Assessment ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl#getAssessmentName <em>Assessment Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.AssessmentImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentImpl extends MinimalEObjectImpl.Container implements Assessment {
	/**
	 * The default value of the '{@link #getAssessmentID() <em>Assessment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessmentID() <em>Assessment ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentID()
	 * @generated
	 * @ordered
	 */
	protected String assessmentID = ASSESSMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessmentName() <em>Assessment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessmentName() <em>Assessment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentName()
	 * @generated
	 * @ordered
	 */
	protected String assessmentName = ASSESSMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssessmentID() {
		return assessmentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessmentID(String newAssessmentID) {
		String oldAssessmentID = assessmentID;
		assessmentID = newAssessmentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_ID, oldAssessmentID, assessmentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssessmentName() {
		return assessmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssessmentName(String newAssessmentName) {
		String oldAssessmentName = assessmentName;
		assessmentName = newAssessmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_NAME, oldAssessmentName, assessmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.ASSESSMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_ID:
				return getAssessmentID();
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_NAME:
				return getAssessmentName();
			case Neueducsye7230lmsPackage.ASSESSMENT__DESCRIPTION:
				return getDescription();
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
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_ID:
				setAssessmentID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_NAME:
				setAssessmentName((String)newValue);
				return;
			case Neueducsye7230lmsPackage.ASSESSMENT__DESCRIPTION:
				setDescription((String)newValue);
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
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_ID:
				setAssessmentID(ASSESSMENT_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_NAME:
				setAssessmentName(ASSESSMENT_NAME_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.ASSESSMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_ID:
				return ASSESSMENT_ID_EDEFAULT == null ? assessmentID != null : !ASSESSMENT_ID_EDEFAULT.equals(assessmentID);
			case Neueducsye7230lmsPackage.ASSESSMENT__ASSESSMENT_NAME:
				return ASSESSMENT_NAME_EDEFAULT == null ? assessmentName != null : !ASSESSMENT_NAME_EDEFAULT.equals(assessmentName);
			case Neueducsye7230lmsPackage.ASSESSMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (assessmentID: ");
		result.append(assessmentID);
		result.append(", assessmentName: ");
		result.append(assessmentName);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AssessmentImpl
