/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>File Source T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getFileSourceT()
 * @model extendedMetaData="name='fileSource_t'"
 * @generated
 */
public enum FileSourceT implements Enumerator {
	/**
	 * The '<em><b>Others</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	OTHERS(0, "others", "others"),

	/**
	 * The '<em><b>Scanner Of Transparent Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANNER_OF_TRANSPARENT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SCANNER_OF_TRANSPARENT_TYPE(1, "scannerOfTransparentType", "scanner of transparent type"),

	/**
	 * The '<em><b>Scanner Of Reflex Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCANNER_OF_REFLEX_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SCANNER_OF_REFLEX_TYPE(2, "scannerOfReflexType", "scanner of reflex type"),

	/**
	 * The '<em><b>DSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSC_VALUE
	 * @generated
	 * @ordered
	 */
	DSC(3, "DSC", "DSC");

	/**
	 * The '<em><b>Others</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Others</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @model name="others"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERS_VALUE = 0;

	/**
	 * The '<em><b>Scanner Of Transparent Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scanner Of Transparent Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCANNER_OF_TRANSPARENT_TYPE
	 * @model name="scannerOfTransparentType" literal="scanner of transparent type"
	 * @generated
	 * @ordered
	 */
	public static final int SCANNER_OF_TRANSPARENT_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Scanner Of Reflex Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Scanner Of Reflex Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCANNER_OF_REFLEX_TYPE
	 * @model name="scannerOfReflexType" literal="scanner of reflex type"
	 * @generated
	 * @ordered
	 */
	public static final int SCANNER_OF_REFLEX_TYPE_VALUE = 2;

	/**
	 * The '<em><b>DSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSC_VALUE = 3;

	/**
	 * An array of all the '<em><b>File Source T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FileSourceT[] VALUES_ARRAY =
		new FileSourceT[] {
			OTHERS,
			SCANNER_OF_TRANSPARENT_TYPE,
			SCANNER_OF_REFLEX_TYPE,
			DSC,
		};

	/**
	 * A public read-only list of all the '<em><b>File Source T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FileSourceT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Source T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileSourceT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileSourceT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Source T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileSourceT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileSourceT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Source T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileSourceT get(int value) {
		switch (value) {
			case OTHERS_VALUE: return OTHERS;
			case SCANNER_OF_TRANSPARENT_TYPE_VALUE: return SCANNER_OF_TRANSPARENT_TYPE;
			case SCANNER_OF_REFLEX_TYPE_VALUE: return SCANNER_OF_REFLEX_TYPE;
			case DSC_VALUE: return DSC;
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
	private FileSourceT(int value, String name, String literal) {
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
	
} //FileSourceT
