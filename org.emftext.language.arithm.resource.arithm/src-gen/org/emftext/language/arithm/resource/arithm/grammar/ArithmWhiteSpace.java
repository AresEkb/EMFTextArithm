/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmWhiteSpace extends org.emftext.language.arithm.resource.arithm.grammar.ArithmFormattingElement {
	
	private final int amount;
	
	public ArithmWhiteSpace(int amount, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
