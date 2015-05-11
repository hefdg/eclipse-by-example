/**
 */
package com.hsveclipse.phototoolkit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.Site#getPhotos <em>Photos</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Site#getGalleries <em>Galleries</em>}</li>
 * </ul>
 *
 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Photos</b></em>' containment reference list.
	 * The list contents are of type {@link com.hsveclipse.phototoolkit.Photo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photos</em>' containment reference list.
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getSite_Photos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Photo> getPhotos();

	/**
	 * Returns the value of the '<em><b>Galleries</b></em>' containment reference list.
	 * The list contents are of type {@link com.hsveclipse.phototoolkit.Gallery}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Galleries</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Galleries</em>' containment reference list.
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getSite_Galleries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gallery> getGalleries();

} // Site
