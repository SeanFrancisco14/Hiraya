package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LHardSets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;

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


        hintone = (ImageButton) findViewById(R.id.lhard1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: UNFAMILIAR FILIPINO WORDS");
                builder.setMessage("You’ll get the hang of this mate! The more you know the more you gain the knowledge you know. It’ll be part of the hard Filipino words. " +
                        "You’ll ponder for a long time but time’s ticking! Go and take the quiz now!");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.lhard1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: DIFFERENT DIALECTS");
                builder.setMessage("Ala Eh! You’re now here with the different dialects. Ha, I guess the Filipinos from the Visayas and Ilocos will have the advantage in this set. Don’t worry it’ll be easy with when you get used to it, " +
                        "maybe use some eenie meanie miny moe, kidding. Do your best and remember them, they might be helpful you know.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.lhard1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: SINTAKSIS");
                builder.setMessage("Let’s now go to the hard Filipino grammar, enough of the basics. I knew you can do that already. I hope the words “Panaguri”, “Sambitlang”, “Hugnayan”, “Lansak” and " +
                        "a lot more are still in your memory. You might want to review in advance though, this will be a little tricky. ");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.lhard1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LHardSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PHILIPPINE FAMOUS LITERATURE");
                builder.setMessage("Remember “Florante and Laura”, or “Ibong Adarna”, they’re shouting present in this quiz. You may have role-played them or read them from your Filipino subject. " +
                        "There are more to those stories like what Rizal has made, “Noli Me Tangere” or “El Filibusterismo”. ");

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