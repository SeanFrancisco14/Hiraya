package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class hScoreActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView score;
    private ImageButton backtocat;
    private ImageButton backtomenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hscore);

        score = findViewById(R.id.textView_hScore);
        backtocat = findViewById(R.id.backtocat);
        backtomenu = findViewById(R.id.backtomenu);

        String score_str = getIntent().getStringExtra("SCORE");
        score.setText(score_str);

        backtocat.setOnClickListener(this);
        backtomenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.backtocat) {
            startActivity(new Intent(this, CategoryActivity.class));
            hScoreActivity.this.finish();
         }

        if (v.getId() == R.id.backtomenu) {
            startActivity(new Intent(this, MenuActivity.class));
            hScoreActivity.this.finish();
        }
    }
}