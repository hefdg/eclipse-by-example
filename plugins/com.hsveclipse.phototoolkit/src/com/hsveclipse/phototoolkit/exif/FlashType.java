/**
 */
package com.hsveclipse.phototoolkit.exif;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flash Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getFired <em>Fired</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getReturn <em>Return</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getMode <em>Mode</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getFunction <em>Function</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction <em>Red Eye Reduction</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.FlashType#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType()
 * @model extendedMetaData="name='flashType' kind='elementOnly'"
 * @generated
 */
public interface FlashType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fired</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.YesNoT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fired</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetFired()
	 * @see #unsetFired()
	 * @see #setFired(YesNoT)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_Fired()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Fired' namespace='##targetNamespace'"
	 * @generated
	 */
	YesNoT getFired();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFired <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fired</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetFired()
	 * @see #unsetFired()
	 * @see #getFired()
	 * @generated
	 */
	void setFired(YesNoT value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFired <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFired()
	 * @see #getFired()
	 * @see #setFired(YesNoT)
	 * @generated
	 */
	void unsetFired();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFired <em>Fired</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fired</em>' attribute is set.
	 * @see #unsetFired()
	 * @see #getFired()
	 * @see #setFired(YesNoT)
	 * @generated
	 */
	boolean isSetFired();

	/**
	 * Returns the value of the '<em><b>Return</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.FlashReturnT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(FlashReturnT)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_Return()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Return' namespace='##targetNamespace'"
	 * @generated
	 */
	FlashReturnT getReturn();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.FlashReturnT
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(FlashReturnT value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #getReturn()
	 * @see #setReturn(FlashReturnT)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getReturn <em>Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' attribute is set.
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @see #setReturn(FlashReturnT)
	 * @generated
	 */
	boolean isSetReturn();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.FlashModeT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #setMode(FlashModeT)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_Mode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Mode' namespace='##targetNamespace'"
	 * @generated
	 */
	FlashModeT getMode();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.FlashModeT
	 * @see #isSetMode()
	 * @see #unsetMode()
	 * @see #getMode()
	 * @generated
	 */
	void setMode(FlashModeT value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMode()
	 * @see #getMode()
	 * @see #setMode(FlashModeT)
	 * @generated
	 */
	void unsetMode();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getMode <em>Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mode</em>' attribute is set.
	 * @see #unsetMode()
	 * @see #getMode()
	 * @see #setMode(FlashModeT)
	 * @generated
	 */
	boolean isSetMode();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.YesNoT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #setFunction(YesNoT)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_Function()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	YesNoT getFunction();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetFunction()
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(YesNoT value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFunction()
	 * @see #getFunction()
	 * @see #setFunction(YesNoT)
	 * @generated
	 */
	void unsetFunction();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getFunction <em>Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Function</em>' attribute is set.
	 * @see #unsetFunction()
	 * @see #getFunction()
	 * @see #setFunction(YesNoT)
	 * @generated
	 */
	boolean isSetFunction();

	/**
	 * Returns the value of the '<em><b>Red Eye Reduction</b></em>' attribute.
	 * The literals are from the enumeration {@link com.hsveclipse.phototoolkit.exif.YesNoT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red Eye Reduction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red Eye Reduction</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetRedEyeReduction()
	 * @see #unsetRedEyeReduction()
	 * @see #setRedEyeReduction(YesNoT)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_RedEyeReduction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RedEyeReduction' namespace='##targetNamespace'"
	 * @generated
	 */
	YesNoT getRedEyeReduction();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction <em>Red Eye Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red Eye Reduction</em>' attribute.
	 * @see com.hsveclipse.phototoolkit.exif.YesNoT
	 * @see #isSetRedEyeReduction()
	 * @see #unsetRedEyeReduction()
	 * @see #getRedEyeReduction()
	 * @generated
	 */
	void setRedEyeReduction(YesNoT value);

	/**
	 * Unsets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction <em>Red Eye Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRedEyeReduction()
	 * @see #getRedEyeReduction()
	 * @see #setRedEyeReduction(YesNoT)
	 * @generated
	 */
	void unsetRedEyeReduction();

	/**
	 * Returns whether the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getRedEyeReduction <em>Red Eye Reduction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Red Eye Reduction</em>' attribute is set.
	 * @see #unsetRedEyeReduction()
	 * @see #getRedEyeReduction()
	 * @see #setRedEyeReduction(YesNoT)
	 * @generated
	 */
	boolean isSetRedEyeReduction();

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
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getFlashType_Tag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='tag'"
	 * @generated
	 */
	BigInteger getTag();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.FlashType#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(BigInteger value);

} // FlashType
