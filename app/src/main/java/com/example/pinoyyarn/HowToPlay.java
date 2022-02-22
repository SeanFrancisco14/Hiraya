package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;

public class HowToPlay extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);

        ImageButton btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener(this);

    }
    @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_next) {
                startActivity(new Intent(this, HowToPlay2.class));
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
            }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MenuActivity.class));
        finish();
    }
}