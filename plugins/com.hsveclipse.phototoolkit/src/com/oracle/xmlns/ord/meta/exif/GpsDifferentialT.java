/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Differential T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsDifferentialT()
 * @model extendedMetaData="name='gpsDifferential_t'"
 * @generated
 */
public enum GpsDifferentialT implements Enumerator {
	/**
	 * The '<em><b>Measurement Without Differential Correction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION(0, "MeasurementWithoutDifferentialCorrection", "Measurement without differential correction"),

	/**
	 * The '<em><b>Differential Correction Applied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENTIAL_CORRECTION_APPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENTIAL_CORRECTION_APPLIED(1, "DifferentialCorrectionApplied", "Differential correction applied");

	/**
	 * The '<em><b>Measurement Without Differential Correction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Without Differential Correction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION
	 * @model name="MeasurementWithoutDifferentialCorrection" literal="Measurement without differential correction"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION_VALUE = 0;

	/**
	 * The '<em><b>Differential Correction Applied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Differential Correction Applied</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFFERENTIAL_CORRECTION_APPLIED
	 * @model name="DifferentialCorrectionApplied" literal="Differential correction applied"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENTIAL_CORRECTION_APPLIED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Differential T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsDifferentialT[] VALUES_ARRAY =
		new GpsDifferentialT[] {
			MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION,
			DIFFERENTIAL_CORRECTION_APPLIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Differential T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsDifferentialT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Differential T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDifferentialT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDifferentialT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Differential T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDifferentialT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDifferentialT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Differential T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDifferentialT get(int value) {
		switch (value) {
			case MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION_VALUE: return MEASUREMENT_WITHOUT_DIFFERENTIAL_CORRECTION;
			case DIFFERENTIAL_CORRECTION_APPLIED_VALUE: return DIFFERENTIAL_CORRECTION_APPLIED;
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
	private GpsDifferentialT(int value, String name, String literal) {
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
	
} //GpsDifferentialT
