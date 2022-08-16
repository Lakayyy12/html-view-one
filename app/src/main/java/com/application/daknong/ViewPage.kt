package com.application.daknong

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ViewPage : AppCompatActivity() {

    private lateinit var web: WebView
    private val URL = "file:///android_asset/mawi.html"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_page)

        web = findViewById(R.id.web)

        web.apply {
            loadUrl(URL)
        }
    }
}