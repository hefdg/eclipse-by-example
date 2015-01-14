/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Chromaticities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor1 <em>Color1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor2 <em>Color2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor3 <em>Color3</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPrimaryChromaticitiesType()
 * @model extendedMetaData="name='primaryChromaticitiesType' kind='elementOnly'"
 * @generated
 */
public interface PrimaryChromaticitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Color1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color1</em>' containment reference.
	 * @see #setColor1(Chromaticity)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPrimaryChromaticitiesType_Color1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Color_1' namespace='##targetNamespace'"
	 * @generated
	 */
	Chromaticity getColor1();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor1 <em>Color1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color1</em>' containment reference.
	 * @see #getColor1()
	 * @generated
	 */
	void setColor1(Chromaticity value);

	/**
	 * Returns the value of the '<em><b>Color2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color2</em>' containment reference.
	 * @see #setColor2(Chromaticity)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPrimaryChromaticitiesType_Color2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Color_2' namespace='##targetNamespace'"
	 * @generated
	 */
	Chromaticity getColor2();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor2 <em>Color2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color2</em>' containment reference.
	 * @see #getColor2()
	 * @generated
	 */
	void setColor2(Chromaticity value);

	/**
	 * Returns the value of the '<em><b>Color3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color3</em>' containment reference.
	 * @see #setColor3(Chromaticity)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPrimaryChromaticitiesType_Color3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Color_3' namespace='##targetNamespace'"
	 * @generated
	 */
	Chromaticity getColor3();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getColor3 <em>Color3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color3</em>' containment reference.
	 * @see #getColor3()
	 * @generated
	 */
	void setColor3(Chromaticity value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getPrimaryChromaticitiesType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.PrimaryChromaticitiesType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // PrimaryChromaticitiesType
