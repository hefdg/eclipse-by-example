/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Measure Mode T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getGpsMeasureModeT()
 * @model extendedMetaData="name='gpsMeasureMode_t'"
 * @generated
 */
public enum GpsMeasureModeT implements Enumerator {
	/**
	 * The '<em><b>2Dimensional Measurement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_2DIMENSIONAL_MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	_2DIMENSIONAL_MEASUREMENT(0, "_2DimensionalMeasurement", "2-dimensional measurement"),

	/**
	 * The '<em><b>3Dimensional Measurement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_3DIMENSIONAL_MEASUREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	_3DIMENSIONAL_MEASUREMENT(1, "_3DimensionalMeasurement", "3-dimensional measurement");

	/**
	 * The '<em><b>2Dimensional Measurement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>2Dimensional Measurement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_2DIMENSIONAL_MEASUREMENT
	 * @model name="_2DimensionalMeasurement" literal="2-dimensional measurement"
	 * @generated
	 * @ordered
	 */
	public static final int _2DIMENSIONAL_MEASUREMENT_VALUE = 0;

	/**
	 * The '<em><b>3Dimensional Measurement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>3Dimensional Measurement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_3DIMENSIONAL_MEASUREMENT
	 * @model name="_3DimensionalMeasurement" literal="3-dimensional measurement"
	 * @generated
	 * @ordered
	 */
	public static final int _3DIMENSIONAL_MEASUREMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Measure Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsMeasureModeT[] VALUES_ARRAY =
		new GpsMeasureModeT[] {
			_2DIMENSIONAL_MEASUREMENT,
			_3DIMENSIONAL_MEASUREMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Measure Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsMeasureModeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Measure Mode T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsMeasureModeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsMeasureModeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Measure Mode T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsMeasureModeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsMeasureModeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Measure Mode T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsMeasureModeT get(int value) {
		switch (value) {
			case _2DIMENSIONAL_MEASUREMENT_VALUE: return _2DIMENSIONAL_MEASUREMENT;
			case _3DIMENSIONAL_MEASUREMENT_VALUE: return _3DIMENSIONAL_MEASUREMENT;
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
	private GpsMeasureModeT(int value, String name, String literal) {
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
	
} //GpsMeasureModeT
