package com.leapfrog.example.recyclerviewexample;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.leapfrog.example.recyclerviewexample.adapter.MovieViewAdapter;
import com.leapfrog.example.recyclerviewexample.dao.ClickListener;
import com.leapfrog.example.recyclerviewexample.entity.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ClickListener clickListener;

    RecyclerView recyclelist;
    MovieViewAdapter movieadapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        recyclelist=(RecyclerView)findViewById(R.id.recyclerView);
        recyclelist.setLayoutManager(new LinearLayoutManager(this));
        recyclelist.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL, ContextCompat.getDrawable(this,R.drawable.listdivider)));

        ArrayList<Movie>list=getSampleData();
        movieadapter=new MovieViewAdapter(this, list);
        recyclelist.setAdapter(movieadapter);
        recyclelist.setOnClickListener(new View.OnClickListener() {


        });


    }

    private ArrayList<Movie>getSampleData(){
        ArrayList<Movie>list =new ArrayList<>();
        list.add(new Movie(1,"Mad Max","Action","2016"));
        list.add(new Movie(2,"Up","Animation","2011"));
        list.add(new Movie(3,"Captain America","Sci-fi","2016"));
        list.add(new Movie(4,"Iron man","Sci-fi","2014"));

        return list;
    }




}
