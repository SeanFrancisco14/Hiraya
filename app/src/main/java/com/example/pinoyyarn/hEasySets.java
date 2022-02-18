package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hEasySets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heasy_sets);

        Button set1 = findViewById(R.id.hEasySet1);
        Button set2 = findViewById(R.id.hEasySet2);
        Button set3 = findViewById(R.id.hEasySet3);
        Button set4 = findViewById(R.id.hEasySet4) ;

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);


        hintone = (ImageButton) findViewById(R.id.Heasy1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: JOSE RIZAL");
                builder.setMessage("To prove “Ang kabataan ang pag-asa ng bayan”, better make a high score in this set as you’ll face our national hero, Jose Rizal. It would be really a bullet in the back if you’ll have a low score in this. Just before taking it do remember " +
                        "“Ang ‘di magmahal sa sariling wika ay mahigit pa sa hayop at malansang isda.”");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.Heasy1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: ANDRES BONIFACIO");
                builder.setMessage("Just like how we’re still fighting for what we are fighting for, remember we have a hero who’s the leader of the Philippine Revolution, Andres Bonifacio. Fought the Spanish Regiment and created the path for the Filipinos to fight for our freedom. " +
                        "Now it’s your chance, do not let Andres Bonifacio down with your score.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.Heasy1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: GENERAL PHILIPPINE HISTORY\t");
                builder.setMessage("Maybe you’re a know it all, this set will try to prove you have knowledge of Philippine history. From Filipino heroines to dates you should’ve remembered until now, and more. If it’s hard for you " +
                        "then you should go back to your history class and if this is an easy-peasy, then look forward to more of this in the future.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.Heasy1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: MANUEL L QUEZON");
                builder.setMessage("Presenting our second president of the Philippines, Manuel L. Quezon. I know you’re familiar with him since you have seen him so many times in your life, from your teachers to your 20-peso bill. " +
                        "I hope and he hopes you remember every detail with him, as he is looking at you as his proud fellowmen.");

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
        if (v.getId() == R.id.hEasySet1) startActivity(new Intent(this, hEasyQ1.class));
        if (v.getId() == R.id.hEasySet2) startActivity(new Intent(this, hEasyQ2.class));
        if (v.getId() == R.id.hEasySet3) startActivity(new Intent(this, hEasyQ3.class));
        if (v.getId() == R.id.hEasySet4) startActivity(new Intent(this, hEasyQ4.class));
    }
}