package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class cScoreActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView score;
    private ImageButton confirm;
    private ImageButton menuback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cscore);

        score = findViewById(R.id.textView_cScore);
        confirm = findViewById(R.id.chooseanothercat);
        menuback = findViewById(R.id.backtomenu);

        String score_str = getIntent().getStringExtra("SCORE");
        score.setText(score_str);

        confirm.setOnClickListener(this);
        menuback.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.chooseanothercat) {
            startActivity(new Intent(this, CategoryActivity.class));
            cScoreActivity.this.finish();
        }
        if (v.getId() == R.id.backtomenu) {
            startActivity(new Intent(this, MenuActivity.class));
            cScoreActivity.this.finish();
        }
    }
}