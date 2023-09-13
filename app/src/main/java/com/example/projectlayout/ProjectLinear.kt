package com.example.projectlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ProjectLinear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_linear)

        var to = findViewById<EditText>(R.id.to)
        var subject = findViewById<EditText>(R.id.subject)
        var message = findViewById<EditText>(R.id.message)
        var send = findViewById<Button>(R.id.send)

        supportActionBar?.title = "Linear Layout"

    }
}