 
package com.hsveclipse.phototoolkit.application.handlers;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.e4.ui.workbench.modeling.ModelService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitFactory;

public class ImportFileHandler {
	
	@Inject
	EPartService partService;
	
	@Execute
	public void execute() {
		FileDialog fd = new FileDialog(Display.getDefault().getActiveShell(),
				SWT.OPEN);
		String filename = fd.open();
		if(filename != null)
		{
			MPart part = partService.createPart("com.hsveclipse.phototoolkit.photoEditor");
			Photo photo = PhototoolkitFactory.eINSTANCE.createPhoto();
			photo.setUri(filename);
			part.setObject(photo);
			partService.showPart(part, PartState.ACTIVATE);
//			MPart stackPart = partService.findPart("com.hsveclipse.phototoolkit.sharedStack");
//			if(stackPart != null)
//			{
//				((MPartStack)stackPart).getChildren().add(part);
//			}
		}
	}
		
}