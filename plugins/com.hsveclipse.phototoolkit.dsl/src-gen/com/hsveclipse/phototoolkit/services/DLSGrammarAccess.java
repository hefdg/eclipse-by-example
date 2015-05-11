/*
 * generated by Xtext
 */
package com.hsveclipse.phototoolkit.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class DLSGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Site");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSiteAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cPhotosAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cPhotosPhotoParserRuleCall_1_0_0 = (RuleCall)cPhotosAssignment_1_0.eContents().get(0);
		private final Assignment cGalleriesAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cGalleriesGalleryParserRuleCall_1_1_0 = (RuleCall)cGalleriesAssignment_1_1.eContents().get(0);
		
		//Site:
		//	{Site} (photos+=Photo | galleries+=Gallery)*;
		@Override public ParserRule getRule() { return rule; }

		//{Site} (photos+=Photo | galleries+=Gallery)*
		public Group getGroup() { return cGroup; }

		//{Site}
		public Action getSiteAction_0() { return cSiteAction_0; }

		//(photos+=Photo | galleries+=Gallery)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }

		//photos+=Photo
		public Assignment getPhotosAssignment_1_0() { return cPhotosAssignment_1_0; }

		//Photo
		public RuleCall getPhotosPhotoParserRuleCall_1_0_0() { return cPhotosPhotoParserRuleCall_1_0_0; }

		//galleries+=Gallery
		public Assignment getGalleriesAssignment_1_1() { return cGalleriesAssignment_1_1; }

		//Gallery
		public RuleCall getGalleriesGalleryParserRuleCall_1_1_0() { return cGalleriesGalleryParserRuleCall_1_1_0; }
	}

	public class GalleryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Gallery");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGalleryAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cGalleryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cDescriptionKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDescriptionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cDescriptionAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cPhotoKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cPhotosAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cPhotosPhotoCrossReference_5_1_0 = (CrossReference)cPhotosAssignment_5_1.eContents().get(0);
		private final RuleCall cPhotosPhotoIDTerminalRuleCall_5_1_0_1 = (RuleCall)cPhotosPhotoCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Gallery:
		//	{Gallery} "gallery" name=ID "{" ("description" description=STRING)? ("photo" photos+=[Photo])* "}";
		@Override public ParserRule getRule() { return rule; }

		//{Gallery} "gallery" name=ID "{" ("description" description=STRING)? ("photo" photos+=[Photo])* "}"
		public Group getGroup() { return cGroup; }

		//{Gallery}
		public Action getGalleryAction_0() { return cGalleryAction_0; }

		//"gallery"
		public Keyword getGalleryKeyword_1() { return cGalleryKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("description" description=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"description"
		public Keyword getDescriptionKeyword_4_0() { return cDescriptionKeyword_4_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_4_1() { return cDescriptionAssignment_4_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_4_1_0() { return cDescriptionSTRINGTerminalRuleCall_4_1_0; }

		//("photo" photos+=[Photo])*
		public Group getGroup_5() { return cGroup_5; }

		//"photo"
		public Keyword getPhotoKeyword_5_0() { return cPhotoKeyword_5_0; }

		//photos+=[Photo]
		public Assignment getPhotosAssignment_5_1() { return cPhotosAssignment_5_1; }

		//[Photo]
		public CrossReference getPhotosPhotoCrossReference_5_1_0() { return cPhotosPhotoCrossReference_5_1_0; }

		//ID
		public RuleCall getPhotosPhotoIDTerminalRuleCall_5_1_0_1() { return cPhotosPhotoIDTerminalRuleCall_5_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class PhotoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Photo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPhotoAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPhotoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cUrlKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cUriAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cUriSTRINGTerminalRuleCall_4_1_0 = (RuleCall)cUriAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cDescriptionKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cDescriptionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cDescriptionAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cTagKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTagsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTagsSTRINGTerminalRuleCall_6_1_0 = (RuleCall)cTagsAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Photo:
		//	{Photo} "photo" name=ID "{" ("url" uri=STRING)? ("description" description=STRING)? ("tag" tags+=STRING)* "}";
		@Override public ParserRule getRule() { return rule; }

		//{Photo} "photo" name=ID "{" ("url" uri=STRING)? ("description" description=STRING)? ("tag" tags+=STRING)* "}"
		public Group getGroup() { return cGroup; }

		//{Photo}
		public Action getPhotoAction_0() { return cPhotoAction_0; }

		//"photo"
		public Keyword getPhotoKeyword_1() { return cPhotoKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//("url" uri=STRING)?
		public Group getGroup_4() { return cGroup_4; }

		//"url"
		public Keyword getUrlKeyword_4_0() { return cUrlKeyword_4_0; }

		//uri=STRING
		public Assignment getUriAssignment_4_1() { return cUriAssignment_4_1; }

		//STRING
		public RuleCall getUriSTRINGTerminalRuleCall_4_1_0() { return cUriSTRINGTerminalRuleCall_4_1_0; }

		//("description" description=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//"description"
		public Keyword getDescriptionKeyword_5_0() { return cDescriptionKeyword_5_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_5_1() { return cDescriptionAssignment_5_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_5_1_0() { return cDescriptionSTRINGTerminalRuleCall_5_1_0; }

		//("tag" tags+=STRING)*
		public Group getGroup_6() { return cGroup_6; }

		//"tag"
		public Keyword getTagKeyword_6_0() { return cTagKeyword_6_0; }

		//tags+=STRING
		public Assignment getTagsAssignment_6_1() { return cTagsAssignment_6_1; }

		//STRING
		public RuleCall getTagsSTRINGTerminalRuleCall_6_1_0() { return cTagsSTRINGTerminalRuleCall_6_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	
	
	private final SiteElements pSite;
	private final GalleryElements pGallery;
	private final PhotoElements pPhoto;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DLSGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSite = new SiteElements();
		this.pGallery = new GalleryElements();
		this.pPhoto = new PhotoElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.hsveclipse.phototoolkit.DLS".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Site:
	//	{Site} (photos+=Photo | galleries+=Gallery)*;
	public SiteElements getSiteAccess() {
		return pSite;
	}
	
	public ParserRule getSiteRule() {
		return getSiteAccess().getRule();
	}

	//Gallery:
	//	{Gallery} "gallery" name=ID "{" ("description" description=STRING)? ("photo" photos+=[Photo])* "}";
	public GalleryElements getGalleryAccess() {
		return pGallery;
	}
	
	public ParserRule getGalleryRule() {
		return getGalleryAccess().getRule();
	}

	//Photo:
	//	{Photo} "photo" name=ID "{" ("url" uri=STRING)? ("description" description=STRING)? ("tag" tags+=STRING)* "}";
	public PhotoElements getPhotoAccess() {
		return pPhoto;
	}
	
	public ParserRule getPhotoRule() {
		return getPhotoAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
