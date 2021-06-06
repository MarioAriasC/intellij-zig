// This is a generated file. Not intended for manual editing.
package org.ziglang.plugins.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.ziglang.plugins.lang.psi.ZigTypes.*;
import org.ziglang.plugins.lang.ZigFnDeclarationMixin;
import org.ziglang.plugins.lang.psi.*;

public class ZigFnDeclarationImpl extends ZigFnDeclarationMixin implements ZigFnDeclaration {

  public ZigFnDeclarationImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ZigVisitor visitor) {
    visitor.visitFnDeclaration(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ZigVisitor) accept((ZigVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ZigBlock getBlock() {
    return findNotNullChildByClass(ZigBlock.class);
  }

  @Override
  @NotNull
  public ZigFnProto getFnProto() {
    return findNotNullChildByClass(ZigFnProto.class);
  }

}
