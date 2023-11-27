package com.education.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("key_message")) {
            String message = intent.getStringExtra("key_message");

            // Use the received data as needed, for example, set it to a TextView
            TextView textView = findViewById(R.id.datatextView_tv);
            textView.setText(message);
        }
    }
}