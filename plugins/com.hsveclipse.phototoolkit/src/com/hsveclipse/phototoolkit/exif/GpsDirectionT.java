/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gps Direction T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getGpsDirectionT()
 * @model extendedMetaData="name='gpsDirection_t'"
 * @generated
 */
public enum GpsDirectionT implements Enumerator {
	/**
	 * The '<em><b>True Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUE_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRUE_DIRECTION(0, "TrueDirection", "True direction"),

	/**
	 * The '<em><b>Magnetic Direction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGNETIC_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	MAGNETIC_DIRECTION(1, "MagneticDirection", "Magnetic direction");

	/**
	 * The '<em><b>True Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>True Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRUE_DIRECTION
	 * @model name="TrueDirection" literal="True direction"
	 * @generated
	 * @ordered
	 */
	public static final int TRUE_DIRECTION_VALUE = 0;

	/**
	 * The '<em><b>Magnetic Direction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magnetic Direction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGNETIC_DIRECTION
	 * @model name="MagneticDirection" literal="Magnetic direction"
	 * @generated
	 * @ordered
	 */
	public static final int MAGNETIC_DIRECTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gps Direction T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GpsDirectionT[] VALUES_ARRAY =
		new GpsDirectionT[] {
			TRUE_DIRECTION,
			MAGNETIC_DIRECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Gps Direction T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GpsDirectionT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gps Direction T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDirectionT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDirectionT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Direction T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDirectionT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GpsDirectionT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gps Direction T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GpsDirectionT get(int value) {
		switch (value) {
			case TRUE_DIRECTION_VALUE: return TRUE_DIRECTION;
			case MAGNETIC_DIRECTION_VALUE: return MAGNETIC_DIRECTION;
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
	private GpsDirectionT(int value, String name, String literal) {
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
	
} //GpsDirectionT
