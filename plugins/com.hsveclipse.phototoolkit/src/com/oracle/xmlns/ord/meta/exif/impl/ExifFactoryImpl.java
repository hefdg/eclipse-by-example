/**
 */
package com.oracle.xmlns.ord.meta.exif.impl;

import com.oracle.xmlns.ord.meta.exif.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExifFactoryImpl extends EFactoryImpl implements ExifFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExifFactory init() {
		try {
			ExifFactory theExifFactory = (ExifFactory)EPackage.Registry.INSTANCE.getEFactory(ExifPackage.eNS_URI);
			if (theExifFactory != null) {
				return theExifFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExifFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExifPackage.BITS_PER_SAMPLE_TYPE: return createBitsPerSampleType();
			case ExifPackage.CHROMATICITY: return createChromaticity();
			case ExifPackage.COLOR_SPACE_TYPE: return createColorSpaceType();
			case ExifPackage.COMPRESSION_TYPE: return createCompressionType();
			case ExifPackage.CONTRAST_TYPE: return createContrastType();
			case ExifPackage.CUSTOM_RENDERED_TYPE: return createCustomRenderedType();
			case ExifPackage.DATE_TIME_TYPE: return createDateTimeType();
			case ExifPackage.DATE_TYPE: return createDateType();
			case ExifPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ExifPackage.EXIF_IFD_TYPE: return createExifIfdType();
			case ExifPackage.EXIF_METADATA_TYPE: return createExifMetadataType();
			case ExifPackage.EXPOSURE_MODE_TYPE: return createExposureModeType();
			case ExifPackage.EXPOSURE_PROGRAM_TYPE: return createExposureProgramType();
			case ExifPackage.FILE_SOURCE_TYPE: return createFileSourceType();
			case ExifPackage.FLASH_TYPE: return createFlashType();
			case ExifPackage.GAIN_CONTROL_TYPE: return createGainControlType();
			case ExifPackage.GPS_ALTITUDE_REF_TYPE: return createGpsAltitudeRefType();
			case ExifPackage.GPS_BEARING_TYPE: return createGpsBearingType();
			case ExifPackage.GPS_DIFFERENTIAL_TYPE: return createGpsDifferentialType();
			case ExifPackage.GPS_DIRECTION_TYPE: return createGpsDirectionType();
			case ExifPackage.GPS_DISTANCE_REF_TYPE: return createGpsDistanceRefType();
			case ExifPackage.GPS_IFD_TYPE: return createGpsIfdType();
			case ExifPackage.GPS_LATITUDE_REF_TYPE: return createGpsLatitudeRefType();
			case ExifPackage.GPS_LATITUDE_TYPE: return createGpsLatitudeType();
			case ExifPackage.GPS_LONGITUDE_REF_TYPE: return createGpsLongitudeRefType();
			case ExifPackage.GPS_LONGITUDE_TYPE: return createGpsLongitudeType();
			case ExifPackage.GPS_MEASURE_MODE_TYPE: return createGpsMeasureModeType();
			case ExifPackage.GPS_SPEED_REF_TYPE: return createGpsSpeedRefType();
			case ExifPackage.GPS_STATUS_TYPE: return createGpsStatusType();
			case ExifPackage.INTEROPERABILITY_IFD_TYPE: return createInteroperabilityIfdType();
			case ExifPackage.INTEROPERABILITY_TYPE: return createInteroperabilityType();
			case ExifPackage.LIGHT_SOURCE_TYPE: return createLightSourceType();
			case ExifPackage.METERING_MODE_TYPE: return createMeteringModeType();
			case ExifPackage.NON_NEGATIVE_INTEGER_TYPE: return createNonNegativeIntegerType();
			case ExifPackage.NON_NEGATIVE_REAL_TYPE: return createNonNegativeRealType();
			case ExifPackage.ORIENTATION_TYPE: return createOrientationType();
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TYPE: return createPhotometricInterpretationType();
			case ExifPackage.PLANAR_CONFIGURATION_TYPE: return createPlanarConfigurationType();
			case ExifPackage.POSITIVE_INTEGER_TYPE: return createPositiveIntegerType();
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE: return createPrimaryChromaticitiesType();
			case ExifPackage.REAL_TYPE: return createRealType();
			case ExifPackage.REPEATED_FIELD_TYPE: return createRepeatedFieldType();
			case ExifPackage.RESOLUTION_TYPE: return createResolutionType();
			case ExifPackage.SATURATION_TYPE: return createSaturationType();
			case ExifPackage.SCENE_CAPTURE_TYPE: return createSceneCaptureType();
			case ExifPackage.SENSING_METHOD_TYPE: return createSensingMethodType();
			case ExifPackage.SHARPNESS_TYPE: return createSharpnessType();
			case ExifPackage.SINGLE_FIELD_T: return createSingleFieldT();
			case ExifPackage.SINGLE_FIELD_TYPE: return createSingleFieldType();
			case ExifPackage.STRING_TYPE: return createStringType();
			case ExifPackage.STRIP_BYTE_COUNTS_TYPE: return createStripByteCountsType();
			case ExifPackage.STRIP_BYTE_COUNT_TYPE: return createStripByteCountType();
			case ExifPackage.STRIP_OFFSETS_TYPE: return createStripOffsetsType();
			case ExifPackage.STRIP_OFFSET_TYPE: return createStripOffsetType();
			case ExifPackage.SUBJECT_AREA_TYPE: return createSubjectAreaType();
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TYPE: return createSubjectDistanceRangeType();
			case ExifPackage.SUBJECT_LOCATION_TYPE: return createSubjectLocationType();
			case ExifPackage.TIFF_IFD_TYPE: return createTiffIfdType();
			case ExifPackage.TIME_TYPE: return createTimeType();
			case ExifPackage.UUID_TYPE: return createUuidType();
			case ExifPackage.WHITE_BALANCE_TYPE: return createWhiteBalanceType();
			case ExifPackage.WHITE_POINT_TYPE: return createWhitePointType();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE: return createYCbCrCoefficientsType();
			case ExifPackage.YCB_CR_POSITIONING_TYPE: return createYCbCrPositioningType();
			case ExifPackage.YCB_CR_SUB_SAMPLING_TYPE: return createYCbCrSubSamplingType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExifPackage.BITS_PER_SAMPLE_T:
				return createBitsPerSampleTFromString(eDataType, initialValue);
			case ExifPackage.COLOR_SPACE_T:
				return createColorSpaceTFromString(eDataType, initialValue);
			case ExifPackage.COMPRESSION_T:
				return createCompressionTFromString(eDataType, initialValue);
			case ExifPackage.CONTRAST_T:
				return createContrastTFromString(eDataType, initialValue);
			case ExifPackage.CUSTOM_RENDERED_T:
				return createCustomRenderedTFromString(eDataType, initialValue);
			case ExifPackage.DATATYPE_TYPE:
				return createDatatypeTypeFromString(eDataType, initialValue);
			case ExifPackage.EXPOSURE_MODE_T:
				return createExposureModeTFromString(eDataType, initialValue);
			case ExifPackage.EXPOSURE_PROGRAM_T:
				return createExposureProgramTFromString(eDataType, initialValue);
			case ExifPackage.FILE_SOURCE_T:
				return createFileSourceTFromString(eDataType, initialValue);
			case ExifPackage.FLASH_MODE_T:
				return createFlashModeTFromString(eDataType, initialValue);
			case ExifPackage.FLASH_RETURN_T:
				return createFlashReturnTFromString(eDataType, initialValue);
			case ExifPackage.GAIN_CONTROL_T:
				return createGainControlTFromString(eDataType, initialValue);
			case ExifPackage.GPS_ALTITUDE_REF_T:
				return createGpsAltitudeRefTFromString(eDataType, initialValue);
			case ExifPackage.GPS_DIFFERENTIAL_T:
				return createGpsDifferentialTFromString(eDataType, initialValue);
			case ExifPackage.GPS_DIRECTION_T:
				return createGpsDirectionTFromString(eDataType, initialValue);
			case ExifPackage.GPS_DISTANCE_REF_T:
				return createGpsDistanceRefTFromString(eDataType, initialValue);
			case ExifPackage.GPS_LATITUDE_REF_T:
				return createGpsLatitudeRefTFromString(eDataType, initialValue);
			case ExifPackage.GPS_LONGITUDE_REF_T:
				return createGpsLongitudeRefTFromString(eDataType, initialValue);
			case ExifPackage.GPS_MEASURE_MODE_T:
				return createGpsMeasureModeTFromString(eDataType, initialValue);
			case ExifPackage.GPS_SPEED_REF_T:
				return createGpsSpeedRefTFromString(eDataType, initialValue);
			case ExifPackage.GPS_STATUS_T:
				return createGpsStatusTFromString(eDataType, initialValue);
			case ExifPackage.INTEROPERABILITY_T:
				return createInteroperabilityTFromString(eDataType, initialValue);
			case ExifPackage.LIGHT_SOURCE_T:
				return createLightSourceTFromString(eDataType, initialValue);
			case ExifPackage.METERING_MODE_T:
				return createMeteringModeTFromString(eDataType, initialValue);
			case ExifPackage.ORIENTATION_T:
				return createOrientationTFromString(eDataType, initialValue);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_T:
				return createPhotometricInterpretationTFromString(eDataType, initialValue);
			case ExifPackage.PLANAR_CONFIGURATION_T:
				return createPlanarConfigurationTFromString(eDataType, initialValue);
			case ExifPackage.RESOLUTION_T:
				return createResolutionTFromString(eDataType, initialValue);
			case ExifPackage.SATURATION_T:
				return createSaturationTFromString(eDataType, initialValue);
			case ExifPackage.SCENE_CAPTURE_T:
				return createSceneCaptureTFromString(eDataType, initialValue);
			case ExifPackage.SENSING_METHOD_T:
				return createSensingMethodTFromString(eDataType, initialValue);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_T:
				return createSubjectDistanceRangeTFromString(eDataType, initialValue);
			case ExifPackage.WHITE_BALANCE_T:
				return createWhiteBalanceTFromString(eDataType, initialValue);
			case ExifPackage.YCB_CR_POSITIONING_T:
				return createYCbCrPositioningTFromString(eDataType, initialValue);
			case ExifPackage.YCB_CR_SUB_SAMPLING_T:
				return createYCbCrSubSamplingTFromString(eDataType, initialValue);
			case ExifPackage.YES_NO_T:
				return createYesNoTFromString(eDataType, initialValue);
			case ExifPackage.BITS_PER_SAMPLE_TOBJECT:
				return createBitsPerSampleTObjectFromString(eDataType, initialValue);
			case ExifPackage.COLOR_SPACE_TOBJECT:
				return createColorSpaceTObjectFromString(eDataType, initialValue);
			case ExifPackage.COMPRESSION_TOBJECT:
				return createCompressionTObjectFromString(eDataType, initialValue);
			case ExifPackage.CONTRAST_TOBJECT:
				return createContrastTObjectFromString(eDataType, initialValue);
			case ExifPackage.CUSTOM_RENDERED_TOBJECT:
				return createCustomRenderedTObjectFromString(eDataType, initialValue);
			case ExifPackage.DATATYPE_TYPE_OBJECT:
				return createDatatypeTypeObjectFromString(eDataType, initialValue);
			case ExifPackage.EXPOSURE_MODE_TOBJECT:
				return createExposureModeTObjectFromString(eDataType, initialValue);
			case ExifPackage.EXPOSURE_PROGRAM_TOBJECT:
				return createExposureProgramTObjectFromString(eDataType, initialValue);
			case ExifPackage.FILE_SOURCE_TOBJECT:
				return createFileSourceTObjectFromString(eDataType, initialValue);
			case ExifPackage.FLASH_MODE_TOBJECT:
				return createFlashModeTObjectFromString(eDataType, initialValue);
			case ExifPackage.FLASH_RETURN_TOBJECT:
				return createFlashReturnTObjectFromString(eDataType, initialValue);
			case ExifPackage.GAIN_CONTROL_TOBJECT:
				return createGainControlTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_ALTITUDE_REF_TOBJECT:
				return createGpsAltitudeRefTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_BEARING_T:
				return createGpsBearingTFromString(eDataType, initialValue);
			case ExifPackage.GPS_BEARING_TOBJECT:
				return createGpsBearingTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_DIFFERENTIAL_TOBJECT:
				return createGpsDifferentialTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_DIRECTION_TOBJECT:
				return createGpsDirectionTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_DISTANCE_REF_TOBJECT:
				return createGpsDistanceRefTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_LATITUDE_REF_TOBJECT:
				return createGpsLatitudeRefTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_LATITUDE_T:
				return createGpsLatitudeTFromString(eDataType, initialValue);
			case ExifPackage.GPS_LATITUDE_TOBJECT:
				return createGpsLatitudeTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_LONGITUDE_REF_TOBJECT:
				return createGpsLongitudeRefTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_LONGITUDE_T:
				return createGpsLongitudeTFromString(eDataType, initialValue);
			case ExifPackage.GPS_LONGITUDE_TOBJECT:
				return createGpsLongitudeTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_MEASURE_MODE_TOBJECT:
				return createGpsMeasureModeTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_SPEED_REF_TOBJECT:
				return createGpsSpeedRefTObjectFromString(eDataType, initialValue);
			case ExifPackage.GPS_STATUS_TOBJECT:
				return createGpsStatusTObjectFromString(eDataType, initialValue);
			case ExifPackage.INTEROPERABILITY_TOBJECT:
				return createInteroperabilityTObjectFromString(eDataType, initialValue);
			case ExifPackage.LIGHT_SOURCE_TOBJECT:
				return createLightSourceTObjectFromString(eDataType, initialValue);
			case ExifPackage.METERING_MODE_TOBJECT:
				return createMeteringModeTObjectFromString(eDataType, initialValue);
			case ExifPackage.NON_NEGATIVE_REAL:
				return createNonNegativeRealFromString(eDataType, initialValue);
			case ExifPackage.NON_NEGATIVE_REAL_OBJECT:
				return createNonNegativeRealObjectFromString(eDataType, initialValue);
			case ExifPackage.ORIENTATION_TOBJECT:
				return createOrientationTObjectFromString(eDataType, initialValue);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TOBJECT:
				return createPhotometricInterpretationTObjectFromString(eDataType, initialValue);
			case ExifPackage.PLANAR_CONFIGURATION_TOBJECT:
				return createPlanarConfigurationTObjectFromString(eDataType, initialValue);
			case ExifPackage.RESOLUTION_TOBJECT:
				return createResolutionTObjectFromString(eDataType, initialValue);
			case ExifPackage.SATURATION_TOBJECT:
				return createSaturationTObjectFromString(eDataType, initialValue);
			case ExifPackage.SCENE_CAPTURE_TOBJECT:
				return createSceneCaptureTObjectFromString(eDataType, initialValue);
			case ExifPackage.SENSING_METHOD_TOBJECT:
				return createSensingMethodTObjectFromString(eDataType, initialValue);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TOBJECT:
				return createSubjectDistanceRangeTObjectFromString(eDataType, initialValue);
			case ExifPackage.UUID_T:
				return createUuidTFromString(eDataType, initialValue);
			case ExifPackage.WHITE_BALANCE_TOBJECT:
				return createWhiteBalanceTObjectFromString(eDataType, initialValue);
			case ExifPackage.YCB_CR_POSITIONING_TOBJECT:
				return createYCbCrPositioningTObjectFromString(eDataType, initialValue);
			case ExifPackage.YCB_CR_SUB_SAMPLING_TOBJECT:
				return createYCbCrSubSamplingTObjectFromString(eDataType, initialValue);
			case ExifPackage.YES_NO_TOBJECT:
				return createYesNoTObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExifPackage.BITS_PER_SAMPLE_T:
				return convertBitsPerSampleTToString(eDataType, instanceValue);
			case ExifPackage.COLOR_SPACE_T:
				return convertColorSpaceTToString(eDataType, instanceValue);
			case ExifPackage.COMPRESSION_T:
				return convertCompressionTToString(eDataType, instanceValue);
			case ExifPackage.CONTRAST_T:
				return convertContrastTToString(eDataType, instanceValue);
			case ExifPackage.CUSTOM_RENDERED_T:
				return convertCustomRenderedTToString(eDataType, instanceValue);
			case ExifPackage.DATATYPE_TYPE:
				return convertDatatypeTypeToString(eDataType, instanceValue);
			case ExifPackage.EXPOSURE_MODE_T:
				return convertExposureModeTToString(eDataType, instanceValue);
			case ExifPackage.EXPOSURE_PROGRAM_T:
				return convertExposureProgramTToString(eDataType, instanceValue);
			case ExifPackage.FILE_SOURCE_T:
				return convertFileSourceTToString(eDataType, instanceValue);
			case ExifPackage.FLASH_MODE_T:
				return convertFlashModeTToString(eDataType, instanceValue);
			case ExifPackage.FLASH_RETURN_T:
				return convertFlashReturnTToString(eDataType, instanceValue);
			case ExifPackage.GAIN_CONTROL_T:
				return convertGainControlTToString(eDataType, instanceValue);
			case ExifPackage.GPS_ALTITUDE_REF_T:
				return convertGpsAltitudeRefTToString(eDataType, instanceValue);
			case ExifPackage.GPS_DIFFERENTIAL_T:
				return convertGpsDifferentialTToString(eDataType, instanceValue);
			case ExifPackage.GPS_DIRECTION_T:
				return convertGpsDirectionTToString(eDataType, instanceValue);
			case ExifPackage.GPS_DISTANCE_REF_T:
				return convertGpsDistanceRefTToString(eDataType, instanceValue);
			case ExifPackage.GPS_LATITUDE_REF_T:
				return convertGpsLatitudeRefTToString(eDataType, instanceValue);
			case ExifPackage.GPS_LONGITUDE_REF_T:
				return convertGpsLongitudeRefTToString(eDataType, instanceValue);
			case ExifPackage.GPS_MEASURE_MODE_T:
				return convertGpsMeasureModeTToString(eDataType, instanceValue);
			case ExifPackage.GPS_SPEED_REF_T:
				return convertGpsSpeedRefTToString(eDataType, instanceValue);
			case ExifPackage.GPS_STATUS_T:
				return convertGpsStatusTToString(eDataType, instanceValue);
			case ExifPackage.INTEROPERABILITY_T:
				return convertInteroperabilityTToString(eDataType, instanceValue);
			case ExifPackage.LIGHT_SOURCE_T:
				return convertLightSourceTToString(eDataType, instanceValue);
			case ExifPackage.METERING_MODE_T:
				return convertMeteringModeTToString(eDataType, instanceValue);
			case ExifPackage.ORIENTATION_T:
				return convertOrientationTToString(eDataType, instanceValue);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_T:
				return convertPhotometricInterpretationTToString(eDataType, instanceValue);
			case ExifPackage.PLANAR_CONFIGURATION_T:
				return convertPlanarConfigurationTToString(eDataType, instanceValue);
			case ExifPackage.RESOLUTION_T:
				return convertResolutionTToString(eDataType, instanceValue);
			case ExifPackage.SATURATION_T:
				return convertSaturationTToString(eDataType, instanceValue);
			case ExifPackage.SCENE_CAPTURE_T:
				return convertSceneCaptureTToString(eDataType, instanceValue);
			case ExifPackage.SENSING_METHOD_T:
				return convertSensingMethodTToString(eDataType, instanceValue);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_T:
				return convertSubjectDistanceRangeTToString(eDataType, instanceValue);
			case ExifPackage.WHITE_BALANCE_T:
				return convertWhiteBalanceTToString(eDataType, instanceValue);
			case ExifPackage.YCB_CR_POSITIONING_T:
				return convertYCbCrPositioningTToString(eDataType, instanceValue);
			case ExifPackage.YCB_CR_SUB_SAMPLING_T:
				return convertYCbCrSubSamplingTToString(eDataType, instanceValue);
			case ExifPackage.YES_NO_T:
				return convertYesNoTToString(eDataType, instanceValue);
			case ExifPackage.BITS_PER_SAMPLE_TOBJECT:
				return convertBitsPerSampleTObjectToString(eDataType, instanceValue);
			case ExifPackage.COLOR_SPACE_TOBJECT:
				return convertColorSpaceTObjectToString(eDataType, instanceValue);
			case ExifPackage.COMPRESSION_TOBJECT:
				return convertCompressionTObjectToString(eDataType, instanceValue);
			case ExifPackage.CONTRAST_TOBJECT:
				return convertContrastTObjectToString(eDataType, instanceValue);
			case ExifPackage.CUSTOM_RENDERED_TOBJECT:
				return convertCustomRenderedTObjectToString(eDataType, instanceValue);
			case ExifPackage.DATATYPE_TYPE_OBJECT:
				return convertDatatypeTypeObjectToString(eDataType, instanceValue);
			case ExifPackage.EXPOSURE_MODE_TOBJECT:
				return convertExposureModeTObjectToString(eDataType, instanceValue);
			case ExifPackage.EXPOSURE_PROGRAM_TOBJECT:
				return convertExposureProgramTObjectToString(eDataType, instanceValue);
			case ExifPackage.FILE_SOURCE_TOBJECT:
				return convertFileSourceTObjectToString(eDataType, instanceValue);
			case ExifPackage.FLASH_MODE_TOBJECT:
				return convertFlashModeTObjectToString(eDataType, instanceValue);
			case ExifPackage.FLASH_RETURN_TOBJECT:
				return convertFlashReturnTObjectToString(eDataType, instanceValue);
			case ExifPackage.GAIN_CONTROL_TOBJECT:
				return convertGainControlTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_ALTITUDE_REF_TOBJECT:
				return convertGpsAltitudeRefTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_BEARING_T:
				return convertGpsBearingTToString(eDataType, instanceValue);
			case ExifPackage.GPS_BEARING_TOBJECT:
				return convertGpsBearingTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_DIFFERENTIAL_TOBJECT:
				return convertGpsDifferentialTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_DIRECTION_TOBJECT:
				return convertGpsDirectionTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_DISTANCE_REF_TOBJECT:
				return convertGpsDistanceRefTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_LATITUDE_REF_TOBJECT:
				return convertGpsLatitudeRefTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_LATITUDE_T:
				return convertGpsLatitudeTToString(eDataType, instanceValue);
			case ExifPackage.GPS_LATITUDE_TOBJECT:
				return convertGpsLatitudeTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_LONGITUDE_REF_TOBJECT:
				return convertGpsLongitudeRefTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_LONGITUDE_T:
				return convertGpsLongitudeTToString(eDataType, instanceValue);
			case ExifPackage.GPS_LONGITUDE_TOBJECT:
				return convertGpsLongitudeTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_MEASURE_MODE_TOBJECT:
				return convertGpsMeasureModeTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_SPEED_REF_TOBJECT:
				return convertGpsSpeedRefTObjectToString(eDataType, instanceValue);
			case ExifPackage.GPS_STATUS_TOBJECT:
				return convertGpsStatusTObjectToString(eDataType, instanceValue);
			case ExifPackage.INTEROPERABILITY_TOBJECT:
				return convertInteroperabilityTObjectToString(eDataType, instanceValue);
			case ExifPackage.LIGHT_SOURCE_TOBJECT:
				return convertLightSourceTObjectToString(eDataType, instanceValue);
			case ExifPackage.METERING_MODE_TOBJECT:
				return convertMeteringModeTObjectToString(eDataType, instanceValue);
			case ExifPackage.NON_NEGATIVE_REAL:
				return convertNonNegativeRealToString(eDataType, instanceValue);
			case ExifPackage.NON_NEGATIVE_REAL_OBJECT:
				return convertNonNegativeRealObjectToString(eDataType, instanceValue);
			case ExifPackage.ORIENTATION_TOBJECT:
				return convertOrientationTObjectToString(eDataType, instanceValue);
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TOBJECT:
				return convertPhotometricInterpretationTObjectToString(eDataType, instanceValue);
			case ExifPackage.PLANAR_CONFIGURATION_TOBJECT:
				return convertPlanarConfigurationTObjectToString(eDataType, instanceValue);
			case ExifPackage.RESOLUTION_TOBJECT:
				return convertResolutionTObjectToString(eDataType, instanceValue);
			case ExifPackage.SATURATION_TOBJECT:
				return convertSaturationTObjectToString(eDataType, instanceValue);
			case ExifPackage.SCENE_CAPTURE_TOBJECT:
				return convertSceneCaptureTObjectToString(eDataType, instanceValue);
			case ExifPackage.SENSING_METHOD_TOBJECT:
				return convertSensingMethodTObjectToString(eDataType, instanceValue);
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TOBJECT:
				return convertSubjectDistanceRangeTObjectToString(eDataType, instanceValue);
			case ExifPackage.UUID_T:
				return convertUuidTToString(eDataType, instanceValue);
			case ExifPackage.WHITE_BALANCE_TOBJECT:
				return convertWhiteBalanceTObjectToString(eDataType, instanceValue);
			case ExifPackage.YCB_CR_POSITIONING_TOBJECT:
				return convertYCbCrPositioningTObjectToString(eDataType, instanceValue);
			case ExifPackage.YCB_CR_SUB_SAMPLING_TOBJECT:
				return convertYCbCrSubSamplingTObjectToString(eDataType, instanceValue);
			case ExifPackage.YES_NO_TOBJECT:
				return convertYesNoTObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitsPerSampleType createBitsPerSampleType() {
		BitsPerSampleTypeImpl bitsPerSampleType = new BitsPerSampleTypeImpl();
		return bitsPerSampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromaticity createChromaticity() {
		ChromaticityImpl chromaticity = new ChromaticityImpl();
		return chromaticity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpaceType createColorSpaceType() {
		ColorSpaceTypeImpl colorSpaceType = new ColorSpaceTypeImpl();
		return colorSpaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType createCompressionType() {
		CompressionTypeImpl compressionType = new CompressionTypeImpl();
		return compressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastType createContrastType() {
		ContrastTypeImpl contrastType = new ContrastTypeImpl();
		return contrastType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRenderedType createCustomRenderedType() {
		CustomRenderedTypeImpl customRenderedType = new CustomRenderedTypeImpl();
		return customRenderedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType createDateTimeType() {
		DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
		return dateTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifIfdType createExifIfdType() {
		ExifIfdTypeImpl exifIfdType = new ExifIfdTypeImpl();
		return exifIfdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifMetadataType createExifMetadataType() {
		ExifMetadataTypeImpl exifMetadataType = new ExifMetadataTypeImpl();
		return exifMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureModeType createExposureModeType() {
		ExposureModeTypeImpl exposureModeType = new ExposureModeTypeImpl();
		return exposureModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureProgramType createExposureProgramType() {
		ExposureProgramTypeImpl exposureProgramType = new ExposureProgramTypeImpl();
		return exposureProgramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSourceType createFileSourceType() {
		FileSourceTypeImpl fileSourceType = new FileSourceTypeImpl();
		return fileSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashType createFlashType() {
		FlashTypeImpl flashType = new FlashTypeImpl();
		return flashType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GainControlType createGainControlType() {
		GainControlTypeImpl gainControlType = new GainControlTypeImpl();
		return gainControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsAltitudeRefType createGpsAltitudeRefType() {
		GpsAltitudeRefTypeImpl gpsAltitudeRefType = new GpsAltitudeRefTypeImpl();
		return gpsAltitudeRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsBearingType createGpsBearingType() {
		GpsBearingTypeImpl gpsBearingType = new GpsBearingTypeImpl();
		return gpsBearingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDifferentialType createGpsDifferentialType() {
		GpsDifferentialTypeImpl gpsDifferentialType = new GpsDifferentialTypeImpl();
		return gpsDifferentialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionType createGpsDirectionType() {
		GpsDirectionTypeImpl gpsDirectionType = new GpsDirectionTypeImpl();
		return gpsDirectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDistanceRefType createGpsDistanceRefType() {
		GpsDistanceRefTypeImpl gpsDistanceRefType = new GpsDistanceRefTypeImpl();
		return gpsDistanceRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsIfdType createGpsIfdType() {
		GpsIfdTypeImpl gpsIfdType = new GpsIfdTypeImpl();
		return gpsIfdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeRefType createGpsLatitudeRefType() {
		GpsLatitudeRefTypeImpl gpsLatitudeRefType = new GpsLatitudeRefTypeImpl();
		return gpsLatitudeRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeType createGpsLatitudeType() {
		GpsLatitudeTypeImpl gpsLatitudeType = new GpsLatitudeTypeImpl();
		return gpsLatitudeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeRefType createGpsLongitudeRefType() {
		GpsLongitudeRefTypeImpl gpsLongitudeRefType = new GpsLongitudeRefTypeImpl();
		return gpsLongitudeRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeType createGpsLongitudeType() {
		GpsLongitudeTypeImpl gpsLongitudeType = new GpsLongitudeTypeImpl();
		return gpsLongitudeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsMeasureModeType createGpsMeasureModeType() {
		GpsMeasureModeTypeImpl gpsMeasureModeType = new GpsMeasureModeTypeImpl();
		return gpsMeasureModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsSpeedRefType createGpsSpeedRefType() {
		GpsSpeedRefTypeImpl gpsSpeedRefType = new GpsSpeedRefTypeImpl();
		return gpsSpeedRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsStatusType createGpsStatusType() {
		GpsStatusTypeImpl gpsStatusType = new GpsStatusTypeImpl();
		return gpsStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityIfdType createInteroperabilityIfdType() {
		InteroperabilityIfdTypeImpl interoperabilityIfdType = new InteroperabilityIfdTypeImpl();
		return interoperabilityIfdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityType createInteroperabilityType() {
		InteroperabilityTypeImpl interoperabilityType = new InteroperabilityTypeImpl();
		return interoperabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSourceType createLightSourceType() {
		LightSourceTypeImpl lightSourceType = new LightSourceTypeImpl();
		return lightSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringModeType createMeteringModeType() {
		MeteringModeTypeImpl meteringModeType = new MeteringModeTypeImpl();
		return meteringModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeIntegerType createNonNegativeIntegerType() {
		NonNegativeIntegerTypeImpl nonNegativeIntegerType = new NonNegativeIntegerTypeImpl();
		return nonNegativeIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType createNonNegativeRealType() {
		NonNegativeRealTypeImpl nonNegativeRealType = new NonNegativeRealTypeImpl();
		return nonNegativeRealType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType createOrientationType() {
		OrientationTypeImpl orientationType = new OrientationTypeImpl();
		return orientationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotometricInterpretationType createPhotometricInterpretationType() {
		PhotometricInterpretationTypeImpl photometricInterpretationType = new PhotometricInterpretationTypeImpl();
		return photometricInterpretationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanarConfigurationType createPlanarConfigurationType() {
		PlanarConfigurationTypeImpl planarConfigurationType = new PlanarConfigurationTypeImpl();
		return planarConfigurationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType createPositiveIntegerType() {
		PositiveIntegerTypeImpl positiveIntegerType = new PositiveIntegerTypeImpl();
		return positiveIntegerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryChromaticitiesType createPrimaryChromaticitiesType() {
		PrimaryChromaticitiesTypeImpl primaryChromaticitiesType = new PrimaryChromaticitiesTypeImpl();
		return primaryChromaticitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType createRepeatedFieldType() {
		RepeatedFieldTypeImpl repeatedFieldType = new RepeatedFieldTypeImpl();
		return repeatedFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionType createResolutionType() {
		ResolutionTypeImpl resolutionType = new ResolutionTypeImpl();
		return resolutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaturationType createSaturationType() {
		SaturationTypeImpl saturationType = new SaturationTypeImpl();
		return saturationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneCaptureType createSceneCaptureType() {
		SceneCaptureTypeImpl sceneCaptureType = new SceneCaptureTypeImpl();
		return sceneCaptureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingMethodType createSensingMethodType() {
		SensingMethodTypeImpl sensingMethodType = new SensingMethodTypeImpl();
		return sensingMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharpnessType createSharpnessType() {
		SharpnessTypeImpl sharpnessType = new SharpnessTypeImpl();
		return sharpnessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldT createSingleFieldT() {
		SingleFieldTImpl singleFieldT = new SingleFieldTImpl();
		return singleFieldT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType createSingleFieldType() {
		SingleFieldTypeImpl singleFieldType = new SingleFieldTypeImpl();
		return singleFieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripByteCountsType createStripByteCountsType() {
		StripByteCountsTypeImpl stripByteCountsType = new StripByteCountsTypeImpl();
		return stripByteCountsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripByteCountType createStripByteCountType() {
		StripByteCountTypeImpl stripByteCountType = new StripByteCountTypeImpl();
		return stripByteCountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripOffsetsType createStripOffsetsType() {
		StripOffsetsTypeImpl stripOffsetsType = new StripOffsetsTypeImpl();
		return stripOffsetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripOffsetType createStripOffsetType() {
		StripOffsetTypeImpl stripOffsetType = new StripOffsetTypeImpl();
		return stripOffsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaType createSubjectAreaType() {
		SubjectAreaTypeImpl subjectAreaType = new SubjectAreaTypeImpl();
		return subjectAreaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDistanceRangeType createSubjectDistanceRangeType() {
		SubjectDistanceRangeTypeImpl subjectDistanceRangeType = new SubjectDistanceRangeTypeImpl();
		return subjectDistanceRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectLocationType createSubjectLocationType() {
		SubjectLocationTypeImpl subjectLocationType = new SubjectLocationTypeImpl();
		return subjectLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiffIfdType createTiffIfdType() {
		TiffIfdTypeImpl tiffIfdType = new TiffIfdTypeImpl();
		return tiffIfdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UuidType createUuidType() {
		UuidTypeImpl uuidType = new UuidTypeImpl();
		return uuidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBalanceType createWhiteBalanceType() {
		WhiteBalanceTypeImpl whiteBalanceType = new WhiteBalanceTypeImpl();
		return whiteBalanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitePointType createWhitePointType() {
		WhitePointTypeImpl whitePointType = new WhitePointTypeImpl();
		return whitePointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrCoefficientsType createYCbCrCoefficientsType() {
		YCbCrCoefficientsTypeImpl yCbCrCoefficientsType = new YCbCrCoefficientsTypeImpl();
		return yCbCrCoefficientsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrPositioningType createYCbCrPositioningType() {
		YCbCrPositioningTypeImpl yCbCrPositioningType = new YCbCrPositioningTypeImpl();
		return yCbCrPositioningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrSubSamplingType createYCbCrSubSamplingType() {
		YCbCrSubSamplingTypeImpl yCbCrSubSamplingType = new YCbCrSubSamplingTypeImpl();
		return yCbCrSubSamplingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitsPerSampleT createBitsPerSampleTFromString(EDataType eDataType, String initialValue) {
		BitsPerSampleT result = BitsPerSampleT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitsPerSampleTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpaceT createColorSpaceTFromString(EDataType eDataType, String initialValue) {
		ColorSpaceT result = ColorSpaceT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorSpaceTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionT createCompressionTFromString(EDataType eDataType, String initialValue) {
		CompressionT result = CompressionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastT createContrastTFromString(EDataType eDataType, String initialValue) {
		ContrastT result = ContrastT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContrastTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRenderedT createCustomRenderedTFromString(EDataType eDataType, String initialValue) {
		CustomRenderedT result = CustomRenderedT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomRenderedTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeType createDatatypeTypeFromString(EDataType eDataType, String initialValue) {
		DatatypeType result = DatatypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureModeT createExposureModeTFromString(EDataType eDataType, String initialValue) {
		ExposureModeT result = ExposureModeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureModeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureProgramT createExposureProgramTFromString(EDataType eDataType, String initialValue) {
		ExposureProgramT result = ExposureProgramT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureProgramTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSourceT createFileSourceTFromString(EDataType eDataType, String initialValue) {
		FileSourceT result = FileSourceT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileSourceTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashModeT createFlashModeTFromString(EDataType eDataType, String initialValue) {
		FlashModeT result = FlashModeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlashModeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashReturnT createFlashReturnTFromString(EDataType eDataType, String initialValue) {
		FlashReturnT result = FlashReturnT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlashReturnTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GainControlT createGainControlTFromString(EDataType eDataType, String initialValue) {
		GainControlT result = GainControlT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGainControlTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsAltitudeRefT createGpsAltitudeRefTFromString(EDataType eDataType, String initialValue) {
		GpsAltitudeRefT result = GpsAltitudeRefT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsAltitudeRefTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDifferentialT createGpsDifferentialTFromString(EDataType eDataType, String initialValue) {
		GpsDifferentialT result = GpsDifferentialT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDifferentialTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionT createGpsDirectionTFromString(EDataType eDataType, String initialValue) {
		GpsDirectionT result = GpsDirectionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDirectionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDistanceRefT createGpsDistanceRefTFromString(EDataType eDataType, String initialValue) {
		GpsDistanceRefT result = GpsDistanceRefT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDistanceRefTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeRefT createGpsLatitudeRefTFromString(EDataType eDataType, String initialValue) {
		GpsLatitudeRefT result = GpsLatitudeRefT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLatitudeRefTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeRefT createGpsLongitudeRefTFromString(EDataType eDataType, String initialValue) {
		GpsLongitudeRefT result = GpsLongitudeRefT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLongitudeRefTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsMeasureModeT createGpsMeasureModeTFromString(EDataType eDataType, String initialValue) {
		GpsMeasureModeT result = GpsMeasureModeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsMeasureModeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsSpeedRefT createGpsSpeedRefTFromString(EDataType eDataType, String initialValue) {
		GpsSpeedRefT result = GpsSpeedRefT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsSpeedRefTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsStatusT createGpsStatusTFromString(EDataType eDataType, String initialValue) {
		GpsStatusT result = GpsStatusT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsStatusTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityT createInteroperabilityTFromString(EDataType eDataType, String initialValue) {
		InteroperabilityT result = InteroperabilityT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteroperabilityTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSourceT createLightSourceTFromString(EDataType eDataType, String initialValue) {
		LightSourceT result = LightSourceT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightSourceTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringModeT createMeteringModeTFromString(EDataType eDataType, String initialValue) {
		MeteringModeT result = MeteringModeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeteringModeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationT createOrientationTFromString(EDataType eDataType, String initialValue) {
		OrientationT result = OrientationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotometricInterpretationT createPhotometricInterpretationTFromString(EDataType eDataType, String initialValue) {
		PhotometricInterpretationT result = PhotometricInterpretationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhotometricInterpretationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanarConfigurationT createPlanarConfigurationTFromString(EDataType eDataType, String initialValue) {
		PlanarConfigurationT result = PlanarConfigurationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanarConfigurationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionT createResolutionTFromString(EDataType eDataType, String initialValue) {
		ResolutionT result = ResolutionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaturationT createSaturationTFromString(EDataType eDataType, String initialValue) {
		SaturationT result = SaturationT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSaturationTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneCaptureT createSceneCaptureTFromString(EDataType eDataType, String initialValue) {
		SceneCaptureT result = SceneCaptureT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSceneCaptureTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingMethodT createSensingMethodTFromString(EDataType eDataType, String initialValue) {
		SensingMethodT result = SensingMethodT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensingMethodTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDistanceRangeT createSubjectDistanceRangeTFromString(EDataType eDataType, String initialValue) {
		SubjectDistanceRangeT result = SubjectDistanceRangeT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubjectDistanceRangeTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBalanceT createWhiteBalanceTFromString(EDataType eDataType, String initialValue) {
		WhiteBalanceT result = WhiteBalanceT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteBalanceTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrPositioningT createYCbCrPositioningTFromString(EDataType eDataType, String initialValue) {
		YCbCrPositioningT result = YCbCrPositioningT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYCbCrPositioningTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrSubSamplingT createYCbCrSubSamplingTFromString(EDataType eDataType, String initialValue) {
		YCbCrSubSamplingT result = YCbCrSubSamplingT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYCbCrSubSamplingTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoT createYesNoTFromString(EDataType eDataType, String initialValue) {
		YesNoT result = YesNoT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYesNoTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitsPerSampleT createBitsPerSampleTObjectFromString(EDataType eDataType, String initialValue) {
		return createBitsPerSampleTFromString(ExifPackage.eINSTANCE.getBitsPerSampleT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBitsPerSampleTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertBitsPerSampleTToString(ExifPackage.eINSTANCE.getBitsPerSampleT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpaceT createColorSpaceTObjectFromString(EDataType eDataType, String initialValue) {
		return createColorSpaceTFromString(ExifPackage.eINSTANCE.getColorSpaceT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorSpaceTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertColorSpaceTToString(ExifPackage.eINSTANCE.getColorSpaceT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionT createCompressionTObjectFromString(EDataType eDataType, String initialValue) {
		return createCompressionTFromString(ExifPackage.eINSTANCE.getCompressionT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompressionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompressionTToString(ExifPackage.eINSTANCE.getCompressionT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContrastT createContrastTObjectFromString(EDataType eDataType, String initialValue) {
		return createContrastTFromString(ExifPackage.eINSTANCE.getContrastT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContrastTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertContrastTToString(ExifPackage.eINSTANCE.getContrastT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRenderedT createCustomRenderedTObjectFromString(EDataType eDataType, String initialValue) {
		return createCustomRenderedTFromString(ExifPackage.eINSTANCE.getCustomRenderedT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCustomRenderedTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCustomRenderedTToString(ExifPackage.eINSTANCE.getCustomRenderedT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeType createDatatypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeTypeFromString(ExifPackage.eINSTANCE.getDatatypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeTypeToString(ExifPackage.eINSTANCE.getDatatypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureModeT createExposureModeTObjectFromString(EDataType eDataType, String initialValue) {
		return createExposureModeTFromString(ExifPackage.eINSTANCE.getExposureModeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureModeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExposureModeTToString(ExifPackage.eINSTANCE.getExposureModeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureProgramT createExposureProgramTObjectFromString(EDataType eDataType, String initialValue) {
		return createExposureProgramTFromString(ExifPackage.eINSTANCE.getExposureProgramT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureProgramTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExposureProgramTToString(ExifPackage.eINSTANCE.getExposureProgramT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSourceT createFileSourceTObjectFromString(EDataType eDataType, String initialValue) {
		return createFileSourceTFromString(ExifPackage.eINSTANCE.getFileSourceT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileSourceTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFileSourceTToString(ExifPackage.eINSTANCE.getFileSourceT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashModeT createFlashModeTObjectFromString(EDataType eDataType, String initialValue) {
		return createFlashModeTFromString(ExifPackage.eINSTANCE.getFlashModeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlashModeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlashModeTToString(ExifPackage.eINSTANCE.getFlashModeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashReturnT createFlashReturnTObjectFromString(EDataType eDataType, String initialValue) {
		return createFlashReturnTFromString(ExifPackage.eINSTANCE.getFlashReturnT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFlashReturnTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFlashReturnTToString(ExifPackage.eINSTANCE.getFlashReturnT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GainControlT createGainControlTObjectFromString(EDataType eDataType, String initialValue) {
		return createGainControlTFromString(ExifPackage.eINSTANCE.getGainControlT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGainControlTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGainControlTToString(ExifPackage.eINSTANCE.getGainControlT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsAltitudeRefT createGpsAltitudeRefTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsAltitudeRefTFromString(ExifPackage.eINSTANCE.getGpsAltitudeRefT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsAltitudeRefTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsAltitudeRefTToString(ExifPackage.eINSTANCE.getGpsAltitudeRefT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsBearingTFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsBearingTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsBearingTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsBearingTFromString(ExifPackage.eINSTANCE.getGpsBearingT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsBearingTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsBearingTToString(ExifPackage.eINSTANCE.getGpsBearingT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDifferentialT createGpsDifferentialTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsDifferentialTFromString(ExifPackage.eINSTANCE.getGpsDifferentialT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDifferentialTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsDifferentialTToString(ExifPackage.eINSTANCE.getGpsDifferentialT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDirectionT createGpsDirectionTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsDirectionTFromString(ExifPackage.eINSTANCE.getGpsDirectionT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDirectionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsDirectionTToString(ExifPackage.eINSTANCE.getGpsDirectionT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsDistanceRefT createGpsDistanceRefTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsDistanceRefTFromString(ExifPackage.eINSTANCE.getGpsDistanceRefT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsDistanceRefTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsDistanceRefTToString(ExifPackage.eINSTANCE.getGpsDistanceRefT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLatitudeRefT createGpsLatitudeRefTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsLatitudeRefTFromString(ExifPackage.eINSTANCE.getGpsLatitudeRefT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLatitudeRefTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsLatitudeRefTToString(ExifPackage.eINSTANCE.getGpsLatitudeRefT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsLatitudeTFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLatitudeTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsLatitudeTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsLatitudeTFromString(ExifPackage.eINSTANCE.getGpsLatitudeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLatitudeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsLatitudeTToString(ExifPackage.eINSTANCE.getGpsLatitudeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsLongitudeRefT createGpsLongitudeRefTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsLongitudeRefTFromString(ExifPackage.eINSTANCE.getGpsLongitudeRefT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLongitudeRefTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsLongitudeRefTToString(ExifPackage.eINSTANCE.getGpsLongitudeRefT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsLongitudeTFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLongitudeTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createGpsLongitudeTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsLongitudeTFromString(ExifPackage.eINSTANCE.getGpsLongitudeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsLongitudeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsLongitudeTToString(ExifPackage.eINSTANCE.getGpsLongitudeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsMeasureModeT createGpsMeasureModeTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsMeasureModeTFromString(ExifPackage.eINSTANCE.getGpsMeasureModeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsMeasureModeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsMeasureModeTToString(ExifPackage.eINSTANCE.getGpsMeasureModeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsSpeedRefT createGpsSpeedRefTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsSpeedRefTFromString(ExifPackage.eINSTANCE.getGpsSpeedRefT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsSpeedRefTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsSpeedRefTToString(ExifPackage.eINSTANCE.getGpsSpeedRefT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GpsStatusT createGpsStatusTObjectFromString(EDataType eDataType, String initialValue) {
		return createGpsStatusTFromString(ExifPackage.eINSTANCE.getGpsStatusT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGpsStatusTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGpsStatusTToString(ExifPackage.eINSTANCE.getGpsStatusT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityT createInteroperabilityTObjectFromString(EDataType eDataType, String initialValue) {
		return createInteroperabilityTFromString(ExifPackage.eINSTANCE.getInteroperabilityT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteroperabilityTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInteroperabilityTToString(ExifPackage.eINSTANCE.getInteroperabilityT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSourceT createLightSourceTObjectFromString(EDataType eDataType, String initialValue) {
		return createLightSourceTFromString(ExifPackage.eINSTANCE.getLightSourceT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLightSourceTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLightSourceTToString(ExifPackage.eINSTANCE.getLightSourceT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeteringModeT createMeteringModeTObjectFromString(EDataType eDataType, String initialValue) {
		return createMeteringModeTFromString(ExifPackage.eINSTANCE.getMeteringModeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeteringModeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMeteringModeTToString(ExifPackage.eINSTANCE.getMeteringModeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeRealFromString(EDataType eDataType, String initialValue) {
		return (Float)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.FLOAT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeRealToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.FLOAT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNonNegativeRealObjectFromString(EDataType eDataType, String initialValue) {
		return createNonNegativeRealFromString(ExifPackage.eINSTANCE.getNonNegativeReal(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonNegativeRealObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNonNegativeRealToString(ExifPackage.eINSTANCE.getNonNegativeReal(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationT createOrientationTObjectFromString(EDataType eDataType, String initialValue) {
		return createOrientationTFromString(ExifPackage.eINSTANCE.getOrientationT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrientationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrientationTToString(ExifPackage.eINSTANCE.getOrientationT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotometricInterpretationT createPhotometricInterpretationTObjectFromString(EDataType eDataType, String initialValue) {
		return createPhotometricInterpretationTFromString(ExifPackage.eINSTANCE.getPhotometricInterpretationT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPhotometricInterpretationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPhotometricInterpretationTToString(ExifPackage.eINSTANCE.getPhotometricInterpretationT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanarConfigurationT createPlanarConfigurationTObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanarConfigurationTFromString(ExifPackage.eINSTANCE.getPlanarConfigurationT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanarConfigurationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanarConfigurationTToString(ExifPackage.eINSTANCE.getPlanarConfigurationT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionT createResolutionTObjectFromString(EDataType eDataType, String initialValue) {
		return createResolutionTFromString(ExifPackage.eINSTANCE.getResolutionT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResolutionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResolutionTToString(ExifPackage.eINSTANCE.getResolutionT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SaturationT createSaturationTObjectFromString(EDataType eDataType, String initialValue) {
		return createSaturationTFromString(ExifPackage.eINSTANCE.getSaturationT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSaturationTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSaturationTToString(ExifPackage.eINSTANCE.getSaturationT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneCaptureT createSceneCaptureTObjectFromString(EDataType eDataType, String initialValue) {
		return createSceneCaptureTFromString(ExifPackage.eINSTANCE.getSceneCaptureT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSceneCaptureTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSceneCaptureTToString(ExifPackage.eINSTANCE.getSceneCaptureT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensingMethodT createSensingMethodTObjectFromString(EDataType eDataType, String initialValue) {
		return createSensingMethodTFromString(ExifPackage.eINSTANCE.getSensingMethodT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensingMethodTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSensingMethodTToString(ExifPackage.eINSTANCE.getSensingMethodT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectDistanceRangeT createSubjectDistanceRangeTObjectFromString(EDataType eDataType, String initialValue) {
		return createSubjectDistanceRangeTFromString(ExifPackage.eINSTANCE.getSubjectDistanceRangeT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubjectDistanceRangeTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubjectDistanceRangeTToString(ExifPackage.eINSTANCE.getSubjectDistanceRangeT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] createUuidTFromString(EDataType eDataType, String initialValue) {
		return (byte[])XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.HEX_BINARY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUuidTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.HEX_BINARY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhiteBalanceT createWhiteBalanceTObjectFromString(EDataType eDataType, String initialValue) {
		return createWhiteBalanceTFromString(ExifPackage.eINSTANCE.getWhiteBalanceT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhiteBalanceTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWhiteBalanceTToString(ExifPackage.eINSTANCE.getWhiteBalanceT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrPositioningT createYCbCrPositioningTObjectFromString(EDataType eDataType, String initialValue) {
		return createYCbCrPositioningTFromString(ExifPackage.eINSTANCE.getYCbCrPositioningT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYCbCrPositioningTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYCbCrPositioningTToString(ExifPackage.eINSTANCE.getYCbCrPositioningT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrSubSamplingT createYCbCrSubSamplingTObjectFromString(EDataType eDataType, String initialValue) {
		return createYCbCrSubSamplingTFromString(ExifPackage.eINSTANCE.getYCbCrSubSamplingT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYCbCrSubSamplingTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYCbCrSubSamplingTToString(ExifPackage.eINSTANCE.getYCbCrSubSamplingT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoT createYesNoTObjectFromString(EDataType eDataType, String initialValue) {
		return createYesNoTFromString(ExifPackage.eINSTANCE.getYesNoT(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertYesNoTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertYesNoTToString(ExifPackage.eINSTANCE.getYesNoT(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifPackage getExifPackage() {
		return (ExifPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExifPackage getPackage() {
		return ExifPackage.eINSTANCE;
	}

} //ExifFactoryImpl
