/**
 */
package com.oracle.xmlns.ord.meta.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getCenterX <em>Center X</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getSubjectLocationType()
 * @model extendedMetaData="name='subjectLocationType' kind='elementOnly'"
 * @generated
 */
public interface SubjectLocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Center X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center X</em>' attribute.
	 * @see #setCenterX(BigInteger)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getSubjectLocationType_CenterX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='CenterX' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCenterX();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getCenterX <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center X</em>' attribute.
	 * @see #getCenterX()
	 * @generated
	 */
	void setCenterX(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Center Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center Y</em>' attribute.
	 * @see #setCenterY(BigInteger)
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getSubjectLocationType_CenterY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='element' name='CenterY' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCenterY();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getCenterY <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center Y</em>' attribute.
	 * @see #getCenterY()
	 * @generated
	 */
	void setCenterY(BigInteger value);

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
	 * @see com.oracle.xmlns.ord.meta.exif.ExifPackage#getSubjectLocationType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.oracle.xmlns.ord.meta.exif.SubjectLocationType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // SubjectLocationType
