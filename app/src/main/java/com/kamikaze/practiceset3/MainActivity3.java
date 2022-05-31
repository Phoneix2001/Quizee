package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
public static final String thisisextra ="com.kamikaze.practiceset3.thisextraname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }




    public void arpit(View view ){
        EditText editText =findViewById(R.id.nomo);
        Intent intent = new Intent(this,MainActivity5.class);
        intent.putExtra(thisisextra,editText.getText().toString());
        startActivity(intent);
    }
}