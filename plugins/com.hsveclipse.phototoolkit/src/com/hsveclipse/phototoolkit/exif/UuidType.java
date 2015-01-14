/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uuid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.UuidType#getValue <em>Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.UuidType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getUuidType()
 * @model extendedMetaData="name='uuidType' kind='simple'"
 * @generated
 */
public interface UuidType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(byte[])
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getUuidType_Value()
	 * @model dataType="com.hsveclipse.phototoolkit.exif.UuidT"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	byte[] getValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.UuidType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(byte[] value);

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
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getUuidType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.UuidType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // UuidType
