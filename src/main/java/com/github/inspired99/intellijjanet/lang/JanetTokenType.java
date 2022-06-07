package com.github.inspired99.intellijjanet.lang;

import com.intellij.psi.tree.TokenSet;
import com.intellij.psi.tree.IElementType;

public class JanetTokenType extends IElementType {
    public JanetTokenType(String debugName) {
        super(debugName, JanetLanguage.janetLanguage);
    }

    @Override
    public String toString() {
        return "JanetTokenType." + super.toString();
    }

    private static JanetTokenType IDENTIFIER = new JanetTokenType("IDENTIFIER"); // variable

    // constants
    private static JanetTokenType NIL = new JanetTokenType("NIL");
    private static JanetTokenType TRUE = new JanetTokenType("TRUE");
    private static JanetTokenType FALSE = new JanetTokenType("FALSE");
    private static JanetTokenType L_PARENTHESIS = new JanetTokenType("L_PARENTHESIS"); // (
    private static JanetTokenType R_PARENTHESIS = new JanetTokenType("R_PARENTHESIS"); // )

    // condition
    private static JanetTokenType IF = new JanetTokenType("IF");
    private static JanetTokenType AND = new JanetTokenType("AND");
    private static JanetTokenType OR = new JanetTokenType("OR");
    private static JanetTokenType XOR = new JanetTokenType("XOR"); // (bxor x xs)
    private static JanetTokenType EQ = new JanetTokenType("EQ"); // (= x xs)
    private static JanetTokenType LE = new JanetTokenType("LE"); // (<= x xs)
    private static JanetTokenType LT = new JanetTokenType("LT"); // (< x xs)
    private static JanetTokenType GE = new JanetTokenType("GE"); // (>= x xs)
    private static JanetTokenType GT = new JanetTokenType("GT"); // (> x xs)
    private static JanetTokenType ALL = new JanetTokenType("ALL"); // (all predicate xs)
    private static JanetTokenType ANY = new JanetTokenType("ANY"); // (any? ind)

    // keywords
    private static JanetTokenType DEF = new JanetTokenType("DEF");
    private static JanetTokenType FOR = new JanetTokenType("FOR");
    private static JanetTokenType PRINT = new JanetTokenType("PRINT");
    private static JanetTokenType BUFFER = new JanetTokenType("BUFFER"); // @
    private static JanetTokenType SET = new JanetTokenType("SET"); // (set x n)
    private static JanetTokenType VAR = new JanetTokenType("VAR"); // (var a 1)
    private static JanetTokenType FUNCTION = new JanetTokenType("FUNCTION"); // (fn [])

    // operators and expressions
    private static JanetTokenType MOD = new JanetTokenType("MOD"); // %
    private static JanetTokenType DIV = new JanetTokenType("DIV"); // (/ x xs)
    private static JanetTokenType ADD = new JanetTokenType("ADD"); // (+ x xs)
    private static JanetTokenType MULT = new JanetTokenType("MULT"); // (* x xs)
    private static JanetTokenType SUB = new JanetTokenType("SUB"); // (- x xs)
    private static JanetTokenType INCR_BY_ONE = new JanetTokenType("INCR_BY_ONE"); // (++ x)
    private static JanetTokenType DECR_BY_ONE = new JanetTokenType("DECR_BY_ONE"); // (-- x)

    // numbers
    private static JanetTokenType DEC_INT_NUM = new JanetTokenType("DEC_INT_NUM");
    private static JanetTokenType FLOAT_NUM = new JanetTokenType("FLOAT_NUM");
    private static JanetTokenType HEX_NUM = new JanetTokenType("HEX_NUM"); // 0x12312

    // strings
    private static JanetTokenType ONE_LINE_STR = new JanetTokenType("ONE_LINE_STR"); // "str"
    private static JanetTokenType SINGLE_LONG_STR = new JanetTokenType("SINGLE_LONG_STR"); // 'str'

    // data structures
    private static JanetTokenType ARRAY = new JanetTokenType("ARRAY_BRACKETS"); // @[1 2 3]
    private static JanetTokenType MAP = new JanetTokenType("MUTABLE_MAP_STRUCT"); // @{key1 val1 key2 val2}

