/**
 */
package org.emftext.language.arithm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.emftext.language.arithm.ArithmPackage
 * @generated
 */
public interface ArithmFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	ArithmFactory eINSTANCE = org.emftext.language.arithm.impl.ArithmFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Calc</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Calc</em>'.
   * @generated
   */
	Calc createCalc();

	/**
   * Returns a new object of class '<em>Additive Expr</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expr</em>'.
   * @generated
   */
	AdditiveExpr createAdditiveExpr();

	/**
   * Returns a new object of class '<em>Multiplicative Expr</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplicative Expr</em>'.
   * @generated
   */
	MultiplicativeExpr createMultiplicativeExpr();

	/**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
	Number createNumber();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	ArithmPackage getArithmPackage();

} //ArithmFactory
