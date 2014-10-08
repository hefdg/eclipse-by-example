package com.hsveclipse.phototoolkit.application.parts;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

import com.hsveclipse.phototoolkit.Photo;

public class PhotoEditorPart {
	private Text textTags;
	private Text textName;
	private Text textID;
	private Text textPhotoUri;
	private Label lblNewLabel;
	private Image photo = null;
	private Photo photoImport;
	@Inject
	private IEclipseContext context;

	/**
	 * Create contents of the view part.
	 */
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new GridLayout(2, false));

		lblNewLabel = new Label(parent, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		GridData gd_lblNewLabel = new GridData(SWT.FILL, SWT.FILL, false, true,
				2, 1);
		gd_lblNewLabel.heightHint = 150;
		lblNewLabel.setLayoutData(gd_lblNewLabel);

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
		new Label(parent, SWT.NONE);

		Button btnNewButton = new Button(parent, SWT.NONE);
		btnNewButton.setText("Save");

	}

	@PreDestroy
	public void dispose() {
	}

	@Focus
	public void setFocus() {
		if (null != lblNewLabel && !lblNewLabel.isDisposed()) {
			lblNewLabel.setFocus();
		}
	}
	@SuppressWarnings("unchecked")
	@Persist
	public void persist()
	{
		Object contextList = context.get("list");
		ArrayList<Photo> list = null;
		if (null == contextList)
		{
			list = new ArrayList<Photo>();
		}
		else
		{
			list = (ArrayList<Photo>) contextList;
		}
		if (!list.contains(photoImport))
		{
			list.add(photoImport);
		}	
	}

	@Inject
	@Optional
	public void changeImage(@Named("import") Object object) {
		if (null != object && object instanceof Photo && null != lblNewLabel
				&& !lblNewLabel.isDisposed()) {
			if (null != photo) {
				photo.dispose();
			}
			photoImport = (Photo) object;
			String filename = photoImport.getUri();
			Image img = new Image(Display.getDefault(), filename);
			Point labelSize = lblNewLabel.getSize();

			double origX = img.getImageData().width;
			double origY = img.getImageData().height;

			if (labelSize.x > origX && labelSize.y > origY) {
				photo = img;
			} else {
				double ratio = origX / origY;
				ratio = origY / origX;
				System.out.println("ratio " + ratio);
				int newX = (int) (labelSize.y / ratio);
				if (newX < labelSize.x) {
					ImageData id = img.getImageData().scaledTo(newX,
							labelSize.y);
					photo = new Image(Display.getDefault(), id);
				} else {
					int newY = (int) (labelSize.x * ratio);
					System.out.println("else " + labelSize.x + "  " + newY);
					ImageData id = img.getImageData().scaledTo(labelSize.x,
							newY);
					photo = new Image(Display.getDefault(), id);
					img.dispose();
				}
			}

			lblNewLabel.setImage(photo);
			textPhotoUri.setText(filename);

			String id = photoImport.getID();
			if (null != id && id.length() > 0) {
				textID.setText(id);
			}
			String name = photoImport.getName();
			if (null != name && name.length() > 0)
			{
				textName.setText(name);
			}
			StringBuilder sb = new StringBuilder();
			for (String s : photoImport.getTags())
			{
				sb.append(s);
				sb.append(", ");
			}
			if (sb.length() > 0)
			{
				textTags.setText(sb.toString());
			}
		}
	}
}
