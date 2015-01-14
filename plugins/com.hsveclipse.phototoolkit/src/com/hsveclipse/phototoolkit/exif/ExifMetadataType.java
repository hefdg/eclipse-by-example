/**
 */
package com.hsveclipse.phototoolkit.exif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getTiffIfd <em>Tiff Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getExifIfd <em>Exif Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getGpsIfd <em>Gps Ifd</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getInteroperabilityIfd <em>Interoperability Ifd</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifMetadataType()
 * @model
 * @generated
 */
public interface ExifMetadataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiff Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags from the TIFF IFD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tiff Ifd</em>' containment reference.
	 * @see #setTiffIfd(TiffIfdType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifMetadataType_TiffIfd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TiffIfd' namespace='##targetNamespace'"
	 * @generated
	 */
	TiffIfdType getTiffIfd();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getTiffIfd <em>Tiff Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiff Ifd</em>' containment reference.
	 * @see #getTiffIfd()
	 * @generated
	 */
	void setTiffIfd(TiffIfdType value);

	/**
	 * Returns the value of the '<em><b>Exif Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags from the EXIF IFD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exif Ifd</em>' containment reference.
	 * @see #setExifIfd(ExifIfdType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifMetadataType_ExifIfd()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExifIfd' namespace='##targetNamespace'"
	 * @generated
	 */
	ExifIfdType getExifIfd();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getExifIfd <em>Exif Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif Ifd</em>' containment reference.
	 * @see #getExifIfd()
	 * @generated
	 */
	void setExifIfd(ExifIfdType value);

	/**
	 * Returns the value of the '<em><b>Gps Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags from the GPS IFD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gps Ifd</em>' containment reference.
	 * @see #setGpsIfd(GpsIfdType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifMetadataType_GpsIfd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GpsIfd' namespace='##targetNamespace'"
	 * @generated
	 */
	GpsIfdType getGpsIfd();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getGpsIfd <em>Gps Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gps Ifd</em>' containment reference.
	 * @see #getGpsIfd()
	 * @generated
	 */
	void setGpsIfd(GpsIfdType value);

	/**
	 * Returns the value of the '<em><b>Interoperability Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags from the Interoperability IFD
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interoperability Ifd</em>' containment reference.
	 * @see #setInteroperabilityIfd(InteroperabilityIfdType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifMetadataType_InteroperabilityIfd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InteroperabilityIfd' namespace='##targetNamespace'"
	 * @generated
	 */
	InteroperabilityIfdType getInteroperabilityIfd();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getInteroperabilityIfd <em>Interoperability Ifd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interoperability Ifd</em>' containment reference.
	 * @see #getInteroperabilityIfd()
	 * @generated
	 */
	void setInteroperabilityIfd(InteroperabilityIfdType value);

} // ExifMetadataType
