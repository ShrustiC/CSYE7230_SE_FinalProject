/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getUserType()
 * @model
 * @generated
 */
public enum UserType implements Enumerator {
	/**
	 * The '<em><b>STUDENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT_VALUE
	 * @generated
	 * @ordered
	 */
	STUDENT(0, "STUDENT", "STUDENT"),

	/**
	 * The '<em><b>INSTRUCTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTOR_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUCTOR(1, "INSTRUCTOR", "INSTRUCTOR"),

	/**
	 * The '<em><b>TA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TA_VALUE
	 * @generated
	 * @ordered
	 */
	TA(2, "TA", "TA"),

	/**
	 * The '<em><b>COMPANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPANY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPANY(3, "COMPANY", "COMPANY"),

	/**
	 * The '<em><b>RECRUITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECRUITER_VALUE
	 * @generated
	 * @ordered
	 */
	RECRUITER(4, "RECRUITER", "RECRUITER");

	/**
	 * The '<em><b>STUDENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STUDENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STUDENT_VALUE = 0;

	/**
	 * The '<em><b>INSTRUCTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTOR_VALUE = 1;

	/**
	 * The '<em><b>TA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TA_VALUE = 2;

	/**
	 * The '<em><b>COMPANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPANY_VALUE = 3;

	/**
	 * The '<em><b>RECRUITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECRUITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECRUITER_VALUE = 4;

	/**
	 * An array of all the '<em><b>User Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserType[] VALUES_ARRAY =
		new UserType[] {
			STUDENT,
			INSTRUCTOR,
			TA,
			COMPANY,
			RECRUITER,
		};

	/**
	 * A public read-only list of all the '<em><b>User Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType get(int value) {
		switch (value) {
			case STUDENT_VALUE: return STUDENT;
			case INSTRUCTOR_VALUE: return INSTRUCTOR;
			case TA_VALUE: return TA;
			case COMPANY_VALUE: return COMPANY;
			case RECRUITER_VALUE: return RECRUITER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UserType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //UserType
