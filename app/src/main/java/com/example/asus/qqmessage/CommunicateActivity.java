package com.example.asus.qqmessage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/8.
 */
public class CommunicateActivity  extends AppCompatActivity{
    private ListView mListView;
    private Context mContext;
    private List<Type> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commnunicate);
        mContext=this;
        mListView= (ListView) findViewById(R.id.list_talk);
        list=new ArrayList<>();
        list.add(new TimeType("20:07"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new TimeType("20:28"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        MyDapters adapter=new MyDapters(mContext,list);
        mListView.setAdapter(adapter);
    }
}
