package com.example.asus.qqmessage;

/**
 * Created by Asus on 2016/4/7.
 */
public class Person {
    private String name;
    private String sex;
    private int image;

    public Person(int image, String name, String sex) {
        this.image = image;
        this.name = name;
        this.sex = sex;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
