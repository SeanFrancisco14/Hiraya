package com.example.pinoyyarn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        },  1750);
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage(Html.fromHtml("<font color='#000000'>Are you sure you want to exit?</font>"));
        builder.setCancelable(true);
        builder.setPositiveButton(Html.fromHtml("<font color='#FFD700'>Yes</font>"), (dialog, which) -> finish());
        builder.setNegativeButton(Html.fromHtml("<font color='#FFD700'>No</font>"), (dialog, i) -> dialog.cancel());
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
