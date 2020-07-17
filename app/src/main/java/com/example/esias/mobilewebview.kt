package com.example.esias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class mobilewebview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mobilewebview)
        val getUrl: String = intent.getStringExtra("urltoload")
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(getUrl)
        webView.settings.javaScriptEnabled = true
    }
}