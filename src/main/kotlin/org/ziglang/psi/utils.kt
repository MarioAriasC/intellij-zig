package org.ziglang.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType

fun PsiElement.prevSiblingTypeIgnoring(
  type: IElementType,
  vararg types: IElementType
): PsiElement? {
  var next: PsiElement? = prevSibling
  while (true) {
    val localNext = next ?: return null
    next = localNext.prevSibling
    return if (types.any { localNext.node.elementType == it }) continue
    else localNext.takeIf { it.node.elementType == type }
  }
}