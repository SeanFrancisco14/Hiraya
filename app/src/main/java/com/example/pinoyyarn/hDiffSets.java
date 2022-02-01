package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hDiffSets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hdiff_sets);

        Button set1 = findViewById(R.id.hDiffSet1);
        Button set2 = findViewById(R.id.hDiffSet2);
        Button set3 = findViewById(R.id.hDiffSet3);
        Button set4 = findViewById(R.id.hDiffSet4) ;

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hEasySet1) startActivity(new Intent(this, MenuActivity.class));
        if (v.getId() == R.id.hEasySet2) startActivity(new Intent(this, MenuActivity.class));
        if (v.getId() == R.id.hEasySet3) startActivity(new Intent(this, MenuActivity.class));
        if (v.getId() == R.id.hEasySet4) startActivity(new Intent(this, MenuActivity.class));
    }
}