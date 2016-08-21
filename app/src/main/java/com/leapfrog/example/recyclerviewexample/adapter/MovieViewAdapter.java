package com.leapfrog.example.recyclerviewexample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leapfrog.example.recyclerviewexample.R;
import com.leapfrog.example.recyclerviewexample.entity.Movie;

import java.util.ArrayList;

/**
 * Created by Dell on 21-Aug-16.
 */
public class MovieViewAdapter extends RecyclerView.Adapter<MovieViewHolder>{

    Context context;
    ArrayList<Movie> movielist;

    public MovieViewAdapter(Context context, ArrayList<Movie> movies) {
        this.context = context;
        this.movielist = movies;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.movie_list_row,null);

        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie=movielist.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }


    @Override
    public int getItemCount() {
        return movielist.size();
    }
}
