package com.github.inspired99.intellijjanet.ide;

import com.github.inspired99.intellijjanet.lang.JanetFileType;
import com.github.inspired99.intellijjanet.lang.JanetLanguage;
import com.intellij.application.options.CodeStyleAbstractPanel;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class JanetColorSettingsPage implements ColorSettingsPage {
    @Override
    public Icon getIcon() {
        return JanetFileType.JanetIcon.JanetIconObj;
    }

    @Override
    public @NotNull SyntaxHighlighter getHighlighter() {
        return new JanetSyntaxHighlighting();
    }

    @Override
    public @NonNls @NotNull String getDemoText() {
        return CodeStyleAbstractPanel.readFromFile(JanetLanguage.class, "Sample.janet");
    }

    @Override
    public @Nullable Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return Arrays
                .stream(JanetTextAttributeKeys
                        .values())
                .collect(Collectors.toMap(elem -> elem.name(), elem -> elem.key));
    }

    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors() {
        return Arrays.
                stream(JanetTextAttributeKeys
                        .values())
                .map(elem -> elem.attributesDescriptor)
                .toArray(AttributesDescriptor[]::new);
    }

    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @Override
    public @NotNull String getDisplayName() {
        return "Janet";
    }
}
