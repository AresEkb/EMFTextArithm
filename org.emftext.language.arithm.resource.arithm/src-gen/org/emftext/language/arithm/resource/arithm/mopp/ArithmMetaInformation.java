/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

public class ArithmMetaInformation implements org.emftext.language.arithm.resource.arithm.IArithmMetaInformation {
	
	public String getSyntaxName() {
		return "arithm";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/arithm";
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTextScanner createLexer() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmAntlrScanner(new org.emftext.language.arithm.resource.arithm.mopp.ArithmLexer());
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmParser().createInstance(inputStream, encoding);
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTextPrinter createPrinter(java.io.OutputStream outputStream, org.emftext.language.arithm.resource.arithm.IArithmTextResource resource) {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmReferenceResolverSwitch();
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTokenResolverFactory getTokenResolverFactory() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.arithm/metamodel/arithm.cs";
	}
	
	public String[] getTokenNames() {
		return org.emftext.language.arithm.resource.arithm.mopp.ArithmParser.tokenNames;
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmBracketPair> getBracketPairs() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmResourceFactory();
	}
	
	public org.emftext.language.arithm.resource.arithm.mopp.ArithmNewFileContentProvider getNewFileContentProvider() {
		return new org.emftext.language.arithm.resource.arithm.mopp.ArithmNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.emftext.language.arithm.resource.arithm.mopp.ArithmResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.emftext.language.arithm.resource.arithm.ui.launchConfigurationType";
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmNameProvider createNameProvider() {
		return new org.emftext.language.arithm.resource.arithm.analysis.ArithmDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.emftext.language.arithm.resource.arithm.mopp.ArithmAntlrTokenHelper tokenHelper = new org.emftext.language.arithm.resource.arithm.mopp.ArithmAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.emftext.language.arithm.resource.arithm.mopp.ArithmTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
