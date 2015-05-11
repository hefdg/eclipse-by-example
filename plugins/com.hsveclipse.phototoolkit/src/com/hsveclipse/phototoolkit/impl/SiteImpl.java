/**
 */
package com.hsveclipse.phototoolkit.impl;

import com.hsveclipse.phototoolkit.Gallery;
import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.Site;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.SiteImpl#getPhotos <em>Photos</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.SiteImpl#getGalleries <em>Galleries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SiteImpl extends MinimalEObjectImpl.Container implements Site {
	/**
	 * The cached value of the '{@link #getPhotos() <em>Photos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotos()
	 * @generated
	 * @ordered
	 */
	protected EList<Photo> photos;

	/**
	 * The cached value of the '{@link #getGalleries() <em>Galleries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGalleries()
	 * @generated
	 * @ordered
	 */
	protected EList<Gallery> galleries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhototoolkitPackage.Literals.SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Photo> getPhotos() {
		if (photos == null) {
			photos = new EObjectContainmentEList<Photo>(Photo.class, this, PhototoolkitPackage.SITE__PHOTOS);
		}
		return photos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Gallery> getGalleries() {
		if (galleries == null) {
			galleries = new EObjectContainmentEList<Gallery>(Gallery.class, this, PhototoolkitPackage.SITE__GALLERIES);
		}
		return galleries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhototoolkitPackage.SITE__PHOTOS:
				return ((InternalEList<?>)getPhotos()).basicRemove(otherEnd, msgs);
			case PhototoolkitPackage.SITE__GALLERIES:
				return ((InternalEList<?>)getGalleries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PhototoolkitPackage.SITE__PHOTOS:
				return getPhotos();
			case PhototoolkitPackage.SITE__GALLERIES:
				return getGalleries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhototoolkitPackage.SITE__PHOTOS:
				getPhotos().clear();
				getPhotos().addAll((Collection<? extends Photo>)newValue);
				return;
			case PhototoolkitPackage.SITE__GALLERIES:
				getGalleries().clear();
				getGalleries().addAll((Collection<? extends Gallery>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PhototoolkitPackage.SITE__PHOTOS:
				getPhotos().clear();
				return;
			case PhototoolkitPackage.SITE__GALLERIES:
				getGalleries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PhototoolkitPackage.SITE__PHOTOS:
				return photos != null && !photos.isEmpty();
			case PhototoolkitPackage.SITE__GALLERIES:
				return galleries != null && !galleries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SiteImpl
