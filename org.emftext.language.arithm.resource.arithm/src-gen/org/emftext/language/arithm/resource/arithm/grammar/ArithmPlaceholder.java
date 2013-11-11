/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ArithmPlaceholder extends org.emftext.language.arithm.resource.arithm.grammar.ArithmTerminal {
	
	private final String tokenName;
	
	public ArithmPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
