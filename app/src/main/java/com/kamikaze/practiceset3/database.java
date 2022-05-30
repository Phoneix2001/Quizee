package com.kamikaze.practiceset3;

public class database {

    private int sno ;
    public int image;
    public String name;
    database (int sno, int image , String name){
        this.sno=sno;
        this.image=image;
        this.name=name;
    }

    public int getSno() {
        return sno;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
