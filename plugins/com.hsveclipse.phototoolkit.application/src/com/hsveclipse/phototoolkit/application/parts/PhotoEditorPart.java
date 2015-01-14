package com.hsveclipse.phototoolkit.application.parts;

import java.util.EventObject;
import java.util.HashMap;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.provider.PhototoolkitItemProviderAdapterFactory;

import org.eclipse.swt.widgets.Text;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.emf.databinding.edit.EMFEditObservables;

import com.hsveclipse.phototoolkit.PhototoolkitPackage.Literals;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

import com.hsveclipse.phototoolkit.Photo;

public class PhotoEditorPart {
	private DataBindingContext m_bindingContext;

	private Photo photo;
	private MPart parentPart;
	private EditingDomain editingDomain;
	private ComposedAdapterFactory adapterFactory;
	private BasicCommandStack commandStack;
	private Text textTags;
	private Text textName;
	private Text textID;
	private Text textPhotoUri;
	private Image photoImage = null;
	private Composite composite;

	public PhotoEditorPart() {
	}

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void createControls(Composite parent, MPart part) {
		parentPart = part;
		photo = (Photo) part.getObject();
		initializeEditingDomain();
		parent.setLayout(new GridLayout(2, false));

		composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true,
				2, 1));

		Label lblPhotoUri = new Label(parent, SWT.NONE);
		lblPhotoUri.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblPhotoUri.setText("Photo");

		textPhotoUri = new Text(parent, SWT.BORDER | SWT.READ_ONLY);
		textPhotoUri.setEditable(false);
		textPhotoUri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));

		Label lblName = new Label(parent, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblName.setText("Name");

		textName = new Text(parent, SWT.BORDER);
		textName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblTags = new Label(parent, SWT.NONE);
		lblTags.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblTags.setText("Tags");

		textTags = new Text(parent, SWT.BORDER);
		textTags.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));

		Label lblID = new Label(parent, SWT.NONE);
		lblID.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		lblID.setText("ID");

		textID = new Text(parent, SWT.BORDER);
		textID.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		textID.setText("This is my text");

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.setText("Save");
		new Label(parent, SWT.NONE);
		parent.layout();
		changeImage();
		m_bindingContext = initDataBindings();
	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		if (null != composite && !composite.isDisposed()) {
			composite.setFocus();
		}
	}

	@Persist
	public void persist() {
		commandStack.flush();
	}

	protected void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new PhototoolkitItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		// Create the command stack that will notify this editor as commands are
		// executed.
		//
		commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to
		// be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				parentPart.setDirty(commandStack.canUndo());
			}
		});

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new HashMap<Resource, Boolean>());

		// For now, we'll just create a resource to use
		Resource resource = editingDomain.createResource("http://sample.xmi");
		resource.getContents().add(photo);
	}

	private void changeImage() {

		if (null != photoImage) {
			photoImage.dispose();
		}
		String filename = photo.getUri();
		photoImage = new Image(Display.getDefault(), filename);
//		Image img = new Image(Display.getDefault(), filename);
//
//		double origX = img.getImageData().width;
//		double origY = img.getImageData().height;
//		Point labelSize = composite.getSize();
//
//		if (labelSize.x > origX && labelSize.y > origY) {
//			photoImage = img;
//		} else {
//			double ratio = origX / origY;
//			ratio = origY / origX;
//			System.out.println("ratio " + ratio);
//			int newX = (int) (labelSize.y / ratio);
//			if (newX < labelSize.x) {
//				ImageData id = img.getImageData().scaledTo(newX, labelSize.y);
//				photoImage = new Image(Display.getDefault(), id);
//			} else {
//				int newY = (int) (labelSize.x * ratio);
//				System.out.println("else " + labelSize.x + "  " + newY);
//				ImageData id = img.getImageData().scaledTo(labelSize.x, newY);
//				photoImage = new Image(Display.getDefault(), id);
//				img.dispose();
//			}
//		}

		composite.setBackgroundImage(photoImage);
		
		StringBuilder sb = new StringBuilder();
		for (String s : photo.getTags()) {
			sb.append(s);
			sb.append(", ");
		}
		if (sb.length() > 0) {
			textTags.setText(sb.toString());
		}
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextTextPhotoUriObserveWidget = WidgetProperties.text(SWT.Modify).observe(textPhotoUri);
		IObservableValue photoUriObserveValue = EMFEditObservables.observeValue(editingDomain, photo, Literals.PHOTO__URI);
		bindingContext.bindValue(observeTextTextPhotoUriObserveWidget, photoUriObserveValue, null, null);
		//
		IObservableValue observeTextTextNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textName);
		IObservableValue photoNameObserveValue = EMFEditObservables.observeValue(editingDomain, photo, Literals.PHOTO__NAME);
		bindingContext.bindValue(observeTextTextNameObserveWidget, photoNameObserveValue, null, null);
		//
		IObservableValue observeTextTextIDObserveWidget = WidgetProperties.text(SWT.Modify).observe(textID);
		IObservableValue photoIDObserveValue = EMFEditObservables.observeValue(editingDomain, photo, Literals.PHOTO__ID);
		bindingContext.bindValue(observeTextTextIDObserveWidget, photoIDObserveValue, null, null);
		//
		return bindingContext;
	}
}
