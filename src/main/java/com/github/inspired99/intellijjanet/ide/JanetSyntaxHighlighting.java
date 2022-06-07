package com.github.inspired99.intellijjanet.ide;


import com.github.inspired99.intellijjanet.lang.JanetTokenType;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import com.github.inspired99.intellijjanet.lang.JanetLexer;

import java.util.HashMap;
import java.util.Map;

public class JanetSyntaxHighlighting extends SyntaxHighlighterBase {
    public Map<IElementType, TextAttributesKey> elementTextAttributes = new HashMap<>();

    public JanetSyntaxHighlighting() {
        fillMap(elementTextAttributes, JanetTokenType.KEYWORDS, JanetTextAttributeKeys.KEYWORD.key);
        fillMap(elementTextAttributes, JanetTokenType.CONSTANTS, JanetTextAttributeKeys.CONSTANT.key);
        fillMap(elementTextAttributes, JanetTokenType.COMMENTS, JanetTextAttributeKeys.COMMENT.key);
        fillMap(elementTextAttributes, JanetTokenType.NUMBERS, JanetTextAttributeKeys.NUMBER.key);
        fillMap(elementTextAttributes, JanetTokenType.STRINGS, JanetTextAttributeKeys.STRING.key);
        fillMap(elementTextAttributes, JanetTokenType.BINARY_OPERATORS, JanetTextAttributeKeys.BINARY_OPERATIONS.key);
        fillMap(elementTextAttributes, JanetTokenType.UNARY_OPERATORS, JanetTextAttributeKeys.UNARY_OPERATIONS.key);
        fillMap(elementTextAttributes, JanetTokenType.BUILT_IN_FUNC, JanetTextAttributeKeys.BUILT_IN_FUNC.key);

        elementTextAttributes.put(JanetTokenType.getIDENTIFIER(), JanetTextAttributeKeys.IDENTIFIER.key);
        elementTextAttributes.put(JanetTokenType.getlParenthesis(), JanetTextAttributeKeys.LEFT_PAR.key);
        elementTextAttributes.put(JanetTokenType.getrParenthesis(), JanetTextAttributeKeys.RIGHT_PAR.key);
    }
    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new JanetLexer();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        return pack(elementTextAttributes.get(tokenType));
    }
}
