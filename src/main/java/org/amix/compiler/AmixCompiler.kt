package org.amix.compiler

/*
 *  This file is part of Amix © 2024.
 *
 *  Amix is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Amix is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Amix.  If not, see <https://www.gnu.org/licenses/>.
 */

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.amix.compiler.listener.AmixParserListener
import org.amix.ext.getStackTraceStr
import org.amix.internal.antlr4.AmixLexer
import org.amix.internal.antlr4.AmixParser
import org.amix.xml.AmixXmlGenerator

/*
 * Class that uses ANTLR4 to compile the Code and use { @link AmixParserListener }.
 * @author Thiarley Rocha (ThDev-only).
 */

class AmixCompiler(private val xmlGenerator: AmixXmlGenerator, private val code: String?) {

  fun compile() {
    if (code == null) throw AmixNullCodeException()
    val th = Thread {
      try {
        val input = CharStreams.fromString(code!!)
        val lexer = AmixLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = AmixParser(tokens)

        parser.interpreter.predictionMode = PredictionMode.SLL

        val compilationUnitContext = parser.guiFile()

        val compiler = AmixParserListener(xmlGenerator)
        val walker = ParseTreeWalker.DEFAULT
        walker.walk(compiler, compilationUnitContext)
      } catch (e: Exception) {
        xmlGenerator.onError(e.getStackTraceStr())
      }
    }
    th.priority = Thread.MIN_PRIORITY
    th.start()
  }
}
