/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Flash Mode T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashModeT()
 * @model extendedMetaData="name='flashMode_t'"
 * @generated
 */
public enum FlashModeT implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Compulsory Firing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_FIRING_VALUE
	 * @generated
	 * @ordered
	 */
	COMPULSORY_FIRING(1, "CompulsoryFiring", "Compulsory firing"),

	/**
	 * The '<em><b>Compulsory Suppression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_SUPPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPULSORY_SUPPRESSION(2, "CompulsorySuppression", "Compulsory suppression"),

	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(3, "Auto", "Auto");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Compulsory Firing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compulsory Firing</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_FIRING
	 * @model name="CompulsoryFiring" literal="Compulsory firing"
	 * @generated
	 * @ordered
	 */
	public static final int COMPULSORY_FIRING_VALUE = 1;

	/**
	 * The '<em><b>Compulsory Suppression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compulsory Suppression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_SUPPRESSION
	 * @model name="CompulsorySuppression" literal="Compulsory suppression"
	 * @generated
	 * @ordered
	 */
	public static final int COMPULSORY_SUPPRESSION_VALUE = 2;

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="Auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 3;

	/**
	 * An array of all the '<em><b>Flash Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlashModeT[] VALUES_ARRAY =
		new FlashModeT[] {
			UNKNOWN,
			COMPULSORY_FIRING,
			COMPULSORY_SUPPRESSION,
			AUTO,
		};

	/**
	 * A public read-only list of all the '<em><b>Flash Mode T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlashModeT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flash Mode T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlashModeT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlashModeT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flash Mode T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlashModeT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlashModeT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flash Mode T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FlashModeT get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case COMPULSORY_FIRING_VALUE: return COMPULSORY_FIRING;
			case COMPULSORY_SUPPRESSION_VALUE: return COMPULSORY_SUPPRESSION;
			case AUTO_VALUE: return AUTO;
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
	private FlashModeT(int value, String name, String literal) {
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
	
} //FlashModeT
