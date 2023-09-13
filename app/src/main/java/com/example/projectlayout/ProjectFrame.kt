package com.example.projectlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProjectFrame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_frame)

        supportActionBar?.title = "Frame Layout"
    }
}