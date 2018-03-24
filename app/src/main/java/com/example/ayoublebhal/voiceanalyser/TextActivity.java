package com.example.ayoublebhal.voiceanalyser;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
    }

    public void submittext(View view) {

        EditText ettext=(EditText)findViewById(R.id.ettext);
        String text= new String(ettext.getText().toString());
        Intent intent_text = new Intent(TextActivity.this, AnalyseActivityText.class);
        intent_text.putExtra("text",text);
        TextActivity.this.startActivity(intent_text);
    }
}
