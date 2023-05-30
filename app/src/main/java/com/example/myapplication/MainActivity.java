package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.provider.Settings;
import android.provider.Settings.Secure;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView test1;
        TextView test2;
        TextView test3;

        String android_id1 = Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        String android_id2 = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        test1 = findViewById(R.id.aidget1);
        test2 = findViewById(R.id.aidget2);


        test1.setText(android_id1);
        test2.setText(android_id2);

    }
}