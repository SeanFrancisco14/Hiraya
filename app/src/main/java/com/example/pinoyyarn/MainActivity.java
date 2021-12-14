package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton start_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start_sound = (ImageButton)findViewById(R.id.btn_start);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.clicksound);
        start_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();

        ImageButton btn_ToMenuScreen = (ImageButton) findViewById(R.id.btn_start);
        btn_ToMenuScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
            }
        });
    }
}