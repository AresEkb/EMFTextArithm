/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.arithm.resource.arithm.mopp;

/**
 * The ArithmTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class ArithmTokenResolverFactory implements org.emftext.language.arithm.resource.arithm.IArithmTokenResolverFactory {
	
	private java.util.Map<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver> featureName2CollectInTokenResolver;
	private static org.emftext.language.arithm.resource.arithm.IArithmTokenResolver defaultResolver = new org.emftext.language.arithm.resource.arithm.analysis.ArithmDefaultTokenResolver();
	
	public ArithmTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver>();
		registerTokenResolver("TEXT", new org.emftext.language.arithm.resource.arithm.analysis.ArithmTEXTTokenResolver());
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.emftext.language.arithm.resource.arithm.IArithmTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.emftext.language.arithm.resource.arithm.IArithmTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.emftext.language.arithm.resource.arithm.IArithmTokenResolver internalCreateResolver(java.util.Map<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver> resolverMap, String key, org.emftext.language.arithm.resource.arithm.IArithmTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
