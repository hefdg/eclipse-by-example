/**
 */
package com.hsveclipse.phototoolkit.util;

import com.hsveclipse.phototoolkit.PhototoolkitPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PhototoolkitXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhototoolkitXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PhototoolkitPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the PhototoolkitResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PhototoolkitResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PhototoolkitResourceFactoryImpl());
		}
		return registrations;
	}

} //PhototoolkitXMLProcessor
