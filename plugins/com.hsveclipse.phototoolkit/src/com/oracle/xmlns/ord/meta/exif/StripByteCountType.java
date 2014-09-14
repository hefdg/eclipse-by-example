/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strip Byte Count Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripByteCountType#getIndex <em>Index</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripByteCountType#getBytes <em>Bytes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountType()
 * @model extendedMetaData="name='StripByteCount_._type' kind='elementOnly'"
 * @generated
 */
public interface StripByteCountType extends EObject {
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
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountType_Index()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='Index' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getIndex();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.StripByteCountType#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bytes</em>' attribute.
	 * @see #setBytes(BigInteger)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountType_Bytes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" required="true"
	 *        extendedMetaData="kind='element' name='Bytes' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getBytes();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.StripByteCountType#getBytes <em>Bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bytes</em>' attribute.
	 * @see #getBytes()
	 * @generated
	 */
	void setBytes(BigInteger value);

} // StripByteCountType
