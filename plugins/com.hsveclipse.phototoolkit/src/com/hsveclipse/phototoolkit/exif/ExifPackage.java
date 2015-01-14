/**
 */
package com.hsveclipse.phototoolkit.exif;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *     
 *       Introduction
 *  
 *         This is the Oracle interMedia schema for image metadata stored
 *         in the EXIF format for digital still cameras. This schema supports
 *         tags defined up to EXIF version 2.21
 *  
 *         Metadata extracted only from the 0th IFD. For JPEG images, this means
 *         that the metadata comes from the main image in the file. Metadata is not
 *         extracted for the thumbnail image (1st IFD).
 *  
 *       Structure
 *  
 *         This schema defines a single global element exifMetadata which
 *         contains up to four child elements. Each child element contains tags
 *         from a TIFF IFD directory as defined by the EXIF standard.
 *  
 *               TiffIfd contains tags from the TIFF IFD. 
 *               ExifIfd contains tags from the EXIF IFD. 
 *               GpsIfd  contains tags from the GPS IFD. 
 *               InteroperabilityIfd contains tags from the Interoperability IFD.
 *  
 *         All elements that derive directly from EXIF tags contain a required 
 *         "tag" attribute. The value of this attribute is the Tag ID value as
 *         defined in the EXIF standard.
 *    
 *       Unsupported tags
 *         The table below lists tags that are defined by the EXIF standard
 *         but which the current version of Oracle interMedia does not 
 *         read from image files. Note that this schema does define data 
 *         models for these tags and future versions of Oracle
 *         interMedia may parse these fields from image files. Those tags 
 *         could be represented by documents conforming to this schema.
 *  
 *           These tags are from the TIFF IFD
 *           tag   301:  TransferFunction
 *           tag   318:  WhitePoint
 *           tag   319:  PrimaryChromaticities
 *           tag   529:  YCbCrCoefficients
 *           tag   532:  ReferenceWhiteBlack
 *  
 *           tag   273:  StripOffsets
 *           tag   278:  RowsPerStrip
 *           tag   279:  StripByteCounts
 *           tag   513:  JPEGInterChangeFormat
 *           tag   514:  JPEGInterChangeFormatLength
 *  
 *           These tags are from the EXIF IFD
 *  
 *           tag 34855:  ISOSpeedRatings
 *           tag 34856:  OECF
 *           tag 37396:  SubjectArea
 *           tag 37500:  MakerNote
 *           tag 41484:  SpatialFrequencyResponse
 *           tag 41492:  SubjectLocation
 *           tag 41730:  CFAPattern
 *           tag 41995:  DeviceSettingsDescription
 *           tag 42016:  ImageUniqueID
 *  
 *     
 * <!-- end-model-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifFactory
 * @model kind="package"
 * @generated
 */
