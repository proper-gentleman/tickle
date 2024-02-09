package com.propergentleman.tickle;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class TclFileType extends LanguageFileType {
    public static final TclFileType INSTANCE = new TclFileType();


    private TclFileType() {
        super(TclLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "TCL File";
    }

    @Override
    public @NotNull String getDescription() {
        return "TCL language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "tcl";
    }

    @Override
    public Icon getIcon() {
        return TclIcons.FILE;
    }
}
