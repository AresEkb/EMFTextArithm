/**
 */
package org.emftext.language.arithm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.arithm.ArithmPackage;
import org.emftext.language.arithm.BitShiftExpr;
import org.emftext.language.arithm.BitShiftExprChild;
import org.emftext.language.arithm.BitShiftOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bit Shift Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.emftext.language.arithm.impl.BitShiftExprImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.arithm.impl.BitShiftExprImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitShiftExprImpl extends ExprImpl implements BitShiftExpr {
	/**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
	protected EList<BitShiftExprChild> children;

	/**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
	protected EList<BitShiftOp> operators;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected BitShiftExprImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ArithmPackage.Literals.BIT_SHIFT_EXPR;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BitShiftExprChild> getChildren() {
    if (children == null)
    {
      children = new EObjectContainmentEList<BitShiftExprChild>(BitShiftExprChild.class, this, ArithmPackage.BIT_SHIFT_EXPR__CHILDREN);
    }
    return children;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<BitShiftOp> getOperators() {
    if (operators == null)
    {
      operators = new EDataTypeUniqueEList<BitShiftOp>(BitShiftOp.class, this, ArithmPackage.BIT_SHIFT_EXPR__OPERATORS);
    }
    return operators;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case ArithmPackage.BIT_SHIFT_EXPR__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case ArithmPackage.BIT_SHIFT_EXPR__CHILDREN:
        return getChildren();
      case ArithmPackage.BIT_SHIFT_EXPR__OPERATORS:
        return getOperators();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ArithmPackage.BIT_SHIFT_EXPR__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends BitShiftExprChild>)newValue);
        return;
      case ArithmPackage.BIT_SHIFT_EXPR__OPERATORS:
        getOperators().clear();
        getOperators().addAll((Collection<? extends BitShiftOp>)newValue);
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
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case ArithmPackage.BIT_SHIFT_EXPR__CHILDREN:
        getChildren().clear();
        return;
      case ArithmPackage.BIT_SHIFT_EXPR__OPERATORS:
        getOperators().clear();
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
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case ArithmPackage.BIT_SHIFT_EXPR__CHILDREN:
        return children != null && !children.isEmpty();
      case ArithmPackage.BIT_SHIFT_EXPR__OPERATORS:
        return operators != null && !operators.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operators: ");
    result.append(operators);
    result.append(')');
    return result.toString();
  }

} //BitShiftExprImpl
