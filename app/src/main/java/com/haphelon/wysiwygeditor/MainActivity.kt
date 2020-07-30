package com.haphelon.wysiwygeditor

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import jp.wasabeef.richeditor.RichEditor

class MainActivity : AppCompatActivity() {

    private lateinit var editor: RichEditor
    private lateinit var fontSizeEditor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editor = findViewById(R.id.editor)
        editor.setBackgroundColor(R.color.colorEditorBg)
        fontSizeEditor = findViewById(R.id.fontSizeEditText);
        fontSizeEditor.addTextChangedListener(textWatcher())
    }

    fun centerText(view: View) {
        editor.setAlignCenter()
    }

    fun boldText(view: View) {
        editor.setBold()
    }

    private fun textWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                val size: String = p0.toString()
                val x: Int = if (size == "") 0 else size.toInt()
                editor.setFontSize(x)
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        }
    }
}
