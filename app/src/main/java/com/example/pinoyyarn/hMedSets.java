package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hMedSets extends AppCompatActivity implements View.OnClickListener {
    private Button hintone;
    private Button hinttwo;
    private Button hintthree;
    private Button hintfour;

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


        hintone = (Button) findViewById(R.id.Hmed1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT1!");
                builder.setMessage("TOPIC INSERT HERE wtf");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (Button) findViewById(R.id.Hmed1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

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

        hintthree = (Button) findViewById(R.id.Hmed1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

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

        hintfour = (Button) findViewById(R.id.Hmed1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

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
        if (v.getId() == R.id.hMedSet1) startActivity(new Intent(this, hMedQ1.class));
        if (v.getId() == R.id.hMedSet2) startActivity(new Intent(this, hMedQ2.class));
        if (v.getId() == R.id.hMedSet3) startActivity(new Intent(this, hMedQ3.class));
        if (v.getId() == R.id.hMedSet4) startActivity(new Intent(this, hMedQ4.class));
    }
}