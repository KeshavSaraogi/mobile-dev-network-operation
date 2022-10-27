package edu.temple.basicbrowser

import android.R
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var urlEditText: EditText
    lateinit var goButton: ImageButton
    lateinit var webView: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        urlEditText = findViewById(R.id.urlEditText)
        goButton = findViewById(R.id.goButton)
        webView = findViewById(R.id.webView)

        webView.settings.javaScriptEnabled = true
        // Allow your browser to intercept hyperlink clicks
        webView.webViewClient = WebViewClient()

    }

    fun fixUrl(url: String) {
        if (url.contains(":"))
            url
        else
            StringBuilder()
                .append("https://")
                .append(url)
                .toString()
    }
}    