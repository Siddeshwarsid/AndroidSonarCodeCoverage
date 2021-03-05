package com.mzhang.sonarqubejacoco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.mzhang.sonarqubejacoco.math.MathActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var text: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.buttonDFM).setOnClickListener(this)
        findViewById<View>(R.id.buttonMath).setOnClickListener(this)
        text = findViewById<View>(R.id.text) as TextView
    }

    override fun onClick(v: View) {
        if (v.id == R.id.buttonDFM) {
//            text?.text = "Hello World!"
            val intent = Intent().setClassName(applicationContext, "com.mzhang.dynamicfeature.DynamicFeatureActivity")
            startActivity(intent)
        } else {
//            v.visibility = View.GONE

            startActivity(Intent(applicationContext, MathActivity::class.java))
        }
    }
}