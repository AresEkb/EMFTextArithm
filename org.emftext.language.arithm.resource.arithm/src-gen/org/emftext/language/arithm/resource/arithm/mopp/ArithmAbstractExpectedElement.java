/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ArithmAbstractExpectedElement implements org.emftext.language.arithm.resource.arithm.IArithmExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>> followers = new java.util.LinkedHashSet<org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>>();
	
	public ArithmAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.emftext.language.arithm.resource.arithm.IArithmExpectedElement follower, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] path) {
		followers.add(new org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
