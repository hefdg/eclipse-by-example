/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifVersion <em>Exif Version</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashpixVersion <em>Flashpix Version</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getColorSpace <em>Color Space</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getComponentsConfiguration <em>Components Configuration</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCompressedBitsPerPixel <em>Compressed Bits Per Pixel</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelXDimension <em>Pixel XDimension</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelYDimension <em>Pixel YDimension</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMakerNote <em>Maker Note</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getUserComment <em>User Comment</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getRelatedSoundFile <em>Related Sound File</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeOriginal <em>Date Time Original</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeDigitized <em>Date Time Digitized</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTime <em>Sub Sec Time</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeOriginal <em>Sub Sec Time Original</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeDigitized <em>Sub Sec Time Digitized</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureTime <em>Exposure Time</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFNumber <em>FNumber</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureProgram <em>Exposure Program</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpectralSensitivity <em>Spectral Sensitivity</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getISOSpeedRatings <em>ISO Speed Ratings</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getOECF <em>OECF</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getShutterSpeedValue <em>Shutter Speed Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getApertureValue <em>Aperture Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getBrightnessValue <em>Brightness Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureBiasValue <em>Exposure Bias Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMaxApertureValue <em>Max Aperture Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistance <em>Subject Distance</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMeteringMode <em>Metering Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getLightSource <em>Light Source</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlash <em>Flash</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectArea <em>Subject Area</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashEnergy <em>Flash Energy</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpatialFrequencyResponse <em>Spatial Frequency Response</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneXResolution <em>Focal Plane XResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneYResolution <em>Focal Plane YResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneResolutionUnit <em>Focal Plane Resolution Unit</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectLocation <em>Subject Location</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureIndex <em>Exposure Index</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSensingMethod <em>Sensing Method</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFileSource <em>File Source</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneType <em>Scene Type</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCFAPattern <em>CFA Pattern</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCustomRendered <em>Custom Rendered</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureMode <em>Exposure Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getWhiteBalance <em>White Balance</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDigitalZoomRatio <em>Digital Zoom Ratio</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLengthIn35mmFilm <em>Focal Length In35mm Film</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneCaptureType <em>Scene Capture Type</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGainControl <em>Gain Control</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getContrast <em>Contrast</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSharpness <em>Sharpness</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDeviceSettingDescription <em>Device Setting Description</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistanceRange <em>Subject Distance Range</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGamma <em>Gamma</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField1 <em>Exif Field1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField2 <em>Exif Field2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField3 <em>Exif Field3</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType()
 * @model extendedMetaData="name='ExifIfd_._type' kind='elementOnly'"
 * @generated
 */
