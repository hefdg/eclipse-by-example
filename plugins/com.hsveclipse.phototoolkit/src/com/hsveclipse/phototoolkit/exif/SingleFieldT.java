/**
 */
package com.hsveclipse.phototoolkit.exif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Field T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getName <em>Name</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getValue <em>Value</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSingleFieldT()
 * @model extendedMetaData="name='singleField_t' kind='elementOnly'"
 * @generated
 */
public interface SingleFieldT extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSingleFieldT_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSingleFieldT_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.DatatypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getSingleFieldT_Datatype()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Datatype' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeType getDatatype();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.DatatypeType
	 * @see #isSetDatatype()
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DatatypeType value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @generated
	 */
	void unsetDatatype();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.SingleFieldT#getDatatype <em>Datatype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatype</em>' attribute is set.
	 * @see #unsetDatatype()
	 * @see #getDatatype()
	 * @see #setDatatype(DatatypeType)
	 * @generated
	 */
	boolean isSetDatatype();

} // SingleFieldT
