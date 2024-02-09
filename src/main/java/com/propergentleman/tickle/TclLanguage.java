package com.propergentleman.tickle;

import com.intellij.lang.Language;

public class TclLanguage extends Language {
    public static final TclLanguage INSTANCE = new TclLanguage();

    private TclLanguage() {
        super("TCL");
    }
}
