package org.xtext.example.avante.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.avante.services.PrescriptionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPrescriptionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'prescription'", "'{'", "'}'", "'many'", "':'", "'Integer'", "','", "'['", "'-'", "']'", "'String'"
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

        public InternalPrescriptionParser(TokenStream input, PrescriptionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected PrescriptionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalPrescription.g:64:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalPrescription.g:64:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalPrescription.g:65:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalPrescription.g:71:1: ruleDomainModel returns [EObject current=null] : ( (lv_elements_0_0= rulePrescription ) )* ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalPrescription.g:77:2: ( ( (lv_elements_0_0= rulePrescription ) )* )
            // InternalPrescription.g:78:2: ( (lv_elements_0_0= rulePrescription ) )*
            {
            // InternalPrescription.g:78:2: ( (lv_elements_0_0= rulePrescription ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPrescription.g:79:3: (lv_elements_0_0= rulePrescription )
            	    {
            	    // InternalPrescription.g:79:3: (lv_elements_0_0= rulePrescription )
            	    // InternalPrescription.g:80:4: lv_elements_0_0= rulePrescription
            	    {

            	    				newCompositeNode(grammarAccess.getDomainModelAccess().getElementsPrescriptionParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=rulePrescription();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.avante.Prescription.Prescription");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRulePrescription"
    // InternalPrescription.g:100:1: entryRulePrescription returns [EObject current=null] : iv_rulePrescription= rulePrescription EOF ;
    public final EObject entryRulePrescription() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrescription = null;


        try {
            // InternalPrescription.g:100:53: (iv_rulePrescription= rulePrescription EOF )
            // InternalPrescription.g:101:2: iv_rulePrescription= rulePrescription EOF
            {
             newCompositeNode(grammarAccess.getPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrescription=rulePrescription();

            state._fsp--;

             current =iv_rulePrescription; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrescription"


    // $ANTLR start "rulePrescription"
    // InternalPrescription.g:107:1: rulePrescription returns [EObject current=null] : (otherlv_0= 'prescription' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleAttribute ) )* otherlv_4= '}' ) ;
    public final EObject rulePrescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalPrescription.g:113:2: ( (otherlv_0= 'prescription' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleAttribute ) )* otherlv_4= '}' ) )
            // InternalPrescription.g:114:2: (otherlv_0= 'prescription' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleAttribute ) )* otherlv_4= '}' )
            {
            // InternalPrescription.g:114:2: (otherlv_0= 'prescription' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleAttribute ) )* otherlv_4= '}' )
            // InternalPrescription.g:115:3: otherlv_0= 'prescription' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleAttribute ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPrescriptionAccess().getPrescriptionKeyword_0());
            		
            // InternalPrescription.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPrescription.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPrescription.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalPrescription.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPrescriptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPrescriptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPrescription.g:141:3: ( (lv_features_3_0= ruleAttribute ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPrescription.g:142:4: (lv_features_3_0= ruleAttribute )
            	    {
            	    // InternalPrescription.g:142:4: (lv_features_3_0= ruleAttribute )
            	    // InternalPrescription.g:143:5: lv_features_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getPrescriptionAccess().getFeaturesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_features_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPrescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"org.xtext.example.avante.Prescription.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPrescriptionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePrescription"


    // $ANTLR start "entryRuleAttribute"
    // InternalPrescription.g:168:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalPrescription.g:168:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalPrescription.g:169:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalPrescription.g:175:1: ruleAttribute returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attrParams_3_0= ruleAttributeParams ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_attrParams_3_0 = null;



        	enterRule();

        try {
            // InternalPrescription.g:181:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attrParams_3_0= ruleAttributeParams ) ) ) )
            // InternalPrescription.g:182:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attrParams_3_0= ruleAttributeParams ) ) )
            {
            // InternalPrescription.g:182:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attrParams_3_0= ruleAttributeParams ) ) )
            // InternalPrescription.g:183:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_attrParams_3_0= ruleAttributeParams ) )
            {
            // InternalPrescription.g:183:3: ( (lv_many_0_0= 'many' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPrescription.g:184:4: (lv_many_0_0= 'many' )
                    {
                    // InternalPrescription.g:184:4: (lv_many_0_0= 'many' )
                    // InternalPrescription.g:185:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getAttributeAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAttributeRule());
                    					}
                    					setWithLastConsumed(current, "many", true, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalPrescription.g:197:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPrescription.g:198:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPrescription.g:198:4: (lv_name_1_0= RULE_ID )
            // InternalPrescription.g:199:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalPrescription.g:219:3: ( (lv_attrParams_3_0= ruleAttributeParams ) )
            // InternalPrescription.g:220:4: (lv_attrParams_3_0= ruleAttributeParams )
            {
            // InternalPrescription.g:220:4: (lv_attrParams_3_0= ruleAttributeParams )
            // InternalPrescription.g:221:5: lv_attrParams_3_0= ruleAttributeParams
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttrParamsAttributeParamsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_attrParams_3_0=ruleAttributeParams();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"attrParams",
            						lv_attrParams_3_0,
            						"org.xtext.example.avante.Prescription.AttributeParams");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeParams"
    // InternalPrescription.g:242:1: entryRuleAttributeParams returns [EObject current=null] : iv_ruleAttributeParams= ruleAttributeParams EOF ;
    public final EObject entryRuleAttributeParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeParams = null;


        try {
            // InternalPrescription.g:242:56: (iv_ruleAttributeParams= ruleAttributeParams EOF )
            // InternalPrescription.g:243:2: iv_ruleAttributeParams= ruleAttributeParams EOF
            {
             newCompositeNode(grammarAccess.getAttributeParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeParams=ruleAttributeParams();

            state._fsp--;

             current =iv_ruleAttributeParams; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttributeParams"


    // $ANTLR start "ruleAttributeParams"
    // InternalPrescription.g:249:1: ruleAttributeParams returns [EObject current=null] : ( ( (lv_intParams_0_0= ruleIntegerParams ) ) | ( (lv_strParams_1_0= ruleStringParams ) ) ) ;
    public final EObject ruleAttributeParams() throws RecognitionException {
        EObject current = null;

        EObject lv_intParams_0_0 = null;

        EObject lv_strParams_1_0 = null;



        	enterRule();

        try {
            // InternalPrescription.g:255:2: ( ( ( (lv_intParams_0_0= ruleIntegerParams ) ) | ( (lv_strParams_1_0= ruleStringParams ) ) ) )
            // InternalPrescription.g:256:2: ( ( (lv_intParams_0_0= ruleIntegerParams ) ) | ( (lv_strParams_1_0= ruleStringParams ) ) )
            {
            // InternalPrescription.g:256:2: ( ( (lv_intParams_0_0= ruleIntegerParams ) ) | ( (lv_strParams_1_0= ruleStringParams ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPrescription.g:257:3: ( (lv_intParams_0_0= ruleIntegerParams ) )
                    {
                    // InternalPrescription.g:257:3: ( (lv_intParams_0_0= ruleIntegerParams ) )
                    // InternalPrescription.g:258:4: (lv_intParams_0_0= ruleIntegerParams )
                    {
                    // InternalPrescription.g:258:4: (lv_intParams_0_0= ruleIntegerParams )
                    // InternalPrescription.g:259:5: lv_intParams_0_0= ruleIntegerParams
                    {

                    					newCompositeNode(grammarAccess.getAttributeParamsAccess().getIntParamsIntegerParamsParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_intParams_0_0=ruleIntegerParams();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeParamsRule());
                    					}
                    					set(
                    						current,
                    						"intParams",
                    						lv_intParams_0_0,
                    						"org.xtext.example.avante.Prescription.IntegerParams");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPrescription.g:277:3: ( (lv_strParams_1_0= ruleStringParams ) )
                    {
                    // InternalPrescription.g:277:3: ( (lv_strParams_1_0= ruleStringParams ) )
                    // InternalPrescription.g:278:4: (lv_strParams_1_0= ruleStringParams )
                    {
                    // InternalPrescription.g:278:4: (lv_strParams_1_0= ruleStringParams )
                    // InternalPrescription.g:279:5: lv_strParams_1_0= ruleStringParams
                    {

                    					newCompositeNode(grammarAccess.getAttributeParamsAccess().getStrParamsStringParamsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_strParams_1_0=ruleStringParams();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAttributeParamsRule());
                    					}
                    					set(
                    						current,
                    						"strParams",
                    						lv_strParams_1_0,
                    						"org.xtext.example.avante.Prescription.StringParams");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAttributeParams"


    // $ANTLR start "entryRuleIntegerParams"
    // InternalPrescription.g:300:1: entryRuleIntegerParams returns [EObject current=null] : iv_ruleIntegerParams= ruleIntegerParams EOF ;
    public final EObject entryRuleIntegerParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerParams = null;


        try {
            // InternalPrescription.g:300:54: (iv_ruleIntegerParams= ruleIntegerParams EOF )
            // InternalPrescription.g:301:2: iv_ruleIntegerParams= ruleIntegerParams EOF
            {
             newCompositeNode(grammarAccess.getIntegerParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerParams=ruleIntegerParams();

            state._fsp--;

             current =iv_ruleIntegerParams; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntegerParams"


    // $ANTLR start "ruleIntegerParams"
    // InternalPrescription.g:307:1: ruleIntegerParams returns [EObject current=null] : (otherlv_0= 'Integer' otherlv_1= ',' ( (lv_measureUnit_2_0= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_minValue_5_0= RULE_INT ) ) otherlv_6= '-' ( (lv_maxValue_7_0= RULE_INT ) ) otherlv_8= ']' ) ;
    public final EObject ruleIntegerParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_measureUnit_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_minValue_5_0=null;
        Token otherlv_6=null;
        Token lv_maxValue_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalPrescription.g:313:2: ( (otherlv_0= 'Integer' otherlv_1= ',' ( (lv_measureUnit_2_0= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_minValue_5_0= RULE_INT ) ) otherlv_6= '-' ( (lv_maxValue_7_0= RULE_INT ) ) otherlv_8= ']' ) )
            // InternalPrescription.g:314:2: (otherlv_0= 'Integer' otherlv_1= ',' ( (lv_measureUnit_2_0= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_minValue_5_0= RULE_INT ) ) otherlv_6= '-' ( (lv_maxValue_7_0= RULE_INT ) ) otherlv_8= ']' )
            {
            // InternalPrescription.g:314:2: (otherlv_0= 'Integer' otherlv_1= ',' ( (lv_measureUnit_2_0= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_minValue_5_0= RULE_INT ) ) otherlv_6= '-' ( (lv_maxValue_7_0= RULE_INT ) ) otherlv_8= ']' )
            // InternalPrescription.g:315:3: otherlv_0= 'Integer' otherlv_1= ',' ( (lv_measureUnit_2_0= RULE_ID ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_minValue_5_0= RULE_INT ) ) otherlv_6= '-' ( (lv_maxValue_7_0= RULE_INT ) ) otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerParamsAccess().getIntegerKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerParamsAccess().getCommaKeyword_1());
            		
            // InternalPrescription.g:323:3: ( (lv_measureUnit_2_0= RULE_ID ) )
            // InternalPrescription.g:324:4: (lv_measureUnit_2_0= RULE_ID )
            {
            // InternalPrescription.g:324:4: (lv_measureUnit_2_0= RULE_ID )
            // InternalPrescription.g:325:5: lv_measureUnit_2_0= RULE_ID
            {
            lv_measureUnit_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_measureUnit_2_0, grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerParamsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"measureUnit",
            						lv_measureUnit_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getIntegerParamsAccess().getCommaKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getIntegerParamsAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalPrescription.g:349:3: ( (lv_minValue_5_0= RULE_INT ) )
            // InternalPrescription.g:350:4: (lv_minValue_5_0= RULE_INT )
            {
            // InternalPrescription.g:350:4: (lv_minValue_5_0= RULE_INT )
            // InternalPrescription.g:351:5: lv_minValue_5_0= RULE_INT
            {
            lv_minValue_5_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_minValue_5_0, grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerParamsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minValue",
            						lv_minValue_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getIntegerParamsAccess().getHyphenMinusKeyword_6());
            		
            // InternalPrescription.g:371:3: ( (lv_maxValue_7_0= RULE_INT ) )
            // InternalPrescription.g:372:4: (lv_maxValue_7_0= RULE_INT )
            {
            // InternalPrescription.g:372:4: (lv_maxValue_7_0= RULE_INT )
            // InternalPrescription.g:373:5: lv_maxValue_7_0= RULE_INT
            {
            lv_maxValue_7_0=(Token)match(input,RULE_INT,FOLLOW_13); 

            					newLeafNode(lv_maxValue_7_0, grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntegerParamsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxValue",
            						lv_maxValue_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getIntegerParamsAccess().getRightSquareBracketKeyword_8());
            		

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
    // $ANTLR end "ruleIntegerParams"


    // $ANTLR start "entryRuleStringParams"
    // InternalPrescription.g:397:1: entryRuleStringParams returns [EObject current=null] : iv_ruleStringParams= ruleStringParams EOF ;
    public final EObject entryRuleStringParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParams = null;


        try {
            // InternalPrescription.g:397:53: (iv_ruleStringParams= ruleStringParams EOF )
            // InternalPrescription.g:398:2: iv_ruleStringParams= ruleStringParams EOF
            {
             newCompositeNode(grammarAccess.getStringParamsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringParams=ruleStringParams();

            state._fsp--;

             current =iv_ruleStringParams; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringParams"


    // $ANTLR start "ruleStringParams"
    // InternalPrescription.g:404:1: ruleStringParams returns [EObject current=null] : (otherlv_0= 'String' otherlv_1= ',' otherlv_2= '[' ( (lv_defValue_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleStringParams() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_defValue_3_0=null;
        Token otherlv_4=null;
        Token lv_defValue_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPrescription.g:410:2: ( (otherlv_0= 'String' otherlv_1= ',' otherlv_2= '[' ( (lv_defValue_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )* otherlv_6= ']' ) )
            // InternalPrescription.g:411:2: (otherlv_0= 'String' otherlv_1= ',' otherlv_2= '[' ( (lv_defValue_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )* otherlv_6= ']' )
            {
            // InternalPrescription.g:411:2: (otherlv_0= 'String' otherlv_1= ',' otherlv_2= '[' ( (lv_defValue_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )* otherlv_6= ']' )
            // InternalPrescription.g:412:3: otherlv_0= 'String' otherlv_1= ',' otherlv_2= '[' ( (lv_defValue_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )* otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStringParamsAccess().getStringKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getStringParamsAccess().getCommaKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStringParamsAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalPrescription.g:424:3: ( (lv_defValue_3_0= RULE_ID ) )
            // InternalPrescription.g:425:4: (lv_defValue_3_0= RULE_ID )
            {
            // InternalPrescription.g:425:4: (lv_defValue_3_0= RULE_ID )
            // InternalPrescription.g:426:5: lv_defValue_3_0= RULE_ID
            {
            lv_defValue_3_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_defValue_3_0, grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringParamsRule());
            					}
            					addWithLastConsumed(
            						current,
            						"defValue",
            						lv_defValue_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalPrescription.g:442:3: (otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPrescription.g:443:4: otherlv_4= ',' ( (lv_defValue_5_0= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStringParamsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPrescription.g:447:4: ( (lv_defValue_5_0= RULE_ID ) )
            	    // InternalPrescription.g:448:5: (lv_defValue_5_0= RULE_ID )
            	    {
            	    // InternalPrescription.g:448:5: (lv_defValue_5_0= RULE_ID )
            	    // InternalPrescription.g:449:6: lv_defValue_5_0= RULE_ID
            	    {
            	    lv_defValue_5_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    						newLeafNode(lv_defValue_5_0, grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getStringParamsRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"defValue",
            	    							lv_defValue_5_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStringParamsAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStringParams"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000120000L});

}