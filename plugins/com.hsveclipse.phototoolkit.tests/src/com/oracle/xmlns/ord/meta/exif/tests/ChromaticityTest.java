/**
 */
package com.oracle.xmlns.ord.meta.exif.tests;

import com.oracle.xmlns.ord.meta.exif.Chromaticity;
import com.oracle.xmlns.ord.meta.exif.ExifFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Chromaticity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChromaticityTest extends TestCase {

	/**
	 * The fixture for this Chromaticity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Chromaticity fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ChromaticityTest.class);
	}

	/**
	 * Constructs a new Chromaticity test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChromaticityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Chromaticity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Chromaticity fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Chromaticity test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Chromaticity getFixture() {
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
		setFixture(ExifFactory.eINSTANCE.createChromaticity());
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

} //ChromaticityTest
