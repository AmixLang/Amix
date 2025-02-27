package org.amix.compiler.listener

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

import org.amix.internal.AttributeDefaults
import org.amix.internal.antlr4.AmixBaseListener
import org.amix.internal.antlr4.AmixParser.ArgumentContext
import org.amix.internal.antlr4.AmixParser.ArgumentListContext
import org.amix.internal.antlr4.AmixParser.ComponentContext
import org.amix.internal.antlr4.AmixParser.GuiFileContext
import org.amix.xml.AmixXmlGenerator

class AmixParserListener(private val xmlGenerator: AmixXmlGenerator) : AmixBaseListener() {
  private var componentName: String = ""

  /** when finish the code */
  override fun exitGuiFile(context: GuiFileContext) {
    xmlGenerator.finish()
    super.exitGuiFile(context)
  }

  /** Called in start of component Example: Column { or Button( */
  override fun enterComponent(context: ComponentContext) {
    componentName = context.IDENTIFIER().text
    xmlGenerator.runMethod(componentName)
  }

  /** Called in end of component Example } or ) */
  override fun exitComponent(context: ComponentContext) {
    if (context.text.endsWith("}")) {
      xmlGenerator.closeBlockLayout()
      return
    }
    xmlGenerator.closeBlockComponent()
  }

  /*
   * When entering a list of arguments (example: Button(text = "Click here"))
   */
  override fun enterArgumentList(context: ArgumentListContext) {
    var componentName = context.getParent().getChild(0).text
  }

  /*
   * When enter new argument (example text = "")
   */
  override fun enterArgument(context: ArgumentContext) {
    var key = AttributeDefaults.DEFAULT_KEY

    if (context.IDENTIFIER() != null) {
      key = context.IDENTIFIER().text
    } else {
      key = context.IDENTIFIER_COLON().text
    }

    var value = getAttributeValue(context)

    if (value.startsWith("\"") && value.endsWith("\"")) {
      value = value.substring(1, value.length - 1)
    }

    if (value.contains("\\\"")) {
      value = value.replace("\\\"", "&quot;")
    }

    xmlGenerator.runMethodWithParameters("addAttribute", componentName, key, value)
  }

  /*
   * Returns the attribute value (example: text = "A", this method will return A)
   */
  private fun getAttributeValue(context: ArgumentContext): String {
    var value = AttributeDefaults.DEFAULT_VALUE

    if (context.value().STRING() != null) {
      value = context.value().STRING().text
    } else if (context.value().NUMBER() != null) {
      value = context.value().NUMBER().text
    } else if (context.value().IDENTIFIER_DOT() != null) {
      value = context.value().IDENTIFIER_DOT().text
    }

    return value
  }
}
