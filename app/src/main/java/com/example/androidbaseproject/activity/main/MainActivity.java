package com.example.androidbaseproject.activity.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.androidbaseproject.R;
import com.example.androidbaseproject.activity.example.ExampleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // I just start another activity
        startActivity(new Intent(this, ExampleActivity.class));
    }
}
