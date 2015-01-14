 
package com.hsveclipse.phototoolkit.application.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.application.parts.PhotoListPart;

public class NewPhotoHandler {
	@Execute
	public void execute(EPartService partService) {
		MPart part = partService.findPart("hsveclipse.part.photoList");
		if(part != null)
		{
			PhotoListPart photoListPart = (PhotoListPart)part.getObject();
			Photo photo = photoListPart.createPhoto();
			MPart editorPart = partService.createPart("hsveclipse.partDescriptor.photoPart");
			if(editorPart != null)
			{
				editorPart.getTransientData().put(Photo.class.getName(), photo);
				partService.showPart(editorPart, PartState.ACTIVATE);
			}
		}
	}
		
}