package com.example.mygithutio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.naver.com");
//        WebView myWebView = new WebView(activityContext);
//        setContentView(myWebView);
//
//        myWebView.loadUrl("https://hyeseonlee.github.io");
//
//        myWebView = (WebView) findViewById(R.id.webView);
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);


//
//        myWebView = (WebView) findViewById(R.id.webView);
//        myWebView.setWebViewClient(new WebViewClient());
//
//        myWebSettings=myWebView.getSettings();
//
//        myWebView.getSettings().setJavaScriptEnabled(true);
//        myWebView.loadUrl("https://hyeseonlee.github.io/");
//        myWebView.setWebChromeClient(new WebChromeClient());
    }
}
