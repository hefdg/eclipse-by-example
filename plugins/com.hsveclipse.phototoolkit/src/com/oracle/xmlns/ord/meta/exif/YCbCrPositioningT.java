/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>YCb Cr Positioning T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getYCbCrPositioningT()
 * @model extendedMetaData="name='yCbCrPositioning_t'"
 * @generated
 */
public enum YCbCrPositioningT implements Enumerator {
	/**
	 * The '<em><b>Centered</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTERED_VALUE
	 * @generated
	 * @ordered
	 */
	CENTERED(0, "centered", "centered"),

	/**
	 * The '<em><b>Co Sited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CO_SITED_VALUE
	 * @generated
	 * @ordered
	 */
	CO_SITED(1, "coSited", "co-sited");

	/**
	 * The '<em><b>Centered</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Centered</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTERED
	 * @model name="centered"
	 * @generated
	 * @ordered
	 */
	public static final int CENTERED_VALUE = 0;

	/**
	 * The '<em><b>Co Sited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Co Sited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CO_SITED
	 * @model name="coSited" literal="co-sited"
	 * @generated
	 * @ordered
	 */
	public static final int CO_SITED_VALUE = 1;

	/**
	 * An array of all the '<em><b>YCb Cr Positioning T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final YCbCrPositioningT[] VALUES_ARRAY =
		new YCbCrPositioningT[] {
			CENTERED,
			CO_SITED,
		};

	/**
	 * A public read-only list of all the '<em><b>YCb Cr Positioning T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<YCbCrPositioningT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>YCb Cr Positioning T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrPositioningT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YCbCrPositioningT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YCb Cr Positioning T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrPositioningT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YCbCrPositioningT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YCb Cr Positioning T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrPositioningT get(int value) {
		switch (value) {
			case CENTERED_VALUE: return CENTERED;
			case CO_SITED_VALUE: return CO_SITED;
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
	private YCbCrPositioningT(int value, String name, String literal) {
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
	
} //YCbCrPositioningT
