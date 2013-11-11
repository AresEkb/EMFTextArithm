/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ArithmRule extends org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ArithmRule(org.eclipse.emf.ecore.EClass metaclass, org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice choice, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality) {
		super(cardinality, new org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice getDefinition() {
		return (org.emftext.language.arithm.resource.arithm.grammar.ArithmChoice) getChildren()[0];
	}
	
}

