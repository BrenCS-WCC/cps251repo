package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment3.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val statusLabel = binding.statusLabel
        val reportLabel = binding.calcReportLabel

        val moneyInput = binding.numEntry

        val calcButton = binding.calcTipActor

        calcButton.setOnClickListener {
            //statusLabel.text = "Clicked!"

            // Reset displayed strings
            statusLabel.text = ""
            reportLabel.text = ""

            if (moneyInput.text.toString().isBlank()) {
                statusLabel.setText(R.string.blankInputError)
            } else {
                statusLabel.setText(R.string.readyStatusMsg)

                val billTotal : Double = moneyInput.text.toString().toDouble()
                val percents = arrayOf(
                    0.10,
                    0.15,
                    0.20,
                    0.25
                )

                var summaryString = ""

                for (i in percents) {
                    var value = i
                    value = (value * billTotal) + billTotal

                    val stringValue = String.format(Locale.US, "%.2f", value)
                    summaryString = summaryString + (i * 100).toInt().toString() + "% = " + stringValue + "\n"
                }

                reportLabel.text = summaryString
                }
            }
        }
    }