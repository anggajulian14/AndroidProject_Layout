package com.example.projectlayout

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TableLayout
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val linearLayout = findViewById<LinearLayout>(R.id.linear)
        val relativeLayout = findViewById<LinearLayout>(R.id.relative)
        val constraintLayout = findViewById<LinearLayout>(R.id.constraint)
        val frameLayout = findViewById<LinearLayout>(R.id.frame)
        val tableLayout = findViewById<LinearLayout>(R.id.table)
        val Horizontal = findViewById<LinearLayout>(R.id.horizontal)
        val Vertical = findViewById<LinearLayout>(R.id.vertical)


        linearLayout.setOnClickListener{

            val intent = Intent(this, ProjectLinear::class.java)
            startActivity(intent)

        }

        relativeLayout.setOnClickListener{

            val intent = Intent(this, ProjectRelative::class.java)
            startActivity(intent)

        }

        constraintLayout.setOnClickListener{

            val intent = Intent(this, ProjectConstraint::class.java)
            startActivity(intent)

        }

        frameLayout.setOnClickListener {

            val intent = Intent(this, ProjectFrame::class.java)
            startActivity(intent)

        }

        tableLayout.setOnClickListener {

            val intent = Intent(this, ProjectTable::class.java)
            startActivity(intent)

        }


        Horizontal.setOnClickListener {

            val intent = Intent(this, com.example.projectlayout.HorizontalScrollView::class.java)
            startActivity(intent)

        }

        Vertical.setOnClickListener{

            val intent = Intent(this, VerticalScrollView::class.java)
            startActivity(intent)

        }

    }
}