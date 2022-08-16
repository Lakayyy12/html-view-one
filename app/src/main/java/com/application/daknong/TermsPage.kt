package com.application.daknong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TermsPage : AppCompatActivity() {

    private lateinit var webViewT: WebView
    private val URL = "file:///android_asset/TC.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_page)

        webViewT = findViewById(R.id.webT)

        webViewT.apply {
            loadUrl(URL)
        }
    }
}