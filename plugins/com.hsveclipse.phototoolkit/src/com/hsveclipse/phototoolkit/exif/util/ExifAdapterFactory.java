/**
 */
package com.hsveclipse.phototoolkit.exif.util;

import com.hsveclipse.phototoolkit.exif.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage
 * @generated
 */
public class ExifAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExifPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExifPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExifSwitch<Adapter> modelSwitch =
		new ExifSwitch<Adapter>() {
			@Override
			public Adapter caseBitsPerSampleType(BitsPerSampleType object) {
				return createBitsPerSampleTypeAdapter();
			}
			@Override
			public Adapter caseChromaticity(Chromaticity object) {
				return createChromaticityAdapter();
			}
			@Override
			public Adapter caseColorSpaceType(ColorSpaceType object) {
				return createColorSpaceTypeAdapter();
			}
			@Override
			public Adapter caseCompressionType(CompressionType object) {
				return createCompressionTypeAdapter();
			}
			@Override
			public Adapter caseContrastType(ContrastType object) {
				return createContrastTypeAdapter();
			}
			@Override
			public Adapter caseCustomRenderedType(CustomRenderedType object) {
				return createCustomRenderedTypeAdapter();
			}
			@Override
			public Adapter caseDateTimeType(DateTimeType object) {
				return createDateTimeTypeAdapter();
			}
			@Override
			public Adapter caseDateType(DateType object) {
				return createDateTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExifIfdType(ExifIfdType object) {
				return createExifIfdTypeAdapter();
			}
			@Override
			public Adapter caseExifMetadataType(ExifMetadataType object) {
				return createExifMetadataTypeAdapter();
			}
			@Override
			public Adapter caseExposureModeType(ExposureModeType object) {
				return createExposureModeTypeAdapter();
			}
			@Override
			public Adapter caseExposureProgramType(ExposureProgramType object) {
				return createExposureProgramTypeAdapter();
			}
			@Override
			public Adapter caseFileSourceType(FileSourceType object) {
				return createFileSourceTypeAdapter();
			}
			@Override
			public Adapter caseFlashType(FlashType object) {
				return createFlashTypeAdapter();
			}
			@Override
			public Adapter caseGainControlType(GainControlType object) {
				return createGainControlTypeAdapter();
			}
			@Override
			public Adapter caseGpsAltitudeRefType(GpsAltitudeRefType object) {
				return createGpsAltitudeRefTypeAdapter();
			}
			@Override
			public Adapter caseGpsBearingType(GpsBearingType object) {
				return createGpsBearingTypeAdapter();
			}
			@Override
			public Adapter caseGpsDifferentialType(GpsDifferentialType object) {
				return createGpsDifferentialTypeAdapter();
			}
			@Override
			public Adapter caseGpsDirectionType(GpsDirectionType object) {
				return createGpsDirectionTypeAdapter();
			}
			@Override
			public Adapter caseGpsDistanceRefType(GpsDistanceRefType object) {
				return createGpsDistanceRefTypeAdapter();
			}
			@Override
			public Adapter caseGpsIfdType(GpsIfdType object) {
				return createGpsIfdTypeAdapter();
			}
			@Override
			public Adapter caseGpsLatitudeRefType(GpsLatitudeRefType object) {
				return createGpsLatitudeRefTypeAdapter();
			}
			@Override
			public Adapter caseGpsLatitudeType(GpsLatitudeType object) {
				return createGpsLatitudeTypeAdapter();
			}
			@Override
			public Adapter caseGpsLongitudeRefType(GpsLongitudeRefType object) {
				return createGpsLongitudeRefTypeAdapter();
			}
			@Override
			public Adapter caseGpsLongitudeType(GpsLongitudeType object) {
				return createGpsLongitudeTypeAdapter();
			}
			@Override
			public Adapter caseGpsMeasureModeType(GpsMeasureModeType object) {
				return createGpsMeasureModeTypeAdapter();
			}
			@Override
			public Adapter caseGpsSpeedRefType(GpsSpeedRefType object) {
				return createGpsSpeedRefTypeAdapter();
			}
			@Override
			public Adapter caseGpsStatusType(GpsStatusType object) {
				return createGpsStatusTypeAdapter();
			}
			@Override
			public Adapter caseInteroperabilityIfdType(InteroperabilityIfdType object) {
				return createInteroperabilityIfdTypeAdapter();
			}
			@Override
			public Adapter caseInteroperabilityType(InteroperabilityType object) {
				return createInteroperabilityTypeAdapter();
			}
			@Override
			public Adapter caseLightSourceType(LightSourceType object) {
				return createLightSourceTypeAdapter();
			}
			@Override
			public Adapter caseMeteringModeType(MeteringModeType object) {
				return createMeteringModeTypeAdapter();
			}
			@Override
			public Adapter caseNonNegativeIntegerType(NonNegativeIntegerType object) {
				return createNonNegativeIntegerTypeAdapter();
			}
			@Override
			public Adapter caseNonNegativeRealType(NonNegativeRealType object) {
				return createNonNegativeRealTypeAdapter();
			}
			@Override
			public Adapter caseOrientationType(OrientationType object) {
				return createOrientationTypeAdapter();
			}
			@Override
			public Adapter casePhotometricInterpretationType(PhotometricInterpretationType object) {
				return createPhotometricInterpretationTypeAdapter();
			}
			@Override
			public Adapter casePlanarConfigurationType(PlanarConfigurationType object) {
				return createPlanarConfigurationTypeAdapter();
			}
			@Override
			public Adapter casePositiveIntegerType(PositiveIntegerType object) {
				return createPositiveIntegerTypeAdapter();
			}
			@Override
			public Adapter casePrimaryChromaticitiesType(PrimaryChromaticitiesType object) {
				return createPrimaryChromaticitiesTypeAdapter();
			}
			@Override
			public Adapter caseRealType(RealType object) {
				return createRealTypeAdapter();
			}
			@Override
			public Adapter caseRepeatedFieldType(RepeatedFieldType object) {
				return createRepeatedFieldTypeAdapter();
			}
			@Override
			public Adapter caseResolutionType(ResolutionType object) {
				return createResolutionTypeAdapter();
			}
			@Override
			public Adapter caseSaturationType(SaturationType object) {
				return createSaturationTypeAdapter();
			}
			@Override
			public Adapter caseSceneCaptureType(SceneCaptureType object) {
				return createSceneCaptureTypeAdapter();
			}
			@Override
			public Adapter caseSensingMethodType(SensingMethodType object) {
				return createSensingMethodTypeAdapter();
			}
			@Override
			public Adapter caseSharpnessType(SharpnessType object) {
				return createSharpnessTypeAdapter();
			}
			@Override
			public Adapter caseSingleFieldT(SingleFieldT object) {
				return createSingleFieldTAdapter();
			}
			@Override
			public Adapter caseSingleFieldType(SingleFieldType object) {
				return createSingleFieldTypeAdapter();
			}
			@Override
			public Adapter caseStringType(StringType object) {
				return createStringTypeAdapter();
			}
			@Override
			public Adapter caseStripByteCountsType(StripByteCountsType object) {
				return createStripByteCountsTypeAdapter();
			}
			@Override
			public Adapter caseStripByteCountType(StripByteCountType object) {
				return createStripByteCountTypeAdapter();
			}
			@Override
			public Adapter caseStripOffsetsType(StripOffsetsType object) {
				return createStripOffsetsTypeAdapter();
			}
			@Override
			public Adapter caseStripOffsetType(StripOffsetType object) {
				return createStripOffsetTypeAdapter();
			}
			@Override
			public Adapter caseSubjectAreaType(SubjectAreaType object) {
				return createSubjectAreaTypeAdapter();
			}
			@Override
			public Adapter caseSubjectDistanceRangeType(SubjectDistanceRangeType object) {
				return createSubjectDistanceRangeTypeAdapter();
			}
			@Override
			public Adapter caseSubjectLocationType(SubjectLocationType object) {
				return createSubjectLocationTypeAdapter();
			}
			@Override
			public Adapter caseTiffIfdType(TiffIfdType object) {
				return createTiffIfdTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseUuidType(UuidType object) {
				return createUuidTypeAdapter();
			}
			@Override
			public Adapter caseWhiteBalanceType(WhiteBalanceType object) {
				return createWhiteBalanceTypeAdapter();
			}
			@Override
			public Adapter caseWhitePointType(WhitePointType object) {
				return createWhitePointTypeAdapter();
			}
			@Override
			public Adapter caseYCbCrCoefficientsType(YCbCrCoefficientsType object) {
				return createYCbCrCoefficientsTypeAdapter();
			}
			@Override
			public Adapter caseYCbCrPositioningType(YCbCrPositioningType object) {
				return createYCbCrPositioningTypeAdapter();
			}
			@Override
			public Adapter caseYCbCrSubSamplingType(YCbCrSubSamplingType object) {
				return createYCbCrSubSamplingTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.BitsPerSampleType <em>Bits Per Sample Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.BitsPerSampleType
	 * @generated
	 */
	public Adapter createBitsPerSampleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.Chromaticity <em>Chromaticity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.Chromaticity
	 * @generated
	 */
	public Adapter createChromaticityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ColorSpaceType <em>Color Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ColorSpaceType
	 * @generated
	 */
	public Adapter createColorSpaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.CompressionType <em>Compression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.CompressionType
	 * @generated
	 */
	public Adapter createCompressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ContrastType <em>Contrast Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ContrastType
	 * @generated
	 */
	public Adapter createContrastTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.CustomRenderedType <em>Custom Rendered Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.CustomRenderedType
	 * @generated
	 */
	public Adapter createCustomRenderedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.DateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.DateTimeType
	 * @generated
	 */
	public Adapter createDateTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.DateType
	 * @generated
	 */
	public Adapter createDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ExifIfdType <em>Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ExifIfdType
	 * @generated
	 */
	public Adapter createExifIfdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ExifMetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ExifMetadataType
	 * @generated
	 */
	public Adapter createExifMetadataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ExposureModeType <em>Exposure Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureModeType
	 * @generated
	 */
	public Adapter createExposureModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ExposureProgramType <em>Exposure Program Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ExposureProgramType
	 * @generated
	 */
	public Adapter createExposureProgramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.FileSourceType <em>File Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.FileSourceType
	 * @generated
	 */
	public Adapter createFileSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.FlashType <em>Flash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.FlashType
	 * @generated
	 */
	public Adapter createFlashTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GainControlType <em>Gain Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GainControlType
	 * @generated
	 */
	public Adapter createGainControlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType <em>Gps Altitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsAltitudeRefType
	 * @generated
	 */
	public Adapter createGpsAltitudeRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsBearingType <em>Gps Bearing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsBearingType
	 * @generated
	 */
	public Adapter createGpsBearingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsDifferentialType <em>Gps Differential Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDifferentialType
	 * @generated
	 */
	public Adapter createGpsDifferentialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsDirectionType <em>Gps Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDirectionType
	 * @generated
	 */
	public Adapter createGpsDirectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsDistanceRefType <em>Gps Distance Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsDistanceRefType
	 * @generated
	 */
	public Adapter createGpsDistanceRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsIfdType <em>Gps Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsIfdType
	 * @generated
	 */
	public Adapter createGpsIfdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType <em>Gps Latitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeRefType
	 * @generated
	 */
	public Adapter createGpsLatitudeRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsLatitudeType <em>Gps Latitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLatitudeType
	 * @generated
	 */
	public Adapter createGpsLatitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType <em>Gps Longitude Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeRefType
	 * @generated
	 */
	public Adapter createGpsLongitudeRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsLongitudeType <em>Gps Longitude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsLongitudeType
	 * @generated
	 */
	public Adapter createGpsLongitudeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsMeasureModeType <em>Gps Measure Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsMeasureModeType
	 * @generated
	 */
	public Adapter createGpsMeasureModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsSpeedRefType <em>Gps Speed Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsSpeedRefType
	 * @generated
	 */
	public Adapter createGpsSpeedRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.GpsStatusType <em>Gps Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.GpsStatusType
	 * @generated
	 */
	public Adapter createGpsStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType <em>Interoperability Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType
	 * @generated
	 */
	public Adapter createInteroperabilityIfdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.InteroperabilityType <em>Interoperability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.InteroperabilityType
	 * @generated
	 */
	public Adapter createInteroperabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.LightSourceType <em>Light Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.LightSourceType
	 * @generated
	 */
	public Adapter createLightSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.MeteringModeType <em>Metering Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.MeteringModeType
	 * @generated
	 */
	public Adapter createMeteringModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType <em>Non Negative Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeIntegerType
	 * @generated
	 */
	public Adapter createNonNegativeIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.NonNegativeRealType <em>Non Negative Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.NonNegativeRealType
	 * @generated
	 */
	public Adapter createNonNegativeRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.OrientationType
	 * @generated
	 */
	public Adapter createOrientationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType <em>Photometric Interpretation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.PhotometricInterpretationType
	 * @generated
	 */
	public Adapter createPhotometricInterpretationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.PlanarConfigurationType <em>Planar Configuration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.PlanarConfigurationType
	 * @generated
	 */
	public Adapter createPlanarConfigurationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.PositiveIntegerType <em>Positive Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.PositiveIntegerType
	 * @generated
	 */
	public Adapter createPositiveIntegerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType <em>Primary Chromaticities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType
	 * @generated
	 */
	public Adapter createPrimaryChromaticitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.RealType <em>Real Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.RealType
	 * @generated
	 */
	public Adapter createRealTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.RepeatedFieldType <em>Repeated Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.RepeatedFieldType
	 * @generated
	 */
	public Adapter createRepeatedFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.ResolutionType <em>Resolution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.ResolutionType
	 * @generated
	 */
	public Adapter createResolutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SaturationType <em>Saturation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SaturationType
	 * @generated
	 */
	public Adapter createSaturationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SceneCaptureType <em>Scene Capture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SceneCaptureType
	 * @generated
	 */
	public Adapter createSceneCaptureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SensingMethodType <em>Sensing Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SensingMethodType
	 * @generated
	 */
	public Adapter createSensingMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SharpnessType <em>Sharpness Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SharpnessType
	 * @generated
	 */
	public Adapter createSharpnessTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT <em>Single Field T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldT
	 * @generated
	 */
	public Adapter createSingleFieldTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SingleFieldType <em>Single Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SingleFieldType
	 * @generated
	 */
	public Adapter createSingleFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.StringType
	 * @generated
	 */
	public Adapter createStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.StripByteCountsType <em>Strip Byte Counts Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountsType
	 * @generated
	 */
	public Adapter createStripByteCountsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.StripByteCountType <em>Strip Byte Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.StripByteCountType
	 * @generated
	 */
	public Adapter createStripByteCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.StripOffsetsType <em>Strip Offsets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetsType
	 * @generated
	 */
	public Adapter createStripOffsetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType <em>Strip Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.StripOffsetType
	 * @generated
	 */
	public Adapter createStripOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType <em>Subject Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectAreaType
	 * @generated
	 */
	public Adapter createSubjectAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType <em>Subject Distance Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectDistanceRangeType
	 * @generated
	 */
	public Adapter createSubjectDistanceRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.SubjectLocationType <em>Subject Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.SubjectLocationType
	 * @generated
	 */
	public Adapter createSubjectLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType <em>Tiff Ifd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.TiffIfdType
	 * @generated
	 */
	public Adapter createTiffIfdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.UuidType <em>Uuid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.UuidType
	 * @generated
	 */
	public Adapter createUuidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.WhiteBalanceType <em>White Balance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.WhiteBalanceType
	 * @generated
	 */
	public Adapter createWhiteBalanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.WhitePointType <em>White Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.WhitePointType
	 * @generated
	 */
	public Adapter createWhitePointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType <em>YCb Cr Coefficients Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType
	 * @generated
	 */
	public Adapter createYCbCrCoefficientsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.YCbCrPositioningType <em>YCb Cr Positioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrPositioningType
	 * @generated
	 */
	public Adapter createYCbCrPositioningTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType <em>YCb Cr Sub Sampling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.hsveclipse.phototoolkit.exif.YCbCrSubSamplingType
	 * @generated
	 */
	public Adapter createYCbCrSubSamplingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExifAdapterFactory
