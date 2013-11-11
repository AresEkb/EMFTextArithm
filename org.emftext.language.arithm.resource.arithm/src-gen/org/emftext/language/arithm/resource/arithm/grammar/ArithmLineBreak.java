/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmLineBreak extends org.emftext.language.arithm.resource.arithm.grammar.ArithmFormattingElement {
	
	private final int tabs;
	
	public ArithmLineBreak(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
