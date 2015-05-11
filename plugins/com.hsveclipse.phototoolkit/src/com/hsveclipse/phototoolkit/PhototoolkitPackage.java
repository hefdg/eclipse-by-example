/**
 */
package com.hsveclipse.phototoolkit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.PhototoolkitFactory
 * @model kind="package"
 * @generated
 */
public interface PhototoolkitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "phototoolkit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.hsveclipse.phototoolkit/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "phototoolkit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhototoolkitPackage eINSTANCE = com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.impl.PhotoImpl <em>Photo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.impl.PhotoImpl
	 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getPhoto()
	 * @generated
	 */
	int PHOTO = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__NAME = 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__TAGS = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__URI = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Photo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.impl.GalleryImpl <em>Gallery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.impl.GalleryImpl
	 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getGallery()
	 * @generated
	 */
	int GALLERY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__URL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__PHOTOS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY__ID = 4;

	/**
	 * The number of structural features of the '<em>Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Gallery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GALLERY_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.hsveclipse.phototoolkit.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.hsveclipse.phototoolkit.impl.SiteImpl
	 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getSite()
	 * @generated
	 */
	int SITE = 2;

	/**
	 * The feature id for the '<em><b>Photos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__PHOTOS = 0;

	/**
	 * The feature id for the '<em><b>Galleries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__GALLERIES = 1;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.Photo <em>Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo
	 * @generated
	 */
	EClass getPhoto();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Photo#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo#getId()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Photo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo#getName()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.hsveclipse.phototoolkit.Photo#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo#getTags()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Tags();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Photo#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo#getUri()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Uri();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Photo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.hsveclipse.phototoolkit.Photo#getDescription()
	 * @see #getPhoto()
	 * @generated
	 */
	EAttribute getPhoto_Description();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.Gallery <em>Gallery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gallery</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery
	 * @generated
	 */
	EClass getGallery();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Gallery#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery#getName()
	 * @see #getGallery()
	 * @generated
	 */
	EAttribute getGallery_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Gallery#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery#getUrl()
	 * @see #getGallery()
	 * @generated
	 */
	EAttribute getGallery_Url();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Gallery#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery#getDescription()
	 * @see #getGallery()
	 * @generated
	 */
	EAttribute getGallery_Description();

	/**
	 * Returns the meta object for the reference list '{@link com.hsveclipse.phototoolkit.Gallery#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Photos</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery#getPhotos()
	 * @see #getGallery()
	 * @generated
	 */
	EReference getGallery_Photos();

	/**
	 * Returns the meta object for the attribute '{@link com.hsveclipse.phototoolkit.Gallery#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.hsveclipse.phototoolkit.Gallery#getId()
	 * @see #getGallery()
	 * @generated
	 */
	EAttribute getGallery_Id();

	/**
	 * Returns the meta object for class '{@link com.hsveclipse.phototoolkit.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see com.hsveclipse.phototoolkit.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hsveclipse.phototoolkit.Site#getPhotos <em>Photos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Photos</em>'.
	 * @see com.hsveclipse.phototoolkit.Site#getPhotos()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Photos();

	/**
	 * Returns the meta object for the containment reference list '{@link com.hsveclipse.phototoolkit.Site#getGalleries <em>Galleries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Galleries</em>'.
	 * @see com.hsveclipse.phototoolkit.Site#getGalleries()
	 * @see #getSite()
	 * @generated
	 */
	EReference getSite_Galleries();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PhototoolkitFactory getPhototoolkitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.hsveclipse.phototoolkit.impl.PhotoImpl <em>Photo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hsveclipse.phototoolkit.impl.PhotoImpl
		 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getPhoto()
		 * @generated
		 */
		EClass PHOTO = eINSTANCE.getPhoto();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__ID = eINSTANCE.getPhoto_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__NAME = eINSTANCE.getPhoto_Name();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__TAGS = eINSTANCE.getPhoto_Tags();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__URI = eINSTANCE.getPhoto_Uri();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHOTO__DESCRIPTION = eINSTANCE.getPhoto_Description();

		/**
		 * The meta object literal for the '{@link com.hsveclipse.phototoolkit.impl.GalleryImpl <em>Gallery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hsveclipse.phototoolkit.impl.GalleryImpl
		 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getGallery()
		 * @generated
		 */
		EClass GALLERY = eINSTANCE.getGallery();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY__NAME = eINSTANCE.getGallery_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY__URL = eINSTANCE.getGallery_Url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY__DESCRIPTION = eINSTANCE.getGallery_Description();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GALLERY__PHOTOS = eINSTANCE.getGallery_Photos();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GALLERY__ID = eINSTANCE.getGallery_Id();

		/**
		 * The meta object literal for the '{@link com.hsveclipse.phototoolkit.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.hsveclipse.phototoolkit.impl.SiteImpl
		 * @see com.hsveclipse.phototoolkit.impl.PhototoolkitPackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '<em><b>Photos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__PHOTOS = eINSTANCE.getSite_Photos();

		/**
		 * The meta object literal for the '<em><b>Galleries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SITE__GALLERIES = eINSTANCE.getSite_Galleries();

	}

} //PhototoolkitPackage
