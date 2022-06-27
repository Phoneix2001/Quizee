package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class livedatacounter extends AppCompatActivity {
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedatacounter);
        textView = findViewById(R.id.livedatacounter);
        Viewmodelholder viewmodelholder = new ViewModelProvider(this).get(Viewmodelholder.class);
        //using live data to get counter
        LiveData<Integer> count = viewmodelholder.getIniatialcounter();
        count.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText("You Cicked me "+integer+" times");
            }
        });
        button = findViewById(R.id.button11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewmodelholder.getCount();

            }
        });

    }
}