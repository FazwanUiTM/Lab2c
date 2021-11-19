package com.example.lab2oct2021;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    public Integer[] thumbImages = {
            R.drawable.astra, R.drawable.breach, R.drawable.brimstone, R.drawable.cypher,
            R.drawable.jett, R.drawable.kj, R.drawable.kayo, R.drawable.omen, R.drawable.phoenix,
            R.drawable.raze, R.drawable.reyna, R.drawable.sage, R.drawable.skye, R.drawable.sova,
            R.drawable.viper, R.drawable.yoru
    };

    public ImageAdapter(Context c) {mContext=c;}

    public int getCount() {return thumbImages.length;}
    public Object getItem(int position){ return null; }
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View converView, ViewGroup parent){
        ImageView imageView = new ImageView (mContext) ;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8, 8, 8, 8);
        imageView.setImageResource(thumbImages[position]);

        return imageView;
    }

}
