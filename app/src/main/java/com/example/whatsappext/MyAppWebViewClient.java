package com.example.whatsappext;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatDelegate;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if (request.getUrl() != null && (request.getUrl().toString().startsWith("http://api.whatsapp")
                || request.getUrl().toString().startsWith("https://api.whatsapp"))) {
//            String url = "https://wa.me/" + request.getUrl().toString().substring(24);
//            System.out.println(url);
//            System.out.println("True");

            view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString())));

            return true;
        }
        return false;
    }
}
