/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IArithmExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.emftext.language.arithm.resource.arithm.IArithmExpectedElement follower, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>> getFollowers();
	
}
