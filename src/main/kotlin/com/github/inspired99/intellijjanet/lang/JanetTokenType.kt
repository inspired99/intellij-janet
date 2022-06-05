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

        // constants
        val NIL = JanetTokenType("NIL")
        val NIL_UNDERSCORE = JanetTokenType("NIL_UNDERSCORE") // nil
        val TRUE = JanetTokenType("TRUE")
        val FALSE = JanetTokenType("FALSE")
        val L_PARENTHESIS = JanetTokenType("L_PARENTHESIS")
        val R_PARENTHESIS = JanetTokenType("R_PARENTHESIS")

        // condition
        val IF = JanetTokenType("IF")
        val IF_NOT = JanetTokenType("IF_NOT")
        val AND = JanetTokenType("AND")
        val OR = JanetTokenType("OR")
        val XOR = JanetTokenType("XOR") // (bxor x xs)
        val EQ = JanetTokenType("EQ") // (= x xs)
        val LE = JanetTokenType("LE") // (<= x xs)
        val LT = JanetTokenType("LT") // (< x xs)
        val GE = JanetTokenType("GE") // (>= x xs)
        val GT = JanetTokenType("GT") // (> x xs)
        val ALL = JanetTokenType("ALL") // (all predicate xs)
        val ANY = JanetTokenType("ANY") // (any? ind)

        // keywords
        val DEF = JanetTokenType("DEF")
        val PRINT = JanetTokenType("PRINT")
        val COLON = JanetTokenType("COLON") // :keyword


        val WHILE = JanetTokenType("WHILE")
        val BREAK = JanetTokenType("BREAK")


        // operators and expressions
        val MOD = JanetTokenType("MOD") // %
        val DIV = JanetTokenType("DIV") // (/ x xs)
        val ADD = JanetTokenType("ADD") // (+ x xs)
        val MULT = JanetTokenType("MULT") // (* x xs)
        val SUB = JanetTokenType("SUB") // (- x xs)
        val INCR_BY_ONE = JanetTokenType("INCR_BY_ONE") // (++ x)
        val INCR_BY_N = JanetTokenType("INCR_BY_N") // (+= x n)
        val DECR_BY_ONE = JanetTokenType("DECR_BY_ONE") // (-- x)
        val DECR_BY_N = JanetTokenType("DECR_BY_N") // (-= x n)
        val SET_MOD = JanetTokenType("SET_MOD") // (%= x n)
        val SET_MULT = JanetTokenType("SET_MULT") // (*= x n)
        val SET_SUB = JanetTokenType("SET_SUB") // (/= x n)


        // special forms
        val SET = JanetTokenType("SET")
        val QUOTE = JanetTokenType("QUOTE")

        // numbers
        val DEC_INT_NUM = JanetTokenType("DEC_INT_NUM")
        val FLOAT_NUM = JanetTokenType("FLOAT_NUM")

        // strings
        val ONE_LINE_STR = JanetTokenType("ONE_LINE_STR") // "str"
        val SINGLE_LONG_STR = JanetTokenType("SINGLE_LONG_STR") // 'str'
        val DOUBLE_LONG_STR = JanetTokenType("DOUBLE_LONG_STR") // ''str''

        val LINE_COMMENT = JanetTokenType("LINE_COMMENT") // #
    }


}