/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmBracketInformationProvider {
	
	public class BracketPair implements org.emftext.language.arithm.resource.arithm.IArithmBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmBracketPair> getBracketPairs() {
		java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmBracketPair> result = new java.util.ArrayList<org.emftext.language.arithm.resource.arithm.IArithmBracketPair>();
		return result;
	}
	
}
