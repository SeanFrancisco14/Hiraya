package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btn_play = findViewById(R.id.btn_play);
        ImageButton btn_achievements = findViewById(R.id.btn_achievements);
        ImageButton btn_settings = findViewById(R.id.btn_settings);
        ImageButton btn_exit = findViewById(R.id.btn_exit);

        btn_play.setOnClickListener(this);
        btn_achievements.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_play) {
            startActivity(new Intent(this, CategoryActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_achievements) {
            startActivity(new Intent(this, AchievementsActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_exit) {
            final AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
            builder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
            builder.setCancelable(true);
            builder.setPositiveButton(Html.fromHtml("<font color='#FFD700'>Yes</font>"), (dialog, which) -> finish());
            builder.setNegativeButton(Html.fromHtml("<font color='#FFD700'>No</font>"), (dialog, i) -> dialog.cancel());
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    }
}