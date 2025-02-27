package org.amix.converter

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

internal object AttributesAbbreviations {
  public val attributes: Map<String, String> =
    mapOf(
      "layout:an:bm" to "android:layout_alignParentBottom",
      "layout:an:be" to "android:layout_alignBaseline",
      "layout:gravity:cr:hl" to "android:layout_centerHorizontal",
      "layout:gravity:cr:vl" to "android:layout_centerVertical",
      "layout:an:st" to "android:layout_alignParentStart",
      "layout:an:tp" to "android:layout_alignParentTop",
      "layout:an:ed" to "android:layout_alignParentEnd",
    )

  public fun convert(attribute: String): String? {
    return attributes[attribute]
  }
}
