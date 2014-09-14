/**
 */
package com.oracle.xmlns.ord.meta.exif.tests;

import com.oracle.xmlns.ord.meta.exif.ColorSpaceType;
import com.oracle.xmlns.ord.meta.exif.ExifFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Color Space Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColorSpaceTypeTest extends TestCase {

	/**
	 * The fixture for this Color Space Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSpaceType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ColorSpaceTypeTest.class);
	}

	/**
	 * Constructs a new Color Space Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpaceTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Color Space Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ColorSpaceType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Color Space Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorSpaceType getFixture() {
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
		setFixture(ExifFactory.eINSTANCE.createColorSpaceType());
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

} //ColorSpaceTypeTest
