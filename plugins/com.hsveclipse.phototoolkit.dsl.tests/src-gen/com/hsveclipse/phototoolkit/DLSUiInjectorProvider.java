/*
 * generated by Xtext
 */
package com.hsveclipse.phototoolkit;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DLSUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return com.hsveclipse.phototoolkit.ui.internal.DLSActivator.getInstance().getInjector("com.hsveclipse.phototoolkit.DLS");
	}
	
}
