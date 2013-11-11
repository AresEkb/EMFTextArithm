/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmOutlinePageExpandAllAction extends org.emftext.language.arithm.resource.arithm.ui.AbstractArithmOutlinePageAction {
	
	public ArithmOutlinePageExpandAllAction(org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
