package com.propergentleman.tickle;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.propergentleman.tickle.psi.TclTypes;
import com.intellij.psi.TokenType;

%%

%class TclLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return TokenType.WHITE_SPACE;
%eof}

// Regular expressions for basic Tcl elements
WhiteSpace = [ \t\f]+
NewLine = \r|\n|\r\n
Comment = \#.*{NewLine}
Command = [a-zA-Z_][a-zA-Z0-9_]*

// Tcl specific tokens
Variable = \$[a-zA-Z_][a-zA-Z0-9_]*
VariableBrace = \$\{[^}]*\}
StringDouble = \"(\\["\\]|[^\n"\\])*\"
StringBrace = \{[^\}]*\}
Bracket = \[[^\]]*\]
Paren = \([^\)]*\)
Operator = [\+\-\*/%=&\|<>\^~!]
Namespace        = [a-zA-Z_][a-zA-Z0-9_]*(::[a-zA-Z_][a-zA-Z0-9_]*)+
Block            = \{([^}]*\{[^}]*\}[^}]*)*\}
LineContinuation = \\{NewLine}

// Add a pattern for Tcl keywords
Keyword = "if"|"then"|"else"|"elseif"|"while"|"for"|"foreach"|"break"|"continue"|"proc"|"return"|"eval"|"set"|"expr"|"switch"|"default"|"case"|"catch"|"throw"|"package"|"require"|"set"

%%

// Rules for matching tokens
<YYINITIAL> {
  {Comment}                      { return TclTypes.COMMENT; }
  {Keyword}                      { return TclTypes.KEYWORD; }
  {StringDouble}                 { return TclTypes.STRING; }
  {StringBrace}                  { return TclTypes.STRING; }
  {Variable}                     { return TclTypes.VARIABLE; }
  {VariableBrace}                { return TclTypes.VARIABLE; }
  {Bracket}                      { return TclTypes.BRACKET; }
  {Paren}                        { return TclTypes.PAREN; }
  {Operator}                     { return TclTypes.OPERATOR; }
  {Namespace}                    { return TclTypes.NAMESPACE; }
  {Block}                        { return TclTypes.BLOCK; }
  {LineContinuation}             { return TokenType.WHITE_SPACE; }
  {Command}                      { return TclTypes.COMMAND; }
  {WhiteSpace}                   { return TokenType.WHITE_SPACE; }
  {NewLine}                      { return TokenType.WHITE_SPACE; }
  .                              { return TokenType.BAD_CHARACTER; }
}