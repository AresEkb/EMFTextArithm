/**
 */
package org.emftext.language.arithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.emftext.language.arithm.Calc#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.emftext.language.arithm.ArithmPackage#getCalc()
 * @model
 * @generated
 */
public interface Calc extends EObject {
	/**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.arithm.Expr}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference list.
   * @see org.emftext.language.arithm.ArithmPackage#getCalc_Expr()
   * @model containment="true" required="true"
   * @generated
   */
	EList<Expr> getExpr();

} // Calc
