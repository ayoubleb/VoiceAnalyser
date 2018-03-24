package com.example.ayoublebhal.voiceanalyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
public class AnalyseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);


        Intent intent_text2 = getIntent();
        String name2 = intent_text2.getStringExtra("text2");



            TextView textView14 = (TextView) findViewById(R.id.textView14);
            textView14.setText(name2);

        }





    }

