/*
 * generated by Xtext 2.16.0
 */
grammar InternalPrescription;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.avante.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleDomainModel
entryRuleDomainModel
:
{ before(grammarAccess.getDomainModelRule()); }
	 ruleDomainModel
{ after(grammarAccess.getDomainModelRule()); } 
	 EOF 
;

// Rule DomainModel
ruleDomainModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDomainModelAccess().getElementsAssignment()); }
		(rule__DomainModel__ElementsAssignment)*
		{ after(grammarAccess.getDomainModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrescription
entryRulePrescription
:
{ before(grammarAccess.getPrescriptionRule()); }
	 rulePrescription
{ after(grammarAccess.getPrescriptionRule()); } 
	 EOF 
;

// Rule Prescription
rulePrescription 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrescriptionAccess().getGroup()); }
		(rule__Prescription__Group__0)
		{ after(grammarAccess.getPrescriptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribute
entryRuleAttribute
:
{ before(grammarAccess.getAttributeRule()); }
	 ruleAttribute
{ after(grammarAccess.getAttributeRule()); } 
	 EOF 
;

// Rule Attribute
ruleAttribute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeAccess().getGroup()); }
		(rule__Attribute__Group__0)
		{ after(grammarAccess.getAttributeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeParams
entryRuleAttributeParams
:
{ before(grammarAccess.getAttributeParamsRule()); }
	 ruleAttributeParams
{ after(grammarAccess.getAttributeParamsRule()); } 
	 EOF 
;

// Rule AttributeParams
ruleAttributeParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeParamsAccess().getAlternatives()); }
		(rule__AttributeParams__Alternatives)
		{ after(grammarAccess.getAttributeParamsAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerParams
entryRuleIntegerParams
:
{ before(grammarAccess.getIntegerParamsRule()); }
	 ruleIntegerParams
{ after(grammarAccess.getIntegerParamsRule()); } 
	 EOF 
;

// Rule IntegerParams
ruleIntegerParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerParamsAccess().getGroup()); }
		(rule__IntegerParams__Group__0)
		{ after(grammarAccess.getIntegerParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringParams
entryRuleStringParams
:
{ before(grammarAccess.getStringParamsRule()); }
	 ruleStringParams
{ after(grammarAccess.getStringParamsRule()); } 
	 EOF 
;

// Rule StringParams
ruleStringParams 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringParamsAccess().getGroup()); }
		(rule__StringParams__Group__0)
		{ after(grammarAccess.getStringParamsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeParams__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeParamsAccess().getIntParamsAssignment_0()); }
		(rule__AttributeParams__IntParamsAssignment_0)
		{ after(grammarAccess.getAttributeParamsAccess().getIntParamsAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeParamsAccess().getStrParamsAssignment_1()); }
		(rule__AttributeParams__StrParamsAssignment_1)
		{ after(grammarAccess.getAttributeParamsAccess().getStrParamsAssignment_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Prescription__Group__0__Impl
	rule__Prescription__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrescriptionAccess().getPrescriptionKeyword_0()); }
	'prescription'
	{ after(grammarAccess.getPrescriptionAccess().getPrescriptionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Prescription__Group__1__Impl
	rule__Prescription__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrescriptionAccess().getNameAssignment_1()); }
	(rule__Prescription__NameAssignment_1)
	{ after(grammarAccess.getPrescriptionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Prescription__Group__2__Impl
	rule__Prescription__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrescriptionAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getPrescriptionAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Prescription__Group__3__Impl
	rule__Prescription__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrescriptionAccess().getFeaturesAssignment_3()); }
	(rule__Prescription__FeaturesAssignment_3)*
	{ after(grammarAccess.getPrescriptionAccess().getFeaturesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Prescription__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrescriptionAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getPrescriptionAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribute__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__0__Impl
	rule__Attribute__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getManyAssignment_0()); }
	(rule__Attribute__ManyAssignment_0)?
	{ after(grammarAccess.getAttributeAccess().getManyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__1__Impl
	rule__Attribute__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
	(rule__Attribute__NameAssignment_1)
	{ after(grammarAccess.getAttributeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__2__Impl
	rule__Attribute__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getAttributeAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribute__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeAccess().getAttrParamsAssignment_3()); }
	(rule__Attribute__AttrParamsAssignment_3)
	{ after(grammarAccess.getAttributeAccess().getAttrParamsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__0__Impl
	rule__IntegerParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getIntegerKeyword_0()); }
	'Integer'
	{ after(grammarAccess.getIntegerParamsAccess().getIntegerKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__1__Impl
	rule__IntegerParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getCommaKeyword_1()); }
	','
	{ after(grammarAccess.getIntegerParamsAccess().getCommaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__2__Impl
	rule__IntegerParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getMeasureUnitAssignment_2()); }
	(rule__IntegerParams__MeasureUnitAssignment_2)
	{ after(grammarAccess.getIntegerParamsAccess().getMeasureUnitAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__3__Impl
	rule__IntegerParams__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getCommaKeyword_3()); }
	','
	{ after(grammarAccess.getIntegerParamsAccess().getCommaKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__4__Impl
	rule__IntegerParams__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getLeftSquareBracketKeyword_4()); }
	'['
	{ after(grammarAccess.getIntegerParamsAccess().getLeftSquareBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__5__Impl
	rule__IntegerParams__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getMinValueAssignment_5()); }
	(rule__IntegerParams__MinValueAssignment_5)
	{ after(grammarAccess.getIntegerParamsAccess().getMinValueAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__6__Impl
	rule__IntegerParams__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getHyphenMinusKeyword_6()); }
	'-'
	{ after(grammarAccess.getIntegerParamsAccess().getHyphenMinusKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__7__Impl
	rule__IntegerParams__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getMaxValueAssignment_7()); }
	(rule__IntegerParams__MaxValueAssignment_7)
	{ after(grammarAccess.getIntegerParamsAccess().getMaxValueAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerParams__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerParamsAccess().getRightSquareBracketKeyword_8()); }
	']'
	{ after(grammarAccess.getIntegerParamsAccess().getRightSquareBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringParams__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__0__Impl
	rule__StringParams__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getStringKeyword_0()); }
	'String'
	{ after(grammarAccess.getStringParamsAccess().getStringKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__1__Impl
	rule__StringParams__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getCommaKeyword_1()); }
	','
	{ after(grammarAccess.getStringParamsAccess().getCommaKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__2__Impl
	rule__StringParams__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getLeftSquareBracketKeyword_2()); }
	'['
	{ after(grammarAccess.getStringParamsAccess().getLeftSquareBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__3__Impl
	rule__StringParams__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getDefValueAssignment_3()); }
	(rule__StringParams__DefValueAssignment_3)
	{ after(grammarAccess.getStringParamsAccess().getDefValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__4__Impl
	rule__StringParams__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getGroup_4()); }
	(rule__StringParams__Group_4__0)*
	{ after(grammarAccess.getStringParamsAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getRightSquareBracketKeyword_5()); }
	']'
	{ after(grammarAccess.getStringParamsAccess().getRightSquareBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringParams__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group_4__0__Impl
	rule__StringParams__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getStringParamsAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringParams__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringParamsAccess().getDefValueAssignment_4_1()); }
	(rule__StringParams__DefValueAssignment_4_1)
	{ after(grammarAccess.getStringParamsAccess().getDefValueAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DomainModel__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDomainModelAccess().getElementsPrescriptionParserRuleCall_0()); }
		rulePrescription
		{ after(grammarAccess.getDomainModelAccess().getElementsPrescriptionParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrescriptionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPrescriptionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Prescription__FeaturesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrescriptionAccess().getFeaturesAttributeParserRuleCall_3_0()); }
		ruleAttribute
		{ after(grammarAccess.getPrescriptionAccess().getFeaturesAttributeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__ManyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
		(
			{ before(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
			'many'
			{ after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
		)
		{ after(grammarAccess.getAttributeAccess().getManyManyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribute__AttrParamsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeAccess().getAttrParamsAttributeParamsParserRuleCall_3_0()); }
		ruleAttributeParams
		{ after(grammarAccess.getAttributeAccess().getAttrParamsAttributeParamsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeParams__IntParamsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeParamsAccess().getIntParamsIntegerParamsParserRuleCall_0_0()); }
		ruleIntegerParams
		{ after(grammarAccess.getAttributeParamsAccess().getIntParamsIntegerParamsParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeParams__StrParamsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeParamsAccess().getStrParamsStringParamsParserRuleCall_1_0()); }
		ruleStringParams
		{ after(grammarAccess.getAttributeParamsAccess().getStrParamsStringParamsParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__MeasureUnitAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__MinValueAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerParams__MaxValueAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0()); }
		RULE_INT
		{ after(grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__DefValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringParams__DefValueAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_4_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStringParamsAccess().getDefValueIDTerminalRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
