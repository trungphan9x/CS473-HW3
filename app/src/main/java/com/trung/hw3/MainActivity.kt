package com.trung.hw3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener() {
        button.setOnClickListener {
            val androidVersion = edt_android_version.text.toString()
            val androidCode = edt_android_code.text.toString()
            if (!androidVersion.isNullOrEmpty() && !androidCode.isNullOrEmpty()) {
                val textView1 = TextView(applicationContext).apply {
                    text = androidVersion
                }

                val textView2 = TextView(applicationContext).apply {
                    text = androidCode
                }

                val tableRow = TableRow(applicationContext).apply {
                    layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
                    addView(textView1,0)
                    addView(textView2,1)
                    setBackgroundColor(Color.YELLOW)
                    setPadding(0,0,0,100)
                }

                tableLayout.addView(tableRow)
            } else {
                Toast.makeText(applicationContext, "invalid input", Toast.LENGTH_LONG).show()
            }
        }
    }

}