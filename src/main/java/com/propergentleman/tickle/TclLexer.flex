package com.propergentleman.tickle;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.lexer.FlexLexer;

%%
%class TclLexer
%unicode
%public
%type IElementType
%implements FlexLexer

LineTerminator = \r|\n|\r\n
Whitespace = [ \t\f]+
Identifier = [a-zA-Z_][a-zA-Z0-9_]*
Keyword = "if" | "then" | "else" | "elseif" | "while" | "for" | "proc"
Comment = \#.*{LineTerminator}
Variable = \$[a-zA-Z_][a-zA-Z0-9_]* | \$\{[^}]+\}
CommandSubstitution = \[[^\]]+\]
Braces = \{[^\}]*\}
String = \"[^\"]*\"


%%

{Whitespace}               { return TclTokenTypes.WHITE_SPACE; }
{Keyword}                  { return TclTokenTypes.KEYWORD; }
{Identifier}               { return TclTokenTypes.IDENTIFIER; }
{Comment}                  { return TclTokenTypes.COMMENT; }
{Variable}                 { return TclTokenTypes.VARIABLE; }
{CommandSubstitution}      { return TclTokenTypes.COMMAND_SUBSTITUTION; }
{Braces}                   { return TclTokenTypes.BRACES; }
{String}                   { return TclTokenTypes.STRING; }

.                          { return TokenType.BAD_CHARACTER; }
