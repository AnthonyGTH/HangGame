package com.dev01dev.hanggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(this, R.raw.song);
        if(!song.isPlaying()){
            song.start();
            song.setLooping(true);
        }

    }

    public void play(View view) {

        Intent intent = new Intent(this, GameActivity2.class);
        startActivity(intent);

    }

    protected void onUserLeaveHint(){
        song.pause();
    }

    protected void onResume() {
        super.onResume();
        song.start();
    }

    public void exit(View view){
        System.exit(0);
    }
}