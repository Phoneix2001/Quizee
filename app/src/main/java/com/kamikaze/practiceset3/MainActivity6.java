package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity6 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Spinner spinner =findViewById(R.id.spinner2);
        TextView textview= findViewById(R.id.textView13);
        
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Monster_Names, androidx.transition.R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {

//        Toast.makeText(this, "manifest", Toast.LENGTH_SHORT).show();
TextView textview= findViewById(R.id.textView13);
String sd = adapterView.getItemAtPosition(i).toString();
textview.setText(sd);
        Log.v("nomo","this is working");
        Button button=  findViewById(R.id.button10);

        button.setText("Know about "+sd);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY, sd);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_scrolling_activity1, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intent = new Intent(this,MainActivity7.class);
                startActivity(intent);

                return true;
            case R.id.action_settings2:
                Intent inten = new Intent(this,MainActivity8.class);
                startActivity(inten);
                return true;
            case R.id.action_settings3:
                Intent inte = new Intent(this ,allmonsternameinrecyclerview.class);
                startActivity(inte);
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}