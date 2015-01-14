/**
 */
package com.hsveclipse.phototoolkit.impl;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.exif.ExifMetadataType;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Photo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.PhotoImpl#getID <em>ID</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.PhotoImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.PhotoImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.PhotoImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.impl.PhotoImpl#getExif <em>Exif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhotoImpl extends MinimalEObjectImpl.Container implements Photo {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExif() <em>Exif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExif()
	 * @generated
	 * @ordered
	 */
	protected ExifMetadataType exif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhotoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhototoolkitPackage.Literals.PHOTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhototoolkitPackage.PHOTO__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhototoolkitPackage.PHOTO__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, PhototoolkitPackage.PHOTO__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhototoolkitPackage.PHOTO__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExifMetadataType getExif() {
		return exif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExif(ExifMetadataType newExif, NotificationChain msgs) {
		ExifMetadataType oldExif = exif;
		exif = newExif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhototoolkitPackage.PHOTO__EXIF, oldExif, newExif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExif(ExifMetadataType newExif) {
		if (newExif != exif) {
			NotificationChain msgs = null;
			if (exif != null)
				msgs = ((InternalEObject)exif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhototoolkitPackage.PHOTO__EXIF, null, msgs);
			if (newExif != null)
				msgs = ((InternalEObject)newExif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhototoolkitPackage.PHOTO__EXIF, null, msgs);
			msgs = basicSetExif(newExif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PhototoolkitPackage.PHOTO__EXIF, newExif, newExif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PhototoolkitPackage.PHOTO__EXIF:
				return basicSetExif(null, msgs);
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
			case PhototoolkitPackage.PHOTO__ID:
				return getID();
			case PhototoolkitPackage.PHOTO__NAME:
				return getName();
			case PhototoolkitPackage.PHOTO__TAGS:
				return getTags();
			case PhototoolkitPackage.PHOTO__URI:
				return getUri();
			case PhototoolkitPackage.PHOTO__EXIF:
				return getExif();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PhototoolkitPackage.PHOTO__ID:
				setID((String)newValue);
				return;
			case PhototoolkitPackage.PHOTO__NAME:
				setName((String)newValue);
				return;
			case PhototoolkitPackage.PHOTO__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case PhototoolkitPackage.PHOTO__URI:
				setUri((String)newValue);
				return;
			case PhototoolkitPackage.PHOTO__EXIF:
				setExif((ExifMetadataType)newValue);
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
			case PhototoolkitPackage.PHOTO__ID:
				setID(ID_EDEFAULT);
				return;
			case PhototoolkitPackage.PHOTO__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PhototoolkitPackage.PHOTO__TAGS:
				getTags().clear();
				return;
			case PhototoolkitPackage.PHOTO__URI:
				setUri(URI_EDEFAULT);
				return;
			case PhototoolkitPackage.PHOTO__EXIF:
				setExif((ExifMetadataType)null);
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
			case PhototoolkitPackage.PHOTO__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case PhototoolkitPackage.PHOTO__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PhototoolkitPackage.PHOTO__TAGS:
				return tags != null && !tags.isEmpty();
			case PhototoolkitPackage.PHOTO__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case PhototoolkitPackage.PHOTO__EXIF:
				return exif != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", tags: ");
		result.append(tags);
		result.append(", uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PhotoImpl
