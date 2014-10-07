 
package com.hsveclipse.phototoolkit.application.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

public class ImportFileHandler {
	@Execute
	public void execute() {
		FileDialog fd = new FileDialog(Display.getDefault().getActiveShell(),
				SWT.OPEN);
		String filename = fd.open();
		if(filename != null)
		{
			
		}
	}
		
}