package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HistoryStages extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_stages);

        ImageButton hEasy = findViewById(R.id.btn_history_easy);
        ImageButton hMed = findViewById(R.id.btn_history_medium);
        ImageButton hDiff = findViewById(R.id.btn_history_difficult);

        hEasy.setOnClickListener(this);
        hMed.setOnClickListener(this);
        hDiff.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_history_easy) startActivity(new Intent(this, hEasySets.class));
        if (v.getId() == R.id.btn_history_medium) startActivity(new Intent(this, hMedSets.class));
        if (v.getId() == R.id.btn_history_difficult) startActivity(new Intent(this, hDiffSets.class));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}