/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensing Method T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSensingMethodT()
 * @model extendedMetaData="name='sensingMethod_t'"
 * @generated
 */
public enum SensingMethodT implements Enumerator {
	/**
	 * The '<em><b>Not Defined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_DEFINED(0, "NotDefined", "Not defined"),

	/**
	 * The '<em><b>One Chip Color Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_CHIP_COLOR_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_CHIP_COLOR_AREA(1, "OneChipColorArea", "One-chip color area"),

	/**
	 * The '<em><b>Two Chip Color Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWO_CHIP_COLOR_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	TWO_CHIP_COLOR_AREA(2, "TwoChipColorArea", "Two-chip color area"),

	/**
	 * The '<em><b>Three Chip Color Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THREE_CHIP_COLOR_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	THREE_CHIP_COLOR_AREA(3, "ThreeChipColorArea", "Three-chip color area"),

	/**
	 * The '<em><b>Color Sequential Area</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_SEQUENTIAL_AREA_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_SEQUENTIAL_AREA(4, "ColorSequentialArea", "Color-sequential area"),

	/**
	 * The '<em><b>Trilinear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRILINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	TRILINEAR(5, "Trilinear", "Trilinear"),

	/**
	 * The '<em><b>Color Sequential Linear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_SEQUENTIAL_LINEAR_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_SEQUENTIAL_LINEAR(6, "ColorSequentialLinear", "Color sequential linear");

	/**
	 * The '<em><b>Not Defined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Defined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_DEFINED
	 * @model name="NotDefined" literal="Not defined"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_DEFINED_VALUE = 0;

	/**
	 * The '<em><b>One Chip Color Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>One Chip Color Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE_CHIP_COLOR_AREA
	 * @model name="OneChipColorArea" literal="One-chip color area"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_CHIP_COLOR_AREA_VALUE = 1;

	/**
	 * The '<em><b>Two Chip Color Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Two Chip Color Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWO_CHIP_COLOR_AREA
	 * @model name="TwoChipColorArea" literal="Two-chip color area"
	 * @generated
	 * @ordered
	 */
	public static final int TWO_CHIP_COLOR_AREA_VALUE = 2;

	/**
	 * The '<em><b>Three Chip Color Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Three Chip Color Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #THREE_CHIP_COLOR_AREA
	 * @model name="ThreeChipColorArea" literal="Three-chip color area"
	 * @generated
	 * @ordered
	 */
	public static final int THREE_CHIP_COLOR_AREA_VALUE = 3;

	/**
	 * The '<em><b>Color Sequential Area</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Color Sequential Area</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_SEQUENTIAL_AREA
	 * @model name="ColorSequentialArea" literal="Color-sequential area"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_SEQUENTIAL_AREA_VALUE = 4;

	/**
	 * The '<em><b>Trilinear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Trilinear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRILINEAR
	 * @model name="Trilinear"
	 * @generated
	 * @ordered
	 */
	public static final int TRILINEAR_VALUE = 5;

	/**
	 * The '<em><b>Color Sequential Linear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Color Sequential Linear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_SEQUENTIAL_LINEAR
	 * @model name="ColorSequentialLinear" literal="Color sequential linear"
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_SEQUENTIAL_LINEAR_VALUE = 6;

	/**
	 * An array of all the '<em><b>Sensing Method T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensingMethodT[] VALUES_ARRAY =
		new SensingMethodT[] {
			NOT_DEFINED,
			ONE_CHIP_COLOR_AREA,
			TWO_CHIP_COLOR_AREA,
			THREE_CHIP_COLOR_AREA,
			COLOR_SEQUENTIAL_AREA,
			TRILINEAR,
			COLOR_SEQUENTIAL_LINEAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensing Method T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensingMethodT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensing Method T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingMethodT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingMethodT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensing Method T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingMethodT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensingMethodT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensing Method T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensingMethodT get(int value) {
		switch (value) {
			case NOT_DEFINED_VALUE: return NOT_DEFINED;
			case ONE_CHIP_COLOR_AREA_VALUE: return ONE_CHIP_COLOR_AREA;
			case TWO_CHIP_COLOR_AREA_VALUE: return TWO_CHIP_COLOR_AREA;
			case THREE_CHIP_COLOR_AREA_VALUE: return THREE_CHIP_COLOR_AREA;
			case COLOR_SEQUENTIAL_AREA_VALUE: return COLOR_SEQUENTIAL_AREA;
			case TRILINEAR_VALUE: return TRILINEAR;
			case COLOR_SEQUENTIAL_LINEAR_VALUE: return COLOR_SEQUENTIAL_LINEAR;
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
	private SensingMethodT(int value, String name, String literal) {
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
	
} //SensingMethodT
