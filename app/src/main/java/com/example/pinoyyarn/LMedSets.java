package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LMedSets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lmed_sets);

        Button set1 = findViewById(R.id.LMedSet1);
        Button set2 = findViewById(R.id.LMedSet2);
        Button set3 = findViewById(R.id.LMedSet3);
        Button set4 = findViewById(R.id.LMedSet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);


        hintone = (ImageButton) findViewById(R.id.lmed1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: TONGUE TWISTERS");
                builder.setMessage("Even Filipinos get tongue-tied with these riddles. It’s more fun when you try to speak and let your friends join with this. The more you try the more you succeed," +
                        " I guess or maybe the more it becomes complicated with all the confusion.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.lmed1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: IDIOMS");
                builder.setMessage("If someone said “Matigas ang leeg”, and you thought you have a stiff neck then think again. But don’t think a lot, it will result in a lack of time. For sure you know bits of this, " +
                        "you don’t notice you use this on daily basis. I hope your mind is not tired from all of this.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.lmed1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: OLD FILIPINO WORDS TRANSLATION");
                builder.setMessage("This can be frustrating, but it’ll be amazing to know a lot of Filipino words. It’ll be nearly impossible to finish this without any mistake, honestly, even " +
                        "the creators were shocked. But it’s nice to share some knowledge, go on and try it, youngster.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.lmed1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: ANTONYMS");
                builder.setMessage("Why not try some antonyms this time? If you know the meaning, " +
                        "you might know the opposite of it. This is just a little Who knows opposite might attract a high score? ");

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
        if (v.getId() == R.id.LMedSet1) startActivity(new Intent(this, LMedQ1.class));
        if (v.getId() == R.id.LMedSet2) startActivity(new Intent(this, LMedQ2.class));
        if (v.getId() == R.id.LMedSet3) startActivity(new Intent(this, LMedQ3.class));
        if (v.getId() == R.id.LMedSet4) startActivity(new Intent(this, LMedQ4.class));
    }
}