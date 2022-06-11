package com.kamikaze.practiceset3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity7 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    private FrameLayout frameLayout;
   private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        VideoView videoview =findViewById(R.id.videoView3);
        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.stan);
        MediaController mediaController =new MediaController(this);
        Button playbutton = findViewById(R.id.button12);
        Button pausebutton =findViewById(R.id.button13);
        frameLayout = findViewById(R.id.framelayout99);
        bottomNavigationView= findViewById(R.id.bottomnavigationbar99);
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

        // code for bottom navigation bar

bottomNavigationView.setOnNavigationItemSelectedListener(this);

bottomNavigationView.setSelectedItemId(R.id.videoView3);



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        nav_Naruto firstfragment = new nav_Naruto();
        nav_sakura secondfragment = new nav_sakura();
        nav_Sasuke nav_sasuke =new nav_Sasuke();
        switch (item.getItemId()){
            case R.id.Naruto:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout99,secondfragment).commit();
                return true;

            case R.id.Sakura:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout99,firstfragment).commit();
                return true;
            case R.id.Sasuke:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout99,nav_sasuke).commit();
                return true;
        }





        return true;
    }
}