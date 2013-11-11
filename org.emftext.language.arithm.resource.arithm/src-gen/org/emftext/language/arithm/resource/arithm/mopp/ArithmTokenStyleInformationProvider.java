/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public org.emftext.language.arithm.resource.arithm.IArithmTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("TASK_ITEM".equals(tokenName)) {
			return new org.emftext.language.arithm.resource.arithm.mopp.ArithmTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
