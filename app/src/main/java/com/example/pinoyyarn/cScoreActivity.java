package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cScoreActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView score;
    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cscore);

        score = findViewById(R.id.textView_cScore);
        confirm = findViewById(R.id.cScoreButton);

        String score_str = getIntent().getStringExtra("SCORE");
        score.setText(score_str);

        confirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.cScoreButton) {
            startActivity(new Intent(this, CategoryActivity.class));
            cScoreActivity.this.finish();
        }
    }
}