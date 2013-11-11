/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmOutlinePageCollapseAllAction extends org.emftext.language.arithm.resource.arithm.ui.AbstractArithmOutlinePageAction {
	
	public ArithmOutlinePageCollapseAllAction(org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
