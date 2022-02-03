package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LHardSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lhard_sets);

        Button set1 = findViewById(R.id.LHardSet1);
        Button set2 = findViewById(R.id.LHardSet2);
        Button set3 = findViewById(R.id.LHardSet3);
        Button set4 = findViewById(R.id.LHardSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.LHardSet1) startActivity(new Intent(this, LHardQ1.class));
        if (v.getId() == R.id.LHardSet2) startActivity(new Intent(this, LHardQ2.class));
        if (v.getId() == R.id.LHardSet3) startActivity(new Intent(this, LHardQ3.class));
        if (v.getId() == R.id.LHardSet4) startActivity(new Intent(this, LHardQ4.class));
    }
}