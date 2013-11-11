/**
 */
package org.emftext.language.arithm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.arithm.AdditiveExpr;
import org.emftext.language.arithm.AdditiveExprChild;
import org.emftext.language.arithm.AdditiveOp;
import org.emftext.language.arithm.ArithmFactory;
import org.emftext.language.arithm.ArithmPackage;
import org.emftext.language.arithm.BitShiftExpr;
import org.emftext.language.arithm.BitShiftExprChild;
import org.emftext.language.arithm.BitShiftOp;
import org.emftext.language.arithm.Calc;
import org.emftext.language.arithm.Expr;
import org.emftext.language.arithm.MultiplicativeExpr;
import org.emftext.language.arithm.MultiplicativeExprChild;
import org.emftext.language.arithm.MultiplicativeOp;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmPackageImpl extends EPackageImpl implements ArithmPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass calcEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass exprEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass bitShiftExprEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass bitShiftExprChildEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass additiveExprEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass additiveExprChildEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass multiplicativeExprEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass multiplicativeExprChildEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass numberEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum bitShiftOpEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum additiveOpEEnum = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EEnum multiplicativeOpEEnum = null;

	/**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.emftext.language.arithm.ArithmPackage#eNS_URI
   * @see #init()
   * @generated
   */
	private ArithmPackageImpl() {
    super(eNS_URI, ArithmFactory.eINSTANCE);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static boolean isInited = false;

	/**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ArithmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
	public static ArithmPackage init() {
    if (isInited) return (ArithmPackage)EPackage.Registry.INSTANCE.getEPackage(ArithmPackage.eNS_URI);

    // Obtain or create and register package
    ArithmPackageImpl theArithmPackage = (ArithmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArithmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArithmPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theArithmPackage.createPackageContents();

    // Initialize created meta-data
    theArithmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theArithmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ArithmPackage.eNS_URI, theArithmPackage);
    return theArithmPackage;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getCalc() {
    return calcEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getCalc_Expr() {
    return (EReference)calcEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getExpr() {
    return exprEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBitShiftExpr() {
    return bitShiftExprEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getBitShiftExpr_Children() {
    return (EReference)bitShiftExprEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getBitShiftExpr_Operators() {
    return (EAttribute)bitShiftExprEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getBitShiftExprChild() {
    return bitShiftExprChildEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAdditiveExpr() {
    return additiveExprEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getAdditiveExpr_Children() {
    return (EReference)additiveExprEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getAdditiveExpr_Operators() {
    return (EAttribute)additiveExprEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getAdditiveExprChild() {
    return additiveExprChildEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMultiplicativeExpr() {
    return multiplicativeExprEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EReference getMultiplicativeExpr_Children() {
    return (EReference)multiplicativeExprEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getMultiplicativeExpr_Operators() {
    return (EAttribute)multiplicativeExprEClass.getEStructuralFeatures().get(1);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMultiplicativeExprChild() {
    return multiplicativeExprChildEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getNumber() {
    return numberEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EAttribute getNumber_Value() {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getBitShiftOp() {
    return bitShiftOpEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getAdditiveOp() {
    return additiveOpEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EEnum getMultiplicativeOp() {
    return multiplicativeOpEEnum;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ArithmFactory getArithmFactory() {
    return (ArithmFactory)getEFactoryInstance();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isCreated = false;

	/**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    calcEClass = createEClass(CALC);
    createEReference(calcEClass, CALC__EXPR);

    exprEClass = createEClass(EXPR);

    bitShiftExprEClass = createEClass(BIT_SHIFT_EXPR);
    createEReference(bitShiftExprEClass, BIT_SHIFT_EXPR__CHILDREN);
    createEAttribute(bitShiftExprEClass, BIT_SHIFT_EXPR__OPERATORS);

    bitShiftExprChildEClass = createEClass(BIT_SHIFT_EXPR_CHILD);

    additiveExprEClass = createEClass(ADDITIVE_EXPR);
    createEReference(additiveExprEClass, ADDITIVE_EXPR__CHILDREN);
    createEAttribute(additiveExprEClass, ADDITIVE_EXPR__OPERATORS);

    additiveExprChildEClass = createEClass(ADDITIVE_EXPR_CHILD);

    multiplicativeExprEClass = createEClass(MULTIPLICATIVE_EXPR);
    createEReference(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__CHILDREN);
    createEAttribute(multiplicativeExprEClass, MULTIPLICATIVE_EXPR__OPERATORS);

    multiplicativeExprChildEClass = createEClass(MULTIPLICATIVE_EXPR_CHILD);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__VALUE);

    // Create enums
    bitShiftOpEEnum = createEEnum(BIT_SHIFT_OP);
    additiveOpEEnum = createEEnum(ADDITIVE_OP);
    multiplicativeOpEEnum = createEEnum(MULTIPLICATIVE_OP);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private boolean isInitialized = false;

	/**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bitShiftExprEClass.getESuperTypes().add(this.getExpr());
    bitShiftExprChildEClass.getESuperTypes().add(this.getExpr());
    additiveExprEClass.getESuperTypes().add(this.getBitShiftExprChild());
    additiveExprChildEClass.getESuperTypes().add(this.getBitShiftExprChild());
    multiplicativeExprEClass.getESuperTypes().add(this.getAdditiveExprChild());
    multiplicativeExprChildEClass.getESuperTypes().add(this.getAdditiveExprChild());
    numberEClass.getESuperTypes().add(this.getMultiplicativeExprChild());

    // Initialize classes and features; add operations and parameters
    initEClass(calcEClass, Calc.class, "Calc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCalc_Expr(), this.getExpr(), null, "expr", null, 1, -1, Calc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprEClass, Expr.class, "Expr", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bitShiftExprEClass, BitShiftExpr.class, "BitShiftExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBitShiftExpr_Children(), this.getBitShiftExprChild(), null, "children", null, 2, -1, BitShiftExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBitShiftExpr_Operators(), this.getBitShiftOp(), "operators", null, 1, -1, BitShiftExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bitShiftExprChildEClass, BitShiftExprChild.class, "BitShiftExprChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(additiveExprEClass, AdditiveExpr.class, "AdditiveExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpr_Children(), this.getAdditiveExprChild(), null, "children", null, 2, -1, AdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpr_Operators(), this.getAdditiveOp(), "operators", null, 1, -1, AdditiveExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExprChildEClass, AdditiveExprChild.class, "AdditiveExprChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multiplicativeExprEClass, MultiplicativeExpr.class, "MultiplicativeExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplicativeExpr_Children(), this.getMultiplicativeExprChild(), null, "children", null, 2, -1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplicativeExpr_Operators(), this.getMultiplicativeOp(), "operators", null, 1, -1, MultiplicativeExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicativeExprChildEClass, MultiplicativeExprChild.class, "MultiplicativeExprChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberEClass, org.emftext.language.arithm.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumber_Value(), ecorePackage.getEInt(), "value", null, 1, 1, org.emftext.language.arithm.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(bitShiftOpEEnum, BitShiftOp.class, "BitShiftOp");
    addEEnumLiteral(bitShiftOpEEnum, BitShiftOp.LEFT);
    addEEnumLiteral(bitShiftOpEEnum, BitShiftOp.RIGHT);

    initEEnum(additiveOpEEnum, AdditiveOp.class, "AdditiveOp");
    addEEnumLiteral(additiveOpEEnum, AdditiveOp.ADD);
    addEEnumLiteral(additiveOpEEnum, AdditiveOp.SUB);

    initEEnum(multiplicativeOpEEnum, MultiplicativeOp.class, "MultiplicativeOp");
    addEEnumLiteral(multiplicativeOpEEnum, MultiplicativeOp.MUL);
    addEEnumLiteral(multiplicativeOpEEnum, MultiplicativeOp.DIV);

    // Create resource
    createResource(eNS_URI);
  }

} //ArithmPackageImpl
