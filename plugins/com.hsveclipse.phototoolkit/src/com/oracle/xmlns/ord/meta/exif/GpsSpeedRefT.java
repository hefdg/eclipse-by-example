/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Speed Ref T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsSpeedRefT()
 * @model extendedMetaData="name='gpsSpeedRef_t'"
 * @generated
 */
public enum GpsSpeedRefT implements Enumerator {
	/**
	 * The '<em><b>Kilometers Per Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS_PER_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	KILOMETERS_PER_HOUR(0, "KilometersPerHour", "Kilometers per hour"),

	/**
	 * The '<em><b>Miles Per Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILES_PER_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	MILES_PER_HOUR(1, "MilesPerHour", "Miles per hour"),

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
	 * The '<em><b>Kilometers Per Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kilometers Per Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS_PER_HOUR
	 * @model name="KilometersPerHour" literal="Kilometers per hour"
	 * @generated
	 * @ordered
	 */
	public static final int KILOMETERS_PER_HOUR_VALUE = 0;

	/**
	 * The '<em><b>Miles Per Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miles Per Hour</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILES_PER_HOUR
	 * @model name="MilesPerHour" literal="Miles per hour"
	 * @generated
	 * @ordered
	 */
	public static final int MILES_PER_HOUR_VALUE = 1;

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
	 * An array of all the '<em><b>Gps Speed Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsSpeedRefT[] VALUES_ARRAY =
		new GpsSpeedRefT[] {
			KILOMETERS_PER_HOUR,
			MILES_PER_HOUR,
			KNOTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Speed Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsSpeedRefT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Speed Ref T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsSpeedRefT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsSpeedRefT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Speed Ref T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsSpeedRefT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsSpeedRefT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Speed Ref T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsSpeedRefT get(int value) {
		switch (value) {
			case KILOMETERS_PER_HOUR_VALUE: return KILOMETERS_PER_HOUR;
			case MILES_PER_HOUR_VALUE: return MILES_PER_HOUR;
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
	private GpsSpeedRefT(int value, String name, String literal) {
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
	
} //GpsSpeedRefT
