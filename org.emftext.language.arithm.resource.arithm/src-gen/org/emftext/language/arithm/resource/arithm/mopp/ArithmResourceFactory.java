/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ArithmResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmResource(uri);
	}
	
}
