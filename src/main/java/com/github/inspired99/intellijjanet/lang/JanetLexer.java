package com.github.inspired99.intellijjanet.lang;

import com.github.inspired99.intellijjanet.lang._JanetLexer;
import com.intellij.lexer.FlexAdapter;


public class JanetLexer extends FlexAdapter {

    public JanetLexer() {
        super(new _JanetLexer(null));
    }
}
