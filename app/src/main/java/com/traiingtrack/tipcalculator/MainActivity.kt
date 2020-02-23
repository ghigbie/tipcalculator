package com.traiingtrack.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val billAmount: EditText = findViewById(R.id.editBillAmount)
        val tipAmount: EditText = findViewById(R.id.editTipPercent)
        val resultTip: TextView = findViewById(R.id.resultTip)
        val resultTotal: TextView = findViewById(R.id.resultTotal)
        val calculateTipButton: Button = findViewById(R.id.calculateTipButton)

        calculateTipButton.setOnClickListener{
            calculateTip(billAmount, tipAmount, resultTip, resultTotal)
        }
    }

    private fun calculateTip(billAmount: EditText, tipAmount: EditText, resultTip: TextView, resultTotal: TextView) {
        var tip: Double? = null
        var total: Double? = null

        if(billAmount != null && tipAmount != null) {
            val bill: Double = billAmount.text.toString().toDouble()
            val tipPercent: Double = tipAmount.text.toString().toDouble()
            tip = (bill * tipPercent)/100
            total = tip + bill
        }else{
            val toast = Toast.makeText(applicationContext, "Please complete the fields before calculating the tip.", Toast.LENGTH_SHORT)
            toast.show()
        }
        var format: NumberFormat = NumberFormat.getInstance()
        resultTip.text = "Tip: $${format.format(tip)}"
        resultTotal.text = "Total: $${format.format(total)}"
    }

}
