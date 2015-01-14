/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.ColorSpaceType;
import com.hsveclipse.phototoolkit.exif.ContrastType;
import com.hsveclipse.phototoolkit.exif.CustomRenderedType;
import com.hsveclipse.phototoolkit.exif.DateTimeType;
import com.hsveclipse.phototoolkit.exif.ExifIfdType;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.ExposureModeType;
import com.hsveclipse.phototoolkit.exif.ExposureProgramType;
import com.hsveclipse.phototoolkit.exif.FileSourceType;
import com.hsveclipse.phototoolkit.exif.FlashType;
import com.hsveclipse.phototoolkit.exif.GainControlType;
import com.hsveclipse.phototoolkit.exif.LightSourceType;
import com.hsveclipse.phototoolkit.exif.MeteringModeType;
import com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType;
import com.hsveclipse.phototoolkit.exif.NonNegativeRealType;
import com.hsveclipse.phototoolkit.exif.PositiveIntegerType;
import com.hsveclipse.phototoolkit.exif.RealType;
import com.hsveclipse.phototoolkit.exif.RepeatedFieldType;
import com.hsveclipse.phototoolkit.exif.ResolutionType;
import com.hsveclipse.phototoolkit.exif.SaturationType;
import com.hsveclipse.phototoolkit.exif.SceneCaptureType;
import com.hsveclipse.phototoolkit.exif.SensingMethodType;
import com.hsveclipse.phototoolkit.exif.SharpnessType;
import com.hsveclipse.phototoolkit.exif.SingleFieldType;
import com.hsveclipse.phototoolkit.exif.StringType;
import com.hsveclipse.phototoolkit.exif.SubjectAreaType;
import com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType;
import com.hsveclipse.phototoolkit.exif.SubjectLocationType;
import com.hsveclipse.phototoolkit.exif.UuidType;
import com.hsveclipse.phototoolkit.exif.WhiteBalanceType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExifVersion <em>Exif Version</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFlashpixVersion <em>Flashpix Version</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getColorSpace <em>Color Space</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getComponentsConfiguration <em>Components Configuration</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getCompressedBitsPerPixel <em>Compressed Bits Per Pixel</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getPixelXDimension <em>Pixel XDimension</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getPixelYDimension <em>Pixel YDimension</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getMakerNote <em>Maker Note</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getUserComment <em>User Comment</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getRelatedSoundFile <em>Related Sound File</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getDateTimeOriginal <em>Date Time Original</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getDateTimeDigitized <em>Date Time Digitized</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubSecTime <em>Sub Sec Time</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubSecTimeOriginal <em>Sub Sec Time Original</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubSecTimeDigitized <em>Sub Sec Time Digitized</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExposureTime <em>Exposure Time</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFNumber <em>FNumber</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExposureProgram <em>Exposure Program</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSpectralSensitivity <em>Spectral Sensitivity</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getISOSpeedRatings <em>ISO Speed Ratings</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getOECF <em>OECF</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getShutterSpeedValue <em>Shutter Speed Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getApertureValue <em>Aperture Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getBrightnessValue <em>Brightness Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExposureBiasValue <em>Exposure Bias Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getMaxApertureValue <em>Max Aperture Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubjectDistance <em>Subject Distance</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getMeteringMode <em>Metering Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getLightSource <em>Light Source</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFlash <em>Flash</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFocalLength <em>Focal Length</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubjectArea <em>Subject Area</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFlashEnergy <em>Flash Energy</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSpatialFrequencyResponse <em>Spatial Frequency Response</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFocalPlaneXResolution <em>Focal Plane XResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFocalPlaneYResolution <em>Focal Plane YResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFocalPlaneResolutionUnit <em>Focal Plane Resolution Unit</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubjectLocation <em>Subject Location</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExposureIndex <em>Exposure Index</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSensingMethod <em>Sensing Method</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFileSource <em>File Source</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSceneType <em>Scene Type</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getCFAPattern <em>CFA Pattern</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getCustomRendered <em>Custom Rendered</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExposureMode <em>Exposure Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getWhiteBalance <em>White Balance</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getDigitalZoomRatio <em>Digital Zoom Ratio</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getFocalLengthIn35mmFilm <em>Focal Length In35mm Film</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSceneCaptureType <em>Scene Capture Type</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getGainControl <em>Gain Control</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getContrast <em>Contrast</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSaturation <em>Saturation</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSharpness <em>Sharpness</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getDeviceSettingDescription <em>Device Setting Description</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getSubjectDistanceRange <em>Subject Distance Range</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExifField1 <em>Exif Field1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExifField2 <em>Exif Field2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getExifField3 <em>Exif Field3</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExifIfdTypeImpl extends MinimalEObjectImpl.Container implements ExifIfdType {
	/**
	 * The cached value of the '{@link #getExifVersion() <em>Exif Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExifVersion()
	 * @generated
	 * @ordered
	 */
	protected StringType exifVersion;

	/**
	 * The cached value of the '{@link #getFlashpixVersion() <em>Flashpix Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashpixVersion()
	 * @generated
	 * @ordered
	 */
	protected StringType flashpixVersion;

	/**
	 * The cached value of the '{@link #getColorSpace() <em>Color Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorSpace()
	 * @generated
	 * @ordered
	 */
	protected ColorSpaceType colorSpace;

	/**
	 * The cached value of the '{@link #getComponentsConfiguration() <em>Components Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsConfiguration()
	 * @generated
	 * @ordered
	 */
	protected StringType componentsConfiguration;

	/**
	 * The cached value of the '{@link #getCompressedBitsPerPixel() <em>Compressed Bits Per Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressedBitsPerPixel()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType compressedBitsPerPixel;

	/**
	 * The cached value of the '{@link #getPixelXDimension() <em>Pixel XDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelXDimension()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType pixelXDimension;

	/**
	 * The cached value of the '{@link #getPixelYDimension() <em>Pixel YDimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelYDimension()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType pixelYDimension;

	/**
	 * The cached value of the '{@link #getMakerNote() <em>Maker Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakerNote()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType makerNote;

	/**
	 * The cached value of the '{@link #getUserComment() <em>User Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserComment()
	 * @generated
	 * @ordered
	 */
	protected StringType userComment;

	/**
	 * The cached value of the '{@link #getRelatedSoundFile() <em>Related Sound File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedSoundFile()
	 * @generated
	 * @ordered
	 */
	protected StringType relatedSoundFile;

	/**
	 * The cached value of the '{@link #getDateTimeOriginal() <em>Date Time Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeOriginal()
	 * @generated
	 * @ordered
	 */
	protected DateTimeType dateTimeOriginal;

	/**
	 * The cached value of the '{@link #getDateTimeDigitized() <em>Date Time Digitized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimeDigitized()
	 * @generated
	 * @ordered
	 */
	protected DateTimeType dateTimeDigitized;

	/**
	 * The cached value of the '{@link #getSubSecTime() <em>Sub Sec Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSecTime()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType subSecTime;

	/**
	 * The cached value of the '{@link #getSubSecTimeOriginal() <em>Sub Sec Time Original</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSecTimeOriginal()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType subSecTimeOriginal;

	/**
	 * The cached value of the '{@link #getSubSecTimeDigitized() <em>Sub Sec Time Digitized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSecTimeDigitized()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType subSecTimeDigitized;

	/**
	 * The cached value of the '{@link #getExposureTime() <em>Exposure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureTime()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType exposureTime;

	/**
	 * The cached value of the '{@link #getFNumber() <em>FNumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNumber()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType fNumber;

	/**
	 * The cached value of the '{@link #getExposureProgram() <em>Exposure Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureProgram()
	 * @generated
	 * @ordered
	 */
	protected ExposureProgramType exposureProgram;

	/**
	 * The cached value of the '{@link #getSpectralSensitivity() <em>Spectral Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpectralSensitivity()
	 * @generated
	 * @ordered
	 */
	protected StringType spectralSensitivity;

	/**
	 * The cached value of the '{@link #getISOSpeedRatings() <em>ISO Speed Ratings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISOSpeedRatings()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeIntegerType iSOSpeedRatings;

	/**
	 * The cached value of the '{@link #getOECF() <em>OECF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOECF()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType oECF;

	/**
	 * The cached value of the '{@link #getShutterSpeedValue() <em>Shutter Speed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShutterSpeedValue()
	 * @generated
	 * @ordered
	 */
	protected RealType shutterSpeedValue;

	/**
	 * The cached value of the '{@link #getApertureValue() <em>Aperture Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApertureValue()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType apertureValue;

	/**
	 * The cached value of the '{@link #getBrightnessValue() <em>Brightness Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrightnessValue()
	 * @generated
	 * @ordered
	 */
	protected RealType brightnessValue;

	/**
	 * The cached value of the '{@link #getExposureBiasValue() <em>Exposure Bias Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureBiasValue()
	 * @generated
	 * @ordered
	 */
	protected RealType exposureBiasValue;

	/**
	 * The cached value of the '{@link #getMaxApertureValue() <em>Max Aperture Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxApertureValue()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType maxApertureValue;

	/**
	 * The cached value of the '{@link #getSubjectDistance() <em>Subject Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectDistance()
	 * @generated
	 * @ordered
	 */
	protected StringType subjectDistance;

	/**
	 * The cached value of the '{@link #getMeteringMode() <em>Metering Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeteringMode()
	 * @generated
	 * @ordered
	 */
	protected MeteringModeType meteringMode;

	/**
	 * The cached value of the '{@link #getLightSource() <em>Light Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightSource()
	 * @generated
	 * @ordered
	 */
	protected LightSourceType lightSource;

	/**
	 * The cached value of the '{@link #getFlash() <em>Flash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlash()
	 * @generated
	 * @ordered
	 */
	protected FlashType flash;

	/**
	 * The cached value of the '{@link #getFocalLength() <em>Focal Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLength()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType focalLength;

	/**
	 * The cached value of the '{@link #getSubjectArea() <em>Subject Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectArea()
	 * @generated
	 * @ordered
	 */
	protected SubjectAreaType subjectArea;

	/**
	 * The cached value of the '{@link #getFlashEnergy() <em>Flash Energy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlashEnergy()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType flashEnergy;

	/**
	 * The cached value of the '{@link #getSpatialFrequencyResponse() <em>Spatial Frequency Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpatialFrequencyResponse()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType spatialFrequencyResponse;

	/**
	 * The cached value of the '{@link #getFocalPlaneXResolution() <em>Focal Plane XResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalPlaneXResolution()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType focalPlaneXResolution;

	/**
	 * The cached value of the '{@link #getFocalPlaneYResolution() <em>Focal Plane YResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalPlaneYResolution()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType focalPlaneYResolution;

	/**
	 * The cached value of the '{@link #getFocalPlaneResolutionUnit() <em>Focal Plane Resolution Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalPlaneResolutionUnit()
	 * @generated
	 * @ordered
	 */
	protected ResolutionType focalPlaneResolutionUnit;

	/**
	 * The cached value of the '{@link #getSubjectLocation() <em>Subject Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectLocation()
	 * @generated
	 * @ordered
	 */
	protected SubjectLocationType subjectLocation;

	/**
	 * The cached value of the '{@link #getExposureIndex() <em>Exposure Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureIndex()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType exposureIndex;

	/**
	 * The cached value of the '{@link #getSensingMethod() <em>Sensing Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensingMethod()
	 * @generated
	 * @ordered
	 */
	protected SensingMethodType sensingMethod;

	/**
	 * The cached value of the '{@link #getFileSource() <em>File Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSource()
	 * @generated
	 * @ordered
	 */
	protected FileSourceType fileSource;

	/**
	 * The cached value of the '{@link #getSceneType() <em>Scene Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneType()
	 * @generated
	 * @ordered
	 */
	protected StringType sceneType;

	/**
	 * The cached value of the '{@link #getCFAPattern() <em>CFA Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFAPattern()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType cFAPattern;

	/**
	 * The cached value of the '{@link #getCustomRendered() <em>Custom Rendered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomRendered()
	 * @generated
	 * @ordered
	 */
	protected CustomRenderedType customRendered;

	/**
	 * The cached value of the '{@link #getExposureMode() <em>Exposure Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposureMode()
	 * @generated
	 * @ordered
	 */
	protected ExposureModeType exposureMode;

	/**
	 * The cached value of the '{@link #getWhiteBalance() <em>White Balance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhiteBalance()
	 * @generated
	 * @ordered
	 */
	protected WhiteBalanceType whiteBalance;

	/**
	 * The cached value of the '{@link #getDigitalZoomRatio() <em>Digital Zoom Ratio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalZoomRatio()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType digitalZoomRatio;

	/**
	 * The cached value of the '{@link #getFocalLengthIn35mmFilm() <em>Focal Length In35mm Film</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocalLengthIn35mmFilm()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType focalLengthIn35mmFilm;

	/**
	 * The cached value of the '{@link #getSceneCaptureType() <em>Scene Capture Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneCaptureType()
	 * @generated
	 * @ordered
	 */
	protected SceneCaptureType sceneCaptureType;

	/**
	 * The cached value of the '{@link #getGainControl() <em>Gain Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGainControl()
	 * @generated
	 * @ordered
	 */
	protected GainControlType gainControl;

	/**
	 * The cached value of the '{@link #getContrast() <em>Contrast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrast()
	 * @generated
	 * @ordered
	 */
	protected ContrastType contrast;

	/**
	 * The cached value of the '{@link #getSaturation() <em>Saturation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSaturation()
	 * @generated
	 * @ordered
	 */
	protected SaturationType saturation;

	/**
	 * The cached value of the '{@link #getSharpness() <em>Sharpness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharpness()
	 * @generated
	 * @ordered
	 */
	protected SharpnessType sharpness;

	/**
	 * The cached value of the '{@link #getDeviceSettingDescription() <em>Device Setting Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceSettingDescription()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType deviceSettingDescription;

	/**
	 * The cached value of the '{@link #getSubjectDistanceRange() <em>Subject Distance Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectDistanceRange()
	 * @generated
	 * @ordered
	 */
	protected SubjectDistanceRangeType subjectDistanceRange;

	/**
	 * The cached value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected UuidType imageUniqueID;

	/**
	 * The cached value of the '{@link #getGamma() <em>Gamma</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamma()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType gamma;

	/**
	 * The cached value of the '{@link #getExifField1() <em>Exif Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExifField1()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType exifField1;

	/**
	 * The cached value of the '{@link #getExifField2() <em>Exif Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExifField2()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType exifField2;

	/**
	 * The cached value of the '{@link #getExifField3() <em>Exif Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExifField3()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType exifField3;

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
	protected ExifIfdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getExifIfdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getExifVersion() {
		return exifVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExifVersion(StringType newExifVersion, NotificationChain msgs) {
		StringType oldExifVersion = exifVersion;
		exifVersion = newExifVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION, oldExifVersion, newExifVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExifVersion(StringType newExifVersion) {
		if (newExifVersion != exifVersion) {
			NotificationChain msgs = null;
			if (exifVersion != null)
				msgs = ((InternalEObject)exifVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION, null, msgs);
			if (newExifVersion != null)
				msgs = ((InternalEObject)newExifVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION, null, msgs);
			msgs = basicSetExifVersion(newExifVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION, newExifVersion, newExifVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getFlashpixVersion() {
		return flashpixVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlashpixVersion(StringType newFlashpixVersion, NotificationChain msgs) {
		StringType oldFlashpixVersion = flashpixVersion;
		flashpixVersion = newFlashpixVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION, oldFlashpixVersion, newFlashpixVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlashpixVersion(StringType newFlashpixVersion) {
		if (newFlashpixVersion != flashpixVersion) {
			NotificationChain msgs = null;
			if (flashpixVersion != null)
				msgs = ((InternalEObject)flashpixVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION, null, msgs);
			if (newFlashpixVersion != null)
				msgs = ((InternalEObject)newFlashpixVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION, null, msgs);
			msgs = basicSetFlashpixVersion(newFlashpixVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION, newFlashpixVersion, newFlashpixVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpaceType getColorSpace() {
		return colorSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColorSpace(ColorSpaceType newColorSpace, NotificationChain msgs) {
		ColorSpaceType oldColorSpace = colorSpace;
		colorSpace = newColorSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE, oldColorSpace, newColorSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorSpace(ColorSpaceType newColorSpace) {
		if (newColorSpace != colorSpace) {
			NotificationChain msgs = null;
			if (colorSpace != null)
				msgs = ((InternalEObject)colorSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE, null, msgs);
			if (newColorSpace != null)
				msgs = ((InternalEObject)newColorSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE, null, msgs);
			msgs = basicSetColorSpace(newColorSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE, newColorSpace, newColorSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getComponentsConfiguration() {
		return componentsConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentsConfiguration(StringType newComponentsConfiguration, NotificationChain msgs) {
		StringType oldComponentsConfiguration = componentsConfiguration;
		componentsConfiguration = newComponentsConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION, oldComponentsConfiguration, newComponentsConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentsConfiguration(StringType newComponentsConfiguration) {
		if (newComponentsConfiguration != componentsConfiguration) {
			NotificationChain msgs = null;
			if (componentsConfiguration != null)
				msgs = ((InternalEObject)componentsConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION, null, msgs);
			if (newComponentsConfiguration != null)
				msgs = ((InternalEObject)newComponentsConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION, null, msgs);
			msgs = basicSetComponentsConfiguration(newComponentsConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION, newComponentsConfiguration, newComponentsConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getCompressedBitsPerPixel() {
		return compressedBitsPerPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompressedBitsPerPixel(NonNegativeRealType newCompressedBitsPerPixel, NotificationChain msgs) {
		NonNegativeRealType oldCompressedBitsPerPixel = compressedBitsPerPixel;
		compressedBitsPerPixel = newCompressedBitsPerPixel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL, oldCompressedBitsPerPixel, newCompressedBitsPerPixel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressedBitsPerPixel(NonNegativeRealType newCompressedBitsPerPixel) {
		if (newCompressedBitsPerPixel != compressedBitsPerPixel) {
			NotificationChain msgs = null;
			if (compressedBitsPerPixel != null)
				msgs = ((InternalEObject)compressedBitsPerPixel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL, null, msgs);
			if (newCompressedBitsPerPixel != null)
				msgs = ((InternalEObject)newCompressedBitsPerPixel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL, null, msgs);
			msgs = basicSetCompressedBitsPerPixel(newCompressedBitsPerPixel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL, newCompressedBitsPerPixel, newCompressedBitsPerPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getPixelXDimension() {
		return pixelXDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelXDimension(NonNegativeIntegerType newPixelXDimension, NotificationChain msgs) {
		NonNegativeIntegerType oldPixelXDimension = pixelXDimension;
		pixelXDimension = newPixelXDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION, oldPixelXDimension, newPixelXDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelXDimension(NonNegativeIntegerType newPixelXDimension) {
		if (newPixelXDimension != pixelXDimension) {
			NotificationChain msgs = null;
			if (pixelXDimension != null)
				msgs = ((InternalEObject)pixelXDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION, null, msgs);
			if (newPixelXDimension != null)
				msgs = ((InternalEObject)newPixelXDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION, null, msgs);
			msgs = basicSetPixelXDimension(newPixelXDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION, newPixelXDimension, newPixelXDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getPixelYDimension() {
		return pixelYDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelYDimension(NonNegativeIntegerType newPixelYDimension, NotificationChain msgs) {
		NonNegativeIntegerType oldPixelYDimension = pixelYDimension;
		pixelYDimension = newPixelYDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION, oldPixelYDimension, newPixelYDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPixelYDimension(NonNegativeIntegerType newPixelYDimension) {
		if (newPixelYDimension != pixelYDimension) {
			NotificationChain msgs = null;
			if (pixelYDimension != null)
				msgs = ((InternalEObject)pixelYDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION, null, msgs);
			if (newPixelYDimension != null)
				msgs = ((InternalEObject)newPixelYDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION, null, msgs);
			msgs = basicSetPixelYDimension(newPixelYDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION, newPixelYDimension, newPixelYDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getMakerNote() {
		return makerNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMakerNote(RepeatedFieldType newMakerNote, NotificationChain msgs) {
		RepeatedFieldType oldMakerNote = makerNote;
		makerNote = newMakerNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE, oldMakerNote, newMakerNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakerNote(RepeatedFieldType newMakerNote) {
		if (newMakerNote != makerNote) {
			NotificationChain msgs = null;
			if (makerNote != null)
				msgs = ((InternalEObject)makerNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE, null, msgs);
			if (newMakerNote != null)
				msgs = ((InternalEObject)newMakerNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE, null, msgs);
			msgs = basicSetMakerNote(newMakerNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE, newMakerNote, newMakerNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getUserComment() {
		return userComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserComment(StringType newUserComment, NotificationChain msgs) {
		StringType oldUserComment = userComment;
		userComment = newUserComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__USER_COMMENT, oldUserComment, newUserComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserComment(StringType newUserComment) {
		if (newUserComment != userComment) {
			NotificationChain msgs = null;
			if (userComment != null)
				msgs = ((InternalEObject)userComment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__USER_COMMENT, null, msgs);
			if (newUserComment != null)
				msgs = ((InternalEObject)newUserComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__USER_COMMENT, null, msgs);
			msgs = basicSetUserComment(newUserComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__USER_COMMENT, newUserComment, newUserComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getRelatedSoundFile() {
		return relatedSoundFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedSoundFile(StringType newRelatedSoundFile, NotificationChain msgs) {
		StringType oldRelatedSoundFile = relatedSoundFile;
		relatedSoundFile = newRelatedSoundFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE, oldRelatedSoundFile, newRelatedSoundFile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedSoundFile(StringType newRelatedSoundFile) {
		if (newRelatedSoundFile != relatedSoundFile) {
			NotificationChain msgs = null;
			if (relatedSoundFile != null)
				msgs = ((InternalEObject)relatedSoundFile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE, null, msgs);
			if (newRelatedSoundFile != null)
				msgs = ((InternalEObject)newRelatedSoundFile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE, null, msgs);
			msgs = basicSetRelatedSoundFile(newRelatedSoundFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE, newRelatedSoundFile, newRelatedSoundFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTimeOriginal() {
		return dateTimeOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeOriginal(DateTimeType newDateTimeOriginal, NotificationChain msgs) {
		DateTimeType oldDateTimeOriginal = dateTimeOriginal;
		dateTimeOriginal = newDateTimeOriginal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL, oldDateTimeOriginal, newDateTimeOriginal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeOriginal(DateTimeType newDateTimeOriginal) {
		if (newDateTimeOriginal != dateTimeOriginal) {
			NotificationChain msgs = null;
			if (dateTimeOriginal != null)
				msgs = ((InternalEObject)dateTimeOriginal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL, null, msgs);
			if (newDateTimeOriginal != null)
				msgs = ((InternalEObject)newDateTimeOriginal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL, null, msgs);
			msgs = basicSetDateTimeOriginal(newDateTimeOriginal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL, newDateTimeOriginal, newDateTimeOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTimeDigitized() {
		return dateTimeDigitized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTimeDigitized(DateTimeType newDateTimeDigitized, NotificationChain msgs) {
		DateTimeType oldDateTimeDigitized = dateTimeDigitized;
		dateTimeDigitized = newDateTimeDigitized;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED, oldDateTimeDigitized, newDateTimeDigitized);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimeDigitized(DateTimeType newDateTimeDigitized) {
		if (newDateTimeDigitized != dateTimeDigitized) {
			NotificationChain msgs = null;
			if (dateTimeDigitized != null)
				msgs = ((InternalEObject)dateTimeDigitized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED, null, msgs);
			if (newDateTimeDigitized != null)
				msgs = ((InternalEObject)newDateTimeDigitized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED, null, msgs);
			msgs = basicSetDateTimeDigitized(newDateTimeDigitized, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED, newDateTimeDigitized, newDateTimeDigitized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getSubSecTime() {
		return subSecTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSecTime(NonNegativeIntegerType newSubSecTime, NotificationChain msgs) {
		NonNegativeIntegerType oldSubSecTime = subSecTime;
		subSecTime = newSubSecTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME, oldSubSecTime, newSubSecTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSecTime(NonNegativeIntegerType newSubSecTime) {
		if (newSubSecTime != subSecTime) {
			NotificationChain msgs = null;
			if (subSecTime != null)
				msgs = ((InternalEObject)subSecTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME, null, msgs);
			if (newSubSecTime != null)
				msgs = ((InternalEObject)newSubSecTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME, null, msgs);
			msgs = basicSetSubSecTime(newSubSecTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME, newSubSecTime, newSubSecTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getSubSecTimeOriginal() {
		return subSecTimeOriginal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSecTimeOriginal(NonNegativeIntegerType newSubSecTimeOriginal, NotificationChain msgs) {
		NonNegativeIntegerType oldSubSecTimeOriginal = subSecTimeOriginal;
		subSecTimeOriginal = newSubSecTimeOriginal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL, oldSubSecTimeOriginal, newSubSecTimeOriginal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSecTimeOriginal(NonNegativeIntegerType newSubSecTimeOriginal) {
		if (newSubSecTimeOriginal != subSecTimeOriginal) {
			NotificationChain msgs = null;
			if (subSecTimeOriginal != null)
				msgs = ((InternalEObject)subSecTimeOriginal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL, null, msgs);
			if (newSubSecTimeOriginal != null)
				msgs = ((InternalEObject)newSubSecTimeOriginal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL, null, msgs);
			msgs = basicSetSubSecTimeOriginal(newSubSecTimeOriginal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL, newSubSecTimeOriginal, newSubSecTimeOriginal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getSubSecTimeDigitized() {
		return subSecTimeDigitized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubSecTimeDigitized(NonNegativeIntegerType newSubSecTimeDigitized, NotificationChain msgs) {
		NonNegativeIntegerType oldSubSecTimeDigitized = subSecTimeDigitized;
		subSecTimeDigitized = newSubSecTimeDigitized;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED, oldSubSecTimeDigitized, newSubSecTimeDigitized);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubSecTimeDigitized(NonNegativeIntegerType newSubSecTimeDigitized) {
		if (newSubSecTimeDigitized != subSecTimeDigitized) {
			NotificationChain msgs = null;
			if (subSecTimeDigitized != null)
				msgs = ((InternalEObject)subSecTimeDigitized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED, null, msgs);
			if (newSubSecTimeDigitized != null)
				msgs = ((InternalEObject)newSubSecTimeDigitized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED, null, msgs);
			msgs = basicSetSubSecTimeDigitized(newSubSecTimeDigitized, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED, newSubSecTimeDigitized, newSubSecTimeDigitized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getExposureTime() {
		return exposureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureTime(NonNegativeRealType newExposureTime, NotificationChain msgs) {
		NonNegativeRealType oldExposureTime = exposureTime;
		exposureTime = newExposureTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME, oldExposureTime, newExposureTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureTime(NonNegativeRealType newExposureTime) {
		if (newExposureTime != exposureTime) {
			NotificationChain msgs = null;
			if (exposureTime != null)
				msgs = ((InternalEObject)exposureTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME, null, msgs);
			if (newExposureTime != null)
				msgs = ((InternalEObject)newExposureTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME, null, msgs);
			msgs = basicSetExposureTime(newExposureTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME, newExposureTime, newExposureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getFNumber() {
		return fNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFNumber(NonNegativeRealType newFNumber, NotificationChain msgs) {
		NonNegativeRealType oldFNumber = fNumber;
		fNumber = newFNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FNUMBER, oldFNumber, newFNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNumber(NonNegativeRealType newFNumber) {
		if (newFNumber != fNumber) {
			NotificationChain msgs = null;
			if (fNumber != null)
				msgs = ((InternalEObject)fNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FNUMBER, null, msgs);
			if (newFNumber != null)
				msgs = ((InternalEObject)newFNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FNUMBER, null, msgs);
			msgs = basicSetFNumber(newFNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FNUMBER, newFNumber, newFNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureProgramType getExposureProgram() {
		return exposureProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureProgram(ExposureProgramType newExposureProgram, NotificationChain msgs) {
		ExposureProgramType oldExposureProgram = exposureProgram;
		exposureProgram = newExposureProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM, oldExposureProgram, newExposureProgram);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureProgram(ExposureProgramType newExposureProgram) {
		if (newExposureProgram != exposureProgram) {
			NotificationChain msgs = null;
			if (exposureProgram != null)
				msgs = ((InternalEObject)exposureProgram).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM, null, msgs);
			if (newExposureProgram != null)
				msgs = ((InternalEObject)newExposureProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM, null, msgs);
			msgs = basicSetExposureProgram(newExposureProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM, newExposureProgram, newExposureProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getSpectralSensitivity() {
		return spectralSensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpectralSensitivity(StringType newSpectralSensitivity, NotificationChain msgs) {
		StringType oldSpectralSensitivity = spectralSensitivity;
		spectralSensitivity = newSpectralSensitivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY, oldSpectralSensitivity, newSpectralSensitivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpectralSensitivity(StringType newSpectralSensitivity) {
		if (newSpectralSensitivity != spectralSensitivity) {
			NotificationChain msgs = null;
			if (spectralSensitivity != null)
				msgs = ((InternalEObject)spectralSensitivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY, null, msgs);
			if (newSpectralSensitivity != null)
				msgs = ((InternalEObject)newSpectralSensitivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY, null, msgs);
			msgs = basicSetSpectralSensitivity(newSpectralSensitivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY, newSpectralSensitivity, newSpectralSensitivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType getISOSpeedRatings() {
		return iSOSpeedRatings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISOSpeedRatings(NonNegativeIntegerType newISOSpeedRatings, NotificationChain msgs) {
		NonNegativeIntegerType oldISOSpeedRatings = iSOSpeedRatings;
		iSOSpeedRatings = newISOSpeedRatings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS, oldISOSpeedRatings, newISOSpeedRatings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISOSpeedRatings(NonNegativeIntegerType newISOSpeedRatings) {
		if (newISOSpeedRatings != iSOSpeedRatings) {
			NotificationChain msgs = null;
			if (iSOSpeedRatings != null)
				msgs = ((InternalEObject)iSOSpeedRatings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS, null, msgs);
			if (newISOSpeedRatings != null)
				msgs = ((InternalEObject)newISOSpeedRatings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS, null, msgs);
			msgs = basicSetISOSpeedRatings(newISOSpeedRatings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS, newISOSpeedRatings, newISOSpeedRatings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getOECF() {
		return oECF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOECF(RepeatedFieldType newOECF, NotificationChain msgs) {
		RepeatedFieldType oldOECF = oECF;
		oECF = newOECF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__OECF, oldOECF, newOECF);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOECF(RepeatedFieldType newOECF) {
		if (newOECF != oECF) {
			NotificationChain msgs = null;
			if (oECF != null)
				msgs = ((InternalEObject)oECF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__OECF, null, msgs);
			if (newOECF != null)
				msgs = ((InternalEObject)newOECF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__OECF, null, msgs);
			msgs = basicSetOECF(newOECF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__OECF, newOECF, newOECF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType getShutterSpeedValue() {
		return shutterSpeedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShutterSpeedValue(RealType newShutterSpeedValue, NotificationChain msgs) {
		RealType oldShutterSpeedValue = shutterSpeedValue;
		shutterSpeedValue = newShutterSpeedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE, oldShutterSpeedValue, newShutterSpeedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShutterSpeedValue(RealType newShutterSpeedValue) {
		if (newShutterSpeedValue != shutterSpeedValue) {
			NotificationChain msgs = null;
			if (shutterSpeedValue != null)
				msgs = ((InternalEObject)shutterSpeedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE, null, msgs);
			if (newShutterSpeedValue != null)
				msgs = ((InternalEObject)newShutterSpeedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE, null, msgs);
			msgs = basicSetShutterSpeedValue(newShutterSpeedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE, newShutterSpeedValue, newShutterSpeedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getApertureValue() {
		return apertureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApertureValue(NonNegativeRealType newApertureValue, NotificationChain msgs) {
		NonNegativeRealType oldApertureValue = apertureValue;
		apertureValue = newApertureValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE, oldApertureValue, newApertureValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApertureValue(NonNegativeRealType newApertureValue) {
		if (newApertureValue != apertureValue) {
			NotificationChain msgs = null;
			if (apertureValue != null)
				msgs = ((InternalEObject)apertureValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE, null, msgs);
			if (newApertureValue != null)
				msgs = ((InternalEObject)newApertureValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE, null, msgs);
			msgs = basicSetApertureValue(newApertureValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE, newApertureValue, newApertureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType getBrightnessValue() {
		return brightnessValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBrightnessValue(RealType newBrightnessValue, NotificationChain msgs) {
		RealType oldBrightnessValue = brightnessValue;
		brightnessValue = newBrightnessValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE, oldBrightnessValue, newBrightnessValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrightnessValue(RealType newBrightnessValue) {
		if (newBrightnessValue != brightnessValue) {
			NotificationChain msgs = null;
			if (brightnessValue != null)
				msgs = ((InternalEObject)brightnessValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE, null, msgs);
			if (newBrightnessValue != null)
				msgs = ((InternalEObject)newBrightnessValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE, null, msgs);
			msgs = basicSetBrightnessValue(newBrightnessValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE, newBrightnessValue, newBrightnessValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType getExposureBiasValue() {
		return exposureBiasValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureBiasValue(RealType newExposureBiasValue, NotificationChain msgs) {
		RealType oldExposureBiasValue = exposureBiasValue;
		exposureBiasValue = newExposureBiasValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE, oldExposureBiasValue, newExposureBiasValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureBiasValue(RealType newExposureBiasValue) {
		if (newExposureBiasValue != exposureBiasValue) {
			NotificationChain msgs = null;
			if (exposureBiasValue != null)
				msgs = ((InternalEObject)exposureBiasValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE, null, msgs);
			if (newExposureBiasValue != null)
				msgs = ((InternalEObject)newExposureBiasValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE, null, msgs);
			msgs = basicSetExposureBiasValue(newExposureBiasValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE, newExposureBiasValue, newExposureBiasValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getMaxApertureValue() {
		return maxApertureValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxApertureValue(NonNegativeRealType newMaxApertureValue, NotificationChain msgs) {
		NonNegativeRealType oldMaxApertureValue = maxApertureValue;
		maxApertureValue = newMaxApertureValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE, oldMaxApertureValue, newMaxApertureValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxApertureValue(NonNegativeRealType newMaxApertureValue) {
		if (newMaxApertureValue != maxApertureValue) {
			NotificationChain msgs = null;
			if (maxApertureValue != null)
				msgs = ((InternalEObject)maxApertureValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE, null, msgs);
			if (newMaxApertureValue != null)
				msgs = ((InternalEObject)newMaxApertureValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE, null, msgs);
			msgs = basicSetMaxApertureValue(newMaxApertureValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE, newMaxApertureValue, newMaxApertureValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getSubjectDistance() {
		return subjectDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectDistance(StringType newSubjectDistance, NotificationChain msgs) {
		StringType oldSubjectDistance = subjectDistance;
		subjectDistance = newSubjectDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE, oldSubjectDistance, newSubjectDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectDistance(StringType newSubjectDistance) {
		if (newSubjectDistance != subjectDistance) {
			NotificationChain msgs = null;
			if (subjectDistance != null)
				msgs = ((InternalEObject)subjectDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE, null, msgs);
			if (newSubjectDistance != null)
				msgs = ((InternalEObject)newSubjectDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE, null, msgs);
			msgs = basicSetSubjectDistance(newSubjectDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE, newSubjectDistance, newSubjectDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringModeType getMeteringMode() {
		return meteringMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeteringMode(MeteringModeType newMeteringMode, NotificationChain msgs) {
		MeteringModeType oldMeteringMode = meteringMode;
		meteringMode = newMeteringMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__METERING_MODE, oldMeteringMode, newMeteringMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeteringMode(MeteringModeType newMeteringMode) {
		if (newMeteringMode != meteringMode) {
			NotificationChain msgs = null;
			if (meteringMode != null)
				msgs = ((InternalEObject)meteringMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__METERING_MODE, null, msgs);
			if (newMeteringMode != null)
				msgs = ((InternalEObject)newMeteringMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__METERING_MODE, null, msgs);
			msgs = basicSetMeteringMode(newMeteringMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__METERING_MODE, newMeteringMode, newMeteringMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSourceType getLightSource() {
		return lightSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightSource(LightSourceType newLightSource, NotificationChain msgs) {
		LightSourceType oldLightSource = lightSource;
		lightSource = newLightSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE, oldLightSource, newLightSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightSource(LightSourceType newLightSource) {
		if (newLightSource != lightSource) {
			NotificationChain msgs = null;
			if (lightSource != null)
				msgs = ((InternalEObject)lightSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE, null, msgs);
			if (newLightSource != null)
				msgs = ((InternalEObject)newLightSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE, null, msgs);
			msgs = basicSetLightSource(newLightSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE, newLightSource, newLightSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashType getFlash() {
		return flash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlash(FlashType newFlash, NotificationChain msgs) {
		FlashType oldFlash = flash;
		flash = newFlash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASH, oldFlash, newFlash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlash(FlashType newFlash) {
		if (newFlash != flash) {
			NotificationChain msgs = null;
			if (flash != null)
				msgs = ((InternalEObject)flash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASH, null, msgs);
			if (newFlash != null)
				msgs = ((InternalEObject)newFlash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASH, null, msgs);
			msgs = basicSetFlash(newFlash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASH, newFlash, newFlash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getFocalLength() {
		return focalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocalLength(NonNegativeRealType newFocalLength, NotificationChain msgs) {
		NonNegativeRealType oldFocalLength = focalLength;
		focalLength = newFocalLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH, oldFocalLength, newFocalLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalLength(NonNegativeRealType newFocalLength) {
		if (newFocalLength != focalLength) {
			NotificationChain msgs = null;
			if (focalLength != null)
				msgs = ((InternalEObject)focalLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH, null, msgs);
			if (newFocalLength != null)
				msgs = ((InternalEObject)newFocalLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH, null, msgs);
			msgs = basicSetFocalLength(newFocalLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH, newFocalLength, newFocalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaType getSubjectArea() {
		return subjectArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectArea(SubjectAreaType newSubjectArea, NotificationChain msgs) {
		SubjectAreaType oldSubjectArea = subjectArea;
		subjectArea = newSubjectArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA, oldSubjectArea, newSubjectArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectArea(SubjectAreaType newSubjectArea) {
		if (newSubjectArea != subjectArea) {
			NotificationChain msgs = null;
			if (subjectArea != null)
				msgs = ((InternalEObject)subjectArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA, null, msgs);
			if (newSubjectArea != null)
				msgs = ((InternalEObject)newSubjectArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA, null, msgs);
			msgs = basicSetSubjectArea(newSubjectArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA, newSubjectArea, newSubjectArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getFlashEnergy() {
		return flashEnergy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlashEnergy(NonNegativeRealType newFlashEnergy, NotificationChain msgs) {
		NonNegativeRealType oldFlashEnergy = flashEnergy;
		flashEnergy = newFlashEnergy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY, oldFlashEnergy, newFlashEnergy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlashEnergy(NonNegativeRealType newFlashEnergy) {
		if (newFlashEnergy != flashEnergy) {
			NotificationChain msgs = null;
			if (flashEnergy != null)
				msgs = ((InternalEObject)flashEnergy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY, null, msgs);
			if (newFlashEnergy != null)
				msgs = ((InternalEObject)newFlashEnergy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY, null, msgs);
			msgs = basicSetFlashEnergy(newFlashEnergy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY, newFlashEnergy, newFlashEnergy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getSpatialFrequencyResponse() {
		return spatialFrequencyResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialFrequencyResponse(RepeatedFieldType newSpatialFrequencyResponse, NotificationChain msgs) {
		RepeatedFieldType oldSpatialFrequencyResponse = spatialFrequencyResponse;
		spatialFrequencyResponse = newSpatialFrequencyResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE, oldSpatialFrequencyResponse, newSpatialFrequencyResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpatialFrequencyResponse(RepeatedFieldType newSpatialFrequencyResponse) {
		if (newSpatialFrequencyResponse != spatialFrequencyResponse) {
			NotificationChain msgs = null;
			if (spatialFrequencyResponse != null)
				msgs = ((InternalEObject)spatialFrequencyResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE, null, msgs);
			if (newSpatialFrequencyResponse != null)
				msgs = ((InternalEObject)newSpatialFrequencyResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE, null, msgs);
			msgs = basicSetSpatialFrequencyResponse(newSpatialFrequencyResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE, newSpatialFrequencyResponse, newSpatialFrequencyResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getFocalPlaneXResolution() {
		return focalPlaneXResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocalPlaneXResolution(NonNegativeRealType newFocalPlaneXResolution, NotificationChain msgs) {
		NonNegativeRealType oldFocalPlaneXResolution = focalPlaneXResolution;
		focalPlaneXResolution = newFocalPlaneXResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION, oldFocalPlaneXResolution, newFocalPlaneXResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalPlaneXResolution(NonNegativeRealType newFocalPlaneXResolution) {
		if (newFocalPlaneXResolution != focalPlaneXResolution) {
			NotificationChain msgs = null;
			if (focalPlaneXResolution != null)
				msgs = ((InternalEObject)focalPlaneXResolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION, null, msgs);
			if (newFocalPlaneXResolution != null)
				msgs = ((InternalEObject)newFocalPlaneXResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION, null, msgs);
			msgs = basicSetFocalPlaneXResolution(newFocalPlaneXResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION, newFocalPlaneXResolution, newFocalPlaneXResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getFocalPlaneYResolution() {
		return focalPlaneYResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocalPlaneYResolution(NonNegativeRealType newFocalPlaneYResolution, NotificationChain msgs) {
		NonNegativeRealType oldFocalPlaneYResolution = focalPlaneYResolution;
		focalPlaneYResolution = newFocalPlaneYResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION, oldFocalPlaneYResolution, newFocalPlaneYResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalPlaneYResolution(NonNegativeRealType newFocalPlaneYResolution) {
		if (newFocalPlaneYResolution != focalPlaneYResolution) {
			NotificationChain msgs = null;
			if (focalPlaneYResolution != null)
				msgs = ((InternalEObject)focalPlaneYResolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION, null, msgs);
			if (newFocalPlaneYResolution != null)
				msgs = ((InternalEObject)newFocalPlaneYResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION, null, msgs);
			msgs = basicSetFocalPlaneYResolution(newFocalPlaneYResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION, newFocalPlaneYResolution, newFocalPlaneYResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionType getFocalPlaneResolutionUnit() {
		return focalPlaneResolutionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocalPlaneResolutionUnit(ResolutionType newFocalPlaneResolutionUnit, NotificationChain msgs) {
		ResolutionType oldFocalPlaneResolutionUnit = focalPlaneResolutionUnit;
		focalPlaneResolutionUnit = newFocalPlaneResolutionUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT, oldFocalPlaneResolutionUnit, newFocalPlaneResolutionUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalPlaneResolutionUnit(ResolutionType newFocalPlaneResolutionUnit) {
		if (newFocalPlaneResolutionUnit != focalPlaneResolutionUnit) {
			NotificationChain msgs = null;
			if (focalPlaneResolutionUnit != null)
				msgs = ((InternalEObject)focalPlaneResolutionUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT, null, msgs);
			if (newFocalPlaneResolutionUnit != null)
				msgs = ((InternalEObject)newFocalPlaneResolutionUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT, null, msgs);
			msgs = basicSetFocalPlaneResolutionUnit(newFocalPlaneResolutionUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT, newFocalPlaneResolutionUnit, newFocalPlaneResolutionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectLocationType getSubjectLocation() {
		return subjectLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectLocation(SubjectLocationType newSubjectLocation, NotificationChain msgs) {
		SubjectLocationType oldSubjectLocation = subjectLocation;
		subjectLocation = newSubjectLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION, oldSubjectLocation, newSubjectLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectLocation(SubjectLocationType newSubjectLocation) {
		if (newSubjectLocation != subjectLocation) {
			NotificationChain msgs = null;
			if (subjectLocation != null)
				msgs = ((InternalEObject)subjectLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION, null, msgs);
			if (newSubjectLocation != null)
				msgs = ((InternalEObject)newSubjectLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION, null, msgs);
			msgs = basicSetSubjectLocation(newSubjectLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION, newSubjectLocation, newSubjectLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getExposureIndex() {
		return exposureIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureIndex(NonNegativeRealType newExposureIndex, NotificationChain msgs) {
		NonNegativeRealType oldExposureIndex = exposureIndex;
		exposureIndex = newExposureIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX, oldExposureIndex, newExposureIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureIndex(NonNegativeRealType newExposureIndex) {
		if (newExposureIndex != exposureIndex) {
			NotificationChain msgs = null;
			if (exposureIndex != null)
				msgs = ((InternalEObject)exposureIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX, null, msgs);
			if (newExposureIndex != null)
				msgs = ((InternalEObject)newExposureIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX, null, msgs);
			msgs = basicSetExposureIndex(newExposureIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX, newExposureIndex, newExposureIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingMethodType getSensingMethod() {
		return sensingMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensingMethod(SensingMethodType newSensingMethod, NotificationChain msgs) {
		SensingMethodType oldSensingMethod = sensingMethod;
		sensingMethod = newSensingMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD, oldSensingMethod, newSensingMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensingMethod(SensingMethodType newSensingMethod) {
		if (newSensingMethod != sensingMethod) {
			NotificationChain msgs = null;
			if (sensingMethod != null)
				msgs = ((InternalEObject)sensingMethod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD, null, msgs);
			if (newSensingMethod != null)
				msgs = ((InternalEObject)newSensingMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD, null, msgs);
			msgs = basicSetSensingMethod(newSensingMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD, newSensingMethod, newSensingMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSourceType getFileSource() {
		return fileSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileSource(FileSourceType newFileSource, NotificationChain msgs) {
		FileSourceType oldFileSource = fileSource;
		fileSource = newFileSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE, oldFileSource, newFileSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSource(FileSourceType newFileSource) {
		if (newFileSource != fileSource) {
			NotificationChain msgs = null;
			if (fileSource != null)
				msgs = ((InternalEObject)fileSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE, null, msgs);
			if (newFileSource != null)
				msgs = ((InternalEObject)newFileSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE, null, msgs);
			msgs = basicSetFileSource(newFileSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE, newFileSource, newFileSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getSceneType() {
		return sceneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSceneType(StringType newSceneType, NotificationChain msgs) {
		StringType oldSceneType = sceneType;
		sceneType = newSceneType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE, oldSceneType, newSceneType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneType(StringType newSceneType) {
		if (newSceneType != sceneType) {
			NotificationChain msgs = null;
			if (sceneType != null)
				msgs = ((InternalEObject)sceneType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE, null, msgs);
			if (newSceneType != null)
				msgs = ((InternalEObject)newSceneType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE, null, msgs);
			msgs = basicSetSceneType(newSceneType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE, newSceneType, newSceneType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getCFAPattern() {
		return cFAPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCFAPattern(RepeatedFieldType newCFAPattern, NotificationChain msgs) {
		RepeatedFieldType oldCFAPattern = cFAPattern;
		cFAPattern = newCFAPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN, oldCFAPattern, newCFAPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFAPattern(RepeatedFieldType newCFAPattern) {
		if (newCFAPattern != cFAPattern) {
			NotificationChain msgs = null;
			if (cFAPattern != null)
				msgs = ((InternalEObject)cFAPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN, null, msgs);
			if (newCFAPattern != null)
				msgs = ((InternalEObject)newCFAPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN, null, msgs);
			msgs = basicSetCFAPattern(newCFAPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN, newCFAPattern, newCFAPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRenderedType getCustomRendered() {
		return customRendered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomRendered(CustomRenderedType newCustomRendered, NotificationChain msgs) {
		CustomRenderedType oldCustomRendered = customRendered;
		customRendered = newCustomRendered;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED, oldCustomRendered, newCustomRendered);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomRendered(CustomRenderedType newCustomRendered) {
		if (newCustomRendered != customRendered) {
			NotificationChain msgs = null;
			if (customRendered != null)
				msgs = ((InternalEObject)customRendered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED, null, msgs);
			if (newCustomRendered != null)
				msgs = ((InternalEObject)newCustomRendered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED, null, msgs);
			msgs = basicSetCustomRendered(newCustomRendered, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED, newCustomRendered, newCustomRendered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureModeType getExposureMode() {
		return exposureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExposureMode(ExposureModeType newExposureMode, NotificationChain msgs) {
		ExposureModeType oldExposureMode = exposureMode;
		exposureMode = newExposureMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE, oldExposureMode, newExposureMode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposureMode(ExposureModeType newExposureMode) {
		if (newExposureMode != exposureMode) {
			NotificationChain msgs = null;
			if (exposureMode != null)
				msgs = ((InternalEObject)exposureMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE, null, msgs);
			if (newExposureMode != null)
				msgs = ((InternalEObject)newExposureMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE, null, msgs);
			msgs = basicSetExposureMode(newExposureMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE, newExposureMode, newExposureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBalanceType getWhiteBalance() {
		return whiteBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhiteBalance(WhiteBalanceType newWhiteBalance, NotificationChain msgs) {
		WhiteBalanceType oldWhiteBalance = whiteBalance;
		whiteBalance = newWhiteBalance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE, oldWhiteBalance, newWhiteBalance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhiteBalance(WhiteBalanceType newWhiteBalance) {
		if (newWhiteBalance != whiteBalance) {
			NotificationChain msgs = null;
			if (whiteBalance != null)
				msgs = ((InternalEObject)whiteBalance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE, null, msgs);
			if (newWhiteBalance != null)
				msgs = ((InternalEObject)newWhiteBalance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE, null, msgs);
			msgs = basicSetWhiteBalance(newWhiteBalance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE, newWhiteBalance, newWhiteBalance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getDigitalZoomRatio() {
		return digitalZoomRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalZoomRatio(NonNegativeRealType newDigitalZoomRatio, NotificationChain msgs) {
		NonNegativeRealType oldDigitalZoomRatio = digitalZoomRatio;
		digitalZoomRatio = newDigitalZoomRatio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO, oldDigitalZoomRatio, newDigitalZoomRatio);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigitalZoomRatio(NonNegativeRealType newDigitalZoomRatio) {
		if (newDigitalZoomRatio != digitalZoomRatio) {
			NotificationChain msgs = null;
			if (digitalZoomRatio != null)
				msgs = ((InternalEObject)digitalZoomRatio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO, null, msgs);
			if (newDigitalZoomRatio != null)
				msgs = ((InternalEObject)newDigitalZoomRatio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO, null, msgs);
			msgs = basicSetDigitalZoomRatio(newDigitalZoomRatio, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO, newDigitalZoomRatio, newDigitalZoomRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getFocalLengthIn35mmFilm() {
		return focalLengthIn35mmFilm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocalLengthIn35mmFilm(PositiveIntegerType newFocalLengthIn35mmFilm, NotificationChain msgs) {
		PositiveIntegerType oldFocalLengthIn35mmFilm = focalLengthIn35mmFilm;
		focalLengthIn35mmFilm = newFocalLengthIn35mmFilm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM, oldFocalLengthIn35mmFilm, newFocalLengthIn35mmFilm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocalLengthIn35mmFilm(PositiveIntegerType newFocalLengthIn35mmFilm) {
		if (newFocalLengthIn35mmFilm != focalLengthIn35mmFilm) {
			NotificationChain msgs = null;
			if (focalLengthIn35mmFilm != null)
				msgs = ((InternalEObject)focalLengthIn35mmFilm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM, null, msgs);
			if (newFocalLengthIn35mmFilm != null)
				msgs = ((InternalEObject)newFocalLengthIn35mmFilm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM, null, msgs);
			msgs = basicSetFocalLengthIn35mmFilm(newFocalLengthIn35mmFilm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM, newFocalLengthIn35mmFilm, newFocalLengthIn35mmFilm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneCaptureType getSceneCaptureType() {
		return sceneCaptureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSceneCaptureType(SceneCaptureType newSceneCaptureType, NotificationChain msgs) {
		SceneCaptureType oldSceneCaptureType = sceneCaptureType;
		sceneCaptureType = newSceneCaptureType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE, oldSceneCaptureType, newSceneCaptureType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneCaptureType(SceneCaptureType newSceneCaptureType) {
		if (newSceneCaptureType != sceneCaptureType) {
			NotificationChain msgs = null;
			if (sceneCaptureType != null)
				msgs = ((InternalEObject)sceneCaptureType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE, null, msgs);
			if (newSceneCaptureType != null)
				msgs = ((InternalEObject)newSceneCaptureType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE, null, msgs);
			msgs = basicSetSceneCaptureType(newSceneCaptureType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE, newSceneCaptureType, newSceneCaptureType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GainControlType getGainControl() {
		return gainControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGainControl(GainControlType newGainControl, NotificationChain msgs) {
		GainControlType oldGainControl = gainControl;
		gainControl = newGainControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL, oldGainControl, newGainControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGainControl(GainControlType newGainControl) {
		if (newGainControl != gainControl) {
			NotificationChain msgs = null;
			if (gainControl != null)
				msgs = ((InternalEObject)gainControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL, null, msgs);
			if (newGainControl != null)
				msgs = ((InternalEObject)newGainControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL, null, msgs);
			msgs = basicSetGainControl(newGainControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL, newGainControl, newGainControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastType getContrast() {
		return contrast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContrast(ContrastType newContrast, NotificationChain msgs) {
		ContrastType oldContrast = contrast;
		contrast = newContrast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CONTRAST, oldContrast, newContrast);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrast(ContrastType newContrast) {
		if (newContrast != contrast) {
			NotificationChain msgs = null;
			if (contrast != null)
				msgs = ((InternalEObject)contrast).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CONTRAST, null, msgs);
			if (newContrast != null)
				msgs = ((InternalEObject)newContrast).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__CONTRAST, null, msgs);
			msgs = basicSetContrast(newContrast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__CONTRAST, newContrast, newContrast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaturationType getSaturation() {
		return saturation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSaturation(SaturationType newSaturation, NotificationChain msgs) {
		SaturationType oldSaturation = saturation;
		saturation = newSaturation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SATURATION, oldSaturation, newSaturation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSaturation(SaturationType newSaturation) {
		if (newSaturation != saturation) {
			NotificationChain msgs = null;
			if (saturation != null)
				msgs = ((InternalEObject)saturation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SATURATION, null, msgs);
			if (newSaturation != null)
				msgs = ((InternalEObject)newSaturation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SATURATION, null, msgs);
			msgs = basicSetSaturation(newSaturation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SATURATION, newSaturation, newSaturation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharpnessType getSharpness() {
		return sharpness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharpness(SharpnessType newSharpness, NotificationChain msgs) {
		SharpnessType oldSharpness = sharpness;
		sharpness = newSharpness;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SHARPNESS, oldSharpness, newSharpness);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharpness(SharpnessType newSharpness) {
		if (newSharpness != sharpness) {
			NotificationChain msgs = null;
			if (sharpness != null)
				msgs = ((InternalEObject)sharpness).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SHARPNESS, null, msgs);
			if (newSharpness != null)
				msgs = ((InternalEObject)newSharpness).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SHARPNESS, null, msgs);
			msgs = basicSetSharpness(newSharpness, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SHARPNESS, newSharpness, newSharpness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getDeviceSettingDescription() {
		return deviceSettingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceSettingDescription(RepeatedFieldType newDeviceSettingDescription, NotificationChain msgs) {
		RepeatedFieldType oldDeviceSettingDescription = deviceSettingDescription;
		deviceSettingDescription = newDeviceSettingDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION, oldDeviceSettingDescription, newDeviceSettingDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceSettingDescription(RepeatedFieldType newDeviceSettingDescription) {
		if (newDeviceSettingDescription != deviceSettingDescription) {
			NotificationChain msgs = null;
			if (deviceSettingDescription != null)
				msgs = ((InternalEObject)deviceSettingDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION, null, msgs);
			if (newDeviceSettingDescription != null)
				msgs = ((InternalEObject)newDeviceSettingDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION, null, msgs);
			msgs = basicSetDeviceSettingDescription(newDeviceSettingDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION, newDeviceSettingDescription, newDeviceSettingDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDistanceRangeType getSubjectDistanceRange() {
		return subjectDistanceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectDistanceRange(SubjectDistanceRangeType newSubjectDistanceRange, NotificationChain msgs) {
		SubjectDistanceRangeType oldSubjectDistanceRange = subjectDistanceRange;
		subjectDistanceRange = newSubjectDistanceRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE, oldSubjectDistanceRange, newSubjectDistanceRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectDistanceRange(SubjectDistanceRangeType newSubjectDistanceRange) {
		if (newSubjectDistanceRange != subjectDistanceRange) {
			NotificationChain msgs = null;
			if (subjectDistanceRange != null)
				msgs = ((InternalEObject)subjectDistanceRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE, null, msgs);
			if (newSubjectDistanceRange != null)
				msgs = ((InternalEObject)newSubjectDistanceRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE, null, msgs);
			msgs = basicSetSubjectDistanceRange(newSubjectDistanceRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE, newSubjectDistanceRange, newSubjectDistanceRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UuidType getImageUniqueID() {
		return imageUniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageUniqueID(UuidType newImageUniqueID, NotificationChain msgs) {
		UuidType oldImageUniqueID = imageUniqueID;
		imageUniqueID = newImageUniqueID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID, oldImageUniqueID, newImageUniqueID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUniqueID(UuidType newImageUniqueID) {
		if (newImageUniqueID != imageUniqueID) {
			NotificationChain msgs = null;
			if (imageUniqueID != null)
				msgs = ((InternalEObject)imageUniqueID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID, null, msgs);
			if (newImageUniqueID != null)
				msgs = ((InternalEObject)newImageUniqueID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID, null, msgs);
			msgs = basicSetImageUniqueID(newImageUniqueID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID, newImageUniqueID, newImageUniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getGamma() {
		return gamma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGamma(NonNegativeRealType newGamma, NotificationChain msgs) {
		NonNegativeRealType oldGamma = gamma;
		gamma = newGamma;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__GAMMA, oldGamma, newGamma);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGamma(NonNegativeRealType newGamma) {
		if (newGamma != gamma) {
			NotificationChain msgs = null;
			if (gamma != null)
				msgs = ((InternalEObject)gamma).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__GAMMA, null, msgs);
			if (newGamma != null)
				msgs = ((InternalEObject)newGamma).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__GAMMA, null, msgs);
			msgs = basicSetGamma(newGamma, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__GAMMA, newGamma, newGamma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getExifField1() {
		return exifField1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExifField1(SingleFieldType newExifField1, NotificationChain msgs) {
		SingleFieldType oldExifField1 = exifField1;
		exifField1 = newExifField1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1, oldExifField1, newExifField1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExifField1(SingleFieldType newExifField1) {
		if (newExifField1 != exifField1) {
			NotificationChain msgs = null;
			if (exifField1 != null)
				msgs = ((InternalEObject)exifField1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1, null, msgs);
			if (newExifField1 != null)
				msgs = ((InternalEObject)newExifField1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1, null, msgs);
			msgs = basicSetExifField1(newExifField1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1, newExifField1, newExifField1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getExifField2() {
		return exifField2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExifField2(SingleFieldType newExifField2, NotificationChain msgs) {
		SingleFieldType oldExifField2 = exifField2;
		exifField2 = newExifField2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2, oldExifField2, newExifField2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExifField2(SingleFieldType newExifField2) {
		if (newExifField2 != exifField2) {
			NotificationChain msgs = null;
			if (exifField2 != null)
				msgs = ((InternalEObject)exifField2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2, null, msgs);
			if (newExifField2 != null)
				msgs = ((InternalEObject)newExifField2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2, null, msgs);
			msgs = basicSetExifField2(newExifField2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2, newExifField2, newExifField2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getExifField3() {
		return exifField3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExifField3(RepeatedFieldType newExifField3, NotificationChain msgs) {
		RepeatedFieldType oldExifField3 = exifField3;
		exifField3 = newExifField3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3, oldExifField3, newExifField3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExifField3(RepeatedFieldType newExifField3) {
		if (newExifField3 != exifField3) {
			NotificationChain msgs = null;
			if (exifField3 != null)
				msgs = ((InternalEObject)exifField3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3, null, msgs);
			if (newExifField3 != null)
				msgs = ((InternalEObject)newExifField3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3, null, msgs);
			msgs = basicSetExifField3(newExifField3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3, newExifField3, newExifField3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.EXIF_IFD_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
				return basicSetExifVersion(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
				return basicSetFlashpixVersion(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
				return basicSetColorSpace(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
				return basicSetComponentsConfiguration(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
				return basicSetCompressedBitsPerPixel(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
				return basicSetPixelXDimension(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
				return basicSetPixelYDimension(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
				return basicSetMakerNote(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
				return basicSetUserComment(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
				return basicSetRelatedSoundFile(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
				return basicSetDateTimeOriginal(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
				return basicSetDateTimeDigitized(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
				return basicSetSubSecTime(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
				return basicSetSubSecTimeOriginal(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
				return basicSetSubSecTimeDigitized(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
				return basicSetExposureTime(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
				return basicSetFNumber(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
				return basicSetExposureProgram(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
				return basicSetSpectralSensitivity(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
				return basicSetISOSpeedRatings(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__OECF:
				return basicSetOECF(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
				return basicSetShutterSpeedValue(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
				return basicSetApertureValue(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
				return basicSetBrightnessValue(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
				return basicSetExposureBiasValue(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
				return basicSetMaxApertureValue(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
				return basicSetSubjectDistance(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
				return basicSetMeteringMode(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
				return basicSetLightSource(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
				return basicSetFlash(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
				return basicSetFocalLength(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
				return basicSetSubjectArea(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
				return basicSetFlashEnergy(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
				return basicSetSpatialFrequencyResponse(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
				return basicSetFocalPlaneXResolution(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
				return basicSetFocalPlaneYResolution(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
				return basicSetFocalPlaneResolutionUnit(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
				return basicSetSubjectLocation(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
				return basicSetExposureIndex(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
				return basicSetSensingMethod(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
				return basicSetFileSource(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
				return basicSetSceneType(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
				return basicSetCFAPattern(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
				return basicSetCustomRendered(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
				return basicSetExposureMode(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
				return basicSetWhiteBalance(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
				return basicSetDigitalZoomRatio(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
				return basicSetFocalLengthIn35mmFilm(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
				return basicSetSceneCaptureType(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
				return basicSetGainControl(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
				return basicSetContrast(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
				return basicSetSaturation(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
				return basicSetSharpness(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
				return basicSetDeviceSettingDescription(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
				return basicSetSubjectDistanceRange(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
				return basicSetImageUniqueID(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
				return basicSetGamma(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
				return basicSetExifField1(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
				return basicSetExifField2(null, msgs);
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
				return basicSetExifField3(null, msgs);
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
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
				return getExifVersion();
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
				return getFlashpixVersion();
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
				return getColorSpace();
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
				return getComponentsConfiguration();
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
				return getCompressedBitsPerPixel();
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
				return getPixelXDimension();
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
				return getPixelYDimension();
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
				return getMakerNote();
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
				return getUserComment();
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
				return getRelatedSoundFile();
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
				return getDateTimeOriginal();
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
				return getDateTimeDigitized();
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
				return getSubSecTime();
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
				return getSubSecTimeOriginal();
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
				return getSubSecTimeDigitized();
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
				return getExposureTime();
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
				return getFNumber();
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
				return getExposureProgram();
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
				return getSpectralSensitivity();
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
				return getISOSpeedRatings();
			case ExifPackage.EXIF_IFD_TYPE__OECF:
				return getOECF();
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
				return getShutterSpeedValue();
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
				return getApertureValue();
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
				return getBrightnessValue();
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
				return getExposureBiasValue();
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
				return getMaxApertureValue();
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
				return getSubjectDistance();
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
				return getMeteringMode();
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
				return getLightSource();
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
				return getFlash();
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
				return getFocalLength();
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
				return getSubjectArea();
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
				return getFlashEnergy();
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
				return getSpatialFrequencyResponse();
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
				return getFocalPlaneXResolution();
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
				return getFocalPlaneYResolution();
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
				return getFocalPlaneResolutionUnit();
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
				return getSubjectLocation();
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
				return getExposureIndex();
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
				return getSensingMethod();
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
				return getFileSource();
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
				return getSceneType();
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
				return getCFAPattern();
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
				return getCustomRendered();
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
				return getExposureMode();
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
				return getWhiteBalance();
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
				return getDigitalZoomRatio();
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
				return getFocalLengthIn35mmFilm();
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
				return getSceneCaptureType();
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
				return getGainControl();
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
				return getContrast();
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
				return getSaturation();
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
				return getSharpness();
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
				return getDeviceSettingDescription();
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
				return getSubjectDistanceRange();
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
				return getImageUniqueID();
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
				return getGamma();
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
				return getExifField1();
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
				return getExifField2();
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
				return getExifField3();
			case ExifPackage.EXIF_IFD_TYPE__TAG:
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
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
				setExifVersion((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
				setFlashpixVersion((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
				setColorSpace((ColorSpaceType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
				setComponentsConfiguration((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
				setCompressedBitsPerPixel((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
				setPixelXDimension((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
				setPixelYDimension((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
				setMakerNote((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
				setUserComment((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
				setRelatedSoundFile((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
				setDateTimeOriginal((DateTimeType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
				setDateTimeDigitized((DateTimeType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
				setSubSecTime((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
				setSubSecTimeOriginal((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
				setSubSecTimeDigitized((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
				setExposureTime((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
				setFNumber((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
				setExposureProgram((ExposureProgramType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
				setSpectralSensitivity((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
				setISOSpeedRatings((NonNegativeIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__OECF:
				setOECF((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
				setShutterSpeedValue((RealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
				setApertureValue((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
				setBrightnessValue((RealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
				setExposureBiasValue((RealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
				setMaxApertureValue((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
				setSubjectDistance((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
				setMeteringMode((MeteringModeType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
				setLightSource((LightSourceType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
				setFlash((FlashType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
				setFocalLength((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
				setSubjectArea((SubjectAreaType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
				setFlashEnergy((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
				setSpatialFrequencyResponse((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
				setFocalPlaneXResolution((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
				setFocalPlaneYResolution((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
				setFocalPlaneResolutionUnit((ResolutionType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
				setSubjectLocation((SubjectLocationType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
				setExposureIndex((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
				setSensingMethod((SensingMethodType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
				setFileSource((FileSourceType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
				setSceneType((StringType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
				setCFAPattern((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
				setCustomRendered((CustomRenderedType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
				setExposureMode((ExposureModeType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
				setWhiteBalance((WhiteBalanceType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
				setDigitalZoomRatio((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
				setFocalLengthIn35mmFilm((PositiveIntegerType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
				setSceneCaptureType((SceneCaptureType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
				setGainControl((GainControlType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
				setContrast((ContrastType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
				setSaturation((SaturationType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
				setSharpness((SharpnessType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
				setDeviceSettingDescription((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
				setSubjectDistanceRange((SubjectDistanceRangeType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
				setImageUniqueID((UuidType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
				setGamma((NonNegativeRealType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
				setExifField1((SingleFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
				setExifField2((SingleFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
				setExifField3((RepeatedFieldType)newValue);
				return;
			case ExifPackage.EXIF_IFD_TYPE__TAG:
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
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
				setExifVersion((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
				setFlashpixVersion((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
				setColorSpace((ColorSpaceType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
				setComponentsConfiguration((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
				setCompressedBitsPerPixel((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
				setPixelXDimension((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
				setPixelYDimension((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
				setMakerNote((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
				setUserComment((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
				setRelatedSoundFile((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
				setDateTimeOriginal((DateTimeType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
				setDateTimeDigitized((DateTimeType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
				setSubSecTime((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
				setSubSecTimeOriginal((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
				setSubSecTimeDigitized((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
				setExposureTime((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
				setFNumber((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
				setExposureProgram((ExposureProgramType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
				setSpectralSensitivity((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
				setISOSpeedRatings((NonNegativeIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__OECF:
				setOECF((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
				setShutterSpeedValue((RealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
				setApertureValue((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
				setBrightnessValue((RealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
				setExposureBiasValue((RealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
				setMaxApertureValue((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
				setSubjectDistance((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
				setMeteringMode((MeteringModeType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
				setLightSource((LightSourceType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
				setFlash((FlashType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
				setFocalLength((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
				setSubjectArea((SubjectAreaType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
				setFlashEnergy((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
				setSpatialFrequencyResponse((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
				setFocalPlaneXResolution((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
				setFocalPlaneYResolution((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
				setFocalPlaneResolutionUnit((ResolutionType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
				setSubjectLocation((SubjectLocationType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
				setExposureIndex((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
				setSensingMethod((SensingMethodType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
				setFileSource((FileSourceType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
				setSceneType((StringType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
				setCFAPattern((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
				setCustomRendered((CustomRenderedType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
				setExposureMode((ExposureModeType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
				setWhiteBalance((WhiteBalanceType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
				setDigitalZoomRatio((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
				setFocalLengthIn35mmFilm((PositiveIntegerType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
				setSceneCaptureType((SceneCaptureType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
				setGainControl((GainControlType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
				setContrast((ContrastType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
				setSaturation((SaturationType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
				setSharpness((SharpnessType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
				setDeviceSettingDescription((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
				setSubjectDistanceRange((SubjectDistanceRangeType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
				setImageUniqueID((UuidType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
				setGamma((NonNegativeRealType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
				setExifField1((SingleFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
				setExifField2((SingleFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
				setExifField3((RepeatedFieldType)null);
				return;
			case ExifPackage.EXIF_IFD_TYPE__TAG:
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
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
				return exifVersion != null;
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
				return flashpixVersion != null;
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
				return colorSpace != null;
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
				return componentsConfiguration != null;
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
				return compressedBitsPerPixel != null;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
				return pixelXDimension != null;
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
				return pixelYDimension != null;
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
				return makerNote != null;
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
				return userComment != null;
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
				return relatedSoundFile != null;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
				return dateTimeOriginal != null;
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
				return dateTimeDigitized != null;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
				return subSecTime != null;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
				return subSecTimeOriginal != null;
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
				return subSecTimeDigitized != null;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
				return exposureTime != null;
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
				return fNumber != null;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
				return exposureProgram != null;
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
				return spectralSensitivity != null;
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
				return iSOSpeedRatings != null;
			case ExifPackage.EXIF_IFD_TYPE__OECF:
				return oECF != null;
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
				return shutterSpeedValue != null;
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
				return apertureValue != null;
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
				return brightnessValue != null;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
				return exposureBiasValue != null;
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
				return maxApertureValue != null;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
				return subjectDistance != null;
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
				return meteringMode != null;
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
				return lightSource != null;
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
				return flash != null;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
				return focalLength != null;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
				return subjectArea != null;
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
				return flashEnergy != null;
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
				return spatialFrequencyResponse != null;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
				return focalPlaneXResolution != null;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
				return focalPlaneYResolution != null;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
				return focalPlaneResolutionUnit != null;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
				return subjectLocation != null;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
				return exposureIndex != null;
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
				return sensingMethod != null;
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
				return fileSource != null;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
				return sceneType != null;
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
				return cFAPattern != null;
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
				return customRendered != null;
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
				return exposureMode != null;
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
				return whiteBalance != null;
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
				return digitalZoomRatio != null;
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
				return focalLengthIn35mmFilm != null;
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
				return sceneCaptureType != null;
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
				return gainControl != null;
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
				return contrast != null;
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
				return saturation != null;
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
				return sharpness != null;
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
				return deviceSettingDescription != null;
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
				return subjectDistanceRange != null;
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
				return imageUniqueID != null;
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
				return gamma != null;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
				return exifField1 != null;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
				return exifField2 != null;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
				return exifField3 != null;
			case ExifPackage.EXIF_IFD_TYPE__TAG:
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

} //ExifIfdTypeImpl
