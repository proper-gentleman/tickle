package com.propergentleman.tickle;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.propergentleman.tickle.parser.TclParser;
import com.propergentleman.tickle.psi.TclTypes;
import org.jetbrains.annotations.NotNull;

final class TclParserDefinition implements ParserDefinition {

    public static final IFileElementType FILE = new IFileElementType(TclLanguage.INSTANCE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new TclLexerAdapter();
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TclTokenSets.COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiParser createParser(final Project project) {
        return new TclParser();
    }

    @NotNull
    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public PsiFile createFile(@NotNull FileViewProvider viewProvider) {
        return new TclFile(viewProvider);
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return TclTypes.Factory.createElement(node);
    }

}