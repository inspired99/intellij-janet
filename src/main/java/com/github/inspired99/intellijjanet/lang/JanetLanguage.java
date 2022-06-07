package com.github.inspired99.intellijjanet.lang;


import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;


public class JanetLanguage extends Language {
    public static final JanetLanguage janetLanguage = new JanetLanguage();

    public JanetLanguage() {
        super("Janet");
    }

    @Override
    public @NotNull String getDisplayName() {
        return "Janet";
    }
}
