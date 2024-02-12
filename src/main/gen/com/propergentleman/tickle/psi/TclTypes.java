// This is a generated file. Not intended for manual editing.
package com.propergentleman.tickle.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.propergentleman.tickle.psi.impl.*;

public interface TclTypes {

  IElementType PROPERTY = new TclElementType("PROPERTY");
  IElementType KEYWORD = new TclTokenType("KEYWORD");
  IElementType COMMENT = new TclTokenType("COMMENT");
  IElementType CRLF = new TclTokenType("CRLF");
  IElementType KEY = new TclTokenType("KEY");
  IElementType SEPARATOR = new TclTokenType("SEPARATOR");
  IElementType VALUE = new TclTokenType("VALUE");
  IElementType COMMAND = new TclTokenType("COMMAND");
  IElementType STRING = new TclTokenType("STRING");
  IElementType VARIABLE = new TclTokenType("VARIABLE");
  IElementType FLAG = new TclTokenType("FLAG");
  IElementType OPERATOR = new TclTokenType("OPERATOR");
  IElementType PAREN = new TclTokenType("PAREN");
  IElementType BRACKET = new TclTokenType("BRACKET");
  IElementType NAMESPACE = new TclTokenType("NAMESPACE");
  IElementType BLOCK = new TclTokenType("BLOCK");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new TclPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
