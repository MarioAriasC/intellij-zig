// This is a generated file. Not intended for manual editing.
package org.ziglang.plugins.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface ZigArrayExpr extends ZigExpr {

  @NotNull
  List<ZigExpr> getExprList();

  @NotNull
  ZigTypeExpr getTypeExpr();

}
