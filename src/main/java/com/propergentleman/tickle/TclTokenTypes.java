package com.propergentleman.tickle;

import com.intellij.psi.tree.IElementType;

public interface TclTokenTypes {
    IElementType WHITE_SPACE = new TclTokenType("WHITE_SPACE");
    IElementType KEYWORD = new TclTokenType("KEYWORD");
    IElementType IDENTIFIER = new TclTokenType("IDENTIFIER");
    IElementType COMMENT = new TclTokenType("COMMENT");
    IElementType VARIABLE = new TclTokenType("VARIABLE");
    IElementType COMMAND_SUBSTITUTION = new TclTokenType("COMMAND_SUBSTITUTION");
    IElementType BRACES = new TclTokenType("BRACES");
    IElementType STRING = new TclTokenType("STRING");
    // Add more token types as needed for your lexer implementation
}
