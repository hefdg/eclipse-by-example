/**
 */
package com.oracle.xmlns.ord.meta.exif.impl;

import com.oracle.xmlns.ord.meta.exif.ExifPackage;
import com.oracle.xmlns.ord.meta.exif.FlashModeT;
import com.oracle.xmlns.ord.meta.exif.FlashReturnT;
import com.oracle.xmlns.ord.meta.exif.FlashType;
import com.oracle.xmlns.ord.meta.exif.YesNoT;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flash Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getFired <em>Fired</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getRedEyeReduction <em>Red Eye Reduction</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.FlashTypeImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlashTypeImpl extends MinimalEObjectImpl.Container implements FlashType {
	/**
	 * The default value of the '{@link #getFired() <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFired()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoT FIRED_EDEFAULT = YesNoT.YES;

	/**
	 * The cached value of the '{@link #getFired() <em>Fired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFired()
	 * @generated
	 * @ordered
	 */
	protected YesNoT fired = FIRED_EDEFAULT;

	/**
	 * This is true if the Fired attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean firedESet;

	/**
	 * The default value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected static final FlashReturnT RETURN_EDEFAULT = FlashReturnT.NO_STROBE_RETURN_FUNCTION;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected FlashReturnT return_ = RETURN_EDEFAULT;

	/**
	 * This is true if the Return attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnESet;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final FlashModeT MODE_EDEFAULT = FlashModeT.UNKNOWN;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected FlashModeT mode = MODE_EDEFAULT;

	/**
	 * This is true if the Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean modeESet;

	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoT FUNCTION_EDEFAULT = YesNoT.YES;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected YesNoT function = FUNCTION_EDEFAULT;

	/**
	 * This is true if the Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean functionESet;

	/**
	 * The default value of the '{@link #getRedEyeReduction() <em>Red Eye Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedEyeReduction()
	 * @generated
	 * @ordered
	 */
	protected static final YesNoT RED_EYE_REDUCTION_EDEFAULT = YesNoT.YES;

	/**
	 * The cached value of the '{@link #getRedEyeReduction() <em>Red Eye Reduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedEyeReduction()
	 * @generated
	 * @ordered
	 */
	protected YesNoT redEyeReduction = RED_EYE_REDUCTION_EDEFAULT;

	/**
	 * This is true if the Red Eye Reduction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean redEyeReductionESet;

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
	protected FlashTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getFlashType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoT getFired() {
		return fired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFired(YesNoT newFired) {
		YesNoT oldFired = fired;
		fired = newFired == null ? FIRED_EDEFAULT : newFired;
		boolean oldFiredESet = firedESet;
		firedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__FIRED, oldFired, fired, !oldFiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFired() {
		YesNoT oldFired = fired;
		boolean oldFiredESet = firedESet;
		fired = FIRED_EDEFAULT;
		firedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.FLASH_TYPE__FIRED, oldFired, FIRED_EDEFAULT, oldFiredESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFired() {
		return firedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashReturnT getReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturn(FlashReturnT newReturn) {
		FlashReturnT oldReturn = return_;
		return_ = newReturn == null ? RETURN_EDEFAULT : newReturn;
		boolean oldReturnESet = returnESet;
		returnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__RETURN, oldReturn, return_, !oldReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturn() {
		FlashReturnT oldReturn = return_;
		boolean oldReturnESet = returnESet;
		return_ = RETURN_EDEFAULT;
		returnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.FLASH_TYPE__RETURN, oldReturn, RETURN_EDEFAULT, oldReturnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturn() {
		return returnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlashModeT getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(FlashModeT newMode) {
		FlashModeT oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		boolean oldModeESet = modeESet;
		modeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__MODE, oldMode, mode, !oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMode() {
		FlashModeT oldMode = mode;
		boolean oldModeESet = modeESet;
		mode = MODE_EDEFAULT;
		modeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.FLASH_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMode() {
		return modeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoT getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(YesNoT newFunction) {
		YesNoT oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		boolean oldFunctionESet = functionESet;
		functionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__FUNCTION, oldFunction, function, !oldFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFunction() {
		YesNoT oldFunction = function;
		boolean oldFunctionESet = functionESet;
		function = FUNCTION_EDEFAULT;
		functionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.FLASH_TYPE__FUNCTION, oldFunction, FUNCTION_EDEFAULT, oldFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
		return functionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNoT getRedEyeReduction() {
		return redEyeReduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedEyeReduction(YesNoT newRedEyeReduction) {
		YesNoT oldRedEyeReduction = redEyeReduction;
		redEyeReduction = newRedEyeReduction == null ? RED_EYE_REDUCTION_EDEFAULT : newRedEyeReduction;
		boolean oldRedEyeReductionESet = redEyeReductionESet;
		redEyeReductionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION, oldRedEyeReduction, redEyeReduction, !oldRedEyeReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRedEyeReduction() {
		YesNoT oldRedEyeReduction = redEyeReduction;
		boolean oldRedEyeReductionESet = redEyeReductionESet;
		redEyeReduction = RED_EYE_REDUCTION_EDEFAULT;
		redEyeReductionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION, oldRedEyeReduction, RED_EYE_REDUCTION_EDEFAULT, oldRedEyeReductionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRedEyeReduction() {
		return redEyeReductionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.FLASH_TYPE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.FLASH_TYPE__FIRED:
				return getFired();
			case ExifPackage.FLASH_TYPE__RETURN:
				return getReturn();
			case ExifPackage.FLASH_TYPE__MODE:
				return getMode();
			case ExifPackage.FLASH_TYPE__FUNCTION:
				return getFunction();
			case ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION:
				return getRedEyeReduction();
			case ExifPackage.FLASH_TYPE__TAG:
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
			case ExifPackage.FLASH_TYPE__FIRED:
				setFired((YesNoT)newValue);
				return;
			case ExifPackage.FLASH_TYPE__RETURN:
				setReturn((FlashReturnT)newValue);
				return;
			case ExifPackage.FLASH_TYPE__MODE:
				setMode((FlashModeT)newValue);
				return;
			case ExifPackage.FLASH_TYPE__FUNCTION:
				setFunction((YesNoT)newValue);
				return;
			case ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION:
				setRedEyeReduction((YesNoT)newValue);
				return;
			case ExifPackage.FLASH_TYPE__TAG:
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
			case ExifPackage.FLASH_TYPE__FIRED:
				unsetFired();
				return;
			case ExifPackage.FLASH_TYPE__RETURN:
				unsetReturn();
				return;
			case ExifPackage.FLASH_TYPE__MODE:
				unsetMode();
				return;
			case ExifPackage.FLASH_TYPE__FUNCTION:
				unsetFunction();
				return;
			case ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION:
				unsetRedEyeReduction();
				return;
			case ExifPackage.FLASH_TYPE__TAG:
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
			case ExifPackage.FLASH_TYPE__FIRED:
				return isSetFired();
			case ExifPackage.FLASH_TYPE__RETURN:
				return isSetReturn();
			case ExifPackage.FLASH_TYPE__MODE:
				return isSetMode();
			case ExifPackage.FLASH_TYPE__FUNCTION:
				return isSetFunction();
			case ExifPackage.FLASH_TYPE__RED_EYE_REDUCTION:
				return isSetRedEyeReduction();
			case ExifPackage.FLASH_TYPE__TAG:
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
		result.append(" (fired: ");
		if (firedESet) result.append(fired); else result.append("<unset>");
		result.append(", return: ");
		if (returnESet) result.append(return_); else result.append("<unset>");
		result.append(", mode: ");
		if (modeESet) result.append(mode); else result.append("<unset>");
		result.append(", function: ");
		if (functionESet) result.append(function); else result.append("<unset>");
		result.append(", redEyeReduction: ");
		if (redEyeReductionESet) result.append(redEyeReduction); else result.append("<unset>");
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

} //FlashTypeImpl
