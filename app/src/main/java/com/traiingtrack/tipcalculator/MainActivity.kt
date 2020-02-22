package com.traiingtrack.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    var billAmount: EditText = findViewById(R.id.editBillAmount)
    var tipAmount: EditText = findViewById(R.id.editTipPercent)
    var resultTip: TextView = findViewById(R.id.resultTip)
    val calculateTipButton: Button = findViewById(R.id.calculateTipButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculateTipButton.setOnClickListener{
            calculateTip()
        }
    }

    private fun calculateTip() {
        var tip: Double? = null

        if(billAmount != null && tipAmount != null) {
            var bill: Double = billAmount.text.toString().toDouble()
            var tipPercent: Double = tipAmount.text.toString().toDouble()
            tip = (bill * tipPercent)/100
        }else{
            val toast = Toast.makeText(applicationContext, "Please complete the fields before calculating the tip.", Toast.LENGTH_SHORT)
            toast.show()
        }
        resultTip.text = tip.toString()
    }
}
