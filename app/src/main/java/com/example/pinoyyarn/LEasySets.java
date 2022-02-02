package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LEasySets extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leasy_sets);

        Button set1 = findViewById(R.id.LEasySet1);
        Button set2 = findViewById(R.id.LEasySet2);
        Button set3 = findViewById(R.id.LEasySet3);
        Button set4 = findViewById(R.id.LEasySet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.LEasySet1) startActivity(new Intent(this, LEasyQ1.class));
        if (v.getId() == R.id.LEasySet2) startActivity(new Intent(this, LEasyQ2.class));
        if (v.getId() == R.id.LEasySet3) startActivity(new Intent(this, LEasyQ3.class));
        if (v.getId() == R.id.LEasySet4) startActivity(new Intent(this, LEasyQ4.class));
    }
}