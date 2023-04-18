/**
 */
package CSYE7230_FinalProject.neueducsye7230lms.impl;

import CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage;
import CSYE7230_FinalProject.neueducsye7230lms.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getRoleID <em>Role ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getUserID <em>User ID</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getRegistrationDate <em>Registration Date</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link CSYE7230_FinalProject.neueducsye7230lms.impl.UserImpl#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getRoleID() <em>Role ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleID() <em>Role ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleID()
	 * @generated
	 * @ordered
	 */
	protected String roleID = ROLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserID() <em>User ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserID()
	 * @generated
	 * @ordered
	 */
	protected String userID = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegistrationDate() <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDate()
	 * @generated
	 * @ordered
	 */
	protected static final String REGISTRATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegistrationDate() <em>Registration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistrationDate()
	 * @generated
	 * @ordered
	 */
	protected String registrationDate = REGISTRATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected String userType = USER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContact()
	 * @generated
	 * @ordered
	 */
	protected String contact = CONTACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Neueducsye7230lmsPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleID() {
		return roleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleID(String newRoleID) {
		String oldRoleID = roleID;
		roleID = newRoleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__ROLE_ID, oldRoleID, roleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserID(String newUserID) {
		String oldUserID = userID;
		userID = newUserID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__USER_ID, oldUserID, userID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistrationDate(String newRegistrationDate) {
		String oldRegistrationDate = registrationDate;
		registrationDate = newRegistrationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__REGISTRATION_DATE, oldRegistrationDate, registrationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserType(String newUserType) {
		String oldUserType = userType;
		userType = newUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContact() {
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContact(String newContact) {
		String oldContact = contact;
		contact = newContact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Neueducsye7230lmsPackage.USER__CONTACT, oldContact, contact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Neueducsye7230lmsPackage.USER__ROLE_ID:
				return getRoleID();
			case Neueducsye7230lmsPackage.USER__USER_NAME:
				return getUserName();
			case Neueducsye7230lmsPackage.USER__PASSWORD:
				return getPassword();
			case Neueducsye7230lmsPackage.USER__USER_ID:
				return getUserID();
			case Neueducsye7230lmsPackage.USER__EMAIL:
				return getEmail();
			case Neueducsye7230lmsPackage.USER__REGISTRATION_DATE:
				return getRegistrationDate();
			case Neueducsye7230lmsPackage.USER__STATUS:
				return getStatus();
			case Neueducsye7230lmsPackage.USER__USER_TYPE:
				return getUserType();
			case Neueducsye7230lmsPackage.USER__CONTACT:
				return getContact();
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
			case Neueducsye7230lmsPackage.USER__ROLE_ID:
				setRoleID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__PASSWORD:
				setPassword((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__USER_ID:
				setUserID((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__REGISTRATION_DATE:
				setRegistrationDate((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__STATUS:
				setStatus((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__USER_TYPE:
				setUserType((String)newValue);
				return;
			case Neueducsye7230lmsPackage.USER__CONTACT:
				setContact((String)newValue);
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
			case Neueducsye7230lmsPackage.USER__ROLE_ID:
				setRoleID(ROLE_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__USER_ID:
				setUserID(USER_ID_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__REGISTRATION_DATE:
				setRegistrationDate(REGISTRATION_DATE_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__USER_TYPE:
				setUserType(USER_TYPE_EDEFAULT);
				return;
			case Neueducsye7230lmsPackage.USER__CONTACT:
				setContact(CONTACT_EDEFAULT);
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
			case Neueducsye7230lmsPackage.USER__ROLE_ID:
				return ROLE_ID_EDEFAULT == null ? roleID != null : !ROLE_ID_EDEFAULT.equals(roleID);
			case Neueducsye7230lmsPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case Neueducsye7230lmsPackage.USER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case Neueducsye7230lmsPackage.USER__USER_ID:
				return USER_ID_EDEFAULT == null ? userID != null : !USER_ID_EDEFAULT.equals(userID);
			case Neueducsye7230lmsPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case Neueducsye7230lmsPackage.USER__REGISTRATION_DATE:
				return REGISTRATION_DATE_EDEFAULT == null ? registrationDate != null : !REGISTRATION_DATE_EDEFAULT.equals(registrationDate);
			case Neueducsye7230lmsPackage.USER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case Neueducsye7230lmsPackage.USER__USER_TYPE:
				return USER_TYPE_EDEFAULT == null ? userType != null : !USER_TYPE_EDEFAULT.equals(userType);
			case Neueducsye7230lmsPackage.USER__CONTACT:
				return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
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
		result.append(" (roleID: ");
		result.append(roleID);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", userID: ");
		result.append(userID);
		result.append(", email: ");
		result.append(email);
		result.append(", registrationDate: ");
		result.append(registrationDate);
		result.append(", status: ");
		result.append(status);
		result.append(", userType: ");
		result.append(userType);
		result.append(", contact: ");
		result.append(contact);
		result.append(')');
		return result.toString();
	}

} //UserImpl
