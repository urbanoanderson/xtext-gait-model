# Prescription Model Generator

## About

This project presents a text-based domain model implemented using `xtext` for eclipse that allows professional physiotherapists to prescribe different gait parameters to be measured and show up at a patient's UI according to the disease being treated. A simple demo shows prescriptions for both Stoke and Parkinson diseases.

Developed by Avante Software Factory (MPES 2018.1) for Professional Reuse class.

## The problem

Physiotherapists prescribe different exercises with parameters to be monitored in gait treatment. Depending on the disease being treated, the parameters can vary wildly. The Avante Software Factory is implementing a mobile application that allows gait exercises using music, specifically for Stoke patients. The model from this project allows the prescription of any set of parameters written by a physiotherapist to be automatically recognized and integrated on the mobile app's UI at the future.

## Model Language

Our sample model language allows the definition of prescriptions for multiple diseases. Each with its attributes that can be integers with range values or strings with a set of possible values. The metamodel can be found in project `org.xtext.example.avante` and contains the following definitions as an xtext file:

```
grammar org.xtext.example.avante.Prescription with org.eclipse.xtext.common.Terminals

generate prescription "http://www.xtext.org/example/avante/Prescription"

DomainModel :
    (elements+=Prescription)*
;

Prescription:
    'prescription' name=ID '{'
        (features+=Attribute)*
    '}'
;
 
Attribute:
    (many?='many')? name=ID ':' attrParams=AttributeParams
;

AttributeParams:
	intParams=IntegerParams |
	strParams=StringParams
;

IntegerParams:
	'Integer' ',' measureUnit=ID ',' '[' minValue=INT '-' maxValue=INT ']'
;

StringParams:
	'String' ',' '[' defValue+=ID (',' defValue+=ID)* ']'
;
```

Using the presented metamodel it is possible to generate `.presc` files for different prescriptions using syntax presented in the example bellow:

```
prescription Stroke {
    cadencia: Integer, BPM, [60-120]
    duracao: Integer, Minutes, [10-20]
}

prescription Parkinson {
    cadencia: Integer, BPM, [80-150]
    distancia: Integer, Meters, [10-100]
    estilo: String, [HalfStep, SingleStep, DoubleStep]
}
````

## Demo App

The Demo App contained in project `org.xtext.example.avante.generator` at `src\org.xtext.example.generator\DemoApp.java` extract the model definitions at `src\model\test.presc` and creates a sample console UI to visualize a patient's data.

## Dependencies

The following dependencies are necessary for running the example:

- Java Runtime Environment 8
- Eclipse 2018-12
- Xtext

Also the plugins contained in `plugins` folder must be placed at `<ECLIPSE-FOLDER>\plugins`

## How to Run

RIght-Click the interpreter file `src\org.xtext.example.generator\Interpret.mwe2` and select `Run As -> MWE2 Workflow`. Demo results should appear at the console.