/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Light Source T</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getLightSourceT()
 * @model extendedMetaData="name='lightSource_t'"
 * @generated
 */
public enum LightSourceT implements Enumerator {
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
	 * The '<em><b>Daylight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	DAYLIGHT(1, "Daylight", "Daylight"),

	/**
	 * The '<em><b>Fluorescent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	FLUORESCENT(2, "Fluorescent", "Fluorescent"),

	/**
	 * The '<em><b>Tungsten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUNGSTEN_VALUE
	 * @generated
	 * @ordered
	 */
	TUNGSTEN(3, "Tungsten", "Tungsten"),

	/**
	 * The '<em><b>Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLASH_VALUE
	 * @generated
	 * @ordered
	 */
	FLASH(4, "Flash", "Flash"),

	/**
	 * The '<em><b>Fine Weather</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINE_WEATHER_VALUE
	 * @generated
	 * @ordered
	 */
	FINE_WEATHER(5, "FineWeather", "Fine weather"),

	/**
	 * The '<em><b>Cloudy Weather</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUDY_WEATHER_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUDY_WEATHER(6, "CloudyWeather", "Cloudy weather"),

	/**
	 * The '<em><b>Shade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADE_VALUE
	 * @generated
	 * @ordered
	 */
	SHADE(7, "Shade", "Shade"),

	/**
	 * The '<em><b>Daylight Fluorescent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAYLIGHT_FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	DAYLIGHT_FLUORESCENT(8, "DaylightFluorescent", "Daylight fluorescent"),

	/**
	 * The '<em><b>Day White Fluorescent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_WHITE_FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	DAY_WHITE_FLUORESCENT(9, "DayWhiteFluorescent", "Day white fluorescent"),

	/**
	 * The '<em><b>Cool White Fluorescent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOL_WHITE_FLUORESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	COOL_WHITE_FLUORESCENT(10, "CoolWhiteFluorescent", "Cool white fluorescent"),

	/**
	 * The '<em><b>Standard Light A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_A_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_LIGHT_A(11, "StandardLightA", "Standard light A"),

	/**
	 * The '<em><b>Standard Light B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_B_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_LIGHT_B(12, "StandardLightB", "Standard light B"),

	/**
	 * The '<em><b>Standard Light C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_C_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_LIGHT_C(13, "StandardLightC", "Standard light C"),

	/**
	 * The '<em><b>D55</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D55_VALUE
	 * @generated
	 * @ordered
	 */
	D55(14, "D55", "D55"),

	/**
	 * The '<em><b>D65</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D65_VALUE
	 * @generated
	 * @ordered
	 */
	D65(15, "D65", "D65"),

	/**
	 * The '<em><b>D75</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D75_VALUE
	 * @generated
	 * @ordered
	 */
	D75(16, "D75", "D75"),

	/**
	 * The '<em><b>D50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #D50_VALUE
	 * @generated
	 * @ordered
	 */
	D50(17, "D50", "D50"),

	/**
	 * The '<em><b>ISO Studio Tungsten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ISO_STUDIO_TUNGSTEN_VALUE
	 * @generated
	 * @ordered
	 */
	ISO_STUDIO_TUNGSTEN(18, "ISOStudioTungsten", "ISO studio tungsten"),

	/**
	 * The '<em><b>Other Light Source</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_LIGHT_SOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_LIGHT_SOURCE(19, "otherLightSource", "other light source");

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
	 * The '<em><b>Daylight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Daylight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAYLIGHT
	 * @model name="Daylight"
	 * @generated
	 * @ordered
	 */
	public static final int DAYLIGHT_VALUE = 1;

	/**
	 * The '<em><b>Fluorescent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fluorescent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLUORESCENT
	 * @model name="Fluorescent"
	 * @generated
	 * @ordered
	 */
	public static final int FLUORESCENT_VALUE = 2;

	/**
	 * The '<em><b>Tungsten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tungsten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TUNGSTEN
	 * @model name="Tungsten"
	 * @generated
	 * @ordered
	 */
	public static final int TUNGSTEN_VALUE = 3;

	/**
	 * The '<em><b>Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flash</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLASH
	 * @model name="Flash"
	 * @generated
	 * @ordered
	 */
	public static final int FLASH_VALUE = 4;

	/**
	 * The '<em><b>Fine Weather</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fine Weather</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINE_WEATHER
	 * @model name="FineWeather" literal="Fine weather"
	 * @generated
	 * @ordered
	 */
	public static final int FINE_WEATHER_VALUE = 5;

	/**
	 * The '<em><b>Cloudy Weather</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cloudy Weather</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOUDY_WEATHER
	 * @model name="CloudyWeather" literal="Cloudy weather"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUDY_WEATHER_VALUE = 6;

	/**
	 * The '<em><b>Shade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Shade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADE
	 * @model name="Shade"
	 * @generated
	 * @ordered
	 */
	public static final int SHADE_VALUE = 7;

