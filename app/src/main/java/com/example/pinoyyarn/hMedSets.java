package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class hMedSets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;

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


        hintone = (ImageButton) findViewById(R.id.Hmed1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PHILIPPINE HISTORICAL EVENTS");
                builder.setMessage("You may have forgotten your best friend’s birthday, but do not forget the Philippine Historical Events! When did assassinations happen, the martial law, the agreements, " +
                        "and law? Widen your knowledge and improve your memory with this set. May the force be with you!");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.Hmed1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PHILIPPINE HISTORICAL PLACES");
                builder.setMessage("Do not remove your seatbelts, after the festivals we can go wonder to the historical places here in the Philippines. Maybe you’ve been there before, or maybe you saw them already but you didn’t know it was one of " +
                        "the historical places here. It’s time to become Dora and Boots as we travel to the past.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.Hmed1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PHILIPPINE LEADERS");
                builder.setMessage("Being born in this generation is not an excuse for not knowing our leaders from the first president or vice president to the present leaders. For sure Manuel Roxas ring a bell, as well as Corazon " +
                        "Aquino but have you heard of Fernando Lopez or Salvador Laurel. Now’s the time to know them!");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.Hmed1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(hMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: GENERAL HISTORY");
                builder.setMessage("I see you’ve reached this level of General History. Are you confident enough to pass this? If not take it, easy dude, there’s an easier one here and of course, there will be a harder exam than this. " +
                        "Pass or not remember that the important part is to become familiar and learn! No pressure, keep going kiddo!");

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