package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        ImageButton btn_ToCATLevel = (ImageButton) findViewById(R.id.btn_culture);
        btn_ToCATLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(CategoryActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

    ImageButton btn_ToLanguageLevel = (ImageButton) findViewById(R.id.btn_language);
        btn_ToLanguageLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(CategoryActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btn_ToHistoryLevel = (ImageButton) findViewById(R.id.btn_history);
        btn_ToHistoryLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(CategoryActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });
    }
}