package com.kamikaze.practiceset3.servicejson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitiinstance {
    private static Retrofit retrofit = null;
    private  static String Base_URL ="http://universities.hipolabs.com/";

    //singleton pattern used to create an Instance of retrofit
    public static getuniversitiesname Getuniversitiesname(){
        if  (retrofit == null){
            retrofit =new Retrofit.Builder().baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit.create(getuniversitiesname.class);
    };

}
