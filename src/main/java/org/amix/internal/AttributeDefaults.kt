package org.amix.internal

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

/*
 * A Basic values used on XMLs Layouts.
 * @author Aquiles Trindade (trindadedev).
 */

internal object AttributeDefaults {
  private const val XMLNS_ANDROID = "\txmlns:android=\"http://schemas.android.com/apk/res/android\""
  private const val XMLNS_APP = "\txmlns:app=\"http://schemas.android.com/apk/res-auto\""
  private const val XMLNS_TOOLS = "\txmlns:tools=\"http://schemas.android.com/tools\""

  const val LAYOUT_HEIGHT = "\tandroid:layout_height=\"wrap_content\""
  const val LAYOUT_WIDTH = "\tandroid:layout_width=\"match_parent\""

  fun XMLNS(indent: String): String =
    "${indent}${XMLNS_ANDROID}\n${indent}${XMLNS_APP}\n${indent}${XMLNS_TOOLS}"

  const val DEFAULT_KEY = "id"
  const val DEFAULT_VALUE = "@+id/robok_no_id_view"
}
