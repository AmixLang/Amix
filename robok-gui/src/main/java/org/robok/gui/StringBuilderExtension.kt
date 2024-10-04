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
* Add new line on StringBuilder.
*/
fun StringBuilder.newLine(text: String) {
    if (text.isNotEmpty()) {
        this.append("$text")
    }
}

/* 
* Add new line with \n in StringBuilder.
*/
fun StringBuilder.newLineLn(text: String) {
    if (text.isNotEmpty()) {
        this.append("$text\n")
    }
}