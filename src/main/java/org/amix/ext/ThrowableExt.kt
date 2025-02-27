package org.amix.ext

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

import java.io.PrintWriter
import java.io.StringWriter
import java.io.Writer

/**
 * Function to get the stack trace as a String.
 */
fun Throwable?.getStackTraceStr(): String {
  val result: Writer = StringWriter()
  PrintWriter(result).use { printWriter ->
    var throwable: Throwable? = this
    while (throwable != null) {
      throwable.printStackTrace(printWriter)
      throwable = throwable.cause
    }
  }
  return result.toString()
}
