/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exposure Mode T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExposureModeT()
 * @model extendedMetaData="name='exposureMode_t'"
 * @generated
 */
public enum ExposureModeT implements Enumerator {
	/**
	 * The '<em><b>Auto Exposure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_EXPOSURE(0, "AutoExposure", "Auto exposure"),

	/**
	 * The '<em><b>Manual Exposure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_EXPOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL_EXPOSURE(1, "ManualExposure", "Manual exposure"),

	/**
	 * The '<em><b>Auto Bracket</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_BRACKET_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_BRACKET(2, "AutoBracket", "Auto bracket");

	/**
	 * The '<em><b>Auto Exposure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto Exposure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_EXPOSURE
	 * @model name="AutoExposure" literal="Auto exposure"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_EXPOSURE_VALUE = 0;

	/**
	 * The '<em><b>Manual Exposure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual Exposure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL_EXPOSURE
	 * @model name="ManualExposure" literal="Manual exposure"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_EXPOSURE_VALUE = 1;

	/**
	 * The '<em><b>Auto Bracket</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto Bracket</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_BRACKET
	 * @model name="AutoBracket" literal="Auto bracket"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_BRACKET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Exposure Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExposureModeT[] VALUES_ARRAY =
		new ExposureModeT[] {
			AUTO_EXPOSURE,
			MANUAL_EXPOSURE,
			AUTO_BRACKET,
		};

	/**
	 * A public read-only list of all the '<em><b>Exposure Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExposureModeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exposure Mode T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureModeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureModeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Mode T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureModeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureModeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Mode T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureModeT get(int value) {
		switch (value) {
			case AUTO_EXPOSURE_VALUE: return AUTO_EXPOSURE;
			case MANUAL_EXPOSURE_VALUE: return MANUAL_EXPOSURE;
			case AUTO_BRACKET_VALUE: return AUTO_BRACKET;
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
	private ExposureModeT(int value, String name, String literal) {
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
	
} //ExposureModeT
