package com.example.tp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class loading extends AppCompatActivity {

    private static final int LOADING_DELAY = 2000; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        // Simulate some background work
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity after the loading delay
                Intent intent = new Intent(loading.this, login.class);
                startActivity(intent);
                finish(); // Finish this activity so the user can't go back to it
            }
        }, LOADING_DELAY);
    }
}
