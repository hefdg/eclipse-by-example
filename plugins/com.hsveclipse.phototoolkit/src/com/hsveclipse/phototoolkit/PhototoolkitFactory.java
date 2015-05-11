/**
 */
package com.hsveclipse.phototoolkit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage
 * @generated
 */
public interface PhototoolkitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PhototoolkitFactory eINSTANCE = com.hsveclipse.phototoolkit.impl.PhototoolkitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Photo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Photo</em>'.
	 * @generated
	 */
	Photo createPhoto();

	/**
	 * Returns a new object of class '<em>Gallery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gallery</em>'.
	 * @generated
	 */
	Gallery createGallery();

	/**
	 * Returns a new object of class '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Site</em>'.
	 * @generated
	 */
	Site createSite();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PhototoolkitPackage getPhototoolkitPackage();

} //PhototoolkitFactory