    private static JanetTokenType LINE_COMMENT = new JanetTokenType("LINE_COMMENT"); // #
    private static JanetTokenType NEW_LINE = new JanetTokenType("NEW_LINE"); // /n

    public static TokenSet CONSTANTS = TokenSet.create(
            NIL, TRUE, FALSE);

    public static TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static TokenSet NUMBERS = TokenSet.create(FLOAT_NUM, DEC_INT_NUM, HEX_NUM);

    public static TokenSet STRINGS = TokenSet.create(
            SINGLE_LONG_STR, ONE_LINE_STR);

    public static TokenSet KEYWORDS = TokenSet.create(
            DEF, SET, FUNCTION, BUFFER, VAR, PRINT,
            IF, FOR);

    public static TokenSet BUILT_IN_FUNC = TokenSet.create(
            ALL, ANY);

    public static TokenSet DATA_STRUCTURES = TokenSet.create(
            ARRAY, MAP);

    public static TokenSet BINARY_OPERATORS = TokenSet.create(
            AND, OR, XOR, EQ, LE, LT, GE, GT, MOD, DIV, ADD,
            MULT, SUB);

    public static TokenSet UNARY_OPERATORS = TokenSet.create(
            INCR_BY_ONE, DECR_BY_ONE);

    public static JanetTokenType getNewLine() {
        return NEW_LINE;
    }

    public static JanetTokenType getNIL() {
        return NIL;
    }

    public static JanetTokenType getTRUE() {
        return TRUE;
    }

    public static JanetTokenType getFOR() {
        return FOR;
    }

    public static JanetTokenType getFALSE() {
        return FALSE;
    }

    public static JanetTokenType getlParenthesis() {
        return L_PARENTHESIS;
    }

    public static JanetTokenType getIDENTIFIER() {
        return IDENTIFIER;
    }

    public static JanetTokenType getrParenthesis() {
        return R_PARENTHESIS;
    }

    public static JanetTokenType getIF() {
        return IF;
    }

    public static JanetTokenType getAND() {
        return AND;
    }

    public static JanetTokenType getOR() {
        return OR;
    }

    public static JanetTokenType getXOR() {
        return XOR;
    }

    public static JanetTokenType getEQ() {
        return EQ;
    }

    public static JanetTokenType getLE() {
        return LE;
    }

    public static JanetTokenType getHexNum() {
        return HEX_NUM;
    }

    public static JanetTokenType getLT() {
        return LT;
    }

    public static JanetTokenType getARRAY() {
        return ARRAY;
    }

    public static JanetTokenType getGE() {
        return GE;
    }

    public static JanetTokenType getGT() {
        return GT;
    }

    public static JanetTokenType getALL() {
        return ALL;
    }

    public static JanetTokenType getANY() {
        return ANY;
    }

    public static JanetTokenType getDEF() {
        return DEF;
    }

    public static JanetTokenType getPRINT() {
        return PRINT;
    }

    public static JanetTokenType getBUFFER() {
        return BUFFER;
    }

    public static JanetTokenType getSET() {
        return SET;
    }

    public static JanetTokenType getVAR() {
        return VAR;
    }

    public static JanetTokenType getFUNCTION() {
        return FUNCTION;
    }

    public static JanetTokenType getMOD() {
        return MOD;
    }

    public static JanetTokenType getDIV() {
        return DIV;
    }

    public static JanetTokenType getADD() {
        return ADD;
    }

    public static JanetTokenType getMULT() {
        return MULT;
    }

    public static JanetTokenType getSUB() {
        return SUB;
    }

    public static JanetTokenType getIncrByOne() {
        return INCR_BY_ONE;
    }

    public static JanetTokenType getDecrByOne() {
        return DECR_BY_ONE;
    }

    public static JanetTokenType getDecIntNum() {
        return DEC_INT_NUM;
    }

    public static JanetTokenType getFloatNum() {
        return FLOAT_NUM;
    }

    public static JanetTokenType getOneLineStr() {
        return ONE_LINE_STR;
    }

    public static JanetTokenType getSingleLongStr() {
        return SINGLE_LONG_STR;
    }

    public static JanetTokenType getLineComment() {
        return LINE_COMMENT;
    }

    public static JanetTokenType getMAP() {
        return MAP;
    }
}
