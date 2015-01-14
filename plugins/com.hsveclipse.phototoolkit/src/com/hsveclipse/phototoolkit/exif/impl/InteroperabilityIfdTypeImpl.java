/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.InteroperabilityIfdType;
import com.hsveclipse.phototoolkit.exif.InteroperabilityType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interoperability Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.InteroperabilityIfdTypeImpl#getInteroperabilityIndex <em>Interoperability Index</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.InteroperabilityIfdTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteroperabilityIfdTypeImpl extends MinimalEObjectImpl.Container implements InteroperabilityIfdType {
	/**
	 * The cached value of the '{@link #getInteroperabilityIndex() <em>Interoperability Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteroperabilityIndex()
	 * @generated
	 * @ordered
	 */
	protected InteroperabilityType interoperabilityIndex;

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
	protected InteroperabilityIfdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getInteroperabilityIfdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteroperabilityType getInteroperabilityIndex() {
		return interoperabilityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteroperabilityIndex(InteroperabilityType newInteroperabilityIndex, NotificationChain msgs) {
		InteroperabilityType oldInteroperabilityIndex = interoperabilityIndex;
		interoperabilityIndex = newInteroperabilityIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX, oldInteroperabilityIndex, newInteroperabilityIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteroperabilityIndex(InteroperabilityType newInteroperabilityIndex) {
		if (newInteroperabilityIndex != interoperabilityIndex) {
			NotificationChain msgs = null;
			if (interoperabilityIndex != null)
				msgs = ((InternalEObject)interoperabilityIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX, null, msgs);
			if (newInteroperabilityIndex != null)
				msgs = ((InternalEObject)newInteroperabilityIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX, null, msgs);
			msgs = basicSetInteroperabilityIndex(newInteroperabilityIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX, newInteroperabilityIndex, newInteroperabilityIndex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.INTEROPERABILITY_IFD_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX:
				return basicSetInteroperabilityIndex(null, msgs);
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
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX:
				return getInteroperabilityIndex();
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__TAG:
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
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX:
				setInteroperabilityIndex((InteroperabilityType)newValue);
				return;
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__TAG:
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
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX:
				setInteroperabilityIndex((InteroperabilityType)null);
				return;
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__TAG:
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
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__INTEROPERABILITY_INDEX:
				return interoperabilityIndex != null;
			case ExifPackage.INTEROPERABILITY_IFD_TYPE__TAG:
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

} //InteroperabilityIfdTypeImpl
