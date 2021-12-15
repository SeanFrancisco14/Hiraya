package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ImageButton btn_culture = (ImageButton) findViewById(R.id.btn_culture);
        ImageButton btn_history = (ImageButton) findViewById(R.id.btn_history);
        ImageButton btn_language = (ImageButton) findViewById(R.id.btn_language);

        btn_culture.setOnClickListener(this);
        btn_history.setOnClickListener(this);
        btn_language.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btn_culture:
                startActivity(new Intent(this, CultureStages.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
        switch(v.getId()) {
            case R.id.btn_history:
                startActivity(new Intent(this, HistoryStages.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);;
                break;
        }
        switch(v.getId()) {
            case R.id.btn_language:
                startActivity(new Intent(this, LanguageStages.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                break;
        }
    }
}