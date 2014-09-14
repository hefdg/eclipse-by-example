/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strip Offsets Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripOffsetsType#getStripOffset <em>Strip Offset</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.StripOffsetsType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripOffsetsType()
 * @model extendedMetaData="name='stripOffsetsType' kind='elementOnly'"
 * @generated
 */
public interface StripOffsetsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Strip Offset</b></em>' containment reference list.
	 * The list contents are of type {@link com.oracle.xmlns.ord.meta.exif.StripOffsetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Offset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Offset</em>' containment reference list.
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripOffsetsType_StripOffset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StripOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StripOffsetType> getStripOffset();

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
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getStripOffsetsType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.StripOffsetsType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // StripOffsetsType
