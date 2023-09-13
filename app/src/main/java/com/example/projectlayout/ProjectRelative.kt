package com.example.projectlayout

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import java.util.Calendar

class ProjectRelative : AppCompatActivity() {

    lateinit var datePickerDialog: DatePickerDialog
    lateinit var selectedDate: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_relative)

        supportActionBar?.title = "Relative Layout"

        val editTxt = findViewById<EditText>(R.id.editTxt)
        val getDateButton = findViewById<Button>(R.id.getDate)
        val TxtView = findViewById<TextView>(R.id.TxtView)

        val calendar = Calendar.getInstance()
        datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { _: DatePicker?, tahun: Int, bulan: Int, tanggal: Int ->
                selectedDate = "$tanggal/${bulan + 1}/$tahun"
                editTxt.setText(selectedDate)
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        )

        editTxt.setOnClickListener {
            datePickerDialog.show()
        }

        getDateButton.setOnClickListener {
            TxtView.text = "Selected Date : $selectedDate"
        }
    }
}