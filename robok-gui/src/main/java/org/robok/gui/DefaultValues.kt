package org.robok.gui

/*
 *  This file is part of Robok © 2024.
 *
 *  Robok is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Robok is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Robok.  If not, see <https://www.gnu.org/licenses/>.
 */ 

/*
* A Basic values used on XMLs Layouts.
* @author Aquiles Trindade (trindadedev).
*/

object DefaultValues {
    private const val XMLNS_ANDROID = "\txmlns:android=\"http://schemas.android.com/apk/res/android\""
    private const val XMLNS_APP = "\txmlns:app=\"http://schemas.android.com/apk/res-auto\""
    private const val XMLNS_TOOLS = "\txmlns:tools=\"http://schemas.android.com/tools\""
    const val NO_ID = ""
    const val XMLNS = "$XMLNS_ANDROID\n$XMLNS_APP\n$XMLNS_TOOLS"
    const val LAYOUT_HEIGHT = "\tandroid:layout_height=\"wrap_content\""
    const val LAYOUT_WIDTH= "\tandroid:layout_width=\"match_parent\""
}