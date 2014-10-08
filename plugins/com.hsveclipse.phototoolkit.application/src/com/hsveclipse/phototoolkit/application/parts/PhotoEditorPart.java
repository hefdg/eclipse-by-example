package com.hsveclipse.phototoolkit.application.parts;

import java.util.EventObject;
import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.provider.PhototoolkitItemProviderAdapterFactory;
import com.oracle.xmlns.ord.meta.exif.provider.ExifItemProviderAdapterFactory;

import org.eclipse.swt.widgets.Text;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.edit.EMFEditObservables;

import com.hsveclipse.phototoolkit.PhototoolkitPackage.Literals;

public class PhotoEditorPart {
	private DataBindingContext m_bindingContext;

	private Photo photo;
	private MPart parentPart;
	private EditingDomain editingDomain;
	private ComposedAdapterFactory adapterFactory;
	private BasicCommandStack commandStack;
	private Text uriText;
	
	public PhotoEditorPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent, MPart part) {
		parentPart = part;
		photo = (Photo)part.getObject();
		initializeEditingDomain();
		parent.setLayout(null);
		
		Label lblHelloWorld = new Label(parent, SWT.NONE);
		lblHelloWorld.setBounds(10, 10, 65, 17);
		lblHelloWorld.setText("File URI");
		
		uriText = new Text(parent, SWT.BORDER);
		uriText.setBounds(69, 10, 369, 27);
		m_bindingContext = initDataBindings();
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		uriText.setFocus();
	}
	
	@Persist
	public void persist()
	{
		commandStack.flush();
	}
	
	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new PhototoolkitItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ExifItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are executed.
		//
		commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 parentPart.setDirty(commandStack.canUndo());
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
		
		// For now, we'll just create a resource to use
		Resource resource = editingDomain.createResource("http://sample.xmi");
		resource.getContents().add(photo);
	}
	
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextUriTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(uriText);
		IObservableValue photoUriObserveValue = EMFEditObservables.observeValue(editingDomain, photo, Literals.PHOTO__URI);
		bindingContext.bindValue(observeTextUriTextObserveWidget, photoUriObserveValue, null, null);
		//
		return bindingContext;
	}
}
