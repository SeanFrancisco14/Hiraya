package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LEasySets extends AppCompatActivity implements View.OnClickListener {
    private ImageButton hintone;
    private ImageButton hinttwo;
    private ImageButton hintthree;
    private ImageButton hintfour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leasy_sets);

        Button set1 = findViewById(R.id.LEasySet1);
        Button set2 = findViewById(R.id.LEasySet2);
        Button set3 = findViewById(R.id.LEasySet3);
        Button set4 = findViewById(R.id.LEasySet4);

        set1.setOnClickListener(this);
        set2.setOnClickListener(this);
        set3.setOnClickListener(this);
        set4.setOnClickListener(this);

        hintone = (ImageButton) findViewById(R.id.leasy1_hint);
        hintone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: SALITANG INUULIT");
                builder.setMessage("Welcome to language mode student. You’re probably wondering what’s hard with words that are repeated. Click on the button to find out, " +
                        "just don’t get dizzy with all the spellings, okay? We don’t provide medical care here.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hinttwo = (ImageButton) findViewById(R.id.leasy1_hint2);
        hinttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: BASIC SPELLING");
                builder.setMessage("If you are the queen or king of the spelling bee, then this will fit you right in! test your knowledge with Filipino words. Don’t say it’s easy though, " +
                        "this is just the start of this quiz. You’ll clench your jaw once the time ticks later.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintthree = (ImageButton) findViewById(R.id.leasy1_hint3);
        hintthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: BASIC GRAMMAR");
                builder.setMessage("Do you know the difference between “ng” or “nang” and “dito” or “rito”? Then this set will be piece of cake for you. Know more about basic grammar, " +
                        "don’t get frustrated if you got it wrong, there’s always room for improvement.");

                builder.setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                builder.show();
            }
        });

        hintfour = (ImageButton) findViewById(R.id.leasy1_hint4);
        hintfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LEasySets.this);

                builder.setCancelable(true);
                builder.setTitle("HINT: PAYAK, MAYLAPI, AT TAMBALAN");
                builder.setMessage("Still, remember your elementary Filipino subject? This will really test if you remember that much knowledge in this area. Take note, " +
                        "Payak is the most basic among the three and you’ll probably know the rest from the terms maylapi and tambalan.");

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
        if (v.getId() == R.id.LEasySet1) startActivity(new Intent(this, LEasyQ1.class));
        if (v.getId() == R.id.LEasySet2) startActivity(new Intent(this, LEasyQ2.class));
        if (v.getId() == R.id.LEasySet3) startActivity(new Intent(this, LEasyQ3.class));
        if (v.getId() == R.id.LEasySet4) startActivity(new Intent(this, LEasyQ4.class));
    }
}