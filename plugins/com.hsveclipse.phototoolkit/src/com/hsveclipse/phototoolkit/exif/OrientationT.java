/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Orientation T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getOrientationT()
 * @model extendedMetaData="name='orientation_t'"
 * @generated
 */
public enum OrientationT implements Enumerator {
	/**
	 * The '<em><b>Top Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_LEFT(0, "topLeft", "top left"),

	/**
	 * The '<em><b>Top Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_RIGHT(1, "topRight", "top right"),

	/**
	 * The '<em><b>Bottom Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_RIGHT(2, "bottomRight", "bottom right"),

	/**
	 * The '<em><b>Bottom Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_LEFT(3, "bottomLeft", "bottom left"),

	/**
	 * The '<em><b>Left Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_TOP(4, "leftTop", "left top"),

	/**
	 * The '<em><b>Right Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TOP(5, "rightTop", "right top"),

	/**
	 * The '<em><b>Right Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_BOTTOM(6, "rightBottom", "right bottom"),

	/**
	 * The '<em><b>Left Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_BOTTOM(7, "leftBottom", "left bottom");

	/**
	 * The '<em><b>Top Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_LEFT
	 * @model name="topLeft" literal="top left"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_LEFT_VALUE = 0;

	/**
	 * The '<em><b>Top Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Top Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP_RIGHT
	 * @model name="topRight" literal="top right"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>Bottom Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_RIGHT
	 * @model name="bottomRight" literal="bottom right"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_RIGHT_VALUE = 2;

	/**
	 * The '<em><b>Bottom Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottom Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_LEFT
	 * @model name="bottomLeft" literal="bottom left"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_LEFT_VALUE = 3;

	/**
	 * The '<em><b>Left Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_TOP
	 * @model name="leftTop" literal="left top"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_TOP_VALUE = 4;

	/**
	 * The '<em><b>Right Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TOP
	 * @model name="rightTop" literal="right top"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TOP_VALUE = 5;

	/**
	 * The '<em><b>Right Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Right Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_BOTTOM
	 * @model name="rightBottom" literal="right bottom"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_BOTTOM_VALUE = 6;

	/**
	 * The '<em><b>Left Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Left Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_BOTTOM
	 * @model name="leftBottom" literal="left bottom"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_BOTTOM_VALUE = 7;

	/**
	 * An array of all the '<em><b>Orientation T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrientationT[] VALUES_ARRAY =
		new OrientationT[] {
			TOP_LEFT,
			TOP_RIGHT,
			BOTTOM_RIGHT,
			BOTTOM_LEFT,
			LEFT_TOP,
			RIGHT_TOP,
			RIGHT_BOTTOM,
			LEFT_BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Orientation T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrientationT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Orientation T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrientationT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Orientation T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OrientationT get(int value) {
		switch (value) {
			case TOP_LEFT_VALUE: return TOP_LEFT;
			case TOP_RIGHT_VALUE: return TOP_RIGHT;
			case BOTTOM_RIGHT_VALUE: return BOTTOM_RIGHT;
			case BOTTOM_LEFT_VALUE: return BOTTOM_LEFT;
			case LEFT_TOP_VALUE: return LEFT_TOP;
			case RIGHT_TOP_VALUE: return RIGHT_TOP;
			case RIGHT_BOTTOM_VALUE: return RIGHT_BOTTOM;
			case LEFT_BOTTOM_VALUE: return LEFT_BOTTOM;
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
	private OrientationT(int value, String name, String literal) {
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
	
} //OrientationT
