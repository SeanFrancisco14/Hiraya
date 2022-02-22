package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CreditsActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btn_exit;
    private TextView credits;
    private Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        btn_exit = findViewById(R.id.btn_creditsExit);
        credits = findViewById(R.id.textViewCredits);
        animation = AnimationUtils.loadAnimation(this, R.anim.credits_anim);
        btn_exit.setOnClickListener(this);

        credits.setText("CREDITS \n" + "ADRIAN YABES,  \n" + "Front-End Programmer \n" + "Game Designer \n" + "DANICA PAMOLERAS \n"+ "Back-End Programmer \n"+ "Art DIrector\n"+ "SEAN FRANCISCO \n"+ "Back-End Programmer \n"+ "Music Director \n"+ "JAY DE VERA \n"+ "Data Analysts \n"+ "Art Director \n");
        credits.startAnimation(animation);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_creditsExit){
            startActivity(new Intent(this, MenuActivity.class));
        }
    }
}