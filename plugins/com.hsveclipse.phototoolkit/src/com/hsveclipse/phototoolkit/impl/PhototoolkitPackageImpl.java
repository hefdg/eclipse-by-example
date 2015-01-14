/**
 */
package com.hsveclipse.phototoolkit.impl;

import com.hsveclipse.phototoolkit.PhototoolkitFactory;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.exif.ExifPackage;
import com.hsveclipse.phototoolkit.exif.impl.ExifPackageImpl;
import java.io.IOException;
import java.net.URL;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhototoolkitPackageImpl extends EPackageImpl implements PhototoolkitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "phototoolkit.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass photoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass galleryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.hsveclipse.phototoolkit.PhototoolkitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PhototoolkitPackageImpl() {
		super(eNS_URI, PhototoolkitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PhototoolkitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static PhototoolkitPackage init() {
		if (isInited) return (PhototoolkitPackage)EPackage.Registry.INSTANCE.getEPackage(PhototoolkitPackage.eNS_URI);

		// Obtain or create and register package
		PhototoolkitPackageImpl thePhototoolkitPackage = (PhototoolkitPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhototoolkitPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhototoolkitPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExifPackageImpl theExifPackage = (ExifPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI) instanceof ExifPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExifPackage.eNS_URI) : ExifPackage.eINSTANCE);

		// Load packages
		thePhototoolkitPackage.loadPackage();

		// Fix loaded packages
		thePhototoolkitPackage.fixPackageContents();
		theExifPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		thePhototoolkitPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PhototoolkitPackage.eNS_URI, thePhototoolkitPackage);
		return thePhototoolkitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhoto() {
		if (photoEClass == null) {
			photoEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PhototoolkitPackage.eNS_URI).getEClassifiers().get(0);
		}
		return photoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_ID() {
        return (EAttribute)getPhoto().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Name() {
        return (EAttribute)getPhoto().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Tags() {
        return (EAttribute)getPhoto().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhoto_Uri() {
        return (EAttribute)getPhoto().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhoto_Exif() {
        return (EReference)getPhoto().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGallery() {
		if (galleryEClass == null) {
			galleryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(PhototoolkitPackage.eNS_URI).getEClassifiers().get(1);
		}
		return galleryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGallery_Name() {
        return (EAttribute)getGallery().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGallery_Url() {
        return (EAttribute)getGallery().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGallery_Description() {
        return (EAttribute)getGallery().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGallery_Photos() {
        return (EReference)getGallery().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhototoolkitFactory getPhototoolkitFactory() {
		return (PhototoolkitFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("com.hsveclipse.phototoolkit." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //PhototoolkitPackageImpl
