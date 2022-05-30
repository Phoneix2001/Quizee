package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button bu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent =getIntent();
        String name =intent.getStringExtra(MainActivity.Extra_Name);
        textView=findViewById(R.id.textView);
        textView.setText("your address is :" +name);

    }
    public void solo (View view ){Intent intent =getIntent();

        String name =intent.getStringExtra(MainActivity.Extra_Name);
        Toast.makeText(this,name , Toast.LENGTH_SHORT).show();

        String[] addresses={"perm576447@gmail.com"};
            intent = new Intent(Intent.ACTION_SEND);
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_EMAIL, addresses);
            intent.putExtra(Intent.EXTRA_SUBJECT, name);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

    }}
