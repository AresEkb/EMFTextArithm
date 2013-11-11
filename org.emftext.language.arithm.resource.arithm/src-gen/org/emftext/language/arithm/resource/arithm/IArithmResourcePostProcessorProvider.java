/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IArithmResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.emftext.language.arithm.resource.arithm.IArithmResourcePostProcessor getResourcePostProcessor();
	
}
