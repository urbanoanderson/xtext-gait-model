/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.prescription.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.avante.prescription.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrescriptionFactoryImpl extends EFactoryImpl implements PrescriptionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PrescriptionFactory init()
  {
    try
    {
      PrescriptionFactory thePrescriptionFactory = (PrescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(PrescriptionPackage.eNS_URI);
      if (thePrescriptionFactory != null)
      {
        return thePrescriptionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PrescriptionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrescriptionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PrescriptionPackage.DOMAIN_MODEL: return createDomainModel();
      case PrescriptionPackage.PRESCRIPTION: return createPrescription();
      case PrescriptionPackage.ATTRIBUTE: return createAttribute();
      case PrescriptionPackage.ATTRIBUTE_PARAMS: return createAttributeParams();
      case PrescriptionPackage.INTEGER_PARAMS: return createIntegerParams();
      case PrescriptionPackage.STRING_PARAMS: return createStringParams();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Prescription createPrescription()
  {
    PrescriptionImpl prescription = new PrescriptionImpl();
    return prescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeParams createAttributeParams()
  {
    AttributeParamsImpl attributeParams = new AttributeParamsImpl();
    return attributeParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerParams createIntegerParams()
  {
    IntegerParamsImpl integerParams = new IntegerParamsImpl();
    return integerParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringParams createStringParams()
  {
    StringParamsImpl stringParams = new StringParamsImpl();
    return stringParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrescriptionPackage getPrescriptionPackage()
  {
    return (PrescriptionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PrescriptionPackage getPackage()
  {
    return PrescriptionPackage.eINSTANCE;
  }

} //PrescriptionFactoryImpl
