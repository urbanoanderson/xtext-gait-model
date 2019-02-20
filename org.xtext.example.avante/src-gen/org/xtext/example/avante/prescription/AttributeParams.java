/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.prescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.avante.prescription.AttributeParams#getIntParams <em>Int Params</em>}</li>
 *   <li>{@link org.xtext.example.avante.prescription.AttributeParams#getStrParams <em>Str Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttributeParams()
 * @model
 * @generated
 */
public interface AttributeParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Int Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Params</em>' containment reference.
   * @see #setIntParams(IntegerParams)
   * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttributeParams_IntParams()
   * @model containment="true"
   * @generated
   */
  IntegerParams getIntParams();

  /**
   * Sets the value of the '{@link org.xtext.example.avante.prescription.AttributeParams#getIntParams <em>Int Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Params</em>' containment reference.
   * @see #getIntParams()
   * @generated
   */
  void setIntParams(IntegerParams value);

  /**
   * Returns the value of the '<em><b>Str Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str Params</em>' containment reference.
   * @see #setStrParams(StringParams)
   * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttributeParams_StrParams()
   * @model containment="true"
   * @generated
   */
  StringParams getStrParams();

  /**
   * Sets the value of the '{@link org.xtext.example.avante.prescription.AttributeParams#getStrParams <em>Str Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str Params</em>' containment reference.
   * @see #getStrParams()
   * @generated
   */
  void setStrParams(StringParams value);

} // AttributeParams
