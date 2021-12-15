package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        findViewById(R.id.btn_play).setOnClickListener(this);
    }

    public void onClick(View view) {
        startActivity(new Intent(this, CategoryActivity.class));

        switch (view.getId()) {
            case R.id.btn_play:
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }
}