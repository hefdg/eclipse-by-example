/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strip Offset Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getIndex <em>Index</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getStripOffsetType()
 * @model extendedMetaData="name='StripOffset_._type' kind='elementOnly'"
 * @generated
 */
public interface StripOffsetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getStripOffsetType_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='Index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(BigInteger)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getStripOffsetType_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='Offset' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getOffset();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.StripOffsetType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(BigInteger value);

} // StripOffsetType
