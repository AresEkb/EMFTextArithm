/**
 */
package org.emftext.language.arithm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.emftext.language.arithm.ArithmFactory
 * @model kind="package"
 * @generated
 */
public interface ArithmPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "arithm";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.emftext.org/language/arithm";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "arithm";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	ArithmPackage eINSTANCE = org.emftext.language.arithm.impl.ArithmPackageImpl.init();

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.CalcImpl <em>Calc</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.CalcImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getCalc()
   * @generated
   */
	int CALC = 0;

	/**
   * The feature id for the '<em><b>Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CALC__EXPR = 0;

	/**
   * The number of structural features of the '<em>Calc</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CALC_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.ExprImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getExpr()
   * @generated
   */
	int EXPR = 1;

	/**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPR_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.AdditiveExprImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveExpr()
   * @generated
   */
	int ADDITIVE_EXPR = 2;

	/**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDITIVE_EXPR__CHILDREN = EXPR_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDITIVE_EXPR__OPERATORS = EXPR_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Additive Expr</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDITIVE_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.AdditiveExprChildImpl <em>Additive Expr Child</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.AdditiveExprChildImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveExprChild()
   * @generated
   */
	int ADDITIVE_EXPR_CHILD = 3;

	/**
   * The number of structural features of the '<em>Additive Expr Child</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ADDITIVE_EXPR_CHILD_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.MultiplicativeExprImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeExpr()
   * @generated
   */
	int MULTIPLICATIVE_EXPR = 4;

	/**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MULTIPLICATIVE_EXPR__CHILDREN = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MULTIPLICATIVE_EXPR__OPERATORS = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Multiplicative Expr</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MULTIPLICATIVE_EXPR_FEATURE_COUNT = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.MultiplicativeExprChildImpl <em>Multiplicative Expr Child</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.MultiplicativeExprChildImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeExprChild()
   * @generated
   */
	int MULTIPLICATIVE_EXPR_CHILD = 5;

	/**
   * The number of structural features of the '<em>Multiplicative Expr Child</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT = ADDITIVE_EXPR_CHILD_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.impl.NumberImpl
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getNumber()
   * @generated
   */
	int NUMBER = 6;

	/**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NUMBER__VALUE = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NUMBER_FEATURE_COUNT = MULTIPLICATIVE_EXPR_CHILD_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.AdditiveOp <em>Additive Op</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.AdditiveOp
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveOp()
   * @generated
   */
	int ADDITIVE_OP = 7;

	/**
   * The meta object id for the '{@link org.emftext.language.arithm.MultiplicativeOp <em>Multiplicative Op</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.emftext.language.arithm.MultiplicativeOp
   * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeOp()
   * @generated
   */
	int MULTIPLICATIVE_OP = 8;


	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.Calc <em>Calc</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calc</em>'.
   * @see org.emftext.language.arithm.Calc
   * @generated
   */
	EClass getCalc();

	/**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.arithm.Calc#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expr</em>'.
   * @see org.emftext.language.arithm.Calc#getExpr()
   * @see #getCalc()
   * @generated
   */
	EReference getCalc_Expr();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see org.emftext.language.arithm.Expr
   * @generated
   */
	EClass getExpr();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.AdditiveExpr <em>Additive Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expr</em>'.
   * @see org.emftext.language.arithm.AdditiveExpr
   * @generated
   */
	EClass getAdditiveExpr();

	/**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.arithm.AdditiveExpr#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.arithm.AdditiveExpr#getChildren()
   * @see #getAdditiveExpr()
   * @generated
   */
	EReference getAdditiveExpr_Children();

	/**
   * Returns the meta object for the attribute list '{@link org.emftext.language.arithm.AdditiveExpr#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see org.emftext.language.arithm.AdditiveExpr#getOperators()
   * @see #getAdditiveExpr()
   * @generated
   */
	EAttribute getAdditiveExpr_Operators();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.AdditiveExprChild <em>Additive Expr Child</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Additive Expr Child</em>'.
   * @see org.emftext.language.arithm.AdditiveExprChild
   * @generated
   */
	EClass getAdditiveExprChild();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.MultiplicativeExpr <em>Multiplicative Expr</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr</em>'.
   * @see org.emftext.language.arithm.MultiplicativeExpr
   * @generated
   */
	EClass getMultiplicativeExpr();

	/**
   * Returns the meta object for the containment reference list '{@link org.emftext.language.arithm.MultiplicativeExpr#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.emftext.language.arithm.MultiplicativeExpr#getChildren()
   * @see #getMultiplicativeExpr()
   * @generated
   */
	EReference getMultiplicativeExpr_Children();

	/**
   * Returns the meta object for the attribute list '{@link org.emftext.language.arithm.MultiplicativeExpr#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see org.emftext.language.arithm.MultiplicativeExpr#getOperators()
   * @see #getMultiplicativeExpr()
   * @generated
   */
	EAttribute getMultiplicativeExpr_Operators();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.MultiplicativeExprChild <em>Multiplicative Expr Child</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicative Expr Child</em>'.
   * @see org.emftext.language.arithm.MultiplicativeExprChild
   * @generated
   */
	EClass getMultiplicativeExprChild();

	/**
   * Returns the meta object for class '{@link org.emftext.language.arithm.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see org.emftext.language.arithm.Number
   * @generated
   */
	EClass getNumber();

	/**
   * Returns the meta object for the attribute '{@link org.emftext.language.arithm.Number#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.emftext.language.arithm.Number#getValue()
   * @see #getNumber()
   * @generated
   */
	EAttribute getNumber_Value();

	/**
   * Returns the meta object for enum '{@link org.emftext.language.arithm.AdditiveOp <em>Additive Op</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Additive Op</em>'.
   * @see org.emftext.language.arithm.AdditiveOp
   * @generated
   */
	EEnum getAdditiveOp();

	/**
   * Returns the meta object for enum '{@link org.emftext.language.arithm.MultiplicativeOp <em>Multiplicative Op</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Multiplicative Op</em>'.
   * @see org.emftext.language.arithm.MultiplicativeOp
   * @generated
   */
	EEnum getMultiplicativeOp();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	ArithmFactory getArithmFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.CalcImpl <em>Calc</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.CalcImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getCalc()
     * @generated
     */
		EClass CALC = eINSTANCE.getCalc();

		/**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CALC__EXPR = eINSTANCE.getCalc_Expr();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.ExprImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getExpr()
     * @generated
     */
		EClass EXPR = eINSTANCE.getExpr();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.AdditiveExprImpl <em>Additive Expr</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.AdditiveExprImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveExpr()
     * @generated
     */
		EClass ADDITIVE_EXPR = eINSTANCE.getAdditiveExpr();

		/**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ADDITIVE_EXPR__CHILDREN = eINSTANCE.getAdditiveExpr_Children();

		/**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ADDITIVE_EXPR__OPERATORS = eINSTANCE.getAdditiveExpr_Operators();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.AdditiveExprChildImpl <em>Additive Expr Child</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.AdditiveExprChildImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveExprChild()
     * @generated
     */
		EClass ADDITIVE_EXPR_CHILD = eINSTANCE.getAdditiveExprChild();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.MultiplicativeExprImpl <em>Multiplicative Expr</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.MultiplicativeExprImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeExpr()
     * @generated
     */
		EClass MULTIPLICATIVE_EXPR = eINSTANCE.getMultiplicativeExpr();

		/**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MULTIPLICATIVE_EXPR__CHILDREN = eINSTANCE.getMultiplicativeExpr_Children();

		/**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute MULTIPLICATIVE_EXPR__OPERATORS = eINSTANCE.getMultiplicativeExpr_Operators();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.MultiplicativeExprChildImpl <em>Multiplicative Expr Child</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.MultiplicativeExprChildImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeExprChild()
     * @generated
     */
		EClass MULTIPLICATIVE_EXPR_CHILD = eINSTANCE.getMultiplicativeExprChild();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.impl.NumberImpl
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getNumber()
     * @generated
     */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.AdditiveOp <em>Additive Op</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.AdditiveOp
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getAdditiveOp()
     * @generated
     */
		EEnum ADDITIVE_OP = eINSTANCE.getAdditiveOp();

		/**
     * The meta object literal for the '{@link org.emftext.language.arithm.MultiplicativeOp <em>Multiplicative Op</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.emftext.language.arithm.MultiplicativeOp
     * @see org.emftext.language.arithm.impl.ArithmPackageImpl#getMultiplicativeOp()
     * @generated
     */
		EEnum MULTIPLICATIVE_OP = eINSTANCE.getMultiplicativeOp();

	}

} //ArithmPackage
