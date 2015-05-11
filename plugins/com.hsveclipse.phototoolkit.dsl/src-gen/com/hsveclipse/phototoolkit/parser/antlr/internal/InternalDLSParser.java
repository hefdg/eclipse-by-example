package com.hsveclipse.phototoolkit.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.hsveclipse.phototoolkit.services.DLSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDLSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'gallery'", "'{'", "'description'", "'photo'", "'}'", "'url'", "'tag'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalDLSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDLSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDLSParser.tokenNames; }
    public String getGrammarFileName() { return "../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g"; }



     	private DLSGrammarAccess grammarAccess;
     	
        public InternalDLSParser(TokenStream input, DLSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Site";	
       	}
       	
       	@Override
       	protected DLSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSite"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:67:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:68:2: (iv_ruleSite= ruleSite EOF )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:69:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_ruleSite_in_entryRuleSite75);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSite85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:76:1: ruleSite returns [EObject current=null] : ( () ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )* ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        EObject lv_photos_1_0 = null;

        EObject lv_galleries_2_0 = null;


         enterRule(); 
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:79:28: ( ( () ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )* ) )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:80:1: ( () ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )* )
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:80:1: ( () ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )* )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:80:2: () ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )*
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:80:2: ()
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSiteAccess().getSiteAction_0(),
                        current);
                

            }

            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:86:2: ( ( (lv_photos_1_0= rulePhoto ) ) | ( (lv_galleries_2_0= ruleGallery ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }
                else if ( (LA1_0==11) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:86:3: ( (lv_photos_1_0= rulePhoto ) )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:86:3: ( (lv_photos_1_0= rulePhoto ) )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:87:1: (lv_photos_1_0= rulePhoto )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:87:1: (lv_photos_1_0= rulePhoto )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:88:3: lv_photos_1_0= rulePhoto
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiteAccess().getPhotosPhotoParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePhoto_in_ruleSite141);
            	    lv_photos_1_0=rulePhoto();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"photos",
            	            		lv_photos_1_0, 
            	            		"Photo");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:105:6: ( (lv_galleries_2_0= ruleGallery ) )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:105:6: ( (lv_galleries_2_0= ruleGallery ) )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:106:1: (lv_galleries_2_0= ruleGallery )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:106:1: (lv_galleries_2_0= ruleGallery )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:107:3: lv_galleries_2_0= ruleGallery
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSiteAccess().getGalleriesGalleryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGallery_in_ruleSite168);
            	    lv_galleries_2_0=ruleGallery();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSiteRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"galleries",
            	            		lv_galleries_2_0, 
            	            		"Gallery");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleGallery"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:131:1: entryRuleGallery returns [EObject current=null] : iv_ruleGallery= ruleGallery EOF ;
    public final EObject entryRuleGallery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGallery = null;


        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:132:2: (iv_ruleGallery= ruleGallery EOF )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:133:2: iv_ruleGallery= ruleGallery EOF
            {
             newCompositeNode(grammarAccess.getGalleryRule()); 
            pushFollow(FOLLOW_ruleGallery_in_entryRuleGallery206);
            iv_ruleGallery=ruleGallery();

            state._fsp--;

             current =iv_ruleGallery; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGallery216); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGallery"


    // $ANTLR start "ruleGallery"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:140:1: ruleGallery returns [EObject current=null] : ( () otherlv_1= 'gallery' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleGallery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:143:28: ( ( () otherlv_1= 'gallery' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:144:1: ( () otherlv_1= 'gallery' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:144:1: ( () otherlv_1= 'gallery' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:144:2: () otherlv_1= 'gallery' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )? (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:144:2: ()
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:145:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGalleryAccess().getGalleryAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleGallery262); 

                	newLeafNode(otherlv_1, grammarAccess.getGalleryAccess().getGalleryKeyword_1());
                
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:154:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:155:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:155:1: (lv_name_2_0= RULE_ID )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:156:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGallery279); 

            			newLeafNode(lv_name_2_0, grammarAccess.getGalleryAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGalleryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleGallery296); 

                	newLeafNode(otherlv_3, grammarAccess.getGalleryAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:176:1: (otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:176:3: otherlv_4= 'description' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGallery309); 

                        	newLeafNode(otherlv_4, grammarAccess.getGalleryAccess().getDescriptionKeyword_4_0());
                        
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:180:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:181:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:181:1: (lv_description_5_0= RULE_STRING )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:182:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGallery326); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getGalleryAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGalleryRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:198:4: (otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:198:6: otherlv_6= 'photo' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleGallery346); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGalleryAccess().getPhotoKeyword_5_0());
            	        
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:202:1: ( (otherlv_7= RULE_ID ) )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:203:1: (otherlv_7= RULE_ID )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:203:1: (otherlv_7= RULE_ID )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:204:3: otherlv_7= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGalleryRule());
            	    	        }
            	            
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGallery366); 

            	    		newLeafNode(otherlv_7, grammarAccess.getGalleryAccess().getPhotosPhotoCrossReference_5_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleGallery380); 

                	newLeafNode(otherlv_8, grammarAccess.getGalleryAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGallery"


    // $ANTLR start "entryRulePhoto"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:227:1: entryRulePhoto returns [EObject current=null] : iv_rulePhoto= rulePhoto EOF ;
    public final EObject entryRulePhoto() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhoto = null;


        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:228:2: (iv_rulePhoto= rulePhoto EOF )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:229:2: iv_rulePhoto= rulePhoto EOF
            {
             newCompositeNode(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_rulePhoto_in_entryRulePhoto416);
            iv_rulePhoto=rulePhoto();

            state._fsp--;

             current =iv_rulePhoto; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhoto426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:236:1: rulePhoto returns [EObject current=null] : ( () otherlv_1= 'photo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )* otherlv_10= '}' ) ;
    public final EObject rulePhoto() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_uri_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_tags_9_0=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:239:28: ( ( () otherlv_1= 'photo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )* otherlv_10= '}' ) )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:240:1: ( () otherlv_1= 'photo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )* otherlv_10= '}' )
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:240:1: ( () otherlv_1= 'photo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )* otherlv_10= '}' )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:240:2: () otherlv_1= 'photo' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )? (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )? (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )* otherlv_10= '}'
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:240:2: ()
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:241:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPhotoAccess().getPhotoAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_rulePhoto472); 

                	newLeafNode(otherlv_1, grammarAccess.getPhotoAccess().getPhotoKeyword_1());
                
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:250:1: ( (lv_name_2_0= RULE_ID ) )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:251:1: (lv_name_2_0= RULE_ID )
            {
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:251:1: (lv_name_2_0= RULE_ID )
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:252:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePhoto489); 

            			newLeafNode(lv_name_2_0, grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhotoRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_rulePhoto506); 

                	newLeafNode(otherlv_3, grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:272:1: (otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:272:3: otherlv_4= 'url' ( (lv_uri_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePhoto519); 

                        	newLeafNode(otherlv_4, grammarAccess.getPhotoAccess().getUrlKeyword_4_0());
                        
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:276:1: ( (lv_uri_5_0= RULE_STRING ) )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:277:1: (lv_uri_5_0= RULE_STRING )
                    {
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:277:1: (lv_uri_5_0= RULE_STRING )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:278:3: lv_uri_5_0= RULE_STRING
                    {
                    lv_uri_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhoto536); 

                    			newLeafNode(lv_uri_5_0, grammarAccess.getPhotoAccess().getUriSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPhotoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"uri",
                            		lv_uri_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:294:4: (otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:294:6: otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_rulePhoto556); 

                        	newLeafNode(otherlv_6, grammarAccess.getPhotoAccess().getDescriptionKeyword_5_0());
                        
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:298:1: ( (lv_description_7_0= RULE_STRING ) )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:299:1: (lv_description_7_0= RULE_STRING )
                    {
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:299:1: (lv_description_7_0= RULE_STRING )
                    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:300:3: lv_description_7_0= RULE_STRING
                    {
                    lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhoto573); 

                    			newLeafNode(lv_description_7_0, grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPhotoRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:316:4: (otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:316:6: otherlv_8= 'tag' ( (lv_tags_9_0= RULE_STRING ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_rulePhoto593); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPhotoAccess().getTagKeyword_6_0());
            	        
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:320:1: ( (lv_tags_9_0= RULE_STRING ) )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:321:1: (lv_tags_9_0= RULE_STRING )
            	    {
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:321:1: (lv_tags_9_0= RULE_STRING )
            	    // ../com.hsveclipse.phototoolkit.dsl/src-gen/com/hsveclipse/phototoolkit/parser/antlr/internal/InternalDLS.g:322:3: lv_tags_9_0= RULE_STRING
            	    {
            	    lv_tags_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePhoto610); 

            	    			newLeafNode(lv_tags_9_0, grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPhotoRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"tags",
            	            		lv_tags_9_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_rulePhoto629); 

                	newLeafNode(otherlv_10, grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhoto"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSite_in_entryRuleSite75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSite85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhoto_in_ruleSite141 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleGallery_in_ruleSite168 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_ruleGallery_in_entryRuleGallery206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGallery216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGallery262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGallery279 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGallery296 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13_in_ruleGallery309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGallery326 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleGallery346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGallery366 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleGallery380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhoto_in_entryRulePhoto416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhoto426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePhoto472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePhoto489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePhoto506 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_16_in_rulePhoto519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhoto536 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_13_in_rulePhoto556 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhoto573 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_17_in_rulePhoto593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePhoto610 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_15_in_rulePhoto629 = new BitSet(new long[]{0x0000000000000002L});

}