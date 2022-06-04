package com.github.inspired99.intellijjanet.lang

import com.github.inspired99.intellijjanet.lang.JanetLanguage
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.TokenSet
import org.jetbrains.annotations.NonNls


class JanetTokenType(@NonNls debugName: String) : IElementType(debugName, JanetLanguage) {
    override fun toString(): String {
        return "JanetTokenType." + super.toString()
    }

    companion object {

        val NIL = JanetTokenType("NIL")
        val TRUE = JanetTokenType("TRUE")
        val FALSE = JanetTokenType("FALSE")

        val L_PARENTHESIS = JanetTokenType("L_PARENTHESIS")
        val R_PARENTHESIS = JanetTokenType("R_PARENTHESIS")

        val DEF = JanetTokenType("DEF")
        val PRINT = JanetTokenType("PRINT")

    }


}