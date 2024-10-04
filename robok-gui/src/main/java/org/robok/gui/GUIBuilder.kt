package org.robok.gui

import android.content.Context

import java.util.*

import java.lang.reflect.InvocationTargetException

class GUIBuilder (
    private val context: Context,
    private val debugLogs: Boolean = false,
    private val onFinish: (String, Boolean) -> Unit
) {
    private val stringBuilder = StringBuilder()
    private var indentLevel = 0
    private val indent: String
        get() = "\t".repeat(indentLevel)
    val closingTagLayoutList: MutableList<String> = mutableListOf()
    
    
    init {
        rootView()
    }
        
    fun rootView() {
        if (debugLogs) stringBuilder.newLineLn("<!-- opening Root Layout -->")
        stringBuilder.newLineLn("<LinearLayout\n${DefaultValues.XMLNS}")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        stringBuilder.newLineLn(">")
        indentLevel++
    }

    fun Column(/*id: String = DefaultValues.NO_ID*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- opening Column Layout -->")
        stringBuilder.newLineLn("${indent}<LinearLayout")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        // stringBuilder.newLine("${indent}${addId(id)}") 
        stringBuilder.newLineLn(">")
        indentLevel++
        closingTagLayoutList.add("Column:<LinearLayout/>")
        
    }
    
    // TO-DO: re-add params
    fun Text(/*id: String = DefaultValues.NO_ID, text: String*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- Text Component -->")
        stringBuilder.newLineLn("${indent}<TextView")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        /*
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        */
        stringBuilder.newLineLn("/>")
    }
    
    // TO-DO: re-add params
    fun Button(/*id: String = DefaultValues.NO_ID, text: String*/) {
        if (debugLogs) stringBuilder.newLineLn("<!-- Button  Component -->")
        stringBuilder.newLineLn("${indent}<Button")
        stringBuilder.newLineLn("${indent}${DefaultValues.LAYOUT_HEIGHT}")
        stringBuilder.newLine("${indent}${DefaultValues.LAYOUT_WIDTH}")
        /*
        stringBuilder.newLineLn("${indent}${addId(id)}")
        stringBuilder.newLine("${indent}\tandroid:text=\"$text\"")
        */
        stringBuilder.newLineLn("/>")
    }
    
    fun newLine(log: String){
        stringBuilder.append(log)
    }
    
    fun closeBlock() {
    // Verifica se o tamanho de closingTagLayoutList é maior que zero
    if (closingTagLayoutList.isNotEmpty()) {
        // Pega o último elemento de closingTagLayoutList
        val tags = closingTagLayoutList.last().split(":")

        if (tags.size >= 2) {  // Verifica se há pelo menos dois itens após o split
            val closingTagGui = tags[0]
            val closingTagXml = tags[1]

            // Diminui o nível de indentação
            indentLevel--

            if (debugLogs) stringBuilder.newLineLn("<!-- closing $closingTagGui Layout -->")

            // Adiciona a tag de fechamento ao stringBuilder
            stringBuilder.newLineLn("${indent}$closingTagXml")

            // Remove o último elemento da lista
            closingTagLayoutList.removeAt(closingTagLayoutList.size - 1)
        } else {
            // Lida com o caso onde não há dois elementos
            stringBuilder.newLineLn("Erro: Formato inválido de tag de fechamento.")
        }
    } else {
        // Lida com o caso onde closingTagLayoutList está vazio
        stringBuilder.newLineLn("Erro: Nenhum layout para fechar.")
    }
}
    
    fun runMethod(methodName: String) {
        try {
            // using reflection to call method by name
            val method = this::class.java.getDeclaredMethod(methodName)
            method.invoke(this)  // Call the method on the instance itself=
        } catch (e: InvocationTargetException) {
        
            val originalException = e.cause
    
            stringBuilder.append("\n ${originalException?.message}\n")
            e.printStackTrace() // display the exception stack if there is an error
        }
    }

    private fun addId(id: String): String = if (id != DefaultValues.NO_ID) "\tandroid:id=\"@+id/$id\"" else ""

    fun buildXML(): String {
        return stringBuilder.toString()
    }
    
    fun finish(){
        indentLevel--
        if (debugLogs) stringBuilder.newLineLn("<!-- closing Root Layout -->")
        stringBuilder.newLineLn("</LinearLayout>")
        if (debugLogs) stringBuilder.append("\nEnd.")
        onFinish(stringBuilder.toString(), false)
    }
    
    fun returnError(error: String){
       onFinish(error, true)
    }
}
 
/* maybe it will be used in the future
fun gui(block: GUIBuilder.() -> Unit): String {
    val builder = GUIBuilder()
    builder.rootView(block)
    return builder.build()
}
*/