package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LHardSets extends AppCompatActivity implements View.OnClickListener {
    private Button hintone;
    private Button hinttwo;
    private Button hintthree;
    private Button hintfour;

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


        hintone = (Button) findViewById(R.id.lhard1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

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

        hinttwo = (Button) findViewById(R.id.lhard1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

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

        hintthree = (Button) findViewById(R.id.lhard1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

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

        hintfour = (Button) findViewById(R.id.lhard1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

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
        if (v.getId() == R.id.LHardSet1) startActivity(new Intent(this, LHardQ1.class));
        if (v.getId() == R.id.LHardSet2) startActivity(new Intent(this, LHardQ2.class));
        if (v.getId() == R.id.LHardSet3) startActivity(new Intent(this, LHardQ3.class));
        if (v.getId() == R.id.LHardSet4) startActivity(new Intent(this, LHardQ4.class));
    }
}