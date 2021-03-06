/*
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.avante.prescription.Attribute;
import org.xtext.example.avante.prescription.AttributeParams;
import org.xtext.example.avante.prescription.DomainModel;
import org.xtext.example.avante.prescription.IntegerParams;
import org.xtext.example.avante.prescription.Prescription;
import org.xtext.example.avante.prescription.PrescriptionPackage;
import org.xtext.example.avante.prescription.StringParams;
import org.xtext.example.avante.services.PrescriptionGrammarAccess;

@SuppressWarnings("all")
public class PrescriptionSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PrescriptionGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PrescriptionPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PrescriptionPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case PrescriptionPackage.ATTRIBUTE_PARAMS:
				sequence_AttributeParams(context, (AttributeParams) semanticObject); 
				return; 
			case PrescriptionPackage.DOMAIN_MODEL:
				sequence_DomainModel(context, (DomainModel) semanticObject); 
				return; 
			case PrescriptionPackage.INTEGER_PARAMS:
				sequence_IntegerParams(context, (IntegerParams) semanticObject); 
				return; 
			case PrescriptionPackage.PRESCRIPTION:
				sequence_Prescription(context, (Prescription) semanticObject); 
				return; 
			case PrescriptionPackage.STRING_PARAMS:
				sequence_StringParams(context, (StringParams) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeParams returns AttributeParams
	 *
	 * Constraint:
	 *     (intParams=IntegerParams | strParams=StringParams)
	 */
	protected void sequence_AttributeParams(ISerializationContext context, AttributeParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (many?='many'? name=ID attrParams=AttributeParams)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DomainModel returns DomainModel
	 *
	 * Constraint:
	 *     elements+=Prescription+
	 */
	protected void sequence_DomainModel(ISerializationContext context, DomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IntegerParams returns IntegerParams
	 *
	 * Constraint:
	 *     (measureUnit=ID minValue=INT maxValue=INT)
	 */
	protected void sequence_IntegerParams(ISerializationContext context, IntegerParams semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MEASURE_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MEASURE_UNIT));
			if (transientValues.isValueTransient(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MIN_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MIN_VALUE));
			if (transientValues.isValueTransient(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MAX_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PrescriptionPackage.Literals.INTEGER_PARAMS__MAX_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerParamsAccess().getMeasureUnitIDTerminalRuleCall_2_0(), semanticObject.getMeasureUnit());
		feeder.accept(grammarAccess.getIntegerParamsAccess().getMinValueINTTerminalRuleCall_5_0(), semanticObject.getMinValue());
		feeder.accept(grammarAccess.getIntegerParamsAccess().getMaxValueINTTerminalRuleCall_7_0(), semanticObject.getMaxValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Prescription returns Prescription
	 *
	 * Constraint:
	 *     (name=ID features+=Attribute*)
	 */
	protected void sequence_Prescription(ISerializationContext context, Prescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringParams returns StringParams
	 *
	 * Constraint:
	 *     (defValue+=ID defValue+=ID*)
	 */
	protected void sequence_StringParams(ISerializationContext context, StringParams semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
