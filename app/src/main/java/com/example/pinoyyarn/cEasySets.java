package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cEasySets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceasy_sets);


        Button set1 = findViewById(R.id.cEasySet1);
        Button set2 = findViewById(R.id.cEasySet2);
        Button set3 = findViewById(R.id.cEasySet3);
        Button set4 = findViewById(R.id.cEasySet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);

        hintone = (ImageButton) findViewById(R.id.ceasy1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine CUISINE");
                builder.setMessage(" Adobo, Sinigang, Tinola, Lechon, name them all! Set 1 is all about Filipino food, what do you see usually in fiestas or at your home. " +
                        "Unfortunately, you can’t use your taste buds for this but I hope your brain remembers.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.ceasy1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Festivals");
                builder.setMessage("Come on and let’s enjoy the different parades, dances, and chants as we go to the Philippine Festivals. Have you been in Ati-atihan? Or in Panagbenga as it is usually the eye-catcher in Baguio? Have you tasted the luscious mango in Dinamulag? If you haven’t, then take this quiz to " +
                        "figure out which festival do you want the most and what you remember the most.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.ceasy1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Mythological Creatures");
                builder.setMessage("BOO! Get ready, prepare your garlic or cross in your hand as you face the Philippine’s Mythological Creatures. Are they on your side or are they your enemies? Do you think you won’t see " +
                        "a Kapre in the back of your house or are there lingering Multo at your side? ");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.ceasy1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Superstition");
                builder.setMessage("I hope you go somewhere else after you go to a wake or the soul will be with you. Listen up to the old Philippine Superstition as you might not know them and get unlucky for the rest of your life, " +
                        "unless you do not believe in them. Better be safe than never, right?");

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
        if (v.getId() == R.id.cEasySet1) startActivity(new Intent(this, cEasyQ1.class));
        if (v.getId() == R.id.cEasySet2) startActivity(new Intent(this, cEasyQ2.class));
        if (v.getId() == R.id.cEasySet3) startActivity(new Intent(this, cEasyQ3.class));
        if (v.getId() == R.id.cEasySet4) startActivity(new Intent(this, cEasyQ4.class));
    }
}


