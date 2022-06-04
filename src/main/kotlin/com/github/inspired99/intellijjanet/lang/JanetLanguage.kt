package com.github.inspired99.intellijjanet.lang

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.vfs.VirtualFile
import java.nio.charset.StandardCharsets
import javax.swing.Icon

object JanetLanguage : Language("Janet")

object JanetFileType : LanguageFileType(JanetLanguage) {
    override fun getDisplayName() = "Janet"

    override fun getName() = "Janet"

    override fun getDescription() = "Janet"

    override fun getDefaultExtension() = "janet"

    override fun getIcon(): Icon = JanetIconObject.JanetIcon

    override fun getCharset(file: VirtualFile, content: ByteArray): String = StandardCharsets.UTF_8.name()
}

object JanetIconObject {

    val JanetIcon: Icon = IconLoader.getIcon(
        "/icon/janet.png", JanetIconObject.javaClass
    )
}