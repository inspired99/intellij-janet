package com.github.inspired99.intellijjanet.lang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.util.IconLoader;

import java.nio.charset.StandardCharsets;


import javax.swing.*;


public class JanetFileType extends LanguageFileType {
    public static final JanetFileType janetFileType = new JanetFileType();

    protected JanetFileType() {
        super(JanetLanguage.janetLanguage);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Janet";
    }

    @Override
    public @NotNull @Nls String getDisplayName() {
        return "Janet";
    }

    @Override
    public @NotNull String getDescription() {
        return "Janet";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "janet";
    }

    @Override
    public @Nullable Icon getIcon() {
        return JanetIcon.JanetIconObj;
    }

    @Override
    public @NonNls @Nullable String getCharset(@NotNull VirtualFile file, byte @NotNull [] content) {
        return StandardCharsets.UTF_8.name();
    }

    public static class JanetIcon {
        public static Icon JanetIconObj = IconLoader.getIcon("/icons/janet-16x16.png", JanetIcon.class);
    }
}
