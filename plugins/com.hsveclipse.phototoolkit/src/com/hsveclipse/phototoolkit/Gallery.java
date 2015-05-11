/**
 */
package com.hsveclipse.phototoolkit;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gallery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.Gallery#getName <em>Name</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Gallery#getUrl <em>Url</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Gallery#getDescription <em>Description</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Gallery#getPhotos <em>Photos</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Gallery#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery()
 * @model
 * @generated
 */
public interface Gallery extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Gallery#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Gallery#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Gallery#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Photos</b></em>' reference list.
	 * The list contents are of type {@link com.hsveclipse.phototoolkit.Photo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' reference list.
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery_Photos()
	 * @model
	 * @generated
	 */
	EList<Photo> getPhotos();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getGallery_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Gallery#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Gallery
