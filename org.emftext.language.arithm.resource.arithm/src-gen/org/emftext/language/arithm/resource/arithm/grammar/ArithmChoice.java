/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmChoice extends org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement {
	
	public ArithmChoice(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.emftext.language.arithm.resource.arithm.util.ArithmStringUtil.explode(getChildren(), "|");
	}
	
}
