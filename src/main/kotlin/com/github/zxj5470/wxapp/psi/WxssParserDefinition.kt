package com.github.zxj5470.wxapp.psi

import com.github.zxj5470.wxapp.WxssLanguage
import com.github.zxj5470.wxapp.psi.wxml.WxmlTypes
import com.github.zxj5470.wxapp.registry.WxssFile
import com.github.zxj5470.wxapp.registry.WxssFileType
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lang.css.CSSParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.css.impl.CssElementTypes
import com.intellij.psi.css.impl.lexing.CssLexer
import com.intellij.psi.css.impl.parsing.CssParser2
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

/**
 * @author zxj5470
 * @date 2018/5/11
 */
class WxssParserDefinition : CSSParserDefinition() {
	override fun createLexer(project: Project?): Lexer {
		return CssLexer()
	}

	override fun createParser(project: Project?): PsiParser {
		return CssParser2()
	}

	override fun getFileNodeType(): IFileElementType = FILE

	override fun createFile(viewProvider: FileViewProvider): PsiFile = WxssFile(viewProvider)

	companion object {
		val FILE = IFileElementType(WxssLanguage.INSTANCE)
	}
}

