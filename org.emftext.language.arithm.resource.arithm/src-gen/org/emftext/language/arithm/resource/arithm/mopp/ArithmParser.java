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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LINEBREAK", "TEXT", "WHITESPACE", "'*'", "'+'", "','", "'-'", "'/'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
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
        this.state.initializeRuleMemo(16 + 1);
         

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
    		int followSetID = 14;
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
    // Arithm.g:508:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_emftext_language_arithm_Calc ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;

        int start_StartIndex = input.index();

        org.emftext.language.arithm.Calc c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }

            // Arithm.g:509:2: ( (c0= parse_org_emftext_language_arithm_Calc ) EOF )
            // Arithm.g:510:2: (c0= parse_org_emftext_language_arithm_Calc ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getCalc(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[0]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Arithm.g:515:2: (c0= parse_org_emftext_language_arithm_Calc )
            // Arithm.g:516:3: c0= parse_org_emftext_language_arithm_Calc
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
    // Arithm.g:524:1: parse_org_emftext_language_arithm_Calc returns [org.emftext.language.arithm.Calc element = null] : (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )* ;
    public final org.emftext.language.arithm.Calc parse_org_emftext_language_arithm_Calc() throws RecognitionException {
        org.emftext.language.arithm.Calc element =  null;

        int parse_org_emftext_language_arithm_Calc_StartIndex = input.index();

        Token a1=null;
        org.emftext.language.arithm.Expr a0_0 =null;

        org.emftext.language.arithm.Expr a2_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }

            // Arithm.g:527:2: ( (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )* )
            // Arithm.g:528:2: (a0_0= parse_org_emftext_language_arithm_Expr ) ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )*
            {
            // Arithm.g:528:2: (a0_0= parse_org_emftext_language_arithm_Expr )
            // Arithm.g:529:3: a0_0= parse_org_emftext_language_arithm_Expr
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

            // Arithm.g:554:2: ( (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==9) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Arithm.g:555:3: (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) )
            	    {
            	    // Arithm.g:555:3: (a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr ) )
            	    // Arithm.g:556:4: a1= ',' (a2_0= parse_org_emftext_language_arithm_Expr )
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

            	    // Arithm.g:570:4: (a2_0= parse_org_emftext_language_arithm_Expr )
            	    // Arithm.g:571:5: a2_0= parse_org_emftext_language_arithm_Expr
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



    // $ANTLR start "parse_org_emftext_language_arithm_AdditiveExpr"
    // Arithm.g:605:1: parse_org_emftext_language_arithm_AdditiveExpr returns [org.emftext.language.arithm.AdditiveExpr element = null] : (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+ ;
    public final org.emftext.language.arithm.AdditiveExpr parse_org_emftext_language_arithm_AdditiveExpr() throws RecognitionException {
        org.emftext.language.arithm.AdditiveExpr element =  null;

        int parse_org_emftext_language_arithm_AdditiveExpr_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        org.emftext.language.arithm.AdditiveExprChild a0_0 =null;

        org.emftext.language.arithm.AdditiveExprChild a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }

            // Arithm.g:608:2: ( (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+ )
            // Arithm.g:609:2: (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+
            {
            // Arithm.g:609:2: (a0_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            // Arithm.g:610:3: a0_0= parse_org_emftext_language_arithm_AdditiveExprChild
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr232);
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
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[5]);
            	}

            // Arithm.g:635:2: ( ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==8||LA3_0==10) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Arithm.g:636:3: ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) )
            	    {
            	    // Arithm.g:636:3: ( ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild ) )
            	    // Arithm.g:637:4: ( (a1= '+' |a2= '-' ) ) (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            	    {
            	    // Arithm.g:637:4: ( (a1= '+' |a2= '-' ) )
            	    // Arithm.g:638:5: (a1= '+' |a2= '-' )
            	    {
            	    // Arithm.g:638:5: (a1= '+' |a2= '-' )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==8) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==10) ) {
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
            	            // Arithm.g:639:6: a1= '+'
            	            {
            	            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_emftext_language_arithm_AdditiveExpr272); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveOp().getEEnumLiteral(org.emftext.language.arithm.AdditiveOp.ADD_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.ADDITIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;
            	        case 2 :
            	            // Arithm.g:652:12: a2= '-'
            	            {
            	            a2=(Token)match(input,10,FOLLOW_10_in_parse_org_emftext_language_arithm_AdditiveExpr291); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createAdditiveExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_1_0_0_1_0_0_0, null, true);
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
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getAdditiveExpr(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[6]);
            	    			}

            	    // Arithm.g:672:4: (a5_0= parse_org_emftext_language_arithm_AdditiveExprChild )
            	    // Arithm.g:673:5: a5_0= parse_org_emftext_language_arithm_AdditiveExprChild
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr328);
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
            if ( state.backtracking>0 ) { memoize(input, 3, parse_org_emftext_language_arithm_AdditiveExpr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_AdditiveExpr"



    // $ANTLR start "parse_org_emftext_language_arithm_MultiplicativeExpr"
    // Arithm.g:709:1: parse_org_emftext_language_arithm_MultiplicativeExpr returns [org.emftext.language.arithm.MultiplicativeExpr element = null] : (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+ ;
    public final org.emftext.language.arithm.MultiplicativeExpr parse_org_emftext_language_arithm_MultiplicativeExpr() throws RecognitionException {
        org.emftext.language.arithm.MultiplicativeExpr element =  null;

        int parse_org_emftext_language_arithm_MultiplicativeExpr_StartIndex = input.index();

        Token a1=null;
        Token a2=null;
        org.emftext.language.arithm.MultiplicativeExprChild a0_0 =null;

        org.emftext.language.arithm.MultiplicativeExprChild a5_0 =null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }

            // Arithm.g:712:2: ( (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+ )
            // Arithm.g:713:2: (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+
            {
            // Arithm.g:713:2: (a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            // Arithm.g:714:3: a0_0= parse_org_emftext_language_arithm_MultiplicativeExprChild
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr388);
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
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_0, a0_0, true);
            				copyLocalizationInfos(a0_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[11]);
            	}

            // Arithm.g:739:2: ( ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==7||LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Arithm.g:740:3: ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) )
            	    {
            	    // Arithm.g:740:3: ( ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild ) )
            	    // Arithm.g:741:4: ( (a1= '*' |a2= '/' ) ) (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            	    {
            	    // Arithm.g:741:4: ( (a1= '*' |a2= '/' ) )
            	    // Arithm.g:742:5: (a1= '*' |a2= '/' )
            	    {
            	    // Arithm.g:742:5: (a1= '*' |a2= '/' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==7) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==11) ) {
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
            	            // Arithm.g:743:6: a1= '*'
            	            {
            	            a1=(Token)match(input,7,FOLLOW_7_in_parse_org_emftext_language_arithm_MultiplicativeExpr428); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_0, null, true);
            	            						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	            						// set value of enumeration attribute
            	            						Object value = org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeOp().getEEnumLiteral(org.emftext.language.arithm.MultiplicativeOp.MUL_VALUE).getInstance();
            	            						addObjectToList(element, org.emftext.language.arithm.ArithmPackage.MULTIPLICATIVE_EXPR__OPERATORS, value);
            	            						completedElement(value, false);
            	            					}

            	            }
            	            break;
            	        case 2 :
            	            // Arithm.g:756:12: a2= '/'
            	            {
            	            a2=(Token)match(input,11,FOLLOW_11_in_parse_org_emftext_language_arithm_MultiplicativeExpr447); if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
            	            						if (element == null) {
            	            							element = org.emftext.language.arithm.ArithmFactory.eINSTANCE.createMultiplicativeExpr();
            	            							startIncompleteElement(element);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_2_0_0_1_0_0_0, null, true);
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
            	    				addExpectedElement(org.emftext.language.arithm.ArithmPackage.eINSTANCE.getMultiplicativeExpr(), org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[12]);
            	    			}

            	    // Arithm.g:776:4: (a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild )
            	    // Arithm.g:777:5: a5_0= parse_org_emftext_language_arithm_MultiplicativeExprChild
            	    {
            	    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr484);
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
            if ( state.backtracking>0 ) { memoize(input, 4, parse_org_emftext_language_arithm_MultiplicativeExpr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_MultiplicativeExpr"



    // $ANTLR start "parse_org_emftext_language_arithm_Number"
    // Arithm.g:815:1: parse_org_emftext_language_arithm_Number returns [org.emftext.language.arithm.Number element = null] : (a0= TEXT ) ;
    public final org.emftext.language.arithm.Number parse_org_emftext_language_arithm_Number() throws RecognitionException {
        org.emftext.language.arithm.Number element =  null;

        int parse_org_emftext_language_arithm_Number_StartIndex = input.index();

        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }

            // Arithm.g:818:2: ( (a0= TEXT ) )
            // Arithm.g:819:2: (a0= TEXT )
            {
            // Arithm.g:819:2: (a0= TEXT )
            // Arithm.g:820:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_org_emftext_language_arithm_Number544); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, org.emftext.language.arithm.resource.arithm.grammar.ArithmGrammarInformationProvider.ARITHM_3_0_0_0, resolved, true);
            				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[19]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[20]);
            		addExpectedElement(null, org.emftext.language.arithm.resource.arithm.mopp.ArithmExpectationConstants.EXPECTATIONS[21]);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, parse_org_emftext_language_arithm_Number_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_Number"



    // $ANTLR start "parse_org_emftext_language_arithm_Expr"
    // Arithm.g:859:1: parse_org_emftext_language_arithm_Expr returns [org.emftext.language.arithm.Expr element = null] : (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number );
    public final org.emftext.language.arithm.Expr parse_org_emftext_language_arithm_Expr() throws RecognitionException {
        org.emftext.language.arithm.Expr element =  null;

        int parse_org_emftext_language_arithm_Expr_StartIndex = input.index();

        org.emftext.language.arithm.AdditiveExpr c0 =null;

        org.emftext.language.arithm.MultiplicativeExpr c1 =null;

        org.emftext.language.arithm.Number c2 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }

            // Arithm.g:860:2: (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // Arithm.g:861:2: c0= parse_org_emftext_language_arithm_AdditiveExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_Expr576);
                    c0=parse_org_emftext_language_arithm_AdditiveExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Arithm.g:862:4: c1= parse_org_emftext_language_arithm_MultiplicativeExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_Expr586);
                    c1=parse_org_emftext_language_arithm_MultiplicativeExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Arithm.g:863:4: c2= parse_org_emftext_language_arithm_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_Expr596);
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
            if ( state.backtracking>0 ) { memoize(input, 6, parse_org_emftext_language_arithm_Expr_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_Expr"



    // $ANTLR start "parse_org_emftext_language_arithm_AdditiveExprChild"
    // Arithm.g:867:1: parse_org_emftext_language_arithm_AdditiveExprChild returns [org.emftext.language.arithm.AdditiveExprChild element = null] : (c0= parse_org_emftext_language_arithm_MultiplicativeExpr |c1= parse_org_emftext_language_arithm_Number );
    public final org.emftext.language.arithm.AdditiveExprChild parse_org_emftext_language_arithm_AdditiveExprChild() throws RecognitionException {
        org.emftext.language.arithm.AdditiveExprChild element =  null;

        int parse_org_emftext_language_arithm_AdditiveExprChild_StartIndex = input.index();

        org.emftext.language.arithm.MultiplicativeExpr c0 =null;

        org.emftext.language.arithm.Number c1 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }

            // Arithm.g:868:2: (c0= parse_org_emftext_language_arithm_MultiplicativeExpr |c1= parse_org_emftext_language_arithm_Number )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==TEXT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==7||LA7_1==11) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||(LA7_1 >= 8 && LA7_1 <= 10)) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Arithm.g:869:2: c0= parse_org_emftext_language_arithm_MultiplicativeExpr
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_AdditiveExprChild617);
                    c0=parse_org_emftext_language_arithm_MultiplicativeExpr();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Arithm.g:870:4: c1= parse_org_emftext_language_arithm_Number
                    {
                    pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_AdditiveExprChild627);
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
            if ( state.backtracking>0 ) { memoize(input, 7, parse_org_emftext_language_arithm_AdditiveExprChild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_AdditiveExprChild"



    // $ANTLR start "parse_org_emftext_language_arithm_MultiplicativeExprChild"
    // Arithm.g:874:1: parse_org_emftext_language_arithm_MultiplicativeExprChild returns [org.emftext.language.arithm.MultiplicativeExprChild element = null] : c0= parse_org_emftext_language_arithm_Number ;
    public final org.emftext.language.arithm.MultiplicativeExprChild parse_org_emftext_language_arithm_MultiplicativeExprChild() throws RecognitionException {
        org.emftext.language.arithm.MultiplicativeExprChild element =  null;

        int parse_org_emftext_language_arithm_MultiplicativeExprChild_StartIndex = input.index();

        org.emftext.language.arithm.Number c0 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }

            // Arithm.g:875:2: (c0= parse_org_emftext_language_arithm_Number )
            // Arithm.g:876:2: c0= parse_org_emftext_language_arithm_Number
            {
            pushFollow(FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_MultiplicativeExprChild648);
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
            if ( state.backtracking>0 ) { memoize(input, 8, parse_org_emftext_language_arithm_MultiplicativeExprChild_StartIndex); }

        }
        return element;
    }
    // $ANTLR end "parse_org_emftext_language_arithm_MultiplicativeExprChild"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\10\uffff";
    static final String DFA6_eofS =
        "\1\uffff\1\5\4\uffff\1\7\1\uffff";
    static final String DFA6_minS =
        "\1\5\1\7\2\5\2\uffff\1\7\1\uffff";
    static final String DFA6_maxS =
        "\1\5\1\13\2\5\2\uffff\1\13\1\uffff";
    static final String DFA6_acceptS =
        "\4\uffff\1\1\1\3\1\uffff\1\2";
    static final String DFA6_specialS =
        "\10\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1",
            "\1\2\1\4\1\5\1\4\1\3",
            "\1\6",
            "\1\6",
            "",
            "",
            "\1\2\1\4\1\7\1\4\1\3",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "859:1: parse_org_emftext_language_arithm_Expr returns [org.emftext.language.arithm.Expr element = null] : (c0= parse_org_emftext_language_arithm_AdditiveExpr |c1= parse_org_emftext_language_arithm_MultiplicativeExpr |c2= parse_org_emftext_language_arithm_Number );";
        }
    }
 

    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Calc_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc119 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_9_in_parse_org_emftext_language_arithm_Calc146 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Expr_in_parse_org_emftext_language_arithm_Calc172 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr232 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_parse_org_emftext_language_arithm_AdditiveExpr272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10_in_parse_org_emftext_language_arithm_AdditiveExpr291 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExprChild_in_parse_org_emftext_language_arithm_AdditiveExpr328 = new BitSet(new long[]{0x0000000000000502L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr388 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_7_in_parse_org_emftext_language_arithm_MultiplicativeExpr428 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11_in_parse_org_emftext_language_arithm_MultiplicativeExpr447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExprChild_in_parse_org_emftext_language_arithm_MultiplicativeExpr484 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_TEXT_in_parse_org_emftext_language_arithm_Number544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_AdditiveExpr_in_parse_org_emftext_language_arithm_Expr576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_Expr586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_Expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_MultiplicativeExpr_in_parse_org_emftext_language_arithm_AdditiveExprChild617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_AdditiveExprChild627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_emftext_language_arithm_Number_in_parse_org_emftext_language_arithm_MultiplicativeExprChild648 = new BitSet(new long[]{0x0000000000000002L});

}