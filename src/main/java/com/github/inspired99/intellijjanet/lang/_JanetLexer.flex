package com.github.inspired99.intellijjanet.lang;

import com.intellij.psi.tree.IElementType;

import com.github.inspired99.intellijjanet.lang.JanetTokenType;
import static com.intellij.psi.TokenType.BAD_CHARACTER;
import com.intellij.lexer.FlexLexer;


%%

%public
%class _JanetLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

DIGIT = [0-9]
DEC_NUM = {UNARY_MINUS}? {DIGIT}+
FLOAT_NUM = {UNARY_MINUS}? {DIGIT} "." {DIGIT}+
NUM_IN_ANY_BASE = {UNARY_MINUS}? ({NAME} | {DIGIT}) "r" ({NAME} | {DIGIT})+
NUM_UNDERSCORED = {UNARY_MINUS}? ({DIGIT}+ {UNDERSCORE}+)+
HEX_DIGIT = [a-fA-F0-9]
HEX_NUM = "0x" {HEX_DIGIT}+
UNARY_MINUS = "-"
NAME = [a-zA-Z]
UNDERSCORE = "_"
IDENTIFIER = {NAME} ({NAME} | {UNDERSCORE} | {DIGIT})*
LINE_STRING = (\"[^\"\']*\")
LONG_STRING_DOUBLE = (\`\`[^\"\`]*\`\`)
LONG_STRING_SINGLE = (\`[^\`\"]*\`)

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

Whitespace = {LineTerminator} | [ \t\f]

DoubleQuotedString = (.\"\ ([^\"\r\n\\]|\\.)*\")

LineComment  = (\(([^\"\r\n\\]|\\.)*\))


%state LITERAL_STRING

%%


"true"              { return JanetTokenType.getTRUE();}
"false"             { return JanetTokenType.getFALSE();}
"nil"               {return JanetTokenType.getNIL();}
{DEC_NUM}           {return JanetTokenType.getDecIntNum();}
{HEX_NUM}           {return JanetTokenType.getHexNum();}
"set"               {return JanetTokenType.getSET();}
"+"                 {return JanetTokenType.getADD();}
"*"                 {return JanetTokenType.getMULT();}
"-"                 {return JanetTokenType.getSUB();}
"all"               {return JanetTokenType.getALL();}
"any?"              {return JanetTokenType.getANY();}
"print"             {return JanetTokenType.getPRINT();}
"++"                {return JanetTokenType.getIncrByOne();}
"--"                {return JanetTokenType.getDecrByOne();}
{LINE_STRING}       {return JanetTokenType.getOneLineStr();}
{LONG_STRING_SINGLE} {return JanetTokenType.getSingleLongStr();}
{LONG_STRING_DOUBLE} {return JanetTokenType.getDoubleLongStr();}
{IDENTIFIER}        {return JanetTokenType.getIDENTIFIER();}


[^]                     { return BAD_CHARACTER;}