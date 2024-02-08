package com.propergentleman.tickle;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TclTokenType extends IElementType {
    public TclTokenType(@NotNull @NonNls String debugName) {
        super(debugName, TclLanguage.INSTANCE);
    }
}
