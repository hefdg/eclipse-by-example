/**
 */
package com.hsveclipse.phototoolkit;

import com.hsveclipse.phototoolkit.exif.ExifMetadataType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.Photo#getID <em>ID</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Photo#getName <em>Name</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Photo#getTags <em>Tags</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Photo#getUri <em>Uri</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.Photo#getExif <em>Exif</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto()
 * @model
 * @generated
 */
public interface Photo extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Photo#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

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
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Photo#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Photo#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Exif</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exif</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exif</em>' containment reference.
	 * @see #setExif(ExifMetadataType)
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#getPhoto_Exif()
	 * @model containment="true"
	 * @generated
	 */
	ExifMetadataType getExif();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.Photo#getExif <em>Exif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exif</em>' containment reference.
	 * @see #getExif()
	 * @generated
	 */
	void setExif(ExifMetadataType value);

} // Photo
