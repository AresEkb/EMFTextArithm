/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ArithmKeyword extends org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement {
	
	private final String value;
	
	public ArithmKeyword(String value, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
