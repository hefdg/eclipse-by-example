/**
 */
package com.hsveclipse.phototoolkit.exif.tests;

import com.hsveclipse.phototoolkit.exif.ExifFactory;
import com.hsveclipse.phototoolkit.exif.TimeType;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeTypeTest extends TestCase {

	/**
	 * The fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeTypeTest.class);
	}

	/**
	 * Constructs a new Time Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TimeType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Time Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeType getFixture() {
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
		setFixture(ExifFactory.eINSTANCE.createTimeType());
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

} //TimeTypeTest
