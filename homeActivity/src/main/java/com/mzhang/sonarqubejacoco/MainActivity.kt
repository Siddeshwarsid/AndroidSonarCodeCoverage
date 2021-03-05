package com.mzhang.sonarqubejacoco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var text: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.button).setOnClickListener(this)
        findViewById<View>(R.id.hide).setOnClickListener(this)
        text = findViewById<View>(R.id.text) as TextView
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button) {
            text?.text = "Hello World!"
        } else {
            v.visibility = View.GONE
        }
    }
}