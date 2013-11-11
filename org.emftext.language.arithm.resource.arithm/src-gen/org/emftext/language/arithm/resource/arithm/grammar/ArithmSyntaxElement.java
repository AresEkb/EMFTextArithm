/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ArithmSyntaxElement {
	
	private ArithmSyntaxElement[] children;
	private ArithmSyntaxElement parent;
	private org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality;
	
	public ArithmSyntaxElement(org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, ArithmSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ArithmSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(ArithmSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public ArithmSyntaxElement getParent() {
		return parent;
	}
	
	public ArithmSyntaxElement[] getChildren() {
		if (children == null) {
			return new ArithmSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality getCardinality() {
		return cardinality;
	}
	
}
