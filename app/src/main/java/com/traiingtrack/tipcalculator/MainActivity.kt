package com.traiingtrack.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var billAmount: EditText = findViewById(R.id.editBillAmount)
    var tipAmount: EditText = findViewById(R.id.editTipPercent)
    var resultTip: TextView = findViewById(R.id.resultTip)
    val calculateTip: Button = findViewById(R.id.calculateTipButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun calculateTip():Double{
        if(billAmount && tipAmount) {
            var tip: Double? = null
            var bill: Double = billAmount.text.toString().toDouble()
            var tipPercent: Double = tipAmount.text.toString().toDouble()
            tip
        }else

        return tip
    }
}
