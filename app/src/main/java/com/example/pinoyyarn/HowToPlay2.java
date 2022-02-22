package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HowToPlay2 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play2);

        ImageButton btn_backtomenu = findViewById(R.id.btn_backtomenu);

        btn_backtomenu.setOnClickListener(this);


    }

        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.btn_backtomenu) {
                startActivity(new Intent(this, MenuActivity.class));
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