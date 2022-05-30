package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
private TextView textView;
private Button button;
private Button but;
private EditText editT;
private Button bu;
public static final String Extra_Name="com.kamikaze.practiceset3.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        bu =findViewById(R.id.button3);
        but=findViewById(R.id.button2);
        editT=findViewById(R.id.editTextTextPersonName);
        textView=findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Congratulation you are a Monster. Monster king wannna meet you enter your address below");
            }
        });
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Gotcha I am coming to eat you....    please enter your address below");
            }
        });
//        bu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String a = editT.getText().toString();
//               String b= a ;
//                Intent intent = new Intent (this,MainActivity2.class);
//                intent.putExtra(Extra_Name,b  );
//                startActivity(intent);
//            }
//        });

    }
public void golu (View view){
        editT=findViewById(R.id.editTextTextPersonName);

        String a =editT.getText().toString();
        Intent intent =new Intent (this,MainActivity2.class);
        intent.putExtra(Extra_Name,a);
        startActivity(intent);
}
public void gol(View view){
        Intent intent =new Intent (this,MainActivity3.class);
        startActivity(intent);
}
    public void go(View view){
        Intent intent =new Intent (this,MainActivity4.class);
        startActivity(intent);
    }
}