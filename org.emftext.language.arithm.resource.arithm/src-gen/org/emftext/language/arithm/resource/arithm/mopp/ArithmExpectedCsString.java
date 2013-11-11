/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ArithmExpectedCsString extends org.emftext.language.arithm.resource.arithm.mopp.ArithmAbstractExpectedElement {
	
	private org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword keyword;
	
	public ArithmExpectedCsString(org.emftext.language.arithm.resource.arithm.grammar.ArithmKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.emftext.language.arithm.resource.arithm.grammar.ArithmSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ArithmExpectedCsString) {
			return getValue().equals(((ArithmExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
