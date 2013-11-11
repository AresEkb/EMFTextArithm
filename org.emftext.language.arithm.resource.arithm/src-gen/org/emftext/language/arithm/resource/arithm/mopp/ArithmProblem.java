/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmProblem implements org.emftext.language.arithm.resource.arithm.IArithmProblem {
	
	private String message;
	private org.emftext.language.arithm.resource.arithm.ArithmEProblemType type;
	private org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity severity;
	private java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmQuickFix> quickFixes;
	
	public ArithmProblem(String message, org.emftext.language.arithm.resource.arithm.ArithmEProblemType type, org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.emftext.language.arithm.resource.arithm.IArithmQuickFix>emptySet());
	}
	
	public ArithmProblem(String message, org.emftext.language.arithm.resource.arithm.ArithmEProblemType type, org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity severity, org.emftext.language.arithm.resource.arithm.IArithmQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ArithmProblem(String message, org.emftext.language.arithm.resource.arithm.ArithmEProblemType type, org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity severity, java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.emftext.language.arithm.resource.arithm.IArithmQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.emftext.language.arithm.resource.arithm.ArithmEProblemType getType() {
		return type;
	}
	
	public org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
