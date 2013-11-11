/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.grammar;

public class ArithmContainment extends org.emftext.language.arithm.resource.arithm.grammar.ArithmTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public ArithmContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.emftext.language.arithm.resource.arithm.grammar.ArithmCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.emftext.language.arithm.resource.arithm.util.ArithmStringUtil.explode(allowedTypes, ", ", new org.emftext.language.arithm.resource.arithm.IArithmFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