	/**
	 * The '<em><b>Daylight Fluorescent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Daylight Fluorescent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAYLIGHT_FLUORESCENT
	 * @model name="DaylightFluorescent" literal="Daylight fluorescent"
	 * @generated
	 * @ordered
	 */
	public static final int DAYLIGHT_FLUORESCENT_VALUE = 8;

	/**
	 * The '<em><b>Day White Fluorescent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Day White Fluorescent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY_WHITE_FLUORESCENT
	 * @model name="DayWhiteFluorescent" literal="Day white fluorescent"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_WHITE_FLUORESCENT_VALUE = 9;

	/**
	 * The '<em><b>Cool White Fluorescent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cool White Fluorescent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOL_WHITE_FLUORESCENT
	 * @model name="CoolWhiteFluorescent" literal="Cool white fluorescent"
	 * @generated
	 * @ordered
	 */
	public static final int COOL_WHITE_FLUORESCENT_VALUE = 10;

	/**
	 * The '<em><b>Standard Light A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Light A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_A
	 * @model name="StandardLightA" literal="Standard light A"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_LIGHT_A_VALUE = 11;

	/**
	 * The '<em><b>Standard Light B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Light B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_B
	 * @model name="StandardLightB" literal="Standard light B"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_LIGHT_B_VALUE = 12;

	/**
	 * The '<em><b>Standard Light C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Light C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_LIGHT_C
	 * @model name="StandardLightC" literal="Standard light C"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_LIGHT_C_VALUE = 13;

	/**
	 * The '<em><b>D55</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D55</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D55
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D55_VALUE = 14;

	/**
	 * The '<em><b>D65</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D65</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D65
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D65_VALUE = 15;

	/**
	 * The '<em><b>D75</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D75</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D75
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D75_VALUE = 16;

	/**
	 * The '<em><b>D50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>D50</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #D50
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int D50_VALUE = 17;

	/**
	 * The '<em><b>ISO Studio Tungsten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ISO Studio Tungsten</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ISO_STUDIO_TUNGSTEN
	 * @model name="ISOStudioTungsten" literal="ISO studio tungsten"
	 * @generated
	 * @ordered
	 */
	public static final int ISO_STUDIO_TUNGSTEN_VALUE = 18;

	/**
	 * The '<em><b>Other Light Source</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Light Source</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_LIGHT_SOURCE
	 * @model name="otherLightSource" literal="other light source"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_LIGHT_SOURCE_VALUE = 19;

	/**
	 * An array of all the '<em><b>Light Source T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LightSourceT[] VALUES_ARRAY =
		new LightSourceT[] {
			UNKNOWN,
			DAYLIGHT,
			FLUORESCENT,
			TUNGSTEN,
			FLASH,
			FINE_WEATHER,
			CLOUDY_WEATHER,
			SHADE,
			DAYLIGHT_FLUORESCENT,
			DAY_WHITE_FLUORESCENT,
			COOL_WHITE_FLUORESCENT,
			STANDARD_LIGHT_A,
			STANDARD_LIGHT_B,
			STANDARD_LIGHT_C,
			D55,
			D65,
			D75,
			D50,
			ISO_STUDIO_TUNGSTEN,
			OTHER_LIGHT_SOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Light Source T</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LightSourceT> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Light Source T</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LightSourceT get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LightSourceT result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Light Source T</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LightSourceT getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LightSourceT result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Light Source T</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LightSourceT get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case DAYLIGHT_VALUE: return DAYLIGHT;
			case FLUORESCENT_VALUE: return FLUORESCENT;
			case TUNGSTEN_VALUE: return TUNGSTEN;
			case FLASH_VALUE: return FLASH;
			case FINE_WEATHER_VALUE: return FINE_WEATHER;
			case CLOUDY_WEATHER_VALUE: return CLOUDY_WEATHER;
			case SHADE_VALUE: return SHADE;
			case DAYLIGHT_FLUORESCENT_VALUE: return DAYLIGHT_FLUORESCENT;
			case DAY_WHITE_FLUORESCENT_VALUE: return DAY_WHITE_FLUORESCENT;
			case COOL_WHITE_FLUORESCENT_VALUE: return COOL_WHITE_FLUORESCENT;
			case STANDARD_LIGHT_A_VALUE: return STANDARD_LIGHT_A;
			case STANDARD_LIGHT_B_VALUE: return STANDARD_LIGHT_B;
			case STANDARD_LIGHT_C_VALUE: return STANDARD_LIGHT_C;
			case D55_VALUE: return D55;
			case D65_VALUE: return D65;
			case D75_VALUE: return D75;
			case D50_VALUE: return D50;
			case ISO_STUDIO_TUNGSTEN_VALUE: return ISO_STUDIO_TUNGSTEN;
			case OTHER_LIGHT_SOURCE_VALUE: return OTHER_LIGHT_SOURCE;
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
	private LightSourceT(int value, String name, String literal) {
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
	
} //LightSourceT
