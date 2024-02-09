package com.propergentleman.tickle.psi;

import com.intellij.psi.tree.IElementType;
import com.propergentleman.tickle.TclLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TclTokenType extends IElementType {
    public TclTokenType(@NonNls @NotNull String debugName) {
        super(debugName, TclLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "TclTokenType." + super.toString();
    }
}
