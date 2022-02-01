package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cEasySets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasy_sets);

        Button set1 = findViewById(R.id.cEasySet1);
        Button set2 = findViewById(R.id.cEasySet2);
        Button set3 = findViewById(R.id.cEasySet3);
        Button set4 = findViewById(R.id.cEasySet4) ;

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cEasySet1) startActivity(new Intent(this, cEasyQ1.class));
        if (v.getId() == R.id.cEasySet2) startActivity(new Intent(this, cEasyQ2.class));
        if (v.getId() == R.id.cEasySet3) startActivity(new Intent(this, cEasyQ3.class));
        if (v.getId() == R.id.cEasySet4) startActivity(new Intent(this, cEasyQ4.class));
    }
}