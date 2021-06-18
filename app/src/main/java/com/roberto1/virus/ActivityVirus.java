package com.roberto1.virus;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

public class ActivityVirus extends AppCompatActivity {

    public  WebView MyWebView;           //TODO declaracion del webview
    public Button covid;                //TODO boton para sonido

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virus);




        /* TODO lineas para clic en boton al presionar */
        covid = findViewById(R.id.covidboton);
        /* TODO para crear sonido al apagar o prender el boton */
        final MediaPlayer mpButtonClick;
        mpButtonClick  = MediaPlayer.create(this, R.raw.clic);
        mpButtonClick.start();
        /*
        TODO aqui termina
        TODO codigo para abrir un webview dentro de activity con javascrip enable, cache cargador y aceleracion de hardware en el manifest
        */
        MyWebView = (WebView)findViewById(R.id.mapa);
        WebSettings webSettings = MyWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        MyWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        MyWebView.loadUrl("https://www.arcgis.com/apps/dashboards/85320e2ea5424dfaaa75ae62e5c06e61" );

    }

    @Override
    public void onBackPressed() {
        if(MyWebView.canGoBack())
            MyWebView.goBack();
        else
        super.onBackPressed();
    }
}

