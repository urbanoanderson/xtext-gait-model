package org.xtext.example.avante.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.avante.services.PrescriptionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrescriptionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prescription'", "'{'", "'}'", "':'", "'Integer'", "','", "'['", "'-'", "']'", "'String'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPrescriptionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPrescriptionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPrescriptionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPrescription.g"; }


    	private PrescriptionGrammarAccess grammarAccess;

    	public void setGrammarAccess(PrescriptionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModel"
    // InternalPrescription.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalPrescription.g:54:1: ( ruleDomainModel EOF )
            // InternalPrescription.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalPrescription.g:62:1: ruleDomainModel : ( ( rule__DomainModel__ElementsAssignment )* ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:66:2: ( ( ( rule__DomainModel__ElementsAssignment )* ) )
            // InternalPrescription.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            {
            // InternalPrescription.g:67:2: ( ( rule__DomainModel__ElementsAssignment )* )
            // InternalPrescription.g:68:3: ( rule__DomainModel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainModelAccess().getElementsAssignment()); 
            // InternalPrescription.g:69:3: ( rule__DomainModel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPrescription.g:69:4: rule__DomainModel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__DomainModel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRulePrescription"
    // InternalPrescription.g:78:1: entryRulePrescription : rulePrescription EOF ;
    public final void entryRulePrescription() throws RecognitionException {
        try {
            // InternalPrescription.g:79:1: ( rulePrescription EOF )
            // InternalPrescription.g:80:1: rulePrescription EOF
            {
             before(grammarAccess.getPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            rulePrescription();

            state._fsp--;

             after(grammarAccess.getPrescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrescription"


    // $ANTLR start "rulePrescription"
    // InternalPrescription.g:87:1: rulePrescription : ( ( rule__Prescription__Group__0 ) ) ;
    public final void rulePrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:91:2: ( ( ( rule__Prescription__Group__0 ) ) )
            // InternalPrescription.g:92:2: ( ( rule__Prescription__Group__0 ) )
            {
            // InternalPrescription.g:92:2: ( ( rule__Prescription__Group__0 ) )
            // InternalPrescription.g:93:3: ( rule__Prescription__Group__0 )
            {
             before(grammarAccess.getPrescriptionAccess().getGroup()); 
            // InternalPrescription.g:94:3: ( rule__Prescription__Group__0 )
            // InternalPrescription.g:94:4: rule__Prescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Prescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptionAccess().getGroup()); 

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
    // $ANTLR end "rulePrescription"


    // $ANTLR start "entryRuleAttribute"
    // InternalPrescription.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalPrescription.g:104:1: ( ruleAttribute EOF )
            // InternalPrescription.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPrescription.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalPrescription.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalPrescription.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalPrescription.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalPrescription.g:119:3: ( rule__Attribute__Group__0 )
            // InternalPrescription.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeParams"
    // InternalPrescription.g:128:1: entryRuleAttributeParams : ruleAttributeParams EOF ;
    public final void entryRuleAttributeParams() throws RecognitionException {
        try {
            // InternalPrescription.g:129:1: ( ruleAttributeParams EOF )
            // InternalPrescription.g:130:1: ruleAttributeParams EOF
            {
             before(grammarAccess.getAttributeParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeParams();

            state._fsp--;

             after(grammarAccess.getAttributeParamsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeParams"


    // $ANTLR start "ruleAttributeParams"
    // InternalPrescription.g:137:1: ruleAttributeParams : ( ( rule__AttributeParams__Alternatives ) ) ;
    public final void ruleAttributeParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:141:2: ( ( ( rule__AttributeParams__Alternatives ) ) )
            // InternalPrescription.g:142:2: ( ( rule__AttributeParams__Alternatives ) )
            {
            // InternalPrescription.g:142:2: ( ( rule__AttributeParams__Alternatives ) )
            // InternalPrescription.g:143:3: ( rule__AttributeParams__Alternatives )
            {
             before(grammarAccess.getAttributeParamsAccess().getAlternatives()); 
            // InternalPrescription.g:144:3: ( rule__AttributeParams__Alternatives )
            // InternalPrescription.g:144:4: rule__AttributeParams__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AttributeParams__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeParamsAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAttributeParams"


    // $ANTLR start "entryRuleIntegerParams"
    // InternalPrescription.g:153:1: entryRuleIntegerParams : ruleIntegerParams EOF ;
    public final void entryRuleIntegerParams() throws RecognitionException {
        try {
            // InternalPrescription.g:154:1: ( ruleIntegerParams EOF )
            // InternalPrescription.g:155:1: ruleIntegerParams EOF
            {
             before(grammarAccess.getIntegerParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerParams();

            state._fsp--;

             after(grammarAccess.getIntegerParamsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerParams"


    // $ANTLR start "ruleIntegerParams"
    // InternalPrescription.g:162:1: ruleIntegerParams : ( ( rule__IntegerParams__Group__0 ) ) ;
    public final void ruleIntegerParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:166:2: ( ( ( rule__IntegerParams__Group__0 ) ) )
            // InternalPrescription.g:167:2: ( ( rule__IntegerParams__Group__0 ) )
            {
            // InternalPrescription.g:167:2: ( ( rule__IntegerParams__Group__0 ) )
            // InternalPrescription.g:168:3: ( rule__IntegerParams__Group__0 )
            {
             before(grammarAccess.getIntegerParamsAccess().getGroup()); 
            // InternalPrescription.g:169:3: ( rule__IntegerParams__Group__0 )
            // InternalPrescription.g:169:4: rule__IntegerParams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParamsAccess().getGroup()); 

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
    // $ANTLR end "ruleIntegerParams"


    // $ANTLR start "entryRuleStringParams"
    // InternalPrescription.g:178:1: entryRuleStringParams : ruleStringParams EOF ;
    public final void entryRuleStringParams() throws RecognitionException {
        try {
            // InternalPrescription.g:179:1: ( ruleStringParams EOF )
            // InternalPrescription.g:180:1: ruleStringParams EOF
            {
             before(grammarAccess.getStringParamsRule()); 
            pushFollow(FOLLOW_1);
            ruleStringParams();

            state._fsp--;

             after(grammarAccess.getStringParamsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringParams"


    // $ANTLR start "ruleStringParams"
    // InternalPrescription.g:187:1: ruleStringParams : ( ( rule__StringParams__Group__0 ) ) ;
    public final void ruleStringParams() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:191:2: ( ( ( rule__StringParams__Group__0 ) ) )
            // InternalPrescription.g:192:2: ( ( rule__StringParams__Group__0 ) )
            {
            // InternalPrescription.g:192:2: ( ( rule__StringParams__Group__0 ) )
            // InternalPrescription.g:193:3: ( rule__StringParams__Group__0 )
            {
             before(grammarAccess.getStringParamsAccess().getGroup()); 
            // InternalPrescription.g:194:3: ( rule__StringParams__Group__0 )
            // InternalPrescription.g:194:4: rule__StringParams__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringParams__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringParamsAccess().getGroup()); 

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
    // $ANTLR end "ruleStringParams"


    // $ANTLR start "rule__AttributeParams__Alternatives"
    // InternalPrescription.g:202:1: rule__AttributeParams__Alternatives : ( ( ( rule__AttributeParams__IntParamsAssignment_0 ) ) | ( ( rule__AttributeParams__StrParamsAssignment_1 ) ) );
    public final void rule__AttributeParams__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:206:1: ( ( ( rule__AttributeParams__IntParamsAssignment_0 ) ) | ( ( rule__AttributeParams__StrParamsAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPrescription.g:207:2: ( ( rule__AttributeParams__IntParamsAssignment_0 ) )
                    {
                    // InternalPrescription.g:207:2: ( ( rule__AttributeParams__IntParamsAssignment_0 ) )
                    // InternalPrescription.g:208:3: ( rule__AttributeParams__IntParamsAssignment_0 )
                    {
                     before(grammarAccess.getAttributeParamsAccess().getIntParamsAssignment_0()); 
                    // InternalPrescription.g:209:3: ( rule__AttributeParams__IntParamsAssignment_0 )
                    // InternalPrescription.g:209:4: rule__AttributeParams__IntParamsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeParams__IntParamsAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeParamsAccess().getIntParamsAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPrescription.g:213:2: ( ( rule__AttributeParams__StrParamsAssignment_1 ) )
                    {
                    // InternalPrescription.g:213:2: ( ( rule__AttributeParams__StrParamsAssignment_1 ) )
                    // InternalPrescription.g:214:3: ( rule__AttributeParams__StrParamsAssignment_1 )
                    {
                     before(grammarAccess.getAttributeParamsAccess().getStrParamsAssignment_1()); 
                    // InternalPrescription.g:215:3: ( rule__AttributeParams__StrParamsAssignment_1 )
                    // InternalPrescription.g:215:4: rule__AttributeParams__StrParamsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeParams__StrParamsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeParamsAccess().getStrParamsAssignment_1()); 

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
    // $ANTLR end "rule__AttributeParams__Alternatives"


    // $ANTLR start "rule__Prescription__Group__0"
    // InternalPrescription.g:223:1: rule__Prescription__Group__0 : rule__Prescription__Group__0__Impl rule__Prescription__Group__1 ;
    public final void rule__Prescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:227:1: ( rule__Prescription__Group__0__Impl rule__Prescription__Group__1 )
            // InternalPrescription.g:228:2: rule__Prescription__Group__0__Impl rule__Prescription__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Prescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prescription__Group__1();

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
    // $ANTLR end "rule__Prescription__Group__0"


    // $ANTLR start "rule__Prescription__Group__0__Impl"
    // InternalPrescription.g:235:1: rule__Prescription__Group__0__Impl : ( 'prescription' ) ;
    public final void rule__Prescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:239:1: ( ( 'prescription' ) )
            // InternalPrescription.g:240:1: ( 'prescription' )
            {
            // InternalPrescription.g:240:1: ( 'prescription' )
            // InternalPrescription.g:241:2: 'prescription'
            {
             before(grammarAccess.getPrescriptionAccess().getPrescriptionKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrescriptionAccess().getPrescriptionKeyword_0()); 

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
    // $ANTLR end "rule__Prescription__Group__0__Impl"


    // $ANTLR start "rule__Prescription__Group__1"
    // InternalPrescription.g:250:1: rule__Prescription__Group__1 : rule__Prescription__Group__1__Impl rule__Prescription__Group__2 ;
    public final void rule__Prescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:254:1: ( rule__Prescription__Group__1__Impl rule__Prescription__Group__2 )
            // InternalPrescription.g:255:2: rule__Prescription__Group__1__Impl rule__Prescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Prescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prescription__Group__2();

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
    // $ANTLR end "rule__Prescription__Group__1"


    // $ANTLR start "rule__Prescription__Group__1__Impl"
    // InternalPrescription.g:262:1: rule__Prescription__Group__1__Impl : ( ( rule__Prescription__NameAssignment_1 ) ) ;
    public final void rule__Prescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:266:1: ( ( ( rule__Prescription__NameAssignment_1 ) ) )
            // InternalPrescription.g:267:1: ( ( rule__Prescription__NameAssignment_1 ) )
            {
            // InternalPrescription.g:267:1: ( ( rule__Prescription__NameAssignment_1 ) )
            // InternalPrescription.g:268:2: ( rule__Prescription__NameAssignment_1 )
            {
             before(grammarAccess.getPrescriptionAccess().getNameAssignment_1()); 
            // InternalPrescription.g:269:2: ( rule__Prescription__NameAssignment_1 )
            // InternalPrescription.g:269:3: rule__Prescription__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Prescription__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Prescription__Group__1__Impl"


    // $ANTLR start "rule__Prescription__Group__2"
    // InternalPrescription.g:277:1: rule__Prescription__Group__2 : rule__Prescription__Group__2__Impl rule__Prescription__Group__3 ;
    public final void rule__Prescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:281:1: ( rule__Prescription__Group__2__Impl rule__Prescription__Group__3 )
            // InternalPrescription.g:282:2: rule__Prescription__Group__2__Impl rule__Prescription__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Prescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prescription__Group__3();

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
    // $ANTLR end "rule__Prescription__Group__2"


    // $ANTLR start "rule__Prescription__Group__2__Impl"
    // InternalPrescription.g:289:1: rule__Prescription__Group__2__Impl : ( '{' ) ;
    public final void rule__Prescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:293:1: ( ( '{' ) )
            // InternalPrescription.g:294:1: ( '{' )
            {
            // InternalPrescription.g:294:1: ( '{' )
            // InternalPrescription.g:295:2: '{'
            {
             before(grammarAccess.getPrescriptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPrescriptionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Prescription__Group__2__Impl"


    // $ANTLR start "rule__Prescription__Group__3"
    // InternalPrescription.g:304:1: rule__Prescription__Group__3 : rule__Prescription__Group__3__Impl rule__Prescription__Group__4 ;
    public final void rule__Prescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:308:1: ( rule__Prescription__Group__3__Impl rule__Prescription__Group__4 )
            // InternalPrescription.g:309:2: rule__Prescription__Group__3__Impl rule__Prescription__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Prescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Prescription__Group__4();

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
    // $ANTLR end "rule__Prescription__Group__3"


    // $ANTLR start "rule__Prescription__Group__3__Impl"
    // InternalPrescription.g:316:1: rule__Prescription__Group__3__Impl : ( ( rule__Prescription__FeaturesAssignment_3 )* ) ;
    public final void rule__Prescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:320:1: ( ( ( rule__Prescription__FeaturesAssignment_3 )* ) )
            // InternalPrescription.g:321:1: ( ( rule__Prescription__FeaturesAssignment_3 )* )
            {
            // InternalPrescription.g:321:1: ( ( rule__Prescription__FeaturesAssignment_3 )* )
            // InternalPrescription.g:322:2: ( rule__Prescription__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getPrescriptionAccess().getFeaturesAssignment_3()); 
            // InternalPrescription.g:323:2: ( rule__Prescription__FeaturesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPrescription.g:323:3: rule__Prescription__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Prescription__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPrescriptionAccess().getFeaturesAssignment_3()); 

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
    // $ANTLR end "rule__Prescription__Group__3__Impl"


    // $ANTLR start "rule__Prescription__Group__4"
    // InternalPrescription.g:331:1: rule__Prescription__Group__4 : rule__Prescription__Group__4__Impl ;
    public final void rule__Prescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:335:1: ( rule__Prescription__Group__4__Impl )
            // InternalPrescription.g:336:2: rule__Prescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Prescription__Group__4__Impl();

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
    // $ANTLR end "rule__Prescription__Group__4"


    // $ANTLR start "rule__Prescription__Group__4__Impl"
    // InternalPrescription.g:342:1: rule__Prescription__Group__4__Impl : ( '}' ) ;
    public final void rule__Prescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:346:1: ( ( '}' ) )
            // InternalPrescription.g:347:1: ( '}' )
            {
            // InternalPrescription.g:347:1: ( '}' )
            // InternalPrescription.g:348:2: '}'
            {
             before(grammarAccess.getPrescriptionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPrescriptionAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Prescription__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalPrescription.g:358:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:362:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalPrescription.g:363:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalPrescription.g:370:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__ManyAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:374:1: ( ( ( rule__Attribute__ManyAssignment_0 )? ) )
            // InternalPrescription.g:375:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            {
            // InternalPrescription.g:375:1: ( ( rule__Attribute__ManyAssignment_0 )? )
            // InternalPrescription.g:376:2: ( rule__Attribute__ManyAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getManyAssignment_0()); 
            // InternalPrescription.g:377:2: ( rule__Attribute__ManyAssignment_0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPrescription.g:377:3: rule__Attribute__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalPrescription.g:385:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:389:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalPrescription.g:390:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalPrescription.g:397:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:401:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalPrescription.g:402:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalPrescription.g:402:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalPrescription.g:403:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalPrescription.g:404:2: ( rule__Attribute__NameAssignment_1 )
            // InternalPrescription.g:404:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalPrescription.g:412:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:416:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalPrescription.g:417:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalPrescription.g:424:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:428:1: ( ( ':' ) )
            // InternalPrescription.g:429:1: ( ':' )
            {
            // InternalPrescription.g:429:1: ( ':' )
            // InternalPrescription.g:430:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalPrescription.g:439:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:443:1: ( rule__Attribute__Group__3__Impl )
            // InternalPrescription.g:444:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalPrescription.g:450:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__AttrParamsAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:454:1: ( ( ( rule__Attribute__AttrParamsAssignment_3 ) ) )
            // InternalPrescription.g:455:1: ( ( rule__Attribute__AttrParamsAssignment_3 ) )
            {
            // InternalPrescription.g:455:1: ( ( rule__Attribute__AttrParamsAssignment_3 ) )
            // InternalPrescription.g:456:2: ( rule__Attribute__AttrParamsAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getAttrParamsAssignment_3()); 
            // InternalPrescription.g:457:2: ( rule__Attribute__AttrParamsAssignment_3 )
            // InternalPrescription.g:457:3: rule__Attribute__AttrParamsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__AttrParamsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttrParamsAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__IntegerParams__Group__0"
    // InternalPrescription.g:466:1: rule__IntegerParams__Group__0 : rule__IntegerParams__Group__0__Impl rule__IntegerParams__Group__1 ;
    public final void rule__IntegerParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:470:1: ( rule__IntegerParams__Group__0__Impl rule__IntegerParams__Group__1 )
            // InternalPrescription.g:471:2: rule__IntegerParams__Group__0__Impl rule__IntegerParams__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__IntegerParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__1();

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
    // $ANTLR end "rule__IntegerParams__Group__0"


    // $ANTLR start "rule__IntegerParams__Group__0__Impl"
    // InternalPrescription.g:478:1: rule__IntegerParams__Group__0__Impl : ( 'Integer' ) ;
    public final void rule__IntegerParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:482:1: ( ( 'Integer' ) )
            // InternalPrescription.g:483:1: ( 'Integer' )
            {
            // InternalPrescription.g:483:1: ( 'Integer' )
            // InternalPrescription.g:484:2: 'Integer'
            {
             before(grammarAccess.getIntegerParamsAccess().getIntegerKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getIntegerKeyword_0()); 

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
    // $ANTLR end "rule__IntegerParams__Group__0__Impl"


    // $ANTLR start "rule__IntegerParams__Group__1"
    // InternalPrescription.g:493:1: rule__IntegerParams__Group__1 : rule__IntegerParams__Group__1__Impl rule__IntegerParams__Group__2 ;
    public final void rule__IntegerParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:497:1: ( rule__IntegerParams__Group__1__Impl rule__IntegerParams__Group__2 )
            // InternalPrescription.g:498:2: rule__IntegerParams__Group__1__Impl rule__IntegerParams__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IntegerParams__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__2();

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
    // $ANTLR end "rule__IntegerParams__Group__1"


    // $ANTLR start "rule__IntegerParams__Group__1__Impl"
    // InternalPrescription.g:505:1: rule__IntegerParams__Group__1__Impl : ( ',' ) ;
    public final void rule__IntegerParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:509:1: ( ( ',' ) )
            // InternalPrescription.g:510:1: ( ',' )
            {
            // InternalPrescription.g:510:1: ( ',' )
            // InternalPrescription.g:511:2: ','
            {
             before(grammarAccess.getIntegerParamsAccess().getCommaKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__IntegerParams__Group__1__Impl"


    // $ANTLR start "rule__IntegerParams__Group__2"
    // InternalPrescription.g:520:1: rule__IntegerParams__Group__2 : rule__IntegerParams__Group__2__Impl rule__IntegerParams__Group__3 ;
    public final void rule__IntegerParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:524:1: ( rule__IntegerParams__Group__2__Impl rule__IntegerParams__Group__3 )
            // InternalPrescription.g:525:2: rule__IntegerParams__Group__2__Impl rule__IntegerParams__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__IntegerParams__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__3();

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
    // $ANTLR end "rule__IntegerParams__Group__2"


    // $ANTLR start "rule__IntegerParams__Group__2__Impl"
    // InternalPrescription.g:532:1: rule__IntegerParams__Group__2__Impl : ( ( rule__IntegerParams__MeasureUnitAssignment_2 ) ) ;
    public final void rule__IntegerParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:536:1: ( ( ( rule__IntegerParams__MeasureUnitAssignment_2 ) ) )
            // InternalPrescription.g:537:1: ( ( rule__IntegerParams__MeasureUnitAssignment_2 ) )
            {
            // InternalPrescription.g:537:1: ( ( rule__IntegerParams__MeasureUnitAssignment_2 ) )
            // InternalPrescription.g:538:2: ( rule__IntegerParams__MeasureUnitAssignment_2 )
            {
             before(grammarAccess.getIntegerParamsAccess().getMeasureUnitAssignment_2()); 
            // InternalPrescription.g:539:2: ( rule__IntegerParams__MeasureUnitAssignment_2 )
            // InternalPrescription.g:539:3: rule__IntegerParams__MeasureUnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParams__MeasureUnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParamsAccess().getMeasureUnitAssignment_2()); 

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
    // $ANTLR end "rule__IntegerParams__Group__2__Impl"


    // $ANTLR start "rule__IntegerParams__Group__3"
    // InternalPrescription.g:547:1: rule__IntegerParams__Group__3 : rule__IntegerParams__Group__3__Impl rule__IntegerParams__Group__4 ;
    public final void rule__IntegerParams__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:551:1: ( rule__IntegerParams__Group__3__Impl rule__IntegerParams__Group__4 )
            // InternalPrescription.g:552:2: rule__IntegerParams__Group__3__Impl rule__IntegerParams__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__IntegerParams__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__4();

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
    // $ANTLR end "rule__IntegerParams__Group__3"


    // $ANTLR start "rule__IntegerParams__Group__3__Impl"
    // InternalPrescription.g:559:1: rule__IntegerParams__Group__3__Impl : ( ',' ) ;
    public final void rule__IntegerParams__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:563:1: ( ( ',' ) )
            // InternalPrescription.g:564:1: ( ',' )
            {
            // InternalPrescription.g:564:1: ( ',' )
            // InternalPrescription.g:565:2: ','
            {
             before(grammarAccess.getIntegerParamsAccess().getCommaKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__IntegerParams__Group__3__Impl"


    // $ANTLR start "rule__IntegerParams__Group__4"
    // InternalPrescription.g:574:1: rule__IntegerParams__Group__4 : rule__IntegerParams__Group__4__Impl rule__IntegerParams__Group__5 ;
    public final void rule__IntegerParams__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:578:1: ( rule__IntegerParams__Group__4__Impl rule__IntegerParams__Group__5 )
            // InternalPrescription.g:579:2: rule__IntegerParams__Group__4__Impl rule__IntegerParams__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__IntegerParams__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__5();

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
    // $ANTLR end "rule__IntegerParams__Group__4"


    // $ANTLR start "rule__IntegerParams__Group__4__Impl"
    // InternalPrescription.g:586:1: rule__IntegerParams__Group__4__Impl : ( '[' ) ;
    public final void rule__IntegerParams__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:590:1: ( ( '[' ) )
            // InternalPrescription.g:591:1: ( '[' )
            {
            // InternalPrescription.g:591:1: ( '[' )
            // InternalPrescription.g:592:2: '['
            {
             before(grammarAccess.getIntegerParamsAccess().getLeftSquareBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__IntegerParams__Group__4__Impl"


    // $ANTLR start "rule__IntegerParams__Group__5"
    // InternalPrescription.g:601:1: rule__IntegerParams__Group__5 : rule__IntegerParams__Group__5__Impl rule__IntegerParams__Group__6 ;
    public final void rule__IntegerParams__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:605:1: ( rule__IntegerParams__Group__5__Impl rule__IntegerParams__Group__6 )
            // InternalPrescription.g:606:2: rule__IntegerParams__Group__5__Impl rule__IntegerParams__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__IntegerParams__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__6();

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
    // $ANTLR end "rule__IntegerParams__Group__5"


    // $ANTLR start "rule__IntegerParams__Group__5__Impl"
    // InternalPrescription.g:613:1: rule__IntegerParams__Group__5__Impl : ( ( rule__IntegerParams__MinValueAssignment_5 ) ) ;
    public final void rule__IntegerParams__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:617:1: ( ( ( rule__IntegerParams__MinValueAssignment_5 ) ) )
            // InternalPrescription.g:618:1: ( ( rule__IntegerParams__MinValueAssignment_5 ) )
            {
            // InternalPrescription.g:618:1: ( ( rule__IntegerParams__MinValueAssignment_5 ) )
            // InternalPrescription.g:619:2: ( rule__IntegerParams__MinValueAssignment_5 )
            {
             before(grammarAccess.getIntegerParamsAccess().getMinValueAssignment_5()); 
            // InternalPrescription.g:620:2: ( rule__IntegerParams__MinValueAssignment_5 )
            // InternalPrescription.g:620:3: rule__IntegerParams__MinValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParams__MinValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParamsAccess().getMinValueAssignment_5()); 

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
    // $ANTLR end "rule__IntegerParams__Group__5__Impl"


    // $ANTLR start "rule__IntegerParams__Group__6"
    // InternalPrescription.g:628:1: rule__IntegerParams__Group__6 : rule__IntegerParams__Group__6__Impl rule__IntegerParams__Group__7 ;
    public final void rule__IntegerParams__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:632:1: ( rule__IntegerParams__Group__6__Impl rule__IntegerParams__Group__7 )
            // InternalPrescription.g:633:2: rule__IntegerParams__Group__6__Impl rule__IntegerParams__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__IntegerParams__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__7();

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
    // $ANTLR end "rule__IntegerParams__Group__6"


    // $ANTLR start "rule__IntegerParams__Group__6__Impl"
    // InternalPrescription.g:640:1: rule__IntegerParams__Group__6__Impl : ( '-' ) ;
    public final void rule__IntegerParams__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:644:1: ( ( '-' ) )
            // InternalPrescription.g:645:1: ( '-' )
            {
            // InternalPrescription.g:645:1: ( '-' )
            // InternalPrescription.g:646:2: '-'
            {
             before(grammarAccess.getIntegerParamsAccess().getHyphenMinusKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getHyphenMinusKeyword_6()); 

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
    // $ANTLR end "rule__IntegerParams__Group__6__Impl"


    // $ANTLR start "rule__IntegerParams__Group__7"
    // InternalPrescription.g:655:1: rule__IntegerParams__Group__7 : rule__IntegerParams__Group__7__Impl rule__IntegerParams__Group__8 ;
    public final void rule__IntegerParams__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:659:1: ( rule__IntegerParams__Group__7__Impl rule__IntegerParams__Group__8 )
            // InternalPrescription.g:660:2: rule__IntegerParams__Group__7__Impl rule__IntegerParams__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__IntegerParams__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__8();

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
    // $ANTLR end "rule__IntegerParams__Group__7"


    // $ANTLR start "rule__IntegerParams__Group__7__Impl"
    // InternalPrescription.g:667:1: rule__IntegerParams__Group__7__Impl : ( ( rule__IntegerParams__MaxValueAssignment_7 ) ) ;
    public final void rule__IntegerParams__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:671:1: ( ( ( rule__IntegerParams__MaxValueAssignment_7 ) ) )
            // InternalPrescription.g:672:1: ( ( rule__IntegerParams__MaxValueAssignment_7 ) )
            {
            // InternalPrescription.g:672:1: ( ( rule__IntegerParams__MaxValueAssignment_7 ) )
            // InternalPrescription.g:673:2: ( rule__IntegerParams__MaxValueAssignment_7 )
            {
             before(grammarAccess.getIntegerParamsAccess().getMaxValueAssignment_7()); 
            // InternalPrescription.g:674:2: ( rule__IntegerParams__MaxValueAssignment_7 )
            // InternalPrescription.g:674:3: rule__IntegerParams__MaxValueAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParams__MaxValueAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getIntegerParamsAccess().getMaxValueAssignment_7()); 

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
    // $ANTLR end "rule__IntegerParams__Group__7__Impl"


    // $ANTLR start "rule__IntegerParams__Group__8"
    // InternalPrescription.g:682:1: rule__IntegerParams__Group__8 : rule__IntegerParams__Group__8__Impl ;
    public final void rule__IntegerParams__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:686:1: ( rule__IntegerParams__Group__8__Impl )
            // InternalPrescription.g:687:2: rule__IntegerParams__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerParams__Group__8__Impl();

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
    // $ANTLR end "rule__IntegerParams__Group__8"


    // $ANTLR start "rule__IntegerParams__Group__8__Impl"
    // InternalPrescription.g:693:1: rule__IntegerParams__Group__8__Impl : ( ']' ) ;
    public final void rule__IntegerParams__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:697:1: ( ( ']' ) )
            // InternalPrescription.g:698:1: ( ']' )
            {
            // InternalPrescription.g:698:1: ( ']' )
            // InternalPrescription.g:699:2: ']'
            {
             before(grammarAccess.getIntegerParamsAccess().getRightSquareBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__IntegerParams__Group__8__Impl"


    // $ANTLR start "rule__StringParams__Group__0"
    // InternalPrescription.g:709:1: rule__StringParams__Group__0 : rule__StringParams__Group__0__Impl rule__StringParams__Group__1 ;
    public final void rule__StringParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:713:1: ( rule__StringParams__Group__0__Impl rule__StringParams__Group__1 )
            // InternalPrescription.g:714:2: rule__StringParams__Group__0__Impl rule__StringParams__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__StringParams__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group__1();

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
    // $ANTLR end "rule__StringParams__Group__0"


    // $ANTLR start "rule__StringParams__Group__0__Impl"
    // InternalPrescription.g:721:1: rule__StringParams__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:725:1: ( ( 'String' ) )
            // InternalPrescription.g:726:1: ( 'String' )
            {
            // InternalPrescription.g:726:1: ( 'String' )
            // InternalPrescription.g:727:2: 'String'
            {
             before(grammarAccess.getStringParamsAccess().getStringKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getStringKeyword_0()); 

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
    // $ANTLR end "rule__StringParams__Group__0__Impl"


    // $ANTLR start "rule__StringParams__Group__1"
    // InternalPrescription.g:736:1: rule__StringParams__Group__1 : rule__StringParams__Group__1__Impl rule__StringParams__Group__2 ;
    public final void rule__StringParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:740:1: ( rule__StringParams__Group__1__Impl rule__StringParams__Group__2 )
            // InternalPrescription.g:741:2: rule__StringParams__Group__1__Impl rule__StringParams__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__StringParams__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group__2();

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
    // $ANTLR end "rule__StringParams__Group__1"


    // $ANTLR start "rule__StringParams__Group__1__Impl"
    // InternalPrescription.g:748:1: rule__StringParams__Group__1__Impl : ( ',' ) ;
    public final void rule__StringParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:752:1: ( ( ',' ) )
            // InternalPrescription.g:753:1: ( ',' )
            {
            // InternalPrescription.g:753:1: ( ',' )
            // InternalPrescription.g:754:2: ','
            {
             before(grammarAccess.getStringParamsAccess().getCommaKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getCommaKeyword_1()); 

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
    // $ANTLR end "rule__StringParams__Group__1__Impl"


    // $ANTLR start "rule__StringParams__Group__2"
    // InternalPrescription.g:763:1: rule__StringParams__Group__2 : rule__StringParams__Group__2__Impl rule__StringParams__Group__3 ;
    public final void rule__StringParams__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:767:1: ( rule__StringParams__Group__2__Impl rule__StringParams__Group__3 )
            // InternalPrescription.g:768:2: rule__StringParams__Group__2__Impl rule__StringParams__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StringParams__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group__3();

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
    // $ANTLR end "rule__StringParams__Group__2"


    // $ANTLR start "rule__StringParams__Group__2__Impl"
    // InternalPrescription.g:775:1: rule__StringParams__Group__2__Impl : ( '[' ) ;
    public final void rule__StringParams__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:779:1: ( ( '[' ) )
            // InternalPrescription.g:780:1: ( '[' )
            {
            // InternalPrescription.g:780:1: ( '[' )
            // InternalPrescription.g:781:2: '['
            {
             before(grammarAccess.getStringParamsAccess().getLeftSquareBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getLeftSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__StringParams__Group__2__Impl"


    // $ANTLR start "rule__StringParams__Group__3"
    // InternalPrescription.g:790:1: rule__StringParams__Group__3 : rule__StringParams__Group__3__Impl rule__StringParams__Group__4 ;
    public final void rule__StringParams__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:794:1: ( rule__StringParams__Group__3__Impl rule__StringParams__Group__4 )
            // InternalPrescription.g:795:2: rule__StringParams__Group__3__Impl rule__StringParams__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__StringParams__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group__4();

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
    // $ANTLR end "rule__StringParams__Group__3"


    // $ANTLR start "rule__StringParams__Group__3__Impl"
    // InternalPrescription.g:802:1: rule__StringParams__Group__3__Impl : ( ( rule__StringParams__DefValueAssignment_3 ) ) ;
    public final void rule__StringParams__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:806:1: ( ( ( rule__StringParams__DefValueAssignment_3 ) ) )
            // InternalPrescription.g:807:1: ( ( rule__StringParams__DefValueAssignment_3 ) )
            {
            // InternalPrescription.g:807:1: ( ( rule__StringParams__DefValueAssignment_3 ) )
            // InternalPrescription.g:808:2: ( rule__StringParams__DefValueAssignment_3 )
            {
             before(grammarAccess.getStringParamsAccess().getDefValueAssignment_3()); 
            // InternalPrescription.g:809:2: ( rule__StringParams__DefValueAssignment_3 )
            // InternalPrescription.g:809:3: rule__StringParams__DefValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringParams__DefValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringParamsAccess().getDefValueAssignment_3()); 

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
    // $ANTLR end "rule__StringParams__Group__3__Impl"


    // $ANTLR start "rule__StringParams__Group__4"
    // InternalPrescription.g:817:1: rule__StringParams__Group__4 : rule__StringParams__Group__4__Impl rule__StringParams__Group__5 ;
    public final void rule__StringParams__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:821:1: ( rule__StringParams__Group__4__Impl rule__StringParams__Group__5 )
            // InternalPrescription.g:822:2: rule__StringParams__Group__4__Impl rule__StringParams__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__StringParams__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group__5();

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
    // $ANTLR end "rule__StringParams__Group__4"


    // $ANTLR start "rule__StringParams__Group__4__Impl"
    // InternalPrescription.g:829:1: rule__StringParams__Group__4__Impl : ( ( rule__StringParams__Group_4__0 )* ) ;
    public final void rule__StringParams__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:833:1: ( ( ( rule__StringParams__Group_4__0 )* ) )
            // InternalPrescription.g:834:1: ( ( rule__StringParams__Group_4__0 )* )
            {
            // InternalPrescription.g:834:1: ( ( rule__StringParams__Group_4__0 )* )
            // InternalPrescription.g:835:2: ( rule__StringParams__Group_4__0 )*
            {
             before(grammarAccess.getStringParamsAccess().getGroup_4()); 
            // InternalPrescription.g:836:2: ( rule__StringParams__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPrescription.g:836:3: rule__StringParams__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StringParams__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStringParamsAccess().getGroup_4()); 

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
    // $ANTLR end "rule__StringParams__Group__4__Impl"


    // $ANTLR start "rule__StringParams__Group__5"
    // InternalPrescription.g:844:1: rule__StringParams__Group__5 : rule__StringParams__Group__5__Impl ;
    public final void rule__StringParams__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:848:1: ( rule__StringParams__Group__5__Impl )
            // InternalPrescription.g:849:2: rule__StringParams__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringParams__Group__5__Impl();

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
    // $ANTLR end "rule__StringParams__Group__5"


    // $ANTLR start "rule__StringParams__Group__5__Impl"
    // InternalPrescription.g:855:1: rule__StringParams__Group__5__Impl : ( ']' ) ;
    public final void rule__StringParams__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:859:1: ( ( ']' ) )
            // InternalPrescription.g:860:1: ( ']' )
            {
            // InternalPrescription.g:860:1: ( ']' )
            // InternalPrescription.g:861:2: ']'
            {
             before(grammarAccess.getStringParamsAccess().getRightSquareBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getRightSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__StringParams__Group__5__Impl"


    // $ANTLR start "rule__StringParams__Group_4__0"
    // InternalPrescription.g:871:1: rule__StringParams__Group_4__0 : rule__StringParams__Group_4__0__Impl rule__StringParams__Group_4__1 ;
    public final void rule__StringParams__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:875:1: ( rule__StringParams__Group_4__0__Impl rule__StringParams__Group_4__1 )
            // InternalPrescription.g:876:2: rule__StringParams__Group_4__0__Impl rule__StringParams__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__StringParams__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParams__Group_4__1();

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
    // $ANTLR end "rule__StringParams__Group_4__0"


    // $ANTLR start "rule__StringParams__Group_4__0__Impl"
    // InternalPrescription.g:883:1: rule__StringParams__Group_4__0__Impl : ( ',' ) ;
    public final void rule__StringParams__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:887:1: ( ( ',' ) )
            // InternalPrescription.g:888:1: ( ',' )
            {
            // InternalPrescription.g:888:1: ( ',' )
            // InternalPrescription.g:889:2: ','
            {
             before(grammarAccess.getStringParamsAccess().getCommaKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__StringParams__Group_4__0__Impl"


    // $ANTLR start "rule__StringParams__Group_4__1"
    // InternalPrescription.g:898:1: rule__StringParams__Group_4__1 : rule__StringParams__Group_4__1__Impl ;
    public final void rule__StringParams__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:902:1: ( rule__StringParams__Group_4__1__Impl )
            // InternalPrescription.g:903:2: rule__StringParams__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringParams__Group_4__1__Impl();

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
    // $ANTLR end "rule__StringParams__Group_4__1"


    // $ANTLR start "rule__StringParams__Group_4__1__Impl"
    // InternalPrescription.g:909:1: rule__StringParams__Group_4__1__Impl : ( ( rule__StringParams__DefValueAssignment_4_1 ) ) ;
    public final void rule__StringParams__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:913:1: ( ( ( rule__StringParams__DefValueAssignment_4_1 ) ) )
            // InternalPrescription.g:914:1: ( ( rule__StringParams__DefValueAssignment_4_1 ) )
            {
            // InternalPrescription.g:914:1: ( ( rule__StringParams__DefValueAssignment_4_1 ) )
            // InternalPrescription.g:915:2: ( rule__StringParams__DefValueAssignment_4_1 )
            {
             before(grammarAccess.getStringParamsAccess().getDefValueAssignment_4_1()); 
            // InternalPrescription.g:916:2: ( rule__StringParams__DefValueAssignment_4_1 )
            // InternalPrescription.g:916:3: rule__StringParams__DefValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringParams__DefValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringParamsAccess().getDefValueAssignment_4_1()); 

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
    // $ANTLR end "rule__StringParams__Group_4__1__Impl"


    // $ANTLR start "rule__DomainModel__ElementsAssignment"
    // InternalPrescription.g:925:1: rule__DomainModel__ElementsAssignment : ( rulePrescription ) ;
    public final void rule__DomainModel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:929:1: ( ( rulePrescription ) )
            // InternalPrescription.g:930:2: ( rulePrescription )
            {
            // InternalPrescription.g:930:2: ( rulePrescription )
            // InternalPrescription.g:931:3: rulePrescription
            {
             before(grammarAccess.getDomainModelAccess().getElementsPrescriptionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrescription();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getElementsPrescriptionParserRuleCall_0()); 

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
    // $ANTLR end "rule__DomainModel__ElementsAssignment"


    // $ANTLR start "rule__Prescription__NameAssignment_1"
    // InternalPrescription.g:940:1: rule__Prescription__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Prescription__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:944:1: ( ( RULE_ID ) )
            // InternalPrescription.g:945:2: ( RULE_ID )
            {
            // InternalPrescription.g:945:2: ( RULE_ID )
            // InternalPrescription.g:946:3: RULE_ID
            {
             before(grammarAccess.getPrescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Prescription__NameAssignment_1"


    // $ANTLR start "rule__Prescription__FeaturesAssignment_3"
    // InternalPrescription.g:955:1: rule__Prescription__FeaturesAssignment_3 : ( ruleAttribute ) ;
    public final void rule__Prescription__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:959:1: ( ( ruleAttribute ) )
            // InternalPrescription.g:960:2: ( ruleAttribute )
            {
            // InternalPrescription.g:960:2: ( ruleAttribute )
            // InternalPrescription.g:961:3: ruleAttribute
            {
             before(grammarAccess.getPrescriptionAccess().getFeaturesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getPrescriptionAccess().getFeaturesAttributeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Prescription__FeaturesAssignment_3"


    // $ANTLR start "rule__Attribute__ManyAssignment_0"
    // InternalPrescription.g:970:1: rule__Attribute__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Attribute__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:974:1: ( ( ( 'many' ) ) )
            // InternalPrescription.g:975:2: ( ( 'many' ) )
            {
            // InternalPrescription.g:975:2: ( ( 'many' ) )
            // InternalPrescription.g:976:3: ( 'many' )
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            // InternalPrescription.g:977:3: ( 'many' )
            // InternalPrescription.g:978:4: 'many'
            {
             before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Attribute__ManyAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalPrescription.g:989:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:993:1: ( ( RULE_ID ) )
            // InternalPrescription.g:994:2: ( RULE_ID )
            {
            // InternalPrescription.g:994:2: ( RULE_ID )
            // InternalPrescription.g:995:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__AttrParamsAssignment_3"
    // InternalPrescription.g:1004:1: rule__Attribute__AttrParamsAssignment_3 : ( ruleAttributeParams ) ;
    public final void rule__Attribute__AttrParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1008:1: ( ( ruleAttributeParams ) )
            // InternalPrescription.g:1009:2: ( ruleAttributeParams )
            {
            // InternalPrescription.g:1009:2: ( ruleAttributeParams )
            // InternalPrescription.g:1010:3: ruleAttributeParams
            {
             before(grammarAccess.getAttributeAccess().getAttrParamsAttributeParamsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeParams();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttrParamsAttributeParamsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__AttrParamsAssignment_3"


    // $ANTLR start "rule__AttributeParams__IntParamsAssignment_0"
    // InternalPrescription.g:1019:1: rule__AttributeParams__IntParamsAssignment_0 : ( ruleIntegerParams ) ;
    public final void rule__AttributeParams__IntParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1023:1: ( ( ruleIntegerParams ) )
            // InternalPrescription.g:1024:2: ( ruleIntegerParams )
            {
            // InternalPrescription.g:1024:2: ( ruleIntegerParams )
            // InternalPrescription.g:1025:3: ruleIntegerParams
            {
             before(grammarAccess.getAttributeParamsAccess().getIntParamsIntegerParamsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerParams();

            state._fsp--;

             after(grammarAccess.getAttributeParamsAccess().getIntParamsIntegerParamsParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeParams__IntParamsAssignment_0"


    // $ANTLR start "rule__AttributeParams__StrParamsAssignment_1"
    // InternalPrescription.g:1034:1: rule__AttributeParams__StrParamsAssignment_1 : ( ruleStringParams ) ;
    public final void rule__AttributeParams__StrParamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1038:1: ( ( ruleStringParams ) )
            // InternalPrescription.g:1039:2: ( ruleStringParams )
            {
            // InternalPrescription.g:1039:2: ( ruleStringParams )
            // InternalPrescription.g:1040:3: ruleStringParams
            {
             before(grammarAccess.getAttributeParamsAccess().getStrParamsStringParamsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStringParams();

            state._fsp--;

             after(grammarAccess.getAttributeParamsAccess().getStrParamsStringParamsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttributeParams__StrParamsAssignment_1"


    // $ANTLR start "rule__IntegerParams__MeasureUnitAssignment_2"
    // InternalPrescription.g:1049:1: rule__IntegerParams__MeasureUnitAssignment_2 : ( RULE_ID ) ;
    public final void rule__IntegerParams__MeasureUnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1053:1: ( ( RULE_ID ) )
            // InternalPrescription.g:1054:2: ( RULE_ID )
            {
            // InternalPrescription.g:1054:2: ( RULE_ID )
            // InternalPrescription.g:1055:3: RULE_ID
            {
             before(grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__IntegerParams__MeasureUnitAssignment_2"


    // $ANTLR start "rule__IntegerParams__MinValueAssignment_5"
    // InternalPrescription.g:1064:1: rule__IntegerParams__MinValueAssignment_5 : ( RULE_INT ) ;
    public final void rule__IntegerParams__MinValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1068:1: ( ( RULE_INT ) )
            // InternalPrescription.g:1069:2: ( RULE_INT )
            {
            // InternalPrescription.g:1069:2: ( RULE_INT )
            // InternalPrescription.g:1070:3: RULE_INT
            {
             before(grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__IntegerParams__MinValueAssignment_5"


    // $ANTLR start "rule__IntegerParams__MaxValueAssignment_7"
    // InternalPrescription.g:1079:1: rule__IntegerParams__MaxValueAssignment_7 : ( RULE_INT ) ;
    public final void rule__IntegerParams__MaxValueAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1083:1: ( ( RULE_INT ) )
            // InternalPrescription.g:1084:2: ( RULE_INT )
            {
            // InternalPrescription.g:1084:2: ( RULE_INT )
            // InternalPrescription.g:1085:3: RULE_INT
            {
             before(grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0()); 

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
    // $ANTLR end "rule__IntegerParams__MaxValueAssignment_7"


    // $ANTLR start "rule__StringParams__DefValueAssignment_3"
    // InternalPrescription.g:1094:1: rule__StringParams__DefValueAssignment_3 : ( RULE_ID ) ;
    public final void rule__StringParams__DefValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1098:1: ( ( RULE_ID ) )
            // InternalPrescription.g:1099:2: ( RULE_ID )
            {
            // InternalPrescription.g:1099:2: ( RULE_ID )
            // InternalPrescription.g:1100:3: RULE_ID
            {
             before(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__StringParams__DefValueAssignment_3"


    // $ANTLR start "rule__StringParams__DefValueAssignment_4_1"
    // InternalPrescription.g:1109:1: rule__StringParams__DefValueAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__StringParams__DefValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPrescription.g:1113:1: ( ( RULE_ID ) )
            // InternalPrescription.g:1114:2: ( RULE_ID )
            {
            // InternalPrescription.g:1114:2: ( RULE_ID )
            // InternalPrescription.g:1115:3: RULE_ID
            {
             before(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__StringParams__DefValueAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000202010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010002L});

}