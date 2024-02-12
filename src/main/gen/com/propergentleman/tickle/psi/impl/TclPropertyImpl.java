// This is a generated file. Not intended for manual editing.
package com.propergentleman.tickle.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.propergentleman.tickle.psi.TclTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.propergentleman.tickle.psi.*;

public class TclPropertyImpl extends ASTWrapperPsiElement implements TclProperty {

  public TclPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull TclVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof TclVisitor) accept((TclVisitor)visitor);
    else super.accept(visitor);
  }

}
