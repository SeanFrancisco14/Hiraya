package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CultureStages extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_stages);

        ImageButton cEasy = findViewById(R.id.btn_culture_easy);
        ImageButton cMed = findViewById(R.id.btn_culture_medium);
        ImageButton cDiff = findViewById(R.id.btn_culture_difficult);

        cEasy.setOnClickListener(this);
        cMed.setOnClickListener(this);
        cDiff.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_culture_easy) startActivity(new Intent(this, cEasySets.class));
        if (v.getId() == R.id.btn_culture_medium) startActivity(new Intent(this, cMedSets.class));
        if (v.getId() == R.id.btn_culture_difficult) startActivity(new Intent(this, cHardSets.class));
    }
}