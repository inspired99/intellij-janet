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
HEX_DIGIT = [a-fA-F0-9]
HEX_NUM = "0x" {HEX_DIGIT}+
UNARY_MINUS = "-"
NAME = [a-zA-Z]
UNDERSCORE = "_"
IDENTIFIER = {NAME} ({NAME} | {UNDERSCORE} | {DIGIT})*
LINE_STRING = (\"[^\"\']*\")
LONG_STRING_SINGLE = (\`[^\`\"]*\`)
ARRAY = \[(({IDENTIFIER} | {HEX_NUM} | {LINE_STRING} | {DEC_NUM} | {FLOAT_NUM})\s)*\]
MAP = \@\((({IDENTIFIER} | {HEX_NUM} | {LINE_STRING} | {DEC_NUM} | {FLOAT_NUM})\s)*\)
COMMENT  = (.)*\#(.)*
NEWLINE = \r|\n|\r\n


%state LITERAL_STRING

%%


"true"                 { return JanetTokenType.getTRUE();}
"false"                { return JanetTokenType.getFALSE();}
"nil"                  {return JanetTokenType.getNIL();}
{DEC_NUM}              {return JanetTokenType.getDecIntNum();}
{HEX_NUM}              {return JanetTokenType.getHexNum();}
{FLOAT_NUM}            {return JanetTokenType.getFloatNum();}
"("                    {return JanetTokenType.getlParenthesis();}
")"                    {return JanetTokenType.getrParenthesis();}
"set"                  {return JanetTokenType.getSET();}
"+"                    {return JanetTokenType.getADD();}
"*"                    {return JanetTokenType.getMULT();}
"-"                    {return JanetTokenType.getSUB();}
"/"                    {return JanetTokenType.getDIV();}
"all"                  {return JanetTokenType.getALL();}
"any?"                 {return JanetTokenType.getANY();}
"print"                {return JanetTokenType.getPRINT();}
"++"                   {return JanetTokenType.getIncrByOne();}
"--"                   {return JanetTokenType.getDecrByOne();}
"for"                  {return JanetTokenType.getFOR();}
"if"                   {return JanetTokenType.getIF();}
"and"                  {return JanetTokenType.getAND();}
"or"                   {return JanetTokenType.getOR();}
"bxor"                 {return JanetTokenType.getXOR();}
"="                    {return JanetTokenType.getEQ();}
"<="                   {return JanetTokenType.getLE();}
"<"                    {return JanetTokenType.getLT();}
">"                    {return JanetTokenType.getGT();}
"def"                  {return JanetTokenType.getDEF();}
"@"                    {return JanetTokenType.getBUFFER();}
"var"                  {return JanetTokenType.getVAR();}
"fn"                   {return JanetTokenType.getFUNCTION();}
{LINE_STRING}          {return JanetTokenType.getOneLineStr();}
{LONG_STRING_SINGLE}   {return JanetTokenType.getSingleLongStr();}
{ARRAY}                {return JanetTokenType.getARRAY();}
{MAP}                  {return JanetTokenType.getMAP();}
{COMMENT}              {return JanetTokenType.getLineComment();}
{NEWLINE}              {return JanetTokenType.getNewLine();}
{IDENTIFIER}           {return JanetTokenType.getIDENTIFIER();}

[^]                     { return BAD_CHARACTER;}