/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>YCb Cr Sub Sampling T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getYCbCrSubSamplingT()
 * @model extendedMetaData="name='yCbCrSubSampling_t'"
 * @generated
 */
public enum YCbCrSubSamplingT implements Enumerator {
	/**
	 * The '<em><b>422</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_422_VALUE
	 * @generated
	 * @ordered
	 */
	_422(0, "_422", "4:2:2"),

	/**
	 * The '<em><b>420</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_420_VALUE
	 * @generated
	 * @ordered
	 */
	_420(1, "_420", "4:2:0");

	/**
	 * The '<em><b>422</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>422</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_422
	 * @model literal="4:2:2"
	 * @generated
	 * @ordered
	 */
	public static final int _422_VALUE = 0;

	/**
	 * The '<em><b>420</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>420</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_420
	 * @model literal="4:2:0"
	 * @generated
	 * @ordered
	 */
	public static final int _420_VALUE = 1;

	/**
	 * An array of all the '<em><b>YCb Cr Sub Sampling T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final YCbCrSubSamplingT[] VALUES_ARRAY =
		new YCbCrSubSamplingT[] {
			_422,
			_420,
		};

	/**
	 * A public read-only list of all the '<em><b>YCb Cr Sub Sampling T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<YCbCrSubSamplingT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>YCb Cr Sub Sampling T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrSubSamplingT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YCbCrSubSamplingT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YCb Cr Sub Sampling T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrSubSamplingT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			YCbCrSubSamplingT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>YCb Cr Sub Sampling T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YCbCrSubSamplingT get(int value) {
		switch (value) {
			case _422_VALUE: return _422;
			case _420_VALUE: return _420;
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
	private YCbCrSubSamplingT(int value, String name, String literal) {
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
	
} //YCbCrSubSamplingT
