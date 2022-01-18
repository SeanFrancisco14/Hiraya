package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;

public class HistoryStages extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_stages);

        ImageButton btn_history_easy = findViewById(R.id.btn_history_easy);
        ImageButton btn_history_medium = findViewById(R.id.btn_history_medium);
        ImageButton btn_history_difficult = findViewById(R.id.btn_history_difficult);

        btn_history_easy.setOnClickListener(this);
        btn_history_medium.setOnClickListener(this);
        btn_history_difficult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_history_easy) {
            startActivity(new Intent(this, histEasyQSet.class));
        }
        if (v.getId() == R.id.btn_history_medium) {
            startActivity(new Intent(this, histMedQSet.class));
        }
        if (v.getId() == R.id.btn_history_difficult) {
            startActivity(new Intent(this, histDiffQSet.class));
        }
    }
}