/**
 */
package com.hsveclipse.phototoolkit.exif.provider;


import com.hsveclipse.phototoolkit.PhototoolkitFactory;

import com.hsveclipse.phototoolkit.exif.ExifFactory;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.TiffIfdType;

import com.hsveclipse.phototoolkit.provider.PhototoolkitEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.hsveclipse.phototoolkit.exif.TiffIfdType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TiffIfdTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TiffIfdTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_ImageWidth());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_ImageLength());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_BitsPerSample());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Compression());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_PhotometricInterpretation());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Orientation());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_SamplesPerPixel());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_PlanarConfiguration());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrSubSampling());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrPositioning());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_XResolution());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_YResolution());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_ResolutionUnit());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_StripOffsets());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_RowsPerStrip());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_StripByteCounts());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormat());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormatLength());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_WhitePoint());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_PrimaryChromaticities());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrCoefficients());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_ReferenceBlackWhite());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_DateTime());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_ImageDescription());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Make());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Model());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Software());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Artist());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_Copyright());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_TiffField1());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_TiffField2());
			childrenFeatures.add(ExifPackage.eINSTANCE.getTiffIfdType_TiffField3());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns TiffIfdType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TiffIfdType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_TiffIfdType_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(TiffIfdType.class)) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_ImageWidth(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_ImageLength(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_BitsPerSample(),
				 ExifFactory.eINSTANCE.createBitsPerSampleType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Compression(),
				 ExifFactory.eINSTANCE.createCompressionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_PhotometricInterpretation(),
				 ExifFactory.eINSTANCE.createPhotometricInterpretationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Orientation(),
				 ExifFactory.eINSTANCE.createOrientationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_SamplesPerPixel(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_PlanarConfiguration(),
				 ExifFactory.eINSTANCE.createPlanarConfigurationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrSubSampling(),
				 ExifFactory.eINSTANCE.createYCbCrSubSamplingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrPositioning(),
				 ExifFactory.eINSTANCE.createYCbCrPositioningType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_XResolution(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_YResolution(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_ResolutionUnit(),
				 ExifFactory.eINSTANCE.createResolutionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_StripOffsets(),
				 ExifFactory.eINSTANCE.createStripOffsetsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_RowsPerStrip(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_StripByteCounts(),
				 ExifFactory.eINSTANCE.createStripByteCountsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormat(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormatLength(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createBitsPerSampleType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createChromaticity()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createColorSpaceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createCompressionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createContrastType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createCustomRenderedType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createExifMetadataType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createExposureModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createExposureProgramType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createFileSourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createFlashType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGainControlType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsAltitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsBearingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsDifferentialType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsDirectionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsDistanceRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsLatitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsLatitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsLongitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsLongitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsMeasureModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsSpeedRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createGpsStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createInteroperabilityType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createLightSourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createMeteringModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createOrientationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createPhotometricInterpretationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createPlanarConfigurationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createPrimaryChromaticitiesType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createResolutionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSaturationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSceneCaptureType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSensingMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSharpnessType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSingleFieldT()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createStripByteCountsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createStripOffsetsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSubjectLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSubjectAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createSubjectDistanceRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createUuidType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createWhiteBalanceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createWhitePointType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createYCbCrCoefficientsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createYCbCrPositioningType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 ExifFactory.eINSTANCE.createYCbCrSubSamplingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 PhototoolkitFactory.eINSTANCE.createPhoto()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 PhototoolkitFactory.eINSTANCE.createGallery()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_WhitePoint(),
				 ExifFactory.eINSTANCE.createWhitePointType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_PrimaryChromaticities(),
				 ExifFactory.eINSTANCE.createPrimaryChromaticitiesType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_YCbCrCoefficients(),
				 ExifFactory.eINSTANCE.createYCbCrCoefficientsType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_ReferenceBlackWhite(),
				 ExifFactory.eINSTANCE.createPrimaryChromaticitiesType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_DateTime(),
				 ExifFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_ImageDescription(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Make(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Model(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Software(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Artist(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_Copyright(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TiffField1(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TiffField2(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getTiffIfdType_TiffField3(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_ImageWidth() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_ImageLength() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_SamplesPerPixel() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_RowsPerStrip() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormat() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_JPEGInterChangeFormatLength() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_TransferFunction() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_BitsPerSample() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Compression() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_PhotometricInterpretation() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Orientation() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_PlanarConfiguration() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_YCbCrSubSampling() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_YCbCrPositioning() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_XResolution() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_YResolution() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_ResolutionUnit() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_StripOffsets() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_StripByteCounts() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_DateTime() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_PrimaryChromaticities() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_ReferenceBlackWhite() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_TiffField3() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_TiffField1() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_TiffField2() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_ImageDescription() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Make() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Model() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Software() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Artist() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_Copyright() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_WhitePoint() ||
			childFeature == ExifPackage.eINSTANCE.getTiffIfdType_YCbCrCoefficients();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PhototoolkitEditPlugin.INSTANCE;
	}

}
