/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

public class ArithmOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new org.emftext.language.arithm.resource.arithm.ui.ArithmOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
