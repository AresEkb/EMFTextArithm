/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm;

public interface IArithmProblem {
	public String getMessage();
	public org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity getSeverity();
	public org.emftext.language.arithm.resource.arithm.ArithmEProblemType getType();
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmQuickFix> getQuickFixes();
}
