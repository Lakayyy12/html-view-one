package com.application.daknong

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var wb: Button? = null

    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        wb = findViewById(R.id.wb)
        wb?.setOnClickListener {
            val intent = Intent(this, ViewPage::class.java)
            startActivity(intent)
        }

        wb = findViewById(R.id.pp)
        wb?.setOnClickListener {
            val intent = Intent(this, PrivacyPage::class.java)
            startActivity(intent)
        }

        wb = findViewById(R.id.tc)
        wb?.setOnClickListener {
            val intent = Intent(this, TermsPage::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            super.finishAffinity()
        }
    }
}