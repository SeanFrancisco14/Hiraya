package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cMedSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmed_sets);

        Button set1 = findViewById(R.id.cMedSet1);
        Button set2 = findViewById(R.id.cMedSet2);
        Button set3 = findViewById(R.id.cMedSet3);
        Button set4 = findViewById(R.id.cMedSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cMedSet1) startActivity(new Intent(this, cMedQ1.class));
        if (v.getId() == R.id.cMedSet2) startActivity(new Intent(this, cMedQ2.class));
        if (v.getId() == R.id.cMedSet3) startActivity(new Intent(this, cMedQ3.class));
        if (v.getId() == R.id.cMedSet4) startActivity(new Intent(this, cMedQ4.class));
    }
}