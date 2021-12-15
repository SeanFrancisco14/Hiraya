package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        findViewById(R.id.btn_culture).setOnClickListener(this);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, CultureStages.class));

        if (view.getId() == R.id.btn_culture) {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }
}