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
    private static JanetTokenType NIL_UNDERSCORE = new JanetTokenType("NIL_UNDERSCORE"); // same as nil
    private static JanetTokenType TRUE = new JanetTokenType("TRUE");
    private static JanetTokenType FALSE = new JanetTokenType("FALSE");
    private static JanetTokenType L_PARENTHESIS = new JanetTokenType("L_PARENTHESIS"); // (
    private static JanetTokenType R_PARENTHESIS = new JanetTokenType("R_PARENTHESIS"); // )

    // condition
    private static JanetTokenType IF = new JanetTokenType("IF");
    private static JanetTokenType IF_NOT = new JanetTokenType("IF_NOT");
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
    private static JanetTokenType PRINT = new JanetTokenType("PRINT");
    private static JanetTokenType COLON = new JanetTokenType("COLON"); // :keyword (constant)
    private static JanetTokenType BUFFER = new JanetTokenType("BUFFER"); // @
    private static JanetTokenType SET = new JanetTokenType("SET"); // (set x n)
    private static JanetTokenType VAR = new JanetTokenType("VAR"); // (var a 1)
    private static JanetTokenType FUNCTION = new JanetTokenType("FUNCTION"); // (fn [])
    private static JanetTokenType DO = new JanetTokenType("DO"); // (do 1 2 3)
    private static JanetTokenType WHILE = new JanetTokenType("WHILE");
    private static JanetTokenType BREAK = new JanetTokenType("BREAK");
    private static JanetTokenType SPLICE = new JanetTokenType("SPLICE"); // (+ (splice @[1 2 3])) = 6

    // operators and expressions
    private static JanetTokenType MOD = new JanetTokenType("MOD"); // %
    private static JanetTokenType DIV = new JanetTokenType("DIV"); // (/ x xs)
    private static JanetTokenType ADD = new JanetTokenType("ADD"); // (+ x xs)
    private static JanetTokenType MULT = new JanetTokenType("MULT"); // (* x xs)
    private static JanetTokenType SUB = new JanetTokenType("SUB"); // (- x xs)
    private static JanetTokenType INCR_BY_ONE = new JanetTokenType("INCR_BY_ONE"); // (++ x)
    private static JanetTokenType INCR_BY_N = new JanetTokenType("INCR_BY_N"); // (+= x n)
    private static JanetTokenType DECR_BY_ONE = new JanetTokenType("DECR_BY_ONE"); // (-- x)
    private static JanetTokenType DECR_BY_N = new JanetTokenType("DECR_BY_N"); // (-= x n)
    private static JanetTokenType SET_MOD = new JanetTokenType("SET_MOD"); // (%= x n)
    private static JanetTokenType SET_MULT = new JanetTokenType("SET_MULT"); // (*= x n)
    private static JanetTokenType SET_SUB = new JanetTokenType("SET_SUB"); // (/= x n)

    // numbers
    private static JanetTokenType DEC_INT_NUM = new JanetTokenType("DEC_INT_NUM");
    private static JanetTokenType FLOAT_NUM = new JanetTokenType("FLOAT_NUM");
    private static JanetTokenType NUM_IN_ANY_BASE = new JanetTokenType("NUM_IN_ANY_BASE");
    private static JanetTokenType NUM_UNDERSCORED = new JanetTokenType("NUM_UNDERSCORED"); // 1_00_00
    private static JanetTokenType HEX_NUM = new JanetTokenType("HEX_NUM"); // 0x12312

    // strings
    private static JanetTokenType ONE_LINE_STR = new JanetTokenType("ONE_LINE_STR"); // "str"
    private static JanetTokenType SINGLE_LONG_STR = new JanetTokenType("SINGLE_LONG_STR"); // 'str'
    private static JanetTokenType DOUBLE_LONG_STR = new JanetTokenType("DOUBLE_LONG_STR"); // ''str''

    // data structures
    private static JanetTokenType TUPLE = new JanetTokenType("TUPLE"); // [1 2 3]
    private static JanetTokenType ARRAY_PAR = new JanetTokenType("ARRAY_PAR"); // @(1 2 3) - mutable tuples
    private static JanetTokenType ARRAY_BRACKETS = new JanetTokenType("ARRAY_BRACKETS"); // @[1 2 3]
    private static JanetTokenType MAP_STRUCT = new JanetTokenType("MAP_STRUCT"); // {}
    private static JanetTokenType MUTABLE_MAP_STRUCT = new JanetTokenType("MUTABLE_MAP_STRUCT"); // @{}

    private static JanetTokenType LINE_COMMENT = new JanetTokenType("LINE_COMMENT"); // #
    private static JanetTokenType NEW_LINE = new JanetTokenType("NEW_LINE"); // /n
    private static JanetTokenType SPACE = new JanetTokenType("SPACE");

    public static TokenSet FORMATTING = TokenSet.create(NEW_LINE, SPACE);

    public static TokenSet CONSTANTS = TokenSet.create(
            NIL, TRUE, FALSE, NIL_UNDERSCORE);

    public static TokenSet COMMENTS = TokenSet.create(LINE_COMMENT);

    public static TokenSet NUMBERS = TokenSet.create(NUM_IN_ANY_BASE,
            FLOAT_NUM, DEC_INT_NUM, NUM_UNDERSCORED, HEX_NUM);

    public static TokenSet STRINGS = TokenSet.create(
            SINGLE_LONG_STR, DOUBLE_LONG_STR, ONE_LINE_STR);

    public static TokenSet KEYWORDS = TokenSet.create(
            DEF, SET, COLON, FUNCTION, BUFFER, VAR, DO, WHILE, BREAK, SPLICE, PRINT,
            IF, IF_NOT);

    public static TokenSet BUILT_IN_FUNC = TokenSet.create(
            ALL, ANY);

    public static TokenSet DATA_STRUCTURES = TokenSet.create(
            TUPLE, ARRAY_BRACKETS, ARRAY_PAR, MAP_STRUCT, MUTABLE_MAP_STRUCT);

    public static TokenSet BINARY_OPERATORS = TokenSet.create(
            AND, OR, XOR, EQ, LE, LT, GE, GT, MOD, DIV, ADD,
            MULT, SUB, INCR_BY_N, DECR_BY_N,
            SET_MOD, SET_MULT, SET_SUB);

    public static TokenSet UNARY_OPERATORS = TokenSet.create(
            INCR_BY_ONE, DECR_BY_ONE);

    public static JanetTokenType getNIL() {
        return NIL;
    }

    public static JanetTokenType getNilUnderscore() {
        return NIL_UNDERSCORE;
    }

    public static JanetTokenType getTRUE() {
        return TRUE;
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

    public static JanetTokenType getIfNot() {
        return IF_NOT;
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

    public static JanetTokenType getGE() {
        return GE;
    }

    public static JanetTokenType getNumUnderscored() {
        return NUM_UNDERSCORED;
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

    public static JanetTokenType getCOLON() {
        return COLON;
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

    public static JanetTokenType getDO() {
        return DO;
    }

    public static JanetTokenType getWHILE() {
        return WHILE;
    }

    public static JanetTokenType getBREAK() {
        return BREAK;
    }

    public static JanetTokenType getSPLICE() {
        return SPLICE;
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

    public static JanetTokenType getIncrByN() {
        return INCR_BY_N;
    }

    public static JanetTokenType getDecrByOne() {
        return DECR_BY_ONE;
    }

    public static JanetTokenType getDecrByN() {
        return DECR_BY_N;
    }

    public static JanetTokenType getSetMod() {
        return SET_MOD;
    }

    public static JanetTokenType getSetMult() {
        return SET_MULT;
    }

    public static JanetTokenType getSetSub() {
        return SET_SUB;
    }

    public static JanetTokenType getDecIntNum() {
        return DEC_INT_NUM;
    }

    public static JanetTokenType getFloatNum() {
        return FLOAT_NUM;
    }

    public static JanetTokenType getNumInAnyBase() {
        return NUM_IN_ANY_BASE;
    }

    public static JanetTokenType getOneLineStr() {
        return ONE_LINE_STR;
    }

    public static JanetTokenType getSingleLongStr() {
        return SINGLE_LONG_STR;
    }

    public static JanetTokenType getDoubleLongStr() {
        return DOUBLE_LONG_STR;
    }

    public static JanetTokenType getTUPLE() {
        return TUPLE;
    }

    public static JanetTokenType getArrayPar() {
        return ARRAY_PAR;
    }

    public static JanetTokenType getArrayBrackets() {
        return ARRAY_BRACKETS;
    }

    public static JanetTokenType getMapStruct() {
        return MAP_STRUCT;
    }

    public static JanetTokenType getMutableMapStruct() {
        return MUTABLE_MAP_STRUCT;
    }

    public static JanetTokenType getLineComment() {
        return LINE_COMMENT;
    }
}
