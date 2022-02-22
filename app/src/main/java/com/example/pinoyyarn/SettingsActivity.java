package com.example.pinoyyarn;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{

    private AudioManager audioManager;
    private ImageButton volumeControlUp, volumeControlDown, btnMusic, btnCredits, btnBack;
    private SeekBar seekBar;
    boolean state = true;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        volumeControlUp = findViewById(R.id.volumeControlUp);
        volumeControlDown = findViewById(R.id.volumeControlDown);
        seekBar = findViewById(R.id.seekBarVol);
        btnCredits = findViewById(R.id.btnCredits);
        btnMusic = findViewById(R.id.btnMusic);
        btnBack = findViewById(R.id.btn_back);

        volumeControlUp.setOnClickListener(this);
        volumeControlDown.setOnClickListener(this);
        btnCredits.setOnClickListener(this);
        btnMusic.setOnClickListener(this);
        btnBack.setOnClickListener(this);

        seekBar.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onClick(View v) {
        if (v.getId() ==  R.id.volumeControlUp) {
           audioManager.adjustVolume(AudioManager.ADJUST_RAISE, AudioManager.FLAG_PLAY_SOUND);
           seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
            Toast.makeText(SettingsActivity.this, "Volume up", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.volumeControlDown) {
            audioManager.adjustVolume(AudioManager.ADJUST_LOWER, AudioManager.FLAG_PLAY_SOUND);
            seekBar.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));
            Toast.makeText(SettingsActivity.this, "Volume down", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.btnCredits) {
            startActivity(new Intent(this, CreditsActivity.class));
        }
        if (v.getId() == R.id.btnMusic && state == true) {
            startService(new Intent(this, audioClass.class));
            state = false;
        }
        else if (v.getId() == R.id.btnMusic && state != true) {
            stopService(new Intent(this, audioClass.class));
            state = true;
        }
        if (v.getId() == R.id.btn_back) {
            startActivity(new Intent(this, MenuActivity.class));
        }
    }


}