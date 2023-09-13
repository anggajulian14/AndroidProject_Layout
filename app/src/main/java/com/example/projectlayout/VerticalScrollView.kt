package com.example.projectlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VerticalScrollView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vertical_scroll_view)

        supportActionBar?.title = "Vertical Scroll View"

    }
}