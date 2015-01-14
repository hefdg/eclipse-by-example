/**
 */
package com.hsveclipse.phototoolkit.exif.impl;

import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.SubjectLocationType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.SubjectLocationTypeImpl#getCenterX <em>Center X</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.SubjectLocationTypeImpl#getCenterY <em>Center Y</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.impl.SubjectLocationTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubjectLocationTypeImpl extends MinimalEObjectImpl.Container implements SubjectLocationType {
	/**
	 * The default value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CENTER_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCenterX() <em>Center X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterX()
	 * @generated
	 * @ordered
	 */
	protected BigInteger centerX = CENTER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CENTER_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCenterY() <em>Center Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger centerY = CENTER_Y_EDEFAULT;

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
	protected SubjectLocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getSubjectLocationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCenterX() {
		return centerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterX(BigInteger newCenterX) {
		BigInteger oldCenterX = centerX;
		centerX = newCenterX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_X, oldCenterX, centerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCenterY() {
		return centerY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterY(BigInteger newCenterY) {
		BigInteger oldCenterY = centerY;
		centerY = newCenterY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_Y, oldCenterY, centerY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.SUBJECT_LOCATION_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_X:
				return getCenterX();
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_Y:
				return getCenterY();
			case ExifPackage.SUBJECT_LOCATION_TYPE__TAG:
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
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_X:
				setCenterX((BigInteger)newValue);
				return;
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_Y:
				setCenterY((BigInteger)newValue);
				return;
			case ExifPackage.SUBJECT_LOCATION_TYPE__TAG:
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
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_X:
				setCenterX(CENTER_X_EDEFAULT);
				return;
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_Y:
				setCenterY(CENTER_Y_EDEFAULT);
				return;
			case ExifPackage.SUBJECT_LOCATION_TYPE__TAG:
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
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_X:
				return CENTER_X_EDEFAULT == null ? centerX != null : !CENTER_X_EDEFAULT.equals(centerX);
			case ExifPackage.SUBJECT_LOCATION_TYPE__CENTER_Y:
				return CENTER_Y_EDEFAULT == null ? centerY != null : !CENTER_Y_EDEFAULT.equals(centerY);
			case ExifPackage.SUBJECT_LOCATION_TYPE__TAG:
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
		result.append(" (centerX: ");
		result.append(centerX);
		result.append(", centerY: ");
		result.append(centerY);
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //SubjectLocationTypeImpl
