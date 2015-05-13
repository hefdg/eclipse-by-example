package com.hsveclipse.phototoolkit.application.parts;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.List;

import com.hsveclipse.phototoolkit.Activator;
import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitFactory;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.provider.PhototoolkitItemProviderAdapterFactory;

public class PhotoListPart {
	private MPart part;
	private File directory;
	private URI baseURI;
	private ResourceSet resourceSet = new ResourceSetImpl();
	private ArrayList<Photo> photos = new ArrayList<Photo>();
	private ListViewer listViewer;
	@Inject
	private EModelService modelService;
	@Inject
	private EPartService partService;
	@Inject
	private MWindow window;
	

	private AdapterImpl adapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (PhototoolkitPackage.Literals.PHOTO__NAME.equals(msg.getFeature())) {
				listViewer.refresh(msg.getNotifier());
			}
		}
	};

	@Inject
	public PhotoListPart() {
		URL dataURL = Activator.getDefault().getContext().getBundle()
				.getEntry("data/");
		String url = null;
		try {
			url = FileLocator.toFileURL(dataURL).getFile();
			baseURI = URI.createFileURI(url);
			directory = new File(url);
			if (directory.exists() && directory.isDirectory()) {
				for (File child : directory.listFiles()) {
					URI childURI = URI.createFileURI(child.getAbsolutePath());
					Resource childResource = resourceSet.getResource(childURI,
							true);
					if (childResource != null
							&& childResource.getContents().size() > 0) {
						Photo photo = (Photo) childResource.getContents().get(0);
						photo.eAdapters().add(adapter);
						photos.add(photo);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@PostConstruct
	public void postConstruct(Composite parent, MPart part) {
		this.part = part;
		part.setObject(this);
		listViewer = new ListViewer(parent, SWT.BORDER | SWT.V_SCROLL);
		listViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				openSelected();
			}
		});

		PhototoolkitItemProviderAdapterFactory factory = new PhototoolkitItemProviderAdapterFactory();
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
				factory);
		listViewer.setLabelProvider(labelProvider);
		listViewer.setContentProvider(ArrayContentProvider.getInstance());
		listViewer.setInput(photos);
		List list = listViewer.getList();
	}

	protected void openSelected() {
		StructuredSelection structured = (StructuredSelection) listViewer
				.getSelection();
		for (Object object : structured.toList()) {
			Photo photo = (Photo) object;
			java.util.List<MPart> parts = modelService.findElements(window,
					photo.getId(), MPart.class, null);
			if (parts != null && parts.size() > 0) {
				for (MPart part : parts) {
					partService.activate(part);
				}
			} else {
				MPart editorPart = partService
						.createPart("hsveclipse.partDescriptor.photoPart");
				if (editorPart != null) {
					editorPart.getTransientData().put(Photo.class.getName(), photo);
					partService.showPart(editorPart, PartState.ACTIVATE);
				}
			}
		}
	}

	public Photo createPhoto() {
		Photo photo = PhototoolkitFactory.eINSTANCE.createPhoto();
		String id = EcoreUtil.generateUUID();
		photo.setId(id);
		photo.setName("New Photo");
		photos.add(photo);
		photo.eAdapters().add(adapter);
		URI uri = baseURI.appendSegment(id).appendFileExtension("ptk");
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(photo);
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		listViewer.refresh();
		return photo;
	}
}