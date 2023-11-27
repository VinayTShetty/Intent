package com.education.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * Implicit Intent
     */
    public void button_1(View view){
        if(view.getId()==R.id.button_bt_1){
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://certisured.com/"));
            startActivity(intent);
        }
    }

    /**
     *
     * Explicit Intent
     */
    public void button_2(View view){
        if(view.getId()==R.id.button_bt_2){
            Intent i = new Intent(getApplicationContext(), DataActivity.class);
            String message = "Data from MainActivity";
            i.putExtra("key_message", message);
            startActivity(i);
        }
    }
}