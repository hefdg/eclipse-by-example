/**
 */
package com.hsveclipse.phototoolkit.tests;

import com.hsveclipse.phototoolkit.Gallery;
import com.hsveclipse.phototoolkit.PhototoolkitFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Gallery</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GalleryTest extends TestCase {

	/**
	 * The fixture for this Gallery test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gallery fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GalleryTest.class);
	}

	/**
	 * Constructs a new Gallery test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GalleryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Gallery test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Gallery fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Gallery test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gallery getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PhototoolkitFactory.eINSTANCE.createGallery());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GalleryTest
