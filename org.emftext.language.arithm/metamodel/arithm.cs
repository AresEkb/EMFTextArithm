SYNTAXDEF arithm
FOR <http://www.emftext.org/language/arithm>
START Calc

OPTIONS {
	reloadGeneratorModel = "true";
	generateCodeFromGeneratorModel = "true";
}

RULES {
	Calc ::= expr ("," expr)*;
	BitShiftExpr ::= children (operators[LEFT : "<<", RIGHT : ">>"] children)+;
	AdditiveExpr ::= children (operators[ADD : "+", SUB : "-"] children)+;
	MultiplicativeExpr ::= children (operators[MUL : "*", DIV : "/"] children)+;
	Number ::= value[];
}
