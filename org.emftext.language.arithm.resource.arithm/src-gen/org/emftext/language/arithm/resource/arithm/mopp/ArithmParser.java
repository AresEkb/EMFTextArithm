// $ANTLR 3.4

	package org.emftext.language.arithm.resource.arithm.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ArithmParser extends ArithmANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "TEXT", "WHITESPACE", "'*'", "'+'", "','", "'-'", "'/'", "'<<'", "'>>'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int LINEBREAK=4;
    public static final int TEXT=5;
    public static final int WHITESPACE=6;

    // delegates
    public ArithmANTLRParserBase[] getDelegates() {
        return new ArithmANTLRParserBase[] {};
    }

    // delegators


    public ArithmParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ArithmParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.initializeRuleMemo(23 + 1);
         

    }

    public String[] getTokenNames() { return ArithmParser.tokenNames; }
    public String getGrammarFileName() { return "Arithm.g"; }


    	private org.emftext.language.arithm.resource.arithm.IArithmTokenResolverFactory tokenResolverFactory = new org.emftext.language.arithm.resource.arithm.mopp.ArithmTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal> expectedElements = new java.util.ArrayList<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>() {
    			public boolean execute(org.emftext.language.arithm.resource.arithm.IArithmTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new org.emftext.language.arithm.resource.arithm.IArithmProblem() {
    					public org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity getSeverity() {
    						return org.emftext.language.arithm.resource.arithm.ArithmEProblemSeverity.ERROR;
    					}
    					public org.emftext.language.arithm.resource.arithm.ArithmEProblemType getType() {
    						return org.emftext.language.arithm.resource.arithm.ArithmEProblemType.SYNTAX_ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, column, line, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		int terminalID = ids[0];
    		int followSetID = ids[1];
    		org.emftext.language.arithm.resource.arithm.IArithmExpectedElement terminal = org.emftext.language.arithm.resource.arithm.grammar.ArithmFollowSetProvider.TERMINALS[terminalID];
    		org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[] containmentFeatures = new org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[ids.length - 2];
    		for (int i = 2; i < ids.length; i++) {
    			containmentFeatures[i - 2] = org.emftext.language.arithm.resource.arithm.grammar.ArithmFollowSetProvider.LINKS[ids[i]];
    		}
    		org.emftext.language.arithm.resource.arithm.grammar.ArithmContainmentTrace containmentTrace = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainmentTrace(eClass, containmentFeatures);
    		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    		org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal expectedElement = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal(container, terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    			this.expectedElementsIndexOfLastCompleteElement = 0;
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>() {
    			public boolean execute(org.emftext.language.arithm.resource.arithm.IArithmTextResource resource) {
    				org.emftext.language.arithm.resource.arithm.IArithmLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharStart(target, locationMap.getCharStart(source));
    				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
    				locationMap.setColumn(target, locationMap.getColumn(source));
    				locationMap.setLine(target, locationMap.getLine(source));
    				return true;
    			}
    		});
    	}
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>() {
    			public boolean execute(org.emftext.language.arithm.resource.arithm.IArithmTextResource resource) {
    				org.emftext.language.arithm.resource.arithm.IArithmLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
    				locationMap.setCharStart(target, source.getStartIndex());
    				locationMap.setCharEnd(target, source.getStopIndex());
    				locationMap.setColumn(target, source.getCharPositionInLine());
    				locationMap.setLine(target, source.getLine());
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		if (disableLocationMap) {
    			return;
    		}
    		postParseCommands.add(new org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>() {
    			public boolean execute(org.emftext.language.arithm.resource.arithm.IArithmTextResource resource) {
    				org.emftext.language.arithm.resource.arithm.IArithmLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public org.emftext.language.arithm.resource.arithm.IArithmTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new ArithmParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ArithmLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new ArithmParser(new org.antlr.runtime3_4_0.CommonTokenStream(new ArithmLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			new org.emftext.language.arithm.resource.arithm.util.ArithmRuntimeUtil().logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public ArithmParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((ArithmLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((ArithmLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == org.emftext.language.arithm.Calc.class) {
    				return parse_org_emftext_language_arithm_Calc();
    			}
    			if (type.getInstanceClass() == org.emftext.language.arithm.BitShiftExpr.class) {
    				return parse_org_emftext_language_arithm_BitShiftExpr();
    			}
    			if (type.getInstanceClass() == org.emftext.language.arithm.AdditiveExpr.class) {
    				return parse_org_emftext_language_arithm_AdditiveExpr();
    			}
    			if (type.getInstanceClass() == org.emftext.language.arithm.MultiplicativeExpr.class) {
    				return parse_org_emftext_language_arithm_MultiplicativeExpr();
    			}
    			if (type.getInstanceClass() == org.emftext.language.arithm.Number.class) {
    				return parse_org_emftext_language_arithm_Number();
    			}
    		}
    		throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmUnexpectedContentTypeException(typeObject);
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(org.emftext.language.arithm.resource.arithm.IArithmOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public org.emftext.language.arithm.resource.arithm.IArithmParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource>>();
    		org.emftext.language.arithm.resource.arithm.mopp.ArithmParseResult parseResult = new org.emftext.language.arithm.resource.arithm.mopp.ArithmParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.emftext.language.arithm.resource.arithm.IArithmTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
    		org.emftext.language.arithm.resource.arithm.IArithmParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContentsInternal().add(root);
    			}
    			for (org.emftext.language.arithm.resource.arithm.IArithmCommand<org.emftext.language.arithm.resource.arithm.IArithmTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal>();
    		java.util.List<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal> newFollowSet = new java.util.ArrayList<org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 18;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getType() < 0) {
    				break;
    			}
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (org.emftext.language.arithm.resource.arithm.util.ArithmPair<org.emftext.language.arithm.resource.arithm.IArithmExpectedElement, org.emftext.language.arithm.resource.arithm.mopp.ArithmContainedFeature[]> newFollowerPair : newFollowers) {
    							org.emftext.language.arithm.resource.arithm.IArithmExpectedElement newFollower = newFollowerPair.getLeft();
    							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
    							org.emftext.language.arithm.resource.arithm.grammar.ArithmContainmentTrace containmentTrace = new org.emftext.language.arithm.resource.arithm.grammar.ArithmContainmentTrace(null, newFollowerPair.getRight());
    							org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal newFollowTerminal = new org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal(container, newFollower, followSetID, containmentTrace);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			String expectedTokenName = formatTokenName(mte.expecting);
    			String actualTokenName = formatTokenName(e.token.getType());
    			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
    			String expectedTokenName = formatTokenName(mtne.expecting);
    			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parser is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
    			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
    			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
    			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
    			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
    			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
    			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
    			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
    			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
    			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
    		}
    		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
    	}
    	
    	private void startIncompleteElement(Object object) {
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
    		}
    	}
    	
    	private void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			boolean exists = this.incompleteObjects.remove(object);
    			if (!exists) {
    			}
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
    		if (incompleteObjects.isEmpty()) {
    			return null;
    		}
    		return incompleteObjects.get(incompleteObjects.size() - 1);
    	}
    	



    // $ANTLR start "start"
    // Arithm.g:511:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_arithm_Calc ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.arithm.Calc c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Arithm.g:512:2: ( (c0= parse_org_emftext_language_arithm_Calc ) EOF )
            // Arithm.g:513:2: (c0= parse_org_emftext_language_arithm_Calc ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Arithm.g:518:2: (c0= parse_org_emftext_language_arithm_Calc )
            // Arithm.g:519:3: c0= parse_org_emftext_language_arithm_Calc
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_Calc_in_start82);
            c0=parse_org_emftext_language_arithm_Calc();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_emftext_language_arithm_Calc"
    // Arithm.g:527:1: parse_org_emftext_language_arithm_Calc returns [org.emftext.language.arithm.Calc element = null] : (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )* ;
    public final org.emftext.language.arithm.Calc parse_org_emftext_language_arithm_Calc() throws RecognitionException {
        org.emftext.language.arithm.Calc element =  null;

        int parse_org_emftext_language_arithm_Calc_StartIndex = input.index();

        Token a1=null;
        org.emftext.language.arithm.Expr a0_0 =null;

        org.emftext.language.arithm.Expr a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Arithm.g:530:2: ( (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )* )
            // Arithm.g:531:2: (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )*
            {
            // Arithm.g:531:2: (a0_0= parse_org_emftext_language_arithm_Expr )
            // Arithm.g:532:3: a0_0= parse_org_emftext_language_arithm_Expr
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc119);
            a0_0=parse_org_emftext_language_arithm_Expr();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createCalc();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					addObjectToList(element, org.emftext.language.arithm.ArithmPackage.CALC__EXPR, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_0_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[1]);
            	}

            // Arithm.g:557:2: ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Arithm.g:558:3: (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) )
            	    {
            	    // Arithm.g:558:3: (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) )
            	    // Arithm.g:559:4: a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr )
            	    {
            	    a1=(Token)match(input,9,FOLLOW_9_in_parse_org_emftext_language_arithm_Calc146); if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    				if (element == null) {
            	    					element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createCalc();
            	    					startIncompleteElement(element);
            	    				}
            	    				collectHiddenTokens(element);
            	    				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_0_0_0_1_0_0_0, null, true);
            	    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	    			}

            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[2]);
            	    			}

            	    // Arithm.g:573:4: (a2_0= parse_org_emftext_language_arithm_Expr )
            	    // Arithm.g:574:5: a2_0= parse_org_emftext_language_arithm_Expr
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc172);
            	    a2_0=parse_org_emftext_language_arithm_Expr();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createCalc();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a2_0 != null) {
            	    						if (a2_0 != null) {
            	    							Object value = a2_0;
            	    							addObjectToList(element, org.emftext.language.arithm.ArithmPackage.CALC__EXPR, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_0_0_0_1_0_0_1, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[3]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[4]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parse_org_emftext_language_arithm_Calc_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_Calc"



    // $ANTLR start "parse_org_emftext_language_arithm_BitShiftExpr"
    // Arithm.g:608:1: parse_org_emftext_language_arithm_BitShiftExpr returns [org.emftext.language.arithm.BitShiftExpr element = null] : (a0_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ( ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ) )+ ;
    public final org.emftext.language.arithm.BitShiftExpr parse_org_emftext_language_arithm_BitShiftExpr() throws RecognitionException {
        org.emftext.language.arithm.BitShiftExpr element =  null;

        int parse_org_emftext_language_arithm_BitShiftExpr_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        org.emftext.language.arithm.BitShiftExprChild a0_0 =null;

        org.emftext.language.arithm.BitShiftExprChild a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Arithm.g:611:2: ( (a0_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ( ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ) )+ )
            // Arithm.g:612:2: (a0_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ( ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ) )+
            {
            // Arithm.g:612:2: (a0_0= parse_org_emftext_language_arithm_BitShiftExprChild )
            // Arithm.g:613:3: a0_0= parse_org_emftext_language_arithm_BitShiftExprChild
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_BitShiftExprChild_in_parse_org_emftext_language_arithm_BitShiftExpr232);
            a0_0=parse_org_emftext_language_arithm_BitShiftExprChild();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createBitShiftExpr();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					addObjectToList(element, org.emftext.language.arithm.ArithmPackage.BIT_SHIFT_EXPR__CHILDREN, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[5]);
            	}

            // Arithm.g:638:2: ( ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= 12 && LA3_0 <= 13)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Arithm.g:639:3: ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) )
            	    {
            	    // Arithm.g:639:3: ( ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild ) )
            	    // Arithm.g:640:4: ( (a1= '<<' |a2= '>>' ) ) (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild )
            	    {
            	    // Arithm.g:640:4: ( (a1= '<<' |a2= '>>' ) )
            	    // Arithm.g:641:5: (a1= '<<' |a2= '>>' )
            	    {
            	    // Arithm.g:641:5: (a1= '<<' |a2= '>>' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==12) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==13) ) {
            	        alt2=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // Arithm.g:642:6: a1= '<<'
            	            {
            	            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_emftext_language_arithm_BitShiftExpr272); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createBitShiftExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getBitShiftOp().getEEnumLiteral(org.emftext.language.arithm.BitShiftOp.LEFT_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.BIT_SHIFT_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;
            	        case 2 :
            	            // Arithm.g:655:12: a2= '>>'
            	            {
            	            a2=(Token)match(input,13,FOLLOW_13_in_parse_org_emftext_language_arithm_BitShiftExpr291); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createBitShiftExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getBitShiftOp().getEEnumLiteral(org.emftext.language.arithm.BitShiftOp.RIGHT_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.BIT_SHIFT_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getBitShiftExpr(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[6]);
            	    			}

            	    // Arithm.g:675:4: (a5_0= parse_org_emftext_language_arithm_BitShiftExprChild )
            	    // Arithm.g:676:5: a5_0= parse_org_emftext_language_arithm_BitShiftExprChild
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_BitShiftExprChild_in_parse_org_emftext_language_arithm_BitShiftExpr328);
            	    a5_0=parse_org_emftext_language_arithm_BitShiftExprChild();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createBitShiftExpr();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, org.emftext.language.arithm.ArithmPackage.BIT_SHIFT_EXPR__CHILDREN, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[7]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[8]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[10]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_arithm_BitShiftExpr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_BitShiftExpr"



    // $ANTLR start "parse_org_emftext_language_arithm_AdditiveExpr"
    // Arithm.g:712:1: parse_org_emftext_language_arithm_AdditiveExpr returns [org.emftext.language.arithm.AdditiveExpr element = null] : (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+ ;
    public final org.emftext.language.arithm.AdditiveExpr parse_org_emftext_language_arithm_AdditiveExpr() throws RecognitionException {
        org.emftext.language.arithm.AdditiveExpr element =  null;

        int parse_org_emftext_language_arithm_AdditiveExpr_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        org.emftext.language.arithm.AdditiveExprChild a0_0 =null;

        org.emftext.language.arithm.AdditiveExprChild a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Arithm.g:715:2: ( (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+ )
            // Arithm.g:716:2: (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+
            {
            // Arithm.g:716:2: (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            // Arithm.g:717:3: a0_0= parse_org_emftext_language_arithm_AdditiveExprChild
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr388);
            a0_0=parse_org_emftext_language_arithm_AdditiveExprChild();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					addObjectToList(element, org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__CHILDREN, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[11]);
            	}

            // Arithm.g:742:2: ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==8||LA5_0==10) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Arithm.g:743:3: ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) )
            	    {
            	    // Arithm.g:743:3: ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) )
            	    // Arithm.g:744:4: ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            	    {
            	    // Arithm.g:744:4: ( (a1= '+' |a2= '-' ) )
            	    // Arithm.g:745:5: (a1= '+' |a2= '-' )
            	    {
            	    // Arithm.g:745:5: (a1= '+' |a2= '-' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==8) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==10) ) {
            	        alt4=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // Arithm.g:746:6: a1= '+'
            	            {
            	            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_emftext_language_arithm_AdditiveExpr428); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveOp().getEEnumLiteral(org.emftext.language.arithm.AdditiveOp.ADD_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;
            	        case 2 :
            	            // Arithm.g:759:12: a2= '-'
            	            {
            	            a2=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_arithm_AdditiveExpr447); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveOp().getEEnumLiteral(org.emftext.language.arithm.AdditiveOp.SUB_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[12]);
            	    			}

            	    // Arithm.g:779:4: (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            	    // Arithm.g:780:5: a5_0= parse_org_emftext_language_arithm_AdditiveExprChild
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr484);
            	    a5_0=parse_org_emftext_language_arithm_AdditiveExprChild();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__CHILDREN, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[13]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[14]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[15]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[16]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[17]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[18]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_arithm_AdditiveExpr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_AdditiveExpr"



    // $ANTLR start "parse_org_emftext_language_arithm_MultiplicativeExpr"
    // Arithm.g:818:1: parse_org_emftext_language_arithm_MultiplicativeExpr returns [org.emftext.language.arithm.MultiplicativeExpr element = null] : (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+ ;
    public final org.emftext.language.arithm.MultiplicativeExpr parse_org_emftext_language_arithm_MultiplicativeExpr() throws RecognitionException {
        org.emftext.language.arithm.MultiplicativeExpr element =  null;

        int parse_org_emftext_language_arithm_MultiplicativeExpr_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        org.emftext.language.arithm.MultiplicativeExprChild a0_0 =null;

        org.emftext.language.arithm.MultiplicativeExprChild a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Arithm.g:821:2: ( (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+ )
            // Arithm.g:822:2: (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+
            {
            // Arithm.g:822:2: (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            // Arithm.g:823:3: a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr544);
            a0_0=parse_org_emftext_language_arithm_MultiplicativeExprChild();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            				startIncompleteElement(element);
            			}
            			if (a0_0 != null) {
            				if (a0_0 != null) {
            					Object value = a0_0;
            					addObjectToList(element, org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__CHILDREN, value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[19]);
            	}

            // Arithm.g:848:2: ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==7||LA7_0==11) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Arithm.g:849:3: ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) )
            	    {
            	    // Arithm.g:849:3: ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) )
            	    // Arithm.g:850:4: ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            	    {
            	    // Arithm.g:850:4: ( (a1= '*' |a2= '/' ) )
            	    // Arithm.g:851:5: (a1= '*' |a2= '/' )
            	    {
            	    // Arithm.g:851:5: (a1= '*' |a2= '/' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==7) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==11) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // Arithm.g:852:6: a1= '*'
            	            {
            	            a1=(Token)match(input,7,FOLLOW_7_in_parse_org_emftext_language_arithm_MultiplicativeExpr584); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeOp().getEEnumLiteral(org.emftext.language.arithm.MultiplicativeOp.MUL_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;
            	        case 2 :
            	            // Arithm.g:865:12: a2= '/'
            	            {
            	            a2=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_arithm_MultiplicativeExpr603); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeOp().getEEnumLiteral(org.emftext.language.arithm.MultiplicativeOp.DIV_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;

            	    }


            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[20]);
            	    			}

            	    // Arithm.g:885:4: (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            	    // Arithm.g:886:5: a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr640);
            	    a5_0=parse_org_emftext_language_arithm_MultiplicativeExprChild();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
            	    					if (terminateParsing) {
            	    						throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            	    					}
            	    					if (element == null) {
            	    						element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            	    						startIncompleteElement(element);
            	    					}
            	    					if (a5_0 != null) {
            	    						if (a5_0 != null) {
            	    							Object value = a5_0;
            	    							addObjectToList(element, org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__CHILDREN, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_1_0_0_1, a5_0, true);
            	    						copyLocalizationInfos(a5_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[21]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[22]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[23]);
            	    				addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[24]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[25]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[26]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[27]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[28]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_arithm_MultiplicativeExpr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_MultiplicativeExpr"



    // $ANTLR start "parse_org_emftext_language_arithm_Number"
    // Arithm.g:926:1: parse_org_emftext_language_arithm_Number returns [org.emftext.language.arithm.Number element = null] : (a0= TEXT ) ;
    public final org.emftext.language.arithm.Number parse_org_emftext_language_arithm_Number() throws RecognitionException {
        org.emftext.language.arithm.Number element =  null;

        int parse_org_emftext_language_arithm_Number_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Arithm.g:929:2: ( (a0= TEXT ) )
            // Arithm.g:930:2: (a0= TEXT )
            {
            // Arithm.g:930:2: (a0= TEXT )
            // Arithm.g:931:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_arithm_Number700); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            			if (terminateParsing) {
            				throw new org.emftext.language.arithm.resource.arithm.mopp.ArithmTerminateParsingException();
            			}
            			if (element == null) {
            				element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createNumber();
            				startIncompleteElement(element);
            			}
            			if (a0 != null) {
            				org.emftext.language.arithm.resource.arithm.IArithmTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
            				tokenResolver.setOptions(getOptions());
            				org.emftext.language.arithm.resource.arithm.IArithmTokenResolveResult result = getFreshTokenResolveResult();
            				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.NUMBER__VALUE), result);
            				Object resolvedObject = result.getResolvedToken();
            				if (resolvedObject == null) {
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
            				}
            				java.lang.Integer resolved = (java.lang.Integer) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.emftext.language.arithm.ArithmPackage.NUMBER__VALUE), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_4_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[29]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[30]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[31]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[32]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_arithm_Number_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_Number"



    // $ANTLR start "parse_org_emftext_language_arithm_Expr"
    // Arithm.g:971:1: parse_org_emftext_language_arithm_Expr returns [org.emftext.language.arithm.Expr element = null] : (c0= parse_org_emftext_language_arithm_BitShiftExpr |c1= parse_org_emftext_language_arithm_AdditiveExpr |c2= parse_org_emftext_language_arithm_MultiplicativeExpr |c3= parse_org_emftext_language_arithm_Number );
    public final org.emftext.language.arithm.Expr parse_org_emftext_language_arithm_Expr() throws RecognitionException {
        org.emftext.language.arithm.Expr element =  null;

        int parse_org_emftext_language_arithm_Expr_StartIndex = input.index();

        org.emftext.language.arithm.BitShiftExpr c0 =null;

        org.emftext.language.arithm.AdditiveExpr c1 =null;

        org.emftext.language.arithm.MultiplicativeExpr c2 =null;

        org.emftext.language.arithm.Number c3 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Arithm.g:972:2: (c0= parse_org_emftext_language_arithm_BitShiftExpr |c1= parse_org_emftext_language_arithm_AdditiveExpr |c2= parse_org_emftext_language_arithm_MultiplicativeExpr |c3= parse_org_emftext_language_arithm_Number )
            int alt8=4;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // Arithm.g:973:2: c0= parse_org_emftext_language_arithm_BitShiftExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_BitShiftExpr_in_parse_org_emftext_language_arithm_Expr732);
                    c0=parse_org_emftext_language_arithm_BitShiftExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Arithm.g:974:4: c1= parse_org_emftext_language_arithm_AdditiveExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_Expr742);
                    c1=parse_org_emftext_language_arithm_AdditiveExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Arithm.g:975:4: c2= parse_org_emftext_language_arithm_MultiplicativeExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_Expr752);
                    c2=parse_org_emftext_language_arithm_MultiplicativeExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Arithm.g:976:4: c3= parse_org_emftext_language_arithm_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_Expr762);
                    c3=parse_org_emftext_language_arithm_Number();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_arithm_Expr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_Expr"



    // $ANTLR start "parse_org_emftext_language_arithm_BitShiftExprChild"
    // Arithm.g:980:1: parse_org_emftext_language_arithm_BitShiftExprChild returns [org.emftext.language.arithm.BitShiftExprChild element = null] : (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number );
    public final org.emftext.language.arithm.BitShiftExprChild parse_org_emftext_language_arithm_BitShiftExprChild() throws RecognitionException {
        org.emftext.language.arithm.BitShiftExprChild element =  null;

        int parse_org_emftext_language_arithm_BitShiftExprChild_StartIndex = input.index();

        org.emftext.language.arithm.AdditiveExpr c0 =null;

        org.emftext.language.arithm.MultiplicativeExpr c1 =null;

        org.emftext.language.arithm.Number c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Arithm.g:981:2: (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Arithm.g:982:2: c0= parse_org_emftext_language_arithm_AdditiveExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_BitShiftExprChild783);
                    c0=parse_org_emftext_language_arithm_AdditiveExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Arithm.g:983:4: c1= parse_org_emftext_language_arithm_MultiplicativeExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_BitShiftExprChild793);
                    c1=parse_org_emftext_language_arithm_MultiplicativeExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Arithm.g:984:4: c2= parse_org_emftext_language_arithm_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_BitShiftExprChild803);
                    c2=parse_org_emftext_language_arithm_Number();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_arithm_BitShiftExprChild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_BitShiftExprChild"



    // $ANTLR start "parse_org_emftext_language_arithm_AdditiveExprChild"
    // Arithm.g:988:1: parse_org_emftext_language_arithm_AdditiveExprChild returns [org.emftext.language.arithm.AdditiveExprChild element = null] : (c0= parse_org_emftext_language_arithm_MultiplicativeExpr |c1= parse_org_emftext_language_arithm_Number );
    public final org.emftext.language.arithm.AdditiveExprChild parse_org_emftext_language_arithm_AdditiveExprChild() throws RecognitionException {
        org.emftext.language.arithm.AdditiveExprChild element =  null;

        int parse_org_emftext_language_arithm_AdditiveExprChild_StartIndex = input.index();

        org.emftext.language.arithm.MultiplicativeExpr c0 =null;

        org.emftext.language.arithm.Number c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }

            // Arithm.g:989:2: (c0= parse_org_emftext_language_arithm_MultiplicativeExpr |c1= parse_org_emftext_language_arithm_Number )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TEXT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==7||LA10_1==11) ) {
                    alt10=1;
                }
                else if ( (LA10_1==EOF||(LA10_1 >= 8 && LA10_1 <= 10)||(LA10_1 >= 12 && LA10_1 <= 13)) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // Arithm.g:990:2: c0= parse_org_emftext_language_arithm_MultiplicativeExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_AdditiveExprChild824);
                    c0=parse_org_emftext_language_arithm_MultiplicativeExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Arithm.g:991:4: c1= parse_org_emftext_language_arithm_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_AdditiveExprChild834);
                    c1=parse_org_emftext_language_arithm_Number();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, parse_org_emftext_language_arithm_AdditiveExprChild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_AdditiveExprChild"



    // $ANTLR start "parse_org_emftext_language_arithm_MultiplicativeExprChild"
    // Arithm.g:995:1: parse_org_emftext_language_arithm_MultiplicativeExprChild returns [org.emftext.language.arithm.MultiplicativeExprChild element = null] : c0= parse_org_emftext_language_arithm_Number ;
    public final org.emftext.language.arithm.MultiplicativeExprChild parse_org_emftext_language_arithm_MultiplicativeExprChild() throws RecognitionException {
        org.emftext.language.arithm.MultiplicativeExprChild element =  null;

        int parse_org_emftext_language_arithm_MultiplicativeExprChild_StartIndex = input.index();

        org.emftext.language.arithm.Number c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }

            // Arithm.g:996:2: (c0= parse_org_emftext_language_arithm_Number )
            // Arithm.g:997:2: c0= parse_org_emftext_language_arithm_Number
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_MultiplicativeExprChild855);
            c0=parse_org_emftext_language_arithm_Number();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, parse_org_emftext_language_arithm_MultiplicativeExprChild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_MultiplicativeExprChild"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA8_eotS =
        "\17\uffff";
    static final String DFA8_eofS =
        "\1\uffff\1\7\6\uffff\1\12\1\15\4\uffff\1\15";
    static final String DFA8_minS =
        "\1\5\1\7\4\5\2\uffff\2\7\1\uffff\2\5\1\uffff\1\7";
    static final String DFA8_maxS =
        "\1\5\1\15\4\5\2\uffff\2\15\1\uffff\2\5\1\uffff\1\15";
    static final String DFA8_acceptS =
        "\6\uffff\1\1\1\4\2\uffff\1\3\2\uffff\1\2\1\uffff";
    static final String DFA8_specialS =
        "\17\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1",
            "\1\2\1\4\1\7\1\5\1\3\2\6",
            "\1\10",
            "\1\10",
            "\1\11",
            "\1\11",
            "",
            "",
            "\1\2\1\4\1\12\1\5\1\3\2\6",
            "\1\13\1\4\1\15\1\5\1\14\2\6",
            "",
            "\1\16",
            "\1\16",
            "",
            "\1\13\1\4\1\15\1\5\1\14\2\6"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "971:1: parse_org_emftext_language_arithm_Expr returns [org.emftext.language.arithm.Expr element = null] : (c0= parse_org_emftext_language_arithm_BitShiftExpr |c1= parse_org_emftext_language_arithm_AdditiveExpr |c2= parse_org_emftext_language_arithm_MultiplicativeExpr |c3= parse_org_emftext_language_arithm_Number );";
        }
    }
    static final String DFA9_eotS =
        "\10\uffff";
    static final String DFA9_eofS =
        "\1\uffff\1\5\4\uffff\1\7\1\uffff";
    static final String DFA9_minS =
        "\1\5\1\7\2\5\2\uffff\1\7\1\uffff";
    static final String DFA9_maxS =
        "\1\5\1\15\2\5\2\uffff\1\15\1\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2";
    static final String DFA9_specialS =
        "\10\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1",
            "\1\2\1\4\1\5\1\4\1\3\2\5",
            "\1\6",
            "\1\6",
            "",
            "",
            "\1\2\1\4\1\7\1\4\1\3\2\7",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "980:1: parse_org_emftext_language_arithm_BitShiftExprChild returns [org.emftext.language.arithm.BitShiftExprChild element = null] : (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number );";
        }
    }
 

    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Calc_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc119 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_parse_org_emftext_language_arithm_Calc146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc172 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_BitShiftExprChild_in_parse_org_emftext_language_arithm_BitShiftExpr232 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_parse_org_emftext_language_arithm_BitShiftExpr272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13_in_parse_org_emftext_language_arithm_BitShiftExpr291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_BitShiftExprChild_in_parse_org_emftext_language_arithm_BitShiftExpr328 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr388 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_parse_org_emftext_language_arithm_AdditiveExpr428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_arithm_AdditiveExpr447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr484 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr544 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_7_in_parse_org_emftext_language_arithm_MultiplicativeExpr584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_arithm_MultiplicativeExpr603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr640 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_arithm_Number700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_BitShiftExpr_in_parse_org_emftext_language_arithm_Expr732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_Expr742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_Expr752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_Expr762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_BitShiftExprChild783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_BitShiftExprChild793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_BitShiftExprChild803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_AdditiveExprChild824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_AdditiveExprChild834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_MultiplicativeExprChild855 = new BitSet(new long[]{0x0000000000000002L});

}