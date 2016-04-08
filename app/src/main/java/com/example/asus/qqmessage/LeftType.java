package com.example.asus.qqmessage;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by Asus on 2016/4/8.
 */
public class LeftType implements Type {
    private int image;
    private String str;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public LeftType(int image, String str) {
        this.image = image;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }



    @Override
    public int getType() {
        return MyDapters.LEFTTYPE;
    }
}
