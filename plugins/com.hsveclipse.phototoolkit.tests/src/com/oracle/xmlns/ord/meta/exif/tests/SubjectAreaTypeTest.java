/**
 */
package com.oracle.xmlns.ord.meta.exif.tests;

import com.oracle.xmlns.ord.meta.exif.ExifFactory;
import com.oracle.xmlns.ord.meta.exif.SubjectAreaType;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subject Area Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubjectAreaTypeTest extends SubjectLocationTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubjectAreaTypeTest.class);
	}

	/**
	 * Constructs a new Subject Area Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectAreaTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Subject Area Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SubjectAreaType getFixture() {
		return (SubjectAreaType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExifFactory.eINSTANCE.createSubjectAreaType());
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

} //SubjectAreaTypeTest
