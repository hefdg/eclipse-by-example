/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.DateType;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType;
import com.hsveclipse.phototoolkit.exif.GpsBearingType;
import com.hsveclipse.phototoolkit.exif.GpsDifferentialType;
import com.hsveclipse.phototoolkit.exif.GpsDirectionType;
import com.hsveclipse.phototoolkit.exif.GpsDistanceRefType;
import com.hsveclipse.phototoolkit.exif.GpsIfdType;
import com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType;
import com.hsveclipse.phototoolkit.exif.GpsLatitudeType;
import com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType;
import com.hsveclipse.phototoolkit.exif.GpsLongitudeType;
import com.hsveclipse.phototoolkit.exif.GpsMeasureModeType;
import com.hsveclipse.phototoolkit.exif.GpsSpeedRefType;
import com.hsveclipse.phototoolkit.exif.GpsStatusType;
import com.hsveclipse.phototoolkit.exif.NonNegativeRealType;
import com.hsveclipse.phototoolkit.exif.RepeatedFieldType;
import com.hsveclipse.phototoolkit.exif.SingleFieldType;
import com.hsveclipse.phototoolkit.exif.StringType;
import com.hsveclipse.phototoolkit.exif.TimeType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gps Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSVersionID <em>GPS Version ID</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSLatitudeRef <em>GPS Latitude Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSLatitude <em>GPS Latitude</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSLongitudeRef <em>GPS Longitude Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSLongitude <em>GPS Longitude</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSAltitudeRef <em>GPS Altitude Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSAltitude <em>GPS Altitude</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSTimeStamp <em>GPS Time Stamp</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSSatellites <em>GPS Satellites</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSStatus <em>GPS Status</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSMeasureMode <em>GPS Measure Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDOP <em>GPSDOP</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSSpeedRef <em>GPS Speed Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSSpeed <em>GPS Speed</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSTrackRef <em>GPS Track Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSTrack <em>GPS Track</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSImgDirectionRef <em>GPS Img Direction Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSImgDirection <em>GPS Img Direction</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSMapDatum <em>GPS Map Datum</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestLatitudeRef <em>GPS Dest Latitude Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestLatitude <em>GPS Dest Latitude</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestLongitudeRef <em>GPS Dest Longitude Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestLongitude <em>GPS Dest Longitude</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestBearingRef <em>GPS Dest Bearing Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestBearing <em>GPS Dest Bearing</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestDistanceRef <em>GPS Dest Distance Ref</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDestDistance <em>GPS Dest Distance</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSProcessingMethod <em>GPS Processing Method</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSAreaInformation <em>GPS Area Information</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDateStamp <em>GPS Date Stamp</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSDifferential <em>GPS Differential</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSField1 <em>GPS Field1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSField2 <em>GPS Field2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getGPSField3 <em>GPS Field3</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GpsIfdTypeImpl extends MinimalEObjectImpl.Container implements GpsIfdType {
	/**
	 * The cached value of the '{@link #getGPSVersionID() <em>GPS Version ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSVersionID()
	 * @generated
	 * @ordered
	 */
	protected StringType gPSVersionID;

	/**
	 * The cached value of the '{@link #getGPSLatitudeRef() <em>GPS Latitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSLatitudeRef()
	 * @generated
	 * @ordered
	 */
	protected GpsLatitudeRefType gPSLatitudeRef;

	/**
	 * The cached value of the '{@link #getGPSLatitude() <em>GPS Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSLatitude()
	 * @generated
	 * @ordered
	 */
	protected GpsLatitudeType gPSLatitude;

	/**
	 * The cached value of the '{@link #getGPSLongitudeRef() <em>GPS Longitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSLongitudeRef()
	 * @generated
	 * @ordered
	 */
	protected GpsLongitudeRefType gPSLongitudeRef;

	/**
	 * The cached value of the '{@link #getGPSLongitude() <em>GPS Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSLongitude()
	 * @generated
	 * @ordered
	 */
	protected GpsLongitudeType gPSLongitude;

	/**
	 * The cached value of the '{@link #getGPSAltitudeRef() <em>GPS Altitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSAltitudeRef()
	 * @generated
	 * @ordered
	 */
	protected GpsAltitudeRefType gPSAltitudeRef;

	/**
	 * The cached value of the '{@link #getGPSAltitude() <em>GPS Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSAltitude()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType gPSAltitude;

	/**
	 * The cached value of the '{@link #getGPSTimeStamp() <em>GPS Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected TimeType gPSTimeStamp;

	/**
	 * The cached value of the '{@link #getGPSSatellites() <em>GPS Satellites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSSatellites()
	 * @generated
	 * @ordered
	 */
	protected StringType gPSSatellites;

	/**
	 * The cached value of the '{@link #getGPSStatus() <em>GPS Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSStatus()
	 * @generated
	 * @ordered
	 */
	protected GpsStatusType gPSStatus;

	/**
	 * The cached value of the '{@link #getGPSMeasureMode() <em>GPS Measure Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSMeasureMode()
	 * @generated
	 * @ordered
	 */
	protected GpsMeasureModeType gPSMeasureMode;

	/**
	 * The cached value of the '{@link #getGPSDOP() <em>GPSDOP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDOP()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType gPSDOP;

	/**
	 * The cached value of the '{@link #getGPSSpeedRef() <em>GPS Speed Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSSpeedRef()
	 * @generated
	 * @ordered
	 */
	protected GpsSpeedRefType gPSSpeedRef;

	/**
	 * The cached value of the '{@link #getGPSSpeed() <em>GPS Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSSpeed()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType gPSSpeed;

	/**
	 * The cached value of the '{@link #getGPSTrackRef() <em>GPS Track Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSTrackRef()
	 * @generated
	 * @ordered
	 */
	protected GpsDirectionType gPSTrackRef;

	/**
	 * The cached value of the '{@link #getGPSTrack() <em>GPS Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSTrack()
	 * @generated
	 * @ordered
	 */
	protected GpsBearingType gPSTrack;

	/**
	 * The cached value of the '{@link #getGPSImgDirectionRef() <em>GPS Img Direction Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSImgDirectionRef()
	 * @generated
	 * @ordered
	 */
	protected GpsDirectionType gPSImgDirectionRef;

	/**
	 * The cached value of the '{@link #getGPSImgDirection() <em>GPS Img Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSImgDirection()
	 * @generated
	 * @ordered
	 */
	protected GpsBearingType gPSImgDirection;

	/**
	 * The cached value of the '{@link #getGPSMapDatum() <em>GPS Map Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSMapDatum()
	 * @generated
	 * @ordered
	 */
	protected StringType gPSMapDatum;

	/**
	 * The cached value of the '{@link #getGPSDestLatitudeRef() <em>GPS Dest Latitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestLatitudeRef()
	 * @generated
	 * @ordered
	 */
	protected GpsLatitudeRefType gPSDestLatitudeRef;

	/**
	 * The cached value of the '{@link #getGPSDestLatitude() <em>GPS Dest Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestLatitude()
	 * @generated
	 * @ordered
	 */
	protected GpsLatitudeType gPSDestLatitude;

	/**
	 * The cached value of the '{@link #getGPSDestLongitudeRef() <em>GPS Dest Longitude Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestLongitudeRef()
	 * @generated
	 * @ordered
	 */
	protected GpsLongitudeRefType gPSDestLongitudeRef;

	/**
	 * The cached value of the '{@link #getGPSDestLongitude() <em>GPS Dest Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestLongitude()
	 * @generated
	 * @ordered
	 */
	protected GpsLongitudeType gPSDestLongitude;

	/**
	 * The cached value of the '{@link #getGPSDestBearingRef() <em>GPS Dest Bearing Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestBearingRef()
	 * @generated
	 * @ordered
	 */
	protected GpsDirectionType gPSDestBearingRef;

	/**
	 * The cached value of the '{@link #getGPSDestBearing() <em>GPS Dest Bearing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestBearing()
	 * @generated
	 * @ordered
	 */
	protected GpsBearingType gPSDestBearing;

	/**
	 * The cached value of the '{@link #getGPSDestDistanceRef() <em>GPS Dest Distance Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestDistanceRef()
	 * @generated
	 * @ordered
	 */
	protected GpsDistanceRefType gPSDestDistanceRef;

	/**
	 * The cached value of the '{@link #getGPSDestDistance() <em>GPS Dest Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDestDistance()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType gPSDestDistance;

	/**
	 * The cached value of the '{@link #getGPSProcessingMethod() <em>GPS Processing Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSProcessingMethod()
	 * @generated
	 * @ordered
	 */
	protected StringType gPSProcessingMethod;

	/**
	 * The cached value of the '{@link #getGPSAreaInformation() <em>GPS Area Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSAreaInformation()
	 * @generated
	 * @ordered
	 */
	protected StringType gPSAreaInformation;

	/**
	 * The cached value of the '{@link #getGPSDateStamp() <em>GPS Date Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDateStamp()
	 * @generated
	 * @ordered
	 */
	protected DateType gPSDateStamp;

	/**
	 * The cached value of the '{@link #getGPSDifferential() <em>GPS Differential</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSDifferential()
	 * @generated
	 * @ordered
	 */
	protected GpsDifferentialType gPSDifferential;

	/**
	 * The cached value of the '{@link #getGPSField1() <em>GPS Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSField1()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType gPSField1;

	/**
	 * The cached value of the '{@link #getGPSField2() <em>GPS Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSField2()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType gPSField2;

	/**
	 * The cached value of the '{@link #getGPSField3() <em>GPS Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPSField3()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType gPSField3;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tag = TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GpsIfdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getGpsIfdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getGPSVersionID() {
		return gPSVersionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSVersionID(StringType newGPSVersionID, NotificationChain msgs) {
		StringType oldGPSVersionID = gPSVersionID;
		gPSVersionID = newGPSVersionID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID, oldGPSVersionID, newGPSVersionID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSVersionID(StringType newGPSVersionID) {
		if (newGPSVersionID != gPSVersionID) {
			NotificationChain msgs = null;
			if (gPSVersionID != null)
				msgs = ((InternalEObject)gPSVersionID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID, null, msgs);
			if (newGPSVersionID != null)
				msgs = ((InternalEObject)newGPSVersionID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID, null, msgs);
			msgs = basicSetGPSVersionID(newGPSVersionID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID, newGPSVersionID, newGPSVersionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeRefType getGPSLatitudeRef() {
		return gPSLatitudeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSLatitudeRef(GpsLatitudeRefType newGPSLatitudeRef, NotificationChain msgs) {
		GpsLatitudeRefType oldGPSLatitudeRef = gPSLatitudeRef;
		gPSLatitudeRef = newGPSLatitudeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF, oldGPSLatitudeRef, newGPSLatitudeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSLatitudeRef(GpsLatitudeRefType newGPSLatitudeRef) {
		if (newGPSLatitudeRef != gPSLatitudeRef) {
			NotificationChain msgs = null;
			if (gPSLatitudeRef != null)
				msgs = ((InternalEObject)gPSLatitudeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF, null, msgs);
			if (newGPSLatitudeRef != null)
				msgs = ((InternalEObject)newGPSLatitudeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF, null, msgs);
			msgs = basicSetGPSLatitudeRef(newGPSLatitudeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF, newGPSLatitudeRef, newGPSLatitudeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeType getGPSLatitude() {
		return gPSLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSLatitude(GpsLatitudeType newGPSLatitude, NotificationChain msgs) {
		GpsLatitudeType oldGPSLatitude = gPSLatitude;
		gPSLatitude = newGPSLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE, oldGPSLatitude, newGPSLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSLatitude(GpsLatitudeType newGPSLatitude) {
		if (newGPSLatitude != gPSLatitude) {
			NotificationChain msgs = null;
			if (gPSLatitude != null)
				msgs = ((InternalEObject)gPSLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE, null, msgs);
			if (newGPSLatitude != null)
				msgs = ((InternalEObject)newGPSLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE, null, msgs);
			msgs = basicSetGPSLatitude(newGPSLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE, newGPSLatitude, newGPSLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeRefType getGPSLongitudeRef() {
		return gPSLongitudeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSLongitudeRef(GpsLongitudeRefType newGPSLongitudeRef, NotificationChain msgs) {
		GpsLongitudeRefType oldGPSLongitudeRef = gPSLongitudeRef;
		gPSLongitudeRef = newGPSLongitudeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF, oldGPSLongitudeRef, newGPSLongitudeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSLongitudeRef(GpsLongitudeRefType newGPSLongitudeRef) {
		if (newGPSLongitudeRef != gPSLongitudeRef) {
			NotificationChain msgs = null;
			if (gPSLongitudeRef != null)
				msgs = ((InternalEObject)gPSLongitudeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF, null, msgs);
			if (newGPSLongitudeRef != null)
				msgs = ((InternalEObject)newGPSLongitudeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF, null, msgs);
			msgs = basicSetGPSLongitudeRef(newGPSLongitudeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF, newGPSLongitudeRef, newGPSLongitudeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeType getGPSLongitude() {
		return gPSLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSLongitude(GpsLongitudeType newGPSLongitude, NotificationChain msgs) {
		GpsLongitudeType oldGPSLongitude = gPSLongitude;
		gPSLongitude = newGPSLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE, oldGPSLongitude, newGPSLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSLongitude(GpsLongitudeType newGPSLongitude) {
		if (newGPSLongitude != gPSLongitude) {
			NotificationChain msgs = null;
			if (gPSLongitude != null)
				msgs = ((InternalEObject)gPSLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE, null, msgs);
			if (newGPSLongitude != null)
				msgs = ((InternalEObject)newGPSLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE, null, msgs);
			msgs = basicSetGPSLongitude(newGPSLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE, newGPSLongitude, newGPSLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsAltitudeRefType getGPSAltitudeRef() {
		return gPSAltitudeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSAltitudeRef(GpsAltitudeRefType newGPSAltitudeRef, NotificationChain msgs) {
		GpsAltitudeRefType oldGPSAltitudeRef = gPSAltitudeRef;
		gPSAltitudeRef = newGPSAltitudeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF, oldGPSAltitudeRef, newGPSAltitudeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSAltitudeRef(GpsAltitudeRefType newGPSAltitudeRef) {
		if (newGPSAltitudeRef != gPSAltitudeRef) {
			NotificationChain msgs = null;
			if (gPSAltitudeRef != null)
				msgs = ((InternalEObject)gPSAltitudeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF, null, msgs);
			if (newGPSAltitudeRef != null)
				msgs = ((InternalEObject)newGPSAltitudeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF, null, msgs);
			msgs = basicSetGPSAltitudeRef(newGPSAltitudeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF, newGPSAltitudeRef, newGPSAltitudeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getGPSAltitude() {
		return gPSAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSAltitude(NonNegativeRealType newGPSAltitude, NotificationChain msgs) {
		NonNegativeRealType oldGPSAltitude = gPSAltitude;
		gPSAltitude = newGPSAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE, oldGPSAltitude, newGPSAltitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSAltitude(NonNegativeRealType newGPSAltitude) {
		if (newGPSAltitude != gPSAltitude) {
			NotificationChain msgs = null;
			if (gPSAltitude != null)
				msgs = ((InternalEObject)gPSAltitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE, null, msgs);
			if (newGPSAltitude != null)
				msgs = ((InternalEObject)newGPSAltitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE, null, msgs);
			msgs = basicSetGPSAltitude(newGPSAltitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE, newGPSAltitude, newGPSAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getGPSTimeStamp() {
		return gPSTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSTimeStamp(TimeType newGPSTimeStamp, NotificationChain msgs) {
		TimeType oldGPSTimeStamp = gPSTimeStamp;
		gPSTimeStamp = newGPSTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP, oldGPSTimeStamp, newGPSTimeStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSTimeStamp(TimeType newGPSTimeStamp) {
		if (newGPSTimeStamp != gPSTimeStamp) {
			NotificationChain msgs = null;
			if (gPSTimeStamp != null)
				msgs = ((InternalEObject)gPSTimeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP, null, msgs);
			if (newGPSTimeStamp != null)
				msgs = ((InternalEObject)newGPSTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP, null, msgs);
			msgs = basicSetGPSTimeStamp(newGPSTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP, newGPSTimeStamp, newGPSTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getGPSSatellites() {
		return gPSSatellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSSatellites(StringType newGPSSatellites, NotificationChain msgs) {
		StringType oldGPSSatellites = gPSSatellites;
		gPSSatellites = newGPSSatellites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES, oldGPSSatellites, newGPSSatellites);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSSatellites(StringType newGPSSatellites) {
		if (newGPSSatellites != gPSSatellites) {
			NotificationChain msgs = null;
			if (gPSSatellites != null)
				msgs = ((InternalEObject)gPSSatellites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES, null, msgs);
			if (newGPSSatellites != null)
				msgs = ((InternalEObject)newGPSSatellites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES, null, msgs);
			msgs = basicSetGPSSatellites(newGPSSatellites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES, newGPSSatellites, newGPSSatellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsStatusType getGPSStatus() {
		return gPSStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSStatus(GpsStatusType newGPSStatus, NotificationChain msgs) {
		GpsStatusType oldGPSStatus = gPSStatus;
		gPSStatus = newGPSStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_STATUS, oldGPSStatus, newGPSStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSStatus(GpsStatusType newGPSStatus) {
		if (newGPSStatus != gPSStatus) {
			NotificationChain msgs = null;
			if (gPSStatus != null)
				msgs = ((InternalEObject)gPSStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_STATUS, null, msgs);
			if (newGPSStatus != null)
				msgs = ((InternalEObject)newGPSStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_STATUS, null, msgs);
			msgs = basicSetGPSStatus(newGPSStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_STATUS, newGPSStatus, newGPSStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsMeasureModeType getGPSMeasureMode() {
		return gPSMeasureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSMeasureMode(GpsMeasureModeType newGPSMeasureMode, NotificationChain msgs) {
		GpsMeasureModeType oldGPSMeasureMode = gPSMeasureMode;
		gPSMeasureMode = newGPSMeasureMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE, oldGPSMeasureMode, newGPSMeasureMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSMeasureMode(GpsMeasureModeType newGPSMeasureMode) {
		if (newGPSMeasureMode != gPSMeasureMode) {
			NotificationChain msgs = null;
			if (gPSMeasureMode != null)
				msgs = ((InternalEObject)gPSMeasureMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE, null, msgs);
			if (newGPSMeasureMode != null)
				msgs = ((InternalEObject)newGPSMeasureMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE, null, msgs);
			msgs = basicSetGPSMeasureMode(newGPSMeasureMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE, newGPSMeasureMode, newGPSMeasureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getGPSDOP() {
		return gPSDOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDOP(NonNegativeRealType newGPSDOP, NotificationChain msgs) {
		NonNegativeRealType oldGPSDOP = gPSDOP;
		gPSDOP = newGPSDOP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPSDOP, oldGPSDOP, newGPSDOP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDOP(NonNegativeRealType newGPSDOP) {
		if (newGPSDOP != gPSDOP) {
			NotificationChain msgs = null;
			if (gPSDOP != null)
				msgs = ((InternalEObject)gPSDOP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPSDOP, null, msgs);
			if (newGPSDOP != null)
				msgs = ((InternalEObject)newGPSDOP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPSDOP, null, msgs);
			msgs = basicSetGPSDOP(newGPSDOP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPSDOP, newGPSDOP, newGPSDOP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsSpeedRefType getGPSSpeedRef() {
		return gPSSpeedRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSSpeedRef(GpsSpeedRefType newGPSSpeedRef, NotificationChain msgs) {
		GpsSpeedRefType oldGPSSpeedRef = gPSSpeedRef;
		gPSSpeedRef = newGPSSpeedRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF, oldGPSSpeedRef, newGPSSpeedRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSSpeedRef(GpsSpeedRefType newGPSSpeedRef) {
		if (newGPSSpeedRef != gPSSpeedRef) {
			NotificationChain msgs = null;
			if (gPSSpeedRef != null)
				msgs = ((InternalEObject)gPSSpeedRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF, null, msgs);
			if (newGPSSpeedRef != null)
				msgs = ((InternalEObject)newGPSSpeedRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF, null, msgs);
			msgs = basicSetGPSSpeedRef(newGPSSpeedRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF, newGPSSpeedRef, newGPSSpeedRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getGPSSpeed() {
		return gPSSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSSpeed(NonNegativeRealType newGPSSpeed, NotificationChain msgs) {
		NonNegativeRealType oldGPSSpeed = gPSSpeed;
		gPSSpeed = newGPSSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SPEED, oldGPSSpeed, newGPSSpeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSSpeed(NonNegativeRealType newGPSSpeed) {
		if (newGPSSpeed != gPSSpeed) {
			NotificationChain msgs = null;
			if (gPSSpeed != null)
				msgs = ((InternalEObject)gPSSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SPEED, null, msgs);
			if (newGPSSpeed != null)
				msgs = ((InternalEObject)newGPSSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_SPEED, null, msgs);
			msgs = basicSetGPSSpeed(newGPSSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_SPEED, newGPSSpeed, newGPSSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionType getGPSTrackRef() {
		return gPSTrackRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSTrackRef(GpsDirectionType newGPSTrackRef, NotificationChain msgs) {
		GpsDirectionType oldGPSTrackRef = gPSTrackRef;
		gPSTrackRef = newGPSTrackRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF, oldGPSTrackRef, newGPSTrackRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSTrackRef(GpsDirectionType newGPSTrackRef) {
		if (newGPSTrackRef != gPSTrackRef) {
			NotificationChain msgs = null;
			if (gPSTrackRef != null)
				msgs = ((InternalEObject)gPSTrackRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF, null, msgs);
			if (newGPSTrackRef != null)
				msgs = ((InternalEObject)newGPSTrackRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF, null, msgs);
			msgs = basicSetGPSTrackRef(newGPSTrackRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF, newGPSTrackRef, newGPSTrackRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsBearingType getGPSTrack() {
		return gPSTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSTrack(GpsBearingType newGPSTrack, NotificationChain msgs) {
		GpsBearingType oldGPSTrack = gPSTrack;
		gPSTrack = newGPSTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TRACK, oldGPSTrack, newGPSTrack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSTrack(GpsBearingType newGPSTrack) {
		if (newGPSTrack != gPSTrack) {
			NotificationChain msgs = null;
			if (gPSTrack != null)
				msgs = ((InternalEObject)gPSTrack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TRACK, null, msgs);
			if (newGPSTrack != null)
				msgs = ((InternalEObject)newGPSTrack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_TRACK, null, msgs);
			msgs = basicSetGPSTrack(newGPSTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_TRACK, newGPSTrack, newGPSTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionType getGPSImgDirectionRef() {
		return gPSImgDirectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSImgDirectionRef(GpsDirectionType newGPSImgDirectionRef, NotificationChain msgs) {
		GpsDirectionType oldGPSImgDirectionRef = gPSImgDirectionRef;
		gPSImgDirectionRef = newGPSImgDirectionRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF, oldGPSImgDirectionRef, newGPSImgDirectionRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSImgDirectionRef(GpsDirectionType newGPSImgDirectionRef) {
		if (newGPSImgDirectionRef != gPSImgDirectionRef) {
			NotificationChain msgs = null;
			if (gPSImgDirectionRef != null)
				msgs = ((InternalEObject)gPSImgDirectionRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF, null, msgs);
			if (newGPSImgDirectionRef != null)
				msgs = ((InternalEObject)newGPSImgDirectionRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF, null, msgs);
			msgs = basicSetGPSImgDirectionRef(newGPSImgDirectionRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF, newGPSImgDirectionRef, newGPSImgDirectionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsBearingType getGPSImgDirection() {
		return gPSImgDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSImgDirection(GpsBearingType newGPSImgDirection, NotificationChain msgs) {
		GpsBearingType oldGPSImgDirection = gPSImgDirection;
		gPSImgDirection = newGPSImgDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION, oldGPSImgDirection, newGPSImgDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSImgDirection(GpsBearingType newGPSImgDirection) {
		if (newGPSImgDirection != gPSImgDirection) {
			NotificationChain msgs = null;
			if (gPSImgDirection != null)
				msgs = ((InternalEObject)gPSImgDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION, null, msgs);
			if (newGPSImgDirection != null)
				msgs = ((InternalEObject)newGPSImgDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION, null, msgs);
			msgs = basicSetGPSImgDirection(newGPSImgDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION, newGPSImgDirection, newGPSImgDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getGPSMapDatum() {
		return gPSMapDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSMapDatum(StringType newGPSMapDatum, NotificationChain msgs) {
		StringType oldGPSMapDatum = gPSMapDatum;
		gPSMapDatum = newGPSMapDatum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM, oldGPSMapDatum, newGPSMapDatum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSMapDatum(StringType newGPSMapDatum) {
		if (newGPSMapDatum != gPSMapDatum) {
			NotificationChain msgs = null;
			if (gPSMapDatum != null)
				msgs = ((InternalEObject)gPSMapDatum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM, null, msgs);
			if (newGPSMapDatum != null)
				msgs = ((InternalEObject)newGPSMapDatum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM, null, msgs);
			msgs = basicSetGPSMapDatum(newGPSMapDatum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM, newGPSMapDatum, newGPSMapDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeRefType getGPSDestLatitudeRef() {
		return gPSDestLatitudeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestLatitudeRef(GpsLatitudeRefType newGPSDestLatitudeRef, NotificationChain msgs) {
		GpsLatitudeRefType oldGPSDestLatitudeRef = gPSDestLatitudeRef;
		gPSDestLatitudeRef = newGPSDestLatitudeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF, oldGPSDestLatitudeRef, newGPSDestLatitudeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestLatitudeRef(GpsLatitudeRefType newGPSDestLatitudeRef) {
		if (newGPSDestLatitudeRef != gPSDestLatitudeRef) {
			NotificationChain msgs = null;
			if (gPSDestLatitudeRef != null)
				msgs = ((InternalEObject)gPSDestLatitudeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF, null, msgs);
			if (newGPSDestLatitudeRef != null)
				msgs = ((InternalEObject)newGPSDestLatitudeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF, null, msgs);
			msgs = basicSetGPSDestLatitudeRef(newGPSDestLatitudeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF, newGPSDestLatitudeRef, newGPSDestLatitudeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeType getGPSDestLatitude() {
		return gPSDestLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestLatitude(GpsLatitudeType newGPSDestLatitude, NotificationChain msgs) {
		GpsLatitudeType oldGPSDestLatitude = gPSDestLatitude;
		gPSDestLatitude = newGPSDestLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE, oldGPSDestLatitude, newGPSDestLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestLatitude(GpsLatitudeType newGPSDestLatitude) {
		if (newGPSDestLatitude != gPSDestLatitude) {
			NotificationChain msgs = null;
			if (gPSDestLatitude != null)
				msgs = ((InternalEObject)gPSDestLatitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE, null, msgs);
			if (newGPSDestLatitude != null)
				msgs = ((InternalEObject)newGPSDestLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE, null, msgs);
			msgs = basicSetGPSDestLatitude(newGPSDestLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE, newGPSDestLatitude, newGPSDestLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeRefType getGPSDestLongitudeRef() {
		return gPSDestLongitudeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestLongitudeRef(GpsLongitudeRefType newGPSDestLongitudeRef, NotificationChain msgs) {
		GpsLongitudeRefType oldGPSDestLongitudeRef = gPSDestLongitudeRef;
		gPSDestLongitudeRef = newGPSDestLongitudeRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF, oldGPSDestLongitudeRef, newGPSDestLongitudeRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestLongitudeRef(GpsLongitudeRefType newGPSDestLongitudeRef) {
		if (newGPSDestLongitudeRef != gPSDestLongitudeRef) {
			NotificationChain msgs = null;
			if (gPSDestLongitudeRef != null)
				msgs = ((InternalEObject)gPSDestLongitudeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF, null, msgs);
			if (newGPSDestLongitudeRef != null)
				msgs = ((InternalEObject)newGPSDestLongitudeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF, null, msgs);
			msgs = basicSetGPSDestLongitudeRef(newGPSDestLongitudeRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF, newGPSDestLongitudeRef, newGPSDestLongitudeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeType getGPSDestLongitude() {
		return gPSDestLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestLongitude(GpsLongitudeType newGPSDestLongitude, NotificationChain msgs) {
		GpsLongitudeType oldGPSDestLongitude = gPSDestLongitude;
		gPSDestLongitude = newGPSDestLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE, oldGPSDestLongitude, newGPSDestLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestLongitude(GpsLongitudeType newGPSDestLongitude) {
		if (newGPSDestLongitude != gPSDestLongitude) {
			NotificationChain msgs = null;
			if (gPSDestLongitude != null)
				msgs = ((InternalEObject)gPSDestLongitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE, null, msgs);
			if (newGPSDestLongitude != null)
				msgs = ((InternalEObject)newGPSDestLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE, null, msgs);
			msgs = basicSetGPSDestLongitude(newGPSDestLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE, newGPSDestLongitude, newGPSDestLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionType getGPSDestBearingRef() {
		return gPSDestBearingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestBearingRef(GpsDirectionType newGPSDestBearingRef, NotificationChain msgs) {
		GpsDirectionType oldGPSDestBearingRef = gPSDestBearingRef;
		gPSDestBearingRef = newGPSDestBearingRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF, oldGPSDestBearingRef, newGPSDestBearingRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestBearingRef(GpsDirectionType newGPSDestBearingRef) {
		if (newGPSDestBearingRef != gPSDestBearingRef) {
			NotificationChain msgs = null;
			if (gPSDestBearingRef != null)
				msgs = ((InternalEObject)gPSDestBearingRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF, null, msgs);
			if (newGPSDestBearingRef != null)
				msgs = ((InternalEObject)newGPSDestBearingRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF, null, msgs);
			msgs = basicSetGPSDestBearingRef(newGPSDestBearingRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF, newGPSDestBearingRef, newGPSDestBearingRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsBearingType getGPSDestBearing() {
		return gPSDestBearing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestBearing(GpsBearingType newGPSDestBearing, NotificationChain msgs) {
		GpsBearingType oldGPSDestBearing = gPSDestBearing;
		gPSDestBearing = newGPSDestBearing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING, oldGPSDestBearing, newGPSDestBearing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestBearing(GpsBearingType newGPSDestBearing) {
		if (newGPSDestBearing != gPSDestBearing) {
			NotificationChain msgs = null;
			if (gPSDestBearing != null)
				msgs = ((InternalEObject)gPSDestBearing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING, null, msgs);
			if (newGPSDestBearing != null)
				msgs = ((InternalEObject)newGPSDestBearing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING, null, msgs);
			msgs = basicSetGPSDestBearing(newGPSDestBearing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING, newGPSDestBearing, newGPSDestBearing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDistanceRefType getGPSDestDistanceRef() {
		return gPSDestDistanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestDistanceRef(GpsDistanceRefType newGPSDestDistanceRef, NotificationChain msgs) {
		GpsDistanceRefType oldGPSDestDistanceRef = gPSDestDistanceRef;
		gPSDestDistanceRef = newGPSDestDistanceRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF, oldGPSDestDistanceRef, newGPSDestDistanceRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestDistanceRef(GpsDistanceRefType newGPSDestDistanceRef) {
		if (newGPSDestDistanceRef != gPSDestDistanceRef) {
			NotificationChain msgs = null;
			if (gPSDestDistanceRef != null)
				msgs = ((InternalEObject)gPSDestDistanceRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF, null, msgs);
			if (newGPSDestDistanceRef != null)
				msgs = ((InternalEObject)newGPSDestDistanceRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF, null, msgs);
			msgs = basicSetGPSDestDistanceRef(newGPSDestDistanceRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF, newGPSDestDistanceRef, newGPSDestDistanceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getGPSDestDistance() {
		return gPSDestDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDestDistance(NonNegativeRealType newGPSDestDistance, NotificationChain msgs) {
		NonNegativeRealType oldGPSDestDistance = gPSDestDistance;
		gPSDestDistance = newGPSDestDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE, oldGPSDestDistance, newGPSDestDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDestDistance(NonNegativeRealType newGPSDestDistance) {
		if (newGPSDestDistance != gPSDestDistance) {
			NotificationChain msgs = null;
			if (gPSDestDistance != null)
				msgs = ((InternalEObject)gPSDestDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE, null, msgs);
			if (newGPSDestDistance != null)
				msgs = ((InternalEObject)newGPSDestDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE, null, msgs);
			msgs = basicSetGPSDestDistance(newGPSDestDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE, newGPSDestDistance, newGPSDestDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getGPSProcessingMethod() {
		return gPSProcessingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSProcessingMethod(StringType newGPSProcessingMethod, NotificationChain msgs) {
		StringType oldGPSProcessingMethod = gPSProcessingMethod;
		gPSProcessingMethod = newGPSProcessingMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD, oldGPSProcessingMethod, newGPSProcessingMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSProcessingMethod(StringType newGPSProcessingMethod) {
		if (newGPSProcessingMethod != gPSProcessingMethod) {
			NotificationChain msgs = null;
			if (gPSProcessingMethod != null)
				msgs = ((InternalEObject)gPSProcessingMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD, null, msgs);
			if (newGPSProcessingMethod != null)
				msgs = ((InternalEObject)newGPSProcessingMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD, null, msgs);
			msgs = basicSetGPSProcessingMethod(newGPSProcessingMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD, newGPSProcessingMethod, newGPSProcessingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getGPSAreaInformation() {
		return gPSAreaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSAreaInformation(StringType newGPSAreaInformation, NotificationChain msgs) {
		StringType oldGPSAreaInformation = gPSAreaInformation;
		gPSAreaInformation = newGPSAreaInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION, oldGPSAreaInformation, newGPSAreaInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSAreaInformation(StringType newGPSAreaInformation) {
		if (newGPSAreaInformation != gPSAreaInformation) {
			NotificationChain msgs = null;
			if (gPSAreaInformation != null)
				msgs = ((InternalEObject)gPSAreaInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION, null, msgs);
			if (newGPSAreaInformation != null)
				msgs = ((InternalEObject)newGPSAreaInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION, null, msgs);
			msgs = basicSetGPSAreaInformation(newGPSAreaInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION, newGPSAreaInformation, newGPSAreaInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getGPSDateStamp() {
		return gPSDateStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDateStamp(DateType newGPSDateStamp, NotificationChain msgs) {
		DateType oldGPSDateStamp = gPSDateStamp;
		gPSDateStamp = newGPSDateStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP, oldGPSDateStamp, newGPSDateStamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDateStamp(DateType newGPSDateStamp) {
		if (newGPSDateStamp != gPSDateStamp) {
			NotificationChain msgs = null;
			if (gPSDateStamp != null)
				msgs = ((InternalEObject)gPSDateStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP, null, msgs);
			if (newGPSDateStamp != null)
				msgs = ((InternalEObject)newGPSDateStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP, null, msgs);
			msgs = basicSetGPSDateStamp(newGPSDateStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP, newGPSDateStamp, newGPSDateStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDifferentialType getGPSDifferential() {
		return gPSDifferential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSDifferential(GpsDifferentialType newGPSDifferential, NotificationChain msgs) {
		GpsDifferentialType oldGPSDifferential = gPSDifferential;
		gPSDifferential = newGPSDifferential;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL, oldGPSDifferential, newGPSDifferential);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSDifferential(GpsDifferentialType newGPSDifferential) {
		if (newGPSDifferential != gPSDifferential) {
			NotificationChain msgs = null;
			if (gPSDifferential != null)
				msgs = ((InternalEObject)gPSDifferential).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL, null, msgs);
			if (newGPSDifferential != null)
				msgs = ((InternalEObject)newGPSDifferential).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL, null, msgs);
			msgs = basicSetGPSDifferential(newGPSDifferential, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL, newGPSDifferential, newGPSDifferential));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getGPSField1() {
		return gPSField1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSField1(SingleFieldType newGPSField1, NotificationChain msgs) {
		SingleFieldType oldGPSField1 = gPSField1;
		gPSField1 = newGPSField1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD1, oldGPSField1, newGPSField1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSField1(SingleFieldType newGPSField1) {
		if (newGPSField1 != gPSField1) {
			NotificationChain msgs = null;
			if (gPSField1 != null)
				msgs = ((InternalEObject)gPSField1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD1, null, msgs);
			if (newGPSField1 != null)
				msgs = ((InternalEObject)newGPSField1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD1, null, msgs);
			msgs = basicSetGPSField1(newGPSField1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD1, newGPSField1, newGPSField1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getGPSField2() {
		return gPSField2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSField2(SingleFieldType newGPSField2, NotificationChain msgs) {
		SingleFieldType oldGPSField2 = gPSField2;
		gPSField2 = newGPSField2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD2, oldGPSField2, newGPSField2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSField2(SingleFieldType newGPSField2) {
		if (newGPSField2 != gPSField2) {
			NotificationChain msgs = null;
			if (gPSField2 != null)
				msgs = ((InternalEObject)gPSField2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD2, null, msgs);
			if (newGPSField2 != null)
				msgs = ((InternalEObject)newGPSField2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD2, null, msgs);
			msgs = basicSetGPSField2(newGPSField2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD2, newGPSField2, newGPSField2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getGPSField3() {
		return gPSField3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGPSField3(RepeatedFieldType newGPSField3, NotificationChain msgs) {
		RepeatedFieldType oldGPSField3 = gPSField3;
		gPSField3 = newGPSField3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD3, oldGPSField3, newGPSField3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGPSField3(RepeatedFieldType newGPSField3) {
		if (newGPSField3 != gPSField3) {
			NotificationChain msgs = null;
			if (gPSField3 != null)
				msgs = ((InternalEObject)gPSField3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD3, null, msgs);
			if (newGPSField3 != null)
				msgs = ((InternalEObject)newGPSField3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.GPS_IFD_TYPE__GPS_FIELD3, null, msgs);
			msgs = basicSetGPSField3(newGPSField3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__GPS_FIELD3, newGPSField3, newGPSField3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(BigInteger newTag) {
		BigInteger oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.GPS_IFD_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
				return basicSetGPSVersionID(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
				return basicSetGPSLatitudeRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
				return basicSetGPSLatitude(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
				return basicSetGPSLongitudeRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
				return basicSetGPSLongitude(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
				return basicSetGPSAltitudeRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
				return basicSetGPSAltitude(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
				return basicSetGPSTimeStamp(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
				return basicSetGPSSatellites(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
				return basicSetGPSStatus(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
				return basicSetGPSMeasureMode(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
				return basicSetGPSDOP(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
				return basicSetGPSSpeedRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
				return basicSetGPSSpeed(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
				return basicSetGPSTrackRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
				return basicSetGPSTrack(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
				return basicSetGPSImgDirectionRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
				return basicSetGPSImgDirection(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
				return basicSetGPSMapDatum(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
				return basicSetGPSDestLatitudeRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
				return basicSetGPSDestLatitude(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
				return basicSetGPSDestLongitudeRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
				return basicSetGPSDestLongitude(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
				return basicSetGPSDestBearingRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
				return basicSetGPSDestBearing(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
				return basicSetGPSDestDistanceRef(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
				return basicSetGPSDestDistance(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
				return basicSetGPSProcessingMethod(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
				return basicSetGPSAreaInformation(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
				return basicSetGPSDateStamp(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
				return basicSetGPSDifferential(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
				return basicSetGPSField1(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
				return basicSetGPSField2(null, msgs);
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
				return basicSetGPSField3(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
				return getGPSVersionID();
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
				return getGPSLatitudeRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
				return getGPSLatitude();
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
				return getGPSLongitudeRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
				return getGPSLongitude();
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
				return getGPSAltitudeRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
				return getGPSAltitude();
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
				return getGPSTimeStamp();
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
				return getGPSSatellites();
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
				return getGPSStatus();
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
				return getGPSMeasureMode();
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
				return getGPSDOP();
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
				return getGPSSpeedRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
				return getGPSSpeed();
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
				return getGPSTrackRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
				return getGPSTrack();
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
				return getGPSImgDirectionRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
				return getGPSImgDirection();
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
				return getGPSMapDatum();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
				return getGPSDestLatitudeRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
				return getGPSDestLatitude();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
				return getGPSDestLongitudeRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
				return getGPSDestLongitude();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
				return getGPSDestBearingRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
				return getGPSDestBearing();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
				return getGPSDestDistanceRef();
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
				return getGPSDestDistance();
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
				return getGPSProcessingMethod();
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
				return getGPSAreaInformation();
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
				return getGPSDateStamp();
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
				return getGPSDifferential();
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
				return getGPSField1();
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
				return getGPSField2();
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
				return getGPSField3();
			case ExifPackage.GPS_IFD_TYPE__TAG:
				return getTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
				setGPSVersionID((StringType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
				setGPSLatitudeRef((GpsLatitudeRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
				setGPSLatitude((GpsLatitudeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
				setGPSLongitudeRef((GpsLongitudeRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
				setGPSLongitude((GpsLongitudeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
				setGPSAltitudeRef((GpsAltitudeRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
				setGPSAltitude((NonNegativeRealType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
				setGPSTimeStamp((TimeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
				setGPSSatellites((StringType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
				setGPSStatus((GpsStatusType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
				setGPSMeasureMode((GpsMeasureModeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
				setGPSDOP((NonNegativeRealType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
				setGPSSpeedRef((GpsSpeedRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
				setGPSSpeed((NonNegativeRealType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
				setGPSTrackRef((GpsDirectionType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
				setGPSTrack((GpsBearingType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
				setGPSImgDirectionRef((GpsDirectionType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
				setGPSImgDirection((GpsBearingType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
				setGPSMapDatum((StringType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
				setGPSDestLatitudeRef((GpsLatitudeRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
				setGPSDestLatitude((GpsLatitudeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
				setGPSDestLongitudeRef((GpsLongitudeRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
				setGPSDestLongitude((GpsLongitudeType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
				setGPSDestBearingRef((GpsDirectionType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
				setGPSDestBearing((GpsBearingType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
				setGPSDestDistanceRef((GpsDistanceRefType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
				setGPSDestDistance((NonNegativeRealType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
				setGPSProcessingMethod((StringType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
				setGPSAreaInformation((StringType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
				setGPSDateStamp((DateType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
				setGPSDifferential((GpsDifferentialType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
				setGPSField1((SingleFieldType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
				setGPSField2((SingleFieldType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
				setGPSField3((RepeatedFieldType)newValue);
				return;
			case ExifPackage.GPS_IFD_TYPE__TAG:
				setTag((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
				setGPSVersionID((StringType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
				setGPSLatitudeRef((GpsLatitudeRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
				setGPSLatitude((GpsLatitudeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
				setGPSLongitudeRef((GpsLongitudeRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
				setGPSLongitude((GpsLongitudeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
				setGPSAltitudeRef((GpsAltitudeRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
				setGPSAltitude((NonNegativeRealType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
				setGPSTimeStamp((TimeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
				setGPSSatellites((StringType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
				setGPSStatus((GpsStatusType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
				setGPSMeasureMode((GpsMeasureModeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
				setGPSDOP((NonNegativeRealType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
				setGPSSpeedRef((GpsSpeedRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
				setGPSSpeed((NonNegativeRealType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
				setGPSTrackRef((GpsDirectionType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
				setGPSTrack((GpsBearingType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
				setGPSImgDirectionRef((GpsDirectionType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
				setGPSImgDirection((GpsBearingType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
				setGPSMapDatum((StringType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
				setGPSDestLatitudeRef((GpsLatitudeRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
				setGPSDestLatitude((GpsLatitudeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
				setGPSDestLongitudeRef((GpsLongitudeRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
				setGPSDestLongitude((GpsLongitudeType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
				setGPSDestBearingRef((GpsDirectionType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
				setGPSDestBearing((GpsBearingType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
				setGPSDestDistanceRef((GpsDistanceRefType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
				setGPSDestDistance((NonNegativeRealType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
				setGPSProcessingMethod((StringType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
				setGPSAreaInformation((StringType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
				setGPSDateStamp((DateType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
				setGPSDifferential((GpsDifferentialType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
				setGPSField1((SingleFieldType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
				setGPSField2((SingleFieldType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
				setGPSField3((RepeatedFieldType)null);
				return;
			case ExifPackage.GPS_IFD_TYPE__TAG:
				setTag(TAG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
				return gPSVersionID != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
				return gPSLatitudeRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
				return gPSLatitude != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
				return gPSLongitudeRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
				return gPSLongitude != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
				return gPSAltitudeRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
				return gPSAltitude != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
				return gPSTimeStamp != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
				return gPSSatellites != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
				return gPSStatus != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
				return gPSMeasureMode != null;
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
				return gPSDOP != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
				return gPSSpeedRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
				return gPSSpeed != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
				return gPSTrackRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
				return gPSTrack != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
				return gPSImgDirectionRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
				return gPSImgDirection != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
				return gPSMapDatum != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
				return gPSDestLatitudeRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
				return gPSDestLatitude != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
				return gPSDestLongitudeRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
				return gPSDestLongitude != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
				return gPSDestBearingRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
				return gPSDestBearing != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
				return gPSDestDistanceRef != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
				return gPSDestDistance != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
				return gPSProcessingMethod != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
				return gPSAreaInformation != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
				return gPSDateStamp != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
				return gPSDifferential != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
				return gPSField1 != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
				return gPSField2 != null;
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
				return gPSField3 != null;
			case ExifPackage.GPS_IFD_TYPE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //GpsIfdTypeImpl
