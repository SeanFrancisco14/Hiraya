package com.example.pinoyyarn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener{

    private AudioManager audioManager;
    private Button btnCredits, btnOn, btnOff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        btnCredits= findViewById(R.id.btnCredits);
        btnOn = findViewById(R.id.btnSoundOn);
        btnOff = findViewById(R.id.btnSoundOff);


        btnOn.setOnClickListener(this);
        btnOff.setOnClickListener(this);
        btnCredits.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
        if (v.getId() == R.id.btnSoundOn) {
            audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
            audioManager.setStreamVolume(AudioManager.STREAM_RING, maxVolume, AudioManager.FLAG_SHOW_UI + AudioManager.FLAG_PLAY_SOUND);
        }
        if (v.getId() == R.id.btnSoundOff) {
            audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        }

        int mod = audioManager.getRingerMode();
        if (mod == audioManager.RINGER_MODE_VIBRATE){
            Toast.makeText(SettingsActivity.this, "sounds are off", Toast.LENGTH_SHORT).show();
        }
        else if (mod ==audioManager.RINGER_MODE_NORMAL){
            Toast.makeText(SettingsActivity.this, "sounds are on", Toast.LENGTH_SHORT).show();
        }
    }
}