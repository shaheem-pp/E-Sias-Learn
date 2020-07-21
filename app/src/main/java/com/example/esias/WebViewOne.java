package com.example.esias;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewOne extends AppCompatActivity {
    ProgressBar progressBar;

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_one);
        WebView webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        progressBar = (ProgressBar) findViewById(R.id.webviewprogressbar);
        progressBar.setMax(100);

        webSettings.setJavaScriptEnabled(true);
        webSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);

        mWebView = (WebView) findViewById(R.id.webView);

        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(false);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        Boolean syllabusPage = false;

        Boolean teacherPage = false;

        webSettings.setLoadWithOverviewMode(true);
        webSettings.setEnableSmoothTransition(true);
        String url = getIntent().getStringExtra("urltoload");

        syllabusPage = getIntent().getBooleanExtra("syllabusPage", false);
        teacherPage = getIntent().getBooleanExtra("teacherPage",false);

        if (url.equals("https://aquibe.github.io/e-sias-developers/")) {
            webView.setInitialScale(90);
        } else if (syllabusPage) {
            webView.setInitialScale(200);
        } else if(url.equals("https://aquibe.github.io/e-sias-notification/")){
            webView.setInitialScale(200);
        }
          else if(url.equals("https://siaswebapp.herokuapp.com/")) {
            webView.setInitialScale(250);
        }
          else if(url.equals("https://aquibe.github.io/e-sias-publications/")) {
            webView.setInitialScale(200);
        }
          else if(url.equals("https://siaswebapp.herokuapp.com/login/")) {
            webView.setInitialScale(250);
        }
          else {
            webView.setInitialScale(100);
        }

          if(url.equals("https://aquibe.github.io/e-sias-magazine/index.html") || url.equals("https://aquibe.github.io/e-sias-notification/") || url.equals("https://aquibe.github.io/e-sias-publications/")){
            webSettings.setCacheMode(WebSettings.LOAD_NO_CACHE);
            webSettings.setAppCacheEnabled(false);
        }
           if(url.equals("https://siaswebapp.herokuapp.com/") || url.equals("https://siaswebapp.herokuapp.com/login/")){
              webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
              webSettings.setAppCacheEnabled(true);
          }

        webView.loadUrl(url);
        final Boolean finalSyllabusPage1 = syllabusPage;

        final Boolean finalTeacherPage = teacherPage;

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressBar.setVisibility(View.GONE);
            }

            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if(finalSyllabusPage1)
                    return false;

                if(finalTeacherPage)
                    return false;

                if (url != null && (url.startsWith("http://") || url.startsWith("https://"))) {
                    view.getContext().startActivity(
                            new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                    return true;
                } else {
                    return true;
                }
            }

            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                super.onReceivedError(view, errorCode, description, failingUrl);
                Toast.makeText(WebViewOne.this, "Error. Please try again", Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mWebView.canGoBack()) {
                        mWebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
