package com.propergentleman.tickle;

import com.intellij.lexer.FlexAdapter;

public class TclLexerAdapter extends FlexAdapter {
    public TclLexerAdapter() {
        super(new TclLexer(null));
    }
}
