package org.robok.gui.demo

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

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.shape.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties

import org.robok.gui.demo.R
import org.robok.gui.demo.ui.theme.RobokTheme
import org.robok.gui.demo.ui.components.editor.HighlightingEditor
import org.robok.gui.demo.ui.components.syntax.SyntaxType
import org.robok.gui.GUIBuilder
import org.robok.gui.compiler.GUICompiler

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            RobokTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                      MainScreen()
                }
            }
        }
    }

    @Composable
    fun MainScreen() {
        var showDialog by remember { mutableStateOf(false) }
        var showProgress by remember { mutableStateOf(false) }
        var dialogMessage by remember { mutableStateOf("") }
        var isError by remember { mutableStateOf(false) }
        var code by remember { mutableStateOf("""Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                   
                }""") }
        var isDebugLogs by remember { mutableStateOf(false) }  
        
        // screen cintent
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HighlightingEditor(
                value = code,
                onValueChange = {
                      code = it
                },
                syntaxType = SyntaxType.XML
            )
            Button(
                onClick = {
                    showProgress = true
                    val guiBuilder = GUIBuilder(
                        context = this@MainActivity,
                        debugLogs = isDebugLogs,
                        onFinish = { value, error ->
                            dialogMessage = value
                            isError = error
                            showDialog = true
                            showProgress = false
                        }
                    )
                    val guiCompiler = GUICompiler(
                        guiBuilder = guiBuilder,
                        code = code
                    )
                }
            ) {
                Text(text = stringResource(id = R.string.create_basic_gui))
            }
            Row(
                 modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .clickable { isDebugLogs = !isDebugLogs }
                     .padding(vertical =  7.dp, horizontal = 10.dp),
                 verticalAlignment = Alignment.CenterVertically,
                 horizontalArrangement = Arrangement.Center
            ) {
               Text(
                  text = stringResource(id = R.string.debug_texts),
                  modifier = Modifier
                      .align(Alignment.CenterVertically)
                       .padding(vertical =  10.dp)
               )
               Spacer(modifier = Modifier.width(8.dp))
               Switch(
                   checked = isDebugLogs,
                   onCheckedChange = null,
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .padding(vertical =  10.dp)
               )
            }
        }
        // dialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = {
                    Text(if (!isError) stringResource(id = R.string.finish_method) else stringResource(id = R.string.error_ocurred) )
                },
                text = {
                    SelectionContainer {
                        HighlightingEditor(
                            value = dialogMessage,
                            onValueChange = {  },
                            syntaxType = SyntaxType.XML
                        )
                    }
                },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text("OK")
                    }
                }
            )
        }
        if (showProgress) {
            LoadingIndicatorDialog(showDialog = showProgress, onDismiss = { showProgress = false })
         }
    }
    @Composable
    fun LoadingIndicatorDialog(showDialog: Boolean, onDismiss: () -> Unit) {
        if (showDialog) {
            Dialog(
                onDismissRequest = { onDismiss() },
                DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(22.dp))
                        .background(MaterialTheme.colorScheme.surfaceVariant)
                ) {
                        CircularProgressIndicator(
                            modifier = Modifier
                                .padding(16.dp)
                        )
                }
            }
        }
    }
}