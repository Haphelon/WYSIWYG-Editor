package com.haphelon.wysiwygeditor

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import jp.wasabeef.richeditor.RichEditor

class MainActivity : AppCompatActivity() {

    private lateinit var editor: RichEditor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editor = findViewById(R.id.editor)
    }

    fun centerText(view: View) {
        editor.setAlignCenter()
    }

    fun boldText(view: View) {
        editor.setBold()
    }
}
