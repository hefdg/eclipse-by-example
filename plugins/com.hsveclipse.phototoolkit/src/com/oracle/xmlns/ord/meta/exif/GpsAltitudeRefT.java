/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Altitude Ref T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsAltitudeRefT()
 * @model extendedMetaData="name='gpsAltitudeRef_t'"
 * @generated
 */
public enum GpsAltitudeRefT implements Enumerator {
	/**
	 * The '<em><b>Sea Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEA_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	SEA_LEVEL(0, "SeaLevel", "Sea level"),

	/**
	 * The '<em><b>Sea Level Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEA_LEVEL_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEA_LEVEL_REFERENCE(1, "SeaLevelReference", "Sea level reference");

	/**
	 * The '<em><b>Sea Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sea Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEA_LEVEL
	 * @model name="SeaLevel" literal="Sea level"
	 * @generated
	 * @ordered
	 */
	public static final int SEA_LEVEL_VALUE = 0;

	/**
	 * The '<em><b>Sea Level Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sea Level Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEA_LEVEL_REFERENCE
	 * @model name="SeaLevelReference" literal="Sea level reference"
	 * @generated
	 * @ordered
	 */
	public static final int SEA_LEVEL_REFERENCE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Altitude Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsAltitudeRefT[] VALUES_ARRAY =
		new GpsAltitudeRefT[] {
			SEA_LEVEL,
			SEA_LEVEL_REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Altitude Ref T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsAltitudeRefT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Altitude Ref T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsAltitudeRefT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsAltitudeRefT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Altitude Ref T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsAltitudeRefT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsAltitudeRefT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Altitude Ref T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsAltitudeRefT get(int value) {
		switch (value) {
			case SEA_LEVEL_VALUE: return SEA_LEVEL;
			case SEA_LEVEL_REFERENCE_VALUE: return SEA_LEVEL_REFERENCE;
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
	private GpsAltitudeRefT(int value, String name, String literal) {
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
	
} //GpsAltitudeRefT
