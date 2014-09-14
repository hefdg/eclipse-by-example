/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gain Control T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGainControlT()
 * @model extendedMetaData="name='gainControl_t'"
 * @generated
 */
public enum GainControlT implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Low Gain Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_GAIN_UP_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_GAIN_UP(1, "LowGainUp", "Low gain up"),

	/**
	 * The '<em><b>High Gain Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_GAIN_UP_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_GAIN_UP(2, "HighGainUp", "High gain up"),

	/**
	 * The '<em><b>Low Gain Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_GAIN_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_GAIN_DOWN(3, "LowGainDown", "Low gain down"),

	/**
	 * The '<em><b>High Gain Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_GAIN_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_GAIN_DOWN(4, "HighGainDown", "High gain down");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Low Gain Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low Gain Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_GAIN_UP
	 * @model name="LowGainUp" literal="Low gain up"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_GAIN_UP_VALUE = 1;

	/**
	 * The '<em><b>High Gain Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Gain Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_GAIN_UP
	 * @model name="HighGainUp" literal="High gain up"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_GAIN_UP_VALUE = 2;

	/**
	 * The '<em><b>Low Gain Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Low Gain Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_GAIN_DOWN
	 * @model name="LowGainDown" literal="Low gain down"
	 * @generated
	 * @ordered
	 */
	public static final int LOW_GAIN_DOWN_VALUE = 3;

	/**
	 * The '<em><b>High Gain Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>High Gain Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_GAIN_DOWN
	 * @model name="HighGainDown" literal="High gain down"
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_GAIN_DOWN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Gain Control T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GainControlT[] VALUES_ARRAY =
		new GainControlT[] {
			NONE,
			LOW_GAIN_UP,
			HIGH_GAIN_UP,
			LOW_GAIN_DOWN,
			HIGH_GAIN_DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Gain Control T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GainControlT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gain Control T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GainControlT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GainControlT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gain Control T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GainControlT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GainControlT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gain Control T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GainControlT get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case LOW_GAIN_UP_VALUE: return LOW_GAIN_UP;
			case HIGH_GAIN_UP_VALUE: return HIGH_GAIN_UP;
			case LOW_GAIN_DOWN_VALUE: return LOW_GAIN_DOWN;
			case HIGH_GAIN_DOWN_VALUE: return HIGH_GAIN_DOWN;
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
	private GainControlT(int value, String name, String literal) {
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
	
} //GainControlT
