/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ArithmProposalPostProcessor {
	
	public java.util.List<org.emftext.language.arithm.resource.arithm.ui.ArithmCompletionProposal> process(java.util.List<org.emftext.language.arithm.resource.arithm.ui.ArithmCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
