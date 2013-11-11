/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmOutlinePageLinkWithEditorAction extends org.emftext.language.arithm.resource.arithm.ui.AbstractArithmOutlinePageAction {
	
	public ArithmOutlinePageLinkWithEditorAction(org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
