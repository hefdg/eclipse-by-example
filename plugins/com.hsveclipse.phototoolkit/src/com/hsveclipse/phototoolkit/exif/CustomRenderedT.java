/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Custom Rendered T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getCustomRenderedT()
 * @model extendedMetaData="name='customRendered_t'"
 * @generated
 */
public enum CustomRenderedT implements Enumerator {
	/**
	 * The '<em><b>Normal Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_PROCESS(0, "NormalProcess", "Normal process"),

	/**
	 * The '<em><b>Custom Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_PROCESS(1, "CustomProcess", "Custom process");

	/**
	 * The '<em><b>Normal Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normal Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL_PROCESS
	 * @model name="NormalProcess" literal="Normal process"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_PROCESS_VALUE = 0;

	/**
	 * The '<em><b>Custom Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom Process</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_PROCESS
	 * @model name="CustomProcess" literal="Custom process"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_PROCESS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Custom Rendered T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CustomRenderedT[] VALUES_ARRAY =
		new CustomRenderedT[] {
			NORMAL_PROCESS,
			CUSTOM_PROCESS,
		};

	/**
	 * A public read-only list of all the '<em><b>Custom Rendered T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CustomRenderedT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Custom Rendered T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomRenderedT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomRenderedT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Rendered T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomRenderedT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CustomRenderedT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Custom Rendered T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomRenderedT get(int value) {
		switch (value) {
			case NORMAL_PROCESS_VALUE: return NORMAL_PROCESS;
			case CUSTOM_PROCESS_VALUE: return CUSTOM_PROCESS;
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
	private CustomRenderedT(int value, String name, String literal) {
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
	
} //CustomRenderedT