public interface ExifPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exif";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xmlns.oracle.com/ord/meta/exif";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExifPackage eINSTANCE = com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.BitsPerSampleTypeImpl <em>Bits Per Sample Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.BitsPerSampleTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getBitsPerSampleType()
	 * @generated
	 */
	int BITS_PER_SAMPLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_PER_SAMPLE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_PER_SAMPLE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Bits Per Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_PER_SAMPLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bits Per Sample Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITS_PER_SAMPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ChromaticityImpl <em>Chromaticity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ChromaticityImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getChromaticity()
	 * @generated
	 */
	int CHROMATICITY = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMATICITY__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMATICITY__Y = 1;

	/**
	 * The number of structural features of the '<em>Chromaticity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMATICITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Chromaticity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHROMATICITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ColorSpaceTypeImpl <em>Color Space Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ColorSpaceTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getColorSpaceType()
	 * @generated
	 */
	int COLOR_SPACE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SPACE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SPACE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Color Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SPACE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Color Space Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_SPACE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.CompressionTypeImpl <em>Compression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.CompressionTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCompressionType()
	 * @generated
	 */
	int COMPRESSION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Compression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Compression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ContrastTypeImpl <em>Contrast Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ContrastTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getContrastType()
	 * @generated
	 */
	int CONTRAST_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAST_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAST_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Contrast Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Contrast Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRAST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.CustomRenderedTypeImpl <em>Custom Rendered Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.CustomRenderedTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCustomRenderedType()
	 * @generated
	 */
	int CUSTOM_RENDERED_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RENDERED_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RENDERED_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Custom Rendered Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RENDERED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Rendered Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RENDERED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.DateTimeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.DateTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.DocumentRootImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Exif Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXIF_METADATA = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl <em>Ifd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifIfdTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExifIfdType()
	 * @generated
	 */
	int EXIF_IFD_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Exif Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXIF_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Flashpix Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FLASHPIX_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Color Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__COLOR_SPACE = 2;

	/**
	 * The feature id for the '<em><b>Components Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Compressed Bits Per Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL = 4;

	/**
	 * The feature id for the '<em><b>Pixel XDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__PIXEL_XDIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Pixel YDimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__PIXEL_YDIMENSION = 6;

	/**
	 * The feature id for the '<em><b>Maker Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__MAKER_NOTE = 7;

	/**
	 * The feature id for the '<em><b>User Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__USER_COMMENT = 8;

	/**
	 * The feature id for the '<em><b>Related Sound File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__RELATED_SOUND_FILE = 9;

	/**
	 * The feature id for the '<em><b>Date Time Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__DATE_TIME_ORIGINAL = 10;

	/**
	 * The feature id for the '<em><b>Date Time Digitized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__DATE_TIME_DIGITIZED = 11;

	/**
	 * The feature id for the '<em><b>Sub Sec Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUB_SEC_TIME = 12;

	/**
	 * The feature id for the '<em><b>Sub Sec Time Original</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL = 13;

	/**
	 * The feature id for the '<em><b>Sub Sec Time Digitized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED = 14;

	/**
	 * The feature id for the '<em><b>Exposure Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXPOSURE_TIME = 15;

	/**
	 * The feature id for the '<em><b>FNumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FNUMBER = 16;

	/**
	 * The feature id for the '<em><b>Exposure Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXPOSURE_PROGRAM = 17;

	/**
	 * The feature id for the '<em><b>Spectral Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY = 18;

	/**
	 * The feature id for the '<em><b>ISO Speed Ratings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__ISO_SPEED_RATINGS = 19;

	/**
	 * The feature id for the '<em><b>OECF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__OECF = 20;

	/**
	 * The feature id for the '<em><b>Shutter Speed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Aperture Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__APERTURE_VALUE = 22;

	/**
	 * The feature id for the '<em><b>Brightness Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__BRIGHTNESS_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Exposure Bias Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Max Aperture Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__MAX_APERTURE_VALUE = 25;

	/**
	 * The feature id for the '<em><b>Subject Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUBJECT_DISTANCE = 26;

	/**
	 * The feature id for the '<em><b>Metering Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__METERING_MODE = 27;

	/**
	 * The feature id for the '<em><b>Light Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__LIGHT_SOURCE = 28;

	/**
	 * The feature id for the '<em><b>Flash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FLASH = 29;

	/**
	 * The feature id for the '<em><b>Focal Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FOCAL_LENGTH = 30;

	/**
	 * The feature id for the '<em><b>Subject Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUBJECT_AREA = 31;

	/**
	 * The feature id for the '<em><b>Flash Energy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FLASH_ENERGY = 32;

	/**
	 * The feature id for the '<em><b>Spatial Frequency Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE = 33;

	/**
	 * The feature id for the '<em><b>Focal Plane XResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION = 34;

	/**
	 * The feature id for the '<em><b>Focal Plane YResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION = 35;

	/**
	 * The feature id for the '<em><b>Focal Plane Resolution Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT = 36;

	/**
	 * The feature id for the '<em><b>Subject Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUBJECT_LOCATION = 37;

	/**
	 * The feature id for the '<em><b>Exposure Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXPOSURE_INDEX = 38;

	/**
	 * The feature id for the '<em><b>Sensing Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SENSING_METHOD = 39;

	/**
	 * The feature id for the '<em><b>File Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FILE_SOURCE = 40;

	/**
	 * The feature id for the '<em><b>Scene Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SCENE_TYPE = 41;

	/**
	 * The feature id for the '<em><b>CFA Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__CFA_PATTERN = 42;

	/**
	 * The feature id for the '<em><b>Custom Rendered</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__CUSTOM_RENDERED = 43;

	/**
	 * The feature id for the '<em><b>Exposure Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXPOSURE_MODE = 44;

	/**
	 * The feature id for the '<em><b>White Balance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__WHITE_BALANCE = 45;

	/**
	 * The feature id for the '<em><b>Digital Zoom Ratio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO = 46;

	/**
	 * The feature id for the '<em><b>Focal Length In35mm Film</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM = 47;

	/**
	 * The feature id for the '<em><b>Scene Capture Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Gain Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__GAIN_CONTROL = 49;

	/**
	 * The feature id for the '<em><b>Contrast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__CONTRAST = 50;

	/**
	 * The feature id for the '<em><b>Saturation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SATURATION = 51;

	/**
	 * The feature id for the '<em><b>Sharpness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SHARPNESS = 52;

	/**
	 * The feature id for the '<em><b>Device Setting Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION = 53;

	/**
	 * The feature id for the '<em><b>Subject Distance Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE = 54;

	/**
	 * The feature id for the '<em><b>Image Unique ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__IMAGE_UNIQUE_ID = 55;

	/**
	 * The feature id for the '<em><b>Gamma</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__GAMMA = 56;

	/**
	 * The feature id for the '<em><b>Exif Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXIF_FIELD1 = 57;

	/**
	 * The feature id for the '<em><b>Exif Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXIF_FIELD2 = 58;

	/**
	 * The feature id for the '<em><b>Exif Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__EXIF_FIELD3 = 59;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE__TAG = 60;

	/**
	 * The number of structural features of the '<em>Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE_FEATURE_COUNT = 61;

	/**
	 * The number of operations of the '<em>Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_IFD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifMetadataTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExifMetadataType()
	 * @generated
	 */
	int EXIF_METADATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Tiff Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE__TIFF_IFD = 0;

	/**
	 * The feature id for the '<em><b>Exif Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE__EXIF_IFD = 1;

	/**
	 * The feature id for the '<em><b>Gps Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE__GPS_IFD = 2;

	/**
	 * The feature id for the '<em><b>Interoperability Ifd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE__INTEROPERABILITY_IFD = 3;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIF_METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ExposureModeTypeImpl <em>Exposure Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExposureModeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureModeType()
	 * @generated
	 */
	int EXPOSURE_MODE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_MODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_MODE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Exposure Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_MODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exposure Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_MODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ExposureProgramTypeImpl <em>Exposure Program Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExposureProgramTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureProgramType()
	 * @generated
	 */
	int EXPOSURE_PROGRAM_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PROGRAM_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PROGRAM_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Exposure Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PROGRAM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exposure Program Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSURE_PROGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.FileSourceTypeImpl <em>File Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.FileSourceTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFileSourceType()
	 * @generated
	 */
	int FILE_SOURCE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOURCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOURCE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>File Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.FlashTypeImpl <em>Flash Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.FlashTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFlashType()
	 * @generated
	 */
	int FLASH_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Fired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__FIRED = 0;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__RETURN = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__MODE = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Red Eye Reduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__RED_EYE_REDUCTION = 4;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE__TAG = 5;

	/**
	 * The number of structural features of the '<em>Flash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Flash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLASH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GainControlTypeImpl <em>Gain Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GainControlTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGainControlType()
	 * @generated
	 */
	int GAIN_CONTROL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAIN_CONTROL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAIN_CONTROL_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gain Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAIN_CONTROL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gain Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAIN_CONTROL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsAltitudeRefTypeImpl <em>Gps Altitude Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsAltitudeRefTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsAltitudeRefType()
	 * @generated
	 */
	int GPS_ALTITUDE_REF_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_ALTITUDE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_ALTITUDE_REF_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Altitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_ALTITUDE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Altitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_ALTITUDE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsBearingTypeImpl <em>Gps Bearing Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsBearingTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsBearingType()
	 * @generated
	 */
	int GPS_BEARING_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_BEARING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_BEARING_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Bearing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_BEARING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Bearing Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_BEARING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsDifferentialTypeImpl <em>Gps Differential Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsDifferentialTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDifferentialType()
	 * @generated
	 */
	int GPS_DIFFERENTIAL_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIFFERENTIAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIFFERENTIAL_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Differential Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIFFERENTIAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Differential Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIFFERENTIAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsDirectionTypeImpl <em>Gps Direction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsDirectionTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDirectionType()
	 * @generated
	 */
	int GPS_DIRECTION_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIRECTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIRECTION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIRECTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Direction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DIRECTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsDistanceRefTypeImpl <em>Gps Distance Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsDistanceRefTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDistanceRefType()
	 * @generated
	 */
	int GPS_DISTANCE_REF_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DISTANCE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DISTANCE_REF_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Distance Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DISTANCE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Distance Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_DISTANCE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl <em>Gps Ifd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsIfdTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsIfdType()
	 * @generated
	 */
	int GPS_IFD_TYPE = 21;

	/**
	 * The feature id for the '<em><b>GPS Version ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_VERSION_ID = 0;

	/**
	 * The feature id for the '<em><b>GPS Latitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_LATITUDE_REF = 1;

	/**
	 * The feature id for the '<em><b>GPS Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_LATITUDE = 2;

	/**
	 * The feature id for the '<em><b>GPS Longitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_LONGITUDE_REF = 3;

	/**
	 * The feature id for the '<em><b>GPS Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_LONGITUDE = 4;

	/**
	 * The feature id for the '<em><b>GPS Altitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_ALTITUDE_REF = 5;

	/**
	 * The feature id for the '<em><b>GPS Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_ALTITUDE = 6;

	/**
	 * The feature id for the '<em><b>GPS Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_TIME_STAMP = 7;

	/**
	 * The feature id for the '<em><b>GPS Satellites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_SATELLITES = 8;

	/**
	 * The feature id for the '<em><b>GPS Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_STATUS = 9;

	/**
	 * The feature id for the '<em><b>GPS Measure Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_MEASURE_MODE = 10;

	/**
	 * The feature id for the '<em><b>GPSDOP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPSDOP = 11;

	/**
	 * The feature id for the '<em><b>GPS Speed Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_SPEED_REF = 12;

	/**
	 * The feature id for the '<em><b>GPS Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_SPEED = 13;

	/**
	 * The feature id for the '<em><b>GPS Track Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_TRACK_REF = 14;

	/**
	 * The feature id for the '<em><b>GPS Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_TRACK = 15;

	/**
	 * The feature id for the '<em><b>GPS Img Direction Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF = 16;

	/**
	 * The feature id for the '<em><b>GPS Img Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_IMG_DIRECTION = 17;

	/**
	 * The feature id for the '<em><b>GPS Map Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_MAP_DATUM = 18;

	/**
	 * The feature id for the '<em><b>GPS Dest Latitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF = 19;

	/**
	 * The feature id for the '<em><b>GPS Dest Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_LATITUDE = 20;

	/**
	 * The feature id for the '<em><b>GPS Dest Longitude Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF = 21;

	/**
	 * The feature id for the '<em><b>GPS Dest Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_LONGITUDE = 22;

	/**
	 * The feature id for the '<em><b>GPS Dest Bearing Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_BEARING_REF = 23;

	/**
	 * The feature id for the '<em><b>GPS Dest Bearing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_BEARING = 24;

	/**
	 * The feature id for the '<em><b>GPS Dest Distance Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF = 25;

	/**
	 * The feature id for the '<em><b>GPS Dest Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DEST_DISTANCE = 26;

	/**
	 * The feature id for the '<em><b>GPS Processing Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_PROCESSING_METHOD = 27;

	/**
	 * The feature id for the '<em><b>GPS Area Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_AREA_INFORMATION = 28;

	/**
	 * The feature id for the '<em><b>GPS Date Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DATE_STAMP = 29;

	/**
	 * The feature id for the '<em><b>GPS Differential</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_DIFFERENTIAL = 30;

	/**
	 * The feature id for the '<em><b>GPS Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_FIELD1 = 31;

	/**
	 * The feature id for the '<em><b>GPS Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_FIELD2 = 32;

	/**
	 * The feature id for the '<em><b>GPS Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__GPS_FIELD3 = 33;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE__TAG = 34;

	/**
	 * The number of structural features of the '<em>Gps Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Gps Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_IFD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsLatitudeRefTypeImpl <em>Gps Latitude Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsLatitudeRefTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeRefType()
	 * @generated
	 */
	int GPS_LATITUDE_REF_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_REF_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Latitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Latitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsLatitudeTypeImpl <em>Gps Latitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsLatitudeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeType()
	 * @generated
	 */
	int GPS_LATITUDE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Latitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LATITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsLongitudeRefTypeImpl <em>Gps Longitude Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsLongitudeRefTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeRefType()
	 * @generated
	 */
	int GPS_LONGITUDE_REF_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_REF_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Longitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Longitude Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsLongitudeTypeImpl <em>Gps Longitude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsLongitudeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeType()
	 * @generated
	 */
	int GPS_LONGITUDE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Longitude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_LONGITUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsMeasureModeTypeImpl <em>Gps Measure Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsMeasureModeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsMeasureModeType()
	 * @generated
	 */
	int GPS_MEASURE_MODE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_MEASURE_MODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_MEASURE_MODE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Measure Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_MEASURE_MODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Measure Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_MEASURE_MODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsSpeedRefTypeImpl <em>Gps Speed Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsSpeedRefTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsSpeedRefType()
	 * @generated
	 */
	int GPS_SPEED_REF_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SPEED_REF_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SPEED_REF_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Speed Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SPEED_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Speed Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_SPEED_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.GpsStatusTypeImpl <em>Gps Status Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.GpsStatusTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsStatusType()
	 * @generated
	 */
	int GPS_STATUS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_STATUS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_STATUS_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Gps Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_STATUS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Gps Status Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_STATUS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.InteroperabilityIfdTypeImpl <em>Interoperability Ifd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.InteroperabilityIfdTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getInteroperabilityIfdType()
	 * @generated
	 */
	int INTEROPERABILITY_IFD_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Interoperability Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_IFD_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Interoperability Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_IFD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interoperability Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_IFD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.InteroperabilityTypeImpl <em>Interoperability Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.InteroperabilityTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getInteroperabilityType()
	 * @generated
	 */
	int INTEROPERABILITY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Interoperability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interoperability Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEROPERABILITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.LightSourceTypeImpl <em>Light Source Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.LightSourceTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getLightSourceType()
	 * @generated
	 */
	int LIGHT_SOURCE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Light Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Light Source Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SOURCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.MeteringModeTypeImpl <em>Metering Mode Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.MeteringModeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getMeteringModeType()
	 * @generated
	 */
	int METERING_MODE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_MODE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_MODE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Metering Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_MODE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metering Mode Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METERING_MODE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.NonNegativeIntegerTypeImpl <em>Non Negative Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.NonNegativeIntegerTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getNonNegativeIntegerType()
	 * @generated
	 */
	int NON_NEGATIVE_INTEGER_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Non Negative Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Non Negative Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_INTEGER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.NonNegativeRealTypeImpl <em>Non Negative Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.NonNegativeRealTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getNonNegativeRealType()
	 * @generated
	 */
	int NON_NEGATIVE_REAL_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Non Negative Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Non Negative Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_NEGATIVE_REAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.OrientationTypeImpl <em>Orientation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.OrientationTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Orientation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orientation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.PhotometricInterpretationTypeImpl <em>Photometric Interpretation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.PhotometricInterpretationTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPhotometricInterpretationType()
	 * @generated
	 */
	int PHOTOMETRIC_INTERPRETATION_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOMETRIC_INTERPRETATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOMETRIC_INTERPRETATION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Photometric Interpretation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOMETRIC_INTERPRETATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Photometric Interpretation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTOMETRIC_INTERPRETATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.PlanarConfigurationTypeImpl <em>Planar Configuration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.PlanarConfigurationTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPlanarConfigurationType()
	 * @generated
	 */
	int PLANAR_CONFIGURATION_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANAR_CONFIGURATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANAR_CONFIGURATION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Planar Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANAR_CONFIGURATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Planar Configuration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANAR_CONFIGURATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.PositiveIntegerTypeImpl <em>Positive Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.PositiveIntegerTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPositiveIntegerType()
	 * @generated
	 */
	int POSITIVE_INTEGER_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Positive Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Positive Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_INTEGER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.PrimaryChromaticitiesTypeImpl <em>Primary Chromaticities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.PrimaryChromaticitiesTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPrimaryChromaticitiesType()
	 * @generated
	 */
	int PRIMARY_CHROMATICITIES_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Color1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE__COLOR1 = 0;

	/**
	 * The feature id for the '<em><b>Color2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE__COLOR2 = 1;

	/**
	 * The feature id for the '<em><b>Color3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE__COLOR3 = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE__TAG = 3;

	/**
	 * The number of structural features of the '<em>Primary Chromaticities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Primary Chromaticities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_CHROMATICITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.RealTypeImpl <em>Real Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.RealTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getRealType()
	 * @generated
	 */
	int REAL_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Real Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.RepeatedFieldTypeImpl <em>Repeated Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.RepeatedFieldTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getRepeatedFieldType()
	 * @generated
	 */
	int REPEATED_FIELD_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_FIELD_TYPE__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_FIELD_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Repeated Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_FIELD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repeated Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.ResolutionTypeImpl <em>Resolution Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ResolutionTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getResolutionType()
	 * @generated
	 */
	int RESOLUTION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Resolution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resolution Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLUTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SaturationTypeImpl <em>Saturation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SaturationTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSaturationType()
	 * @generated
	 */
	int SATURATION_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Saturation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Saturation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATURATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SceneCaptureTypeImpl <em>Scene Capture Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SceneCaptureTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSceneCaptureType()
	 * @generated
	 */
	int SCENE_CAPTURE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_CAPTURE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_CAPTURE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Scene Capture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_CAPTURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scene Capture Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_CAPTURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SensingMethodTypeImpl <em>Sensing Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SensingMethodTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSensingMethodType()
	 * @generated
	 */
	int SENSING_METHOD_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_METHOD_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_METHOD_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Sensing Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_METHOD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sensing Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSING_METHOD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SharpnessTypeImpl <em>Sharpness Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SharpnessTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSharpnessType()
	 * @generated
	 */
	int SHARPNESS_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPNESS_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPNESS_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Sharpness Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPNESS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sharpness Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPNESS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SingleFieldTImpl <em>Single Field T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SingleFieldTImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSingleFieldT()
	 * @generated
	 */
	int SINGLE_FIELD_T = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_T__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_T__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_T__DATATYPE = 2;

	/**
	 * The number of structural features of the '<em>Single Field T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_T_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Single Field T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SingleFieldTypeImpl <em>Single Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SingleFieldTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSingleFieldType()
	 * @generated
	 */
	int SINGLE_FIELD_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE__NAME = SINGLE_FIELD_T__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE__VALUE = SINGLE_FIELD_T__VALUE;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE__DATATYPE = SINGLE_FIELD_T__DATATYPE;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE__TAG = SINGLE_FIELD_T_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE_FEATURE_COUNT = SINGLE_FIELD_T_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_TYPE_OPERATION_COUNT = SINGLE_FIELD_T_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.StringTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.StripByteCountsTypeImpl <em>Strip Byte Counts Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.StripByteCountsTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getStripByteCountsType()
	 * @generated
	 */
	int STRIP_BYTE_COUNTS_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Strip Byte Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNTS_TYPE__STRIP_BYTE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNTS_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Strip Byte Counts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strip Byte Counts Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.StripByteCountTypeImpl <em>Strip Byte Count Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.StripByteCountTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getStripByteCountType()
	 * @generated
	 */
	int STRIP_BYTE_COUNT_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNT_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNT_TYPE__BYTES = 1;

	/**
	 * The number of structural features of the '<em>Strip Byte Count Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strip Byte Count Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_BYTE_COUNT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.StripOffsetsTypeImpl <em>Strip Offsets Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.StripOffsetsTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getStripOffsetsType()
	 * @generated
	 */
	int STRIP_OFFSETS_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Strip Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSETS_TYPE__STRIP_OFFSET = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSETS_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Strip Offsets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSETS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strip Offsets Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSETS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.StripOffsetTypeImpl <em>Strip Offset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.StripOffsetTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getStripOffsetType()
	 * @generated
	 */
	int STRIP_OFFSET_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSET_TYPE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSET_TYPE__OFFSET = 1;

	/**
	 * The number of structural features of the '<em>Strip Offset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Strip Offset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIP_OFFSET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SubjectLocationTypeImpl <em>Subject Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SubjectLocationTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSubjectLocationType()
	 * @generated
	 */
	int SUBJECT_LOCATION_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Center X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATION_TYPE__CENTER_X = 0;

	/**
	 * The feature id for the '<em><b>Center Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATION_TYPE__CENTER_Y = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATION_TYPE__TAG = 2;

	/**
	 * The number of structural features of the '<em>Subject Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subject Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_LOCATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SubjectAreaTypeImpl <em>Subject Area Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SubjectAreaTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSubjectAreaType()
	 * @generated
	 */
	int SUBJECT_AREA_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Center X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__CENTER_X = SUBJECT_LOCATION_TYPE__CENTER_X;

	/**
	 * The feature id for the '<em><b>Center Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__CENTER_Y = SUBJECT_LOCATION_TYPE__CENTER_Y;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__TAG = SUBJECT_LOCATION_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__DIAMETER = SUBJECT_LOCATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__WIDTH = SUBJECT_LOCATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE__HEIGHT = SUBJECT_LOCATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subject Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE_FEATURE_COUNT = SUBJECT_LOCATION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Subject Area Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_TYPE_OPERATION_COUNT = SUBJECT_LOCATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.SubjectDistanceRangeTypeImpl <em>Subject Distance Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.SubjectDistanceRangeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSubjectDistanceRangeType()
	 * @generated
	 */
	int SUBJECT_DISTANCE_RANGE_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DISTANCE_RANGE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DISTANCE_RANGE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Subject Distance Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DISTANCE_RANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Subject Distance Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_DISTANCE_RANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.TiffIfdTypeImpl <em>Tiff Ifd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.TiffIfdTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getTiffIfdType()
	 * @generated
	 */
	int TIFF_IFD_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Image Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__IMAGE_WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Image Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__IMAGE_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Bits Per Sample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__BITS_PER_SAMPLE = 2;

	/**
	 * The feature id for the '<em><b>Compression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__COMPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Photometric Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION = 4;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__ORIENTATION = 5;

	/**
	 * The feature id for the '<em><b>Samples Per Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__SAMPLES_PER_PIXEL = 6;

	/**
	 * The feature id for the '<em><b>Planar Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__PLANAR_CONFIGURATION = 7;

	/**
	 * The feature id for the '<em><b>YCb Cr Sub Sampling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING = 8;

	/**
	 * The feature id for the '<em><b>YCb Cr Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__YCB_CR_POSITIONING = 9;

	/**
	 * The feature id for the '<em><b>XResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__XRESOLUTION = 10;

	/**
	 * The feature id for the '<em><b>YResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__YRESOLUTION = 11;

	/**
	 * The feature id for the '<em><b>Resolution Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__RESOLUTION_UNIT = 12;

	/**
	 * The feature id for the '<em><b>Strip Offsets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__STRIP_OFFSETS = 13;

	/**
	 * The feature id for the '<em><b>Rows Per Strip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__ROWS_PER_STRIP = 14;

	/**
	 * The feature id for the '<em><b>Strip Byte Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__STRIP_BYTE_COUNTS = 15;

	/**
	 * The feature id for the '<em><b>JPEG Inter Change Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT = 16;

	/**
	 * The feature id for the '<em><b>JPEG Inter Change Format Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH = 17;

	/**
	 * The feature id for the '<em><b>Transfer Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__TRANSFER_FUNCTION = 18;

	/**
	 * The feature id for the '<em><b>White Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__WHITE_POINT = 19;

	/**
	 * The feature id for the '<em><b>Primary Chromaticities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES = 20;

	/**
	 * The feature id for the '<em><b>YCb Cr Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS = 21;

	/**
	 * The feature id for the '<em><b>Reference Black White</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE = 22;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__DATE_TIME = 23;

	/**
	 * The feature id for the '<em><b>Image Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__IMAGE_DESCRIPTION = 24;

	/**
	 * The feature id for the '<em><b>Make</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__MAKE = 25;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__MODEL = 26;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__SOFTWARE = 27;

	/**
	 * The feature id for the '<em><b>Artist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__ARTIST = 28;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__COPYRIGHT = 29;

	/**
	 * The feature id for the '<em><b>Tiff Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__TIFF_FIELD1 = 30;

	/**
	 * The feature id for the '<em><b>Tiff Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__TIFF_FIELD2 = 31;

	/**
	 * The feature id for the '<em><b>Tiff Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE__TIFF_FIELD3 = 32;

	/**
	 * The number of structural features of the '<em>Tiff Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE_FEATURE_COUNT = 33;

	/**
	 * The number of operations of the '<em>Tiff Ifd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIFF_IFD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.TimeTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.UuidTypeImpl <em>Uuid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.UuidTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getUuidType()
	 * @generated
	 */
	int UUID_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>Uuid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Uuid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UUID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.WhiteBalanceTypeImpl <em>White Balance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.WhiteBalanceTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getWhiteBalanceType()
	 * @generated
	 */
	int WHITE_BALANCE_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BALANCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BALANCE_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>White Balance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BALANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>White Balance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_BALANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.WhitePointTypeImpl <em>White Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.WhitePointTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getWhitePointType()
	 * @generated
	 */
	int WHITE_POINT_TYPE = 61;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_POINT_TYPE__X = CHROMATICITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_POINT_TYPE__Y = CHROMATICITY__Y;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_POINT_TYPE__TAG = CHROMATICITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>White Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_POINT_TYPE_FEATURE_COUNT = CHROMATICITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>White Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHITE_POINT_TYPE_OPERATION_COUNT = CHROMATICITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl <em>YCb Cr Coefficients Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrCoefficientsType()
	 * @generated
	 */
	int YCB_CR_COEFFICIENTS_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Coefficient1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1 = 0;

	/**
	 * The feature id for the '<em><b>Coefficient2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2 = 1;

	/**
	 * The feature id for the '<em><b>Coefficient3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3 = 2;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE__TAG = 3;

	/**
	 * The number of structural features of the '<em>YCb Cr Coefficients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>YCb Cr Coefficients Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_COEFFICIENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrPositioningTypeImpl <em>YCb Cr Positioning Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.YCbCrPositioningTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrPositioningType()
	 * @generated
	 */
	int YCB_CR_POSITIONING_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_POSITIONING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_POSITIONING_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>YCb Cr Positioning Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_POSITIONING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>YCb Cr Positioning Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_POSITIONING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrSubSamplingTypeImpl <em>YCb Cr Sub Sampling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.YCbCrSubSamplingTypeImpl
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrSubSamplingType()
	 * @generated
	 */
	int YCB_CR_SUB_SAMPLING_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_SUB_SAMPLING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_SUB_SAMPLING_TYPE__TAG = 1;

	/**
	 * The number of structural features of the '<em>YCb Cr Sub Sampling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_SUB_SAMPLING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>YCb Cr Sub Sampling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YCB_CR_SUB_SAMPLING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleT <em>Bits Per Sample T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getBitsPerSampleT()
	 * @generated
	 */
	int BITS_PER_SAMPLE_T = 65;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceT <em>Color Space T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getColorSpaceT()
	 * @generated
	 */
	int COLOR_SPACE_T = 66;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.CompressionT <em>Compression T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.CompressionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCompressionT()
	 * @generated
	 */
	int COMPRESSION_T = 67;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.ContrastT <em>Contrast T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ContrastT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getContrastT()
	 * @generated
	 */
	int CONTRAST_T = 68;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedT <em>Custom Rendered T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCustomRenderedT()
	 * @generated
	 */
	int CUSTOM_RENDERED_T = 69;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.DatatypeType <em>Datatype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getDatatypeType()
	 * @generated
	 */
	int DATATYPE_TYPE = 70;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.ExposureModeT <em>Exposure Mode T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureModeT()
	 * @generated
	 */
	int EXPOSURE_MODE_T = 71;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramT <em>Exposure Program T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureProgramT()
	 * @generated
	 */
	int EXPOSURE_PROGRAM_T = 72;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.FileSourceT <em>File Source T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFileSourceT()
	 * @generated
	 */
	int FILE_SOURCE_T = 73;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.FlashModeT <em>Flash Mode T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFlashModeT()
	 * @generated
	 */
	int FLASH_MODE_T = 74;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.FlashReturnT <em>Flash Return T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFlashReturnT()
	 * @generated
	 */
	int FLASH_RETURN_T = 75;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GainControlT <em>Gain Control T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GainControlT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGainControlT()
	 * @generated
	 */
	int GAIN_CONTROL_T = 76;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT <em>Gps Altitude Ref T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsAltitudeRefT()
	 * @generated
	 */
	int GPS_ALTITUDE_REF_T = 77;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialT <em>Gps Differential T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDifferentialT()
	 * @generated
	 */
	int GPS_DIFFERENTIAL_T = 78;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionT <em>Gps Direction T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDirectionT()
	 * @generated
	 */
	int GPS_DIRECTION_T = 79;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefT <em>Gps Distance Ref T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDistanceRefT()
	 * @generated
	 */
	int GPS_DISTANCE_REF_T = 80;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT <em>Gps Latitude Ref T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeRefT()
	 * @generated
	 */
	int GPS_LATITUDE_REF_T = 81;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT <em>Gps Longitude Ref T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeRefT()
	 * @generated
	 */
	int GPS_LONGITUDE_REF_T = 82;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeT <em>Gps Measure Mode T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsMeasureModeT()
	 * @generated
	 */
	int GPS_MEASURE_MODE_T = 83;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefT <em>Gps Speed Ref T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsSpeedRefT()
	 * @generated
	 */
	int GPS_SPEED_REF_T = 84;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.GpsStatusT <em>Gps Status T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsStatusT()
	 * @generated
	 */
	int GPS_STATUS_T = 85;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityT <em>Interoperability T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getInteroperabilityT()
	 * @generated
	 */
	int INTEROPERABILITY_T = 86;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.LightSourceT <em>Light Source T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getLightSourceT()
	 * @generated
	 */
	int LIGHT_SOURCE_T = 87;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.MeteringModeT <em>Metering Mode T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getMeteringModeT()
	 * @generated
	 */
	int METERING_MODE_T = 88;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.OrientationT <em>Orientation T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.OrientationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getOrientationT()
	 * @generated
	 */
	int ORIENTATION_T = 89;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT <em>Photometric Interpretation T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPhotometricInterpretationT()
	 * @generated
	 */
	int PHOTOMETRIC_INTERPRETATION_T = 90;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationT <em>Planar Configuration T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPlanarConfigurationT()
	 * @generated
	 */
	int PLANAR_CONFIGURATION_T = 91;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.ResolutionT <em>Resolution T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getResolutionT()
	 * @generated
	 */
	int RESOLUTION_T = 92;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.SaturationT <em>Saturation T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SaturationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSaturationT()
	 * @generated
	 */
	int SATURATION_T = 93;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureT <em>Scene Capture T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSceneCaptureT()
	 * @generated
	 */
	int SCENE_CAPTURE_T = 94;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.SensingMethodT <em>Sensing Method T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSensingMethodT()
	 * @generated
	 */
	int SENSING_METHOD_T = 95;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT <em>Subject Distance Range T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSubjectDistanceRangeT()
	 * @generated
	 */
	int SUBJECT_DISTANCE_RANGE_T = 96;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceT <em>White Balance T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getWhiteBalanceT()
	 * @generated
	 */
	int WHITE_BALANCE_T = 97;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningT <em>YCb Cr Positioning T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrPositioningT()
	 * @generated
	 */
	int YCB_CR_POSITIONING_T = 98;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT <em>YCb Cr Sub Sampling T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrSubSamplingT()
	 * @generated
	 */
	int YCB_CR_SUB_SAMPLING_T = 99;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.exif.YesNoT <em>Yes No T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYesNoT()
	 * @generated
	 */
	int YES_NO_T = 100;

	/**
	 * The meta object id for the '<em>Bits Per Sample TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getBitsPerSampleTObject()
	 * @generated
	 */
	int BITS_PER_SAMPLE_TOBJECT = 101;

	/**
	 * The meta object id for the '<em>Color Space TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getColorSpaceTObject()
	 * @generated
	 */
	int COLOR_SPACE_TOBJECT = 102;

	/**
	 * The meta object id for the '<em>Compression TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.CompressionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCompressionTObject()
	 * @generated
	 */
	int COMPRESSION_TOBJECT = 103;

	/**
	 * The meta object id for the '<em>Contrast TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ContrastT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getContrastTObject()
	 * @generated
	 */
	int CONTRAST_TOBJECT = 104;

	/**
	 * The meta object id for the '<em>Custom Rendered TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getCustomRenderedTObject()
	 * @generated
	 */
	int CUSTOM_RENDERED_TOBJECT = 105;

	/**
	 * The meta object id for the '<em>Datatype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getDatatypeTypeObject()
	 * @generated
	 */
	int DATATYPE_TYPE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Exposure Mode TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureModeTObject()
	 * @generated
	 */
	int EXPOSURE_MODE_TOBJECT = 107;

	/**
	 * The meta object id for the '<em>Exposure Program TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getExposureProgramTObject()
	 * @generated
	 */
	int EXPOSURE_PROGRAM_TOBJECT = 108;

	/**
	 * The meta object id for the '<em>File Source TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFileSourceTObject()
	 * @generated
	 */
	int FILE_SOURCE_TOBJECT = 109;

	/**
	 * The meta object id for the '<em>Flash Mode TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFlashModeTObject()
	 * @generated
	 */
	int FLASH_MODE_TOBJECT = 110;

	/**
	 * The meta object id for the '<em>Flash Return TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getFlashReturnTObject()
	 * @generated
	 */
	int FLASH_RETURN_TOBJECT = 111;

	/**
	 * The meta object id for the '<em>Gain Control TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GainControlT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGainControlTObject()
	 * @generated
	 */
	int GAIN_CONTROL_TOBJECT = 112;

	/**
	 * The meta object id for the '<em>Gps Altitude Ref TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsAltitudeRefTObject()
	 * @generated
	 */
	int GPS_ALTITUDE_REF_TOBJECT = 113;

	/**
	 * The meta object id for the '<em>Gps Bearing T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsBearingT()
	 * @generated
	 */
	int GPS_BEARING_T = 114;

	/**
	 * The meta object id for the '<em>Gps Bearing TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsBearingTObject()
	 * @generated
	 */
	int GPS_BEARING_TOBJECT = 115;

	/**
	 * The meta object id for the '<em>Gps Differential TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDifferentialTObject()
	 * @generated
	 */
	int GPS_DIFFERENTIAL_TOBJECT = 116;

	/**
	 * The meta object id for the '<em>Gps Direction TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDirectionTObject()
	 * @generated
	 */
	int GPS_DIRECTION_TOBJECT = 117;

	/**
	 * The meta object id for the '<em>Gps Distance Ref TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsDistanceRefTObject()
	 * @generated
	 */
	int GPS_DISTANCE_REF_TOBJECT = 118;

	/**
	 * The meta object id for the '<em>Gps Latitude Ref TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeRefTObject()
	 * @generated
	 */
	int GPS_LATITUDE_REF_TOBJECT = 119;

	/**
	 * The meta object id for the '<em>Gps Latitude T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeT()
	 * @generated
	 */
	int GPS_LATITUDE_T = 120;

	/**
	 * The meta object id for the '<em>Gps Latitude TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLatitudeTObject()
	 * @generated
	 */
	int GPS_LATITUDE_TOBJECT = 121;

	/**
	 * The meta object id for the '<em>Gps Longitude Ref TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeRefTObject()
	 * @generated
	 */
	int GPS_LONGITUDE_REF_TOBJECT = 122;

	/**
	 * The meta object id for the '<em>Gps Longitude T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeT()
	 * @generated
	 */
	int GPS_LONGITUDE_T = 123;

	/**
	 * The meta object id for the '<em>Gps Longitude TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsLongitudeTObject()
	 * @generated
	 */
	int GPS_LONGITUDE_TOBJECT = 124;

	/**
	 * The meta object id for the '<em>Gps Measure Mode TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsMeasureModeTObject()
	 * @generated
	 */
	int GPS_MEASURE_MODE_TOBJECT = 125;

	/**
	 * The meta object id for the '<em>Gps Speed Ref TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsSpeedRefTObject()
	 * @generated
	 */
	int GPS_SPEED_REF_TOBJECT = 126;

	/**
	 * The meta object id for the '<em>Gps Status TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getGpsStatusTObject()
	 * @generated
	 */
	int GPS_STATUS_TOBJECT = 127;

	/**
	 * The meta object id for the '<em>Interoperability TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getInteroperabilityTObject()
	 * @generated
	 */
	int INTEROPERABILITY_TOBJECT = 128;

	/**
	 * The meta object id for the '<em>Light Source TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getLightSourceTObject()
	 * @generated
	 */
	int LIGHT_SOURCE_TOBJECT = 129;

	/**
	 * The meta object id for the '<em>Metering Mode TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getMeteringModeTObject()
	 * @generated
	 */
	int METERING_MODE_TOBJECT = 130;

	/**
	 * The meta object id for the '<em>Non Negative Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getNonNegativeReal()
	 * @generated
	 */
	int NON_NEGATIVE_REAL = 131;

	/**
	 * The meta object id for the '<em>Non Negative Real Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getNonNegativeRealObject()
	 * @generated
	 */
	int NON_NEGATIVE_REAL_OBJECT = 132;

	/**
	 * The meta object id for the '<em>Orientation TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.OrientationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getOrientationTObject()
	 * @generated
	 */
	int ORIENTATION_TOBJECT = 133;

	/**
	 * The meta object id for the '<em>Photometric Interpretation TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPhotometricInterpretationTObject()
	 * @generated
	 */
	int PHOTOMETRIC_INTERPRETATION_TOBJECT = 134;

	/**
	 * The meta object id for the '<em>Planar Configuration TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getPlanarConfigurationTObject()
	 * @generated
	 */
	int PLANAR_CONFIGURATION_TOBJECT = 135;

	/**
	 * The meta object id for the '<em>Resolution TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getResolutionTObject()
	 * @generated
	 */
	int RESOLUTION_TOBJECT = 136;

	/**
	 * The meta object id for the '<em>Saturation TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SaturationT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSaturationTObject()
	 * @generated
	 */
	int SATURATION_TOBJECT = 137;

	/**
	 * The meta object id for the '<em>Scene Capture TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSceneCaptureTObject()
	 * @generated
	 */
	int SCENE_CAPTURE_TOBJECT = 138;

	/**
	 * The meta object id for the '<em>Sensing Method TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSensingMethodTObject()
	 * @generated
	 */
	int SENSING_METHOD_TOBJECT = 139;

	/**
	 * The meta object id for the '<em>Subject Distance Range TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getSubjectDistanceRangeTObject()
	 * @generated
	 */
	int SUBJECT_DISTANCE_RANGE_TOBJECT = 140;

	/**
	 * The meta object id for the '<em>Uuid T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getUuidT()
	 * @generated
	 */
	int UUID_T = 141;

	/**
	 * The meta object id for the '<em>White Balance TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getWhiteBalanceTObject()
	 * @generated
	 */
	int WHITE_BALANCE_TOBJECT = 142;

	/**
	 * The meta object id for the '<em>YCb Cr Positioning TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrPositioningTObject()
	 * @generated
	 */
	int YCB_CR_POSITIONING_TOBJECT = 143;

	/**
	 * The meta object id for the '<em>YCb Cr Sub Sampling TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYCbCrSubSamplingTObject()
	 * @generated
	 */
	int YCB_CR_SUB_SAMPLING_TOBJECT = 144;

	/**
	 * The meta object id for the '<em>Yes No TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl#getYesNoTObject()
	 * @generated
	 */
	int YES_NO_TOBJECT = 145;


	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleType <em>Bits Per Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bits Per Sample Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleType
	 * @generated
	 */
	EClass getBitsPerSampleType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleType#getValue()
	 * @see #getBitsPerSampleType()
	 * @generated
	 */
	EAttribute getBitsPerSampleType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleType#getTag()
	 * @see #getBitsPerSampleType()
	 * @generated
	 */
	EAttribute getBitsPerSampleType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.Chromaticity <em>Chromaticity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chromaticity</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.Chromaticity
	 * @generated
	 */
	EClass getChromaticity();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.Chromaticity#getX()
	 * @see #getChromaticity()
	 * @generated
	 */
	EAttribute getChromaticity_X();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.Chromaticity#getY()
	 * @see #getChromaticity()
	 * @generated
	 */
	EAttribute getChromaticity_Y();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceType <em>Color Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Space Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceType
	 * @generated
	 */
	EClass getColorSpaceType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceType#getValue()
	 * @see #getColorSpaceType()
	 * @generated
	 */
	EAttribute getColorSpaceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceType#getTag()
	 * @see #getColorSpaceType()
	 * @generated
	 */
	EAttribute getColorSpaceType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.CompressionType <em>Compression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compression Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionType
	 * @generated
	 */
	EClass getCompressionType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.CompressionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionType#getValue()
	 * @see #getCompressionType()
	 * @generated
	 */
	EAttribute getCompressionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.CompressionType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionType#getTag()
	 * @see #getCompressionType()
	 * @generated
	 */
	EAttribute getCompressionType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ContrastType <em>Contrast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contrast Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastType
	 * @generated
	 */
	EClass getContrastType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ContrastType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastType#getValue()
	 * @see #getContrastType()
	 * @generated
	 */
	EAttribute getContrastType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ContrastType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastType#getTag()
	 * @see #getContrastType()
	 * @generated
	 */
	EAttribute getContrastType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedType <em>Custom Rendered Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Rendered Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedType
	 * @generated
	 */
	EClass getCustomRenderedType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedType#getValue()
	 * @see #getCustomRenderedType()
	 * @generated
	 */
	EAttribute getCustomRenderedType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedType#getTag()
	 * @see #getCustomRenderedType()
	 * @generated
	 */
	EAttribute getCustomRenderedType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateTimeType
	 * @generated
	 */
	EClass getDateTimeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.DateTimeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateTimeType#getValue()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.DateTimeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateTimeType#getTag()
	 * @see #getDateTimeType()
	 * @generated
	 */
	EAttribute getDateTimeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.DateType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateType#getValue()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.DateType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DateType#getTag()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot#getExifMetadata <em>Exif Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Metadata</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot#getExifMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExifMetadata();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType <em>Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ifd Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType
	 * @generated
	 */
	EClass getExifIfdType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifVersion <em>Exif Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Version</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifVersion()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExifVersion();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashpixVersion <em>Flashpix Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flashpix Version</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashpixVersion()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FlashpixVersion();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getColorSpace <em>Color Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color Space</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getColorSpace()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ColorSpace();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getComponentsConfiguration <em>Components Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Components Configuration</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getComponentsConfiguration()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ComponentsConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCompressedBitsPerPixel <em>Compressed Bits Per Pixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compressed Bits Per Pixel</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getCompressedBitsPerPixel()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_CompressedBitsPerPixel();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelXDimension <em>Pixel XDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixel XDimension</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelXDimension()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_PixelXDimension();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelYDimension <em>Pixel YDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pixel YDimension</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getPixelYDimension()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_PixelYDimension();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMakerNote <em>Maker Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maker Note</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getMakerNote()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_MakerNote();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getUserComment <em>User Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Comment</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getUserComment()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_UserComment();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getRelatedSoundFile <em>Related Sound File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Related Sound File</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getRelatedSoundFile()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_RelatedSoundFile();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeOriginal <em>Date Time Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Original</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeOriginal()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_DateTimeOriginal();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeDigitized <em>Date Time Digitized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Digitized</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getDateTimeDigitized()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_DateTimeDigitized();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTime <em>Sub Sec Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Sec Time</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTime()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubSecTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeOriginal <em>Sub Sec Time Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Sec Time Original</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeOriginal()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubSecTimeOriginal();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeDigitized <em>Sub Sec Time Digitized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Sec Time Digitized</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubSecTimeDigitized()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubSecTimeDigitized();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureTime <em>Exposure Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposure Time</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureTime()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExposureTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFNumber <em>FNumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FNumber</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFNumber()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureProgram <em>Exposure Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposure Program</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureProgram()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExposureProgram();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpectralSensitivity <em>Spectral Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spectral Sensitivity</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpectralSensitivity()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SpectralSensitivity();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getISOSpeedRatings <em>ISO Speed Ratings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ISO Speed Ratings</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getISOSpeedRatings()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ISOSpeedRatings();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getOECF <em>OECF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OECF</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getOECF()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_OECF();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getShutterSpeedValue <em>Shutter Speed Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shutter Speed Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getShutterSpeedValue()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ShutterSpeedValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getApertureValue <em>Aperture Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aperture Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getApertureValue()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ApertureValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getBrightnessValue <em>Brightness Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Brightness Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getBrightnessValue()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_BrightnessValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureBiasValue <em>Exposure Bias Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposure Bias Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureBiasValue()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExposureBiasValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMaxApertureValue <em>Max Aperture Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Aperture Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getMaxApertureValue()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_MaxApertureValue();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistance <em>Subject Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Distance</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistance()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubjectDistance();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getMeteringMode <em>Metering Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metering Mode</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getMeteringMode()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_MeteringMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getLightSource <em>Light Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Light Source</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getLightSource()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_LightSource();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlash <em>Flash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flash</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlash()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_Flash();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLength <em>Focal Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focal Length</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLength()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FocalLength();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectArea <em>Subject Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Area</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectArea()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubjectArea();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashEnergy <em>Flash Energy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flash Energy</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFlashEnergy()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FlashEnergy();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpatialFrequencyResponse <em>Spatial Frequency Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Frequency Response</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSpatialFrequencyResponse()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SpatialFrequencyResponse();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneXResolution <em>Focal Plane XResolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focal Plane XResolution</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneXResolution()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FocalPlaneXResolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneYResolution <em>Focal Plane YResolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focal Plane YResolution</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneYResolution()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FocalPlaneYResolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneResolutionUnit <em>Focal Plane Resolution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focal Plane Resolution Unit</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalPlaneResolutionUnit()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FocalPlaneResolutionUnit();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectLocation <em>Subject Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Location</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectLocation()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubjectLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureIndex <em>Exposure Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposure Index</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureIndex()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExposureIndex();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSensingMethod <em>Sensing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sensing Method</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSensingMethod()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SensingMethod();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFileSource <em>File Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Source</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFileSource()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FileSource();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneType <em>Scene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneType()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SceneType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCFAPattern <em>CFA Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CFA Pattern</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getCFAPattern()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_CFAPattern();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getCustomRendered <em>Custom Rendered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Rendered</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getCustomRendered()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_CustomRendered();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureMode <em>Exposure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exposure Mode</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExposureMode()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExposureMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getWhiteBalance <em>White Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Balance</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getWhiteBalance()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_WhiteBalance();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDigitalZoomRatio <em>Digital Zoom Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Digital Zoom Ratio</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getDigitalZoomRatio()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_DigitalZoomRatio();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLengthIn35mmFilm <em>Focal Length In35mm Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Focal Length In35mm Film</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getFocalLengthIn35mmFilm()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_FocalLengthIn35mmFilm();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneCaptureType <em>Scene Capture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene Capture Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSceneCaptureType()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SceneCaptureType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGainControl <em>Gain Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gain Control</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getGainControl()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_GainControl();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getContrast <em>Contrast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contrast</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getContrast()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_Contrast();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSaturation <em>Saturation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Saturation</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSaturation()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_Saturation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSharpness <em>Sharpness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sharpness</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSharpness()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_Sharpness();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getDeviceSettingDescription <em>Device Setting Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device Setting Description</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getDeviceSettingDescription()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_DeviceSettingDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistanceRange <em>Subject Distance Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject Distance Range</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getSubjectDistanceRange()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_SubjectDistanceRange();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getImageUniqueID <em>Image Unique ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Unique ID</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getImageUniqueID()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ImageUniqueID();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getGamma <em>Gamma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gamma</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getGamma()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_Gamma();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField1 <em>Exif Field1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Field1</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField1()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExifField1();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField2 <em>Exif Field2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Field2</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField2()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExifField2();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField3 <em>Exif Field3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Field3</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getExifField3()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EReference getExifIfdType_ExifField3();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType#getTag()
	 * @see #getExifIfdType()
	 * @generated
	 */
	EAttribute getExifIfdType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType
	 * @generated
	 */
	EClass getExifMetadataType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getTiffIfd <em>Tiff Ifd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiff Ifd</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType#getTiffIfd()
	 * @see #getExifMetadataType()
	 * @generated
	 */
	EReference getExifMetadataType_TiffIfd();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getExifIfd <em>Exif Ifd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exif Ifd</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType#getExifIfd()
	 * @see #getExifMetadataType()
	 * @generated
	 */
	EReference getExifMetadataType_ExifIfd();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getGpsIfd <em>Gps Ifd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gps Ifd</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType#getGpsIfd()
	 * @see #getExifMetadataType()
	 * @generated
	 */
	EReference getExifMetadataType_GpsIfd();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType#getInteroperabilityIfd <em>Interoperability Ifd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interoperability Ifd</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType#getInteroperabilityIfd()
	 * @see #getExifMetadataType()
	 * @generated
	 */
	EReference getExifMetadataType_InteroperabilityIfd();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ExposureModeType <em>Exposure Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposure Mode Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeType
	 * @generated
	 */
	EClass getExposureModeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ExposureModeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeType#getValue()
	 * @see #getExposureModeType()
	 * @generated
	 */
	EAttribute getExposureModeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ExposureModeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeType#getTag()
	 * @see #getExposureModeType()
	 * @generated
	 */
	EAttribute getExposureModeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramType <em>Exposure Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposure Program Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramType
	 * @generated
	 */
	EClass getExposureProgramType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramType#getValue()
	 * @see #getExposureProgramType()
	 * @generated
	 */
	EAttribute getExposureProgramType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramType#getTag()
	 * @see #getExposureProgramType()
	 * @generated
	 */
	EAttribute getExposureProgramType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.FileSourceType <em>File Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Source Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceType
	 * @generated
	 */
	EClass getFileSourceType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FileSourceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceType#getValue()
	 * @see #getFileSourceType()
	 * @generated
	 */
	EAttribute getFileSourceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FileSourceType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceType#getTag()
	 * @see #getFileSourceType()
	 * @generated
	 */
	EAttribute getFileSourceType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.FlashType <em>Flash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flash Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType
	 * @generated
	 */
	EClass getFlashType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFired <em>Fired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fired</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getFired()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_Fired();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getReturn()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_Return();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getMode()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_Mode();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getFunction()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_Function();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction <em>Red Eye Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red Eye Reduction</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_RedEyeReduction();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.FlashType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType#getTag()
	 * @see #getFlashType()
	 * @generated
	 */
	EAttribute getFlashType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GainControlType <em>Gain Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gain Control Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlType
	 * @generated
	 */
	EClass getGainControlType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GainControlType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlType#getValue()
	 * @see #getGainControlType()
	 * @generated
	 */
	EAttribute getGainControlType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GainControlType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlType#getTag()
	 * @see #getGainControlType()
	 * @generated
	 */
	EAttribute getGainControlType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType <em>Gps Altitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Altitude Ref Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType
	 * @generated
	 */
	EClass getGpsAltitudeRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType#getValue()
	 * @see #getGpsAltitudeRefType()
	 * @generated
	 */
	EAttribute getGpsAltitudeRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType#getTag()
	 * @see #getGpsAltitudeRefType()
	 * @generated
	 */
	EAttribute getGpsAltitudeRefType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsBearingType <em>Gps Bearing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Bearing Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsBearingType
	 * @generated
	 */
	EClass getGpsBearingType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsBearingType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsBearingType#getValue()
	 * @see #getGpsBearingType()
	 * @generated
	 */
	EAttribute getGpsBearingType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsBearingType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsBearingType#getTag()
	 * @see #getGpsBearingType()
	 * @generated
	 */
	EAttribute getGpsBearingType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialType <em>Gps Differential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Differential Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialType
	 * @generated
	 */
	EClass getGpsDifferentialType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialType#getValue()
	 * @see #getGpsDifferentialType()
	 * @generated
	 */
	EAttribute getGpsDifferentialType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialType#getTag()
	 * @see #getGpsDifferentialType()
	 * @generated
	 */
	EAttribute getGpsDifferentialType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionType <em>Gps Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Direction Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionType
	 * @generated
	 */
	EClass getGpsDirectionType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionType#getValue()
	 * @see #getGpsDirectionType()
	 * @generated
	 */
	EAttribute getGpsDirectionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionType#getTag()
	 * @see #getGpsDirectionType()
	 * @generated
	 */
	EAttribute getGpsDirectionType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefType <em>Gps Distance Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Distance Ref Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefType
	 * @generated
	 */
	EClass getGpsDistanceRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefType#getValue()
	 * @see #getGpsDistanceRefType()
	 * @generated
	 */
	EAttribute getGpsDistanceRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefType#getTag()
	 * @see #getGpsDistanceRefType()
	 * @generated
	 */
	EAttribute getGpsDistanceRefType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType <em>Gps Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Ifd Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType
	 * @generated
	 */
	EClass getGpsIfdType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSVersionID <em>GPS Version ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Version ID</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSVersionID()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSVersionID();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLatitudeRef <em>GPS Latitude Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Latitude Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLatitudeRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSLatitudeRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLatitude <em>GPS Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Latitude</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLatitude()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSLatitude();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLongitudeRef <em>GPS Longitude Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Longitude Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLongitudeRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSLongitudeRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLongitude <em>GPS Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Longitude</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSLongitude()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSLongitude();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAltitudeRef <em>GPS Altitude Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Altitude Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAltitudeRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSAltitudeRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAltitude <em>GPS Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Altitude</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAltitude()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSAltitude();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTimeStamp <em>GPS Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Time Stamp</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTimeStamp()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSTimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSatellites <em>GPS Satellites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Satellites</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSatellites()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSSatellites();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSStatus <em>GPS Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Status</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSStatus()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSStatus();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSMeasureMode <em>GPS Measure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Measure Mode</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSMeasureMode()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSMeasureMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDOP <em>GPSDOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPSDOP</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDOP()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDOP();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSpeedRef <em>GPS Speed Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Speed Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSpeedRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSSpeedRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSpeed <em>GPS Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Speed</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSSpeed()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSSpeed();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTrackRef <em>GPS Track Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Track Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTrackRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSTrackRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTrack <em>GPS Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Track</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSTrack()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSTrack();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSImgDirectionRef <em>GPS Img Direction Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Img Direction Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSImgDirectionRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSImgDirectionRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSImgDirection <em>GPS Img Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Img Direction</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSImgDirection()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSImgDirection();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSMapDatum <em>GPS Map Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Map Datum</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSMapDatum()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSMapDatum();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLatitudeRef <em>GPS Dest Latitude Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Latitude Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLatitudeRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestLatitudeRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLatitude <em>GPS Dest Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Latitude</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLatitude()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestLatitude();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLongitudeRef <em>GPS Dest Longitude Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Longitude Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLongitudeRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestLongitudeRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLongitude <em>GPS Dest Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Longitude</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestLongitude()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestLongitude();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestBearingRef <em>GPS Dest Bearing Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Bearing Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestBearingRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestBearingRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestBearing <em>GPS Dest Bearing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Bearing</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestBearing()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestBearing();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestDistanceRef <em>GPS Dest Distance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Distance Ref</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestDistanceRef()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestDistanceRef();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestDistance <em>GPS Dest Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Dest Distance</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDestDistance()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDestDistance();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSProcessingMethod <em>GPS Processing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Processing Method</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSProcessingMethod()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSProcessingMethod();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAreaInformation <em>GPS Area Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Area Information</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSAreaInformation()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSAreaInformation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDateStamp <em>GPS Date Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Date Stamp</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDateStamp()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDateStamp();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDifferential <em>GPS Differential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Differential</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSDifferential()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSDifferential();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField1 <em>GPS Field1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Field1</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField1()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSField1();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField2 <em>GPS Field2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Field2</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField2()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSField2();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField3 <em>GPS Field3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>GPS Field3</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getGPSField3()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EReference getGpsIfdType_GPSField3();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType#getTag()
	 * @see #getGpsIfdType()
	 * @generated
	 */
	EAttribute getGpsIfdType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType <em>Gps Latitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Latitude Ref Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType
	 * @generated
	 */
	EClass getGpsLatitudeRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType#getValue()
	 * @see #getGpsLatitudeRefType()
	 * @generated
	 */
	EAttribute getGpsLatitudeRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType#getTag()
	 * @see #getGpsLatitudeRefType()
	 * @generated
	 */
	EAttribute getGpsLatitudeRefType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeType <em>Gps Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Latitude Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeType
	 * @generated
	 */
	EClass getGpsLatitudeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeType#getValue()
	 * @see #getGpsLatitudeType()
	 * @generated
	 */
	EAttribute getGpsLatitudeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeType#getTag()
	 * @see #getGpsLatitudeType()
	 * @generated
	 */
	EAttribute getGpsLatitudeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType <em>Gps Longitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Longitude Ref Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType
	 * @generated
	 */
	EClass getGpsLongitudeRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType#getValue()
	 * @see #getGpsLongitudeRefType()
	 * @generated
	 */
	EAttribute getGpsLongitudeRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType#getTag()
	 * @see #getGpsLongitudeRefType()
	 * @generated
	 */
	EAttribute getGpsLongitudeRefType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeType <em>Gps Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Longitude Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeType
	 * @generated
	 */
	EClass getGpsLongitudeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeType#getValue()
	 * @see #getGpsLongitudeType()
	 * @generated
	 */
	EAttribute getGpsLongitudeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeType#getTag()
	 * @see #getGpsLongitudeType()
	 * @generated
	 */
	EAttribute getGpsLongitudeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeType <em>Gps Measure Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Measure Mode Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeType
	 * @generated
	 */
	EClass getGpsMeasureModeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeType#getValue()
	 * @see #getGpsMeasureModeType()
	 * @generated
	 */
	EAttribute getGpsMeasureModeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeType#getTag()
	 * @see #getGpsMeasureModeType()
	 * @generated
	 */
	EAttribute getGpsMeasureModeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefType <em>Gps Speed Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Speed Ref Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefType
	 * @generated
	 */
	EClass getGpsSpeedRefType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefType#getValue()
	 * @see #getGpsSpeedRefType()
	 * @generated
	 */
	EAttribute getGpsSpeedRefType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefType#getTag()
	 * @see #getGpsSpeedRefType()
	 * @generated
	 */
	EAttribute getGpsSpeedRefType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.GpsStatusType <em>Gps Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps Status Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusType
	 * @generated
	 */
	EClass getGpsStatusType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsStatusType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusType#getValue()
	 * @see #getGpsStatusType()
	 * @generated
	 */
	EAttribute getGpsStatusType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.GpsStatusType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusType#getTag()
	 * @see #getGpsStatusType()
	 * @generated
	 */
	EAttribute getGpsStatusType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType <em>Interoperability Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interoperability Ifd Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType
	 * @generated
	 */
	EClass getInteroperabilityIfdType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType#getInteroperabilityIndex <em>Interoperability Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interoperability Index</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType#getInteroperabilityIndex()
	 * @see #getInteroperabilityIfdType()
	 * @generated
	 */
	EReference getInteroperabilityIfdType_InteroperabilityIndex();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType#getTag()
	 * @see #getInteroperabilityIfdType()
	 * @generated
	 */
	EAttribute getInteroperabilityIfdType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityType <em>Interoperability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interoperability Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityType
	 * @generated
	 */
	EClass getInteroperabilityType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityType#getValue()
	 * @see #getInteroperabilityType()
	 * @generated
	 */
	EAttribute getInteroperabilityType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityType#getTag()
	 * @see #getInteroperabilityType()
	 * @generated
	 */
	EAttribute getInteroperabilityType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.LightSourceType <em>Light Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Source Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceType
	 * @generated
	 */
	EClass getLightSourceType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.LightSourceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceType#getValue()
	 * @see #getLightSourceType()
	 * @generated
	 */
	EAttribute getLightSourceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.LightSourceType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceType#getTag()
	 * @see #getLightSourceType()
	 * @generated
	 */
	EAttribute getLightSourceType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.MeteringModeType <em>Metering Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metering Mode Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeType
	 * @generated
	 */
	EClass getMeteringModeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.MeteringModeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeType#getValue()
	 * @see #getMeteringModeType()
	 * @generated
	 */
	EAttribute getMeteringModeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.MeteringModeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeType#getTag()
	 * @see #getMeteringModeType()
	 * @generated
	 */
	EAttribute getMeteringModeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType <em>Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Integer Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType
	 * @generated
	 */
	EClass getNonNegativeIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType#getValue()
	 * @see #getNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getNonNegativeIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType#getTag()
	 * @see #getNonNegativeIntegerType()
	 * @generated
	 */
	EAttribute getNonNegativeIntegerType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.NonNegativeRealType <em>Non Negative Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Negative Real Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeRealType
	 * @generated
	 */
	EClass getNonNegativeRealType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.NonNegativeRealType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeRealType#getValue()
	 * @see #getNonNegativeRealType()
	 * @generated
	 */
	EAttribute getNonNegativeRealType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.NonNegativeRealType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeRealType#getTag()
	 * @see #getNonNegativeRealType()
	 * @generated
	 */
	EAttribute getNonNegativeRealType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationType
	 * @generated
	 */
	EClass getOrientationType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.OrientationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationType#getValue()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.OrientationType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationType#getTag()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType <em>Photometric Interpretation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photometric Interpretation Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType
	 * @generated
	 */
	EClass getPhotometricInterpretationType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType#getValue()
	 * @see #getPhotometricInterpretationType()
	 * @generated
	 */
	EAttribute getPhotometricInterpretationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType#getTag()
	 * @see #getPhotometricInterpretationType()
	 * @generated
	 */
	EAttribute getPhotometricInterpretationType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationType <em>Planar Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Planar Configuration Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationType
	 * @generated
	 */
	EClass getPlanarConfigurationType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationType#getValue()
	 * @see #getPlanarConfigurationType()
	 * @generated
	 */
	EAttribute getPlanarConfigurationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationType#getTag()
	 * @see #getPlanarConfigurationType()
	 * @generated
	 */
	EAttribute getPlanarConfigurationType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.PositiveIntegerType <em>Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive Integer Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PositiveIntegerType
	 * @generated
	 */
	EClass getPositiveIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PositiveIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PositiveIntegerType#getValue()
	 * @see #getPositiveIntegerType()
	 * @generated
	 */
	EAttribute getPositiveIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PositiveIntegerType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PositiveIntegerType#getTag()
	 * @see #getPositiveIntegerType()
	 * @generated
	 */
	EAttribute getPositiveIntegerType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType <em>Primary Chromaticities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Chromaticities Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType
	 * @generated
	 */
	EClass getPrimaryChromaticitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor1 <em>Color1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color1</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor1()
	 * @see #getPrimaryChromaticitiesType()
	 * @generated
	 */
	EReference getPrimaryChromaticitiesType_Color1();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor2 <em>Color2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color2</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor2()
	 * @see #getPrimaryChromaticitiesType()
	 * @generated
	 */
	EReference getPrimaryChromaticitiesType_Color2();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor3 <em>Color3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Color3</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor3()
	 * @see #getPrimaryChromaticitiesType()
	 * @generated
	 */
	EReference getPrimaryChromaticitiesType_Color3();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getTag()
	 * @see #getPrimaryChromaticitiesType()
	 * @generated
	 */
	EAttribute getPrimaryChromaticitiesType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RealType
	 * @generated
	 */
	EClass getRealType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.RealType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RealType#getValue()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.RealType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RealType#getTag()
	 * @see #getRealType()
	 * @generated
	 */
	EAttribute getRealType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.RepeatedFieldType <em>Repeated Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated Field Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RepeatedFieldType
	 * @generated
	 */
	EClass getRepeatedFieldType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hsveclipse.phototoolkit.exif.RepeatedFieldType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RepeatedFieldType#getField()
	 * @see #getRepeatedFieldType()
	 * @generated
	 */
	EReference getRepeatedFieldType_Field();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.RepeatedFieldType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.RepeatedFieldType#getTag()
	 * @see #getRepeatedFieldType()
	 * @generated
	 */
	EAttribute getRepeatedFieldType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.ResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolution Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionType
	 * @generated
	 */
	EClass getResolutionType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ResolutionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionType#getValue()
	 * @see #getResolutionType()
	 * @generated
	 */
	EAttribute getResolutionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.ResolutionType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionType#getTag()
	 * @see #getResolutionType()
	 * @generated
	 */
	EAttribute getResolutionType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SaturationType <em>Saturation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saturation Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationType
	 * @generated
	 */
	EClass getSaturationType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SaturationType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationType#getValue()
	 * @see #getSaturationType()
	 * @generated
	 */
	EAttribute getSaturationType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SaturationType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationType#getTag()
	 * @see #getSaturationType()
	 * @generated
	 */
	EAttribute getSaturationType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureType <em>Scene Capture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Capture Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureType
	 * @generated
	 */
	EClass getSceneCaptureType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureType#getValue()
	 * @see #getSceneCaptureType()
	 * @generated
	 */
	EAttribute getSceneCaptureType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureType#getTag()
	 * @see #getSceneCaptureType()
	 * @generated
	 */
	EAttribute getSceneCaptureType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SensingMethodType <em>Sensing Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensing Method Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodType
	 * @generated
	 */
	EClass getSensingMethodType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SensingMethodType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodType#getValue()
	 * @see #getSensingMethodType()
	 * @generated
	 */
	EAttribute getSensingMethodType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SensingMethodType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodType#getTag()
	 * @see #getSensingMethodType()
	 * @generated
	 */
	EAttribute getSensingMethodType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SharpnessType <em>Sharpness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharpness Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SharpnessType
	 * @generated
	 */
	EClass getSharpnessType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SharpnessType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SharpnessType#getValue()
	 * @see #getSharpnessType()
	 * @generated
	 */
	EAttribute getSharpnessType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SharpnessType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SharpnessType#getTag()
	 * @see #getSharpnessType()
	 * @generated
	 */
	EAttribute getSharpnessType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT <em>Single Field T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Field T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldT
	 * @generated
	 */
	EClass getSingleFieldT();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldT#getName()
	 * @see #getSingleFieldT()
	 * @generated
	 */
	EAttribute getSingleFieldT_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldT#getValue()
	 * @see #getSingleFieldT()
	 * @generated
	 */
	EAttribute getSingleFieldT_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datatype</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype()
	 * @see #getSingleFieldT()
	 * @generated
	 */
	EAttribute getSingleFieldT_Datatype();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SingleFieldType <em>Single Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Field Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldType
	 * @generated
	 */
	EClass getSingleFieldType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SingleFieldType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldType#getTag()
	 * @see #getSingleFieldType()
	 * @generated
	 */
	EAttribute getSingleFieldType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StringType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StringType#getValue()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StringType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StringType#getTag()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.StripByteCountsType <em>Strip Byte Counts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strip Byte Counts Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountsType
	 * @generated
	 */
	EClass getStripByteCountsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hsveclipse.phototoolkit.exif.StripByteCountsType#getStripByteCount <em>Strip Byte Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strip Byte Count</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountsType#getStripByteCount()
	 * @see #getStripByteCountsType()
	 * @generated
	 */
	EReference getStripByteCountsType_StripByteCount();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripByteCountsType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountsType#getTag()
	 * @see #getStripByteCountsType()
	 * @generated
	 */
	EAttribute getStripByteCountsType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.StripByteCountType <em>Strip Byte Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strip Byte Count Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountType
	 * @generated
	 */
	EClass getStripByteCountType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripByteCountType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountType#getIndex()
	 * @see #getStripByteCountType()
	 * @generated
	 */
	EAttribute getStripByteCountType_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripByteCountType#getBytes <em>Bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bytes</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountType#getBytes()
	 * @see #getStripByteCountType()
	 * @generated
	 */
	EAttribute getStripByteCountType_Bytes();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.StripOffsetsType <em>Strip Offsets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strip Offsets Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetsType
	 * @generated
	 */
	EClass getStripOffsetsType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hsveclipse.phototoolkit.exif.StripOffsetsType#getStripOffset <em>Strip Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strip Offset</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetsType#getStripOffset()
	 * @see #getStripOffsetsType()
	 * @generated
	 */
	EReference getStripOffsetsType_StripOffset();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripOffsetsType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetsType#getTag()
	 * @see #getStripOffsetsType()
	 * @generated
	 */
	EAttribute getStripOffsetsType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType <em>Strip Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strip Offset Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetType
	 * @generated
	 */
	EClass getStripOffsetType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetType#getIndex()
	 * @see #getStripOffsetType()
	 * @generated
	 */
	EAttribute getStripOffsetType_Index();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetType#getOffset()
	 * @see #getStripOffsetType()
	 * @generated
	 */
	EAttribute getStripOffsetType_Offset();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType <em>Subject Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Area Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectAreaType
	 * @generated
	 */
	EClass getSubjectAreaType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectAreaType#getDiameter()
	 * @see #getSubjectAreaType()
	 * @generated
	 */
	EAttribute getSubjectAreaType_Diameter();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectAreaType#getWidth()
	 * @see #getSubjectAreaType()
	 * @generated
	 */
	EAttribute getSubjectAreaType_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectAreaType#getHeight()
	 * @see #getSubjectAreaType()
	 * @generated
	 */
	EAttribute getSubjectAreaType_Height();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType <em>Subject Distance Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Distance Range Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType
	 * @generated
	 */
	EClass getSubjectDistanceRangeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType#getValue()
	 * @see #getSubjectDistanceRangeType()
	 * @generated
	 */
	EAttribute getSubjectDistanceRangeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType#getTag()
	 * @see #getSubjectDistanceRangeType()
	 * @generated
	 */
	EAttribute getSubjectDistanceRangeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.SubjectLocationType <em>Subject Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Location Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectLocationType
	 * @generated
	 */
	EClass getSubjectLocationType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectLocationType#getCenterX <em>Center X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center X</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectLocationType#getCenterX()
	 * @see #getSubjectLocationType()
	 * @generated
	 */
	EAttribute getSubjectLocationType_CenterX();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectLocationType#getCenterY <em>Center Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center Y</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectLocationType#getCenterY()
	 * @see #getSubjectLocationType()
	 * @generated
	 */
	EAttribute getSubjectLocationType_CenterY();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.SubjectLocationType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectLocationType#getTag()
	 * @see #getSubjectLocationType()
	 * @generated
	 */
	EAttribute getSubjectLocationType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType <em>Tiff Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tiff Ifd Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType
	 * @generated
	 */
	EClass getTiffIfdType();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageWidth <em>Image Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Width</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageWidth()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_ImageWidth();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageLength <em>Image Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Length</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageLength()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_ImageLength();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getBitsPerSample <em>Bits Per Sample</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bits Per Sample</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getBitsPerSample()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_BitsPerSample();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCompression <em>Compression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compression</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getCompression()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Compression();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPhotometricInterpretation <em>Photometric Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Photometric Interpretation</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getPhotometricInterpretation()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_PhotometricInterpretation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getOrientation()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSamplesPerPixel <em>Samples Per Pixel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Samples Per Pixel</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getSamplesPerPixel()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_SamplesPerPixel();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPlanarConfiguration <em>Planar Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planar Configuration</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getPlanarConfiguration()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_PlanarConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrSubSampling <em>YCb Cr Sub Sampling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YCb Cr Sub Sampling</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrSubSampling()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_YCbCrSubSampling();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrPositioning <em>YCb Cr Positioning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YCb Cr Positioning</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrPositioning()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_YCbCrPositioning();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getXResolution <em>XResolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XResolution</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getXResolution()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_XResolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYResolution <em>YResolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YResolution</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getYResolution()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_YResolution();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getResolutionUnit <em>Resolution Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resolution Unit</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getResolutionUnit()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_ResolutionUnit();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripOffsets <em>Strip Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strip Offsets</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripOffsets()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_StripOffsets();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getRowsPerStrip <em>Rows Per Strip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rows Per Strip</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getRowsPerStrip()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_RowsPerStrip();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripByteCounts <em>Strip Byte Counts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strip Byte Counts</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripByteCounts()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_StripByteCounts();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormat <em>JPEG Inter Change Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>JPEG Inter Change Format</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormat()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_JPEGInterChangeFormat();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormatLength <em>JPEG Inter Change Format Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>JPEG Inter Change Format Length</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormatLength()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_JPEGInterChangeFormatLength();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTransferFunction <em>Transfer Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transfer Function</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getTransferFunction()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_TransferFunction();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getWhitePoint <em>White Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>White Point</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getWhitePoint()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_WhitePoint();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPrimaryChromaticities <em>Primary Chromaticities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primary Chromaticities</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getPrimaryChromaticities()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_PrimaryChromaticities();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrCoefficients <em>YCb Cr Coefficients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>YCb Cr Coefficients</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrCoefficients()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_YCbCrCoefficients();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getReferenceBlackWhite <em>Reference Black White</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Black White</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getReferenceBlackWhite()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_ReferenceBlackWhite();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getDateTime()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_DateTime();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageDescription <em>Image Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Description</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageDescription()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_ImageDescription();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getMake <em>Make</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Make</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getMake()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Make();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getModel()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Model();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getSoftware()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Software();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getArtist <em>Artist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artist</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getArtist()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Artist();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getCopyright()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_Copyright();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField1 <em>Tiff Field1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiff Field1</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField1()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_TiffField1();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField2 <em>Tiff Field2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiff Field2</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField2()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_TiffField2();

	/**
	 * Returns the meta object for the containment reference '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField3 <em>Tiff Field3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tiff Field3</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField3()
	 * @see #getTiffIfdType()
	 * @generated
	 */
	EReference getTiffIfdType_TiffField3();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.TimeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TimeType#getValue()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.TimeType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.TimeType#getTag()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.UuidType <em>Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uuid Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.UuidType
	 * @generated
	 */
	EClass getUuidType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.UuidType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.UuidType#getValue()
	 * @see #getUuidType()
	 * @generated
	 */
	EAttribute getUuidType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.UuidType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.UuidType#getTag()
	 * @see #getUuidType()
	 * @generated
	 */
	EAttribute getUuidType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceType <em>White Balance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Balance Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceType
	 * @generated
	 */
	EClass getWhiteBalanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceType#getValue()
	 * @see #getWhiteBalanceType()
	 * @generated
	 */
	EAttribute getWhiteBalanceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceType#getTag()
	 * @see #getWhiteBalanceType()
	 * @generated
	 */
	EAttribute getWhiteBalanceType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.WhitePointType <em>White Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>White Point Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhitePointType
	 * @generated
	 */
	EClass getWhitePointType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.WhitePointType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhitePointType#getTag()
	 * @see #getWhitePointType()
	 * @generated
	 */
	EAttribute getWhitePointType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType <em>YCb Cr Coefficients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCb Cr Coefficients Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType
	 * @generated
	 */
	EClass getYCbCrCoefficientsType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient1 <em>Coefficient1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient1</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient1()
	 * @see #getYCbCrCoefficientsType()
	 * @generated
	 */
	EAttribute getYCbCrCoefficientsType_Coefficient1();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient2 <em>Coefficient2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient2</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient2()
	 * @see #getYCbCrCoefficientsType()
	 * @generated
	 */
	EAttribute getYCbCrCoefficientsType_Coefficient2();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient3 <em>Coefficient3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coefficient3</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getCoefficient3()
	 * @see #getYCbCrCoefficientsType()
	 * @generated
	 */
	EAttribute getYCbCrCoefficientsType_Coefficient3();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType#getTag()
	 * @see #getYCbCrCoefficientsType()
	 * @generated
	 */
	EAttribute getYCbCrCoefficientsType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningType <em>YCb Cr Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCb Cr Positioning Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningType
	 * @generated
	 */
	EClass getYCbCrPositioningType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningType#getValue()
	 * @see #getYCbCrPositioningType()
	 * @generated
	 */
	EAttribute getYCbCrPositioningType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningType#getTag()
	 * @see #getYCbCrPositioningType()
	 * @generated
	 */
	EAttribute getYCbCrPositioningType_Tag();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType <em>YCb Cr Sub Sampling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>YCb Cr Sub Sampling Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType
	 * @generated
	 */
	EClass getYCbCrSubSamplingType();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType#getValue()
	 * @see #getYCbCrSubSamplingType()
	 * @generated
	 */
	EAttribute getYCbCrSubSamplingType_Value();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType#getTag()
	 * @see #getYCbCrSubSamplingType()
	 * @generated
	 */
	EAttribute getYCbCrSubSamplingType_Tag();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleT <em>Bits Per Sample T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Bits Per Sample T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleT
	 * @generated
	 */
	EEnum getBitsPerSampleT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceT <em>Color Space T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Space T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceT
	 * @generated
	 */
	EEnum getColorSpaceT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.CompressionT <em>Compression T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compression T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionT
	 * @generated
	 */
	EEnum getCompressionT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.ContrastT <em>Contrast T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contrast T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastT
	 * @generated
	 */
	EEnum getContrastT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedT <em>Custom Rendered T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Rendered T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedT
	 * @generated
	 */
	EEnum getCustomRenderedT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.DatatypeType <em>Datatype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Type</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @generated
	 */
	EEnum getDatatypeType();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.ExposureModeT <em>Exposure Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure Mode T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeT
	 * @generated
	 */
	EEnum getExposureModeT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramT <em>Exposure Program T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exposure Program T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramT
	 * @generated
	 */
	EEnum getExposureProgramT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.FileSourceT <em>File Source T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Source T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceT
	 * @generated
	 */
	EEnum getFileSourceT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.FlashModeT <em>Flash Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flash Mode T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @generated
	 */
	EEnum getFlashModeT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.FlashReturnT <em>Flash Return T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Flash Return T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @generated
	 */
	EEnum getFlashReturnT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GainControlT <em>Gain Control T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gain Control T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlT
	 * @generated
	 */
	EEnum getGainControlT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT <em>Gps Altitude Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Altitude Ref T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT
	 * @generated
	 */
	EEnum getGpsAltitudeRefT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialT <em>Gps Differential T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Differential T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialT
	 * @generated
	 */
	EEnum getGpsDifferentialT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionT <em>Gps Direction T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Direction T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionT
	 * @generated
	 */
	EEnum getGpsDirectionT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefT <em>Gps Distance Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Distance Ref T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefT
	 * @generated
	 */
	EEnum getGpsDistanceRefT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT <em>Gps Latitude Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Latitude Ref T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT
	 * @generated
	 */
	EEnum getGpsLatitudeRefT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT <em>Gps Longitude Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Longitude Ref T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT
	 * @generated
	 */
	EEnum getGpsLongitudeRefT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeT <em>Gps Measure Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Measure Mode T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeT
	 * @generated
	 */
	EEnum getGpsMeasureModeT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefT <em>Gps Speed Ref T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Speed Ref T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefT
	 * @generated
	 */
	EEnum getGpsSpeedRefT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.GpsStatusT <em>Gps Status T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gps Status T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusT
	 * @generated
	 */
	EEnum getGpsStatusT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityT <em>Interoperability T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interoperability T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityT
	 * @generated
	 */
	EEnum getInteroperabilityT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.LightSourceT <em>Light Source T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Light Source T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceT
	 * @generated
	 */
	EEnum getLightSourceT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.MeteringModeT <em>Metering Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metering Mode T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeT
	 * @generated
	 */
	EEnum getMeteringModeT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.OrientationT <em>Orientation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orientation T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationT
	 * @generated
	 */
	EEnum getOrientationT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT <em>Photometric Interpretation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Photometric Interpretation T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT
	 * @generated
	 */
	EEnum getPhotometricInterpretationT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationT <em>Planar Configuration T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Planar Configuration T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationT
	 * @generated
	 */
	EEnum getPlanarConfigurationT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.ResolutionT <em>Resolution T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionT
	 * @generated
	 */
	EEnum getResolutionT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.SaturationT <em>Saturation T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Saturation T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationT
	 * @generated
	 */
	EEnum getSaturationT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureT <em>Scene Capture T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scene Capture T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureT
	 * @generated
	 */
	EEnum getSceneCaptureT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.SensingMethodT <em>Sensing Method T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensing Method T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodT
	 * @generated
	 */
	EEnum getSensingMethodT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT <em>Subject Distance Range T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Subject Distance Range T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT
	 * @generated
	 */
	EEnum getSubjectDistanceRangeT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceT <em>White Balance T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>White Balance T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceT
	 * @generated
	 */
	EEnum getWhiteBalanceT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningT <em>YCb Cr Positioning T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YCb Cr Positioning T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningT
	 * @generated
	 */
	EEnum getYCbCrPositioningT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT <em>YCb Cr Sub Sampling T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>YCb Cr Sub Sampling T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT
	 * @generated
	 */
	EEnum getYCbCrSubSamplingT();

	/**
	 * Returns the meta object for enum '{@link com.hsveclipse.phototoolkit.exif.YesNoT <em>Yes No T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Yes No T</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @generated
	 */
	EEnum getYesNoT();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleT <em>Bits Per Sample TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bits Per Sample TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.BitsPerSampleT"
	 *        extendedMetaData="name='bitsPerSample_t:Object' baseType='bitsPerSample_t'"
	 * @generated
	 */
	EDataType getBitsPerSampleTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceT <em>Color Space TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Space TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.ColorSpaceT"
	 *        extendedMetaData="name='colorSpace_t:Object' baseType='colorSpace_t'"
	 * @generated
	 */
	EDataType getColorSpaceTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.CompressionT <em>Compression TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compression TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.CompressionT"
	 *        extendedMetaData="name='compression_t:Object' baseType='compression_t'"
	 * @generated
	 */
	EDataType getCompressionTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.ContrastT <em>Contrast TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Contrast TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.ContrastT"
	 *        extendedMetaData="name='contrast_t:Object' baseType='contrast_t'"
	 * @generated
	 */
	EDataType getContrastTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedT <em>Custom Rendered TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Custom Rendered TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.CustomRenderedT"
	 *        extendedMetaData="name='customRendered_t:Object' baseType='customRendered_t'"
	 * @generated
	 */
	EDataType getCustomRenderedTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.DatatypeType <em>Datatype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datatype Type Object</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.DatatypeType"
	 *        extendedMetaData="name='Datatype_._type:Object' baseType='Datatype_._type'"
	 * @generated
	 */
	EDataType getDatatypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.ExposureModeT <em>Exposure Mode TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exposure Mode TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.ExposureModeT"
	 *        extendedMetaData="name='exposureMode_t:Object' baseType='exposureMode_t'"
	 * @generated
	 */
	EDataType getExposureModeTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramT <em>Exposure Program TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exposure Program TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.ExposureProgramT"
	 *        extendedMetaData="name='exposureProgram_t:Object' baseType='exposureProgram_t'"
	 * @generated
	 */
	EDataType getExposureProgramTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.FileSourceT <em>File Source TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File Source TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.FileSourceT"
	 *        extendedMetaData="name='fileSource_t:Object' baseType='fileSource_t'"
	 * @generated
	 */
	EDataType getFileSourceTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.FlashModeT <em>Flash Mode TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flash Mode TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.FlashModeT"
	 *        extendedMetaData="name='flashMode_t:Object' baseType='flashMode_t'"
	 * @generated
	 */
	EDataType getFlashModeTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.FlashReturnT <em>Flash Return TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Flash Return TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.FlashReturnT"
	 *        extendedMetaData="name='flashReturn_t:Object' baseType='flashReturn_t'"
	 * @generated
	 */
	EDataType getFlashReturnTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GainControlT <em>Gain Control TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gain Control TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GainControlT"
	 *        extendedMetaData="name='gainControl_t:Object' baseType='gainControl_t'"
	 * @generated
	 */
	EDataType getGainControlTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT <em>Gps Altitude Ref TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Altitude Ref TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsAltitudeRefT"
	 *        extendedMetaData="name='gpsAltitudeRef_t:Object' baseType='gpsAltitudeRef_t'"
	 * @generated
	 */
	EDataType getGpsAltitudeRefTObject();

	/**
	 * Returns the meta object for data type '<em>Gps Bearing T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Bearing T</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='gpsBearing_t' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0' maxExclusive='360.0'"
	 * @generated
	 */
	EDataType getGpsBearingT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Gps Bearing TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Bearing TObject</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='gpsBearing_t:Object' baseType='gpsBearing_t'"
	 * @generated
	 */
	EDataType getGpsBearingTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialT <em>Gps Differential TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Differential TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsDifferentialT"
	 *        extendedMetaData="name='gpsDifferential_t:Object' baseType='gpsDifferential_t'"
	 * @generated
	 */
	EDataType getGpsDifferentialTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionT <em>Gps Direction TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Direction TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsDirectionT"
	 *        extendedMetaData="name='gpsDirection_t:Object' baseType='gpsDirection_t'"
	 * @generated
	 */
	EDataType getGpsDirectionTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefT <em>Gps Distance Ref TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Distance Ref TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsDistanceRefT"
	 *        extendedMetaData="name='gpsDistanceRef_t:Object' baseType='gpsDistanceRef_t'"
	 * @generated
	 */
	EDataType getGpsDistanceRefTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT <em>Gps Latitude Ref TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Latitude Ref TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsLatitudeRefT"
	 *        extendedMetaData="name='gpsLatitudeRef_t:Object' baseType='gpsLatitudeRef_t'"
	 * @generated
	 */
	EDataType getGpsLatitudeRefTObject();

	/**
	 * Returns the meta object for data type '<em>Gps Latitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Latitude T</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='gpsLatitude_t' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getGpsLatitudeT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Gps Latitude TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Latitude TObject</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='gpsLatitude_t:Object' baseType='gpsLatitude_t'"
	 * @generated
	 */
	EDataType getGpsLatitudeTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT <em>Gps Longitude Ref TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Longitude Ref TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsLongitudeRefT"
	 *        extendedMetaData="name='gpsLongitudeRef_t:Object' baseType='gpsLongitudeRef_t'"
	 * @generated
	 */
	EDataType getGpsLongitudeRefTObject();

	/**
	 * Returns the meta object for data type '<em>Gps Longitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Longitude T</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='gpsLongitude_t' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0.0' maxInclusive='180.0'"
	 * @generated
	 */
	EDataType getGpsLongitudeT();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Gps Longitude TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Longitude TObject</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='gpsLongitude_t:Object' baseType='gpsLongitude_t'"
	 * @generated
	 */
	EDataType getGpsLongitudeTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeT <em>Gps Measure Mode TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Measure Mode TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsMeasureModeT"
	 *        extendedMetaData="name='gpsMeasureMode_t:Object' baseType='gpsMeasureMode_t'"
	 * @generated
	 */
	EDataType getGpsMeasureModeTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefT <em>Gps Speed Ref TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Speed Ref TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsSpeedRefT"
	 *        extendedMetaData="name='gpsSpeedRef_t:Object' baseType='gpsSpeedRef_t'"
	 * @generated
	 */
	EDataType getGpsSpeedRefTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.GpsStatusT <em>Gps Status TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Gps Status TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.GpsStatusT"
	 *        extendedMetaData="name='gpsStatus_t:Object' baseType='gpsStatus_t'"
	 * @generated
	 */
	EDataType getGpsStatusTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityT <em>Interoperability TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interoperability TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.InteroperabilityT"
	 *        extendedMetaData="name='interoperability_t:Object' baseType='interoperability_t'"
	 * @generated
	 */
	EDataType getInteroperabilityTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.LightSourceT <em>Light Source TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Light Source TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.LightSourceT"
	 *        extendedMetaData="name='lightSource_t:Object' baseType='lightSource_t'"
	 * @generated
	 */
	EDataType getLightSourceTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.MeteringModeT <em>Metering Mode TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Metering Mode TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.MeteringModeT"
	 *        extendedMetaData="name='meteringMode_t:Object' baseType='meteringMode_t'"
	 * @generated
	 */
	EDataType getMeteringModeTObject();

	/**
	 * Returns the meta object for data type '<em>Non Negative Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Real</em>'.
	 * @model instanceClass="float"
	 *        extendedMetaData="name='nonNegativeReal' baseType='http://www.eclipse.org/emf/2003/XMLType#float' minInclusive='0'"
	 * @generated
	 */
	EDataType getNonNegativeReal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Non Negative Real Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Negative Real Object</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        extendedMetaData="name='nonNegativeReal:Object' baseType='nonNegativeReal'"
	 * @generated
	 */
	EDataType getNonNegativeRealObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.OrientationT <em>Orientation TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Orientation TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.OrientationT"
	 *        extendedMetaData="name='orientation_t:Object' baseType='orientation_t'"
	 * @generated
	 */
	EDataType getOrientationTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT <em>Photometric Interpretation TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Photometric Interpretation TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.PhotometricInterpretationT"
	 *        extendedMetaData="name='photometricInterpretation_t:Object' baseType='photometricInterpretation_t'"
	 * @generated
	 */
	EDataType getPhotometricInterpretationTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationT <em>Planar Configuration TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Planar Configuration TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.PlanarConfigurationT"
	 *        extendedMetaData="name='planarConfiguration_t:Object' baseType='planarConfiguration_t'"
	 * @generated
	 */
	EDataType getPlanarConfigurationTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.ResolutionT <em>Resolution TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Resolution TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.ResolutionT"
	 *        extendedMetaData="name='resolution_t:Object' baseType='resolution_t'"
	 * @generated
	 */
	EDataType getResolutionTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.SaturationT <em>Saturation TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Saturation TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.SaturationT"
	 *        extendedMetaData="name='saturation_t:Object' baseType='saturation_t'"
	 * @generated
	 */
	EDataType getSaturationTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureT <em>Scene Capture TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scene Capture TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.SceneCaptureT"
	 *        extendedMetaData="name='sceneCapture_t:Object' baseType='sceneCapture_t'"
	 * @generated
	 */
	EDataType getSceneCaptureTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.SensingMethodT <em>Sensing Method TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sensing Method TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.SensingMethodT"
	 *        extendedMetaData="name='sensingMethod_t:Object' baseType='sensingMethod_t'"
	 * @generated
	 */
	EDataType getSensingMethodTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT <em>Subject Distance Range TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Subject Distance Range TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeT"
	 *        extendedMetaData="name='subjectDistanceRange_t:Object' baseType='subjectDistanceRange_t'"
	 * @generated
	 */
	EDataType getSubjectDistanceRangeTObject();

	/**
	 * Returns the meta object for data type '<em>Uuid T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uuid T</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='uuid_t' baseType='http://www.eclipse.org/emf/2003/XMLType#hexBinary' pattern='.{8}-.{4}-.{4}-.{4}-.{12}'"
	 * @generated
	 */
	EDataType getUuidT();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceT <em>White Balance TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>White Balance TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.WhiteBalanceT"
	 *        extendedMetaData="name='whiteBalance_t:Object' baseType='whiteBalance_t'"
	 * @generated
	 */
	EDataType getWhiteBalanceTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningT <em>YCb Cr Positioning TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YCb Cr Positioning TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.YCbCrPositioningT"
	 *        extendedMetaData="name='yCbCrPositioning_t:Object' baseType='yCbCrPositioning_t'"
	 * @generated
	 */
	EDataType getYCbCrPositioningTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT <em>YCb Cr Sub Sampling TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>YCb Cr Sub Sampling TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingT"
	 *        extendedMetaData="name='yCbCrSubSampling_t:Object' baseType='yCbCrSubSampling_t'"
	 * @generated
	 */
	EDataType getYCbCrSubSamplingTObject();

	/**
	 * Returns the meta object for data type '{@link com.hsveclipse.phototoolkit.exif.YesNoT <em>Yes No TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Yes No TObject</em>'.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @model instanceClass="com.hsveclipse.phototoolkit.exif.YesNoT"
	 *        extendedMetaData="name='yesNo_t:Object' baseType='yesNo_t'"
	 * @generated
	 */
	EDataType getYesNoTObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExifFactory getExifFactory();

} //ExifPackage
