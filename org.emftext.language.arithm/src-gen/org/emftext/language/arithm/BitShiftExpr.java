/**
 */
package org.emftext.language.arithm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit Shift Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.arithm.BitShiftExpr#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.arithm.BitShiftExpr#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.arithm.ArithmPackage#getBitShiftExpr()
 * @model
 * @generated
 */
public interface BitShiftExpr extends Expr {
	/**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.arithm.BitShiftExprChild}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.emftext.language.arithm.ArithmPackage#getBitShiftExpr_Children()
   * @model containment="true" lower="2"
   * @generated
   */
	EList<BitShiftExprChild> getChildren();

	/**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link org.emftext.language.arithm.BitShiftOp}.
   * The literals are from the enumeration {@link org.emftext.language.arithm.BitShiftOp}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.emftext.language.arithm.BitShiftOp
   * @see org.emftext.language.arithm.ArithmPackage#getBitShiftExpr_Operators()
   * @model required="true"
   * @generated
   */
	EList<BitShiftOp> getOperators();

} // BitShiftExpr
