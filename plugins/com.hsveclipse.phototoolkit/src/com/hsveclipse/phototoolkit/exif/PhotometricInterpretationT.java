/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Photometric Interpretation T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPhotometricInterpretationT()
 * @model extendedMetaData="name='photometricInterpretation_t'"
 * @generated
 */
public enum PhotometricInterpretationT implements Enumerator {
	/**
	 * The '<em><b>RGB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RGB_VALUE
	 * @generated
	 * @ordered
	 */
	RGB(0, "RGB", "RGB"),

	/**
	 * The '<em><b>YCb Cr</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YCB_CR_VALUE
	 * @generated
	 * @ordered
	 */
	YCB_CR(1, "YCbCr", "YCbCr");

	/**
	 * The '<em><b>RGB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RGB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RGB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RGB_VALUE = 0;

	/**
	 * The '<em><b>YCb Cr</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YCb Cr</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YCB_CR
	 * @model name="YCbCr"
	 * @generated
	 * @ordered
	 */
	public static final int YCB_CR_VALUE = 1;

	/**
	 * An array of all the '<em><b>Photometric Interpretation T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PhotometricInterpretationT[] VALUES_ARRAY =
		new PhotometricInterpretationT[] {
			RGB,
			YCB_CR,
		};

	/**
	 * A public read-only list of all the '<em><b>Photometric Interpretation T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PhotometricInterpretationT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Photometric Interpretation T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotometricInterpretationT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhotometricInterpretationT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Photometric Interpretation T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotometricInterpretationT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PhotometricInterpretationT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Photometric Interpretation T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhotometricInterpretationT get(int value) {
		switch (value) {
			case RGB_VALUE: return RGB;
			case YCB_CR_VALUE: return YCB_CR;
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
	private PhotometricInterpretationT(int value, String name, String literal) {
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
	
} //PhotometricInterpretationT
