/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Longitude Ref T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsLongitudeRefT()
 * @model extendedMetaData="name='gpsLongitudeRef_t'"
 * @generated
 */
public enum GpsLongitudeRefT implements Enumerator {
	/**
	 * The '<em><b>East Longitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EAST_LONGITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	EAST_LONGITUDE(0, "EastLongitude", "East longitude"),

	/**
	 * The '<em><b>West Longitude</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEST_LONGITUDE_VALUE
	 * @generated
	 * @ordered
	 */
	WEST_LONGITUDE(1, "WestLongitude", "West longitude");

	/**
	 * The '<em><b>East Longitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>East Longitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EAST_LONGITUDE
	 * @model name="EastLongitude" literal="East longitude"
	 * @generated
	 * @ordered
	 */
	public static final int EAST_LONGITUDE_VALUE = 0;

	/**
	 * The '<em><b>West Longitude</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>West Longitude</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEST_LONGITUDE
	 * @model name="WestLongitude" literal="West longitude"
	 * @generated
	 * @ordered
	 */
	public static final int WEST_LONGITUDE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Longitude Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsLongitudeRefT[] VALUES_ARRAY =
		new GpsLongitudeRefT[] {
			EAST_LONGITUDE,
			WEST_LONGITUDE,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Longitude Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsLongitudeRefT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Longitude Ref T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsLongitudeRefT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsLongitudeRefT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Longitude Ref T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsLongitudeRefT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsLongitudeRefT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Longitude Ref T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsLongitudeRefT get(int value) {
		switch (value) {
			case EAST_LONGITUDE_VALUE: return EAST_LONGITUDE;
			case WEST_LONGITUDE_VALUE: return WEST_LONGITUDE;
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
	private GpsLongitudeRefT(int value, String name, String literal) {
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
	
} //GpsLongitudeRefT
