/**
 */
package com.oracle.xmlns.ord.meta.exif.provider;


import com.oracle.xmlns.ord.meta.exif.ExifFactory;
import com.oracle.xmlns.ord.meta.exif.ExifIfdType;
import com.oracle.xmlns.ord.meta.exif.ExifPackage;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.oracle.xmlns.ord.meta.exif.ExifIfdType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExifIfdTypeItemProvider 
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
	public ExifIfdTypeItemProvider(AdapterFactory adapterFactory) {
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

			addTagPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ExifIfdType_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ExifIfdType_tag_feature", "_UI_ExifIfdType_type"),
				 ExifPackage.eINSTANCE.getExifIfdType_Tag(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExifVersion());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FlashpixVersion());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ColorSpace());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ComponentsConfiguration());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_CompressedBitsPerPixel());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_PixelXDimension());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_PixelYDimension());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_MakerNote());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_UserComment());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_RelatedSoundFile());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_DateTimeOriginal());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_DateTimeDigitized());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubSecTime());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeOriginal());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeDigitized());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExposureTime());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FNumber());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExposureProgram());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SpectralSensitivity());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ISOSpeedRatings());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_OECF());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ShutterSpeedValue());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ApertureValue());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_BrightnessValue());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExposureBiasValue());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_MaxApertureValue());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubjectDistance());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_MeteringMode());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_LightSource());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_Flash());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FocalLength());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubjectArea());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FlashEnergy());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SpatialFrequencyResponse());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneXResolution());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneYResolution());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneResolutionUnit());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubjectLocation());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExposureIndex());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SensingMethod());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FileSource());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SceneType());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_CFAPattern());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_CustomRendered());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExposureMode());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_WhiteBalance());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_DigitalZoomRatio());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_FocalLengthIn35mmFilm());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SceneCaptureType());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_GainControl());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_Contrast());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_Saturation());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_Sharpness());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_DeviceSettingDescription());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_SubjectDistanceRange());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ImageUniqueID());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_Gamma());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExifField1());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExifField2());
			childrenFeatures.add(ExifPackage.eINSTANCE.getExifIfdType_ExifField3());
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
	 * This returns ExifIfdType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExifIfdType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((ExifIfdType)object).getTag();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_ExifIfdType_type") :
			getString("_UI_ExifIfdType_type") + " " + label;
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

		switch (notification.getFeatureID(ExifIfdType.class)) {
			case ExifPackage.EXIF_IFD_TYPE__TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExifPackage.EXIF_IFD_TYPE__EXIF_VERSION:
			case ExifPackage.EXIF_IFD_TYPE__FLASHPIX_VERSION:
			case ExifPackage.EXIF_IFD_TYPE__COLOR_SPACE:
			case ExifPackage.EXIF_IFD_TYPE__COMPONENTS_CONFIGURATION:
			case ExifPackage.EXIF_IFD_TYPE__COMPRESSED_BITS_PER_PIXEL:
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_XDIMENSION:
			case ExifPackage.EXIF_IFD_TYPE__PIXEL_YDIMENSION:
			case ExifPackage.EXIF_IFD_TYPE__MAKER_NOTE:
			case ExifPackage.EXIF_IFD_TYPE__USER_COMMENT:
			case ExifPackage.EXIF_IFD_TYPE__RELATED_SOUND_FILE:
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_ORIGINAL:
			case ExifPackage.EXIF_IFD_TYPE__DATE_TIME_DIGITIZED:
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME:
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_ORIGINAL:
			case ExifPackage.EXIF_IFD_TYPE__SUB_SEC_TIME_DIGITIZED:
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_TIME:
			case ExifPackage.EXIF_IFD_TYPE__FNUMBER:
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_PROGRAM:
			case ExifPackage.EXIF_IFD_TYPE__SPECTRAL_SENSITIVITY:
			case ExifPackage.EXIF_IFD_TYPE__ISO_SPEED_RATINGS:
			case ExifPackage.EXIF_IFD_TYPE__OECF:
			case ExifPackage.EXIF_IFD_TYPE__SHUTTER_SPEED_VALUE:
			case ExifPackage.EXIF_IFD_TYPE__APERTURE_VALUE:
			case ExifPackage.EXIF_IFD_TYPE__BRIGHTNESS_VALUE:
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_BIAS_VALUE:
			case ExifPackage.EXIF_IFD_TYPE__MAX_APERTURE_VALUE:
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE:
			case ExifPackage.EXIF_IFD_TYPE__METERING_MODE:
			case ExifPackage.EXIF_IFD_TYPE__LIGHT_SOURCE:
			case ExifPackage.EXIF_IFD_TYPE__FLASH:
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH:
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_AREA:
			case ExifPackage.EXIF_IFD_TYPE__FLASH_ENERGY:
			case ExifPackage.EXIF_IFD_TYPE__SPATIAL_FREQUENCY_RESPONSE:
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_XRESOLUTION:
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_YRESOLUTION:
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_PLANE_RESOLUTION_UNIT:
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_LOCATION:
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_INDEX:
			case ExifPackage.EXIF_IFD_TYPE__SENSING_METHOD:
			case ExifPackage.EXIF_IFD_TYPE__FILE_SOURCE:
			case ExifPackage.EXIF_IFD_TYPE__SCENE_TYPE:
			case ExifPackage.EXIF_IFD_TYPE__CFA_PATTERN:
			case ExifPackage.EXIF_IFD_TYPE__CUSTOM_RENDERED:
			case ExifPackage.EXIF_IFD_TYPE__EXPOSURE_MODE:
			case ExifPackage.EXIF_IFD_TYPE__WHITE_BALANCE:
			case ExifPackage.EXIF_IFD_TYPE__DIGITAL_ZOOM_RATIO:
			case ExifPackage.EXIF_IFD_TYPE__FOCAL_LENGTH_IN35MM_FILM:
			case ExifPackage.EXIF_IFD_TYPE__SCENE_CAPTURE_TYPE:
			case ExifPackage.EXIF_IFD_TYPE__GAIN_CONTROL:
			case ExifPackage.EXIF_IFD_TYPE__CONTRAST:
			case ExifPackage.EXIF_IFD_TYPE__SATURATION:
			case ExifPackage.EXIF_IFD_TYPE__SHARPNESS:
			case ExifPackage.EXIF_IFD_TYPE__DEVICE_SETTING_DESCRIPTION:
			case ExifPackage.EXIF_IFD_TYPE__SUBJECT_DISTANCE_RANGE:
			case ExifPackage.EXIF_IFD_TYPE__IMAGE_UNIQUE_ID:
			case ExifPackage.EXIF_IFD_TYPE__GAMMA:
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD1:
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD2:
			case ExifPackage.EXIF_IFD_TYPE__EXIF_FIELD3:
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
				(ExifPackage.eINSTANCE.getExifIfdType_ExifVersion(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FlashpixVersion(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ColorSpace(),
				 ExifFactory.eINSTANCE.createColorSpaceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ComponentsConfiguration(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_CompressedBitsPerPixel(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_PixelXDimension(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_PixelYDimension(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_MakerNote(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_UserComment(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_RelatedSoundFile(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_DateTimeOriginal(),
				 ExifFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_DateTimeDigitized(),
				 ExifFactory.eINSTANCE.createDateTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubSecTime(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeOriginal(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeDigitized(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExposureTime(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FNumber(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExposureProgram(),
				 ExifFactory.eINSTANCE.createExposureProgramType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SpectralSensitivity(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ISOSpeedRatings(),
				 ExifFactory.eINSTANCE.createNonNegativeIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_OECF(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ShutterSpeedValue(),
				 ExifFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ApertureValue(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_BrightnessValue(),
				 ExifFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExposureBiasValue(),
				 ExifFactory.eINSTANCE.createRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_MaxApertureValue(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubjectDistance(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_MeteringMode(),
				 ExifFactory.eINSTANCE.createMeteringModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_LightSource(),
				 ExifFactory.eINSTANCE.createLightSourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_Flash(),
				 ExifFactory.eINSTANCE.createFlashType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FocalLength(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubjectArea(),
				 ExifFactory.eINSTANCE.createSubjectAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FlashEnergy(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SpatialFrequencyResponse(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneXResolution(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneYResolution(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneResolutionUnit(),
				 ExifFactory.eINSTANCE.createResolutionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubjectLocation(),
				 ExifFactory.eINSTANCE.createSubjectLocationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubjectLocation(),
				 ExifFactory.eINSTANCE.createSubjectAreaType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExposureIndex(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SensingMethod(),
				 ExifFactory.eINSTANCE.createSensingMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FileSource(),
				 ExifFactory.eINSTANCE.createFileSourceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SceneType(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_CFAPattern(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_CustomRendered(),
				 ExifFactory.eINSTANCE.createCustomRenderedType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExposureMode(),
				 ExifFactory.eINSTANCE.createExposureModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_WhiteBalance(),
				 ExifFactory.eINSTANCE.createWhiteBalanceType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_DigitalZoomRatio(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_FocalLengthIn35mmFilm(),
				 ExifFactory.eINSTANCE.createPositiveIntegerType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SceneCaptureType(),
				 ExifFactory.eINSTANCE.createSceneCaptureType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_GainControl(),
				 ExifFactory.eINSTANCE.createGainControlType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_Contrast(),
				 ExifFactory.eINSTANCE.createContrastType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_Saturation(),
				 ExifFactory.eINSTANCE.createSaturationType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_Sharpness(),
				 ExifFactory.eINSTANCE.createSharpnessType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_DeviceSettingDescription(),
				 ExifFactory.eINSTANCE.createRepeatedFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_SubjectDistanceRange(),
				 ExifFactory.eINSTANCE.createSubjectDistanceRangeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ImageUniqueID(),
				 ExifFactory.eINSTANCE.createUuidType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_Gamma(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExifField1(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExifField2(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getExifIfdType_ExifField3(),
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
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExifVersion() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FlashpixVersion() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ComponentsConfiguration() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_UserComment() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_RelatedSoundFile() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SpectralSensitivity() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubjectDistance() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SceneType() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_CompressedBitsPerPixel() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExposureTime() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FNumber() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ApertureValue() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_MaxApertureValue() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FocalLength() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FlashEnergy() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneXResolution() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_FocalPlaneYResolution() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExposureIndex() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_DigitalZoomRatio() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_Gamma() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_PixelXDimension() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_PixelYDimension() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubSecTime() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeOriginal() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubSecTimeDigitized() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ISOSpeedRatings() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_MakerNote() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_OECF() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SpatialFrequencyResponse() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_CFAPattern() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_DeviceSettingDescription() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExifField3() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_DateTimeOriginal() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_DateTimeDigitized() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ShutterSpeedValue() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_BrightnessValue() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExposureBiasValue() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubjectArea() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_SubjectLocation() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExifField1() ||
			childFeature == ExifPackage.eINSTANCE.getExifIfdType_ExifField2();

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
		return ExifEditPlugin.INSTANCE;
	}

}
