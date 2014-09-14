/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Exposure Program T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getExposureProgramT()
 * @model extendedMetaData="name='exposureProgram_t'"
 * @generated
 */
public enum ExposureProgramT implements Enumerator {
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
	 * The '<em><b>Manual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MANUAL(1, "Manual", "Manual"),

	/**
	 * The '<em><b>Normal Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL_PROGRAM(2, "NormalProgram", "Normal program"),

	/**
	 * The '<em><b>Aperture Priority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APERTURE_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	APERTURE_PRIORITY(3, "AperturePriority", "Aperture priority"),

	/**
	 * The '<em><b>Shutter Priority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTER_PRIORITY_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTER_PRIORITY(4, "ShutterPriority", "Shutter priority"),

	/**
	 * The '<em><b>Creative Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATIVE_PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	CREATIVE_PROGRAM(5, "CreativeProgram", "Creative program"),

	/**
	 * The '<em><b>Action Program</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTION_PROGRAM_VALUE
	 * @generated
	 * @ordered
	 */
	ACTION_PROGRAM(6, "ActionProgram", "Action program"),

	/**
	 * The '<em><b>Portrait Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	PORTRAIT_MODE(7, "PortraitMode", "Portrait mode"),

	/**
	 * The '<em><b>Landscape Mode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	LANDSCAPE_MODE(8, "LandscapeMode", "Landscape mode");

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
	 * The '<em><b>Manual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANUAL
	 * @model name="Manual"
	 * @generated
	 * @ordered
	 */
	public static final int MANUAL_VALUE = 1;

	/**
	 * The '<em><b>Normal Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Normal Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL_PROGRAM
	 * @model name="NormalProgram" literal="Normal program"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_PROGRAM_VALUE = 2;

	/**
	 * The '<em><b>Aperture Priority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aperture Priority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APERTURE_PRIORITY
	 * @model name="AperturePriority" literal="Aperture priority"
	 * @generated
	 * @ordered
	 */
	public static final int APERTURE_PRIORITY_VALUE = 3;

	/**
	 * The '<em><b>Shutter Priority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shutter Priority</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUTTER_PRIORITY
	 * @model name="ShutterPriority" literal="Shutter priority"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTER_PRIORITY_VALUE = 4;

	/**
	 * The '<em><b>Creative Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Creative Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATIVE_PROGRAM
	 * @model name="CreativeProgram" literal="Creative program"
	 * @generated
	 * @ordered
	 */
	public static final int CREATIVE_PROGRAM_VALUE = 5;

	/**
	 * The '<em><b>Action Program</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Action Program</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTION_PROGRAM
	 * @model name="ActionProgram" literal="Action program"
	 * @generated
	 * @ordered
	 */
	public static final int ACTION_PROGRAM_VALUE = 6;

	/**
	 * The '<em><b>Portrait Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Portrait Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORTRAIT_MODE
	 * @model name="PortraitMode" literal="Portrait mode"
	 * @generated
	 * @ordered
	 */
	public static final int PORTRAIT_MODE_VALUE = 7;

	/**
	 * The '<em><b>Landscape Mode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Landscape Mode</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANDSCAPE_MODE
	 * @model name="LandscapeMode" literal="Landscape mode"
	 * @generated
	 * @ordered
	 */
	public static final int LANDSCAPE_MODE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Exposure Program T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExposureProgramT[] VALUES_ARRAY =
		new ExposureProgramT[] {
			NOT_DEFINED,
			MANUAL,
			NORMAL_PROGRAM,
			APERTURE_PRIORITY,
			SHUTTER_PRIORITY,
			CREATIVE_PROGRAM,
			ACTION_PROGRAM,
			PORTRAIT_MODE,
			LANDSCAPE_MODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Exposure Program T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExposureProgramT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exposure Program T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureProgramT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureProgramT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Program T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureProgramT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExposureProgramT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exposure Program T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExposureProgramT get(int value) {
		switch (value) {
			case NOT_DEFINED_VALUE: return NOT_DEFINED;
			case MANUAL_VALUE: return MANUAL;
			case NORMAL_PROGRAM_VALUE: return NORMAL_PROGRAM;
			case APERTURE_PRIORITY_VALUE: return APERTURE_PRIORITY;
			case SHUTTER_PRIORITY_VALUE: return SHUTTER_PRIORITY;
			case CREATIVE_PROGRAM_VALUE: return CREATIVE_PROGRAM;
			case ACTION_PROGRAM_VALUE: return ACTION_PROGRAM;
			case PORTRAIT_MODE_VALUE: return PORTRAIT_MODE;
			case LANDSCAPE_MODE_VALUE: return LANDSCAPE_MODE;
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
	private ExposureProgramT(int value, String name, String literal) {
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
	
} //ExposureProgramT
