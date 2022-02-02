package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LanguageStages extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_stages);

        ImageButton cEasy = findViewById(R.id.btn_language_easy);
        ImageButton cMed = findViewById(R.id.btn_language_medium);
        ImageButton cDiff = findViewById(R.id.btn_language_difficult);

        cEasy.setOnClickListener(this);
        cMed.setOnClickListener(this);
        cDiff.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_language_easy) startActivity(new Intent(this, LEasySets.class));
        if (v.getId() == R.id.btn_language_medium) startActivity(new Intent(this, LMedSets.class));
        if (v.getId() == R.id.btn_language_difficult) startActivity(new Intent(this, LHardSets.class));
    }
}