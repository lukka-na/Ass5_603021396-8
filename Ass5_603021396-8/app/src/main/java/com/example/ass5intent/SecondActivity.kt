package com.example.ass5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent?.extras
        var newEmployee = data?.getParcelable<Employee>("stdName")
        nameText.text = "Employee Name: ${newEmployee?.Name}"
        genderText.text = "Gender: ${newEmployee?.gender}"
        emailText.text = "E-mail: ${newEmployee?.email}"
        salaryText.text = "Salary: ${newEmployee?.salary} Baht"
    }
    fun onClickClose(view: View){
        finish()
    }
    }

