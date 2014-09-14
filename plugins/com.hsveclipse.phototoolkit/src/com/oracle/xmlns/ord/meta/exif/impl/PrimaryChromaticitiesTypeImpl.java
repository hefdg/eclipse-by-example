/**
 */
package com.oracle.xmlns.ord.meta.exif.impl;

import com.oracle.xmlns.ord.meta.exif.Chromaticity;
import com.oracle.xmlns.ord.meta.exif.ExifPackage;
import com.oracle.xmlns.ord.meta.exif.PrimaryChromaticitiesType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Chromaticities Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.PrimaryChromaticitiesTypeImpl#getColor1 <em>Color1</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.PrimaryChromaticitiesTypeImpl#getColor2 <em>Color2</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.PrimaryChromaticitiesTypeImpl#getColor3 <em>Color3</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.PrimaryChromaticitiesTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryChromaticitiesTypeImpl extends MinimalEObjectImpl.Container implements PrimaryChromaticitiesType {
	/**
	 * The cached value of the '{@link #getColor1() <em>Color1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor1()
	 * @generated
	 * @ordered
	 */
	protected Chromaticity color1;

	/**
	 * The cached value of the '{@link #getColor2() <em>Color2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor2()
	 * @generated
	 * @ordered
	 */
	protected Chromaticity color2;

	/**
	 * The cached value of the '{@link #getColor3() <em>Color3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor3()
	 * @generated
	 * @ordered
	 */
	protected Chromaticity color3;

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
	protected PrimaryChromaticitiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getPrimaryChromaticitiesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromaticity getColor1() {
		return color1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor1(Chromaticity newColor1, NotificationChain msgs) {
		Chromaticity oldColor1 = color1;
		color1 = newColor1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1, oldColor1, newColor1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor1(Chromaticity newColor1) {
		if (newColor1 != color1) {
			NotificationChain msgs = null;
			if (color1 != null)
				msgs = ((InternalEObject)color1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1, null, msgs);
			if (newColor1 != null)
				msgs = ((InternalEObject)newColor1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1, null, msgs);
			msgs = basicSetColor1(newColor1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1, newColor1, newColor1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromaticity getColor2() {
		return color2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor2(Chromaticity newColor2, NotificationChain msgs) {
		Chromaticity oldColor2 = color2;
		color2 = newColor2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2, oldColor2, newColor2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor2(Chromaticity newColor2) {
		if (newColor2 != color2) {
			NotificationChain msgs = null;
			if (color2 != null)
				msgs = ((InternalEObject)color2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2, null, msgs);
			if (newColor2 != null)
				msgs = ((InternalEObject)newColor2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2, null, msgs);
			msgs = basicSetColor2(newColor2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2, newColor2, newColor2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chromaticity getColor3() {
		return color3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColor3(Chromaticity newColor3, NotificationChain msgs) {
		Chromaticity oldColor3 = color3;
		color3 = newColor3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3, oldColor3, newColor3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor3(Chromaticity newColor3) {
		if (newColor3 != color3) {
			NotificationChain msgs = null;
			if (color3 != null)
				msgs = ((InternalEObject)color3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3, null, msgs);
			if (newColor3 != null)
				msgs = ((InternalEObject)newColor3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3, null, msgs);
			msgs = basicSetColor3(newColor3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3, newColor3, newColor3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
				return basicSetColor1(null, msgs);
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
				return basicSetColor2(null, msgs);
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
				return basicSetColor3(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
				return getColor1();
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
				return getColor2();
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
				return getColor3();
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG:
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
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
				setColor1((Chromaticity)newValue);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
				setColor2((Chromaticity)newValue);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
				setColor3((Chromaticity)newValue);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG:
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
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
				setColor1((Chromaticity)null);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
				setColor2((Chromaticity)null);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
				setColor3((Chromaticity)null);
				return;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG:
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
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR1:
				return color1 != null;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR2:
				return color2 != null;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__COLOR3:
				return color3 != null;
			case ExifPackage.PRIMARY_CHROMATICITIES_TYPE__TAG:
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
		result.append(" (tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //PrimaryChromaticitiesTypeImpl
