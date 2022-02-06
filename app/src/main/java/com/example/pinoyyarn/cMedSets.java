package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cMedSets extends AppCompatActivity implements View.OnClickListener {
    public Button hintone;
    public Button hinttwo;
    public Button hintthree;
    public Button hintfour;


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

        hintone = (Button) findViewById(R.id.cmed1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT1!");
                builder.setMessage("TOPIC INSERT HERE");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (Button) findViewById(R.id.cmed1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT2!");
                builder.setMessage("TOPIC INSERT HERE");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (Button) findViewById(R.id.cmed1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT3!");
                builder.setMessage("TOPIC INSERT HERE");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (Button) findViewById(R.id.cmed1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT4!");
                builder.setMessage("TOPIC INSERT HERE");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cMedSet1) startActivity(new Intent(this, cMedQ1.class));
        if (v.getId() == R.id.cMedSet2) startActivity(new Intent(this, cMedQ2.class));
        if (v.getId() == R.id.cMedSet3) startActivity(new Intent(this, cMedQ3.class));
        if (v.getId() == R.id.cMedSet4) startActivity(new Intent(this, cMedQ4.class));
    }
}