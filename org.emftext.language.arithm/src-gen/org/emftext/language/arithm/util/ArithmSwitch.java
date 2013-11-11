/**
 */
package org.emftext.language.arithm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.arithm.AdditiveExpr;
import org.emftext.language.arithm.AdditiveExprChild;
import org.emftext.language.arithm.ArithmPackage;
import org.emftext.language.arithm.BitShiftExpr;
import org.emftext.language.arithm.BitShiftExprChild;
import org.emftext.language.arithm.Calc;
import org.emftext.language.arithm.Expr;
import org.emftext.language.arithm.MultiplicativeExpr;
import org.emftext.language.arithm.MultiplicativeExprChild;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.emftext.language.arithm.ArithmPackage
 * @generated
 */
public class ArithmSwitch<T> extends Switch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static ArithmPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ArithmSwitch() {
    if (modelPackage == null)
    {
      modelPackage = ArithmPackage.eINSTANCE;
    }
  }

	/**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
    return ePackage == modelPackage;
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case ArithmPackage.CALC:
      {
        Calc calc = (Calc)theEObject;
        T result = caseCalc(calc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.BIT_SHIFT_EXPR:
      {
        BitShiftExpr bitShiftExpr = (BitShiftExpr)theEObject;
        T result = caseBitShiftExpr(bitShiftExpr);
        if (result == null) result = caseExpr(bitShiftExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.BIT_SHIFT_EXPR_CHILD:
      {
        BitShiftExprChild bitShiftExprChild = (BitShiftExprChild)theEObject;
        T result = caseBitShiftExprChild(bitShiftExprChild);
        if (result == null) result = caseExpr(bitShiftExprChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.ADDITIVE_EXPR:
      {
        AdditiveExpr additiveExpr = (AdditiveExpr)theEObject;
        T result = caseAdditiveExpr(additiveExpr);
        if (result == null) result = caseBitShiftExprChild(additiveExpr);
        if (result == null) result = caseExpr(additiveExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.ADDITIVE_EXPR_CHILD:
      {
        AdditiveExprChild additiveExprChild = (AdditiveExprChild)theEObject;
        T result = caseAdditiveExprChild(additiveExprChild);
        if (result == null) result = caseBitShiftExprChild(additiveExprChild);
        if (result == null) result = caseExpr(additiveExprChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.MULTIPLICATIVE_EXPR:
      {
        MultiplicativeExpr multiplicativeExpr = (MultiplicativeExpr)theEObject;
        T result = caseMultiplicativeExpr(multiplicativeExpr);
        if (result == null) result = caseAdditiveExprChild(multiplicativeExpr);
        if (result == null) result = caseBitShiftExprChild(multiplicativeExpr);
        if (result == null) result = caseExpr(multiplicativeExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.MULTIPLICATIVE_EXPR_CHILD:
      {
        MultiplicativeExprChild multiplicativeExprChild = (MultiplicativeExprChild)theEObject;
        T result = caseMultiplicativeExprChild(multiplicativeExprChild);
        if (result == null) result = caseAdditiveExprChild(multiplicativeExprChild);
        if (result == null) result = caseBitShiftExprChild(multiplicativeExprChild);
        if (result == null) result = caseExpr(multiplicativeExprChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArithmPackage.NUMBER:
      {
        org.emftext.language.arithm.Number number = (org.emftext.language.arithm.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseMultiplicativeExprChild(number);
        if (result == null) result = caseAdditiveExprChild(number);
        if (result == null) result = caseBitShiftExprChild(number);
        if (result == null) result = caseExpr(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Calc</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Calc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCalc(Calc object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseExpr(Expr object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bit Shift Expr</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Shift Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBitShiftExpr(BitShiftExpr object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Bit Shift Expr Child</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Shift Expr Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseBitShiftExprChild(BitShiftExprChild object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAdditiveExpr(AdditiveExpr object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Additive Expr Child</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Additive Expr Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAdditiveExprChild(AdditiveExprChild object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultiplicativeExpr(MultiplicativeExpr object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expr Child</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplicative Expr Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMultiplicativeExprChild(MultiplicativeExprChild object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNumber(org.emftext.language.arithm.Number object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	@Override
	public T defaultCase(EObject object) {
    return null;
  }

} //ArithmSwitch
