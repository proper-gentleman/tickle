package com.propergentleman.tickle.psi;

import com.intellij.psi.tree.IElementType;
import com.propergentleman.tickle.TclLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class TclElementType extends IElementType {
    public TclElementType(@NotNull @NonNls String debugName) {
        super(debugName, TclLanguage.INSTANCE);
    }
}
