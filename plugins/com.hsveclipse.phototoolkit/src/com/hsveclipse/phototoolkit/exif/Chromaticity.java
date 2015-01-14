/**
 */
package com.hsveclipse.phototoolkit.exif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chromaticity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getX <em>X</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getChromaticity()
 * @model extendedMetaData="name='chromaticity' kind='elementOnly'"
 * @generated
 */
public interface Chromaticity extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #setX(float)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getChromaticity_X()
	 * @model unsettable="true" dataType="com.hsveclipse.phototoolkit.exif.NonNegativeReal" required="true"
	 *        extendedMetaData="kind='element' name='X' namespace='##targetNamespace'"
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #isSetX()
	 * @see #unsetX()
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	void unsetX();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getX <em>X</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>X</em>' attribute is set.
	 * @see #unsetX()
	 * @see #getX()
	 * @see #setX(float)
	 * @generated
	 */
	boolean isSetX();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #setY(float)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getChromaticity_Y()
	 * @model unsettable="true" dataType="com.hsveclipse.phototoolkit.exif.NonNegativeReal" required="true"
	 *        extendedMetaData="kind='element' name='Y' namespace='##targetNamespace'"
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #isSetY()
	 * @see #unsetY()
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	void unsetY();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.Chromaticity#getY <em>Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Y</em>' attribute is set.
	 * @see #unsetY()
	 * @see #getY()
	 * @see #setY(float)
	 * @generated
	 */
	boolean isSetY();

} // Chromaticity
