package org.amix.compiler

/*
 * Copyright 2025 Amix.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
