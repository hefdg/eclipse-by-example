/**
 */
package com.oracle.xmlns.ord.meta.exif.provider;


import com.oracle.xmlns.ord.meta.exif.ExifFactory;
import com.oracle.xmlns.ord.meta.exif.ExifPackage;
import com.oracle.xmlns.ord.meta.exif.GpsIfdType;

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
 * This is the item provider adapter for a {@link com.oracle.xmlns.ord.meta.exif.GpsIfdType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GpsIfdTypeItemProvider 
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
	public GpsIfdTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_GpsIfdType_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GpsIfdType_tag_feature", "_UI_GpsIfdType_type"),
				 ExifPackage.eINSTANCE.getGpsIfdType_Tag(),
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
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSVersionID());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitudeRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitude());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitudeRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitude());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSAltitudeRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSAltitude());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSTimeStamp());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSSatellites());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSStatus());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSMeasureMode());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDOP());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSSpeedRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSSpeed());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSTrackRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSTrack());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirectionRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirection());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSMapDatum());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitudeRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitude());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitudeRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitude());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearingRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearing());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestDistanceRef());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestDistance());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSProcessingMethod());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSAreaInformation());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDateStamp());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSDifferential());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSField1());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSField2());
			childrenFeatures.add(ExifPackage.eINSTANCE.getGpsIfdType_GPSField3());
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
	 * This returns GpsIfdType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GpsIfdType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((GpsIfdType)object).getTag();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GpsIfdType_type") :
			getString("_UI_GpsIfdType_type") + " " + label;
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

		switch (notification.getFeatureID(GpsIfdType.class)) {
			case ExifPackage.GPS_IFD_TYPE__TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExifPackage.GPS_IFD_TYPE__GPS_VERSION_ID:
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_LATITUDE:
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_LONGITUDE:
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_ALTITUDE:
			case ExifPackage.GPS_IFD_TYPE__GPS_TIME_STAMP:
			case ExifPackage.GPS_IFD_TYPE__GPS_SATELLITES:
			case ExifPackage.GPS_IFD_TYPE__GPS_STATUS:
			case ExifPackage.GPS_IFD_TYPE__GPS_MEASURE_MODE:
			case ExifPackage.GPS_IFD_TYPE__GPSDOP:
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_SPEED:
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_TRACK:
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_IMG_DIRECTION:
			case ExifPackage.GPS_IFD_TYPE__GPS_MAP_DATUM:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LATITUDE:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_LONGITUDE:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_BEARING:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE_REF:
			case ExifPackage.GPS_IFD_TYPE__GPS_DEST_DISTANCE:
			case ExifPackage.GPS_IFD_TYPE__GPS_PROCESSING_METHOD:
			case ExifPackage.GPS_IFD_TYPE__GPS_AREA_INFORMATION:
			case ExifPackage.GPS_IFD_TYPE__GPS_DATE_STAMP:
			case ExifPackage.GPS_IFD_TYPE__GPS_DIFFERENTIAL:
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD1:
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD2:
			case ExifPackage.GPS_IFD_TYPE__GPS_FIELD3:
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
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSVersionID(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitudeRef(),
				 ExifFactory.eINSTANCE.createGpsLatitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitude(),
				 ExifFactory.eINSTANCE.createGpsLatitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitudeRef(),
				 ExifFactory.eINSTANCE.createGpsLongitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitude(),
				 ExifFactory.eINSTANCE.createGpsLongitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSAltitudeRef(),
				 ExifFactory.eINSTANCE.createGpsAltitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSAltitude(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSTimeStamp(),
				 ExifFactory.eINSTANCE.createTimeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSSatellites(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSStatus(),
				 ExifFactory.eINSTANCE.createGpsStatusType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSMeasureMode(),
				 ExifFactory.eINSTANCE.createGpsMeasureModeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDOP(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSSpeedRef(),
				 ExifFactory.eINSTANCE.createGpsSpeedRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSSpeed(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSTrackRef(),
				 ExifFactory.eINSTANCE.createGpsDirectionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSTrack(),
				 ExifFactory.eINSTANCE.createGpsBearingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirectionRef(),
				 ExifFactory.eINSTANCE.createGpsDirectionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirection(),
				 ExifFactory.eINSTANCE.createGpsBearingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSMapDatum(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitudeRef(),
				 ExifFactory.eINSTANCE.createGpsLatitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitude(),
				 ExifFactory.eINSTANCE.createGpsLatitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitudeRef(),
				 ExifFactory.eINSTANCE.createGpsLongitudeRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitude(),
				 ExifFactory.eINSTANCE.createGpsLongitudeType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearingRef(),
				 ExifFactory.eINSTANCE.createGpsDirectionType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearing(),
				 ExifFactory.eINSTANCE.createGpsBearingType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestDistanceRef(),
				 ExifFactory.eINSTANCE.createGpsDistanceRefType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDestDistance(),
				 ExifFactory.eINSTANCE.createNonNegativeRealType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSProcessingMethod(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSAreaInformation(),
				 ExifFactory.eINSTANCE.createStringType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDateStamp(),
				 ExifFactory.eINSTANCE.createDateType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSDifferential(),
				 ExifFactory.eINSTANCE.createGpsDifferentialType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSField1(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSField2(),
				 ExifFactory.eINSTANCE.createSingleFieldType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getGpsIfdType_GPSField3(),
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
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSVersionID() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSSatellites() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSMapDatum() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSProcessingMethod() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSAreaInformation() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitudeRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitudeRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSLatitude() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLatitude() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitudeRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitudeRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSLongitude() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestLongitude() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSAltitude() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDOP() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSSpeed() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestDistance() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSTrackRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirectionRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearingRef() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSTrack() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSImgDirection() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSDestBearing() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSField1() ||
			childFeature == ExifPackage.eINSTANCE.getGpsIfdType_GPSField2();

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
