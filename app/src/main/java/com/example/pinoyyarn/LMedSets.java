package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LMedSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmed_sets);

        Button set1 = findViewById(R.id.LMedSet1);
        Button set2 = findViewById(R.id.LMedSet2);
        Button set3 = findViewById(R.id.LMedSet3);
        Button set4 = findViewById(R.id.LMedSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.LMedSet1) startActivity(new Intent(this, LMedQ1.class));
        if (v.getId() == R.id.LMedSet2) startActivity(new Intent(this, LMedQ2.class));
        if (v.getId() == R.id.LMedSet3) startActivity(new Intent(this, LMedQ3.class));
        if (v.getId() == R.id.LMedSet4) startActivity(new Intent(this, LMedQ4.class));
    }
}