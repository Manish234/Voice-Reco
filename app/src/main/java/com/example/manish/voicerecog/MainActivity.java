package com.example.manish.voicerecog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    public ListView mList;
    public Button speakButton;
    public static final int VOICE_RECOGNITION_REQUEST_CODE = 1234;

    TextView textView= (TextView) findViewById(R.id.textView2);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView w=(WebView)findViewById(R.id.web);
        w.loadUrl("https://en.wikipedia.org");
        WebSettings ws=w.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setLoadWithOverviewMode(true);
           }

    @Override
    public void onClick(View v) {

    }


        public void closebtn(View v){
            if (textView.getText().length() == 0
                    || textView.equals("stoppy")) {
                textView.setText("starty");
            } else {
                textView.setText("stoppy");
            }
    }
    }
