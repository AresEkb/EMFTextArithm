/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmParseResult implements org.emftext.language.arithm.resource.arithm.IArithmParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>> commands = new java.util.ArrayList<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>>();
	
	public ArithmParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
