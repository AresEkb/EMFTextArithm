/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmUIMetaInformation extends org.emftext.language.arithm.resource.arithm.mopp.ArithmMetaInformation {
	
	public org.emftext.language.arithm.resource.arithm.IArithmHoverTextProvider getHoverTextProvider() {
		return new org.emftext.language.arithm.resource.arithm.ui.ArithmHoverTextProvider();
	}
	
	public org.emftext.language.arithm.resource.arithm.ui.ArithmImageProvider getImageProvider() {
		return org.emftext.language.arithm.resource.arithm.ui.ArithmImageProvider.INSTANCE;
	}
	
	public org.emftext.language.arithm.resource.arithm.ui.ArithmColorManager createColorManager() {
		return new org.emftext.language.arithm.resource.arithm.ui.ArithmColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(org.emftext.language.arithm.resource.arithm.IArithmTextResour
	 * ce, org.emftext.language.arithm.resource.arithm.ui.ArithmColorManager) instead.
	 */
	public org.emftext.language.arithm.resource.arithm.ui.ArithmTokenScanner createTokenScanner(org.emftext.language.arithm.resource.arithm.ui.ArithmColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public org.emftext.language.arithm.resource.arithm.ui.ArithmTokenScanner createTokenScanner(org.emftext.language.arithm.resource.arithm.IArithmTextResource resource, org.emftext.language.arithm.resource.arithm.ui.ArithmColorManager colorManager) {
		return new org.emftext.language.arithm.resource.arithm.ui.ArithmTokenScanner(resource, colorManager);
	}
	
	public org.emftext.language.arithm.resource.arithm.ui.ArithmCodeCompletionHelper createCodeCompletionHelper() {
		return new org.emftext.language.arithm.resource.arithm.ui.ArithmCodeCompletionHelper();
	}
	
}
