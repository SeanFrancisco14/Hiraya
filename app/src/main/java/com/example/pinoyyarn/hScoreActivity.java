package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hScoreActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView score;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hscore);

        score = findViewById(R.id.textView_hScore);
        confirm = findViewById(R.id.hScoreButton);

        String score_str = getIntent().getStringExtra("SCORE");
        score.setText(score_str);

        confirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.hScoreButton) {
            startActivity(new Intent(this, CategoryActivity.class));
            hScoreActivity.this.finish();
         }
    }
}