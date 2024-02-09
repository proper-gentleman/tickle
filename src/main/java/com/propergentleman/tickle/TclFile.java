package com.propergentleman.tickle;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class TclFile extends PsiFileBase {
    public TclFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, TclLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return TclFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "TCL File";
    }
}
