package com.hsveclipse.phototoolkit.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.hsveclipse.phototoolkit.services.DLSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDLSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'gallery'", "'{'", "'}'", "'description'", "'photo'", "'url'", "'tag'"
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
    public String getGrammarFileName() { return "../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g"; }


     
     	private DLSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DLSGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSite"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:60:1: entryRuleSite : ruleSite EOF ;
    public final void entryRuleSite() throws RecognitionException {
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:61:1: ( ruleSite EOF )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:62:1: ruleSite EOF
            {
             before(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_ruleSite_in_entryRuleSite61);
            ruleSite();

            state._fsp--;

             after(grammarAccess.getSiteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSite68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:69:1: ruleSite : ( ( rule__Site__Group__0 ) ) ;
    public final void ruleSite() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:73:2: ( ( ( rule__Site__Group__0 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:74:1: ( ( rule__Site__Group__0 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:74:1: ( ( rule__Site__Group__0 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:75:1: ( rule__Site__Group__0 )
            {
             before(grammarAccess.getSiteAccess().getGroup()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:76:1: ( rule__Site__Group__0 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:76:2: rule__Site__Group__0
            {
            pushFollow(FOLLOW_rule__Site__Group__0_in_ruleSite94);
            rule__Site__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSiteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleGallery"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:88:1: entryRuleGallery : ruleGallery EOF ;
    public final void entryRuleGallery() throws RecognitionException {
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:89:1: ( ruleGallery EOF )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:90:1: ruleGallery EOF
            {
             before(grammarAccess.getGalleryRule()); 
            pushFollow(FOLLOW_ruleGallery_in_entryRuleGallery121);
            ruleGallery();

            state._fsp--;

             after(grammarAccess.getGalleryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGallery128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGallery"


    // $ANTLR start "ruleGallery"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:97:1: ruleGallery : ( ( rule__Gallery__Group__0 ) ) ;
    public final void ruleGallery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:101:2: ( ( ( rule__Gallery__Group__0 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:102:1: ( ( rule__Gallery__Group__0 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:102:1: ( ( rule__Gallery__Group__0 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:103:1: ( rule__Gallery__Group__0 )
            {
             before(grammarAccess.getGalleryAccess().getGroup()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:104:1: ( rule__Gallery__Group__0 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:104:2: rule__Gallery__Group__0
            {
            pushFollow(FOLLOW_rule__Gallery__Group__0_in_ruleGallery154);
            rule__Gallery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGalleryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGallery"


    // $ANTLR start "entryRulePhoto"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:116:1: entryRulePhoto : rulePhoto EOF ;
    public final void entryRulePhoto() throws RecognitionException {
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:117:1: ( rulePhoto EOF )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:118:1: rulePhoto EOF
            {
             before(grammarAccess.getPhotoRule()); 
            pushFollow(FOLLOW_rulePhoto_in_entryRulePhoto181);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getPhotoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhoto188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhoto"


    // $ANTLR start "rulePhoto"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:125:1: rulePhoto : ( ( rule__Photo__Group__0 ) ) ;
    public final void rulePhoto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:129:2: ( ( ( rule__Photo__Group__0 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:130:1: ( ( rule__Photo__Group__0 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:130:1: ( ( rule__Photo__Group__0 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:131:1: ( rule__Photo__Group__0 )
            {
             before(grammarAccess.getPhotoAccess().getGroup()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:132:1: ( rule__Photo__Group__0 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:132:2: rule__Photo__Group__0
            {
            pushFollow(FOLLOW_rule__Photo__Group__0_in_rulePhoto214);
            rule__Photo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhoto"


    // $ANTLR start "rule__Site__Alternatives_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:144:1: rule__Site__Alternatives_1 : ( ( ( rule__Site__PhotosAssignment_1_0 ) ) | ( ( rule__Site__GalleriesAssignment_1_1 ) ) );
    public final void rule__Site__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:148:1: ( ( ( rule__Site__PhotosAssignment_1_0 ) ) | ( ( rule__Site__GalleriesAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==11) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:149:1: ( ( rule__Site__PhotosAssignment_1_0 ) )
                    {
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:149:1: ( ( rule__Site__PhotosAssignment_1_0 ) )
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:150:1: ( rule__Site__PhotosAssignment_1_0 )
                    {
                     before(grammarAccess.getSiteAccess().getPhotosAssignment_1_0()); 
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:151:1: ( rule__Site__PhotosAssignment_1_0 )
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:151:2: rule__Site__PhotosAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Site__PhotosAssignment_1_0_in_rule__Site__Alternatives_1250);
                    rule__Site__PhotosAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSiteAccess().getPhotosAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:155:6: ( ( rule__Site__GalleriesAssignment_1_1 ) )
                    {
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:155:6: ( ( rule__Site__GalleriesAssignment_1_1 ) )
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:156:1: ( rule__Site__GalleriesAssignment_1_1 )
                    {
                     before(grammarAccess.getSiteAccess().getGalleriesAssignment_1_1()); 
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:157:1: ( rule__Site__GalleriesAssignment_1_1 )
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:157:2: rule__Site__GalleriesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Site__GalleriesAssignment_1_1_in_rule__Site__Alternatives_1268);
                    rule__Site__GalleriesAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSiteAccess().getGalleriesAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Alternatives_1"


    // $ANTLR start "rule__Site__Group__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:168:1: rule__Site__Group__0 : rule__Site__Group__0__Impl rule__Site__Group__1 ;
    public final void rule__Site__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:172:1: ( rule__Site__Group__0__Impl rule__Site__Group__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:173:2: rule__Site__Group__0__Impl rule__Site__Group__1
            {
            pushFollow(FOLLOW_rule__Site__Group__0__Impl_in_rule__Site__Group__0299);
            rule__Site__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Site__Group__1_in_rule__Site__Group__0302);
            rule__Site__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0"


    // $ANTLR start "rule__Site__Group__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:180:1: rule__Site__Group__0__Impl : ( () ) ;
    public final void rule__Site__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:184:1: ( ( () ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:185:1: ( () )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:185:1: ( () )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:186:1: ()
            {
             before(grammarAccess.getSiteAccess().getSiteAction_0()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:187:1: ()
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:189:1: 
            {
            }

             after(grammarAccess.getSiteAccess().getSiteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__0__Impl"


    // $ANTLR start "rule__Site__Group__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:199:1: rule__Site__Group__1 : rule__Site__Group__1__Impl ;
    public final void rule__Site__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:203:1: ( rule__Site__Group__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:204:2: rule__Site__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Site__Group__1__Impl_in_rule__Site__Group__1360);
            rule__Site__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1"


    // $ANTLR start "rule__Site__Group__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:210:1: rule__Site__Group__1__Impl : ( ( rule__Site__Alternatives_1 )* ) ;
    public final void rule__Site__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:214:1: ( ( ( rule__Site__Alternatives_1 )* ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:215:1: ( ( rule__Site__Alternatives_1 )* )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:215:1: ( ( rule__Site__Alternatives_1 )* )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:216:1: ( rule__Site__Alternatives_1 )*
            {
             before(grammarAccess.getSiteAccess().getAlternatives_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:217:1: ( rule__Site__Alternatives_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:217:2: rule__Site__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Site__Alternatives_1_in_rule__Site__Group__1__Impl387);
            	    rule__Site__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getSiteAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__Group__1__Impl"


    // $ANTLR start "rule__Gallery__Group__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:231:1: rule__Gallery__Group__0 : rule__Gallery__Group__0__Impl rule__Gallery__Group__1 ;
    public final void rule__Gallery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:235:1: ( rule__Gallery__Group__0__Impl rule__Gallery__Group__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:236:2: rule__Gallery__Group__0__Impl rule__Gallery__Group__1
            {
            pushFollow(FOLLOW_rule__Gallery__Group__0__Impl_in_rule__Gallery__Group__0422);
            rule__Gallery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__1_in_rule__Gallery__Group__0425);
            rule__Gallery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__0"


    // $ANTLR start "rule__Gallery__Group__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:243:1: rule__Gallery__Group__0__Impl : ( () ) ;
    public final void rule__Gallery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:247:1: ( ( () ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:248:1: ( () )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:248:1: ( () )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:249:1: ()
            {
             before(grammarAccess.getGalleryAccess().getGalleryAction_0()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:250:1: ()
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:252:1: 
            {
            }

             after(grammarAccess.getGalleryAccess().getGalleryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__0__Impl"


    // $ANTLR start "rule__Gallery__Group__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:262:1: rule__Gallery__Group__1 : rule__Gallery__Group__1__Impl rule__Gallery__Group__2 ;
    public final void rule__Gallery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:266:1: ( rule__Gallery__Group__1__Impl rule__Gallery__Group__2 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:267:2: rule__Gallery__Group__1__Impl rule__Gallery__Group__2
            {
            pushFollow(FOLLOW_rule__Gallery__Group__1__Impl_in_rule__Gallery__Group__1483);
            rule__Gallery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__2_in_rule__Gallery__Group__1486);
            rule__Gallery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__1"


    // $ANTLR start "rule__Gallery__Group__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:274:1: rule__Gallery__Group__1__Impl : ( 'gallery' ) ;
    public final void rule__Gallery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:278:1: ( ( 'gallery' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:279:1: ( 'gallery' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:279:1: ( 'gallery' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:280:1: 'gallery'
            {
             before(grammarAccess.getGalleryAccess().getGalleryKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__Gallery__Group__1__Impl514); 
             after(grammarAccess.getGalleryAccess().getGalleryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__1__Impl"


    // $ANTLR start "rule__Gallery__Group__2"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:293:1: rule__Gallery__Group__2 : rule__Gallery__Group__2__Impl rule__Gallery__Group__3 ;
    public final void rule__Gallery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:297:1: ( rule__Gallery__Group__2__Impl rule__Gallery__Group__3 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:298:2: rule__Gallery__Group__2__Impl rule__Gallery__Group__3
            {
            pushFollow(FOLLOW_rule__Gallery__Group__2__Impl_in_rule__Gallery__Group__2545);
            rule__Gallery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__3_in_rule__Gallery__Group__2548);
            rule__Gallery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__2"


    // $ANTLR start "rule__Gallery__Group__2__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:305:1: rule__Gallery__Group__2__Impl : ( ( rule__Gallery__NameAssignment_2 ) ) ;
    public final void rule__Gallery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:309:1: ( ( ( rule__Gallery__NameAssignment_2 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:310:1: ( ( rule__Gallery__NameAssignment_2 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:310:1: ( ( rule__Gallery__NameAssignment_2 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:311:1: ( rule__Gallery__NameAssignment_2 )
            {
             before(grammarAccess.getGalleryAccess().getNameAssignment_2()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:312:1: ( rule__Gallery__NameAssignment_2 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:312:2: rule__Gallery__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Gallery__NameAssignment_2_in_rule__Gallery__Group__2__Impl575);
            rule__Gallery__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGalleryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__2__Impl"


    // $ANTLR start "rule__Gallery__Group__3"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:322:1: rule__Gallery__Group__3 : rule__Gallery__Group__3__Impl rule__Gallery__Group__4 ;
    public final void rule__Gallery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:326:1: ( rule__Gallery__Group__3__Impl rule__Gallery__Group__4 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:327:2: rule__Gallery__Group__3__Impl rule__Gallery__Group__4
            {
            pushFollow(FOLLOW_rule__Gallery__Group__3__Impl_in_rule__Gallery__Group__3605);
            rule__Gallery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__4_in_rule__Gallery__Group__3608);
            rule__Gallery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__3"


    // $ANTLR start "rule__Gallery__Group__3__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:334:1: rule__Gallery__Group__3__Impl : ( '{' ) ;
    public final void rule__Gallery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:338:1: ( ( '{' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:339:1: ( '{' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:339:1: ( '{' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:340:1: '{'
            {
             before(grammarAccess.getGalleryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Gallery__Group__3__Impl636); 
             after(grammarAccess.getGalleryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__3__Impl"


    // $ANTLR start "rule__Gallery__Group__4"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:353:1: rule__Gallery__Group__4 : rule__Gallery__Group__4__Impl rule__Gallery__Group__5 ;
    public final void rule__Gallery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:357:1: ( rule__Gallery__Group__4__Impl rule__Gallery__Group__5 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:358:2: rule__Gallery__Group__4__Impl rule__Gallery__Group__5
            {
            pushFollow(FOLLOW_rule__Gallery__Group__4__Impl_in_rule__Gallery__Group__4667);
            rule__Gallery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__5_in_rule__Gallery__Group__4670);
            rule__Gallery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__4"


    // $ANTLR start "rule__Gallery__Group__4__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:365:1: rule__Gallery__Group__4__Impl : ( ( rule__Gallery__Group_4__0 )? ) ;
    public final void rule__Gallery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:369:1: ( ( ( rule__Gallery__Group_4__0 )? ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:370:1: ( ( rule__Gallery__Group_4__0 )? )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:370:1: ( ( rule__Gallery__Group_4__0 )? )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:371:1: ( rule__Gallery__Group_4__0 )?
            {
             before(grammarAccess.getGalleryAccess().getGroup_4()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:372:1: ( rule__Gallery__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:372:2: rule__Gallery__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Gallery__Group_4__0_in_rule__Gallery__Group__4__Impl697);
                    rule__Gallery__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGalleryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__4__Impl"


    // $ANTLR start "rule__Gallery__Group__5"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:382:1: rule__Gallery__Group__5 : rule__Gallery__Group__5__Impl rule__Gallery__Group__6 ;
    public final void rule__Gallery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:386:1: ( rule__Gallery__Group__5__Impl rule__Gallery__Group__6 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:387:2: rule__Gallery__Group__5__Impl rule__Gallery__Group__6
            {
            pushFollow(FOLLOW_rule__Gallery__Group__5__Impl_in_rule__Gallery__Group__5728);
            rule__Gallery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group__6_in_rule__Gallery__Group__5731);
            rule__Gallery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__5"


    // $ANTLR start "rule__Gallery__Group__5__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:394:1: rule__Gallery__Group__5__Impl : ( ( rule__Gallery__Group_5__0 )* ) ;
    public final void rule__Gallery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:398:1: ( ( ( rule__Gallery__Group_5__0 )* ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:399:1: ( ( rule__Gallery__Group_5__0 )* )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:399:1: ( ( rule__Gallery__Group_5__0 )* )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:400:1: ( rule__Gallery__Group_5__0 )*
            {
             before(grammarAccess.getGalleryAccess().getGroup_5()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:401:1: ( rule__Gallery__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:401:2: rule__Gallery__Group_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Gallery__Group_5__0_in_rule__Gallery__Group__5__Impl758);
            	    rule__Gallery__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGalleryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__5__Impl"


    // $ANTLR start "rule__Gallery__Group__6"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:411:1: rule__Gallery__Group__6 : rule__Gallery__Group__6__Impl ;
    public final void rule__Gallery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:415:1: ( rule__Gallery__Group__6__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:416:2: rule__Gallery__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Gallery__Group__6__Impl_in_rule__Gallery__Group__6789);
            rule__Gallery__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__6"


    // $ANTLR start "rule__Gallery__Group__6__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:422:1: rule__Gallery__Group__6__Impl : ( '}' ) ;
    public final void rule__Gallery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:426:1: ( ( '}' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:427:1: ( '}' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:427:1: ( '}' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:428:1: '}'
            {
             before(grammarAccess.getGalleryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Gallery__Group__6__Impl817); 
             after(grammarAccess.getGalleryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group__6__Impl"


    // $ANTLR start "rule__Gallery__Group_4__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:455:1: rule__Gallery__Group_4__0 : rule__Gallery__Group_4__0__Impl rule__Gallery__Group_4__1 ;
    public final void rule__Gallery__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:459:1: ( rule__Gallery__Group_4__0__Impl rule__Gallery__Group_4__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:460:2: rule__Gallery__Group_4__0__Impl rule__Gallery__Group_4__1
            {
            pushFollow(FOLLOW_rule__Gallery__Group_4__0__Impl_in_rule__Gallery__Group_4__0862);
            rule__Gallery__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group_4__1_in_rule__Gallery__Group_4__0865);
            rule__Gallery__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_4__0"


    // $ANTLR start "rule__Gallery__Group_4__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:467:1: rule__Gallery__Group_4__0__Impl : ( 'description' ) ;
    public final void rule__Gallery__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:471:1: ( ( 'description' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:472:1: ( 'description' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:472:1: ( 'description' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:473:1: 'description'
            {
             before(grammarAccess.getGalleryAccess().getDescriptionKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__Gallery__Group_4__0__Impl893); 
             after(grammarAccess.getGalleryAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_4__0__Impl"


    // $ANTLR start "rule__Gallery__Group_4__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:486:1: rule__Gallery__Group_4__1 : rule__Gallery__Group_4__1__Impl ;
    public final void rule__Gallery__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:490:1: ( rule__Gallery__Group_4__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:491:2: rule__Gallery__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Gallery__Group_4__1__Impl_in_rule__Gallery__Group_4__1924);
            rule__Gallery__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_4__1"


    // $ANTLR start "rule__Gallery__Group_4__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:497:1: rule__Gallery__Group_4__1__Impl : ( ( rule__Gallery__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Gallery__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:501:1: ( ( ( rule__Gallery__DescriptionAssignment_4_1 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:502:1: ( ( rule__Gallery__DescriptionAssignment_4_1 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:502:1: ( ( rule__Gallery__DescriptionAssignment_4_1 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:503:1: ( rule__Gallery__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getGalleryAccess().getDescriptionAssignment_4_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:504:1: ( rule__Gallery__DescriptionAssignment_4_1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:504:2: rule__Gallery__DescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Gallery__DescriptionAssignment_4_1_in_rule__Gallery__Group_4__1__Impl951);
            rule__Gallery__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGalleryAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_4__1__Impl"


    // $ANTLR start "rule__Gallery__Group_5__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:518:1: rule__Gallery__Group_5__0 : rule__Gallery__Group_5__0__Impl rule__Gallery__Group_5__1 ;
    public final void rule__Gallery__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:522:1: ( rule__Gallery__Group_5__0__Impl rule__Gallery__Group_5__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:523:2: rule__Gallery__Group_5__0__Impl rule__Gallery__Group_5__1
            {
            pushFollow(FOLLOW_rule__Gallery__Group_5__0__Impl_in_rule__Gallery__Group_5__0985);
            rule__Gallery__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Gallery__Group_5__1_in_rule__Gallery__Group_5__0988);
            rule__Gallery__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_5__0"


    // $ANTLR start "rule__Gallery__Group_5__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:530:1: rule__Gallery__Group_5__0__Impl : ( 'photo' ) ;
    public final void rule__Gallery__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:534:1: ( ( 'photo' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:535:1: ( 'photo' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:535:1: ( 'photo' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:536:1: 'photo'
            {
             before(grammarAccess.getGalleryAccess().getPhotoKeyword_5_0()); 
            match(input,15,FOLLOW_15_in_rule__Gallery__Group_5__0__Impl1016); 
             after(grammarAccess.getGalleryAccess().getPhotoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_5__0__Impl"


    // $ANTLR start "rule__Gallery__Group_5__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:549:1: rule__Gallery__Group_5__1 : rule__Gallery__Group_5__1__Impl ;
    public final void rule__Gallery__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:553:1: ( rule__Gallery__Group_5__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:554:2: rule__Gallery__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Gallery__Group_5__1__Impl_in_rule__Gallery__Group_5__11047);
            rule__Gallery__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_5__1"


    // $ANTLR start "rule__Gallery__Group_5__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:560:1: rule__Gallery__Group_5__1__Impl : ( ( rule__Gallery__PhotosAssignment_5_1 ) ) ;
    public final void rule__Gallery__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:564:1: ( ( ( rule__Gallery__PhotosAssignment_5_1 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:565:1: ( ( rule__Gallery__PhotosAssignment_5_1 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:565:1: ( ( rule__Gallery__PhotosAssignment_5_1 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:566:1: ( rule__Gallery__PhotosAssignment_5_1 )
            {
             before(grammarAccess.getGalleryAccess().getPhotosAssignment_5_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:567:1: ( rule__Gallery__PhotosAssignment_5_1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:567:2: rule__Gallery__PhotosAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Gallery__PhotosAssignment_5_1_in_rule__Gallery__Group_5__1__Impl1074);
            rule__Gallery__PhotosAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGalleryAccess().getPhotosAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__Group_5__1__Impl"


    // $ANTLR start "rule__Photo__Group__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:581:1: rule__Photo__Group__0 : rule__Photo__Group__0__Impl rule__Photo__Group__1 ;
    public final void rule__Photo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:585:1: ( rule__Photo__Group__0__Impl rule__Photo__Group__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:586:2: rule__Photo__Group__0__Impl rule__Photo__Group__1
            {
            pushFollow(FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__01108);
            rule__Photo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__01111);
            rule__Photo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0"


    // $ANTLR start "rule__Photo__Group__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:593:1: rule__Photo__Group__0__Impl : ( () ) ;
    public final void rule__Photo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:597:1: ( ( () ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:598:1: ( () )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:598:1: ( () )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:599:1: ()
            {
             before(grammarAccess.getPhotoAccess().getPhotoAction_0()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:600:1: ()
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:602:1: 
            {
            }

             after(grammarAccess.getPhotoAccess().getPhotoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__0__Impl"


    // $ANTLR start "rule__Photo__Group__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:612:1: rule__Photo__Group__1 : rule__Photo__Group__1__Impl rule__Photo__Group__2 ;
    public final void rule__Photo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:616:1: ( rule__Photo__Group__1__Impl rule__Photo__Group__2 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:617:2: rule__Photo__Group__1__Impl rule__Photo__Group__2
            {
            pushFollow(FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__11169);
            rule__Photo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__11172);
            rule__Photo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1"


    // $ANTLR start "rule__Photo__Group__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:624:1: rule__Photo__Group__1__Impl : ( 'photo' ) ;
    public final void rule__Photo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:628:1: ( ( 'photo' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:629:1: ( 'photo' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:629:1: ( 'photo' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:630:1: 'photo'
            {
             before(grammarAccess.getPhotoAccess().getPhotoKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Photo__Group__1__Impl1200); 
             after(grammarAccess.getPhotoAccess().getPhotoKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__1__Impl"


    // $ANTLR start "rule__Photo__Group__2"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:643:1: rule__Photo__Group__2 : rule__Photo__Group__2__Impl rule__Photo__Group__3 ;
    public final void rule__Photo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:647:1: ( rule__Photo__Group__2__Impl rule__Photo__Group__3 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:648:2: rule__Photo__Group__2__Impl rule__Photo__Group__3
            {
            pushFollow(FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__21231);
            rule__Photo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__21234);
            rule__Photo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__2"


    // $ANTLR start "rule__Photo__Group__2__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:655:1: rule__Photo__Group__2__Impl : ( ( rule__Photo__NameAssignment_2 ) ) ;
    public final void rule__Photo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:659:1: ( ( ( rule__Photo__NameAssignment_2 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:660:1: ( ( rule__Photo__NameAssignment_2 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:660:1: ( ( rule__Photo__NameAssignment_2 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:661:1: ( rule__Photo__NameAssignment_2 )
            {
             before(grammarAccess.getPhotoAccess().getNameAssignment_2()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:662:1: ( rule__Photo__NameAssignment_2 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:662:2: rule__Photo__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Photo__NameAssignment_2_in_rule__Photo__Group__2__Impl1261);
            rule__Photo__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__2__Impl"


    // $ANTLR start "rule__Photo__Group__3"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:672:1: rule__Photo__Group__3 : rule__Photo__Group__3__Impl rule__Photo__Group__4 ;
    public final void rule__Photo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:676:1: ( rule__Photo__Group__3__Impl rule__Photo__Group__4 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:677:2: rule__Photo__Group__3__Impl rule__Photo__Group__4
            {
            pushFollow(FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__31291);
            rule__Photo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__31294);
            rule__Photo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__3"


    // $ANTLR start "rule__Photo__Group__3__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:684:1: rule__Photo__Group__3__Impl : ( '{' ) ;
    public final void rule__Photo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:688:1: ( ( '{' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:689:1: ( '{' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:689:1: ( '{' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:690:1: '{'
            {
             before(grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_12_in_rule__Photo__Group__3__Impl1322); 
             after(grammarAccess.getPhotoAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__3__Impl"


    // $ANTLR start "rule__Photo__Group__4"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:703:1: rule__Photo__Group__4 : rule__Photo__Group__4__Impl rule__Photo__Group__5 ;
    public final void rule__Photo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:707:1: ( rule__Photo__Group__4__Impl rule__Photo__Group__5 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:708:2: rule__Photo__Group__4__Impl rule__Photo__Group__5
            {
            pushFollow(FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__41353);
            rule__Photo__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__41356);
            rule__Photo__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__4"


    // $ANTLR start "rule__Photo__Group__4__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:715:1: rule__Photo__Group__4__Impl : ( ( rule__Photo__Group_4__0 )? ) ;
    public final void rule__Photo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:719:1: ( ( ( rule__Photo__Group_4__0 )? ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:720:1: ( ( rule__Photo__Group_4__0 )? )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:720:1: ( ( rule__Photo__Group_4__0 )? )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:721:1: ( rule__Photo__Group_4__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_4()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:722:1: ( rule__Photo__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:722:2: rule__Photo__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl1383);
                    rule__Photo__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhotoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__4__Impl"


    // $ANTLR start "rule__Photo__Group__5"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:732:1: rule__Photo__Group__5 : rule__Photo__Group__5__Impl rule__Photo__Group__6 ;
    public final void rule__Photo__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:736:1: ( rule__Photo__Group__5__Impl rule__Photo__Group__6 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:737:2: rule__Photo__Group__5__Impl rule__Photo__Group__6
            {
            pushFollow(FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__51414);
            rule__Photo__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__51417);
            rule__Photo__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__5"


    // $ANTLR start "rule__Photo__Group__5__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:744:1: rule__Photo__Group__5__Impl : ( ( rule__Photo__Group_5__0 )? ) ;
    public final void rule__Photo__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:748:1: ( ( ( rule__Photo__Group_5__0 )? ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:749:1: ( ( rule__Photo__Group_5__0 )? )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:749:1: ( ( rule__Photo__Group_5__0 )? )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:750:1: ( rule__Photo__Group_5__0 )?
            {
             before(grammarAccess.getPhotoAccess().getGroup_5()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:751:1: ( rule__Photo__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:751:2: rule__Photo__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl1444);
                    rule__Photo__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPhotoAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__5__Impl"


    // $ANTLR start "rule__Photo__Group__6"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:761:1: rule__Photo__Group__6 : rule__Photo__Group__6__Impl rule__Photo__Group__7 ;
    public final void rule__Photo__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:765:1: ( rule__Photo__Group__6__Impl rule__Photo__Group__7 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:766:2: rule__Photo__Group__6__Impl rule__Photo__Group__7
            {
            pushFollow(FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__61475);
            rule__Photo__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group__7_in_rule__Photo__Group__61478);
            rule__Photo__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__6"


    // $ANTLR start "rule__Photo__Group__6__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:773:1: rule__Photo__Group__6__Impl : ( ( rule__Photo__Group_6__0 )* ) ;
    public final void rule__Photo__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:777:1: ( ( ( rule__Photo__Group_6__0 )* ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:778:1: ( ( rule__Photo__Group_6__0 )* )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:778:1: ( ( rule__Photo__Group_6__0 )* )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:779:1: ( rule__Photo__Group_6__0 )*
            {
             before(grammarAccess.getPhotoAccess().getGroup_6()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:780:1: ( rule__Photo__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:780:2: rule__Photo__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Photo__Group_6__0_in_rule__Photo__Group__6__Impl1505);
            	    rule__Photo__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPhotoAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__6__Impl"


    // $ANTLR start "rule__Photo__Group__7"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:790:1: rule__Photo__Group__7 : rule__Photo__Group__7__Impl ;
    public final void rule__Photo__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:794:1: ( rule__Photo__Group__7__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:795:2: rule__Photo__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Photo__Group__7__Impl_in_rule__Photo__Group__71536);
            rule__Photo__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__7"


    // $ANTLR start "rule__Photo__Group__7__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:801:1: rule__Photo__Group__7__Impl : ( '}' ) ;
    public final void rule__Photo__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:805:1: ( ( '}' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:806:1: ( '}' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:806:1: ( '}' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:807:1: '}'
            {
             before(grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_13_in_rule__Photo__Group__7__Impl1564); 
             after(grammarAccess.getPhotoAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group__7__Impl"


    // $ANTLR start "rule__Photo__Group_4__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:836:1: rule__Photo__Group_4__0 : rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 ;
    public final void rule__Photo__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:840:1: ( rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:841:2: rule__Photo__Group_4__0__Impl rule__Photo__Group_4__1
            {
            pushFollow(FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__01611);
            rule__Photo__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__01614);
            rule__Photo__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__0"


    // $ANTLR start "rule__Photo__Group_4__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:848:1: rule__Photo__Group_4__0__Impl : ( 'url' ) ;
    public final void rule__Photo__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:852:1: ( ( 'url' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:853:1: ( 'url' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:853:1: ( 'url' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:854:1: 'url'
            {
             before(grammarAccess.getPhotoAccess().getUrlKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Photo__Group_4__0__Impl1642); 
             after(grammarAccess.getPhotoAccess().getUrlKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__0__Impl"


    // $ANTLR start "rule__Photo__Group_4__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:867:1: rule__Photo__Group_4__1 : rule__Photo__Group_4__1__Impl ;
    public final void rule__Photo__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:871:1: ( rule__Photo__Group_4__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:872:2: rule__Photo__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__11673);
            rule__Photo__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__1"


    // $ANTLR start "rule__Photo__Group_4__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:878:1: rule__Photo__Group_4__1__Impl : ( ( rule__Photo__UriAssignment_4_1 ) ) ;
    public final void rule__Photo__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:882:1: ( ( ( rule__Photo__UriAssignment_4_1 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:883:1: ( ( rule__Photo__UriAssignment_4_1 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:883:1: ( ( rule__Photo__UriAssignment_4_1 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:884:1: ( rule__Photo__UriAssignment_4_1 )
            {
             before(grammarAccess.getPhotoAccess().getUriAssignment_4_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:885:1: ( rule__Photo__UriAssignment_4_1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:885:2: rule__Photo__UriAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Photo__UriAssignment_4_1_in_rule__Photo__Group_4__1__Impl1700);
            rule__Photo__UriAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getUriAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_4__1__Impl"


    // $ANTLR start "rule__Photo__Group_5__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:899:1: rule__Photo__Group_5__0 : rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 ;
    public final void rule__Photo__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:903:1: ( rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:904:2: rule__Photo__Group_5__0__Impl rule__Photo__Group_5__1
            {
            pushFollow(FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__01734);
            rule__Photo__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__01737);
            rule__Photo__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__0"


    // $ANTLR start "rule__Photo__Group_5__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:911:1: rule__Photo__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Photo__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:915:1: ( ( 'description' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:916:1: ( 'description' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:916:1: ( 'description' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:917:1: 'description'
            {
             before(grammarAccess.getPhotoAccess().getDescriptionKeyword_5_0()); 
            match(input,14,FOLLOW_14_in_rule__Photo__Group_5__0__Impl1765); 
             after(grammarAccess.getPhotoAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__0__Impl"


    // $ANTLR start "rule__Photo__Group_5__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:930:1: rule__Photo__Group_5__1 : rule__Photo__Group_5__1__Impl ;
    public final void rule__Photo__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:934:1: ( rule__Photo__Group_5__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:935:2: rule__Photo__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__11796);
            rule__Photo__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__1"


    // $ANTLR start "rule__Photo__Group_5__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:941:1: rule__Photo__Group_5__1__Impl : ( ( rule__Photo__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Photo__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:945:1: ( ( ( rule__Photo__DescriptionAssignment_5_1 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:946:1: ( ( rule__Photo__DescriptionAssignment_5_1 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:946:1: ( ( rule__Photo__DescriptionAssignment_5_1 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:947:1: ( rule__Photo__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getPhotoAccess().getDescriptionAssignment_5_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:948:1: ( rule__Photo__DescriptionAssignment_5_1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:948:2: rule__Photo__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Photo__DescriptionAssignment_5_1_in_rule__Photo__Group_5__1__Impl1823);
            rule__Photo__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_5__1__Impl"


    // $ANTLR start "rule__Photo__Group_6__0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:962:1: rule__Photo__Group_6__0 : rule__Photo__Group_6__0__Impl rule__Photo__Group_6__1 ;
    public final void rule__Photo__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:966:1: ( rule__Photo__Group_6__0__Impl rule__Photo__Group_6__1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:967:2: rule__Photo__Group_6__0__Impl rule__Photo__Group_6__1
            {
            pushFollow(FOLLOW_rule__Photo__Group_6__0__Impl_in_rule__Photo__Group_6__01857);
            rule__Photo__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Photo__Group_6__1_in_rule__Photo__Group_6__01860);
            rule__Photo__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_6__0"


    // $ANTLR start "rule__Photo__Group_6__0__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:974:1: rule__Photo__Group_6__0__Impl : ( 'tag' ) ;
    public final void rule__Photo__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:978:1: ( ( 'tag' ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:979:1: ( 'tag' )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:979:1: ( 'tag' )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:980:1: 'tag'
            {
             before(grammarAccess.getPhotoAccess().getTagKeyword_6_0()); 
            match(input,17,FOLLOW_17_in_rule__Photo__Group_6__0__Impl1888); 
             after(grammarAccess.getPhotoAccess().getTagKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_6__0__Impl"


    // $ANTLR start "rule__Photo__Group_6__1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:993:1: rule__Photo__Group_6__1 : rule__Photo__Group_6__1__Impl ;
    public final void rule__Photo__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:997:1: ( rule__Photo__Group_6__1__Impl )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:998:2: rule__Photo__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Photo__Group_6__1__Impl_in_rule__Photo__Group_6__11919);
            rule__Photo__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_6__1"


    // $ANTLR start "rule__Photo__Group_6__1__Impl"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1004:1: rule__Photo__Group_6__1__Impl : ( ( rule__Photo__TagsAssignment_6_1 ) ) ;
    public final void rule__Photo__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1008:1: ( ( ( rule__Photo__TagsAssignment_6_1 ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1009:1: ( ( rule__Photo__TagsAssignment_6_1 ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1009:1: ( ( rule__Photo__TagsAssignment_6_1 ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1010:1: ( rule__Photo__TagsAssignment_6_1 )
            {
             before(grammarAccess.getPhotoAccess().getTagsAssignment_6_1()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1011:1: ( rule__Photo__TagsAssignment_6_1 )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1011:2: rule__Photo__TagsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Photo__TagsAssignment_6_1_in_rule__Photo__Group_6__1__Impl1946);
            rule__Photo__TagsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPhotoAccess().getTagsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__Group_6__1__Impl"


    // $ANTLR start "rule__Site__PhotosAssignment_1_0"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1026:1: rule__Site__PhotosAssignment_1_0 : ( rulePhoto ) ;
    public final void rule__Site__PhotosAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1030:1: ( ( rulePhoto ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1031:1: ( rulePhoto )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1031:1: ( rulePhoto )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1032:1: rulePhoto
            {
             before(grammarAccess.getSiteAccess().getPhotosPhotoParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_rulePhoto_in_rule__Site__PhotosAssignment_1_01985);
            rulePhoto();

            state._fsp--;

             after(grammarAccess.getSiteAccess().getPhotosPhotoParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__PhotosAssignment_1_0"


    // $ANTLR start "rule__Site__GalleriesAssignment_1_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1041:1: rule__Site__GalleriesAssignment_1_1 : ( ruleGallery ) ;
    public final void rule__Site__GalleriesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1045:1: ( ( ruleGallery ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1046:1: ( ruleGallery )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1046:1: ( ruleGallery )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1047:1: ruleGallery
            {
             before(grammarAccess.getSiteAccess().getGalleriesGalleryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleGallery_in_rule__Site__GalleriesAssignment_1_12016);
            ruleGallery();

            state._fsp--;

             after(grammarAccess.getSiteAccess().getGalleriesGalleryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Site__GalleriesAssignment_1_1"


    // $ANTLR start "rule__Gallery__NameAssignment_2"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1056:1: rule__Gallery__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Gallery__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1060:1: ( ( RULE_ID ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1061:1: ( RULE_ID )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1061:1: ( RULE_ID )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1062:1: RULE_ID
            {
             before(grammarAccess.getGalleryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Gallery__NameAssignment_22047); 
             after(grammarAccess.getGalleryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__NameAssignment_2"


    // $ANTLR start "rule__Gallery__DescriptionAssignment_4_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1071:1: rule__Gallery__DescriptionAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Gallery__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1075:1: ( ( RULE_STRING ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1076:1: ( RULE_STRING )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1076:1: ( RULE_STRING )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1077:1: RULE_STRING
            {
             before(grammarAccess.getGalleryAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Gallery__DescriptionAssignment_4_12078); 
             after(grammarAccess.getGalleryAccess().getDescriptionSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Gallery__PhotosAssignment_5_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1086:1: rule__Gallery__PhotosAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Gallery__PhotosAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1090:1: ( ( ( RULE_ID ) ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1091:1: ( ( RULE_ID ) )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1091:1: ( ( RULE_ID ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1092:1: ( RULE_ID )
            {
             before(grammarAccess.getGalleryAccess().getPhotosPhotoCrossReference_5_1_0()); 
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1093:1: ( RULE_ID )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1094:1: RULE_ID
            {
             before(grammarAccess.getGalleryAccess().getPhotosPhotoIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Gallery__PhotosAssignment_5_12113); 
             after(grammarAccess.getGalleryAccess().getPhotosPhotoIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getGalleryAccess().getPhotosPhotoCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gallery__PhotosAssignment_5_1"


    // $ANTLR start "rule__Photo__NameAssignment_2"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1105:1: rule__Photo__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Photo__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1109:1: ( ( RULE_ID ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1110:1: ( RULE_ID )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1110:1: ( RULE_ID )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1111:1: RULE_ID
            {
             before(grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Photo__NameAssignment_22148); 
             after(grammarAccess.getPhotoAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__NameAssignment_2"


    // $ANTLR start "rule__Photo__UriAssignment_4_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1120:1: rule__Photo__UriAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Photo__UriAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1124:1: ( ( RULE_STRING ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1125:1: ( RULE_STRING )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1125:1: ( RULE_STRING )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1126:1: RULE_STRING
            {
             before(grammarAccess.getPhotoAccess().getUriSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Photo__UriAssignment_4_12179); 
             after(grammarAccess.getPhotoAccess().getUriSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__UriAssignment_4_1"


    // $ANTLR start "rule__Photo__DescriptionAssignment_5_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1135:1: rule__Photo__DescriptionAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Photo__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1139:1: ( ( RULE_STRING ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1140:1: ( RULE_STRING )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1140:1: ( RULE_STRING )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1141:1: RULE_STRING
            {
             before(grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Photo__DescriptionAssignment_5_12210); 
             after(grammarAccess.getPhotoAccess().getDescriptionSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Photo__TagsAssignment_6_1"
    // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1150:1: rule__Photo__TagsAssignment_6_1 : ( RULE_STRING ) ;
    public final void rule__Photo__TagsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1154:1: ( ( RULE_STRING ) )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1155:1: ( RULE_STRING )
            {
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1155:1: ( RULE_STRING )
            // ../com.hsveclipse.phototoolkit.dsl.ui/src-gen/com/hsveclipse/phototoolkit/ui/contentassist/antlr/internal/InternalDLS.g:1156:1: RULE_STRING
            {
             before(grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Photo__TagsAssignment_6_12241); 
             after(grammarAccess.getPhotoAccess().getTagsSTRINGTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Photo__TagsAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSite_in_entryRuleSite61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSite68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__Group__0_in_ruleSite94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGallery_in_entryRuleGallery121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGallery128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__0_in_ruleGallery154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhoto_in_entryRulePhoto181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhoto188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__0_in_rulePhoto214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__PhotosAssignment_1_0_in_rule__Site__Alternatives_1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__GalleriesAssignment_1_1_in_rule__Site__Alternatives_1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__Group__0__Impl_in_rule__Site__Group__0299 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Site__Group__1_in_rule__Site__Group__0302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__Group__1__Impl_in_rule__Site__Group__1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Site__Alternatives_1_in_rule__Site__Group__1__Impl387 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_rule__Gallery__Group__0__Impl_in_rule__Gallery__Group__0422 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_rule__Gallery__Group__1_in_rule__Gallery__Group__0425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__1__Impl_in_rule__Gallery__Group__1483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gallery__Group__2_in_rule__Gallery__Group__1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Gallery__Group__1__Impl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__2__Impl_in_rule__Gallery__Group__2545 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Gallery__Group__3_in_rule__Gallery__Group__2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__NameAssignment_2_in_rule__Gallery__Group__2__Impl575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__3__Impl_in_rule__Gallery__Group__3605 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__Gallery__Group__4_in_rule__Gallery__Group__3608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Gallery__Group__3__Impl636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__4__Impl_in_rule__Gallery__Group__4667 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__Gallery__Group__5_in_rule__Gallery__Group__4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_4__0_in_rule__Gallery__Group__4__Impl697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__5__Impl_in_rule__Gallery__Group__5728 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_rule__Gallery__Group__6_in_rule__Gallery__Group__5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_5__0_in_rule__Gallery__Group__5__Impl758 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Gallery__Group__6__Impl_in_rule__Gallery__Group__6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Gallery__Group__6__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_4__0__Impl_in_rule__Gallery__Group_4__0862 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Gallery__Group_4__1_in_rule__Gallery__Group_4__0865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Gallery__Group_4__0__Impl893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_4__1__Impl_in_rule__Gallery__Group_4__1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__DescriptionAssignment_4_1_in_rule__Gallery__Group_4__1__Impl951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_5__0__Impl_in_rule__Gallery__Group_5__0985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Gallery__Group_5__1_in_rule__Gallery__Group_5__0988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Gallery__Group_5__0__Impl1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__Group_5__1__Impl_in_rule__Gallery__Group_5__11047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Gallery__PhotosAssignment_5_1_in_rule__Gallery__Group_5__1__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__0__Impl_in_rule__Photo__Group__01108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Photo__Group__1_in_rule__Photo__Group__01111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__1__Impl_in_rule__Photo__Group__11169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Photo__Group__2_in_rule__Photo__Group__11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Photo__Group__1__Impl1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__2__Impl_in_rule__Photo__Group__21231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Photo__Group__3_in_rule__Photo__Group__21234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__NameAssignment_2_in_rule__Photo__Group__2__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__3__Impl_in_rule__Photo__Group__31291 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_rule__Photo__Group__4_in_rule__Photo__Group__31294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Photo__Group__3__Impl1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__4__Impl_in_rule__Photo__Group__41353 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_rule__Photo__Group__5_in_rule__Photo__Group__41356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_4__0_in_rule__Photo__Group__4__Impl1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__5__Impl_in_rule__Photo__Group__51414 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_rule__Photo__Group__6_in_rule__Photo__Group__51417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_5__0_in_rule__Photo__Group__5__Impl1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group__6__Impl_in_rule__Photo__Group__61475 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_rule__Photo__Group__7_in_rule__Photo__Group__61478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_6__0_in_rule__Photo__Group__6__Impl1505 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Photo__Group__7__Impl_in_rule__Photo__Group__71536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Photo__Group__7__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_4__0__Impl_in_rule__Photo__Group_4__01611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Photo__Group_4__1_in_rule__Photo__Group_4__01614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Photo__Group_4__0__Impl1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_4__1__Impl_in_rule__Photo__Group_4__11673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__UriAssignment_4_1_in_rule__Photo__Group_4__1__Impl1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_5__0__Impl_in_rule__Photo__Group_5__01734 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Photo__Group_5__1_in_rule__Photo__Group_5__01737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Photo__Group_5__0__Impl1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_5__1__Impl_in_rule__Photo__Group_5__11796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__DescriptionAssignment_5_1_in_rule__Photo__Group_5__1__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_6__0__Impl_in_rule__Photo__Group_6__01857 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Photo__Group_6__1_in_rule__Photo__Group_6__01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Photo__Group_6__0__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__Group_6__1__Impl_in_rule__Photo__Group_6__11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Photo__TagsAssignment_6_1_in_rule__Photo__Group_6__1__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhoto_in_rule__Site__PhotosAssignment_1_01985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGallery_in_rule__Site__GalleriesAssignment_1_12016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Gallery__NameAssignment_22047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Gallery__DescriptionAssignment_4_12078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Gallery__PhotosAssignment_5_12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Photo__NameAssignment_22148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Photo__UriAssignment_4_12179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Photo__DescriptionAssignment_5_12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Photo__TagsAssignment_6_12241 = new BitSet(new long[]{0x0000000000000002L});

}