package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.media.AudioManager;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btn_play = findViewById(R.id.btn_play);
        ImageButton btn_settings = findViewById(R.id.btn_settings);
        ImageButton btn_back = findViewById(R.id.btn_back);
        ImageButton btn_achievements = findViewById(R.id.btn_achievements);

        btn_play.setOnClickListener(this);
        btn_achievements.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
        btn_back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_play) {
            startActivity(new Intent(this, CategoryActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_achievements) {
            startActivity(new Intent(this, HowToPlay.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if (v.getId() == R.id.btn_back) {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

}