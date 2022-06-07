package com.github.inspired99.intellijjanet.ide;


import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.options.colors.AttributesDescriptor;


public enum JanetTextAttributeKeys {
    COMMENT("Comment", DefaultLanguageHighlighterColors.DOC_COMMENT),
    STRING("String//String text", DefaultLanguageHighlighterColors.STRING),
    NUMBER("Number", DefaultLanguageHighlighterColors.NUMBER),
    KEYWORD("Keyword", DefaultLanguageHighlighterColors.KEYWORD),
    CONSTANT("Built-in constant", DefaultLanguageHighlighterColors.CONSTANT),
    IDENTIFIER("Identifier", DefaultLanguageHighlighterColors.IDENTIFIER),
    BINARY_OPERATIONS("Operations//Binary operations", DefaultLanguageHighlighterColors.DOT),
    UNARY_OPERATIONS("Operations//Unary operations", DefaultLanguageHighlighterColors.CLASS_NAME),
    BUILT_IN_FUNC("Built-in functions", DefaultLanguageHighlighterColors.INSTANCE_METHOD),
    LEFT_PAR("Brackets//Left brackets", DefaultLanguageHighlighterColors.LOCAL_VARIABLE),
    RIGHT_PAR("Brackets//Right brackets", DefaultLanguageHighlighterColors.LOCAL_VARIABLE);

    public TextAttributesKey fallback;
    public String humanName;
    public TextAttributesKey key;
    public AttributesDescriptor attributesDescriptor;

    JanetTextAttributeKeys(String humanName, TextAttributesKey fallback) {
        this.humanName = humanName;
        this.fallback = fallback;

        key = TextAttributesKey.createTextAttributesKey("Janet." + name(), fallback);
        attributesDescriptor = new AttributesDescriptor(humanName, key);
    }
}
