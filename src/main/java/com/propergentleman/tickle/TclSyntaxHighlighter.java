package com.propergentleman.tickle;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class TclSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("TCL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("TCL_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    // Add more TextAttributesKey for different token types...

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new TclLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(TclTokenTypes.KEYWORD)) {
            return new TextAttributesKey[]{KEYWORD};
        } else if (tokenType.equals(TclTokenTypes.COMMENT)) {
            return new TextAttributesKey[]{COMMENT};
        }
        // Handle more token types...
        return TextAttributesKey.EMPTY_ARRAY;
    }
}
