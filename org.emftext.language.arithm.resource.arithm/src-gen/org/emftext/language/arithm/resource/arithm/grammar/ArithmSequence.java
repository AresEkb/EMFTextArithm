/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmSequence extends org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement {
	
	public ArithmSequence(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.emftext.language.arithm.resource.arithm.util.ArithmStringUtil.explode(getChildren(), " ");
	}
	
}
