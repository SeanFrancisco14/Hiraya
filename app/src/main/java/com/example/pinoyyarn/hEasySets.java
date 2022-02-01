package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hEasySets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heasy_sets);

        Button set1 = findViewById(R.id.hEasySet1);
        Button set2 = findViewById(R.id.hEasySet2);
        Button set3 = findViewById(R.id.hEasySet3);
        Button set4 = findViewById(R.id.hEasySet4) ;

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hEasySet1) startActivity(new Intent(this, hEasyQ1.class));
        if (v.getId() == R.id.hEasySet2) startActivity(new Intent(this, hEasyQ2.class));
        if (v.getId() == R.id.hEasySet3) startActivity(new Intent(this, hEasyQ3.class));
        if (v.getId() == R.id.hEasySet4) startActivity(new Intent(this, hEasyQ4.class));
    }
}