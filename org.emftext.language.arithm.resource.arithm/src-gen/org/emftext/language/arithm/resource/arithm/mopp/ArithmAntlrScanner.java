/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmAntlrScanner implements org.emftext.language.arithm.resource.arithm.IArithmTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public ArithmAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.emftext.language.arithm.resource.arithm.IArithmTextToken result = new org.emftext.language.arithm.resource.arithm.mopp.ArithmANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
