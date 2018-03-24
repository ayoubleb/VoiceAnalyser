package com.example.ayoublebhal.voiceanalyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ApiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
    }

    public void voicesearch(View view) {
        Intent intent = new Intent(ApiActivity.this, VoiceActivity.class);
        ApiActivity.this.startActivity(intent);
    }

    public void textsearch(View view) {

        Intent intent = new Intent(ApiActivity.this, TextActivity.class);
        ApiActivity.this.startActivity(intent);

    }
}
