package com.example.androidbaseproject.activity.example;

import android.os.Bundle;

import com.example.androidbaseproject.R;
import com.example.androidbaseproject.activity.baseActivity.BaseActivity;

public class ExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
    }
}
