package com.leapfrog.example.recyclerviewexample.dao;

import android.view.View;

/**
 * Created by Dell on 21-Aug-16.
 */
public interface ClickListener {

    void onClick(View view,int position);
    void onLongClick(View view,int position);
}
