package com.hsveclipse.phototoolkit.application.handlers;

import java.util.UUID;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

public class ImportFileHandler {
	@Execute
	public void execute(MWindow mWindow, EPartService partService) {
		FileDialog fd = new FileDialog(Display.getDefault().getActiveShell(),
				SWT.OPEN);
		String filename = fd.open();
		System.out.println(filename);
		if (filename != null) {
			if (filename.toUpperCase().endsWith("GIF")
					|| filename.toUpperCase().endsWith("JPEG")
					|| filename.toUpperCase().endsWith("JPG")
					|| filename.toUpperCase().endsWith("PNG")
					|| filename.toUpperCase().endsWith("BMP")) {
				IEclipseContext windowContext = mWindow.getContext();
				windowContext.set("import", filename);
				
				String id = "phototoolkit.shared.part.photoeditorpart";
				MPart part = partService.findPart(id);
				if (null != part) {
					partService.showPart(part, PartState.ACTIVATE);
				} else {
					System.err.println(id + " not found by EPartService");
				}
			}

		}
	}
	private String generateId()
	{
		return Long.toString(UUID.randomUUID().getMostSignificantBits());
	}
}