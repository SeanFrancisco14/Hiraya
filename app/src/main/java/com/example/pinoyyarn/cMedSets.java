package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class cMedSets extends AppCompatActivity implements View.OnClickListener {
    public ImageButton hintone;
    public ImageButton hinttwo;
    public ImageButton hintthree;
    public ImageButton hintfour;


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

        hintone = (ImageButton) findViewById(R.id.cmed1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Music");
                builder.setMessage("Did someone go to your window and make “Harana” or “Kundiman”? Or did you already hear the song “Pangako Sa’yo” and remember Kathniel?  If you haven’t, what’s not clicking? Before venturing to another genre of song " +
                        "why not try to remember the classic and our own Philippine music.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.cmed1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Dance");
                builder.setMessage("I bet nostalgia hits you when you hear the “click clack” of the coconut husks as the maglalatik dancer’s dances or when the bamboo hits the ground during tinikling. I also bet that you haven’t perfected any of the Philippine Dances. Hold on to your barong or saya, as " +
                        "you go take this quiz to improve your memory on Philippine dances.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.cmed1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Philippine Art");
                builder.setMessage("Into Museum dates maybe? Or do you just love how emotions, perspective is poured into a beautiful masterpiece? Fernando Amorsolo, Juan Luna, Benedicto Cabrera, " +
                        "and many more will bring you back to Philippine art as this set will show different artists who may be familiar or whose artwork you’re fond with. ");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.cmed1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(cMedSets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: Cities in the Philippines");
                builder.setMessage("Smile in Bacolod, create friendship in Cagayan de Oro or go buy different fish in Navotas. Do you know what cities are known for? If not, hold on to your sit belt, let’s take a ride through the " +
                        "questions which will introduce you to different cities and provinces. ");

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