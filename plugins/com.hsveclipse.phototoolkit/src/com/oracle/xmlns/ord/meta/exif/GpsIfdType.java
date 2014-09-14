/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gps Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSVersionID <em>GPS Version ID</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLatitudeRef <em>GPS Latitude Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLatitude <em>GPS Latitude</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLongitudeRef <em>GPS Longitude Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLongitude <em>GPS Longitude</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAltitudeRef <em>GPS Altitude Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAltitude <em>GPS Altitude</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTimeStamp <em>GPS Time Stamp</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSatellites <em>GPS Satellites</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSStatus <em>GPS Status</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSMeasureMode <em>GPS Measure Mode</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDOP <em>GPSDOP</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSpeedRef <em>GPS Speed Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSpeed <em>GPS Speed</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTrackRef <em>GPS Track Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTrack <em>GPS Track</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSImgDirectionRef <em>GPS Img Direction Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSImgDirection <em>GPS Img Direction</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSMapDatum <em>GPS Map Datum</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLatitudeRef <em>GPS Dest Latitude Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLatitude <em>GPS Dest Latitude</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLongitudeRef <em>GPS Dest Longitude Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLongitude <em>GPS Dest Longitude</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestBearingRef <em>GPS Dest Bearing Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestBearing <em>GPS Dest Bearing</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestDistanceRef <em>GPS Dest Distance Ref</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestDistance <em>GPS Dest Distance</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSProcessingMethod <em>GPS Processing Method</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAreaInformation <em>GPS Area Information</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDateStamp <em>GPS Date Stamp</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDifferential <em>GPS Differential</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField1 <em>GPS Field1</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField2 <em>GPS Field2</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField3 <em>GPS Field3</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType()
 * @model extendedMetaData="name='GpsIfd_._type' kind='elementOnly'"
 * @generated
 */
public interface GpsIfdType extends EObject {
	/**
	 * Returns the value of the '<em><b>GPS Version ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Version ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Version ID</em>' containment reference.
	 * @see #setGPSVersionID(StringType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSVersionID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GPSVersionID' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getGPSVersionID();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSVersionID <em>GPS Version ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Version ID</em>' containment reference.
	 * @see #getGPSVersionID()
	 * @generated
	 */
	void setGPSVersionID(StringType value);

