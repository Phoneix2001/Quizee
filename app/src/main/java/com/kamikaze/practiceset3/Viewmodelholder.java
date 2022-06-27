package com.kamikaze.practiceset3;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Viewmodelholder extends ViewModel {
    private int count = 0;
    private MutableLiveData<Integer> countlivedata = new MutableLiveData<>();



    public MutableLiveData<Integer> getIniatialcounter(){
        countlivedata.setValue(count);
        return countlivedata;
    }


    public void getCount(){
        count++;
        countlivedata.setValue(count);

    }
}
