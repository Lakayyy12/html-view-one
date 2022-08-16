package com.application.daknong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView

class PrivacyPage : AppCompatActivity() {

    private lateinit var webViewP: WebView
    private val URL = "file:///android_asset/PP.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_page)

        webViewP = findViewById(R.id.webP)

        webViewP.apply {
            loadUrl(URL)
            settings.layoutAlgorithm = WebSettings.LayoutAlgorithm.SINGLE_COLUMN
            isHorizontalScrollBarEnabled = false
        }
    }
}