	/**
	 * Returns the value of the '<em><b>GPS Latitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Latitude Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Latitude Ref</em>' containment reference.
	 * @see #setGPSLatitudeRef(GpsLatitudeRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSLatitudeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSLatitudeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLatitudeRefType getGPSLatitudeRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLatitudeRef <em>GPS Latitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Latitude Ref</em>' containment reference.
	 * @see #getGPSLatitudeRef()
	 * @generated
	 */
	void setGPSLatitudeRef(GpsLatitudeRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit is decimal degrees
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GPS Latitude</em>' containment reference.
	 * @see #setGPSLatitude(GpsLatitudeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSLatitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLatitudeType getGPSLatitude();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLatitude <em>GPS Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Latitude</em>' containment reference.
	 * @see #getGPSLatitude()
	 * @generated
	 */
	void setGPSLatitude(GpsLatitudeType value);

	/**
	 * Returns the value of the '<em><b>GPS Longitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Longitude Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Longitude Ref</em>' containment reference.
	 * @see #setGPSLongitudeRef(GpsLongitudeRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSLongitudeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSLongitudeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLongitudeRefType getGPSLongitudeRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLongitudeRef <em>GPS Longitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Longitude Ref</em>' containment reference.
	 * @see #getGPSLongitudeRef()
	 * @generated
	 */
	void setGPSLongitudeRef(GpsLongitudeRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit is decimal degrees
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GPS Longitude</em>' containment reference.
	 * @see #setGPSLongitude(GpsLongitudeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSLongitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLongitudeType getGPSLongitude();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSLongitude <em>GPS Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Longitude</em>' containment reference.
	 * @see #getGPSLongitude()
	 * @generated
	 */
	void setGPSLongitude(GpsLongitudeType value);

	/**
	 * Returns the value of the '<em><b>GPS Altitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Altitude Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Altitude Ref</em>' containment reference.
	 * @see #setGPSAltitudeRef(GpsAltitudeRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSAltitudeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSAltitudeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsAltitudeRefType getGPSAltitudeRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAltitudeRef <em>GPS Altitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Altitude Ref</em>' containment reference.
	 * @see #getGPSAltitudeRef()
	 * @generated
	 */
	void setGPSAltitudeRef(GpsAltitudeRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit is meters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GPS Altitude</em>' containment reference.
	 * @see #setGPSAltitude(NonNegativeRealType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSAltitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getGPSAltitude();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAltitude <em>GPS Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Altitude</em>' containment reference.
	 * @see #getGPSAltitude()
	 * @generated
	 */
	void setGPSAltitude(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>GPS Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Time Stamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Time Stamp</em>' containment reference.
	 * @see #setGPSTimeStamp(TimeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSTimeStamp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSTimeStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeType getGPSTimeStamp();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTimeStamp <em>GPS Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Time Stamp</em>' containment reference.
	 * @see #getGPSTimeStamp()
	 * @generated
	 */
	void setGPSTimeStamp(TimeType value);

	/**
	 * Returns the value of the '<em><b>GPS Satellites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Satellites</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Satellites</em>' containment reference.
	 * @see #setGPSSatellites(StringType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSSatellites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSSatellites' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getGPSSatellites();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSatellites <em>GPS Satellites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Satellites</em>' containment reference.
	 * @see #getGPSSatellites()
	 * @generated
	 */
	void setGPSSatellites(StringType value);

	/**
	 * Returns the value of the '<em><b>GPS Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Status</em>' containment reference.
	 * @see #setGPSStatus(GpsStatusType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsStatusType getGPSStatus();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSStatus <em>GPS Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Status</em>' containment reference.
	 * @see #getGPSStatus()
	 * @generated
	 */
	void setGPSStatus(GpsStatusType value);

	/**
	 * Returns the value of the '<em><b>GPS Measure Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Measure Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Measure Mode</em>' containment reference.
	 * @see #setGPSMeasureMode(GpsMeasureModeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSMeasureMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSMeasureMode' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsMeasureModeType getGPSMeasureMode();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSMeasureMode <em>GPS Measure Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Measure Mode</em>' containment reference.
	 * @see #getGPSMeasureMode()
	 * @generated
	 */
	void setGPSMeasureMode(GpsMeasureModeType value);

	/**
	 * Returns the value of the '<em><b>GPSDOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPSDOP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPSDOP</em>' containment reference.
	 * @see #setGPSDOP(NonNegativeRealType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDOP()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDOP' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getGPSDOP();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDOP <em>GPSDOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPSDOP</em>' containment reference.
	 * @see #getGPSDOP()
	 * @generated
	 */
	void setGPSDOP(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>GPS Speed Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Speed Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Speed Ref</em>' containment reference.
	 * @see #setGPSSpeedRef(GpsSpeedRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSSpeedRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSSpeedRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsSpeedRefType getGPSSpeedRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSpeedRef <em>GPS Speed Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Speed Ref</em>' containment reference.
	 * @see #getGPSSpeedRef()
	 * @generated
	 */
	void setGPSSpeedRef(GpsSpeedRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Speed</em>' containment reference.
	 * @see #setGPSSpeed(NonNegativeRealType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSSpeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSSpeed' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getGPSSpeed();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSSpeed <em>GPS Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Speed</em>' containment reference.
	 * @see #getGPSSpeed()
	 * @generated
	 */
	void setGPSSpeed(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>GPS Track Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Track Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Track Ref</em>' containment reference.
	 * @see #setGPSTrackRef(GpsDirectionType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSTrackRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSTrackRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsDirectionType getGPSTrackRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTrackRef <em>GPS Track Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Track Ref</em>' containment reference.
	 * @see #getGPSTrackRef()
	 * @generated
	 */
	void setGPSTrackRef(GpsDirectionType value);

	/**
	 * Returns the value of the '<em><b>GPS Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Track</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Track</em>' containment reference.
	 * @see #setGPSTrack(GpsBearingType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSTrack()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSTrack' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsBearingType getGPSTrack();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSTrack <em>GPS Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Track</em>' containment reference.
	 * @see #getGPSTrack()
	 * @generated
	 */
	void setGPSTrack(GpsBearingType value);

	/**
	 * Returns the value of the '<em><b>GPS Img Direction Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Img Direction Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Img Direction Ref</em>' containment reference.
	 * @see #setGPSImgDirectionRef(GpsDirectionType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSImgDirectionRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSImgDirectionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsDirectionType getGPSImgDirectionRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSImgDirectionRef <em>GPS Img Direction Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Img Direction Ref</em>' containment reference.
	 * @see #getGPSImgDirectionRef()
	 * @generated
	 */
	void setGPSImgDirectionRef(GpsDirectionType value);

	/**
	 * Returns the value of the '<em><b>GPS Img Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Img Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Img Direction</em>' containment reference.
	 * @see #setGPSImgDirection(GpsBearingType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSImgDirection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSImgDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsBearingType getGPSImgDirection();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSImgDirection <em>GPS Img Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Img Direction</em>' containment reference.
	 * @see #getGPSImgDirection()
	 * @generated
	 */
	void setGPSImgDirection(GpsBearingType value);

	/**
	 * Returns the value of the '<em><b>GPS Map Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Map Datum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Map Datum</em>' containment reference.
	 * @see #setGPSMapDatum(StringType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSMapDatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSMapDatum' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getGPSMapDatum();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSMapDatum <em>GPS Map Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Map Datum</em>' containment reference.
	 * @see #getGPSMapDatum()
	 * @generated
	 */
	void setGPSMapDatum(StringType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Latitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Latitude Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Latitude Ref</em>' containment reference.
	 * @see #setGPSDestLatitudeRef(GpsLatitudeRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestLatitudeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestLatitudeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLatitudeRefType getGPSDestLatitudeRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLatitudeRef <em>GPS Dest Latitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Latitude Ref</em>' containment reference.
	 * @see #getGPSDestLatitudeRef()
	 * @generated
	 */
	void setGPSDestLatitudeRef(GpsLatitudeRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Latitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Latitude</em>' containment reference.
	 * @see #setGPSDestLatitude(GpsLatitudeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestLatitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestLatitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLatitudeType getGPSDestLatitude();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLatitude <em>GPS Dest Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Latitude</em>' containment reference.
	 * @see #getGPSDestLatitude()
	 * @generated
	 */
	void setGPSDestLatitude(GpsLatitudeType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Longitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Longitude Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Longitude Ref</em>' containment reference.
	 * @see #setGPSDestLongitudeRef(GpsLongitudeRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestLongitudeRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestLongitudeRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLongitudeRefType getGPSDestLongitudeRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLongitudeRef <em>GPS Dest Longitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Longitude Ref</em>' containment reference.
	 * @see #getGPSDestLongitudeRef()
	 * @generated
	 */
	void setGPSDestLongitudeRef(GpsLongitudeRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Longitude</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Longitude</em>' containment reference.
	 * @see #setGPSDestLongitude(GpsLongitudeType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestLongitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestLongitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsLongitudeType getGPSDestLongitude();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestLongitude <em>GPS Dest Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Longitude</em>' containment reference.
	 * @see #getGPSDestLongitude()
	 * @generated
	 */
	void setGPSDestLongitude(GpsLongitudeType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Bearing Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Bearing Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Bearing Ref</em>' containment reference.
	 * @see #setGPSDestBearingRef(GpsDirectionType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestBearingRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestBearingRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsDirectionType getGPSDestBearingRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestBearingRef <em>GPS Dest Bearing Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Bearing Ref</em>' containment reference.
	 * @see #getGPSDestBearingRef()
	 * @generated
	 */
	void setGPSDestBearingRef(GpsDirectionType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Bearing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Bearing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Bearing</em>' containment reference.
	 * @see #setGPSDestBearing(GpsBearingType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestBearing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestBearing' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsBearingType getGPSDestBearing();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestBearing <em>GPS Dest Bearing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Bearing</em>' containment reference.
	 * @see #getGPSDestBearing()
	 * @generated
	 */
	void setGPSDestBearing(GpsBearingType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Distance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Distance Ref</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Distance Ref</em>' containment reference.
	 * @see #setGPSDestDistanceRef(GpsDistanceRefType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestDistanceRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestDistanceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsDistanceRefType getGPSDestDistanceRef();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestDistanceRef <em>GPS Dest Distance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Distance Ref</em>' containment reference.
	 * @see #getGPSDestDistanceRef()
	 * @generated
	 */
	void setGPSDestDistanceRef(GpsDistanceRefType value);

	/**
	 * Returns the value of the '<em><b>GPS Dest Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Dest Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Dest Distance</em>' containment reference.
	 * @see #setGPSDestDistance(NonNegativeRealType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDestDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDestDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getGPSDestDistance();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDestDistance <em>GPS Dest Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Dest Distance</em>' containment reference.
	 * @see #getGPSDestDistance()
	 * @generated
	 */
	void setGPSDestDistance(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>GPS Processing Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Processing Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Processing Method</em>' containment reference.
	 * @see #setGPSProcessingMethod(StringType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSProcessingMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSProcessingMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getGPSProcessingMethod();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSProcessingMethod <em>GPS Processing Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Processing Method</em>' containment reference.
	 * @see #getGPSProcessingMethod()
	 * @generated
	 */
	void setGPSProcessingMethod(StringType value);

	/**
	 * Returns the value of the '<em><b>GPS Area Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Area Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Area Information</em>' containment reference.
	 * @see #setGPSAreaInformation(StringType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSAreaInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSAreaInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getGPSAreaInformation();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSAreaInformation <em>GPS Area Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Area Information</em>' containment reference.
	 * @see #getGPSAreaInformation()
	 * @generated
	 */
	void setGPSAreaInformation(StringType value);

	/**
	 * Returns the value of the '<em><b>GPS Date Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Date Stamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Date Stamp</em>' containment reference.
	 * @see #setGPSDateStamp(DateType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDateStamp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDateStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getGPSDateStamp();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDateStamp <em>GPS Date Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Date Stamp</em>' containment reference.
	 * @see #getGPSDateStamp()
	 * @generated
	 */
	void setGPSDateStamp(DateType value);

	/**
	 * Returns the value of the '<em><b>GPS Differential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Differential</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Differential</em>' containment reference.
	 * @see #setGPSDifferential(GpsDifferentialType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSDifferential()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSDifferential' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsDifferentialType getGPSDifferential();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSDifferential <em>GPS Differential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Differential</em>' containment reference.
	 * @see #getGPSDifferential()
	 * @generated
	 */
	void setGPSDifferential(GpsDifferentialType value);

	/**
	 * Returns the value of the '<em><b>GPS Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Field1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Field1</em>' containment reference.
	 * @see #setGPSField1(SingleFieldType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSField1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSField1' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getGPSField1();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField1 <em>GPS Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Field1</em>' containment reference.
	 * @see #getGPSField1()
	 * @generated
	 */
	void setGPSField1(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>GPS Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Field2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Field2</em>' containment reference.
	 * @see #setGPSField2(SingleFieldType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSField2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSField2' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getGPSField2();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField2 <em>GPS Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Field2</em>' containment reference.
	 * @see #getGPSField2()
	 * @generated
	 */
	void setGPSField2(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>GPS Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GPS Field3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPS Field3</em>' containment reference.
	 * @see #setGPSField3(RepeatedFieldType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_GPSField3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GPSField3' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getGPSField3();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getGPSField3 <em>GPS Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPS Field3</em>' containment reference.
	 * @see #getGPSField3()
	 * @generated
	 */
	void setGPSField3(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(BigInteger)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getGpsIfdType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.GpsIfdType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // GpsIfdType
