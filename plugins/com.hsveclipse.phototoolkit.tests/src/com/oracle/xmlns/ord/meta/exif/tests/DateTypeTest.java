/**
 */
package com.oracle.xmlns.ord.meta.exif.tests;

import com.oracle.xmlns.ord.meta.exif.DateType;
import com.oracle.xmlns.ord.meta.exif.ExifFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateTypeTest extends TestCase {

	/**
	 * The fixture for this Date Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateType fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateTypeTest.class);
	}

	/**
	 * Constructs a new Date Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTypeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Date Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DateType fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Date Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateType getFixture() {
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
		setFixture(ExifFactory.eINSTANCE.createDateType());
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

} //DateTypeTest
