/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interoperability Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.InteroperabilityIfdType#getInteroperabilityIndex <em>Interoperability Index</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.InteroperabilityIfdType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getInteroperabilityIfdType()
 * @model extendedMetaData="name='InteroperabilityIfd_._type' kind='elementOnly'"
 * @generated
 */
public interface InteroperabilityIfdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Interoperability Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interoperability Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interoperability Index</em>' containment reference.
	 * @see #setInteroperabilityIndex(InteroperabilityType)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getInteroperabilityIfdType_InteroperabilityIndex()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InteroperabilityIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	InteroperabilityType getInteroperabilityIndex();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.InteroperabilityIfdType#getInteroperabilityIndex <em>Interoperability Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interoperability Index</em>' containment reference.
	 * @see #getInteroperabilityIndex()
	 * @generated
	 */
	void setInteroperabilityIndex(InteroperabilityType value);

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
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getInteroperabilityIfdType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.InteroperabilityIfdType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // InteroperabilityIfdType
