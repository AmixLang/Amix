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

/*
 * This class converts the Amix Amix Attributes Names to Android View Names.
 */

internal object AttributeConverter {
  public val attributes: Map<String, String> =
    mapOf(
      "id" to "android:id",
      "width" to "android:layout_width",
      "height" to "android:layout_height",
      "text" to "android:text",
      "text:color" to "android:textColor",
      "text:style" to "android:textStyle",
      "text:size" to "android:textSize",
      "padding" to "android:padding",
      "padding:top" to "android:paddingTop",
      "padding:bottom" to "android:paddingBottom",
      "padding:left" to "android:paddingLeft",
      "padding:right" to "android:paddingRight",
      "margin" to "android:layout_margin",
      "margin:top" to "android:layout_marginTop",
      "margin:bottom" to "android:layout_marginBottom",
      "margin:left" to "android:layout_marginLeft",
      "margin:right" to "android:layout_marginRight",
      "gravity" to "android:gravity",
      "layout:gravity" to "android:layout_gravity",
      "layout:gravity:center:horizontal" to "android:layout_centerHorizontal",
      "layout:gravity:center:vertical" to "android:layout_centerVertical",
      "layout:weight" to "android:layout_weight",
      "layout:startof" to "android:layout_toStartOf",
      "layout:endof" to "android:layout_toEndOf",
      "layout:above" to "android:layout_above",
      "layout:below" to "android:layout_below",
      "layout:align:start" to "android:layout_alignParentStart",
      "layout:align:end" to "android:layout_alignParentEnd",
      "layout:align:top" to "android:layout_alignParentTop",
      "layout:align:bottom" to "android:layout_alignParentBottom",
      "layout:align:baseline" to "android:layout_alignBaseline",
      "background" to "android:background",
      "orientation" to "android:orientation",
      "visibility" to "android:visibility",
      "clickable" to "android:clickable",
      "enabled" to "android:enabled",
      "focusable" to "android:focusable",
      "hint" to "android:hint",
      "input:type" to "android:inputType",
      "src" to "android:src",
      "scale:type" to "android:scaleType",
    ) + AttributesAbbreviations.attributes

  public fun convert(attribute: String): String? {
    return attributes[attribute]
  }
}
