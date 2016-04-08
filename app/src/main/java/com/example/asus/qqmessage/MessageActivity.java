package com.example.asus.qqmessage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 2016/4/7.
 */
public class MessageActivity extends AppCompatActivity {
    private List<Person> mList;
    private ListView mListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.massage_layout);
        mList=new ArrayList<>();
        for (int i=1;i<100;i++){
            Person person=new Person(R.mipmap.ic_launcher,"张三"+i,"男");
            mList.add(person);
        }
        mListView= (ListView) findViewById(R.id.list_item);
        MyAdapter adapter=new MyAdapter(this,mList);
        mListView.setAdapter(adapter);
    }
}
