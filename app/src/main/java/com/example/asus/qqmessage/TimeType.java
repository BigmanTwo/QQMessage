package com.example.asus.qqmessage;

/**
 * Created by Asus on 2016/4/8.
 */
public class TimeType implements Type{
    private String time;

    @Override
    public int getType() {
        return MyDapters.TIMETYPE;
    }

    public TimeType(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
