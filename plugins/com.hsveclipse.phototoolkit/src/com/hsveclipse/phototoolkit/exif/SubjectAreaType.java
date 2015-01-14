/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Area Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getDiameter <em>Diameter</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getWidth <em>Width</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSubjectAreaType()
 * @model extendedMetaData="name='subjectAreaType' kind='elementOnly'"
 * @generated
 */
public interface SubjectAreaType extends SubjectLocationType {
	/**
	 * Returns the value of the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diameter</em>' attribute.
	 * @see #setDiameter(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSubjectAreaType_Diameter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='Diameter' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getDiameter();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getDiameter <em>Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diameter</em>' attribute.
	 * @see #getDiameter()
	 * @generated
	 */
	void setDiameter(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSubjectAreaType_Width()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSubjectAreaType_Height()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='element' name='Height' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getHeight();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SubjectAreaType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(BigInteger value);

} // SubjectAreaType
