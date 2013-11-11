/**
 */
package org.emftext.language.arithm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.emftext.language.arithm.AdditiveExpr;
import org.emftext.language.arithm.AdditiveOp;
import org.emftext.language.arithm.ArithmFactory;
import org.emftext.language.arithm.ArithmPackage;
import org.emftext.language.arithm.Calc;
import org.emftext.language.arithm.MultiplicativeExpr;
import org.emftext.language.arithm.MultiplicativeOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmFactoryImpl extends EFactoryImpl implements ArithmFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static ArithmFactory init() {
    try
    {
      ArithmFactory theArithmFactory = (ArithmFactory)EPackage.Registry.INSTANCE.getEFactory(ArithmPackage.eNS_URI);
      if (theArithmFactory != null)
      {
        return theArithmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ArithmFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ArithmFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case ArithmPackage.CALC: return createCalc();
      case ArithmPackage.ADDITIVE_EXPR: return createAdditiveExpr();
      case ArithmPackage.MULTIPLICATIVE_EXPR: return createMultiplicativeExpr();
      case ArithmPackage.NUMBER: return createNumber();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
    switch (eDataType.getClassifierID())
    {
      case ArithmPackage.ADDITIVE_OP:
        return createAdditiveOpFromString(eDataType, initialValue);
      case ArithmPackage.MULTIPLICATIVE_OP:
        return createMultiplicativeOpFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
    switch (eDataType.getClassifierID())
    {
      case ArithmPackage.ADDITIVE_OP:
        return convertAdditiveOpToString(eDataType, instanceValue);
      case ArithmPackage.MULTIPLICATIVE_OP:
        return convertMultiplicativeOpToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Calc createCalc() {
    CalcImpl calc = new CalcImpl();
    return calc;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AdditiveExpr createAdditiveExpr() {
    AdditiveExprImpl additiveExpr = new AdditiveExprImpl();
    return additiveExpr;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultiplicativeExpr createMultiplicativeExpr() {
    MultiplicativeExprImpl multiplicativeExpr = new MultiplicativeExprImpl();
    return multiplicativeExpr;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public org.emftext.language.arithm.Number createNumber() {
    NumberImpl number = new NumberImpl();
    return number;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AdditiveOp createAdditiveOpFromString(EDataType eDataType, String initialValue) {
    AdditiveOp result = AdditiveOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertAdditiveOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MultiplicativeOp createMultiplicativeOpFromString(EDataType eDataType, String initialValue) {
    MultiplicativeOp result = MultiplicativeOp.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String convertMultiplicativeOpToString(EDataType eDataType, Object instanceValue) {
    return instanceValue == null ? null : instanceValue.toString();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ArithmPackage getArithmPackage() {
    return (ArithmPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static ArithmPackage getPackage() {
    return ArithmPackage.eINSTANCE;
  }

} //ArithmFactoryImpl
