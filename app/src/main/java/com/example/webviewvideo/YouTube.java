package com.example.webviewvideo;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class YouTube extends RecyclerView.ViewHolder {
    WebView webView;
    public YouTube(@NonNull View itemView) {
        super(itemView);
        webView=itemView.findViewById(R.id.visible);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
    }
}
