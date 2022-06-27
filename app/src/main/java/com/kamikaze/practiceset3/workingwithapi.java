package com.kamikaze.practiceset3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kamikaze.practiceset3.model.universitiesname;
import com.kamikaze.practiceset3.servicejson.getuniversitiesname;
import com.kamikaze.practiceset3.servicejson.retrofitiinstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class workingwithapi extends AppCompatActivity {
ArrayList<universitiesname> UniversitiesNAme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workingwithapi);
GEtuniversiterrs();

    }

    public void GEtuniversiterrs() {
        getuniversitiesname Getuniversitiesname = retrofitiinstance.Getuniversitiesname();
        Call<universitiesname> call = Getuniversitiesname.getUniversity();
        call.enqueue(new Callback<universitiesname>() {
            @Override
            public void onResponse(Call<universitiesname> call, Response<universitiesname> response) {
                universitiesname Universitesnamw = response.body();
                if(Universitesnamw != null && Universitesnamw.getName() != null && Universitesnamw.getDomains() != null && Universitesnamw.getCountry() != null){
//                    UniversitiesNAme =(ArrayList<universitiesname>)  ;
                }
            }

            @Override
            public void onFailure(Call<universitiesname> call, Throwable t) {

            }
        });


    }
}