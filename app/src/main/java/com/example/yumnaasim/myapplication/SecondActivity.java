package com.example.yumnaasim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //calling implementation of onCreate() and overriding
        setContentView(R.layout.activity_second); // renders the layout
    }
}
