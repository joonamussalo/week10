package com.example.week10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    WebView web;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.webbi);
        editText= findViewById(R.id.editText);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);
        button = findViewById(R.id.refresh);




    }

    public void Refresh(View v) {
        web.reload();
    }

    public void Haku(View v) {
        String osoite = editText.getText().toString();
        if (osoite.equals("index.html")) {
            web.loadUrl("file:///android_asset/index.html");
        } else {
            web.loadUrl("http://"+osoite);


        }
    }

    public void back(View v) {
        web.goBack();
    }

    public void forward(View v) {
        web.goForward();
    }

    public void executeJavascipt (View v) {
        web.evaluateJavascript("javascript:shoutOut()", null);
    }
    public void initialize (View v) {
        web.evaluateJavascript("javascript:initialize()", null);
    }
}
