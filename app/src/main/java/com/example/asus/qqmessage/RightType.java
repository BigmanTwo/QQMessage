package com.example.asus.qqmessage;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Asus on 2016/4/8.
 */
public  class RightType implements Type {
     private int image;

    private String str;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    public RightType(int image, String str) {

        this.image = image;
        this.str = str;
    }

    @Override
    public int getType() {
        return MyDapters.RIGHTTYPE;
    }
}
