package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cHardSets extends AppCompatActivity implements View.OnClickListener {
    public ImageButton hintone;
    public ImageButton hinttwo;
    public ImageButton hintthree;
    public ImageButton hintfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chard_sets);

        Button set1 = findViewById(R.id.cHardSet1);
        Button set2 = findViewById(R.id.cHardSet2);
        Button set3 = findViewById(R.id.cHardSet3);
        Button set4 = findViewById(R.id.cHardSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);


        hintone = (ImageButton) findViewById(R.id.chard1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: MINOR AND MAJOR GROUPS");
                builder.setMessage("Curiosity hits you when you wonder about the different ethnic groups in the Philippines. What do they wear? What are they called? What do they worship? " +
                        "You’ll probably work on your mind here. Welcome to the hard mode of culture and tradition!");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.chard1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Prominent Filipino Artists and Inventors");
                builder.setMessage("You’ll mix up the names, their Obra Maestra, their inventions, as there are a lot of talented Filipino artists and inventors. Does Jose Maceda ring a bell? Probably Fernando Amorsolo is familiar. " +
                        "Better remember their names this time as you should pay respect to their contributions.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.chard1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: TRADITIONAL CLOTHES/ WEAVING OF INDIGENOUS GROUPS");
                builder.setMessage("Ever since we were little children, our teachers opened the idea of a lot of indigenous groups and their clothes and kind of weavings. Of course, you already hear the Bontoc’s motifs, Ifugao’s Ikat, T’boli’s T’nalak, and many more. " +
                        "Discover more in this set, and I hope they’ll be permanently woven into your mind. ");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.chard1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: TRADITIONAL MUSICAL INSTRUMENTS");
                builder.setMessage("Fill your ears with different musical instruments that are made from different places here in the Philippines. For sure you haven’t tried them all, and if you already had, then you’re one lucky human being. " +
                        "You have to fill your music with their sound but for now let’s fill your head with their information.");

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
        if (v.getId() == R.id.cHardSet1) startActivity(new Intent(this, cHardQ1.class));
        if (v.getId() == R.id.cHardSet2) startActivity(new Intent(this, cHardQ2.class));
        if (v.getId() == R.id.cHardSet3) startActivity(new Intent(this, cHardQ3.class));
        if (v.getId() == R.id.cHardSet4) startActivity(new Intent(this, cHardQ4.class));
    }
}