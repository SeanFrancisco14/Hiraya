package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hDiffSets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;

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


        hintone = (ImageButton) findViewById(R.id.Hhard1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hDiffSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: GENERAL HISTORY");
                builder.setMessage("I told you, there’s a harder version of the general history. Let’s see if you’ll make it through this and if not there’s always a next time. Make sure you listened to your history teacher as this will make you " +
                        "sweat, 25 hard questions but again the important thing is you learn.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.Hhard1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hDiffSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: AMERICAN COLONIZATION");
                builder.setMessage("There will be a lot of names and acts in this chapter as the American Colonization enters our area. You are probably familiar with the name " +
                        "“William Howard Taft” or “George Dewey” then you already have a point! Good luck soldier!");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.Hhard1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hDiffSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: SPANISH COLONIZATION");
                builder.setMessage("Hola! Spanish colonization hits our quiz. Lo siento in advance if this will be quite hard for you. At the end of the day, it will be gracias for trying. " +
                        "But Por favor, the goal of this quiz is to let you learn and gain knowledge. Si?");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.Hhard1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hDiffSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PHILIPPINE HISTORICAL CONTROVERSIES");
                builder.setMessage("Calling all the marites here, kidding aside. In this set, you’ll be able to face the controversies from before. Not familiar with them? Now’s your chance to " +
                        "familiarize yourself with them and start a topic with your friends with “Did you know that…”.");

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
        if (v.getId() == R.id.hDiffSet1) startActivity(new Intent(this, hHardQ1.class));
        if (v.getId() == R.id.hDiffSet2) startActivity(new Intent(this, hHardQ2.class));
        if (v.getId() == R.id.hDiffSet3) startActivity(new Intent(this, hHardQ3.class));
        if (v.getId() == R.id.hDiffSet4) startActivity(new Intent(this, hHardQ4.class));
    }
}