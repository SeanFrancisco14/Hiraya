package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btn_play = (ImageButton) findViewById(R.id.btn_play);
        ImageButton btn_achievements = (ImageButton) findViewById(R.id.btn_achievements);
        ImageButton btn_settings = (ImageButton) findViewById(R.id.btn_settings);
        ImageButton btn_exit = (ImageButton) findViewById(R.id.btn_exit);

        btn_play.setOnClickListener(this);
        btn_achievements.setOnClickListener(this);
        btn_settings.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_play:
                startActivity(new Intent(this, CategoryActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
        switch(v.getId()) {
            case R.id.btn_achievements:
                startActivity(new Intent(this, AchievementsActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);;
                break;
        }
        switch(v.getId()) {
            case R.id.btn_settings:
                startActivity(new Intent(this, SettingsActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
        switch(v.getId()) {
            case R.id.btn_exit:
                final AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity.this);
                builder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
                builder.setCancelable(true);
                builder.setPositiveButton(Html.fromHtml("<font color='#FFD700'>Yes</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                builder.setNegativeButton(Html.fromHtml("<font color='#FFD700'>No</font>"), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
        }
    }
}