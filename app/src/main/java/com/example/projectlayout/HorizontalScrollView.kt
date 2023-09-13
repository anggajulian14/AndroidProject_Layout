package com.example.projectlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HorizontalScrollView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horizontal_scroll_view)

        supportActionBar?.title = "Horizontal Scroll View"

    }
}