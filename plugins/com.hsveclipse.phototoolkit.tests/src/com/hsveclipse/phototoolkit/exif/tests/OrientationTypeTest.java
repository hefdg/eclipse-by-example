/**
 */
package com.hsveclipse.phototoolkit.exif.tests;

import com.hsveclipse.phototoolkit.exif.ExifFactory;
import com.hsveclipse.phototoolkit.exif.OrientationType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrientationTypeTest extends TestCase {

	/**
	 * The fixture for this Orientation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientationType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrientationTypeTest.class);
	}

	/**
	 * Constructs a new Orientation Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Orientation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OrientationType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Orientation Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrientationType getFixture() {
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
		setFixture(ExifFactory.eINSTANCE.createOrientationType());
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

} //OrientationTypeTest
