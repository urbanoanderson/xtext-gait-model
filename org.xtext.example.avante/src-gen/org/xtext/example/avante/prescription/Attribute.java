/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.prescription;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.avante.prescription.Attribute#isMany <em>Many</em>}</li>
 *   <li>{@link org.xtext.example.avante.prescription.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.avante.prescription.Attribute#getAttrParams <em>Attr Params</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttribute_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link org.xtext.example.avante.prescription.Attribute#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.avante.prescription.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attr Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr Params</em>' containment reference.
   * @see #setAttrParams(AttributeParams)
   * @see org.xtext.example.avante.prescription.PrescriptionPackage#getAttribute_AttrParams()
   * @model containment="true"
   * @generated
   */
  AttributeParams getAttrParams();

  /**
   * Sets the value of the '{@link org.xtext.example.avante.prescription.Attribute#getAttrParams <em>Attr Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr Params</em>' containment reference.
   * @see #getAttrParams()
   * @generated
   */
  void setAttrParams(AttributeParams value);

} // Attribute
