package com.example.asus.qqmessage;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 2016/4/7.
 */
public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private List<Person> mList;

    public MyAdapter(Context mContext, List<Person> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder=null;
        if(convertView==null){
            Log.e("getView","New contentView--------"+position+"-----"+convertView);
            viewHolder=new ViewHolder();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.list_style,null);
            viewHolder.imageView=(ImageView)convertView.findViewById(R.id.image);
            viewHolder.textView1=(TextView)convertView.findViewById(R.id.text_title);
            viewHolder.textView2=(TextView)convertView.findViewById(R.id.text_content);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)convertView.getTag();
            Log.e("getView","New contentView--------"+position+"-----"+convertView);
        }
        Person person= mList.get(position);
        viewHolder.imageView.setImageResource(person.getImage());
        viewHolder.textView1.setText(person.getName());
        viewHolder.textView2.setText(person.getSex());
//        Person person=mList.get(position);
//        convertView= LayoutInflater.from(mContext).inflate(R.layout.list_style,null);
//        ImageView imageView=(ImageView)convertView.findViewById(R.id.image);
//        imageView.setImageResource(person.getImage());
//        TextView textTitle=(TextView)convertView.findViewById(R.id.text_title);
//        textTitle.setText(person.getName());
//        TextView textContent=(TextView)convertView.findViewById(R.id.text_content);
//        textContent.setText(person.getSex());
        return convertView;
    }
    class ViewHolder{
        private ImageView imageView;
        private TextView textView1,textView2;
    }
}
