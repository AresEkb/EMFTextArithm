/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(),
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getBitShiftExpr(),
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(),
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(),
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getNumber(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(),
		};
	}
	
}
