/**
 */
package com.hsveclipse.phototoolkit.exif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tiff Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageWidth <em>Image Width</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageLength <em>Image Length</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getBitsPerSample <em>Bits Per Sample</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCompression <em>Compression</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPhotometricInterpretation <em>Photometric Interpretation</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSamplesPerPixel <em>Samples Per Pixel</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPlanarConfiguration <em>Planar Configuration</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrSubSampling <em>YCb Cr Sub Sampling</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrPositioning <em>YCb Cr Positioning</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getXResolution <em>XResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYResolution <em>YResolution</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getResolutionUnit <em>Resolution Unit</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripOffsets <em>Strip Offsets</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getRowsPerStrip <em>Rows Per Strip</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripByteCounts <em>Strip Byte Counts</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormat <em>JPEG Inter Change Format</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormatLength <em>JPEG Inter Change Format Length</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTransferFunction <em>Transfer Function</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getWhitePoint <em>White Point</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPrimaryChromaticities <em>Primary Chromaticities</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrCoefficients <em>YCb Cr Coefficients</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getReferenceBlackWhite <em>Reference Black White</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageDescription <em>Image Description</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getMake <em>Make</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getModel <em>Model</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSoftware <em>Software</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getArtist <em>Artist</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField1 <em>Tiff Field1</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField2 <em>Tiff Field2</em>}</li>
 *   <li>{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField3 <em>Tiff Field3</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType()
 * @model extendedMetaData="name='TiffIfd_._type' kind='elementOnly'"
 * @generated
 */
public interface TiffIfdType extends EObject {
	/**
	 * Returns the value of the '<em><b>Image Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Width</em>' containment reference.
	 * @see #setImageWidth(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_ImageWidth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getImageWidth();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageWidth <em>Image Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Width</em>' containment reference.
	 * @see #getImageWidth()
	 * @generated
	 */
	void setImageWidth(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Image Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Length</em>' containment reference.
	 * @see #setImageLength(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_ImageLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageLength' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getImageLength();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageLength <em>Image Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Length</em>' containment reference.
	 * @see #getImageLength()
	 * @generated
	 */
	void setImageLength(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Bits Per Sample</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bits Per Sample</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits Per Sample</em>' containment reference.
	 * @see #setBitsPerSample(BitsPerSampleType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_BitsPerSample()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BitsPerSample' namespace='##targetNamespace'"
	 * @generated
	 */
	BitsPerSampleType getBitsPerSample();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getBitsPerSample <em>Bits Per Sample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits Per Sample</em>' containment reference.
	 * @see #getBitsPerSample()
	 * @generated
	 */
	void setBitsPerSample(BitsPerSampleType value);

	/**
	 * Returns the value of the '<em><b>Compression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compression</em>' containment reference.
	 * @see #setCompression(CompressionType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Compression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Compression' namespace='##targetNamespace'"
	 * @generated
	 */
	CompressionType getCompression();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCompression <em>Compression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compression</em>' containment reference.
	 * @see #getCompression()
	 * @generated
	 */
	void setCompression(CompressionType value);

	/**
	 * Returns the value of the '<em><b>Photometric Interpretation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Photometric Interpretation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Photometric Interpretation</em>' containment reference.
	 * @see #setPhotometricInterpretation(PhotometricInterpretationType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_PhotometricInterpretation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PhotometricInterpretation' namespace='##targetNamespace'"
	 * @generated
	 */
	PhotometricInterpretationType getPhotometricInterpretation();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPhotometricInterpretation <em>Photometric Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Photometric Interpretation</em>' containment reference.
	 * @see #getPhotometricInterpretation()
	 * @generated
	 */
	void setPhotometricInterpretation(PhotometricInterpretationType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Samples Per Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samples Per Pixel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samples Per Pixel</em>' containment reference.
	 * @see #setSamplesPerPixel(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_SamplesPerPixel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SamplesPerPixel' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getSamplesPerPixel();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSamplesPerPixel <em>Samples Per Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samples Per Pixel</em>' containment reference.
	 * @see #getSamplesPerPixel()
	 * @generated
	 */
	void setSamplesPerPixel(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Planar Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Planar Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planar Configuration</em>' containment reference.
	 * @see #setPlanarConfiguration(PlanarConfigurationType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_PlanarConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlanarConfiguration' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanarConfigurationType getPlanarConfiguration();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPlanarConfiguration <em>Planar Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planar Configuration</em>' containment reference.
	 * @see #getPlanarConfiguration()
	 * @generated
	 */
	void setPlanarConfiguration(PlanarConfigurationType value);

	/**
	 * Returns the value of the '<em><b>YCb Cr Sub Sampling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCb Cr Sub Sampling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCb Cr Sub Sampling</em>' containment reference.
	 * @see #setYCbCrSubSampling(YCbCrSubSamplingType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_YCbCrSubSampling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='YCbCrSubSampling' namespace='##targetNamespace'"
	 * @generated
	 */
	YCbCrSubSamplingType getYCbCrSubSampling();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrSubSampling <em>YCb Cr Sub Sampling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCb Cr Sub Sampling</em>' containment reference.
	 * @see #getYCbCrSubSampling()
	 * @generated
	 */
	void setYCbCrSubSampling(YCbCrSubSamplingType value);

	/**
	 * Returns the value of the '<em><b>YCb Cr Positioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCb Cr Positioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCb Cr Positioning</em>' containment reference.
	 * @see #setYCbCrPositioning(YCbCrPositioningType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_YCbCrPositioning()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='YCbCrPositioning' namespace='##targetNamespace'"
	 * @generated
	 */
	YCbCrPositioningType getYCbCrPositioning();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrPositioning <em>YCb Cr Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCb Cr Positioning</em>' containment reference.
	 * @see #getYCbCrPositioning()
	 * @generated
	 */
	void setYCbCrPositioning(YCbCrPositioningType value);

	/**
	 * Returns the value of the '<em><b>XResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit is pixels per ResolutionUnit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XResolution</em>' containment reference.
	 * @see #setXResolution(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_XResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='XResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getXResolution();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getXResolution <em>XResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XResolution</em>' containment reference.
	 * @see #getXResolution()
	 * @generated
	 */
	void setXResolution(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>YResolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unit is pixels per Resolution Unit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YResolution</em>' containment reference.
	 * @see #setYResolution(NonNegativeRealType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_YResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='YResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	NonNegativeRealType getYResolution();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYResolution <em>YResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YResolution</em>' containment reference.
	 * @see #getYResolution()
	 * @generated
	 */
	void setYResolution(NonNegativeRealType value);

	/**
	 * Returns the value of the '<em><b>Resolution Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution Unit</em>' containment reference.
	 * @see #setResolutionUnit(ResolutionType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_ResolutionUnit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ResolutionUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	ResolutionType getResolutionUnit();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getResolutionUnit <em>Resolution Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Unit</em>' containment reference.
	 * @see #getResolutionUnit()
	 * @generated
	 */
	void setResolutionUnit(ResolutionType value);

	/**
	 * Returns the value of the '<em><b>Strip Offsets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Offsets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Offsets</em>' containment reference.
	 * @see #setStripOffsets(StripOffsetsType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_StripOffsets()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StripOffsets' namespace='##targetNamespace'"
	 * @generated
	 */
	StripOffsetsType getStripOffsets();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripOffsets <em>Strip Offsets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strip Offsets</em>' containment reference.
	 * @see #getStripOffsets()
	 * @generated
	 */
	void setStripOffsets(StripOffsetsType value);

	/**
	 * Returns the value of the '<em><b>Rows Per Strip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows Per Strip</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows Per Strip</em>' containment reference.
	 * @see #setRowsPerStrip(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_RowsPerStrip()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RowsPerStrip' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getRowsPerStrip();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getRowsPerStrip <em>Rows Per Strip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows Per Strip</em>' containment reference.
	 * @see #getRowsPerStrip()
	 * @generated
	 */
	void setRowsPerStrip(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Strip Byte Counts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strip Byte Counts</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strip Byte Counts</em>' containment reference.
	 * @see #setStripByteCounts(StripByteCountsType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_StripByteCounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StripByteCounts' namespace='##targetNamespace'"
	 * @generated
	 */
	StripByteCountsType getStripByteCounts();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getStripByteCounts <em>Strip Byte Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strip Byte Counts</em>' containment reference.
	 * @see #getStripByteCounts()
	 * @generated
	 */
	void setStripByteCounts(StripByteCountsType value);

	/**
	 * Returns the value of the '<em><b>JPEG Inter Change Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JPEG Inter Change Format</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JPEG Inter Change Format</em>' containment reference.
	 * @see #setJPEGInterChangeFormat(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_JPEGInterChangeFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JPEGInterChangeFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getJPEGInterChangeFormat();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormat <em>JPEG Inter Change Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JPEG Inter Change Format</em>' containment reference.
	 * @see #getJPEGInterChangeFormat()
	 * @generated
	 */
	void setJPEGInterChangeFormat(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>JPEG Inter Change Format Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JPEG Inter Change Format Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JPEG Inter Change Format Length</em>' containment reference.
	 * @see #setJPEGInterChangeFormatLength(PositiveIntegerType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_JPEGInterChangeFormatLength()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JPEGInterChangeFormatLength' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveIntegerType getJPEGInterChangeFormatLength();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getJPEGInterChangeFormatLength <em>JPEG Inter Change Format Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JPEG Inter Change Format Length</em>' containment reference.
	 * @see #getJPEGInterChangeFormatLength()
	 * @generated
	 */
	void setJPEGInterChangeFormatLength(PositiveIntegerType value);

	/**
	 * Returns the value of the '<em><b>Transfer Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Function</em>' containment reference.
	 * @see #setTransferFunction(EObject)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_TransferFunction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TransferFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTransferFunction();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTransferFunction <em>Transfer Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Function</em>' containment reference.
	 * @see #getTransferFunction()
	 * @generated
	 */
	void setTransferFunction(EObject value);

	/**
	 * Returns the value of the '<em><b>White Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>White Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>White Point</em>' containment reference.
	 * @see #setWhitePoint(WhitePointType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_WhitePoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WhitePoint' namespace='##targetNamespace'"
	 * @generated
	 */
	WhitePointType getWhitePoint();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getWhitePoint <em>White Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>White Point</em>' containment reference.
	 * @see #getWhitePoint()
	 * @generated
	 */
	void setWhitePoint(WhitePointType value);

	/**
	 * Returns the value of the '<em><b>Primary Chromaticities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Chromaticities</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Chromaticities</em>' containment reference.
	 * @see #setPrimaryChromaticities(PrimaryChromaticitiesType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_PrimaryChromaticities()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PrimaryChromaticities' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryChromaticitiesType getPrimaryChromaticities();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getPrimaryChromaticities <em>Primary Chromaticities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Chromaticities</em>' containment reference.
	 * @see #getPrimaryChromaticities()
	 * @generated
	 */
	void setPrimaryChromaticities(PrimaryChromaticitiesType value);

	/**
	 * Returns the value of the '<em><b>YCb Cr Coefficients</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YCb Cr Coefficients</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YCb Cr Coefficients</em>' containment reference.
	 * @see #setYCbCrCoefficients(YCbCrCoefficientsType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_YCbCrCoefficients()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='YCbCrCoefficients' namespace='##targetNamespace'"
	 * @generated
	 */
	YCbCrCoefficientsType getYCbCrCoefficients();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getYCbCrCoefficients <em>YCb Cr Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCb Cr Coefficients</em>' containment reference.
	 * @see #getYCbCrCoefficients()
	 * @generated
	 */
	void setYCbCrCoefficients(YCbCrCoefficientsType value);

	/**
	 * Returns the value of the '<em><b>Reference Black White</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Black White</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Black White</em>' containment reference.
	 * @see #setReferenceBlackWhite(PrimaryChromaticitiesType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_ReferenceBlackWhite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceBlackWhite' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryChromaticitiesType getReferenceBlackWhite();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getReferenceBlackWhite <em>Reference Black White</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Black White</em>' containment reference.
	 * @see #getReferenceBlackWhite()
	 * @generated
	 */
	void setReferenceBlackWhite(PrimaryChromaticitiesType value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTimeType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_DateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimeType getDateTime();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTimeType value);

	/**
	 * Returns the value of the '<em><b>Image Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Description</em>' containment reference.
	 * @see #setImageDescription(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_ImageDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImageDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getImageDescription();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getImageDescription <em>Image Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Description</em>' containment reference.
	 * @see #getImageDescription()
	 * @generated
	 */
	void setImageDescription(StringType value);

	/**
	 * Returns the value of the '<em><b>Make</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make</em>' containment reference.
	 * @see #setMake(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Make()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Make' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getMake();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getMake <em>Make</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make</em>' containment reference.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(StringType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Model()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getModel();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(StringType value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Software()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Software' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getSoftware();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(StringType value);

	/**
	 * Returns the value of the '<em><b>Artist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artist</em>' containment reference.
	 * @see #setArtist(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Artist()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Artist' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getArtist();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getArtist <em>Artist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artist</em>' containment reference.
	 * @see #getArtist()
	 * @generated
	 */
	void setArtist(StringType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(StringType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_Copyright()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	StringType getCopyright();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(StringType value);

	/**
	 * Returns the value of the '<em><b>Tiff Field1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiff Field1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiff Field1</em>' containment reference.
	 * @see #setTiffField1(SingleFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_TiffField1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TiffField1' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getTiffField1();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField1 <em>Tiff Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiff Field1</em>' containment reference.
	 * @see #getTiffField1()
	 * @generated
	 */
	void setTiffField1(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>Tiff Field2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiff Field2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiff Field2</em>' containment reference.
	 * @see #setTiffField2(SingleFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_TiffField2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TiffField2' namespace='##targetNamespace'"
	 * @generated
	 */
	SingleFieldType getTiffField2();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField2 <em>Tiff Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiff Field2</em>' containment reference.
	 * @see #getTiffField2()
	 * @generated
	 */
	void setTiffField2(SingleFieldType value);

	/**
	 * Returns the value of the '<em><b>Tiff Field3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiff Field3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiff Field3</em>' containment reference.
	 * @see #setTiffField3(RepeatedFieldType)
	 * @see com.hsveclipse.phototoolkit.exif.ExifPackage#getTiffIfdType_TiffField3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TiffField3' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatedFieldType getTiffField3();

	/**
	 * Sets the value of the '{@link com.hsveclipse.phototoolkit.exif.TiffIfdType#getTiffField3 <em>Tiff Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiff Field3</em>' containment reference.
	 * @see #getTiffField3()
	 * @generated
	 */
	void setTiffField3(RepeatedFieldType value);

} // TiffIfdType
