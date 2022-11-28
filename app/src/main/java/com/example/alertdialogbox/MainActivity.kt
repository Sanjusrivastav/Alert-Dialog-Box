package com.example.alertdialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alert_btn.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
            .setMessage("Do you want to close this application")
            .setTitle("Alert Dialog Box")
            .setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i -> null })
            .setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i -> null })
                .show()



        }


    }
}