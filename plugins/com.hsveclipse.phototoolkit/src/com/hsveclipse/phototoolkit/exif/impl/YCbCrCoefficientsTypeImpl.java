/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.YCbCrCoefficientsType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YCb Cr Coefficients Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl#getCoefficient1 <em>Coefficient1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl#getCoefficient2 <em>Coefficient2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl#getCoefficient3 <em>Coefficient3</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.YCbCrCoefficientsTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YCbCrCoefficientsTypeImpl extends MinimalEObjectImpl.Container implements YCbCrCoefficientsType {
	/**
	 * The default value of the '{@link #getCoefficient1() <em>Coefficient1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient1()
	 * @generated
	 * @ordered
	 */
	protected static final float COEFFICIENT1_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoefficient1() <em>Coefficient1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient1()
	 * @generated
	 * @ordered
	 */
	protected float coefficient1 = COEFFICIENT1_EDEFAULT;

	/**
	 * This is true if the Coefficient1 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficient1ESet;

	/**
	 * The default value of the '{@link #getCoefficient2() <em>Coefficient2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient2()
	 * @generated
	 * @ordered
	 */
	protected static final float COEFFICIENT2_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoefficient2() <em>Coefficient2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient2()
	 * @generated
	 * @ordered
	 */
	protected float coefficient2 = COEFFICIENT2_EDEFAULT;

	/**
	 * This is true if the Coefficient2 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficient2ESet;

	/**
	 * The default value of the '{@link #getCoefficient3() <em>Coefficient3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient3()
	 * @generated
	 * @ordered
	 */
	protected static final float COEFFICIENT3_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCoefficient3() <em>Coefficient3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoefficient3()
	 * @generated
	 * @ordered
	 */
	protected float coefficient3 = COEFFICIENT3_EDEFAULT;

	/**
	 * This is true if the Coefficient3 attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coefficient3ESet;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tag = TAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YCbCrCoefficientsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getYCbCrCoefficientsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoefficient1() {
		return coefficient1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient1(float newCoefficient1) {
		float oldCoefficient1 = coefficient1;
		coefficient1 = newCoefficient1;
		boolean oldCoefficient1ESet = coefficient1ESet;
		coefficient1ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1, oldCoefficient1, coefficient1, !oldCoefficient1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient1() {
		float oldCoefficient1 = coefficient1;
		boolean oldCoefficient1ESet = coefficient1ESet;
		coefficient1 = COEFFICIENT1_EDEFAULT;
		coefficient1ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1, oldCoefficient1, COEFFICIENT1_EDEFAULT, oldCoefficient1ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient1() {
		return coefficient1ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoefficient2() {
		return coefficient2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient2(float newCoefficient2) {
		float oldCoefficient2 = coefficient2;
		coefficient2 = newCoefficient2;
		boolean oldCoefficient2ESet = coefficient2ESet;
		coefficient2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2, oldCoefficient2, coefficient2, !oldCoefficient2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient2() {
		float oldCoefficient2 = coefficient2;
		boolean oldCoefficient2ESet = coefficient2ESet;
		coefficient2 = COEFFICIENT2_EDEFAULT;
		coefficient2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2, oldCoefficient2, COEFFICIENT2_EDEFAULT, oldCoefficient2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient2() {
		return coefficient2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCoefficient3() {
		return coefficient3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoefficient3(float newCoefficient3) {
		float oldCoefficient3 = coefficient3;
		coefficient3 = newCoefficient3;
		boolean oldCoefficient3ESet = coefficient3ESet;
		coefficient3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3, oldCoefficient3, coefficient3, !oldCoefficient3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoefficient3() {
		float oldCoefficient3 = coefficient3;
		boolean oldCoefficient3ESet = coefficient3ESet;
		coefficient3 = COEFFICIENT3_EDEFAULT;
		coefficient3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3, oldCoefficient3, COEFFICIENT3_EDEFAULT, oldCoefficient3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoefficient3() {
		return coefficient3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(BigInteger newTag) {
		BigInteger oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.YCB_CR_COEFFICIENTS_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1:
				return getCoefficient1();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2:
				return getCoefficient2();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3:
				return getCoefficient3();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__TAG:
				return getTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1:
				setCoefficient1((Float)newValue);
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2:
				setCoefficient2((Float)newValue);
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3:
				setCoefficient3((Float)newValue);
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__TAG:
				setTag((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1:
				unsetCoefficient1();
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2:
				unsetCoefficient2();
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3:
				unsetCoefficient3();
				return;
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__TAG:
				setTag(TAG_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT1:
				return isSetCoefficient1();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT2:
				return isSetCoefficient2();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__COEFFICIENT3:
				return isSetCoefficient3();
			case ExifPackage.YCB_CR_COEFFICIENTS_TYPE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (coefficient1: ");
		if (coefficient1ESet) result.append(coefficient1); else result.append("<unset>");
		result.append(", coefficient2: ");
		if (coefficient2ESet) result.append(coefficient2); else result.append("<unset>");
		result.append(", coefficient3: ");
		if (coefficient3ESet) result.append(coefficient3); else result.append("<unset>");
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //YCbCrCoefficientsTypeImpl
