package org.robok.gui.demo

import android.app.Activity
import android.app.AlertDialog
import android.os.Bundle
import android.widget.TextView

import org.robok.gui.demo.databinding.ActivityMainBinding

import org.robok.gui.*

class MainActivity : Activity() {

    private var _binding: ActivityMainBinding? = null

    private val binding: ActivityMainBinding
        get() = checkNotNull(_binding) { "Activity has been destroyed" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createCode.setOnClickListener {
            val basicGuiXML = gui {
                Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                }
            }
            binding.xmlCode.text = basicGuiXML
            binding.xmlCode.setTextIsSelectable(true)

            try {
                
            } catch (e: Exception) {
                showDialog(e.toString())
            }
        }
    }

    private fun showDialog(s: String) {
        val messageTextView = TextView(this)
        messageTextView.text = s
        messageTextView.textSize = 16f
        messageTextView.setPadding(32, 32, 32, 32)
        messageTextView.setTextIsSelectable(true)
        AlertDialog.Builder(this)
            .setTitle("Error")
            .setView(messageTextView)
            .setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}