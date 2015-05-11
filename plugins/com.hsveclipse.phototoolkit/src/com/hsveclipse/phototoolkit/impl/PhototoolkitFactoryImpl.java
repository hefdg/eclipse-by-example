/**
 */
package com.hsveclipse.phototoolkit.impl;

import com.hsveclipse.phototoolkit.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhototoolkitFactoryImpl extends EFactoryImpl implements PhototoolkitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PhototoolkitFactory init() {
		try {
			PhototoolkitFactory thePhototoolkitFactory = (PhototoolkitFactory)EPackage.Registry.INSTANCE.getEFactory(PhototoolkitPackage.eNS_URI);
			if (thePhototoolkitFactory != null) {
				return thePhototoolkitFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PhototoolkitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhototoolkitFactoryImpl() {
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
			case PhototoolkitPackage.PHOTO: return createPhoto();
			case PhototoolkitPackage.GALLERY: return createGallery();
			case PhototoolkitPackage.SITE: return createSite();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Photo createPhoto() {
		PhotoImpl photo = new PhotoImpl();
		return photo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gallery createGallery() {
		GalleryImpl gallery = new GalleryImpl();
		return gallery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhototoolkitPackage getPhototoolkitPackage() {
		return (PhototoolkitPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PhototoolkitPackage getPackage() {
		return PhototoolkitPackage.eINSTANCE;
	}

} //PhototoolkitFactoryImpl
