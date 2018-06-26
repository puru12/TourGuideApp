package com.example.android.mykanpur;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.android.mykanpur.R;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter {
    
    public  CustomArrayAdapter(Context context, int layoutResourceId, ArrayList<Integer> list){
        super(context, layoutResourceId, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        
        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(getContext()).inflate(R.layout.image, parent, false);
        }
        
        ((ImageView)v.findViewById(R.id.list_image)).setImageResource((int)getItem(position));
        
        return v;
    }
}
