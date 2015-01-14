/**
 */
package com.hsveclipse.phototoolkit.exif.util;

import com.hsveclipse.phototoolkit.exif.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage
 * @generated
 */
public class ExifValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExifValidator INSTANCE = new ExifValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.hsveclipse.phototoolkit.exif";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExifPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExifPackage.BITS_PER_SAMPLE_TYPE:
				return validateBitsPerSampleType((BitsPerSampleType)value, diagnostics, context);
			case ExifPackage.CHROMATICITY:
				return validateChromaticity((Chromaticity)value, diagnostics, context);
			case ExifPackage.COLOR_SPACE_TYPE:
				return validateColorSpaceType((ColorSpaceType)value, diagnostics, context);
			case ExifPackage.COMPRESSION_TYPE:
				return validateCompressionType((CompressionType)value, diagnostics, context);
			case ExifPackage.CONTRAST_TYPE:
				return validateContrastType((ContrastType)value, diagnostics, context);
			case ExifPackage.CUSTOM_RENDERED_TYPE:
				return validateCustomRenderedType((CustomRenderedType)value, diagnostics, context);
			case ExifPackage.DATE_TIME_TYPE:
				return validateDateTimeType((DateTimeType)value, diagnostics, context);
			case ExifPackage.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case ExifPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case ExifPackage.EXIF_IFD_TYPE:
				return validateExifIfdType((ExifIfdType)value, diagnostics, context);
			case ExifPackage.EXIF_METADATA_TYPE:
				return validateExifMetadataType((ExifMetadataType)value, diagnostics, context);
			case ExifPackage.EXPOSURE_MODE_TYPE:
				return validateExposureModeType((ExposureModeType)value, diagnostics, context);
			case ExifPackage.EXPOSURE_PROGRAM_TYPE:
				return validateExposureProgramType((ExposureProgramType)value, diagnostics, context);
			case ExifPackage.FILE_SOURCE_TYPE:
				return validateFileSourceType((FileSourceType)value, diagnostics, context);
			case ExifPackage.FLASH_TYPE:
				return validateFlashType((FlashType)value, diagnostics, context);
			case ExifPackage.GAIN_CONTROL_TYPE:
				return validateGainControlType((GainControlType)value, diagnostics, context);
			case ExifPackage.GPS_ALTITUDE_REF_TYPE:
				return validateGpsAltitudeRefType((GpsAltitudeRefType)value, diagnostics, context);
			case ExifPackage.GPS_BEARING_TYPE:
				return validateGpsBearingType((GpsBearingType)value, diagnostics, context);
			case ExifPackage.GPS_DIFFERENTIAL_TYPE:
				return validateGpsDifferentialType((GpsDifferentialType)value, diagnostics, context);
			case ExifPackage.GPS_DIRECTION_TYPE:
				return validateGpsDirectionType((GpsDirectionType)value, diagnostics, context);
			case ExifPackage.GPS_DISTANCE_REF_TYPE:
				return validateGpsDistanceRefType((GpsDistanceRefType)value, diagnostics, context);
			case ExifPackage.GPS_IFD_TYPE:
				return validateGpsIfdType((GpsIfdType)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_REF_TYPE:
				return validateGpsLatitudeRefType((GpsLatitudeRefType)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_TYPE:
				return validateGpsLatitudeType((GpsLatitudeType)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_REF_TYPE:
				return validateGpsLongitudeRefType((GpsLongitudeRefType)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_TYPE:
				return validateGpsLongitudeType((GpsLongitudeType)value, diagnostics, context);
			case ExifPackage.GPS_MEASURE_MODE_TYPE:
				return validateGpsMeasureModeType((GpsMeasureModeType)value, diagnostics, context);
			case ExifPackage.GPS_SPEED_REF_TYPE:
				return validateGpsSpeedRefType((GpsSpeedRefType)value, diagnostics, context);
			case ExifPackage.GPS_STATUS_TYPE:
				return validateGpsStatusType((GpsStatusType)value, diagnostics, context);
			case ExifPackage.INTEROPERABILITY_IFD_TYPE:
				return validateInteroperabilityIfdType((InteroperabilityIfdType)value, diagnostics, context);
			case ExifPackage.INTEROPERABILITY_TYPE:
				return validateInteroperabilityType((InteroperabilityType)value, diagnostics, context);
			case ExifPackage.LIGHT_SOURCE_TYPE:
				return validateLightSourceType((LightSourceType)value, diagnostics, context);
			case ExifPackage.METERING_MODE_TYPE:
				return validateMeteringModeType((MeteringModeType)value, diagnostics, context);
			case ExifPackage.NON_NEGATIVE_INTEGER_TYPE:
				return validateNonNegativeIntegerType((NonNegativeIntegerType)value, diagnostics, context);
			case ExifPackage.NON_NEGATIVE_REAL_TYPE:
				return validateNonNegativeRealType((NonNegativeRealType)value, diagnostics, context);
			case ExifPackage.ORIENTATION_TYPE:
				return validateOrientationType((OrientationType)value, diagnostics, context);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TYPE:
				return validatePhotometricInterpretationType((PhotometricInterpretationType)value, diagnostics, context);
			case ExifPackage.PLANAR_CONFIGURATION_TYPE:
				return validatePlanarConfigurationType((PlanarConfigurationType)value, diagnostics, context);
			case ExifPackage.POSITIVE_INTEGER_TYPE:
				return validatePositiveIntegerType((PositiveIntegerType)value, diagnostics, context);
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE:
				return validatePrimaryChromaticitiesType((PrimaryChromaticitiesType)value, diagnostics, context);
			case ExifPackage.REAL_TYPE:
				return validateRealType((RealType)value, diagnostics, context);
			case ExifPackage.REPEATED_FIELD_TYPE:
				return validateRepeatedFieldType((RepeatedFieldType)value, diagnostics, context);
			case ExifPackage.RESOLUTION_TYPE:
				return validateResolutionType((ResolutionType)value, diagnostics, context);
			case ExifPackage.SATURATION_TYPE:
				return validateSaturationType((SaturationType)value, diagnostics, context);
			case ExifPackage.SCENE_CAPTURE_TYPE:
				return validateSceneCaptureType((SceneCaptureType)value, diagnostics, context);
			case ExifPackage.SENSING_METHOD_TYPE:
				return validateSensingMethodType((SensingMethodType)value, diagnostics, context);
			case ExifPackage.SHARPNESS_TYPE:
				return validateSharpnessType((SharpnessType)value, diagnostics, context);
			case ExifPackage.SINGLE_FIELD_T:
				return validateSingleFieldT((SingleFieldT)value, diagnostics, context);
			case ExifPackage.SINGLE_FIELD_TYPE:
				return validateSingleFieldType((SingleFieldType)value, diagnostics, context);
			case ExifPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case ExifPackage.STRIP_BYTE_COUNTS_TYPE:
				return validateStripByteCountsType((StripByteCountsType)value, diagnostics, context);
			case ExifPackage.STRIP_BYTE_COUNT_TYPE:
				return validateStripByteCountType((StripByteCountType)value, diagnostics, context);
			case ExifPackage.STRIP_OFFSETS_TYPE:
				return validateStripOffsetsType((StripOffsetsType)value, diagnostics, context);
			case ExifPackage.STRIP_OFFSET_TYPE:
				return validateStripOffsetType((StripOffsetType)value, diagnostics, context);
			case ExifPackage.SUBJECT_AREA_TYPE:
				return validateSubjectAreaType((SubjectAreaType)value, diagnostics, context);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TYPE:
				return validateSubjectDistanceRangeType((SubjectDistanceRangeType)value, diagnostics, context);
			case ExifPackage.SUBJECT_LOCATION_TYPE:
				return validateSubjectLocationType((SubjectLocationType)value, diagnostics, context);
			case ExifPackage.TIFF_IFD_TYPE:
				return validateTiffIfdType((TiffIfdType)value, diagnostics, context);
			case ExifPackage.TIME_TYPE:
				return validateTimeType((TimeType)value, diagnostics, context);
			case ExifPackage.UUID_TYPE:
				return validateUuidType((UuidType)value, diagnostics, context);
			case ExifPackage.WHITE_BALANCE_TYPE:
				return validateWhiteBalanceType((WhiteBalanceType)value, diagnostics, context);
			case ExifPackage.WHITE_POINT_TYPE:
				return validateWhitePointType((WhitePointType)value, diagnostics, context);
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE:
				return validateYCbCrCoefficientsType((YCbCrCoefficientsType)value, diagnostics, context);
			case ExifPackage.YCB_CR_POSITIONING_TYPE:
				return validateYCbCrPositioningType((YCbCrPositioningType)value, diagnostics, context);
			case ExifPackage.YCB_CR_SUB_SAMPLING_TYPE:
				return validateYCbCrSubSamplingType((YCbCrSubSamplingType)value, diagnostics, context);
			case ExifPackage.BITS_PER_SAMPLE_T:
				return validateBitsPerSampleT((BitsPerSampleT)value, diagnostics, context);
			case ExifPackage.COLOR_SPACE_T:
				return validateColorSpaceT((ColorSpaceT)value, diagnostics, context);
			case ExifPackage.COMPRESSION_T:
				return validateCompressionT((CompressionT)value, diagnostics, context);
			case ExifPackage.CONTRAST_T:
				return validateContrastT((ContrastT)value, diagnostics, context);
			case ExifPackage.CUSTOM_RENDERED_T:
				return validateCustomRenderedT((CustomRenderedT)value, diagnostics, context);
			case ExifPackage.DATATYPE_TYPE:
				return validateDatatypeType((DatatypeType)value, diagnostics, context);
			case ExifPackage.EXPOSURE_MODE_T:
				return validateExposureModeT((ExposureModeT)value, diagnostics, context);
			case ExifPackage.EXPOSURE_PROGRAM_T:
				return validateExposureProgramT((ExposureProgramT)value, diagnostics, context);
			case ExifPackage.FILE_SOURCE_T:
				return validateFileSourceT((FileSourceT)value, diagnostics, context);
			case ExifPackage.FLASH_MODE_T:
				return validateFlashModeT((FlashModeT)value, diagnostics, context);
			case ExifPackage.FLASH_RETURN_T:
				return validateFlashReturnT((FlashReturnT)value, diagnostics, context);
			case ExifPackage.GAIN_CONTROL_T:
				return validateGainControlT((GainControlT)value, diagnostics, context);
			case ExifPackage.GPS_ALTITUDE_REF_T:
				return validateGpsAltitudeRefT((GpsAltitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_DIFFERENTIAL_T:
				return validateGpsDifferentialT((GpsDifferentialT)value, diagnostics, context);
			case ExifPackage.GPS_DIRECTION_T:
				return validateGpsDirectionT((GpsDirectionT)value, diagnostics, context);
			case ExifPackage.GPS_DISTANCE_REF_T:
				return validateGpsDistanceRefT((GpsDistanceRefT)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_REF_T:
				return validateGpsLatitudeRefT((GpsLatitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_REF_T:
				return validateGpsLongitudeRefT((GpsLongitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_MEASURE_MODE_T:
				return validateGpsMeasureModeT((GpsMeasureModeT)value, diagnostics, context);
			case ExifPackage.GPS_SPEED_REF_T:
				return validateGpsSpeedRefT((GpsSpeedRefT)value, diagnostics, context);
			case ExifPackage.GPS_STATUS_T:
				return validateGpsStatusT((GpsStatusT)value, diagnostics, context);
			case ExifPackage.INTEROPERABILITY_T:
				return validateInteroperabilityT((InteroperabilityT)value, diagnostics, context);
			case ExifPackage.LIGHT_SOURCE_T:
				return validateLightSourceT((LightSourceT)value, diagnostics, context);
			case ExifPackage.METERING_MODE_T:
				return validateMeteringModeT((MeteringModeT)value, diagnostics, context);
			case ExifPackage.ORIENTATION_T:
				return validateOrientationT((OrientationT)value, diagnostics, context);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_T:
				return validatePhotometricInterpretationT((PhotometricInterpretationT)value, diagnostics, context);
			case ExifPackage.PLANAR_CONFIGURATION_T:
				return validatePlanarConfigurationT((PlanarConfigurationT)value, diagnostics, context);
			case ExifPackage.RESOLUTION_T:
				return validateResolutionT((ResolutionT)value, diagnostics, context);
			case ExifPackage.SATURATION_T:
				return validateSaturationT((SaturationT)value, diagnostics, context);
			case ExifPackage.SCENE_CAPTURE_T:
				return validateSceneCaptureT((SceneCaptureT)value, diagnostics, context);
			case ExifPackage.SENSING_METHOD_T:
				return validateSensingMethodT((SensingMethodT)value, diagnostics, context);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_T:
				return validateSubjectDistanceRangeT((SubjectDistanceRangeT)value, diagnostics, context);
			case ExifPackage.WHITE_BALANCE_T:
				return validateWhiteBalanceT((WhiteBalanceT)value, diagnostics, context);
			case ExifPackage.YCB_CR_POSITIONING_T:
				return validateYCbCrPositioningT((YCbCrPositioningT)value, diagnostics, context);
			case ExifPackage.YCB_CR_SUB_SAMPLING_T:
				return validateYCbCrSubSamplingT((YCbCrSubSamplingT)value, diagnostics, context);
			case ExifPackage.YES_NO_T:
				return validateYesNoT((YesNoT)value, diagnostics, context);
			case ExifPackage.BITS_PER_SAMPLE_TOBJECT:
				return validateBitsPerSampleTObject((BitsPerSampleT)value, diagnostics, context);
			case ExifPackage.COLOR_SPACE_TOBJECT:
				return validateColorSpaceTObject((ColorSpaceT)value, diagnostics, context);
			case ExifPackage.COMPRESSION_TOBJECT:
				return validateCompressionTObject((CompressionT)value, diagnostics, context);
			case ExifPackage.CONTRAST_TOBJECT:
				return validateContrastTObject((ContrastT)value, diagnostics, context);
			case ExifPackage.CUSTOM_RENDERED_TOBJECT:
				return validateCustomRenderedTObject((CustomRenderedT)value, diagnostics, context);
			case ExifPackage.DATATYPE_TYPE_OBJECT:
				return validateDatatypeTypeObject((DatatypeType)value, diagnostics, context);
			case ExifPackage.EXPOSURE_MODE_TOBJECT:
				return validateExposureModeTObject((ExposureModeT)value, diagnostics, context);
			case ExifPackage.EXPOSURE_PROGRAM_TOBJECT:
				return validateExposureProgramTObject((ExposureProgramT)value, diagnostics, context);
			case ExifPackage.FILE_SOURCE_TOBJECT:
				return validateFileSourceTObject((FileSourceT)value, diagnostics, context);
			case ExifPackage.FLASH_MODE_TOBJECT:
				return validateFlashModeTObject((FlashModeT)value, diagnostics, context);
			case ExifPackage.FLASH_RETURN_TOBJECT:
				return validateFlashReturnTObject((FlashReturnT)value, diagnostics, context);
			case ExifPackage.GAIN_CONTROL_TOBJECT:
				return validateGainControlTObject((GainControlT)value, diagnostics, context);
			case ExifPackage.GPS_ALTITUDE_REF_TOBJECT:
				return validateGpsAltitudeRefTObject((GpsAltitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_BEARING_T:
				return validateGpsBearingT((Float)value, diagnostics, context);
			case ExifPackage.GPS_BEARING_TOBJECT:
				return validateGpsBearingTObject((Float)value, diagnostics, context);
			case ExifPackage.GPS_DIFFERENTIAL_TOBJECT:
				return validateGpsDifferentialTObject((GpsDifferentialT)value, diagnostics, context);
			case ExifPackage.GPS_DIRECTION_TOBJECT:
				return validateGpsDirectionTObject((GpsDirectionT)value, diagnostics, context);
			case ExifPackage.GPS_DISTANCE_REF_TOBJECT:
				return validateGpsDistanceRefTObject((GpsDistanceRefT)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_REF_TOBJECT:
				return validateGpsLatitudeRefTObject((GpsLatitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_T:
				return validateGpsLatitudeT((Float)value, diagnostics, context);
			case ExifPackage.GPS_LATITUDE_TOBJECT:
				return validateGpsLatitudeTObject((Float)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_REF_TOBJECT:
				return validateGpsLongitudeRefTObject((GpsLongitudeRefT)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_T:
				return validateGpsLongitudeT((Float)value, diagnostics, context);
			case ExifPackage.GPS_LONGITUDE_TOBJECT:
				return validateGpsLongitudeTObject((Float)value, diagnostics, context);
			case ExifPackage.GPS_MEASURE_MODE_TOBJECT:
				return validateGpsMeasureModeTObject((GpsMeasureModeT)value, diagnostics, context);
			case ExifPackage.GPS_SPEED_REF_TOBJECT:
				return validateGpsSpeedRefTObject((GpsSpeedRefT)value, diagnostics, context);
			case ExifPackage.GPS_STATUS_TOBJECT:
				return validateGpsStatusTObject((GpsStatusT)value, diagnostics, context);
			case ExifPackage.INTEROPERABILITY_TOBJECT:
				return validateInteroperabilityTObject((InteroperabilityT)value, diagnostics, context);
			case ExifPackage.LIGHT_SOURCE_TOBJECT:
				return validateLightSourceTObject((LightSourceT)value, diagnostics, context);
			case ExifPackage.METERING_MODE_TOBJECT:
				return validateMeteringModeTObject((MeteringModeT)value, diagnostics, context);
			case ExifPackage.NON_NEGATIVE_REAL:
				return validateNonNegativeReal((Float)value, diagnostics, context);
			case ExifPackage.NON_NEGATIVE_REAL_OBJECT:
				return validateNonNegativeRealObject((Float)value, diagnostics, context);
			case ExifPackage.ORIENTATION_TOBJECT:
				return validateOrientationTObject((OrientationT)value, diagnostics, context);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TOBJECT:
				return validatePhotometricInterpretationTObject((PhotometricInterpretationT)value, diagnostics, context);
			case ExifPackage.PLANAR_CONFIGURATION_TOBJECT:
				return validatePlanarConfigurationTObject((PlanarConfigurationT)value, diagnostics, context);
			case ExifPackage.RESOLUTION_TOBJECT:
				return validateResolutionTObject((ResolutionT)value, diagnostics, context);
			case ExifPackage.SATURATION_TOBJECT:
				return validateSaturationTObject((SaturationT)value, diagnostics, context);
			case ExifPackage.SCENE_CAPTURE_TOBJECT:
				return validateSceneCaptureTObject((SceneCaptureT)value, diagnostics, context);
			case ExifPackage.SENSING_METHOD_TOBJECT:
				return validateSensingMethodTObject((SensingMethodT)value, diagnostics, context);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TOBJECT:
				return validateSubjectDistanceRangeTObject((SubjectDistanceRangeT)value, diagnostics, context);
			case ExifPackage.UUID_T:
				return validateUuidT((byte[])value, diagnostics, context);
			case ExifPackage.WHITE_BALANCE_TOBJECT:
				return validateWhiteBalanceTObject((WhiteBalanceT)value, diagnostics, context);
			case ExifPackage.YCB_CR_POSITIONING_TOBJECT:
				return validateYCbCrPositioningTObject((YCbCrPositioningT)value, diagnostics, context);
			case ExifPackage.YCB_CR_SUB_SAMPLING_TOBJECT:
				return validateYCbCrSubSamplingTObject((YCbCrSubSamplingT)value, diagnostics, context);
			case ExifPackage.YES_NO_TOBJECT:
				return validateYesNoTObject((YesNoT)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitsPerSampleType(BitsPerSampleType bitsPerSampleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bitsPerSampleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChromaticity(Chromaticity chromaticity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chromaticity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorSpaceType(ColorSpaceType colorSpaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colorSpaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionType(CompressionType compressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContrastType(ContrastType contrastType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contrastType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRenderedType(CustomRenderedType customRenderedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customRenderedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeType(DateTimeType dateTimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateTimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExifIfdType(ExifIfdType exifIfdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exifIfdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExifMetadataType(ExifMetadataType exifMetadataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exifMetadataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureModeType(ExposureModeType exposureModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exposureModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureProgramType(ExposureProgramType exposureProgramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exposureProgramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSourceType(FileSourceType fileSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlashType(FlashType flashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flashType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGainControlType(GainControlType gainControlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gainControlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsAltitudeRefType(GpsAltitudeRefType gpsAltitudeRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsAltitudeRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsBearingType(GpsBearingType gpsBearingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsBearingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDifferentialType(GpsDifferentialType gpsDifferentialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsDifferentialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDirectionType(GpsDirectionType gpsDirectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsDirectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDistanceRefType(GpsDistanceRefType gpsDistanceRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsDistanceRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsIfdType(GpsIfdType gpsIfdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsIfdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeRefType(GpsLatitudeRefType gpsLatitudeRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsLatitudeRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeType(GpsLatitudeType gpsLatitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsLatitudeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeRefType(GpsLongitudeRefType gpsLongitudeRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsLongitudeRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeType(GpsLongitudeType gpsLongitudeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsLongitudeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsMeasureModeType(GpsMeasureModeType gpsMeasureModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsMeasureModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsSpeedRefType(GpsSpeedRefType gpsSpeedRefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsSpeedRefType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsStatusType(GpsStatusType gpsStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gpsStatusType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteroperabilityIfdType(InteroperabilityIfdType interoperabilityIfdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interoperabilityIfdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteroperabilityType(InteroperabilityType interoperabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interoperabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceType(LightSourceType lightSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lightSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeteringModeType(MeteringModeType meteringModeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(meteringModeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeIntegerType(NonNegativeIntegerType nonNegativeIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonNegativeIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeRealType(NonNegativeRealType nonNegativeRealType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonNegativeRealType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationType(OrientationType orientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(orientationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhotometricInterpretationType(PhotometricInterpretationType photometricInterpretationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(photometricInterpretationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanarConfigurationType(PlanarConfigurationType planarConfigurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planarConfigurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveIntegerType(PositiveIntegerType positiveIntegerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(positiveIntegerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimaryChromaticitiesType(PrimaryChromaticitiesType primaryChromaticitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primaryChromaticitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRealType(RealType realType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(realType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeatedFieldType(RepeatedFieldType repeatedFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repeatedFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolutionType(ResolutionType resolutionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resolutionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaturationType(SaturationType saturationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(saturationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneCaptureType(SceneCaptureType sceneCaptureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sceneCaptureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensingMethodType(SensingMethodType sensingMethodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensingMethodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSharpnessType(SharpnessType sharpnessType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sharpnessType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleFieldT(SingleFieldT singleFieldT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleFieldT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleFieldType(SingleFieldType singleFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singleFieldType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStripByteCountsType(StripByteCountsType stripByteCountsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stripByteCountsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStripByteCountType(StripByteCountType stripByteCountType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stripByteCountType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStripOffsetsType(StripOffsetsType stripOffsetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stripOffsetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStripOffsetType(StripOffsetType stripOffsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stripOffsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectAreaType(SubjectAreaType subjectAreaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectAreaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectDistanceRangeType(SubjectDistanceRangeType subjectDistanceRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectDistanceRangeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectLocationType(SubjectLocationType subjectLocationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectLocationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTiffIfdType(TiffIfdType tiffIfdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tiffIfdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeType(TimeType timeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidType(UuidType uuidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uuidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteBalanceType(WhiteBalanceType whiteBalanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whiteBalanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhitePointType(WhitePointType whitePointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(whitePointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrCoefficientsType(YCbCrCoefficientsType yCbCrCoefficientsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yCbCrCoefficientsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrPositioningType(YCbCrPositioningType yCbCrPositioningType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yCbCrPositioningType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrSubSamplingType(YCbCrSubSamplingType yCbCrSubSamplingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(yCbCrSubSamplingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitsPerSampleT(BitsPerSampleT bitsPerSampleT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorSpaceT(ColorSpaceT colorSpaceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionT(CompressionT compressionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContrastT(ContrastT contrastT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRenderedT(CustomRenderedT customRenderedT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeType(DatatypeType datatypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureModeT(ExposureModeT exposureModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureProgramT(ExposureProgramT exposureProgramT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSourceT(FileSourceT fileSourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlashModeT(FlashModeT flashModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlashReturnT(FlashReturnT flashReturnT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGainControlT(GainControlT gainControlT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsAltitudeRefT(GpsAltitudeRefT gpsAltitudeRefT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDifferentialT(GpsDifferentialT gpsDifferentialT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDirectionT(GpsDirectionT gpsDirectionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDistanceRefT(GpsDistanceRefT gpsDistanceRefT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeRefT(GpsLatitudeRefT gpsLatitudeRefT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeRefT(GpsLongitudeRefT gpsLongitudeRefT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsMeasureModeT(GpsMeasureModeT gpsMeasureModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsSpeedRefT(GpsSpeedRefT gpsSpeedRefT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsStatusT(GpsStatusT gpsStatusT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteroperabilityT(InteroperabilityT interoperabilityT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceT(LightSourceT lightSourceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeteringModeT(MeteringModeT meteringModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationT(OrientationT orientationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhotometricInterpretationT(PhotometricInterpretationT photometricInterpretationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanarConfigurationT(PlanarConfigurationT planarConfigurationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolutionT(ResolutionT resolutionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaturationT(SaturationT saturationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneCaptureT(SceneCaptureT sceneCaptureT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensingMethodT(SensingMethodT sensingMethodT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectDistanceRangeT(SubjectDistanceRangeT subjectDistanceRangeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteBalanceT(WhiteBalanceT whiteBalanceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrPositioningT(YCbCrPositioningT yCbCrPositioningT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrSubSamplingT(YCbCrSubSamplingT yCbCrSubSamplingT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesNoT(YesNoT yesNoT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBitsPerSampleTObject(BitsPerSampleT bitsPerSampleTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorSpaceTObject(ColorSpaceT colorSpaceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompressionTObject(CompressionT compressionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContrastTObject(ContrastT contrastTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomRenderedTObject(CustomRenderedT customRenderedTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatatypeTypeObject(DatatypeType datatypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureModeTObject(ExposureModeT exposureModeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureProgramTObject(ExposureProgramT exposureProgramTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileSourceTObject(FileSourceT fileSourceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlashModeTObject(FlashModeT flashModeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlashReturnTObject(FlashReturnT flashReturnTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGainControlTObject(GainControlT gainControlTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsAltitudeRefTObject(GpsAltitudeRefT gpsAltitudeRefTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsBearingT(float gpsBearingT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsBearingT_Min(gpsBearingT, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsBearingT_Max(gpsBearingT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsBearingT_Min
	 */
	public static final float GPS_BEARING_T__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Gps Bearing T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsBearingT_Min(float gpsBearingT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsBearingT >= GPS_BEARING_T__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ExifPackage.eINSTANCE.getGpsBearingT(), gpsBearingT, GPS_BEARING_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsBearingT_Max
	 */
	public static final float GPS_BEARING_T__MAX__VALUE = 360.0F;

	/**
	 * Validates the Max constraint of '<em>Gps Bearing T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsBearingT_Max(float gpsBearingT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsBearingT < GPS_BEARING_T__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ExifPackage.eINSTANCE.getGpsBearingT(), gpsBearingT, GPS_BEARING_T__MAX__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsBearingTObject(Float gpsBearingTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsBearingT_Min(gpsBearingTObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsBearingT_Max(gpsBearingTObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDifferentialTObject(GpsDifferentialT gpsDifferentialTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDirectionTObject(GpsDirectionT gpsDirectionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsDistanceRefTObject(GpsDistanceRefT gpsDistanceRefTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeRefTObject(GpsLatitudeRefT gpsLatitudeRefTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeT(float gpsLatitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsLatitudeT_Min(gpsLatitudeT, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsLatitudeT_Max(gpsLatitudeT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsLatitudeT_Min
	 */
	public static final float GPS_LATITUDE_T__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Gps Latitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeT_Min(float gpsLatitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsLatitudeT >= GPS_LATITUDE_T__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ExifPackage.eINSTANCE.getGpsLatitudeT(), gpsLatitudeT, GPS_LATITUDE_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsLatitudeT_Max
	 */
	public static final float GPS_LATITUDE_T__MAX__VALUE = 90.0F;

	/**
	 * Validates the Max constraint of '<em>Gps Latitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeT_Max(float gpsLatitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsLatitudeT <= GPS_LATITUDE_T__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ExifPackage.eINSTANCE.getGpsLatitudeT(), gpsLatitudeT, GPS_LATITUDE_T__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLatitudeTObject(Float gpsLatitudeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsLatitudeT_Min(gpsLatitudeTObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsLatitudeT_Max(gpsLatitudeTObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeRefTObject(GpsLongitudeRefT gpsLongitudeRefTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeT(float gpsLongitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsLongitudeT_Min(gpsLongitudeT, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsLongitudeT_Max(gpsLongitudeT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsLongitudeT_Min
	 */
	public static final float GPS_LONGITUDE_T__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Gps Longitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeT_Min(float gpsLongitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsLongitudeT >= GPS_LONGITUDE_T__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ExifPackage.eINSTANCE.getGpsLongitudeT(), gpsLongitudeT, GPS_LONGITUDE_T__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateGpsLongitudeT_Max
	 */
	public static final float GPS_LONGITUDE_T__MAX__VALUE = 180.0F;

	/**
	 * Validates the Max constraint of '<em>Gps Longitude T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeT_Max(float gpsLongitudeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = gpsLongitudeT <= GPS_LONGITUDE_T__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(ExifPackage.eINSTANCE.getGpsLongitudeT(), gpsLongitudeT, GPS_LONGITUDE_T__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsLongitudeTObject(Float gpsLongitudeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateGpsLongitudeT_Min(gpsLongitudeTObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateGpsLongitudeT_Max(gpsLongitudeTObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsMeasureModeTObject(GpsMeasureModeT gpsMeasureModeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsSpeedRefTObject(GpsSpeedRefT gpsSpeedRefTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGpsStatusTObject(GpsStatusT gpsStatusTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteroperabilityTObject(InteroperabilityT interoperabilityTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLightSourceTObject(LightSourceT lightSourceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeteringModeTObject(MeteringModeT meteringModeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeReal(float nonNegativeReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeReal_Min(nonNegativeReal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonNegativeReal_Min
	 */
	public static final float NON_NEGATIVE_REAL__MIN__VALUE = 0.0F;

	/**
	 * Validates the Min constraint of '<em>Non Negative Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeReal_Min(float nonNegativeReal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nonNegativeReal >= NON_NEGATIVE_REAL__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(ExifPackage.eINSTANCE.getNonNegativeReal(), nonNegativeReal, NON_NEGATIVE_REAL__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonNegativeRealObject(Float nonNegativeRealObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonNegativeReal_Min(nonNegativeRealObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrientationTObject(OrientationT orientationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhotometricInterpretationTObject(PhotometricInterpretationT photometricInterpretationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanarConfigurationTObject(PlanarConfigurationT planarConfigurationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolutionTObject(ResolutionT resolutionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSaturationTObject(SaturationT saturationTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSceneCaptureTObject(SceneCaptureT sceneCaptureTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensingMethodTObject(SensingMethodT sensingMethodTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectDistanceRangeTObject(SubjectDistanceRangeT subjectDistanceRangeTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidT(byte[] uuidT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUuidT_Pattern(uuidT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUuidT_Pattern
	 */
	public static final  PatternMatcher [][] UUID_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{8}-.{4}-.{4}-.{4}-.{12}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Uuid T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUuidT_Pattern(byte[] uuidT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(ExifPackage.eINSTANCE.getUuidT(), uuidT, UUID_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhiteBalanceTObject(WhiteBalanceT whiteBalanceTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrPositioningTObject(YCbCrPositioningT yCbCrPositioningTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYCbCrSubSamplingTObject(YCbCrSubSamplingT yCbCrSubSamplingTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateYesNoTObject(YesNoT yesNoTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ExifValidator
