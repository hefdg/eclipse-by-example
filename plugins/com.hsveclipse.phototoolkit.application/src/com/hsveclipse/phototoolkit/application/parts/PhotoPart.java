 
package com.hsveclipse.phototoolkit.application.parts;

import java.io.IOException;
import java.util.EventObject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.widgets.Composite;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.util.PhototoolkitAdapterFactory;

public class PhotoPart {

	private MPart part;
	private Photo photo;
	private EditingDomain domain;
	
	public PhotoPart() {
		
	}
	private AdapterImpl adapter = new AdapterImpl()
	{
		@Override
		public void notifyChanged(Notification msg) {
			if(PhototoolkitPackage.Literals.PHOTO__NAME.equals(msg.getFeature()))
			{
				part.setLabel(photo.getName());
			}	
		}
	};
	
	private CommandStackListener listener = new CommandStackListener() {

		@Override
		public void commandStackChanged(EventObject event) {
			CommandStack stack = (CommandStack)event.getSource();
			part.setDirty(stack.canUndo());
		}
		
	};

	@PostConstruct
	public void postConstruct(MPart part, Composite parent) {
		this.part = part;
		domain = new AdapterFactoryEditingDomain(new PhototoolkitAdapterFactory(),
				new BasicCommandStack());

		photo = (Photo)part.getTransientData().get(Photo.class.getName());
		if(photo == null)
		{
			return;
		} else {
			domain.getResourceSet().getResources().add(photo.eResource());
			photo.eAdapters().add(adapter);
			part.setElementId(photo.getId());
			part.setLabel(photo.getName());
		}
		domain.getCommandStack().addCommandStackListener(listener);
		try {
			ECPSWTViewRenderer.INSTANCE.render(parent, photo);
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}
	}

	@PreDestroy
	public void preDestroy()
	{
		photo.eAdapters().remove(adapter);
		while(domain.getCommandStack().canUndo())
		{
			domain.getCommandStack().undo();
		}
		domain.getResourceSet().getResources().clear();
		domain.getCommandStack().removeCommandStackListener(listener);
	}
	
	@Persist
	public void save()
	{
		try {
			photo.eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		domain.getCommandStack().flush();
	}

}