package com.example.andella

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        //https://laravel.com/docs/5.8/csrf#csrf-x-csrf-token

        //web_about.loadUrl("")

        web_about.loadUrl("https://andela.com/about")
        web_about.settings.javaScriptEnabled = true

    }
}
