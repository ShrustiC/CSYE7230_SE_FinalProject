/**
 */
package CSYE7230_FinalProject.neueducsye7230lms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Payment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CSYE7230_FinalProject.neueducsye7230lms.Neueducsye7230lmsPackage#getPaymentType()
 * @model
 * @generated
 */
public enum PaymentType implements Enumerator {
	/**
	 * The '<em><b>CREDITCARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITCARD_VALUE
	 * @generated
	 * @ordered
	 */
	CREDITCARD(0, "CREDITCARD", "CREDITCARD"),

	/**
	 * The '<em><b>DEBITCARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBITCARD_VALUE
	 * @generated
	 * @ordered
	 */
	DEBITCARD(1, "DEBITCARD", "DEBITCARD");

	/**
	 * The '<em><b>CREDITCARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREDITCARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREDITCARD_VALUE = 0;

	/**
	 * The '<em><b>DEBITCARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBITCARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBITCARD_VALUE = 1;

	/**
	 * An array of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PaymentType[] VALUES_ARRAY =
		new PaymentType[] {
			CREDITCARD,
			DEBITCARD,
		};

	/**
	 * A public read-only list of all the '<em><b>Payment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PaymentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PaymentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PaymentType get(int value) {
		switch (value) {
			case CREDITCARD_VALUE: return CREDITCARD;
			case DEBITCARD_VALUE: return DEBITCARD;
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
	private PaymentType(int value, String name, String literal) {
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
	
} //PaymentType
