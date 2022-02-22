package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.widget.ImageButton;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btn_start, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = findViewById(R.id.btn_start);
        btn_exit = findViewById(R.id.btn_exitMain);

        btn_start.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
        builder.setCancelable(true);
        builder.setPositiveButton(Html.fromHtml("<font color='#FFD700'>Yes</font>"), (dialog, which) -> finishAndRemoveTask());
        builder.setNegativeButton(Html.fromHtml("<font color='#FFD700'>No</font>"), (dialog, i) -> dialog.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        stopService(new Intent(this, audioClass.class));
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_start){
            startActivity(new Intent(this, MenuActivity.class));
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
        if(v.getId() == R.id.btn_exitMain){
            final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
            builder.setCancelable(true);
            builder.setPositiveButton(Html.fromHtml("<font color='#FFD700'>Yes</font>"), (dialog, which) -> finishAndRemoveTask());
            builder.setNegativeButton(Html.fromHtml("<font color='#FFD700'>No</font>"), (dialog, i) -> dialog.cancel());
            AlertDialog alertDialog = builder.create();
            alertDialog.show();

            stopService(new Intent(this, audioClass.class));
        }
    }
}
