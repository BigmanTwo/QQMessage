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

/**
 * Created by Asus on 2016/4/8.
 */
public class MyDapters extends BaseAdapter {
    private List<Type> mList;
    private Context mContext;
    public static final int TIMETYPE=0;
    public static final int LEFTTYPE=1;
    public static final int RIGHTTYPE=2;

    public MyDapters(Context mContext, List<Type> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        return mList.get(position).getType();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderLeft viewHolderLeft=null;
        ViewHolderRight viewHolderRight=null;
        ViewHolderTime viewHolderTime=null;

        int type= mList.get(position).getType();
        Log.d("teg",type+"");
        if(convertView==null){
            viewHolderLeft=new ViewHolderLeft();
            viewHolderRight=new ViewHolderRight();
            viewHolderTime=new ViewHolderTime();
            switch(type){
                case TIMETYPE:
                    convertView= LayoutInflater.from(mContext).inflate(R.layout.time_layout,null);
                    viewHolderTime.time=(TextView)convertView.findViewById(R.id.time_text);
                    convertView.setTag(viewHolderTime);
                    break;
                case LEFTTYPE:
                    convertView=LayoutInflater.from(mContext).inflate(R.layout.leftlayout,null);
                    viewHolderLeft.imageView= (ImageView) convertView.findViewById(R.id.image);
                    viewHolderLeft.leftView=(TextView)convertView.findViewById(R.id.left_text);
                    convertView.setTag(viewHolderLeft);
                    break;
                case RIGHTTYPE:
                    convertView=LayoutInflater.from(mContext).inflate(R.layout.rightlayout,null);
                    viewHolderRight.imageView= (ImageView) convertView.findViewById(R.id.image);
                    viewHolderRight.rightView=(TextView)convertView.findViewById(R.id.right_text);
                    convertView.setTag(viewHolderRight);
                    break;
            }
        }else{
            switch(type){
                case TIMETYPE:
                    viewHolderTime= (ViewHolderTime) convertView.getTag();
                    break;
                case LEFTTYPE:
                    viewHolderLeft= (ViewHolderLeft) convertView.getTag();
                    break;
                case RIGHTTYPE:
                    viewHolderRight= (ViewHolderRight) convertView.getTag();
                    break;
            }
        }

        switch (type){
            case TIMETYPE:
               TimeType mTime= (TimeType) mList.get(position);
                viewHolderTime.time.setText(mTime.getTime());
                Log.d("values",TIMETYPE+"");
                break;
            case LEFTTYPE:
                LeftType mLeft= (LeftType) mList.get(position);
                viewHolderLeft.leftView.setText(mLeft.getStr());
                viewHolderLeft.imageView.setImageResource(mLeft.getImage());
                Log.d("values",LEFTTYPE+"");
                break;
            case RIGHTTYPE:
               RightType mRight= (RightType) mList.get(position);
                viewHolderRight.rightView.setText(mRight.getStr());
                viewHolderRight.imageView.setImageResource(mRight.getImage());
                Log.d("values",RIGHTTYPE+"");
                break;
        }
        return convertView;
    }

    class ViewHolderTime{
        private TextView time;
    }
    class ViewHolderLeft{
        private ImageView imageView;
        private TextView leftView;
    }
    class ViewHolderRight{
        private ImageView imageView;
        private TextView rightView;
    }
}
