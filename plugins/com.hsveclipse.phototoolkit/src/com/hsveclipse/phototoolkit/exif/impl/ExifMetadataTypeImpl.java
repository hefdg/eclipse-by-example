/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.ExifIfdType;
import com.hsveclipse.phototoolkit.exif.ExifMetadataType;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.GpsIfdType;
import com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType;
import com.hsveclipse.phototoolkit.exif.TiffIfdType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl#getTiffIfd <em>Tiff Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl#getExifIfd <em>Exif Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl#getGpsIfd <em>Gps Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl#getInteroperabilityIfd <em>Interoperability Ifd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExifMetadataTypeImpl extends MinimalEObjectImpl.Container implements ExifMetadataType {
	/**
	 * The cached value of the '{@link #getTiffIfd() <em>Tiff Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiffIfd()
	 * @generated
	 * @ordered
	 */
	protected TiffIfdType tiffIfd;

	/**
	 * The cached value of the '{@link #getExifIfd() <em>Exif Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExifIfd()
	 * @generated
	 * @ordered
	 */
	protected ExifIfdType exifIfd;

	/**
	 * The cached value of the '{@link #getGpsIfd() <em>Gps Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpsIfd()
	 * @generated
	 * @ordered
	 */
	protected GpsIfdType gpsIfd;

	/**
	 * The cached value of the '{@link #getInteroperabilityIfd() <em>Interoperability Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteroperabilityIfd()
	 * @generated
	 * @ordered
	 */
	protected InteroperabilityIfdType interoperabilityIfd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExifMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getExifMetadataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiffIfdType getTiffIfd() {
		return tiffIfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiffIfd(TiffIfdType newTiffIfd, NotificationChain msgs) {
		TiffIfdType oldTiffIfd = tiffIfd;
		tiffIfd = newTiffIfd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD, oldTiffIfd, newTiffIfd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiffIfd(TiffIfdType newTiffIfd) {
		if (newTiffIfd != tiffIfd) {
			NotificationChain msgs = null;
			if (tiffIfd != null)
				msgs = ((InternalEObject)tiffIfd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD, null, msgs);
			if (newTiffIfd != null)
				msgs = ((InternalEObject)newTiffIfd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD, null, msgs);
			msgs = basicSetTiffIfd(newTiffIfd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD, newTiffIfd, newTiffIfd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifIfdType getExifIfd() {
		return exifIfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExifIfd(ExifIfdType newExifIfd, NotificationChain msgs) {
		ExifIfdType oldExifIfd = exifIfd;
		exifIfd = newExifIfd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD, oldExifIfd, newExifIfd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExifIfd(ExifIfdType newExifIfd) {
		if (newExifIfd != exifIfd) {
			NotificationChain msgs = null;
			if (exifIfd != null)
				msgs = ((InternalEObject)exifIfd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD, null, msgs);
			if (newExifIfd != null)
				msgs = ((InternalEObject)newExifIfd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD, null, msgs);
			msgs = basicSetExifIfd(newExifIfd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD, newExifIfd, newExifIfd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsIfdType getGpsIfd() {
		return gpsIfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGpsIfd(GpsIfdType newGpsIfd, NotificationChain msgs) {
		GpsIfdType oldGpsIfd = gpsIfd;
		gpsIfd = newGpsIfd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__GPS_IFD, oldGpsIfd, newGpsIfd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpsIfd(GpsIfdType newGpsIfd) {
		if (newGpsIfd != gpsIfd) {
			NotificationChain msgs = null;
			if (gpsIfd != null)
				msgs = ((InternalEObject)gpsIfd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__GPS_IFD, null, msgs);
			if (newGpsIfd != null)
				msgs = ((InternalEObject)newGpsIfd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__GPS_IFD, null, msgs);
			msgs = basicSetGpsIfd(newGpsIfd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__GPS_IFD, newGpsIfd, newGpsIfd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityIfdType getInteroperabilityIfd() {
		return interoperabilityIfd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteroperabilityIfd(InteroperabilityIfdType newInteroperabilityIfd, NotificationChain msgs) {
		InteroperabilityIfdType oldInteroperabilityIfd = interoperabilityIfd;
		interoperabilityIfd = newInteroperabilityIfd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD, oldInteroperabilityIfd, newInteroperabilityIfd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityIfd(InteroperabilityIfdType newInteroperabilityIfd) {
		if (newInteroperabilityIfd != interoperabilityIfd) {
			NotificationChain msgs = null;
			if (interoperabilityIfd != null)
				msgs = ((InternalEObject)interoperabilityIfd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD, null, msgs);
			if (newInteroperabilityIfd != null)
				msgs = ((InternalEObject)newInteroperabilityIfd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD, null, msgs);
			msgs = basicSetInteroperabilityIfd(newInteroperabilityIfd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD, newInteroperabilityIfd, newInteroperabilityIfd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD:
				return basicSetTiffIfd(null, msgs);
			case ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD:
				return basicSetExifIfd(null, msgs);
			case ExifPackage.EXIF_METADATA_TYPE__GPS_IFD:
				return basicSetGpsIfd(null, msgs);
			case ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD:
				return basicSetInteroperabilityIfd(null, msgs);
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
			case ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD:
				return getTiffIfd();
			case ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD:
				return getExifIfd();
			case ExifPackage.EXIF_METADATA_TYPE__GPS_IFD:
				return getGpsIfd();
			case ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD:
				return getInteroperabilityIfd();
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
			case ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD:
				setTiffIfd((TiffIfdType)newValue);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD:
				setExifIfd((ExifIfdType)newValue);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__GPS_IFD:
				setGpsIfd((GpsIfdType)newValue);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD:
				setInteroperabilityIfd((InteroperabilityIfdType)newValue);
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
			case ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD:
				setTiffIfd((TiffIfdType)null);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD:
				setExifIfd((ExifIfdType)null);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__GPS_IFD:
				setGpsIfd((GpsIfdType)null);
				return;
			case ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD:
				setInteroperabilityIfd((InteroperabilityIfdType)null);
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
			case ExifPackage.EXIF_METADATA_TYPE__TIFF_IFD:
				return tiffIfd != null;
			case ExifPackage.EXIF_METADATA_TYPE__EXIF_IFD:
				return exifIfd != null;
			case ExifPackage.EXIF_METADATA_TYPE__GPS_IFD:
				return gpsIfd != null;
			case ExifPackage.EXIF_METADATA_TYPE__INTEROPERABILITY_IFD:
				return interoperabilityIfd != null;
		}
		return super.eIsSet(featureID);
	}

} //ExifMetadataTypeImpl
