package com.istiak.canvastest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var firstCanvas: FirstCanvas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        firstCanvas = FirstCanvas(this)
        firstCanvas.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
    }
}
