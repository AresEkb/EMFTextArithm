/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmCompound extends org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement {
	
	public ArithmCompound(org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice choice, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality) {
		super(cardinality, new org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
