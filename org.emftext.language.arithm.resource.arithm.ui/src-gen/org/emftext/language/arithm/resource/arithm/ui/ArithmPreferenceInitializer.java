/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.ui;

/**
 * A class used to initialize default preference values.
 */
public class ArithmPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.arithm.resource.arithm.ui.ArithmUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.arithm.resource.arithm.ui.ArithmUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new org.emftext.language.arithm.resource.arithm.mopp.ArithmMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = org.emftext.language.arithm.resource.arithm.ui.ArithmUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new org.emftext.language.arithm.resource.arithm.mopp.ArithmMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, org.emftext.language.arithm.resource.arithm.IArithmMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		org.emftext.language.arithm.resource.arithm.ui.ArithmBracketSet bracketSet = new org.emftext.language.arithm.resource.arithm.ui.ArithmBracketSet(null, null);
		final java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (org.emftext.language.arithm.resource.arithm.IArithmBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + org.emftext.language.arithm.resource.arithm.ui.ArithmPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, org.emftext.language.arithm.resource.arithm.mopp.ArithmMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			org.emftext.language.arithm.resource.arithm.IArithmTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, org.emftext.language.arithm.resource.arithm.ui.ArithmSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
