/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.util;

/**
 * Class ArithmTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.
 */
public class ArithmTextResourceUtil {
	
	/**
	 * Use
	 * org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.arithm.resource.arithm.mopp.ArithmResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.emftext.language.arithm.resource.arithm.util.ArithmEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.arithm.resource.arithm.mopp.ArithmResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.arithm.resource.arithm.mopp.ArithmResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(
	 * ) instead.
	 */
	@Deprecated	
	public static org.emftext.language.arithm.resource.arithm.mopp.ArithmResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.emftext.language.arithm.resource.arithm.util.ArithmResourceUtil.getResource(uri, options);
	}
	
}
