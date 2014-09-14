/**
 */
package com.oracle.xmlns.ord.meta.exif.tests;

import com.oracle.xmlns.ord.meta.exif.ExifFactory;
import com.oracle.xmlns.ord.meta.exif.WhitePointType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>White Point Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhitePointTypeTest extends ChromaticityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhitePointTypeTest.class);
	}

	/**
	 * Constructs a new White Point Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitePointTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this White Point Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhitePointType getFixture() {
		return (WhitePointType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExifFactory.eINSTANCE.createWhitePointType());
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

} //WhitePointTypeTest
