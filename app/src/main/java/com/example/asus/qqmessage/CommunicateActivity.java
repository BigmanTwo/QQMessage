package com.example.asus.qqmessage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/8.
 */
public class CommunicateActivity  extends AppCompatActivity implements AdapterView.OnItemClickListener{
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
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new TimeType("20:28"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new LeftType(R.mipmap.ic_launcher,"你好"));
        list.add(new RightType(R.mipmap.ic_launcher,"你好"));
        MyDapters adapter=new MyDapters(mContext,list);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"item"+position,Toast.LENGTH_SHORT).show();
    }
}
