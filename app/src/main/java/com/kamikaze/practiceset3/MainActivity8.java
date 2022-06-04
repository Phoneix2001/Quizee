package com.kamikaze.practiceset3;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        Button buttton =findViewById(R.id.button11);
        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean clicked=true;
                if(clicked){
                    int in = R.drawable.goblin;
                    buttton.setBackgroundResource(R.drawable.pausebutton);
                }else{buttton.setBackgroundResource(R.drawable.goblin);

                }


            }
        });
    }
}