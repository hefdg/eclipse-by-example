/**
 */
package com.oracle.xmlns.ord.meta.exif.util;

import com.oracle.xmlns.ord.meta.exif.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage
 * @generated
 */
public class ExifSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExifPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifSwitch() {
		if (modelPackage == null) {
			modelPackage = ExifPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExifPackage.BITS_PER_SAMPLE_TYPE: {
				BitsPerSampleType bitsPerSampleType = (BitsPerSampleType)theEObject;
				T result = caseBitsPerSampleType(bitsPerSampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.CHROMATICITY: {
				Chromaticity chromaticity = (Chromaticity)theEObject;
				T result = caseChromaticity(chromaticity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.COLOR_SPACE_TYPE: {
				ColorSpaceType colorSpaceType = (ColorSpaceType)theEObject;
				T result = caseColorSpaceType(colorSpaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.COMPRESSION_TYPE: {
				CompressionType compressionType = (CompressionType)theEObject;
				T result = caseCompressionType(compressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.CONTRAST_TYPE: {
				ContrastType contrastType = (ContrastType)theEObject;
				T result = caseContrastType(contrastType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.CUSTOM_RENDERED_TYPE: {
				CustomRenderedType customRenderedType = (CustomRenderedType)theEObject;
				T result = caseCustomRenderedType(customRenderedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.DATE_TIME_TYPE: {
				DateTimeType dateTimeType = (DateTimeType)theEObject;
				T result = caseDateTimeType(dateTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.EXIF_IFD_TYPE: {
				ExifIfdType exifIfdType = (ExifIfdType)theEObject;
				T result = caseExifIfdType(exifIfdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.EXIF_METADATA_TYPE: {
				ExifMetadataType exifMetadataType = (ExifMetadataType)theEObject;
				T result = caseExifMetadataType(exifMetadataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.EXPOSURE_MODE_TYPE: {
				ExposureModeType exposureModeType = (ExposureModeType)theEObject;
				T result = caseExposureModeType(exposureModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.EXPOSURE_PROGRAM_TYPE: {
				ExposureProgramType exposureProgramType = (ExposureProgramType)theEObject;
				T result = caseExposureProgramType(exposureProgramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.FILE_SOURCE_TYPE: {
				FileSourceType fileSourceType = (FileSourceType)theEObject;
				T result = caseFileSourceType(fileSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.FLASH_TYPE: {
				FlashType flashType = (FlashType)theEObject;
				T result = caseFlashType(flashType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GAIN_CONTROL_TYPE: {
				GainControlType gainControlType = (GainControlType)theEObject;
				T result = caseGainControlType(gainControlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_ALTITUDE_REF_TYPE: {
				GpsAltitudeRefType gpsAltitudeRefType = (GpsAltitudeRefType)theEObject;
				T result = caseGpsAltitudeRefType(gpsAltitudeRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_BEARING_TYPE: {
				GpsBearingType gpsBearingType = (GpsBearingType)theEObject;
				T result = caseGpsBearingType(gpsBearingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_DIFFERENTIAL_TYPE: {
				GpsDifferentialType gpsDifferentialType = (GpsDifferentialType)theEObject;
				T result = caseGpsDifferentialType(gpsDifferentialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_DIRECTION_TYPE: {
				GpsDirectionType gpsDirectionType = (GpsDirectionType)theEObject;
				T result = caseGpsDirectionType(gpsDirectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_DISTANCE_REF_TYPE: {
				GpsDistanceRefType gpsDistanceRefType = (GpsDistanceRefType)theEObject;
				T result = caseGpsDistanceRefType(gpsDistanceRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_IFD_TYPE: {
				GpsIfdType gpsIfdType = (GpsIfdType)theEObject;
				T result = caseGpsIfdType(gpsIfdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_LATITUDE_REF_TYPE: {
				GpsLatitudeRefType gpsLatitudeRefType = (GpsLatitudeRefType)theEObject;
				T result = caseGpsLatitudeRefType(gpsLatitudeRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_LATITUDE_TYPE: {
				GpsLatitudeType gpsLatitudeType = (GpsLatitudeType)theEObject;
				T result = caseGpsLatitudeType(gpsLatitudeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_LONGITUDE_REF_TYPE: {
				GpsLongitudeRefType gpsLongitudeRefType = (GpsLongitudeRefType)theEObject;
				T result = caseGpsLongitudeRefType(gpsLongitudeRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_LONGITUDE_TYPE: {
				GpsLongitudeType gpsLongitudeType = (GpsLongitudeType)theEObject;
				T result = caseGpsLongitudeType(gpsLongitudeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_MEASURE_MODE_TYPE: {
				GpsMeasureModeType gpsMeasureModeType = (GpsMeasureModeType)theEObject;
				T result = caseGpsMeasureModeType(gpsMeasureModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_SPEED_REF_TYPE: {
				GpsSpeedRefType gpsSpeedRefType = (GpsSpeedRefType)theEObject;
				T result = caseGpsSpeedRefType(gpsSpeedRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.GPS_STATUS_TYPE: {
				GpsStatusType gpsStatusType = (GpsStatusType)theEObject;
				T result = caseGpsStatusType(gpsStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.INTEROPERABILITY_IFD_TYPE: {
				InteroperabilityIfdType interoperabilityIfdType = (InteroperabilityIfdType)theEObject;
				T result = caseInteroperabilityIfdType(interoperabilityIfdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.INTEROPERABILITY_TYPE: {
				InteroperabilityType interoperabilityType = (InteroperabilityType)theEObject;
				T result = caseInteroperabilityType(interoperabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.LIGHT_SOURCE_TYPE: {
				LightSourceType lightSourceType = (LightSourceType)theEObject;
				T result = caseLightSourceType(lightSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.METERING_MODE_TYPE: {
				MeteringModeType meteringModeType = (MeteringModeType)theEObject;
				T result = caseMeteringModeType(meteringModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.NON_NEGATIVE_INTEGER_TYPE: {
				NonNegativeIntegerType nonNegativeIntegerType = (NonNegativeIntegerType)theEObject;
				T result = caseNonNegativeIntegerType(nonNegativeIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.NON_NEGATIVE_REAL_TYPE: {
				NonNegativeRealType nonNegativeRealType = (NonNegativeRealType)theEObject;
				T result = caseNonNegativeRealType(nonNegativeRealType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.ORIENTATION_TYPE: {
				OrientationType orientationType = (OrientationType)theEObject;
				T result = caseOrientationType(orientationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.PHOTOMETRIC_INTERPRETATION_TYPE: {
				PhotometricInterpretationType photometricInterpretationType = (PhotometricInterpretationType)theEObject;
				T result = casePhotometricInterpretationType(photometricInterpretationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.PLANAR_CONFIGURATION_TYPE: {
				PlanarConfigurationType planarConfigurationType = (PlanarConfigurationType)theEObject;
				T result = casePlanarConfigurationType(planarConfigurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.POSITIVE_INTEGER_TYPE: {
				PositiveIntegerType positiveIntegerType = (PositiveIntegerType)theEObject;
				T result = casePositiveIntegerType(positiveIntegerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE: {
				PrimaryChromaticitiesType primaryChromaticitiesType = (PrimaryChromaticitiesType)theEObject;
				T result = casePrimaryChromaticitiesType(primaryChromaticitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.REAL_TYPE: {
				RealType realType = (RealType)theEObject;
				T result = caseRealType(realType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.REPEATED_FIELD_TYPE: {
				RepeatedFieldType repeatedFieldType = (RepeatedFieldType)theEObject;
				T result = caseRepeatedFieldType(repeatedFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.RESOLUTION_TYPE: {
				ResolutionType resolutionType = (ResolutionType)theEObject;
				T result = caseResolutionType(resolutionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SATURATION_TYPE: {
				SaturationType saturationType = (SaturationType)theEObject;
				T result = caseSaturationType(saturationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SCENE_CAPTURE_TYPE: {
				SceneCaptureType sceneCaptureType = (SceneCaptureType)theEObject;
				T result = caseSceneCaptureType(sceneCaptureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SENSING_METHOD_TYPE: {
				SensingMethodType sensingMethodType = (SensingMethodType)theEObject;
				T result = caseSensingMethodType(sensingMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SHARPNESS_TYPE: {
				SharpnessType sharpnessType = (SharpnessType)theEObject;
				T result = caseSharpnessType(sharpnessType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SINGLE_FIELD_T: {
				SingleFieldT singleFieldT = (SingleFieldT)theEObject;
				T result = caseSingleFieldT(singleFieldT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SINGLE_FIELD_TYPE: {
				SingleFieldType singleFieldType = (SingleFieldType)theEObject;
				T result = caseSingleFieldType(singleFieldType);
				if (result == null) result = caseSingleFieldT(singleFieldType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.STRIP_BYTE_COUNTS_TYPE: {
				StripByteCountsType stripByteCountsType = (StripByteCountsType)theEObject;
				T result = caseStripByteCountsType(stripByteCountsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.STRIP_BYTE_COUNT_TYPE: {
				StripByteCountType stripByteCountType = (StripByteCountType)theEObject;
				T result = caseStripByteCountType(stripByteCountType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.STRIP_OFFSETS_TYPE: {
				StripOffsetsType stripOffsetsType = (StripOffsetsType)theEObject;
				T result = caseStripOffsetsType(stripOffsetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.STRIP_OFFSET_TYPE: {
				StripOffsetType stripOffsetType = (StripOffsetType)theEObject;
				T result = caseStripOffsetType(stripOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SUBJECT_AREA_TYPE: {
				SubjectAreaType subjectAreaType = (SubjectAreaType)theEObject;
				T result = caseSubjectAreaType(subjectAreaType);
				if (result == null) result = caseSubjectLocationType(subjectAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SUBJECT_DISTANCE_RANGE_TYPE: {
				SubjectDistanceRangeType subjectDistanceRangeType = (SubjectDistanceRangeType)theEObject;
				T result = caseSubjectDistanceRangeType(subjectDistanceRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.SUBJECT_LOCATION_TYPE: {
				SubjectLocationType subjectLocationType = (SubjectLocationType)theEObject;
				T result = caseSubjectLocationType(subjectLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.TIFF_IFD_TYPE: {
				TiffIfdType tiffIfdType = (TiffIfdType)theEObject;
				T result = caseTiffIfdType(tiffIfdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.UUID_TYPE: {
				UuidType uuidType = (UuidType)theEObject;
				T result = caseUuidType(uuidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.WHITE_BALANCE_TYPE: {
				WhiteBalanceType whiteBalanceType = (WhiteBalanceType)theEObject;
				T result = caseWhiteBalanceType(whiteBalanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.WHITE_POINT_TYPE: {
				WhitePointType whitePointType = (WhitePointType)theEObject;
				T result = caseWhitePointType(whitePointType);
				if (result == null) result = caseChromaticity(whitePointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE: {
				YCbCrCoefficientsType yCbCrCoefficientsType = (YCbCrCoefficientsType)theEObject;
				T result = caseYCbCrCoefficientsType(yCbCrCoefficientsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.YCB_CR_POSITIONING_TYPE: {
				YCbCrPositioningType yCbCrPositioningType = (YCbCrPositioningType)theEObject;
				T result = caseYCbCrPositioningType(yCbCrPositioningType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExifPackage.YCB_CR_SUB_SAMPLING_TYPE: {
				YCbCrSubSamplingType yCbCrSubSamplingType = (YCbCrSubSamplingType)theEObject;
				T result = caseYCbCrSubSamplingType(yCbCrSubSamplingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bits Per Sample Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bits Per Sample Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitsPerSampleType(BitsPerSampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chromaticity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chromaticity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChromaticity(Chromaticity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Space Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Space Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorSpaceType(ColorSpaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompressionType(CompressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contrast Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contrast Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContrastType(ContrastType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Rendered Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Rendered Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomRenderedType(CustomRenderedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeType(DateTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ifd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ifd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExifIfdType(ExifIfdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExifMetadataType(ExifMetadataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposureModeType(ExposureModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exposure Program Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exposure Program Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExposureProgramType(ExposureProgramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSourceType(FileSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flash Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flash Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlashType(FlashType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gain Control Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gain Control Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGainControlType(GainControlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Altitude Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Altitude Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsAltitudeRefType(GpsAltitudeRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Bearing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Bearing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsBearingType(GpsBearingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Differential Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Differential Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsDifferentialType(GpsDifferentialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Direction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Direction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsDirectionType(GpsDirectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Distance Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Distance Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsDistanceRefType(GpsDistanceRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Ifd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Ifd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsIfdType(GpsIfdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Latitude Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Latitude Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsLatitudeRefType(GpsLatitudeRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Latitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Latitude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsLatitudeType(GpsLatitudeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Longitude Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Longitude Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsLongitudeRefType(GpsLongitudeRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Longitude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Longitude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsLongitudeType(GpsLongitudeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Measure Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Measure Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsMeasureModeType(GpsMeasureModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Speed Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Speed Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsSpeedRefType(GpsSpeedRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gps Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gps Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGpsStatusType(GpsStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interoperability Ifd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interoperability Ifd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteroperabilityIfdType(InteroperabilityIfdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interoperability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interoperability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteroperabilityType(InteroperabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSourceType(LightSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metering Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metering Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeteringModeType(MeteringModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeIntegerType(NonNegativeIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Negative Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Negative Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonNegativeRealType(NonNegativeRealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientationType(OrientationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Photometric Interpretation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Photometric Interpretation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhotometricInterpretationType(PhotometricInterpretationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Planar Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Planar Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanarConfigurationType(PlanarConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Positive Integer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Positive Integer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePositiveIntegerType(PositiveIntegerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Chromaticities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Chromaticities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryChromaticitiesType(PrimaryChromaticitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Real Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealType(RealType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeated Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeated Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatedFieldType(RepeatedFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionType(ResolutionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saturation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saturation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSaturationType(SaturationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scene Capture Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scene Capture Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSceneCaptureType(SceneCaptureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensing Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensing Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensingMethodType(SensingMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sharpness Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sharpness Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharpnessType(SharpnessType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Field T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Field T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFieldT(SingleFieldT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Field Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Field Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFieldType(SingleFieldType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strip Byte Counts Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strip Byte Counts Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStripByteCountsType(StripByteCountsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strip Byte Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strip Byte Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStripByteCountType(StripByteCountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strip Offsets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strip Offsets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStripOffsetsType(StripOffsetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strip Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strip Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStripOffsetType(StripOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectAreaType(SubjectAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Distance Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Distance Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectDistanceRangeType(SubjectDistanceRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectLocationType(SubjectLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tiff Ifd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tiff Ifd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTiffIfdType(TiffIfdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUuidType(UuidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>White Balance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>White Balance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhiteBalanceType(WhiteBalanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>White Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>White Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhitePointType(WhitePointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCb Cr Coefficients Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCb Cr Coefficients Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCbCrCoefficientsType(YCbCrCoefficientsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCb Cr Positioning Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCb Cr Positioning Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCbCrPositioningType(YCbCrPositioningType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>YCb Cr Sub Sampling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>YCb Cr Sub Sampling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYCbCrSubSamplingType(YCbCrSubSamplingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExifSwitch
