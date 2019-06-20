package com.github.zxj5470.wxapp

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.*

object WxssFileType : LanguageFileType(WxssLanguage.INSTANCE) {
	override fun getDefaultExtension() = WXSS_EXT
	override fun getName() = "WXSS"
	override fun getIcon() = WxappIcons.wxssIcon
	override fun getDescription() = "WeiXin Style Sheet"
}

object WxmlFileType : LanguageFileType(WxmlLanguage.INSTANCE) {
	override fun getDefaultExtension() = WXML_EXT
	override fun getName() = "WXML"
	override fun getIcon() = WxappIcons.wxmlIcon
	override fun getDescription() = "WeiXin Markup Language"
}

class WxappFileFactory : FileTypeFactory() {
	override fun createFileTypes(consumer: FileTypeConsumer) {
		consumer.consume(WxssFileType)
		consumer.consume(WxmlFileType)
	}
}