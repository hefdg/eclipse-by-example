/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Status T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsStatusT()
 * @model extendedMetaData="name='gpsStatus_t'"
 * @generated
 */
public enum GpsStatusT implements Enumerator {
	/**
	 * The '<em><b>Measurement In Progress</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_IN_PROGRESS_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_IN_PROGRESS(0, "MeasurementInProgress", "Measurement in progress"),

	/**
	 * The '<em><b>Measurement Interoperability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_INTEROPERABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_INTEROPERABILITY(1, "MeasurementInteroperability", "Measurement interoperability");

	/**
	 * The '<em><b>Measurement In Progress</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement In Progress</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_IN_PROGRESS
	 * @model name="MeasurementInProgress" literal="Measurement in progress"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_IN_PROGRESS_VALUE = 0;

	/**
	 * The '<em><b>Measurement Interoperability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Interoperability</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_INTEROPERABILITY
	 * @model name="MeasurementInteroperability" literal="Measurement interoperability"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_INTEROPERABILITY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Status T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsStatusT[] VALUES_ARRAY =
		new GpsStatusT[] {
			MEASUREMENT_IN_PROGRESS,
			MEASUREMENT_INTEROPERABILITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Status T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsStatusT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Status T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsStatusT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsStatusT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Status T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsStatusT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsStatusT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Status T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsStatusT get(int value) {
		switch (value) {
			case MEASUREMENT_IN_PROGRESS_VALUE: return MEASUREMENT_IN_PROGRESS;
			case MEASUREMENT_INTEROPERABILITY_VALUE: return MEASUREMENT_INTEROPERABILITY;
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
	private GpsStatusT(int value, String name, String literal) {
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
	
} //GpsStatusT
