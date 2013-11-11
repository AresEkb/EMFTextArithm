/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

/**
 * This class provides the follow sets for all terminals of the grammar. These
 * sets are used during code completion.
 */
public class ArithmFollowSetProvider {
	
	public final static org.emftext.language.arithm.resource.arithm.IArithmExpectedElement TERMINALS[] = new org.emftext.language.arithm.resource.arithm.IArithmExpectedElement[4];
	
	public final static org.eclipse.emf.ecore.EStructuralFeature[] FEATURES = new org.eclipse.emf.ecore.EStructuralFeature[3];
	
	public final static org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] LINKS = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[9];
	
	public final static org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] EMPTY_LINK_ARRAY = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[0];
	
	public static void initializeTerminals0() {
		TERMINALS[0] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedStructuralFeature(org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_0);
		TERMINALS[1] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedCsString(org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_0_0_0_1_0_0_0);
		TERMINALS[2] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedEnumerationTerminal(org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_0);
		TERMINALS[3] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedEnumerationTerminal(org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_0);
	}
	
	public static void initializeTerminals() {
		initializeTerminals0();
	}
	
	public static void initializeFeatures0() {
		FEATURES[0] = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__CHILDREN);
		FEATURES[1] = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__CHILDREN);
		FEATURES[2] = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.CALC__EXPR);
	}
	
	public static void initializeFeatures() {
		initializeFeatures0();
	}
	
	public static void initializeLinks0() {
		LINKS[0] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), FEATURES[0]);
		LINKS[1] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), FEATURES[1]);
		LINKS[2] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), FEATURES[2]);
		LINKS[3] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), FEATURES[0]);
		LINKS[4] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), FEATURES[1]);
		LINKS[5] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), FEATURES[2]);
		LINKS[6] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), FEATURES[0]);
		LINKS[7] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), FEATURES[1]);
		LINKS[8] = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), FEATURES[0]);
	}
	
	public static void initializeLinks() {
		initializeLinks0();
	}
	
	public static void wire0() {
		TERMINALS[1].addFollower(TERMINALS[0], new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] {new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), FEATURES[0]), new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), FEATURES[1]), new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), FEATURES[2]), });
		TERMINALS[0].addFollower(TERMINALS[1], EMPTY_LINK_ARRAY);
		TERMINALS[0].addFollower(TERMINALS[2], EMPTY_LINK_ARRAY);
		TERMINALS[0].addFollower(TERMINALS[3], EMPTY_LINK_ARRAY);
	}
	
	public static void wire() {
		wire0();
	}
	
	static {
		// initialize the arrays
		initializeTerminals();
		initializeFeatures();
		initializeLinks();
		// wire the terminals
		wire();
	}
}
