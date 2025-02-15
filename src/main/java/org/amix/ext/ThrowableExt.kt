package org.amix.ext

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
