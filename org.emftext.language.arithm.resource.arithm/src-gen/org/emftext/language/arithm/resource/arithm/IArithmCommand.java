/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IArithmCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
