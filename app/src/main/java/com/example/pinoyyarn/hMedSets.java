package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hMedSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hmed_sets);

        Button set1 = findViewById(R.id.hMedSet1);
        Button set2 = findViewById(R.id.hMedSet2);
        Button set3 = findViewById(R.id.hMedSet3);
        Button set4 = findViewById(R.id.hMedSet4) ;

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hMedSet1) startActivity(new Intent(this, hMedQ1.class));
        if (v.getId() == R.id.hMedSet2) startActivity(new Intent(this, hMedQ2.class));
        if (v.getId() == R.id.hMedSet3) startActivity(new Intent(this, hMedQ3.class));
        if (v.getId() == R.id.hMedSet4) startActivity(new Intent(this, hMedQ4.class));
    }
}