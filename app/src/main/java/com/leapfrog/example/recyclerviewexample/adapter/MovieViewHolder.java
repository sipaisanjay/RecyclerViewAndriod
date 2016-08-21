package com.leapfrog.example.recyclerviewexample.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.leapfrog.example.recyclerviewexample.R;

/**
 * Created by Dell on 17-Aug-16.
 */
public class MovieViewHolder extends RecyclerView.ViewHolder{
     public TextView title,genre,year,checkbox;

        public MovieViewHolder(View itemview){
        super(itemview);
            title=(TextView)itemview.findViewById(R.id.title);
            genre=(TextView)itemview.findViewById(R.id.genre);
            year=(TextView)itemview.findViewById(R.id.year);
            checkbox=(CheckBox)itemview.findViewById(R.id.checkbox);

        }

}
