package com.kamikaze.practiceset3;


import static com.kamikaze.practiceset3.MainActivity3.thisisextra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;


public class MainActivity5 extends AppCompatActivity  {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView textview =findViewById(R.id.textView10);
        Intent intent =getIntent();
        String message = intent.getStringExtra(thisisextra);
        textview.setText("Congo ! your are my homie now : "+message);


}
//protected void for6mainactivity(View view){
//        Intent intent = new Intent(this,ScrollingActivity1.class);
//        startActivity(intent);
//}

        public void openWebPage(View view ) {
            String url ="https://en.wikipedia.org/wiki/Monster";
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
           startActivity(intent);
}}