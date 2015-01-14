/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Distance Ref T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getGpsDistanceRefT()
 * @model extendedMetaData="name='gpsDistanceRef_t'"
 * @generated
 */
public enum GpsDistanceRefT implements Enumerator {
	/**
	 * The '<em><b>Kilometers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	KILOMETERS(0, "Kilometers", "Kilometers"),

	/**
	 * The '<em><b>Miles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILES_VALUE
	 * @generated
	 * @ordered
	 */
	MILES(1, "Miles", "Miles"),

	/**
	 * The '<em><b>Knots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOTS_VALUE
	 * @generated
	 * @ordered
	 */
	KNOTS(2, "Knots", "Knots");

	/**
	 * The '<em><b>Kilometers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kilometers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS
	 * @model name="Kilometers"
	 * @generated
	 * @ordered
	 */
	public static final int KILOMETERS_VALUE = 0;

	/**
	 * The '<em><b>Miles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILES
	 * @model name="Miles"
	 * @generated
	 * @ordered
	 */
	public static final int MILES_VALUE = 1;

	/**
	 * The '<em><b>Knots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Knots</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KNOTS
	 * @model name="Knots"
	 * @generated
	 * @ordered
	 */
	public static final int KNOTS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Gps Distance Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsDistanceRefT[] VALUES_ARRAY =
		new GpsDistanceRefT[] {
			KILOMETERS,
			MILES,
			KNOTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Distance Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsDistanceRefT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Distance Ref T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDistanceRefT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDistanceRefT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Distance Ref T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDistanceRefT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDistanceRefT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Distance Ref T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDistanceRefT get(int value) {
		switch (value) {
			case KILOMETERS_VALUE: return KILOMETERS;
			case MILES_VALUE: return MILES;
			case KNOTS_VALUE: return KNOTS;
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
	private GpsDistanceRefT(int value, String name, String literal) {
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
	
} //GpsDistanceRefT
