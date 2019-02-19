package com.example.whatsappext;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

    private FrameLayout frameLayout;
    private WebView mWebView;
    private EditText adressBar;
    public static int counter = 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        // Hide status bar
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Show status bar
//        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setDomStorageEnabled(true);
        mWebView.loadUrl("http://forha.66ghz.com/?i=2");
        mWebView.setWebViewClient(new MyAppWebViewClient());

//        adressBar.setText(mWebView.getUrl());

    }
    @Override
    public void onBackPressed() {
        if (mWebView.canGoBack()){
            mWebView.goBack();
        }
        else {
            super.onBackPressed();
        }
    }
}
