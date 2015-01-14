/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.PhototoolkitPackage;

import com.hsveclipse.phototoolkit.exif.ExifFactory;
import com.hsveclipse.phototoolkit.exif.ExifPackage;

import com.hsveclipse.phototoolkit.exif.util.ExifValidator;

import com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExifPackageImpl extends EPackageImpl implements ExifPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitsPerSampleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chromaticityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorSpaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contrastTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRenderedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exifIfdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exifMetadataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposureModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exposureProgramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flashTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gainControlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsAltitudeRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsBearingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDifferentialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDirectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsDistanceRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsIfdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsLatitudeRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsLatitudeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsLongitudeRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsLongitudeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsMeasureModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsSpeedRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gpsStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interoperabilityIfdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interoperabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lightSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meteringModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonNegativeRealTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orientationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photometricInterpretationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planarConfigurationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntegerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryChromaticitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatedFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saturationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneCaptureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensingMethodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharpnessTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFieldTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stripByteCountsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stripByteCountTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stripOffsetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stripOffsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectDistanceRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectLocationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tiffIfdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whiteBalanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whitePointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCbCrCoefficientsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCbCrPositioningTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yCbCrSubSamplingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bitsPerSampleTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorSpaceTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compressionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contrastTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum customRenderedTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exposureModeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exposureProgramTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileSourceTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flashModeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flashReturnTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gainControlTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsAltitudeRefTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsDifferentialTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsDirectionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsDistanceRefTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsLatitudeRefTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsLongitudeRefTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsMeasureModeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsSpeedRefTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gpsStatusTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interoperabilityTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lightSourceTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum meteringModeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum photometricInterpretationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planarConfigurationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum saturationTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sceneCaptureTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensingMethodTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum subjectDistanceRangeTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum whiteBalanceTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yCbCrPositioningTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yCbCrSubSamplingTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum yesNoTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bitsPerSampleTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorSpaceTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType compressionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contrastTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType customRenderedTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exposureModeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exposureProgramTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileSourceTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flashModeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType flashReturnTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gainControlTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsAltitudeRefTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsBearingTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsBearingTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsDifferentialTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsDirectionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsDistanceRefTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLatitudeRefTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLatitudeTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLatitudeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLongitudeRefTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLongitudeTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsLongitudeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsMeasureModeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsSpeedRefTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gpsStatusTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interoperabilityTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lightSourceTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meteringModeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeRealEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonNegativeRealObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orientationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType photometricInterpretationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType planarConfigurationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resolutionTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType saturationTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sceneCaptureTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sensingMethodTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType subjectDistanceRangeTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uuidTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType whiteBalanceTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yCbCrPositioningTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yCbCrSubSamplingTObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType yesNoTObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExifPackageImpl() {
		super(eNS_URI, ExifFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExifPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ExifPackage init() {
		if (isInited) return (ExifPackage)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI);

		// Obtain or create and register package
		ExifPackageImpl theExifPackage = (ExifPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExifPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExifPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		PhototoolkitPackageImpl thePhototoolkitPackage = (PhototoolkitPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PhototoolkitPackage.eNS_URI) instanceof PhototoolkitPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PhototoolkitPackage.eNS_URI) : PhototoolkitPackage.eINSTANCE);

		// Load packages
		thePhototoolkitPackage.loadPackage();

		// Fix loaded packages
		theExifPackage.fixPackageContents();
		thePhototoolkitPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theExifPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ExifValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theExifPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExifPackage.eNS_URI, theExifPackage);
		return theExifPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitsPerSampleType() {
		if (bitsPerSampleTypeEClass == null) {
			bitsPerSampleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(2);
		}
		return bitsPerSampleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitsPerSampleType_Value() {
        return (EAttribute)getBitsPerSampleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitsPerSampleType_Tag() {
        return (EAttribute)getBitsPerSampleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChromaticity() {
		if (chromaticityEClass == null) {
			chromaticityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(3);
		}
		return chromaticityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChromaticity_X() {
        return (EAttribute)getChromaticity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChromaticity_Y() {
        return (EAttribute)getChromaticity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorSpaceType() {
		if (colorSpaceTypeEClass == null) {
			colorSpaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(6);
		}
		return colorSpaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorSpaceType_Value() {
        return (EAttribute)getColorSpaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorSpaceType_Tag() {
        return (EAttribute)getColorSpaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompressionType() {
		if (compressionTypeEClass == null) {
			compressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(9);
		}
		return compressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompressionType_Value() {
        return (EAttribute)getCompressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompressionType_Tag() {
        return (EAttribute)getCompressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContrastType() {
		if (contrastTypeEClass == null) {
			contrastTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(12);
		}
		return contrastTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContrastType_Value() {
        return (EAttribute)getContrastType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContrastType_Tag() {
        return (EAttribute)getContrastType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomRenderedType() {
		if (customRenderedTypeEClass == null) {
			customRenderedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(15);
		}
		return customRenderedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRenderedType_Value() {
        return (EAttribute)getCustomRenderedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRenderedType_Tag() {
        return (EAttribute)getCustomRenderedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeType() {
		if (dateTimeTypeEClass == null) {
			dateTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(18);
		}
		return dateTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Value() {
        return (EAttribute)getDateTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeType_Tag() {
        return (EAttribute)getDateTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		if (dateTypeEClass == null) {
			dateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(19);
		}
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Value() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Tag() {
        return (EAttribute)getDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(20);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExifMetadata() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExifIfdType() {
		if (exifIfdTypeEClass == null) {
			exifIfdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(21);
		}
		return exifIfdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExifVersion() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FlashpixVersion() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ColorSpace() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ComponentsConfiguration() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_CompressedBitsPerPixel() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_PixelXDimension() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_PixelYDimension() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_MakerNote() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_UserComment() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_RelatedSoundFile() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_DateTimeOriginal() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_DateTimeDigitized() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubSecTime() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubSecTimeOriginal() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubSecTimeDigitized() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExposureTime() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FNumber() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExposureProgram() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SpectralSensitivity() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ISOSpeedRatings() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_OECF() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ShutterSpeedValue() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ApertureValue() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_BrightnessValue() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExposureBiasValue() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_MaxApertureValue() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubjectDistance() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_MeteringMode() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_LightSource() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_Flash() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FocalLength() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubjectArea() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FlashEnergy() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SpatialFrequencyResponse() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FocalPlaneXResolution() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FocalPlaneYResolution() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FocalPlaneResolutionUnit() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubjectLocation() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExposureIndex() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SensingMethod() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FileSource() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SceneType() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_CFAPattern() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_CustomRendered() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExposureMode() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_WhiteBalance() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_DigitalZoomRatio() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_FocalLengthIn35mmFilm() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SceneCaptureType() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_GainControl() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_Contrast() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_Saturation() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_Sharpness() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_DeviceSettingDescription() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_SubjectDistanceRange() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ImageUniqueID() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_Gamma() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExifField1() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExifField2() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifIfdType_ExifField3() {
        return (EReference)getExifIfdType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExifIfdType_Tag() {
        return (EAttribute)getExifIfdType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExifMetadataType() {
		if (exifMetadataTypeEClass == null) {
			exifMetadataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(22);
		}
		return exifMetadataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifMetadataType_TiffIfd() {
        return (EReference)getExifMetadataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifMetadataType_ExifIfd() {
        return (EReference)getExifMetadataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifMetadataType_GpsIfd() {
        return (EReference)getExifMetadataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExifMetadataType_InteroperabilityIfd() {
        return (EReference)getExifMetadataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposureModeType() {
		if (exposureModeTypeEClass == null) {
			exposureModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(25);
		}
		return exposureModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposureModeType_Value() {
        return (EAttribute)getExposureModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposureModeType_Tag() {
        return (EAttribute)getExposureModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExposureProgramType() {
		if (exposureProgramTypeEClass == null) {
			exposureProgramTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(28);
		}
		return exposureProgramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposureProgramType_Value() {
        return (EAttribute)getExposureProgramType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExposureProgramType_Tag() {
        return (EAttribute)getExposureProgramType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSourceType() {
		if (fileSourceTypeEClass == null) {
			fileSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(31);
		}
		return fileSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSourceType_Value() {
        return (EAttribute)getFileSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileSourceType_Tag() {
        return (EAttribute)getFileSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlashType() {
		if (flashTypeEClass == null) {
			flashTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(36);
		}
		return flashTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_Fired() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_Return() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_Mode() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_Function() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_RedEyeReduction() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlashType_Tag() {
        return (EAttribute)getFlashType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGainControlType() {
		if (gainControlTypeEClass == null) {
			gainControlTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(39);
		}
		return gainControlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGainControlType_Value() {
        return (EAttribute)getGainControlType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGainControlType_Tag() {
        return (EAttribute)getGainControlType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsAltitudeRefType() {
		if (gpsAltitudeRefTypeEClass == null) {
			gpsAltitudeRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(42);
		}
		return gpsAltitudeRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsAltitudeRefType_Value() {
        return (EAttribute)getGpsAltitudeRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsAltitudeRefType_Tag() {
        return (EAttribute)getGpsAltitudeRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsBearingType() {
		if (gpsBearingTypeEClass == null) {
			gpsBearingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(45);
		}
		return gpsBearingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsBearingType_Value() {
        return (EAttribute)getGpsBearingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsBearingType_Tag() {
        return (EAttribute)getGpsBearingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsDifferentialType() {
		if (gpsDifferentialTypeEClass == null) {
			gpsDifferentialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(48);
		}
		return gpsDifferentialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDifferentialType_Value() {
        return (EAttribute)getGpsDifferentialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDifferentialType_Tag() {
        return (EAttribute)getGpsDifferentialType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsDirectionType() {
		if (gpsDirectionTypeEClass == null) {
			gpsDirectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(51);
		}
		return gpsDirectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDirectionType_Value() {
        return (EAttribute)getGpsDirectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDirectionType_Tag() {
        return (EAttribute)getGpsDirectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsDistanceRefType() {
		if (gpsDistanceRefTypeEClass == null) {
			gpsDistanceRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(54);
		}
		return gpsDistanceRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDistanceRefType_Value() {
        return (EAttribute)getGpsDistanceRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsDistanceRefType_Tag() {
        return (EAttribute)getGpsDistanceRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsIfdType() {
		if (gpsIfdTypeEClass == null) {
			gpsIfdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(55);
		}
		return gpsIfdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSVersionID() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSLatitudeRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSLatitude() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSLongitudeRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSLongitude() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSAltitudeRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSAltitude() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSTimeStamp() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSSatellites() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSStatus() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSMeasureMode() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDOP() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSSpeedRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSSpeed() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSTrackRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSTrack() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSImgDirectionRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSImgDirection() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSMapDatum() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestLatitudeRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestLatitude() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestLongitudeRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestLongitude() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestBearingRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestBearing() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestDistanceRef() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDestDistance() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSProcessingMethod() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSAreaInformation() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDateStamp() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSDifferential() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSField1() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSField2() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGpsIfdType_GPSField3() {
        return (EReference)getGpsIfdType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsIfdType_Tag() {
        return (EAttribute)getGpsIfdType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsLatitudeRefType() {
		if (gpsLatitudeRefTypeEClass == null) {
			gpsLatitudeRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(58);
		}
		return gpsLatitudeRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLatitudeRefType_Value() {
        return (EAttribute)getGpsLatitudeRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLatitudeRefType_Tag() {
        return (EAttribute)getGpsLatitudeRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsLatitudeType() {
		if (gpsLatitudeTypeEClass == null) {
			gpsLatitudeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(61);
		}
		return gpsLatitudeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLatitudeType_Value() {
        return (EAttribute)getGpsLatitudeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLatitudeType_Tag() {
        return (EAttribute)getGpsLatitudeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsLongitudeRefType() {
		if (gpsLongitudeRefTypeEClass == null) {
			gpsLongitudeRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(64);
		}
		return gpsLongitudeRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLongitudeRefType_Value() {
        return (EAttribute)getGpsLongitudeRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLongitudeRefType_Tag() {
        return (EAttribute)getGpsLongitudeRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsLongitudeType() {
		if (gpsLongitudeTypeEClass == null) {
			gpsLongitudeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(67);
		}
		return gpsLongitudeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLongitudeType_Value() {
        return (EAttribute)getGpsLongitudeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsLongitudeType_Tag() {
        return (EAttribute)getGpsLongitudeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsMeasureModeType() {
		if (gpsMeasureModeTypeEClass == null) {
			gpsMeasureModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(70);
		}
		return gpsMeasureModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsMeasureModeType_Value() {
        return (EAttribute)getGpsMeasureModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsMeasureModeType_Tag() {
        return (EAttribute)getGpsMeasureModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsSpeedRefType() {
		if (gpsSpeedRefTypeEClass == null) {
			gpsSpeedRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(73);
		}
		return gpsSpeedRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsSpeedRefType_Value() {
        return (EAttribute)getGpsSpeedRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsSpeedRefType_Tag() {
        return (EAttribute)getGpsSpeedRefType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGpsStatusType() {
		if (gpsStatusTypeEClass == null) {
			gpsStatusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(76);
		}
		return gpsStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsStatusType_Value() {
        return (EAttribute)getGpsStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGpsStatusType_Tag() {
        return (EAttribute)getGpsStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteroperabilityIfdType() {
		if (interoperabilityIfdTypeEClass == null) {
			interoperabilityIfdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(77);
		}
		return interoperabilityIfdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteroperabilityIfdType_InteroperabilityIndex() {
        return (EReference)getInteroperabilityIfdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteroperabilityIfdType_Tag() {
        return (EAttribute)getInteroperabilityIfdType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteroperabilityType() {
		if (interoperabilityTypeEClass == null) {
			interoperabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(80);
		}
		return interoperabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteroperabilityType_Value() {
        return (EAttribute)getInteroperabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteroperabilityType_Tag() {
        return (EAttribute)getInteroperabilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLightSourceType() {
		if (lightSourceTypeEClass == null) {
			lightSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(83);
		}
		return lightSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSourceType_Value() {
        return (EAttribute)getLightSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLightSourceType_Tag() {
        return (EAttribute)getLightSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeteringModeType() {
		if (meteringModeTypeEClass == null) {
			meteringModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(86);
		}
		return meteringModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeteringModeType_Value() {
        return (EAttribute)getMeteringModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMeteringModeType_Tag() {
        return (EAttribute)getMeteringModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeIntegerType() {
		if (nonNegativeIntegerTypeEClass == null) {
			nonNegativeIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(87);
		}
		return nonNegativeIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerType_Value() {
        return (EAttribute)getNonNegativeIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeIntegerType_Tag() {
        return (EAttribute)getNonNegativeIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonNegativeRealType() {
		if (nonNegativeRealTypeEClass == null) {
			nonNegativeRealTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(90);
		}
		return nonNegativeRealTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeRealType_Value() {
        return (EAttribute)getNonNegativeRealType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonNegativeRealType_Tag() {
        return (EAttribute)getNonNegativeRealType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrientationType() {
		if (orientationTypeEClass == null) {
			orientationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(93);
		}
		return orientationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationType_Value() {
        return (EAttribute)getOrientationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrientationType_Tag() {
        return (EAttribute)getOrientationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhotometricInterpretationType() {
		if (photometricInterpretationTypeEClass == null) {
			photometricInterpretationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(96);
		}
		return photometricInterpretationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotometricInterpretationType_Value() {
        return (EAttribute)getPhotometricInterpretationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhotometricInterpretationType_Tag() {
        return (EAttribute)getPhotometricInterpretationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlanarConfigurationType() {
		if (planarConfigurationTypeEClass == null) {
			planarConfigurationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(99);
		}
		return planarConfigurationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanarConfigurationType_Value() {
        return (EAttribute)getPlanarConfigurationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlanarConfigurationType_Tag() {
        return (EAttribute)getPlanarConfigurationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPositiveIntegerType() {
		if (positiveIntegerTypeEClass == null) {
			positiveIntegerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(100);
		}
		return positiveIntegerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerType_Value() {
        return (EAttribute)getPositiveIntegerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPositiveIntegerType_Tag() {
        return (EAttribute)getPositiveIntegerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryChromaticitiesType() {
		if (primaryChromaticitiesTypeEClass == null) {
			primaryChromaticitiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(101);
		}
		return primaryChromaticitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryChromaticitiesType_Color1() {
        return (EReference)getPrimaryChromaticitiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryChromaticitiesType_Color2() {
        return (EReference)getPrimaryChromaticitiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryChromaticitiesType_Color3() {
        return (EReference)getPrimaryChromaticitiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimaryChromaticitiesType_Tag() {
        return (EAttribute)getPrimaryChromaticitiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealType() {
		if (realTypeEClass == null) {
			realTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(102);
		}
		return realTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Value() {
        return (EAttribute)getRealType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealType_Tag() {
        return (EAttribute)getRealType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeatedFieldType() {
		if (repeatedFieldTypeEClass == null) {
			repeatedFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(103);
		}
		return repeatedFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeatedFieldType_Field() {
        return (EReference)getRepeatedFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepeatedFieldType_Tag() {
        return (EAttribute)getRepeatedFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionType() {
		if (resolutionTypeEClass == null) {
			resolutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(106);
		}
		return resolutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionType_Value() {
        return (EAttribute)getResolutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResolutionType_Tag() {
        return (EAttribute)getResolutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSaturationType() {
		if (saturationTypeEClass == null) {
			saturationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(109);
		}
		return saturationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSaturationType_Value() {
        return (EAttribute)getSaturationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSaturationType_Tag() {
        return (EAttribute)getSaturationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneCaptureType() {
		if (sceneCaptureTypeEClass == null) {
			sceneCaptureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(112);
		}
		return sceneCaptureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneCaptureType_Value() {
        return (EAttribute)getSceneCaptureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSceneCaptureType_Tag() {
        return (EAttribute)getSceneCaptureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensingMethodType() {
		if (sensingMethodTypeEClass == null) {
			sensingMethodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(115);
		}
		return sensingMethodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingMethodType_Value() {
        return (EAttribute)getSensingMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensingMethodType_Tag() {
        return (EAttribute)getSensingMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharpnessType() {
		if (sharpnessTypeEClass == null) {
			sharpnessTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(116);
		}
		return sharpnessTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharpnessType_Value() {
        return (EAttribute)getSharpnessType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharpnessType_Tag() {
        return (EAttribute)getSharpnessType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFieldT() {
		if (singleFieldTEClass == null) {
			singleFieldTEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(117);
		}
		return singleFieldTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFieldT_Name() {
        return (EAttribute)getSingleFieldT().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFieldT_Value() {
        return (EAttribute)getSingleFieldT().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFieldT_Datatype() {
        return (EAttribute)getSingleFieldT().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFieldType() {
		if (singleFieldTypeEClass == null) {
			singleFieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(118);
		}
		return singleFieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFieldType_Tag() {
        return (EAttribute)getSingleFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringType() {
		if (stringTypeEClass == null) {
			stringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(119);
		}
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Value() {
        return (EAttribute)getStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringType_Tag() {
        return (EAttribute)getStringType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStripByteCountsType() {
		if (stripByteCountsTypeEClass == null) {
			stripByteCountsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(120);
		}
		return stripByteCountsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStripByteCountsType_StripByteCount() {
        return (EReference)getStripByteCountsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripByteCountsType_Tag() {
        return (EAttribute)getStripByteCountsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStripByteCountType() {
		if (stripByteCountTypeEClass == null) {
			stripByteCountTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(121);
		}
		return stripByteCountTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripByteCountType_Index() {
        return (EAttribute)getStripByteCountType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripByteCountType_Bytes() {
        return (EAttribute)getStripByteCountType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStripOffsetsType() {
		if (stripOffsetsTypeEClass == null) {
			stripOffsetsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(122);
		}
		return stripOffsetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStripOffsetsType_StripOffset() {
        return (EReference)getStripOffsetsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripOffsetsType_Tag() {
        return (EAttribute)getStripOffsetsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStripOffsetType() {
		if (stripOffsetTypeEClass == null) {
			stripOffsetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(123);
		}
		return stripOffsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripOffsetType_Index() {
        return (EAttribute)getStripOffsetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStripOffsetType_Offset() {
        return (EAttribute)getStripOffsetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectAreaType() {
		if (subjectAreaTypeEClass == null) {
			subjectAreaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(124);
		}
		return subjectAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectAreaType_Diameter() {
        return (EAttribute)getSubjectAreaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectAreaType_Width() {
        return (EAttribute)getSubjectAreaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectAreaType_Height() {
        return (EAttribute)getSubjectAreaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectDistanceRangeType() {
		if (subjectDistanceRangeTypeEClass == null) {
			subjectDistanceRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(127);
		}
		return subjectDistanceRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectDistanceRangeType_Value() {
        return (EAttribute)getSubjectDistanceRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectDistanceRangeType_Tag() {
        return (EAttribute)getSubjectDistanceRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectLocationType() {
		if (subjectLocationTypeEClass == null) {
			subjectLocationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(128);
		}
		return subjectLocationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectLocationType_CenterX() {
        return (EAttribute)getSubjectLocationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectLocationType_CenterY() {
        return (EAttribute)getSubjectLocationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectLocationType_Tag() {
        return (EAttribute)getSubjectLocationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTiffIfdType() {
		if (tiffIfdTypeEClass == null) {
			tiffIfdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(129);
		}
		return tiffIfdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_ImageWidth() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_ImageLength() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_BitsPerSample() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Compression() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_PhotometricInterpretation() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Orientation() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_SamplesPerPixel() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_PlanarConfiguration() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_YCbCrSubSampling() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_YCbCrPositioning() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_XResolution() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_YResolution() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_ResolutionUnit() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_StripOffsets() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_RowsPerStrip() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_StripByteCounts() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_JPEGInterChangeFormat() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_JPEGInterChangeFormatLength() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_TransferFunction() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_WhitePoint() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_PrimaryChromaticities() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_YCbCrCoefficients() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_ReferenceBlackWhite() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_DateTime() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_ImageDescription() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Make() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Model() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Software() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Artist() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_Copyright() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_TiffField1() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_TiffField2() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTiffIfdType_TiffField3() {
        return (EReference)getTiffIfdType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		if (timeTypeEClass == null) {
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(130);
		}
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Value() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Tag() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUuidType() {
		if (uuidTypeEClass == null) {
			uuidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(132);
		}
		return uuidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUuidType_Value() {
        return (EAttribute)getUuidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUuidType_Tag() {
        return (EAttribute)getUuidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhiteBalanceType() {
		if (whiteBalanceTypeEClass == null) {
			whiteBalanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(135);
		}
		return whiteBalanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhiteBalanceType_Value() {
        return (EAttribute)getWhiteBalanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhiteBalanceType_Tag() {
        return (EAttribute)getWhiteBalanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhitePointType() {
		if (whitePointTypeEClass == null) {
			whitePointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(136);
		}
		return whitePointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhitePointType_Tag() {
        return (EAttribute)getWhitePointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCbCrCoefficientsType() {
		if (yCbCrCoefficientsTypeEClass == null) {
			yCbCrCoefficientsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(137);
		}
		return yCbCrCoefficientsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrCoefficientsType_Coefficient1() {
        return (EAttribute)getYCbCrCoefficientsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrCoefficientsType_Coefficient2() {
        return (EAttribute)getYCbCrCoefficientsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrCoefficientsType_Coefficient3() {
        return (EAttribute)getYCbCrCoefficientsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrCoefficientsType_Tag() {
        return (EAttribute)getYCbCrCoefficientsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCbCrPositioningType() {
		if (yCbCrPositioningTypeEClass == null) {
			yCbCrPositioningTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(140);
		}
		return yCbCrPositioningTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrPositioningType_Value() {
        return (EAttribute)getYCbCrPositioningType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrPositioningType_Tag() {
        return (EAttribute)getYCbCrPositioningType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYCbCrSubSamplingType() {
		if (yCbCrSubSamplingTypeEClass == null) {
			yCbCrSubSamplingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(143);
		}
		return yCbCrSubSamplingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrSubSamplingType_Value() {
        return (EAttribute)getYCbCrSubSamplingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getYCbCrSubSamplingType_Tag() {
        return (EAttribute)getYCbCrSubSamplingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBitsPerSampleT() {
		if (bitsPerSampleTEEnum == null) {
			bitsPerSampleTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(0);
		}
		return bitsPerSampleTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColorSpaceT() {
		if (colorSpaceTEEnum == null) {
			colorSpaceTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(4);
		}
		return colorSpaceTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompressionT() {
		if (compressionTEEnum == null) {
			compressionTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(7);
		}
		return compressionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContrastT() {
		if (contrastTEEnum == null) {
			contrastTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(10);
		}
		return contrastTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCustomRenderedT() {
		if (customRenderedTEEnum == null) {
			customRenderedTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(13);
		}
		return customRenderedTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeType() {
		if (datatypeTypeEEnum == null) {
			datatypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(16);
		}
		return datatypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExposureModeT() {
		if (exposureModeTEEnum == null) {
			exposureModeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(23);
		}
		return exposureModeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExposureProgramT() {
		if (exposureProgramTEEnum == null) {
			exposureProgramTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(26);
		}
		return exposureProgramTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileSourceT() {
		if (fileSourceTEEnum == null) {
			fileSourceTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(29);
		}
		return fileSourceTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlashModeT() {
		if (flashModeTEEnum == null) {
			flashModeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(32);
		}
		return flashModeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlashReturnT() {
		if (flashReturnTEEnum == null) {
			flashReturnTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(34);
		}
		return flashReturnTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGainControlT() {
		if (gainControlTEEnum == null) {
			gainControlTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(37);
		}
		return gainControlTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsAltitudeRefT() {
		if (gpsAltitudeRefTEEnum == null) {
			gpsAltitudeRefTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(40);
		}
		return gpsAltitudeRefTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsDifferentialT() {
		if (gpsDifferentialTEEnum == null) {
			gpsDifferentialTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(46);
		}
		return gpsDifferentialTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsDirectionT() {
		if (gpsDirectionTEEnum == null) {
			gpsDirectionTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(49);
		}
		return gpsDirectionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsDistanceRefT() {
		if (gpsDistanceRefTEEnum == null) {
			gpsDistanceRefTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(52);
		}
		return gpsDistanceRefTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsLatitudeRefT() {
		if (gpsLatitudeRefTEEnum == null) {
			gpsLatitudeRefTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(56);
		}
		return gpsLatitudeRefTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsLongitudeRefT() {
		if (gpsLongitudeRefTEEnum == null) {
			gpsLongitudeRefTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(62);
		}
		return gpsLongitudeRefTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsMeasureModeT() {
		if (gpsMeasureModeTEEnum == null) {
			gpsMeasureModeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(68);
		}
		return gpsMeasureModeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsSpeedRefT() {
		if (gpsSpeedRefTEEnum == null) {
			gpsSpeedRefTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(71);
		}
		return gpsSpeedRefTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGpsStatusT() {
		if (gpsStatusTEEnum == null) {
			gpsStatusTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(74);
		}
		return gpsStatusTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteroperabilityT() {
		if (interoperabilityTEEnum == null) {
			interoperabilityTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(78);
		}
		return interoperabilityTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLightSourceT() {
		if (lightSourceTEEnum == null) {
			lightSourceTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(81);
		}
		return lightSourceTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeteringModeT() {
		if (meteringModeTEEnum == null) {
			meteringModeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(84);
		}
		return meteringModeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientationT() {
		if (orientationTEEnum == null) {
			orientationTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(91);
		}
		return orientationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhotometricInterpretationT() {
		if (photometricInterpretationTEEnum == null) {
			photometricInterpretationTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(94);
		}
		return photometricInterpretationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanarConfigurationT() {
		if (planarConfigurationTEEnum == null) {
			planarConfigurationTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(97);
		}
		return planarConfigurationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolutionT() {
		if (resolutionTEEnum == null) {
			resolutionTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(104);
		}
		return resolutionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSaturationT() {
		if (saturationTEEnum == null) {
			saturationTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(107);
		}
		return saturationTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSceneCaptureT() {
		if (sceneCaptureTEEnum == null) {
			sceneCaptureTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(110);
		}
		return sceneCaptureTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensingMethodT() {
		if (sensingMethodTEEnum == null) {
			sensingMethodTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(113);
		}
		return sensingMethodTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubjectDistanceRangeT() {
		if (subjectDistanceRangeTEEnum == null) {
			subjectDistanceRangeTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(125);
		}
		return subjectDistanceRangeTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWhiteBalanceT() {
		if (whiteBalanceTEEnum == null) {
			whiteBalanceTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(133);
		}
		return whiteBalanceTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYCbCrPositioningT() {
		if (yCbCrPositioningTEEnum == null) {
			yCbCrPositioningTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(138);
		}
		return yCbCrPositioningTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYCbCrSubSamplingT() {
		if (yCbCrSubSamplingTEEnum == null) {
			yCbCrSubSamplingTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(141);
		}
		return yCbCrSubSamplingTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getYesNoT() {
		if (yesNoTEEnum == null) {
			yesNoTEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(144);
		}
		return yesNoTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBitsPerSampleTObject() {
		if (bitsPerSampleTObjectEDataType == null) {
			bitsPerSampleTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(1);
		}
		return bitsPerSampleTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorSpaceTObject() {
		if (colorSpaceTObjectEDataType == null) {
			colorSpaceTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(5);
		}
		return colorSpaceTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCompressionTObject() {
		if (compressionTObjectEDataType == null) {
			compressionTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(8);
		}
		return compressionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContrastTObject() {
		if (contrastTObjectEDataType == null) {
			contrastTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(11);
		}
		return contrastTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCustomRenderedTObject() {
		if (customRenderedTObjectEDataType == null) {
			customRenderedTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(14);
		}
		return customRenderedTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatatypeTypeObject() {
		if (datatypeTypeObjectEDataType == null) {
			datatypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(17);
		}
		return datatypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExposureModeTObject() {
		if (exposureModeTObjectEDataType == null) {
			exposureModeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(24);
		}
		return exposureModeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExposureProgramTObject() {
		if (exposureProgramTObjectEDataType == null) {
			exposureProgramTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(27);
		}
		return exposureProgramTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFileSourceTObject() {
		if (fileSourceTObjectEDataType == null) {
			fileSourceTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(30);
		}
		return fileSourceTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlashModeTObject() {
		if (flashModeTObjectEDataType == null) {
			flashModeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(33);
		}
		return flashModeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFlashReturnTObject() {
		if (flashReturnTObjectEDataType == null) {
			flashReturnTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(35);
		}
		return flashReturnTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGainControlTObject() {
		if (gainControlTObjectEDataType == null) {
			gainControlTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(38);
		}
		return gainControlTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsAltitudeRefTObject() {
		if (gpsAltitudeRefTObjectEDataType == null) {
			gpsAltitudeRefTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(41);
		}
		return gpsAltitudeRefTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsBearingT() {
		if (gpsBearingTEDataType == null) {
			gpsBearingTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(43);
		}
		return gpsBearingTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsBearingTObject() {
		if (gpsBearingTObjectEDataType == null) {
			gpsBearingTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(44);
		}
		return gpsBearingTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsDifferentialTObject() {
		if (gpsDifferentialTObjectEDataType == null) {
			gpsDifferentialTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(47);
		}
		return gpsDifferentialTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsDirectionTObject() {
		if (gpsDirectionTObjectEDataType == null) {
			gpsDirectionTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(50);
		}
		return gpsDirectionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsDistanceRefTObject() {
		if (gpsDistanceRefTObjectEDataType == null) {
			gpsDistanceRefTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(53);
		}
		return gpsDistanceRefTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLatitudeRefTObject() {
		if (gpsLatitudeRefTObjectEDataType == null) {
			gpsLatitudeRefTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(57);
		}
		return gpsLatitudeRefTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLatitudeT() {
		if (gpsLatitudeTEDataType == null) {
			gpsLatitudeTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(59);
		}
		return gpsLatitudeTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLatitudeTObject() {
		if (gpsLatitudeTObjectEDataType == null) {
			gpsLatitudeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(60);
		}
		return gpsLatitudeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLongitudeRefTObject() {
		if (gpsLongitudeRefTObjectEDataType == null) {
			gpsLongitudeRefTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(63);
		}
		return gpsLongitudeRefTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLongitudeT() {
		if (gpsLongitudeTEDataType == null) {
			gpsLongitudeTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(65);
		}
		return gpsLongitudeTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsLongitudeTObject() {
		if (gpsLongitudeTObjectEDataType == null) {
			gpsLongitudeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(66);
		}
		return gpsLongitudeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsMeasureModeTObject() {
		if (gpsMeasureModeTObjectEDataType == null) {
			gpsMeasureModeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(69);
		}
		return gpsMeasureModeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsSpeedRefTObject() {
		if (gpsSpeedRefTObjectEDataType == null) {
			gpsSpeedRefTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(72);
		}
		return gpsSpeedRefTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGpsStatusTObject() {
		if (gpsStatusTObjectEDataType == null) {
			gpsStatusTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(75);
		}
		return gpsStatusTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInteroperabilityTObject() {
		if (interoperabilityTObjectEDataType == null) {
			interoperabilityTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(79);
		}
		return interoperabilityTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLightSourceTObject() {
		if (lightSourceTObjectEDataType == null) {
			lightSourceTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(82);
		}
		return lightSourceTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMeteringModeTObject() {
		if (meteringModeTObjectEDataType == null) {
			meteringModeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(85);
		}
		return meteringModeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeReal() {
		if (nonNegativeRealEDataType == null) {
			nonNegativeRealEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(88);
		}
		return nonNegativeRealEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonNegativeRealObject() {
		if (nonNegativeRealObjectEDataType == null) {
			nonNegativeRealObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(89);
		}
		return nonNegativeRealObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrientationTObject() {
		if (orientationTObjectEDataType == null) {
			orientationTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(92);
		}
		return orientationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPhotometricInterpretationTObject() {
		if (photometricInterpretationTObjectEDataType == null) {
			photometricInterpretationTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(95);
		}
		return photometricInterpretationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPlanarConfigurationTObject() {
		if (planarConfigurationTObjectEDataType == null) {
			planarConfigurationTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(98);
		}
		return planarConfigurationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResolutionTObject() {
		if (resolutionTObjectEDataType == null) {
			resolutionTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(105);
		}
		return resolutionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSaturationTObject() {
		if (saturationTObjectEDataType == null) {
			saturationTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(108);
		}
		return saturationTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSceneCaptureTObject() {
		if (sceneCaptureTObjectEDataType == null) {
			sceneCaptureTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(111);
		}
		return sceneCaptureTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSensingMethodTObject() {
		if (sensingMethodTObjectEDataType == null) {
			sensingMethodTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(114);
		}
		return sensingMethodTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubjectDistanceRangeTObject() {
		if (subjectDistanceRangeTObjectEDataType == null) {
			subjectDistanceRangeTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(126);
		}
		return subjectDistanceRangeTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUuidT() {
		if (uuidTEDataType == null) {
			uuidTEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(131);
		}
		return uuidTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWhiteBalanceTObject() {
		if (whiteBalanceTObjectEDataType == null) {
			whiteBalanceTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(134);
		}
		return whiteBalanceTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYCbCrPositioningTObject() {
		if (yCbCrPositioningTObjectEDataType == null) {
			yCbCrPositioningTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(139);
		}
		return yCbCrPositioningTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYCbCrSubSamplingTObject() {
		if (yCbCrSubSamplingTObjectEDataType == null) {
			yCbCrSubSamplingTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(142);
		}
		return yCbCrSubSamplingTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getYesNoTObject() {
		if (yesNoTObjectEDataType == null) {
			yesNoTObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI).getEClassifiers().get(145);
		}
		return yesNoTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifFactory getExifFactory() {
		return (ExifFactory)getEFactoryInstance();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("com.hsveclipse.phototoolkit.exif." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ExifPackageImpl
