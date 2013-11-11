/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmHoverTextProvider implements org.emftext.language.arithm.resource.arithm.IArithmHoverTextProvider {
	
	private org.emftext.language.arithm.resource.arithm.ui.ArithmDefaultHoverTextProvider defaultProvider = new org.emftext.language.arithm.resource.arithm.ui.ArithmDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
