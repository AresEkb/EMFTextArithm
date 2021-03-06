/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmQuickAssistAssistant extends org.eclipse.jface.text.quickassist.QuickAssistAssistant implements org.eclipse.jface.text.quickassist.IQuickAssistAssistant {
	
	public ArithmQuickAssistAssistant(org.emftext.language.arithm.resource.arithm.IArithmResourceProvider resourceProvider, org.emftext.language.arithm.resource.arithm.ui.IArithmAnnotationModelProvider annotationModelProvider) {
		setQuickAssistProcessor(new org.emftext.language.arithm.resource.arithm.ui.ArithmQuickAssistProcessor(resourceProvider, annotationModelProvider));
		setInformationControlCreator(new org.eclipse.jface.text.AbstractReusableInformationControlCreator() {
			public org.eclipse.jface.text.IInformationControl doCreateInformationControl(org.eclipse.swt.widgets.Shell parent) {
				return new org.eclipse.jface.text.DefaultInformationControl(parent, (org.eclipse.jface.text.DefaultInformationControl.IInformationPresenter) null);
			}
		});
	}
	
	public boolean canAssist(org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext invocationContext) {
		return false;
	}
	
	public boolean canFix(org.eclipse.jface.text.source.Annotation annotation) {
		return true;
	}
	
}
