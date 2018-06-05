package com.example.wer.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv1 = findViewById(R.id.webView);

        String URL = getIntent().getStringExtra("sitioWeb");
        wv1.setWebViewClient(new WebViewClient()); //Utiliza el control WebViw para navegar dentro de la app
       // wv1.setWebChromeClient(new WebChromeClient());
        wv1.loadUrl("http://"+"www."+URL+".com"); // Abre el sitio solicitado

    }

    public void Cerrar(View view){
        finish();
    }
}
