/**
 */
package com.hsveclipse.phototoolkit.exif.provider;


import com.hsveclipse.phototoolkit.exif.ExifFactory;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType;

import com.hsveclipse.phototoolkit.provider.PhototoolkitEditPlugin;

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
 * This is the item provider adapter for a {@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimaryChromaticitiesTypeItemProvider 
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
	public PrimaryChromaticitiesTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_PrimaryChromaticitiesType_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PrimaryChromaticitiesType_tag_feature", "_UI_PrimaryChromaticitiesType_type"),
				 ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Tag(),
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
			childrenFeatures.add(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color1());
			childrenFeatures.add(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color2());
			childrenFeatures.add(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color3());
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
	 * This returns PrimaryChromaticitiesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrimaryChromaticitiesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		BigInteger labelValue = ((PrimaryChromaticitiesType)object).getTag();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_PrimaryChromaticitiesType_type") :
			getString("_UI_PrimaryChromaticitiesType_type") + " " + label;
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

		switch (notification.getFeatureID(PrimaryChromaticitiesType.class)) {
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
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
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color1(),
				 ExifFactory.eINSTANCE.createChromaticity()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color1(),
				 ExifFactory.eINSTANCE.createWhitePointType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color2(),
				 ExifFactory.eINSTANCE.createChromaticity()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color2(),
				 ExifFactory.eINSTANCE.createWhitePointType()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color3(),
				 ExifFactory.eINSTANCE.createChromaticity()));

		newChildDescriptors.add
			(createChildParameter
				(ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color3(),
				 ExifFactory.eINSTANCE.createWhitePointType()));
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
			childFeature == ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color1() ||
			childFeature == ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color2() ||
			childFeature == ExifPackage.eINSTANCE.getPrimaryChromaticitiesType_Color3();

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