public interface ExifIfdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exif Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exif Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exif Version</em>' containment reference.
	 * @see #setExifVersion(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExifVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExifVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getExifVersion();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifVersion <em>Exif Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif Version</em>' containment reference.
	 * @see #getExifVersion()
	 * @generated
	 */
	void setExifVersion(StringType value);

	/**
	 * Returns the value of the '<em><b>Flashpix Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flashpix Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flashpix Version</em>' containment reference.
	 * @see #setFlashpixVersion(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FlashpixVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FlashpixVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getFlashpixVersion();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashpixVersion <em>Flashpix Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flashpix Version</em>' containment reference.
	 * @see #getFlashpixVersion()
	 * @generated
	 */
	void setFlashpixVersion(StringType value);

	/**
	 * Returns the value of the '<em><b>Color Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Space</em>' containment reference.
	 * @see #setColorSpace(ColorSpaceType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ColorSpace()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ColorSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorSpaceType getColorSpace();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getColorSpace <em>Color Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Space</em>' containment reference.
	 * @see #getColorSpace()
	 * @generated
	 */
	void setColorSpace(ColorSpaceType value);

	/**
	 * Returns the value of the '<em><b>Components Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components Configuration</em>' containment reference.
	 * @see #setComponentsConfiguration(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ComponentsConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComponentsConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getComponentsConfiguration();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getComponentsConfiguration <em>Components Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Components Configuration</em>' containment reference.
	 * @see #getComponentsConfiguration()
	 * @generated
	 */
	void setComponentsConfiguration(StringType value);

	/**
	 * Returns the value of the '<em><b>Compressed Bits Per Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressed Bits Per Pixel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressed Bits Per Pixel</em>' containment reference.
	 * @see #setCompressedBitsPerPixel(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_CompressedBitsPerPixel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CompressedBitsPerPixel' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getCompressedBitsPerPixel();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCompressedBitsPerPixel <em>Compressed Bits Per Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressed Bits Per Pixel</em>' containment reference.
	 * @see #getCompressedBitsPerPixel()
	 * @generated
	 */
	void setCompressedBitsPerPixel(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Pixel XDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixel XDimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixel XDimension</em>' containment reference.
	 * @see #setPixelXDimension(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_PixelXDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PixelXDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getPixelXDimension();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelXDimension <em>Pixel XDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel XDimension</em>' containment reference.
	 * @see #getPixelXDimension()
	 * @generated
	 */
	void setPixelXDimension(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Pixel YDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixel YDimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixel YDimension</em>' containment reference.
	 * @see #setPixelYDimension(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_PixelYDimension()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PixelYDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getPixelYDimension();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelYDimension <em>Pixel YDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel YDimension</em>' containment reference.
	 * @see #getPixelYDimension()
	 * @generated
	 */
	void setPixelYDimension(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Maker Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maker Note</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maker Note</em>' containment reference.
	 * @see #setMakerNote(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_MakerNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MakerNote' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getMakerNote();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMakerNote <em>Maker Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maker Note</em>' containment reference.
	 * @see #getMakerNote()
	 * @generated
	 */
	void setMakerNote(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>User Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Comment</em>' containment reference.
	 * @see #setUserComment(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_UserComment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UserComment' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getUserComment();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getUserComment <em>User Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Comment</em>' containment reference.
	 * @see #getUserComment()
	 * @generated
	 */
	void setUserComment(StringType value);

	/**
	 * Returns the value of the '<em><b>Related Sound File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Sound File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Sound File</em>' containment reference.
	 * @see #setRelatedSoundFile(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_RelatedSoundFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelatedSoundFile' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getRelatedSoundFile();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getRelatedSoundFile <em>Related Sound File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Sound File</em>' containment reference.
	 * @see #getRelatedSoundFile()
	 * @generated
	 */
	void setRelatedSoundFile(StringType value);

	/**
	 * Returns the value of the '<em><b>Date Time Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Original</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Original</em>' containment reference.
	 * @see #setDateTimeOriginal(DateTimeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_DateTimeOriginal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateTimeOriginal' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeType getDateTimeOriginal();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeOriginal <em>Date Time Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Original</em>' containment reference.
	 * @see #getDateTimeOriginal()
	 * @generated
	 */
	void setDateTimeOriginal(DateTimeType value);

	/**
	 * Returns the value of the '<em><b>Date Time Digitized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Digitized</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Digitized</em>' containment reference.
	 * @see #setDateTimeDigitized(DateTimeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_DateTimeDigitized()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateTimeDigitized' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeType getDateTimeDigitized();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeDigitized <em>Date Time Digitized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Digitized</em>' containment reference.
	 * @see #getDateTimeDigitized()
	 * @generated
	 */
	void setDateTimeDigitized(DateTimeType value);

	/**
	 * Returns the value of the '<em><b>Sub Sec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Sec Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sec Time</em>' containment reference.
	 * @see #setSubSecTime(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubSecTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubSecTime' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getSubSecTime();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTime <em>Sub Sec Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Sec Time</em>' containment reference.
	 * @see #getSubSecTime()
	 * @generated
	 */
	void setSubSecTime(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Sub Sec Time Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Sec Time Original</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sec Time Original</em>' containment reference.
	 * @see #setSubSecTimeOriginal(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubSecTimeOriginal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubSecTimeOriginal' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getSubSecTimeOriginal();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeOriginal <em>Sub Sec Time Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Sec Time Original</em>' containment reference.
	 * @see #getSubSecTimeOriginal()
	 * @generated
	 */
	void setSubSecTimeOriginal(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Sub Sec Time Digitized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Sec Time Digitized</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Sec Time Digitized</em>' containment reference.
	 * @see #setSubSecTimeDigitized(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubSecTimeDigitized()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubSecTimeDigitized' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getSubSecTimeDigitized();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeDigitized <em>Sub Sec Time Digitized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Sec Time Digitized</em>' containment reference.
	 * @see #getSubSecTimeDigitized()
	 * @generated
	 */
	void setSubSecTimeDigitized(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>Exposure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Units is seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Time</em>' containment reference.
	 * @see #setExposureTime(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExposureTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExposureTime' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getExposureTime();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureTime <em>Exposure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Time</em>' containment reference.
	 * @see #getExposureTime()
	 * @generated
	 */
	void setExposureTime(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>FNumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FNumber</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FNumber</em>' containment reference.
	 * @see #setFNumber(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getFNumber();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFNumber <em>FNumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FNumber</em>' containment reference.
	 * @see #getFNumber()
	 * @generated
	 */
	void setFNumber(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Exposure Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Program</em>' containment reference.
	 * @see #setExposureProgram(ExposureProgramType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExposureProgram()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExposureProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	ExposureProgramType getExposureProgram();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureProgram <em>Exposure Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Program</em>' containment reference.
	 * @see #getExposureProgram()
	 * @generated
	 */
	void setExposureProgram(ExposureProgramType value);

	/**
	 * Returns the value of the '<em><b>Spectral Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spectral Sensitivity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spectral Sensitivity</em>' containment reference.
	 * @see #setSpectralSensitivity(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SpectralSensitivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpectralSensitivity' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getSpectralSensitivity();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpectralSensitivity <em>Spectral Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spectral Sensitivity</em>' containment reference.
	 * @see #getSpectralSensitivity()
	 * @generated
	 */
	void setSpectralSensitivity(StringType value);

	/**
	 * Returns the value of the '<em><b>ISO Speed Ratings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISO Speed Ratings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISO Speed Ratings</em>' containment reference.
	 * @see #setISOSpeedRatings(NonNegativeIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ISOSpeedRatings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISOSpeedRatings' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeIntegerType getISOSpeedRatings();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getISOSpeedRatings <em>ISO Speed Ratings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISO Speed Ratings</em>' containment reference.
	 * @see #getISOSpeedRatings()
	 * @generated
	 */
	void setISOSpeedRatings(NonNegativeIntegerType value);

	/**
	 * Returns the value of the '<em><b>OECF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OECF</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OECF</em>' containment reference.
	 * @see #setOECF(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_OECF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OECF' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getOECF();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getOECF <em>OECF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OECF</em>' containment reference.
	 * @see #getOECF()
	 * @generated
	 */
	void setOECF(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>Shutter Speed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is the APEX Value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shutter Speed Value</em>' containment reference.
	 * @see #setShutterSpeedValue(RealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ShutterSpeedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ShutterSpeedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getShutterSpeedValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getShutterSpeedValue <em>Shutter Speed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shutter Speed Value</em>' containment reference.
	 * @see #getShutterSpeedValue()
	 * @generated
	 */
	void setShutterSpeedValue(RealType value);

	/**
	 * Returns the value of the '<em><b>Aperture Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The  unit is the APEX value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aperture Value</em>' containment reference.
	 * @see #setApertureValue(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ApertureValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ApertureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getApertureValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getApertureValue <em>Aperture Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aperture Value</em>' containment reference.
	 * @see #getApertureValue()
	 * @generated
	 */
	void setApertureValue(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Brightness Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is the APEX value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Brightness Value</em>' containment reference.
	 * @see #setBrightnessValue(RealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_BrightnessValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BrightnessValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getBrightnessValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getBrightnessValue <em>Brightness Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Brightness Value</em>' containment reference.
	 * @see #getBrightnessValue()
	 * @generated
	 */
	void setBrightnessValue(RealType value);

	/**
	 * Returns the value of the '<em><b>Exposure Bias Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is the APEX value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exposure Bias Value</em>' containment reference.
	 * @see #setExposureBiasValue(RealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExposureBiasValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExposureBiasValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealType getExposureBiasValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureBiasValue <em>Exposure Bias Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Bias Value</em>' containment reference.
	 * @see #getExposureBiasValue()
	 * @generated
	 */
	void setExposureBiasValue(RealType value);

	/**
	 * Returns the value of the '<em><b>Max Aperture Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is the APEX value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Aperture Value</em>' containment reference.
	 * @see #setMaxApertureValue(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_MaxApertureValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MaxApertureValue' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getMaxApertureValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMaxApertureValue <em>Max Aperture Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aperture Value</em>' containment reference.
	 * @see #getMaxApertureValue()
	 * @generated
	 */
	void setMaxApertureValue(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Subject Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is meters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Distance</em>' containment reference.
	 * @see #setSubjectDistance(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubjectDistance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubjectDistance' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getSubjectDistance();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistance <em>Subject Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Distance</em>' containment reference.
	 * @see #getSubjectDistance()
	 * @generated
	 */
	void setSubjectDistance(StringType value);

	/**
	 * Returns the value of the '<em><b>Metering Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metering Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metering Mode</em>' containment reference.
	 * @see #setMeteringMode(MeteringModeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_MeteringMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MeteringMode' namespace='##targetNamespace'"
	 * @generated
	 */
	MeteringModeType getMeteringMode();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMeteringMode <em>Metering Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metering Mode</em>' containment reference.
	 * @see #getMeteringMode()
	 * @generated
	 */
	void setMeteringMode(MeteringModeType value);

	/**
	 * Returns the value of the '<em><b>Light Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Source</em>' containment reference.
	 * @see #setLightSource(LightSourceType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_LightSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LightSource' namespace='##targetNamespace'"
	 * @generated
	 */
	LightSourceType getLightSource();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getLightSource <em>Light Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Source</em>' containment reference.
	 * @see #getLightSource()
	 * @generated
	 */
	void setLightSource(LightSourceType value);

	/**
	 * Returns the value of the '<em><b>Flash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flash</em>' containment reference.
	 * @see #setFlash(FlashType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Flash()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Flash' namespace='##targetNamespace'"
	 * @generated
	 */
	FlashType getFlash();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlash <em>Flash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash</em>' containment reference.
	 * @see #getFlash()
	 * @generated
	 */
	void setFlash(FlashType value);

	/**
	 * Returns the value of the '<em><b>Focal Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is millimeters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Length</em>' containment reference.
	 * @see #setFocalLength(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FocalLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FocalLength' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getFocalLength();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLength <em>Focal Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Length</em>' containment reference.
	 * @see #getFocalLength()
	 * @generated
	 */
	void setFocalLength(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Subject Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Area</em>' containment reference.
	 * @see #setSubjectArea(SubjectAreaType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubjectArea()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubjectArea' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectAreaType getSubjectArea();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectArea <em>Subject Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Area</em>' containment reference.
	 * @see #getSubjectArea()
	 * @generated
	 */
	void setSubjectArea(SubjectAreaType value);

	/**
	 * Returns the value of the '<em><b>Flash Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is Beam Candle Power Seconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flash Energy</em>' containment reference.
	 * @see #setFlashEnergy(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FlashEnergy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FlashEnergy' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getFlashEnergy();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashEnergy <em>Flash Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flash Energy</em>' containment reference.
	 * @see #getFlashEnergy()
	 * @generated
	 */
	void setFlashEnergy(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Spatial Frequency Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not implemented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spatial Frequency Response</em>' containment reference.
	 * @see #setSpatialFrequencyResponse(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SpatialFrequencyResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpatialFrequencyResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getSpatialFrequencyResponse();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpatialFrequencyResponse <em>Spatial Frequency Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spatial Frequency Response</em>' containment reference.
	 * @see #getSpatialFrequencyResponse()
	 * @generated
	 */
	void setSpatialFrequencyResponse(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>Focal Plane XResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Plane XResolution</em>' containment reference.
	 * @see #setFocalPlaneXResolution(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FocalPlaneXResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FocalPlaneXResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getFocalPlaneXResolution();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneXResolution <em>Focal Plane XResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Plane XResolution</em>' containment reference.
	 * @see #getFocalPlaneXResolution()
	 * @generated
	 */
	void setFocalPlaneXResolution(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Focal Plane YResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unit is pixels
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focal Plane YResolution</em>' containment reference.
	 * @see #setFocalPlaneYResolution(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FocalPlaneYResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FocalPlaneYResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getFocalPlaneYResolution();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneYResolution <em>Focal Plane YResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Plane YResolution</em>' containment reference.
	 * @see #getFocalPlaneYResolution()
	 * @generated
	 */
	void setFocalPlaneYResolution(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Focal Plane Resolution Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal Plane Resolution Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Plane Resolution Unit</em>' containment reference.
	 * @see #setFocalPlaneResolutionUnit(ResolutionType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FocalPlaneResolutionUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FocalPlaneResolutionUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolutionType getFocalPlaneResolutionUnit();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneResolutionUnit <em>Focal Plane Resolution Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Plane Resolution Unit</em>' containment reference.
	 * @see #getFocalPlaneResolutionUnit()
	 * @generated
	 */
	void setFocalPlaneResolutionUnit(ResolutionType value);

	/**
	 * Returns the value of the '<em><b>Subject Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Location</em>' containment reference.
	 * @see #setSubjectLocation(SubjectLocationType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubjectLocation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubjectLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectLocationType getSubjectLocation();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectLocation <em>Subject Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Location</em>' containment reference.
	 * @see #getSubjectLocation()
	 * @generated
	 */
	void setSubjectLocation(SubjectLocationType value);

	/**
	 * Returns the value of the '<em><b>Exposure Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Index</em>' containment reference.
	 * @see #setExposureIndex(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExposureIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExposureIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getExposureIndex();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureIndex <em>Exposure Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Index</em>' containment reference.
	 * @see #getExposureIndex()
	 * @generated
	 */
	void setExposureIndex(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Sensing Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensing Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensing Method</em>' containment reference.
	 * @see #setSensingMethod(SensingMethodType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SensingMethod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SensingMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	SensingMethodType getSensingMethod();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSensingMethod <em>Sensing Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensing Method</em>' containment reference.
	 * @see #getSensingMethod()
	 * @generated
	 */
	void setSensingMethod(SensingMethodType value);

	/**
	 * Returns the value of the '<em><b>File Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Source</em>' containment reference.
	 * @see #setFileSource(FileSourceType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FileSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FileSource' namespace='##targetNamespace'"
	 * @generated
	 */
	FileSourceType getFileSource();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFileSource <em>File Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Source</em>' containment reference.
	 * @see #getFileSource()
	 * @generated
	 */
	void setFileSource(FileSourceType value);

	/**
	 * Returns the value of the '<em><b>Scene Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Type</em>' containment reference.
	 * @see #setSceneType(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SceneType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SceneType' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getSceneType();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneType <em>Scene Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Type</em>' containment reference.
	 * @see #getSceneType()
	 * @generated
	 */
	void setSceneType(StringType value);

	/**
	 * Returns the value of the '<em><b>CFA Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CFA Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CFA Pattern</em>' containment reference.
	 * @see #setCFAPattern(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_CFAPattern()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CFAPattern' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getCFAPattern();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCFAPattern <em>CFA Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CFA Pattern</em>' containment reference.
	 * @see #getCFAPattern()
	 * @generated
	 */
	void setCFAPattern(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>Custom Rendered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Rendered</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Rendered</em>' containment reference.
	 * @see #setCustomRendered(CustomRenderedType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_CustomRendered()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomRendered' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomRenderedType getCustomRendered();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCustomRendered <em>Custom Rendered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Rendered</em>' containment reference.
	 * @see #getCustomRendered()
	 * @generated
	 */
	void setCustomRendered(CustomRenderedType value);

	/**
	 * Returns the value of the '<em><b>Exposure Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure Mode</em>' containment reference.
	 * @see #setExposureMode(ExposureModeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExposureMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExposureMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ExposureModeType getExposureMode();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureMode <em>Exposure Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure Mode</em>' containment reference.
	 * @see #getExposureMode()
	 * @generated
	 */
	void setExposureMode(ExposureModeType value);

	/**
	 * Returns the value of the '<em><b>White Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Balance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Balance</em>' containment reference.
	 * @see #setWhiteBalance(WhiteBalanceType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_WhiteBalance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WhiteBalance' namespace='##targetNamespace'"
	 * @generated
	 */
	WhiteBalanceType getWhiteBalance();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getWhiteBalance <em>White Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Balance</em>' containment reference.
	 * @see #getWhiteBalance()
	 * @generated
	 */
	void setWhiteBalance(WhiteBalanceType value);

	/**
	 * Returns the value of the '<em><b>Digital Zoom Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digital Zoom Ratio</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digital Zoom Ratio</em>' containment reference.
	 * @see #setDigitalZoomRatio(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_DigitalZoomRatio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DigitalZoomRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getDigitalZoomRatio();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDigitalZoomRatio <em>Digital Zoom Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digital Zoom Ratio</em>' containment reference.
	 * @see #getDigitalZoomRatio()
	 * @generated
	 */
	void setDigitalZoomRatio(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Focal Length In35mm Film</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal Length In35mm Film</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal Length In35mm Film</em>' containment reference.
	 * @see #setFocalLengthIn35mmFilm(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_FocalLengthIn35mmFilm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FocalLengthIn35mmFilm' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getFocalLengthIn35mmFilm();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLengthIn35mmFilm <em>Focal Length In35mm Film</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal Length In35mm Film</em>' containment reference.
	 * @see #getFocalLengthIn35mmFilm()
	 * @generated
	 */
	void setFocalLengthIn35mmFilm(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Scene Capture Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scene Capture Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scene Capture Type</em>' containment reference.
	 * @see #setSceneCaptureType(SceneCaptureType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SceneCaptureType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SceneCaptureType' namespace='##targetNamespace'"
	 * @generated
	 */
	SceneCaptureType getSceneCaptureType();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneCaptureType <em>Scene Capture Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scene Capture Type</em>' containment reference.
	 * @see #getSceneCaptureType()
	 * @generated
	 */
	void setSceneCaptureType(SceneCaptureType value);

	/**
	 * Returns the value of the '<em><b>Gain Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gain Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gain Control</em>' containment reference.
	 * @see #setGainControl(GainControlType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_GainControl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GainControl' namespace='##targetNamespace'"
	 * @generated
	 */
	GainControlType getGainControl();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGainControl <em>Gain Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gain Control</em>' containment reference.
	 * @see #getGainControl()
	 * @generated
	 */
	void setGainControl(GainControlType value);

	/**
	 * Returns the value of the '<em><b>Contrast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrast</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrast</em>' containment reference.
	 * @see #setContrast(ContrastType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Contrast()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Contrast' namespace='##targetNamespace'"
	 * @generated
	 */
	ContrastType getContrast();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getContrast <em>Contrast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrast</em>' containment reference.
	 * @see #getContrast()
	 * @generated
	 */
	void setContrast(ContrastType value);

	/**
	 * Returns the value of the '<em><b>Saturation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Saturation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saturation</em>' containment reference.
	 * @see #setSaturation(SaturationType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Saturation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Saturation' namespace='##targetNamespace'"
	 * @generated
	 */
	SaturationType getSaturation();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSaturation <em>Saturation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Saturation</em>' containment reference.
	 * @see #getSaturation()
	 * @generated
	 */
	void setSaturation(SaturationType value);

	/**
	 * Returns the value of the '<em><b>Sharpness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharpness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharpness</em>' containment reference.
	 * @see #setSharpness(SharpnessType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Sharpness()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sharpness' namespace='##targetNamespace'"
	 * @generated
	 */
	SharpnessType getSharpness();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSharpness <em>Sharpness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharpness</em>' containment reference.
	 * @see #getSharpness()
	 * @generated
	 */
	void setSharpness(SharpnessType value);

	/**
	 * Returns the value of the '<em><b>Device Setting Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Setting Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Setting Description</em>' containment reference.
	 * @see #setDeviceSettingDescription(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_DeviceSettingDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DeviceSettingDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getDeviceSettingDescription();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDeviceSettingDescription <em>Device Setting Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Setting Description</em>' containment reference.
	 * @see #getDeviceSettingDescription()
	 * @generated
	 */
	void setDeviceSettingDescription(RepeatedFieldType value);

	/**
	 * Returns the value of the '<em><b>Subject Distance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Distance Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Distance Range</em>' containment reference.
	 * @see #setSubjectDistanceRange(SubjectDistanceRangeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_SubjectDistanceRange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubjectDistanceRange' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectDistanceRangeType getSubjectDistanceRange();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistanceRange <em>Subject Distance Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Distance Range</em>' containment reference.
	 * @see #getSubjectDistanceRange()
	 * @generated
	 */
	void setSubjectDistanceRange(SubjectDistanceRangeType value);

	/**
	 * Returns the value of the '<em><b>Image Unique ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Unique ID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Unique ID</em>' containment reference.
	 * @see #setImageUniqueID(UuidType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ImageUniqueID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageUniqueID' namespace='##targetNamespace'"
	 * @generated
	 */
	UuidType getImageUniqueID();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getImageUniqueID <em>Image Unique ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Unique ID</em>' containment reference.
	 * @see #getImageUniqueID()
	 * @generated
	 */
	void setImageUniqueID(UuidType value);

	/**
	 * Returns the value of the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gamma</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamma</em>' containment reference.
	 * @see #setGamma(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Gamma()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gamma' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getGamma();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGamma <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gamma</em>' containment reference.
	 * @see #getGamma()
	 * @generated
	 */
	void setGamma(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Exif Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exif Field1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exif Field1</em>' containment reference.
	 * @see #setExifField1(SingleFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExifField1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExifField1' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getExifField1();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField1 <em>Exif Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif Field1</em>' containment reference.
	 * @see #getExifField1()
	 * @generated
	 */
	void setExifField1(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>Exif Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exif Field2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exif Field2</em>' containment reference.
	 * @see #setExifField2(SingleFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExifField2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExifField2' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getExifField2();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField2 <em>Exif Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif Field2</em>' containment reference.
	 * @see #getExifField2()
	 * @generated
	 */
	void setExifField2(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>Exif Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exif Field3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exif Field3</em>' containment reference.
	 * @see #setExifField3(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_ExifField3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExifField3' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getExifField3();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField3 <em>Exif Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif Field3</em>' containment reference.
	 * @see #getExifField3()
	 * @generated
	 */
	void setExifField3(RepeatedFieldType value);

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
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getExifIfdType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // ExifIfdType
