package com.kamikaze.practiceset3.servicejson;

import com.kamikaze.practiceset3.model.universitiesname;

import javax.xml.transform.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface getuniversitiesname {
    // retrofit interface
    @GET("search?country=India")
    Call<universitiesname> getUniversity();
}
