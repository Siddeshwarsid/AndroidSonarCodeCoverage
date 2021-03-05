package com.mzhang.dynamicfeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class DynamicFeatureActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dynamic_feature)

        doMathPlus(4, 2)
        doMathTimes(4, 2)
    }

    fun doMathTimes(a: Int, b: Int): Int {
        return a * b
    }

    fun doMathPlus(a: Int, b: Int): Int {
        return a + b
    }
}