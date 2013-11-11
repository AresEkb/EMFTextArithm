/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmOutlinePageLexicalSortingAction extends org.emftext.language.arithm.resource.arithm.ui.AbstractArithmOutlinePageAction {
	
	public ArithmOutlinePageLexicalSortingAction(org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
