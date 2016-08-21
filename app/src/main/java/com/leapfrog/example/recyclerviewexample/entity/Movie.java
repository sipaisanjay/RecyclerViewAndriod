package com.leapfrog.example.recyclerviewexample.entity;

/**
 * Created by Dell on 17-Aug-16.
 */
public class Movie {

    private int movieId;
    private String title, genre,year;

    public Movie(int movieId, String title, String genre, String year) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
