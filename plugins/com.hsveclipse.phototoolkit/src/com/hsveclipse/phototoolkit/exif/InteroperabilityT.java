/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interoperability T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getInteroperabilityT()
 * @model extendedMetaData="name='interoperability_t'"
 * @generated
 */
public enum InteroperabilityT implements Enumerator {
	/**
	 * The '<em><b>R98</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R98_VALUE
	 * @generated
	 * @ordered
	 */
	R98(0, "R98", "R98"),

	/**
	 * The '<em><b>THM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THM_VALUE
	 * @generated
	 * @ordered
	 */
	THM(1, "THM", "THM"),

	/**
	 * The '<em><b>R03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #R03_VALUE
	 * @generated
	 * @ordered
	 */
	R03(2, "R03", "R03");

	/**
	 * The '<em><b>R98</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>R98</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #R98
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R98_VALUE = 0;

	/**
	 * The '<em><b>THM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>THM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int THM_VALUE = 1;

	/**
	 * The '<em><b>R03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>R03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #R03
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int R03_VALUE = 2;

	/**
	 * An array of all the '<em><b>Interoperability T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InteroperabilityT[] VALUES_ARRAY =
		new InteroperabilityT[] {
			R98,
			THM,
			R03,
		};

	/**
	 * A public read-only list of all the '<em><b>Interoperability T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InteroperabilityT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interoperability T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteroperabilityT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteroperabilityT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interoperability T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteroperabilityT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InteroperabilityT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interoperability T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InteroperabilityT get(int value) {
		switch (value) {
			case R98_VALUE: return R98;
			case THM_VALUE: return THM;
			case R03_VALUE: return R03;
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
	private InteroperabilityT(int value, String name, String literal) {
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
	
} //InteroperabilityT
