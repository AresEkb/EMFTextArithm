/**
 */
package org.emftext.language.arithm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.arithm.MultiplicativeExpr#getChildren <em>Children</em>}</li>
 *   <li>{@link org.emftext.language.arithm.MultiplicativeExpr#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.arithm.ArithmPackage#getMultiplicativeExpr()
 * @model
 * @generated
 */
public interface MultiplicativeExpr extends AdditiveExprChild {
	/**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.arithm.MultiplicativeExprChild}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.emftext.language.arithm.ArithmPackage#getMultiplicativeExpr_Children()
   * @model containment="true" required="true"
   * @generated
   */
	EList<MultiplicativeExprChild> getChildren();

	/**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link org.emftext.language.arithm.MultiplicativeOp}.
   * The literals are from the enumeration {@link org.emftext.language.arithm.MultiplicativeOp}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.emftext.language.arithm.MultiplicativeOp
   * @see org.emftext.language.arithm.ArithmPackage#getMultiplicativeExpr_Operators()
   * @model required="true"
   * @generated
   */
	EList<MultiplicativeOp> getOperators();

} // MultiplicativeExpr
