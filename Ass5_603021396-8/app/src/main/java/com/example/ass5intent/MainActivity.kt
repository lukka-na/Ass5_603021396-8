package com.example.ass5intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var selectedId: Int = radioGroup.checkedRadioButtonId;
        var radioButton: RadioButton = findViewById(selectedId);
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("stdName", Employee(edit_username.text.toString(),
            radioButton.text as String,edit_email.text.toString(),edit_salary.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View) {
        edit_username.text.clear()
        edit_email.text.clear()
        radioGroup.clearCheck()
        edit_salary.text.clear()

    }
}
