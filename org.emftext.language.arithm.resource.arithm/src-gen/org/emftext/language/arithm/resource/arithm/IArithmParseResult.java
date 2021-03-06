/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IArithmParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>> getPostParseCommands();
	
}
