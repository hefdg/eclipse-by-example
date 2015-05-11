/*
 * generated by Xtext
 */
package com.hsveclipse.phototoolkit.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.hsveclipse.phototoolkit.Gallery;
import com.hsveclipse.phototoolkit.Photo;
import com.hsveclipse.phototoolkit.PhototoolkitPackage;
import com.hsveclipse.phototoolkit.Site;
import com.hsveclipse.phototoolkit.services.DLSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class DLSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DLSGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PhototoolkitPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PhototoolkitPackage.GALLERY:
				sequence_Gallery(context, (Gallery) semanticObject); 
				return; 
			case PhototoolkitPackage.PHOTO:
				sequence_Photo(context, (Photo) semanticObject); 
				return; 
			case PhototoolkitPackage.SITE:
				sequence_Site(context, (Site) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? photos+=[Photo|ID]*)
	 */
	protected void sequence_Gallery(EObject context, Gallery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID uri=STRING? description=STRING? tags+=STRING*)
	 */
	protected void sequence_Photo(EObject context, Photo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((photos+=Photo | galleries+=Gallery)*)
	 */
	protected void sequence_Site(EObject context, Site semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
