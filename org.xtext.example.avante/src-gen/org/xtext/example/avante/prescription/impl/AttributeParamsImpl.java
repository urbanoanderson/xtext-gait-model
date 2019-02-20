/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.avante.prescription.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.avante.prescription.AttributeParams;
import org.xtext.example.avante.prescription.IntegerParams;
import org.xtext.example.avante.prescription.PrescriptionPackage;
import org.xtext.example.avante.prescription.StringParams;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.avante.prescription.impl.AttributeParamsImpl#getIntParams <em>Int Params</em>}</li>
 *   <li>{@link org.xtext.example.avante.prescription.impl.AttributeParamsImpl#getStrParams <em>Str Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeParamsImpl extends MinimalEObjectImpl.Container implements AttributeParams
{
  /**
   * The cached value of the '{@link #getIntParams() <em>Int Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntParams()
   * @generated
   * @ordered
   */
  protected IntegerParams intParams;

  /**
   * The cached value of the '{@link #getStrParams() <em>Str Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrParams()
   * @generated
   * @ordered
   */
  protected StringParams strParams;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeParamsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PrescriptionPackage.Literals.ATTRIBUTE_PARAMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerParams getIntParams()
  {
    return intParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIntParams(IntegerParams newIntParams, NotificationChain msgs)
  {
    IntegerParams oldIntParams = intParams;
    intParams = newIntParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS, oldIntParams, newIntParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntParams(IntegerParams newIntParams)
  {
    if (newIntParams != intParams)
    {
      NotificationChain msgs = null;
      if (intParams != null)
        msgs = ((InternalEObject)intParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS, null, msgs);
      if (newIntParams != null)
        msgs = ((InternalEObject)newIntParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS, null, msgs);
      msgs = basicSetIntParams(newIntParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS, newIntParams, newIntParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringParams getStrParams()
  {
    return strParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStrParams(StringParams newStrParams, NotificationChain msgs)
  {
    StringParams oldStrParams = strParams;
    strParams = newStrParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS, oldStrParams, newStrParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrParams(StringParams newStrParams)
  {
    if (newStrParams != strParams)
    {
      NotificationChain msgs = null;
      if (strParams != null)
        msgs = ((InternalEObject)strParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS, null, msgs);
      if (newStrParams != null)
        msgs = ((InternalEObject)newStrParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS, null, msgs);
      msgs = basicSetStrParams(newStrParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS, newStrParams, newStrParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS:
        return basicSetIntParams(null, msgs);
      case PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS:
        return basicSetStrParams(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS:
        return getIntParams();
      case PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS:
        return getStrParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS:
        setIntParams((IntegerParams)newValue);
        return;
      case PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS:
        setStrParams((StringParams)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS:
        setIntParams((IntegerParams)null);
        return;
      case PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS:
        setStrParams((StringParams)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PrescriptionPackage.ATTRIBUTE_PARAMS__INT_PARAMS:
        return intParams != null;
      case PrescriptionPackage.ATTRIBUTE_PARAMS__STR_PARAMS:
        return strParams != null;
    }
    return super.eIsSet(featureID);
  }

} //AttributeParamsImpl
