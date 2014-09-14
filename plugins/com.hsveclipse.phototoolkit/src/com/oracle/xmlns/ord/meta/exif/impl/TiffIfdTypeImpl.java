/**
 */
package com.oracle.xmlns.ord.meta.exif.impl;

import com.oracle.xmlns.ord.meta.exif.BitsPerSampleType;
import com.oracle.xmlns.ord.meta.exif.CompressionType;
import com.oracle.xmlns.ord.meta.exif.DateTimeType;
import com.oracle.xmlns.ord.meta.exif.ExifPackage;
import com.oracle.xmlns.ord.meta.exif.NonNegativeRealType;
import com.oracle.xmlns.ord.meta.exif.OrientationType;
import com.oracle.xmlns.ord.meta.exif.PhotometricInterpretationType;
import com.oracle.xmlns.ord.meta.exif.PlanarConfigurationType;
import com.oracle.xmlns.ord.meta.exif.PositiveIntegerType;
import com.oracle.xmlns.ord.meta.exif.PrimaryChromaticitiesType;
import com.oracle.xmlns.ord.meta.exif.RepeatedFieldType;
import com.oracle.xmlns.ord.meta.exif.ResolutionType;
import com.oracle.xmlns.ord.meta.exif.SingleFieldType;
import com.oracle.xmlns.ord.meta.exif.StringType;
import com.oracle.xmlns.ord.meta.exif.StripByteCountsType;
import com.oracle.xmlns.ord.meta.exif.StripOffsetsType;
import com.oracle.xmlns.ord.meta.exif.TiffIfdType;
import com.oracle.xmlns.ord.meta.exif.WhitePointType;
import com.oracle.xmlns.ord.meta.exif.YCbCrCoefficientsType;
import com.oracle.xmlns.ord.meta.exif.YCbCrPositioningType;
import com.oracle.xmlns.ord.meta.exif.YCbCrSubSamplingType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tiff Ifd Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getImageWidth <em>Image Width</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getImageLength <em>Image Length</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getBitsPerSample <em>Bits Per Sample</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getCompression <em>Compression</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getPhotometricInterpretation <em>Photometric Interpretation</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getSamplesPerPixel <em>Samples Per Pixel</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getPlanarConfiguration <em>Planar Configuration</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getYCbCrSubSampling <em>YCb Cr Sub Sampling</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getYCbCrPositioning <em>YCb Cr Positioning</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getXResolution <em>XResolution</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getYResolution <em>YResolution</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getResolutionUnit <em>Resolution Unit</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getStripOffsets <em>Strip Offsets</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getRowsPerStrip <em>Rows Per Strip</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getStripByteCounts <em>Strip Byte Counts</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getJPEGInterChangeFormat <em>JPEG Inter Change Format</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getJPEGInterChangeFormatLength <em>JPEG Inter Change Format Length</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getTransferFunction <em>Transfer Function</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getWhitePoint <em>White Point</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getPrimaryChromaticities <em>Primary Chromaticities</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getYCbCrCoefficients <em>YCb Cr Coefficients</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getReferenceBlackWhite <em>Reference Black White</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getImageDescription <em>Image Description</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getMake <em>Make</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getArtist <em>Artist</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getTiffField1 <em>Tiff Field1</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getTiffField2 <em>Tiff Field2</em>}</li>
 *   <li>{@link com.oracle.xmlns.ord.meta.exif.impl.TiffIfdTypeImpl#getTiffField3 <em>Tiff Field3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TiffIfdTypeImpl extends MinimalEObjectImpl.Container implements TiffIfdType {
	/**
	 * The cached value of the '{@link #getImageWidth() <em>Image Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageWidth()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType imageWidth;

	/**
	 * The cached value of the '{@link #getImageLength() <em>Image Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageLength()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType imageLength;

	/**
	 * The cached value of the '{@link #getBitsPerSample() <em>Bits Per Sample</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitsPerSample()
	 * @generated
	 * @ordered
	 */
	protected BitsPerSampleType bitsPerSample;

	/**
	 * The cached value of the '{@link #getCompression() <em>Compression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompression()
	 * @generated
	 * @ordered
	 */
	protected CompressionType compression;

	/**
	 * The cached value of the '{@link #getPhotometricInterpretation() <em>Photometric Interpretation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhotometricInterpretation()
	 * @generated
	 * @ordered
	 */
	protected PhotometricInterpretationType photometricInterpretation;

	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType orientation;

	/**
	 * The cached value of the '{@link #getSamplesPerPixel() <em>Samples Per Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplesPerPixel()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType samplesPerPixel;

	/**
	 * The cached value of the '{@link #getPlanarConfiguration() <em>Planar Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarConfiguration()
	 * @generated
	 * @ordered
	 */
	protected PlanarConfigurationType planarConfiguration;

	/**
	 * The cached value of the '{@link #getYCbCrSubSampling() <em>YCb Cr Sub Sampling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCbCrSubSampling()
	 * @generated
	 * @ordered
	 */
	protected YCbCrSubSamplingType yCbCrSubSampling;

	/**
	 * The cached value of the '{@link #getYCbCrPositioning() <em>YCb Cr Positioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCbCrPositioning()
	 * @generated
	 * @ordered
	 */
	protected YCbCrPositioningType yCbCrPositioning;

	/**
	 * The cached value of the '{@link #getXResolution() <em>XResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXResolution()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType xResolution;

	/**
	 * The cached value of the '{@link #getYResolution() <em>YResolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYResolution()
	 * @generated
	 * @ordered
	 */
	protected NonNegativeRealType yResolution;

	/**
	 * The cached value of the '{@link #getResolutionUnit() <em>Resolution Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionUnit()
	 * @generated
	 * @ordered
	 */
	protected ResolutionType resolutionUnit;

	/**
	 * The cached value of the '{@link #getStripOffsets() <em>Strip Offsets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripOffsets()
	 * @generated
	 * @ordered
	 */
	protected StripOffsetsType stripOffsets;

	/**
	 * The cached value of the '{@link #getRowsPerStrip() <em>Rows Per Strip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowsPerStrip()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType rowsPerStrip;

	/**
	 * The cached value of the '{@link #getStripByteCounts() <em>Strip Byte Counts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStripByteCounts()
	 * @generated
	 * @ordered
	 */
	protected StripByteCountsType stripByteCounts;

	/**
	 * The cached value of the '{@link #getJPEGInterChangeFormat() <em>JPEG Inter Change Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJPEGInterChangeFormat()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType jPEGInterChangeFormat;

	/**
	 * The cached value of the '{@link #getJPEGInterChangeFormatLength() <em>JPEG Inter Change Format Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJPEGInterChangeFormatLength()
	 * @generated
	 * @ordered
	 */
	protected PositiveIntegerType jPEGInterChangeFormatLength;

	/**
	 * The cached value of the '{@link #getTransferFunction() <em>Transfer Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferFunction()
	 * @generated
	 * @ordered
	 */
	protected EObject transferFunction;

	/**
	 * The cached value of the '{@link #getWhitePoint() <em>White Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhitePoint()
	 * @generated
	 * @ordered
	 */
	protected WhitePointType whitePoint;

	/**
	 * The cached value of the '{@link #getPrimaryChromaticities() <em>Primary Chromaticities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryChromaticities()
	 * @generated
	 * @ordered
	 */
	protected PrimaryChromaticitiesType primaryChromaticities;

	/**
	 * The cached value of the '{@link #getYCbCrCoefficients() <em>YCb Cr Coefficients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCbCrCoefficients()
	 * @generated
	 * @ordered
	 */
	protected YCbCrCoefficientsType yCbCrCoefficients;

	/**
	 * The cached value of the '{@link #getReferenceBlackWhite() <em>Reference Black White</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceBlackWhite()
	 * @generated
	 * @ordered
	 */
	protected PrimaryChromaticitiesType referenceBlackWhite;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected DateTimeType dateTime;

	/**
	 * The cached value of the '{@link #getImageDescription() <em>Image Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageDescription()
	 * @generated
	 * @ordered
	 */
	protected StringType imageDescription;

	/**
	 * The cached value of the '{@link #getMake() <em>Make</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected StringType make;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected StringType model;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected StringType software;

	/**
	 * The cached value of the '{@link #getArtist() <em>Artist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtist()
	 * @generated
	 * @ordered
	 */
	protected StringType artist;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected StringType copyright;

	/**
	 * The cached value of the '{@link #getTiffField1() <em>Tiff Field1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiffField1()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType tiffField1;

	/**
	 * The cached value of the '{@link #getTiffField2() <em>Tiff Field2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiffField2()
	 * @generated
	 * @ordered
	 */
	protected SingleFieldType tiffField2;

	/**
	 * The cached value of the '{@link #getTiffField3() <em>Tiff Field3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiffField3()
	 * @generated
	 * @ordered
	 */
	protected RepeatedFieldType tiffField3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TiffIfdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExifPackage.eINSTANCE.getTiffIfdType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getImageWidth() {
		return imageWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageWidth(PositiveIntegerType newImageWidth, NotificationChain msgs) {
		PositiveIntegerType oldImageWidth = imageWidth;
		imageWidth = newImageWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH, oldImageWidth, newImageWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageWidth(PositiveIntegerType newImageWidth) {
		if (newImageWidth != imageWidth) {
			NotificationChain msgs = null;
			if (imageWidth != null)
				msgs = ((InternalEObject)imageWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH, null, msgs);
			if (newImageWidth != null)
				msgs = ((InternalEObject)newImageWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH, null, msgs);
			msgs = basicSetImageWidth(newImageWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH, newImageWidth, newImageWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getImageLength() {
		return imageLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageLength(PositiveIntegerType newImageLength, NotificationChain msgs) {
		PositiveIntegerType oldImageLength = imageLength;
		imageLength = newImageLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH, oldImageLength, newImageLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageLength(PositiveIntegerType newImageLength) {
		if (newImageLength != imageLength) {
			NotificationChain msgs = null;
			if (imageLength != null)
				msgs = ((InternalEObject)imageLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH, null, msgs);
			if (newImageLength != null)
				msgs = ((InternalEObject)newImageLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH, null, msgs);
			msgs = basicSetImageLength(newImageLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH, newImageLength, newImageLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitsPerSampleType getBitsPerSample() {
		return bitsPerSample;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBitsPerSample(BitsPerSampleType newBitsPerSample, NotificationChain msgs) {
		BitsPerSampleType oldBitsPerSample = bitsPerSample;
		bitsPerSample = newBitsPerSample;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE, oldBitsPerSample, newBitsPerSample);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitsPerSample(BitsPerSampleType newBitsPerSample) {
		if (newBitsPerSample != bitsPerSample) {
			NotificationChain msgs = null;
			if (bitsPerSample != null)
				msgs = ((InternalEObject)bitsPerSample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE, null, msgs);
			if (newBitsPerSample != null)
				msgs = ((InternalEObject)newBitsPerSample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE, null, msgs);
			msgs = basicSetBitsPerSample(newBitsPerSample, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE, newBitsPerSample, newBitsPerSample));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompressionType getCompression() {
		return compression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompression(CompressionType newCompression, NotificationChain msgs) {
		CompressionType oldCompression = compression;
		compression = newCompression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__COMPRESSION, oldCompression, newCompression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompression(CompressionType newCompression) {
		if (newCompression != compression) {
			NotificationChain msgs = null;
			if (compression != null)
				msgs = ((InternalEObject)compression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__COMPRESSION, null, msgs);
			if (newCompression != null)
				msgs = ((InternalEObject)newCompression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__COMPRESSION, null, msgs);
			msgs = basicSetCompression(newCompression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__COMPRESSION, newCompression, newCompression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhotometricInterpretationType getPhotometricInterpretation() {
		return photometricInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhotometricInterpretation(PhotometricInterpretationType newPhotometricInterpretation, NotificationChain msgs) {
		PhotometricInterpretationType oldPhotometricInterpretation = photometricInterpretation;
		photometricInterpretation = newPhotometricInterpretation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION, oldPhotometricInterpretation, newPhotometricInterpretation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhotometricInterpretation(PhotometricInterpretationType newPhotometricInterpretation) {
		if (newPhotometricInterpretation != photometricInterpretation) {
			NotificationChain msgs = null;
			if (photometricInterpretation != null)
				msgs = ((InternalEObject)photometricInterpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION, null, msgs);
			if (newPhotometricInterpretation != null)
				msgs = ((InternalEObject)newPhotometricInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION, null, msgs);
			msgs = basicSetPhotometricInterpretation(newPhotometricInterpretation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION, newPhotometricInterpretation, newPhotometricInterpretation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType newOrientation, NotificationChain msgs) {
		OrientationType oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getSamplesPerPixel() {
		return samplesPerPixel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSamplesPerPixel(PositiveIntegerType newSamplesPerPixel, NotificationChain msgs) {
		PositiveIntegerType oldSamplesPerPixel = samplesPerPixel;
		samplesPerPixel = newSamplesPerPixel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL, oldSamplesPerPixel, newSamplesPerPixel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplesPerPixel(PositiveIntegerType newSamplesPerPixel) {
		if (newSamplesPerPixel != samplesPerPixel) {
			NotificationChain msgs = null;
			if (samplesPerPixel != null)
				msgs = ((InternalEObject)samplesPerPixel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL, null, msgs);
			if (newSamplesPerPixel != null)
				msgs = ((InternalEObject)newSamplesPerPixel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL, null, msgs);
			msgs = basicSetSamplesPerPixel(newSamplesPerPixel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL, newSamplesPerPixel, newSamplesPerPixel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanarConfigurationType getPlanarConfiguration() {
		return planarConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanarConfiguration(PlanarConfigurationType newPlanarConfiguration, NotificationChain msgs) {
		PlanarConfigurationType oldPlanarConfiguration = planarConfiguration;
		planarConfiguration = newPlanarConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION, oldPlanarConfiguration, newPlanarConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarConfiguration(PlanarConfigurationType newPlanarConfiguration) {
		if (newPlanarConfiguration != planarConfiguration) {
			NotificationChain msgs = null;
			if (planarConfiguration != null)
				msgs = ((InternalEObject)planarConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION, null, msgs);
			if (newPlanarConfiguration != null)
				msgs = ((InternalEObject)newPlanarConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION, null, msgs);
			msgs = basicSetPlanarConfiguration(newPlanarConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION, newPlanarConfiguration, newPlanarConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrSubSamplingType getYCbCrSubSampling() {
		return yCbCrSubSampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYCbCrSubSampling(YCbCrSubSamplingType newYCbCrSubSampling, NotificationChain msgs) {
		YCbCrSubSamplingType oldYCbCrSubSampling = yCbCrSubSampling;
		yCbCrSubSampling = newYCbCrSubSampling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING, oldYCbCrSubSampling, newYCbCrSubSampling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCbCrSubSampling(YCbCrSubSamplingType newYCbCrSubSampling) {
		if (newYCbCrSubSampling != yCbCrSubSampling) {
			NotificationChain msgs = null;
			if (yCbCrSubSampling != null)
				msgs = ((InternalEObject)yCbCrSubSampling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING, null, msgs);
			if (newYCbCrSubSampling != null)
				msgs = ((InternalEObject)newYCbCrSubSampling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING, null, msgs);
			msgs = basicSetYCbCrSubSampling(newYCbCrSubSampling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING, newYCbCrSubSampling, newYCbCrSubSampling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrPositioningType getYCbCrPositioning() {
		return yCbCrPositioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYCbCrPositioning(YCbCrPositioningType newYCbCrPositioning, NotificationChain msgs) {
		YCbCrPositioningType oldYCbCrPositioning = yCbCrPositioning;
		yCbCrPositioning = newYCbCrPositioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING, oldYCbCrPositioning, newYCbCrPositioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCbCrPositioning(YCbCrPositioningType newYCbCrPositioning) {
		if (newYCbCrPositioning != yCbCrPositioning) {
			NotificationChain msgs = null;
			if (yCbCrPositioning != null)
				msgs = ((InternalEObject)yCbCrPositioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING, null, msgs);
			if (newYCbCrPositioning != null)
				msgs = ((InternalEObject)newYCbCrPositioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING, null, msgs);
			msgs = basicSetYCbCrPositioning(newYCbCrPositioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING, newYCbCrPositioning, newYCbCrPositioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getXResolution() {
		return xResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXResolution(NonNegativeRealType newXResolution, NotificationChain msgs) {
		NonNegativeRealType oldXResolution = xResolution;
		xResolution = newXResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__XRESOLUTION, oldXResolution, newXResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXResolution(NonNegativeRealType newXResolution) {
		if (newXResolution != xResolution) {
			NotificationChain msgs = null;
			if (xResolution != null)
				msgs = ((InternalEObject)xResolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__XRESOLUTION, null, msgs);
			if (newXResolution != null)
				msgs = ((InternalEObject)newXResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__XRESOLUTION, null, msgs);
			msgs = basicSetXResolution(newXResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__XRESOLUTION, newXResolution, newXResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonNegativeRealType getYResolution() {
		return yResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYResolution(NonNegativeRealType newYResolution, NotificationChain msgs) {
		NonNegativeRealType oldYResolution = yResolution;
		yResolution = newYResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YRESOLUTION, oldYResolution, newYResolution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYResolution(NonNegativeRealType newYResolution) {
		if (newYResolution != yResolution) {
			NotificationChain msgs = null;
			if (yResolution != null)
				msgs = ((InternalEObject)yResolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YRESOLUTION, null, msgs);
			if (newYResolution != null)
				msgs = ((InternalEObject)newYResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YRESOLUTION, null, msgs);
			msgs = basicSetYResolution(newYResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YRESOLUTION, newYResolution, newYResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionType getResolutionUnit() {
		return resolutionUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResolutionUnit(ResolutionType newResolutionUnit, NotificationChain msgs) {
		ResolutionType oldResolutionUnit = resolutionUnit;
		resolutionUnit = newResolutionUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT, oldResolutionUnit, newResolutionUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionUnit(ResolutionType newResolutionUnit) {
		if (newResolutionUnit != resolutionUnit) {
			NotificationChain msgs = null;
			if (resolutionUnit != null)
				msgs = ((InternalEObject)resolutionUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT, null, msgs);
			if (newResolutionUnit != null)
				msgs = ((InternalEObject)newResolutionUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT, null, msgs);
			msgs = basicSetResolutionUnit(newResolutionUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT, newResolutionUnit, newResolutionUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripOffsetsType getStripOffsets() {
		return stripOffsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStripOffsets(StripOffsetsType newStripOffsets, NotificationChain msgs) {
		StripOffsetsType oldStripOffsets = stripOffsets;
		stripOffsets = newStripOffsets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS, oldStripOffsets, newStripOffsets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStripOffsets(StripOffsetsType newStripOffsets) {
		if (newStripOffsets != stripOffsets) {
			NotificationChain msgs = null;
			if (stripOffsets != null)
				msgs = ((InternalEObject)stripOffsets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS, null, msgs);
			if (newStripOffsets != null)
				msgs = ((InternalEObject)newStripOffsets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS, null, msgs);
			msgs = basicSetStripOffsets(newStripOffsets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS, newStripOffsets, newStripOffsets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getRowsPerStrip() {
		return rowsPerStrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRowsPerStrip(PositiveIntegerType newRowsPerStrip, NotificationChain msgs) {
		PositiveIntegerType oldRowsPerStrip = rowsPerStrip;
		rowsPerStrip = newRowsPerStrip;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP, oldRowsPerStrip, newRowsPerStrip);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowsPerStrip(PositiveIntegerType newRowsPerStrip) {
		if (newRowsPerStrip != rowsPerStrip) {
			NotificationChain msgs = null;
			if (rowsPerStrip != null)
				msgs = ((InternalEObject)rowsPerStrip).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP, null, msgs);
			if (newRowsPerStrip != null)
				msgs = ((InternalEObject)newRowsPerStrip).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP, null, msgs);
			msgs = basicSetRowsPerStrip(newRowsPerStrip, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP, newRowsPerStrip, newRowsPerStrip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripByteCountsType getStripByteCounts() {
		return stripByteCounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStripByteCounts(StripByteCountsType newStripByteCounts, NotificationChain msgs) {
		StripByteCountsType oldStripByteCounts = stripByteCounts;
		stripByteCounts = newStripByteCounts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS, oldStripByteCounts, newStripByteCounts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStripByteCounts(StripByteCountsType newStripByteCounts) {
		if (newStripByteCounts != stripByteCounts) {
			NotificationChain msgs = null;
			if (stripByteCounts != null)
				msgs = ((InternalEObject)stripByteCounts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS, null, msgs);
			if (newStripByteCounts != null)
				msgs = ((InternalEObject)newStripByteCounts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS, null, msgs);
			msgs = basicSetStripByteCounts(newStripByteCounts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS, newStripByteCounts, newStripByteCounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getJPEGInterChangeFormat() {
		return jPEGInterChangeFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJPEGInterChangeFormat(PositiveIntegerType newJPEGInterChangeFormat, NotificationChain msgs) {
		PositiveIntegerType oldJPEGInterChangeFormat = jPEGInterChangeFormat;
		jPEGInterChangeFormat = newJPEGInterChangeFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT, oldJPEGInterChangeFormat, newJPEGInterChangeFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJPEGInterChangeFormat(PositiveIntegerType newJPEGInterChangeFormat) {
		if (newJPEGInterChangeFormat != jPEGInterChangeFormat) {
			NotificationChain msgs = null;
			if (jPEGInterChangeFormat != null)
				msgs = ((InternalEObject)jPEGInterChangeFormat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT, null, msgs);
			if (newJPEGInterChangeFormat != null)
				msgs = ((InternalEObject)newJPEGInterChangeFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT, null, msgs);
			msgs = basicSetJPEGInterChangeFormat(newJPEGInterChangeFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT, newJPEGInterChangeFormat, newJPEGInterChangeFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveIntegerType getJPEGInterChangeFormatLength() {
		return jPEGInterChangeFormatLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJPEGInterChangeFormatLength(PositiveIntegerType newJPEGInterChangeFormatLength, NotificationChain msgs) {
		PositiveIntegerType oldJPEGInterChangeFormatLength = jPEGInterChangeFormatLength;
		jPEGInterChangeFormatLength = newJPEGInterChangeFormatLength;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH, oldJPEGInterChangeFormatLength, newJPEGInterChangeFormatLength);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJPEGInterChangeFormatLength(PositiveIntegerType newJPEGInterChangeFormatLength) {
		if (newJPEGInterChangeFormatLength != jPEGInterChangeFormatLength) {
			NotificationChain msgs = null;
			if (jPEGInterChangeFormatLength != null)
				msgs = ((InternalEObject)jPEGInterChangeFormatLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH, null, msgs);
			if (newJPEGInterChangeFormatLength != null)
				msgs = ((InternalEObject)newJPEGInterChangeFormatLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH, null, msgs);
			msgs = basicSetJPEGInterChangeFormatLength(newJPEGInterChangeFormatLength, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH, newJPEGInterChangeFormatLength, newJPEGInterChangeFormatLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTransferFunction() {
		return transferFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransferFunction(EObject newTransferFunction, NotificationChain msgs) {
		EObject oldTransferFunction = transferFunction;
		transferFunction = newTransferFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION, oldTransferFunction, newTransferFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferFunction(EObject newTransferFunction) {
		if (newTransferFunction != transferFunction) {
			NotificationChain msgs = null;
			if (transferFunction != null)
				msgs = ((InternalEObject)transferFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION, null, msgs);
			if (newTransferFunction != null)
				msgs = ((InternalEObject)newTransferFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION, null, msgs);
			msgs = basicSetTransferFunction(newTransferFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION, newTransferFunction, newTransferFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitePointType getWhitePoint() {
		return whitePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhitePoint(WhitePointType newWhitePoint, NotificationChain msgs) {
		WhitePointType oldWhitePoint = whitePoint;
		whitePoint = newWhitePoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__WHITE_POINT, oldWhitePoint, newWhitePoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhitePoint(WhitePointType newWhitePoint) {
		if (newWhitePoint != whitePoint) {
			NotificationChain msgs = null;
			if (whitePoint != null)
				msgs = ((InternalEObject)whitePoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__WHITE_POINT, null, msgs);
			if (newWhitePoint != null)
				msgs = ((InternalEObject)newWhitePoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__WHITE_POINT, null, msgs);
			msgs = basicSetWhitePoint(newWhitePoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__WHITE_POINT, newWhitePoint, newWhitePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryChromaticitiesType getPrimaryChromaticities() {
		return primaryChromaticities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimaryChromaticities(PrimaryChromaticitiesType newPrimaryChromaticities, NotificationChain msgs) {
		PrimaryChromaticitiesType oldPrimaryChromaticities = primaryChromaticities;
		primaryChromaticities = newPrimaryChromaticities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES, oldPrimaryChromaticities, newPrimaryChromaticities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimaryChromaticities(PrimaryChromaticitiesType newPrimaryChromaticities) {
		if (newPrimaryChromaticities != primaryChromaticities) {
			NotificationChain msgs = null;
			if (primaryChromaticities != null)
				msgs = ((InternalEObject)primaryChromaticities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES, null, msgs);
			if (newPrimaryChromaticities != null)
				msgs = ((InternalEObject)newPrimaryChromaticities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES, null, msgs);
			msgs = basicSetPrimaryChromaticities(newPrimaryChromaticities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES, newPrimaryChromaticities, newPrimaryChromaticities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YCbCrCoefficientsType getYCbCrCoefficients() {
		return yCbCrCoefficients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetYCbCrCoefficients(YCbCrCoefficientsType newYCbCrCoefficients, NotificationChain msgs) {
		YCbCrCoefficientsType oldYCbCrCoefficients = yCbCrCoefficients;
		yCbCrCoefficients = newYCbCrCoefficients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS, oldYCbCrCoefficients, newYCbCrCoefficients);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCbCrCoefficients(YCbCrCoefficientsType newYCbCrCoefficients) {
		if (newYCbCrCoefficients != yCbCrCoefficients) {
			NotificationChain msgs = null;
			if (yCbCrCoefficients != null)
				msgs = ((InternalEObject)yCbCrCoefficients).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS, null, msgs);
			if (newYCbCrCoefficients != null)
				msgs = ((InternalEObject)newYCbCrCoefficients).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS, null, msgs);
			msgs = basicSetYCbCrCoefficients(newYCbCrCoefficients, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS, newYCbCrCoefficients, newYCbCrCoefficients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryChromaticitiesType getReferenceBlackWhite() {
		return referenceBlackWhite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceBlackWhite(PrimaryChromaticitiesType newReferenceBlackWhite, NotificationChain msgs) {
		PrimaryChromaticitiesType oldReferenceBlackWhite = referenceBlackWhite;
		referenceBlackWhite = newReferenceBlackWhite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE, oldReferenceBlackWhite, newReferenceBlackWhite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceBlackWhite(PrimaryChromaticitiesType newReferenceBlackWhite) {
		if (newReferenceBlackWhite != referenceBlackWhite) {
			NotificationChain msgs = null;
			if (referenceBlackWhite != null)
				msgs = ((InternalEObject)referenceBlackWhite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE, null, msgs);
			if (newReferenceBlackWhite != null)
				msgs = ((InternalEObject)newReferenceBlackWhite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE, null, msgs);
			msgs = basicSetReferenceBlackWhite(newReferenceBlackWhite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE, newReferenceBlackWhite, newReferenceBlackWhite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeType getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateTime(DateTimeType newDateTime, NotificationChain msgs) {
		DateTimeType oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__DATE_TIME, oldDateTime, newDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(DateTimeType newDateTime) {
		if (newDateTime != dateTime) {
			NotificationChain msgs = null;
			if (dateTime != null)
				msgs = ((InternalEObject)dateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__DATE_TIME, null, msgs);
			if (newDateTime != null)
				msgs = ((InternalEObject)newDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__DATE_TIME, null, msgs);
			msgs = basicSetDateTime(newDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__DATE_TIME, newDateTime, newDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getImageDescription() {
		return imageDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImageDescription(StringType newImageDescription, NotificationChain msgs) {
		StringType oldImageDescription = imageDescription;
		imageDescription = newImageDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION, oldImageDescription, newImageDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageDescription(StringType newImageDescription) {
		if (newImageDescription != imageDescription) {
			NotificationChain msgs = null;
			if (imageDescription != null)
				msgs = ((InternalEObject)imageDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION, null, msgs);
			if (newImageDescription != null)
				msgs = ((InternalEObject)newImageDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION, null, msgs);
			msgs = basicSetImageDescription(newImageDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION, newImageDescription, newImageDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getMake() {
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMake(StringType newMake, NotificationChain msgs) {
		StringType oldMake = make;
		make = newMake;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__MAKE, oldMake, newMake);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(StringType newMake) {
		if (newMake != make) {
			NotificationChain msgs = null;
			if (make != null)
				msgs = ((InternalEObject)make).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__MAKE, null, msgs);
			if (newMake != null)
				msgs = ((InternalEObject)newMake).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__MAKE, null, msgs);
			msgs = basicSetMake(newMake, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__MAKE, newMake, newMake));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(StringType newModel, NotificationChain msgs) {
		StringType oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__MODEL, oldModel, newModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(StringType newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__MODEL, null, msgs);
			if (newModel != null)
				msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__MODEL, null, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__MODEL, newModel, newModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(StringType newSoftware, NotificationChain msgs) {
		StringType oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(StringType newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject)software).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject)newSoftware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__SOFTWARE, newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getArtist() {
		return artist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtist(StringType newArtist, NotificationChain msgs) {
		StringType oldArtist = artist;
		artist = newArtist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ARTIST, oldArtist, newArtist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtist(StringType newArtist) {
		if (newArtist != artist) {
			NotificationChain msgs = null;
			if (artist != null)
				msgs = ((InternalEObject)artist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ARTIST, null, msgs);
			if (newArtist != null)
				msgs = ((InternalEObject)newArtist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__ARTIST, null, msgs);
			msgs = basicSetArtist(newArtist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__ARTIST, newArtist, newArtist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(StringType newCopyright, NotificationChain msgs) {
		StringType oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(StringType newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getTiffField1() {
		return tiffField1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiffField1(SingleFieldType newTiffField1, NotificationChain msgs) {
		SingleFieldType oldTiffField1 = tiffField1;
		tiffField1 = newTiffField1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1, oldTiffField1, newTiffField1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiffField1(SingleFieldType newTiffField1) {
		if (newTiffField1 != tiffField1) {
			NotificationChain msgs = null;
			if (tiffField1 != null)
				msgs = ((InternalEObject)tiffField1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1, null, msgs);
			if (newTiffField1 != null)
				msgs = ((InternalEObject)newTiffField1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1, null, msgs);
			msgs = basicSetTiffField1(newTiffField1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1, newTiffField1, newTiffField1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFieldType getTiffField2() {
		return tiffField2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiffField2(SingleFieldType newTiffField2, NotificationChain msgs) {
		SingleFieldType oldTiffField2 = tiffField2;
		tiffField2 = newTiffField2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2, oldTiffField2, newTiffField2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiffField2(SingleFieldType newTiffField2) {
		if (newTiffField2 != tiffField2) {
			NotificationChain msgs = null;
			if (tiffField2 != null)
				msgs = ((InternalEObject)tiffField2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2, null, msgs);
			if (newTiffField2 != null)
				msgs = ((InternalEObject)newTiffField2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2, null, msgs);
			msgs = basicSetTiffField2(newTiffField2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2, newTiffField2, newTiffField2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedFieldType getTiffField3() {
		return tiffField3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiffField3(RepeatedFieldType newTiffField3, NotificationChain msgs) {
		RepeatedFieldType oldTiffField3 = tiffField3;
		tiffField3 = newTiffField3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3, oldTiffField3, newTiffField3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiffField3(RepeatedFieldType newTiffField3) {
		if (newTiffField3 != tiffField3) {
			NotificationChain msgs = null;
			if (tiffField3 != null)
				msgs = ((InternalEObject)tiffField3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3, null, msgs);
			if (newTiffField3 != null)
				msgs = ((InternalEObject)newTiffField3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3, null, msgs);
			msgs = basicSetTiffField3(newTiffField3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3, newTiffField3, newTiffField3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
				return basicSetImageWidth(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
				return basicSetImageLength(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
				return basicSetBitsPerSample(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
				return basicSetCompression(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
				return basicSetPhotometricInterpretation(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
				return basicSetSamplesPerPixel(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
				return basicSetPlanarConfiguration(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
				return basicSetYCbCrSubSampling(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
				return basicSetYCbCrPositioning(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
				return basicSetXResolution(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
				return basicSetYResolution(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
				return basicSetResolutionUnit(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
				return basicSetStripOffsets(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
				return basicSetRowsPerStrip(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
				return basicSetStripByteCounts(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
				return basicSetJPEGInterChangeFormat(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
				return basicSetJPEGInterChangeFormatLength(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
				return basicSetTransferFunction(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
				return basicSetWhitePoint(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
				return basicSetPrimaryChromaticities(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
				return basicSetYCbCrCoefficients(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
				return basicSetReferenceBlackWhite(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
				return basicSetDateTime(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
				return basicSetImageDescription(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
				return basicSetMake(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
				return basicSetModel(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
				return basicSetSoftware(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
				return basicSetArtist(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
				return basicSetTiffField1(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
				return basicSetTiffField2(null, msgs);
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				return basicSetTiffField3(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
				return getImageWidth();
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
				return getImageLength();
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
				return getBitsPerSample();
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
				return getCompression();
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
				return getPhotometricInterpretation();
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
				return getOrientation();
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
				return getSamplesPerPixel();
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
				return getPlanarConfiguration();
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
				return getYCbCrSubSampling();
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
				return getYCbCrPositioning();
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
				return getXResolution();
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
				return getYResolution();
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
				return getResolutionUnit();
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
				return getStripOffsets();
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
				return getRowsPerStrip();
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
				return getStripByteCounts();
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
				return getJPEGInterChangeFormat();
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
				return getJPEGInterChangeFormatLength();
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
				return getTransferFunction();
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
				return getWhitePoint();
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
				return getPrimaryChromaticities();
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
				return getYCbCrCoefficients();
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
				return getReferenceBlackWhite();
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
				return getDateTime();
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
				return getImageDescription();
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
				return getMake();
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
				return getModel();
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
				return getSoftware();
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
				return getArtist();
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
				return getCopyright();
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
				return getTiffField1();
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
				return getTiffField2();
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				return getTiffField3();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
				setImageWidth((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
				setImageLength((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
				setBitsPerSample((BitsPerSampleType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
				setCompression((CompressionType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
				setPhotometricInterpretation((PhotometricInterpretationType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
				setOrientation((OrientationType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
				setSamplesPerPixel((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
				setPlanarConfiguration((PlanarConfigurationType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
				setYCbCrSubSampling((YCbCrSubSamplingType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
				setYCbCrPositioning((YCbCrPositioningType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
				setXResolution((NonNegativeRealType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
				setYResolution((NonNegativeRealType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
				setResolutionUnit((ResolutionType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
				setStripOffsets((StripOffsetsType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
				setRowsPerStrip((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
				setStripByteCounts((StripByteCountsType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
				setJPEGInterChangeFormat((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
				setJPEGInterChangeFormatLength((PositiveIntegerType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
				setTransferFunction((EObject)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
				setWhitePoint((WhitePointType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
				setPrimaryChromaticities((PrimaryChromaticitiesType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
				setYCbCrCoefficients((YCbCrCoefficientsType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
				setReferenceBlackWhite((PrimaryChromaticitiesType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
				setDateTime((DateTimeType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
				setImageDescription((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
				setMake((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
				setModel((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
				setSoftware((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
				setArtist((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
				setCopyright((StringType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
				setTiffField1((SingleFieldType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
				setTiffField2((SingleFieldType)newValue);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				setTiffField3((RepeatedFieldType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
				setImageWidth((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
				setImageLength((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
				setBitsPerSample((BitsPerSampleType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
				setCompression((CompressionType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
				setPhotometricInterpretation((PhotometricInterpretationType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
				setOrientation((OrientationType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
				setSamplesPerPixel((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
				setPlanarConfiguration((PlanarConfigurationType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
				setYCbCrSubSampling((YCbCrSubSamplingType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
				setYCbCrPositioning((YCbCrPositioningType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
				setXResolution((NonNegativeRealType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
				setYResolution((NonNegativeRealType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
				setResolutionUnit((ResolutionType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
				setStripOffsets((StripOffsetsType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
				setRowsPerStrip((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
				setStripByteCounts((StripByteCountsType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
				setJPEGInterChangeFormat((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
				setJPEGInterChangeFormatLength((PositiveIntegerType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
				setTransferFunction((EObject)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
				setWhitePoint((WhitePointType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
				setPrimaryChromaticities((PrimaryChromaticitiesType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
				setYCbCrCoefficients((YCbCrCoefficientsType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
				setReferenceBlackWhite((PrimaryChromaticitiesType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
				setDateTime((DateTimeType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
				setImageDescription((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
				setMake((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
				setModel((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
				setSoftware((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
				setArtist((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
				setCopyright((StringType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
				setTiffField1((SingleFieldType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
				setTiffField2((SingleFieldType)null);
				return;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				setTiffField3((RepeatedFieldType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_WIDTH:
				return imageWidth != null;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_LENGTH:
				return imageLength != null;
			case ExifPackage.TIFF_IFD_TYPE__BITS_PER_SAMPLE:
				return bitsPerSample != null;
			case ExifPackage.TIFF_IFD_TYPE__COMPRESSION:
				return compression != null;
			case ExifPackage.TIFF_IFD_TYPE__PHOTOMETRIC_INTERPRETATION:
				return photometricInterpretation != null;
			case ExifPackage.TIFF_IFD_TYPE__ORIENTATION:
				return orientation != null;
			case ExifPackage.TIFF_IFD_TYPE__SAMPLES_PER_PIXEL:
				return samplesPerPixel != null;
			case ExifPackage.TIFF_IFD_TYPE__PLANAR_CONFIGURATION:
				return planarConfiguration != null;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_SUB_SAMPLING:
				return yCbCrSubSampling != null;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_POSITIONING:
				return yCbCrPositioning != null;
			case ExifPackage.TIFF_IFD_TYPE__XRESOLUTION:
				return xResolution != null;
			case ExifPackage.TIFF_IFD_TYPE__YRESOLUTION:
				return yResolution != null;
			case ExifPackage.TIFF_IFD_TYPE__RESOLUTION_UNIT:
				return resolutionUnit != null;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_OFFSETS:
				return stripOffsets != null;
			case ExifPackage.TIFF_IFD_TYPE__ROWS_PER_STRIP:
				return rowsPerStrip != null;
			case ExifPackage.TIFF_IFD_TYPE__STRIP_BYTE_COUNTS:
				return stripByteCounts != null;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT:
				return jPEGInterChangeFormat != null;
			case ExifPackage.TIFF_IFD_TYPE__JPEG_INTER_CHANGE_FORMAT_LENGTH:
				return jPEGInterChangeFormatLength != null;
			case ExifPackage.TIFF_IFD_TYPE__TRANSFER_FUNCTION:
				return transferFunction != null;
			case ExifPackage.TIFF_IFD_TYPE__WHITE_POINT:
				return whitePoint != null;
			case ExifPackage.TIFF_IFD_TYPE__PRIMARY_CHROMATICITIES:
				return primaryChromaticities != null;
			case ExifPackage.TIFF_IFD_TYPE__YCB_CR_COEFFICIENTS:
				return yCbCrCoefficients != null;
			case ExifPackage.TIFF_IFD_TYPE__REFERENCE_BLACK_WHITE:
				return referenceBlackWhite != null;
			case ExifPackage.TIFF_IFD_TYPE__DATE_TIME:
				return dateTime != null;
			case ExifPackage.TIFF_IFD_TYPE__IMAGE_DESCRIPTION:
				return imageDescription != null;
			case ExifPackage.TIFF_IFD_TYPE__MAKE:
				return make != null;
			case ExifPackage.TIFF_IFD_TYPE__MODEL:
				return model != null;
			case ExifPackage.TIFF_IFD_TYPE__SOFTWARE:
				return software != null;
			case ExifPackage.TIFF_IFD_TYPE__ARTIST:
				return artist != null;
			case ExifPackage.TIFF_IFD_TYPE__COPYRIGHT:
				return copyright != null;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD1:
				return tiffField1 != null;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD2:
				return tiffField2 != null;
			case ExifPackage.TIFF_IFD_TYPE__TIFF_FIELD3:
				return tiffField3 != null;
		}
		return super.eIsSet(featureID);
	}

} //TiffIfdTypeImpl
