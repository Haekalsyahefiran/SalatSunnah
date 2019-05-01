package com.example.haekalsyahefiransmp7c.salatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Deskripsi extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        webView = findViewById(R.id.webView);

        Intent deskripsi = getIntent();

        String link = deskripsi.getStringExtra("sunnah");

        //agar javascript nya bisa terbaca
        webView.getSettings().getJavaScriptEnabled();
        //agar gambarnya otomatis di masukkan
        webView.getSettings().setLoadsImagesAutomatically(true);
        //
        webView.loadUrl(link);
    }
}
