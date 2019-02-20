package org.xtext.example.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.xtext.example.avante.prescription.*;

public class DemoApp implements IWorkflowComponent
{
	//Mock Patient database
	Map<String,String> _patientList;
	
	//Prescription List
	List<Prescription> _prescriptions;
	
	public DemoApp()
	{
		_patientList = new HashMap<String,String>();
		_patientList.put("Anderson", "Stroke");
		_patientList.put("Petrônio", "Parkinson");
	}
	
	@Override
	public void preInvoke() { }
	
	@Override
	public void invoke(IWorkflowContext ctx)
	{
		_prescriptions = (List<Prescription>) ctx.get("model");
		
		for (String patientName : _patientList.keySet())
		{
			System.out.println("------------------------");
			GenerateConsoleUI(patientName, _patientList.get(patientName));
			System.out.println();
		}
	}
	
	@Override
	public void postInvoke() { }
	
	//Create mock ui for sample patients
	public void GenerateConsoleUI(String patientName, String patientDisease)
	{
		System.out.println(String.format("Hello %s!", patientName));
		System.out.println(String.format("Here is your current treatment. Keep working hard!"));
		
		for(Prescription p : _prescriptions)
		{
			if(patientDisease.equals(p.getName()))
			{
				for (Attribute attribute : p.getFeatures())
				{
					IntegerParams paramsInt = attribute.getAttrParams().getIntParams();
					StringParams paramsStr = attribute.getAttrParams().getStrParams();
					
					if(paramsInt != null)
					{
						System.out.println(String.format(
							"\t'%s': %d %s", 
							attribute.getName(),
							(paramsInt.getMinValue() + paramsInt.getMaxValue())/2,
							paramsInt.getMeasureUnit()
							)
						);
					}
					
					else
					{
						System.out.println(String.format("\t'%s': %s", 
								attribute.getName(),
								paramsStr.getDefValue().get(0)
								));
					}	
				}
			}
		}
	}
}
