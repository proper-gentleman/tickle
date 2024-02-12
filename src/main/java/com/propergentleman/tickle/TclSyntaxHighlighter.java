package com.propergentleman.tickle;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.propergentleman.tickle.psi.TclTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class TclSyntaxHighlighter extends SyntaxHighlighterBase {
    // Existing definitions
    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("TCL_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("TCL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER =
            createTextAttributesKey("TCL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    // Added definitions
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("TCL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey STRING =
            createTextAttributesKey("TCL_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey VARIABLE =
            createTextAttributesKey("TCL_VARIABLE", DefaultLanguageHighlighterColors.GLOBAL_VARIABLE);
    public static final TextAttributesKey FLAG =
            createTextAttributesKey("TCL_FLAG", DefaultLanguageHighlighterColors.METADATA);
    public static final TextAttributesKey OPERATOR =
            createTextAttributesKey("TCL_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey PAREN =
            createTextAttributesKey("TCL_PAREN", DefaultLanguageHighlighterColors.PARENTHESES);
    public static final TextAttributesKey BRACKET =
            createTextAttributesKey("TCL_BRACKET", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey NAMESPACE =
            createTextAttributesKey("TCL_NAMESPACE", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey BLOCK =
            createTextAttributesKey("TCL_BLOCK", DefaultLanguageHighlighterColors.BRACES);


    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] VARIABLE_KEYS = new TextAttributesKey[]{VARIABLE};
    private static final TextAttributesKey[] FLAG_KEYS = new TextAttributesKey[]{FLAG};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] PAREN_KEYS = new TextAttributesKey[]{PAREN};
    private static final TextAttributesKey[] BRACKET_KEYS = new TextAttributesKey[]{BRACKET};
    private static final TextAttributesKey[] NAMESPACE_KEYS = new TextAttributesKey[]{NAMESPACE};
    private static final TextAttributesKey[] BLOCK_KEYS = new TextAttributesKey[]{BLOCK};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};





    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TclLexerAdapter();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (tokenType.equals(TclTypes.KEYWORD)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(TclTypes.OPERATOR)) {
            return OPERATOR_KEYS;
        } else if (tokenType.equals(TclTypes.NAMESPACE)) {
            return NAMESPACE_KEYS;
        } else if (tokenType.equals(TclTypes.BLOCK)) {
            return BLOCK_KEYS;
        } else if (tokenType.equals(TclTypes.PAREN)) {
            return PAREN_KEYS;
        } else if (tokenType.equals(TclTypes.BRACKET)) {
            return BRACKET_KEYS;
        } else if (tokenType.equals(TclTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(TclTypes.VARIABLE)) {
            return VARIABLE_KEYS;
        } else if (tokenType.equals(TclTypes.FLAG)) {
            return FLAG_KEYS;
        } else if (tokenType.equals(TclTypes.STRING)) {
            return STRING_KEYS;
        } else if (tokenType.equals(TclTypes.COMMENT)) {
            return COMMENT_KEYS;
        }
        return EMPTY_KEYS;
    }

}

