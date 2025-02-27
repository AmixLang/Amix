package org.amix

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

import org.amix.compiler.AmixCompiler
import org.amix.robok.Config
import org.amix.xml.AmixXmlGenerator

class Amix {

  lateinit var compiler: AmixCompiler

  fun compile() = compiler.compile()

  class Builder {
    private var useComments: Boolean = false
    private var useStyle: Boolean = false
    private var useVerticalRoot: Boolean = false
    private var onGenerateCode: OnGenerateCode? = null
    private var onError: OnError? = null
    private var code: String? = null

    fun setUseComments(useComments: Boolean): Builder {
      this.useComments = useComments
      return this
    }

    fun setUseStyle(useStyle: Boolean): Builder {
      this.useStyle = useStyle
      return this
    }

    fun setUseVerticalRoot(useVerticalRoot: Boolean): Builder {
      this.useVerticalRoot = useVerticalRoot
      return this
    }

    fun setCode(code: String): Builder {
      this.code = code
      return this
    }

    fun setOnGenerateCode(onGenerateCode: OnGenerateCode): Builder {
      this.onGenerateCode = onGenerateCode
      return this
    }

    fun setOnError(onError: OnError): Builder {
      this.onError = onError
      return this
    }

    fun create(): Amix {
      val xmlGenerator =
        AmixXmlGenerator(
          useComments = useComments,
          useStyle = useStyle,
          useVerticalRoot = useVerticalRoot,
          onGenerateCode = { code, config -> onGenerateCode?.call(code, config) },
          onError = { onError?.call(it) },
        )
      val amixCompiler = AmixCompiler(xmlGenerator = xmlGenerator, code = code)
      return Amix().apply { compiler = amixCompiler }
    }
  }

  fun interface OnGenerateCode {
    fun call(code: String, config: Config)
  }

  fun interface OnError {
    fun call(error: String)
  }
}
