package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cHardSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_sets);

        Button set1 = findViewById(R.id.cHardSet1);
        Button set2 = findViewById(R.id.cHardSet2);
        Button set3 = findViewById(R.id.cHardSet3);
        Button set4 = findViewById(R.id.cHardSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cHardSet1) startActivity(new Intent(this, cHardQ1.class));
        if (v.getId() == R.id.cHardSet2) startActivity(new Intent(this, cHardQ2.class));
        if (v.getId() == R.id.cHardSet3) startActivity(new Intent(this, cHardQ3.class));
        if (v.getId() == R.id.cHardSet4) startActivity(new Intent(this, cHardQ4.class));
    }
}