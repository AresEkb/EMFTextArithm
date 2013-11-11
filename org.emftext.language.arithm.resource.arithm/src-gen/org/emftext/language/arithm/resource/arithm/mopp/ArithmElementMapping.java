/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

/**
 * A basic implementation of the
 * org.emftext.language.arithm.resource.arithm.IArithmElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class ArithmElementMapping<ReferenceType> implements org.emftext.language.arithm.resource.arithm.IArithmElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public ArithmElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
