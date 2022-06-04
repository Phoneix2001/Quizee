package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        VideoView videoview =findViewById(R.id.videoView3);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.stan);
        MediaController mediaController =new MediaController(this);
        Button playbutton = findViewById(R.id.button12);
        Button pausebutton =findViewById(R.id.button13);
        mediaController.setAnchorView(videoview);
        videoview.setMediaController(mediaController);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoview.start();
            }
        });
        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoview.pause();
            }
        });

    }
}