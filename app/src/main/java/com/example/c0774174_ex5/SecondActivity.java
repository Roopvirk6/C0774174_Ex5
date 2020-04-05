package com.example.c0774174_ex5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView d1;
    private TextView d2;
    private TextView d3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        d1 = (TextView)findViewById(R.id.textView);
        d2 = (TextView)findViewById(R.id.textView2);
        d3 = (TextView)findViewById(R.id.textView3);
        Bundle data = getIntent().getExtras();
        ContentDisplay content = (ContentDisplay) data.getParcelable("Content");

        Intent intent = getIntent();


    }
}
