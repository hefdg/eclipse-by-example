/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strip Byte Counts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripByteCountsType#getStripByteCount <em>Strip Byte Count</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripByteCountsType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountsType()
 * @model extendedMetaData="name='stripByteCountsType' kind='elementOnly'"
 * @generated
 */
public interface StripByteCountsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Strip Byte Count</b></em>' containment reference list.
	 * The list contents are of type {@link com.oracle.xmlns.ord.meta.exif.StripByteCountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Byte Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Byte Count</em>' containment reference list.
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountsType_StripByteCount()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StripByteCount' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StripByteCountType> getStripByteCount();

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
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripByteCountsType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.StripByteCountsType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // StripByteCountsType
