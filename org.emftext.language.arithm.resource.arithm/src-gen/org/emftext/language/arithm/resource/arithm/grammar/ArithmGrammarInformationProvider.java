/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ArithmGrammarInformationProvider INSTANCE = new ArithmGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_0_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.CALC__EXPR), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getExpr(), }, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword ARITHM_0_0_0_1_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword(",", org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_0_0_0_1_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.CALC__EXPR), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getExpr(), }, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_0_0_0_1_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_0_0_0_1_0_0_0, ARITHM_0_0_0_1_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_0_0_0_1_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_0_0_0_1_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound ARITHM_0_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound(ARITHM_0_0_0_1_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.STAR);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_0_0_0_0, ARITHM_0_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_0_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmRule ARITHM_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmRule(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(), ARITHM_0_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_1_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__CHILDREN), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExprChild(), }, 1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal ARITHM_1_0_0_1_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__OPERATORS), new String[] {"ADD", "+", "SUB", "-", }, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_1_0_0_1_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__CHILDREN), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExprChild(), }, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_1_0_0_1_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_1_0_0_1_0_0_0, ARITHM_1_0_0_1_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_1_0_0_1_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_1_0_0_1_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound ARITHM_1_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound(ARITHM_1_0_0_1_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.PLUS);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_1_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_1_0_0_0, ARITHM_1_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_1_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_1_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmRule ARITHM_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmRule(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), ARITHM_1_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_2_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__CHILDREN), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExprChild(), }, 1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal ARITHM_2_0_0_1_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__OPERATORS), new String[] {"MUL", "*", "DIV", "/", }, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment ARITHM_2_0_0_1_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainment(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__CHILDREN), org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExprChild(), }, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_2_0_0_1_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_2_0_0_1_0_0_0, ARITHM_2_0_0_1_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_2_0_0_1_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_2_0_0_1_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound ARITHM_2_0_0_1 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmCompound(ARITHM_2_0_0_1_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.PLUS);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_2_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_2_0_0_0, ARITHM_2_0_0_1);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_2_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_2_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmRule ARITHM_2 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmRule(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), ARITHM_2_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmPlaceholder ARITHM_3_0_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmPlaceholder(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.NUMBER__VALUE), "TEXT", org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, 0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence ARITHM_3_0_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_3_0_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice ARITHM_3_0 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE, ARITHM_3_0_0);
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmRule ARITHM_3 = new org.emftext.language.arithm.resource.arithm.grammar.ArithmRule(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(), ARITHM_3_0, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality.ONE);
	
	public static String getSyntaxElementID(org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement) org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.emftext.language.arithm.resource.arithm.grammar.ArithmRule[] RULES = new org.emftext.language.arithm.resource.arithm.grammar.ArithmRule[] {
		ARITHM_0,
		ARITHM_1,
		ARITHM_2,
		ARITHM_3,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.emftext.language.arithm.resource.arithm.grammar.ArithmRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword) {
			keywords.add(((org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword) element).getValue());
		} else if (element instanceof org.emftext.language.arithm.resource.arithm.grammar.ArithmBooleanTerminal) {
			keywords.add(((org.emftext.language.arithm.resource.arithm.grammar.ArithmBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.emftext.language.arithm.resource.arithm.grammar.ArithmBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal) {
			org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal terminal = (org.emftext.language.arithm.resource.arithm.grammar.ArithmEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
