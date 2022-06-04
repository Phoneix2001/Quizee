package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class monsterwebpage extends AppCompatActivity {
private ImageView imageView;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monsterwebpage);
        textView = findViewById(R.id.textView14);
        imageView=findViewById(R.id.imageView6);
        Intent intent = getIntent();
        imageView.setImageResource(getIntent().getIntExtra("imageview",0));
        textView.setText(getIntent().getStringExtra("ahdfajsfjla"));

    }
}