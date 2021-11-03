package com.example;

public class Movie {
    int id;
    String title;
    String genre;
    int length;
    String producer;
    String premiere;

    public Movie(int id, String title, String genre, int length, String producer, String premiere) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.length = length;
        this.producer = producer;
        this.premiere = premiere;
    }

    public String toString() {
        return id + " " + title + " " + genre + " " + length + " " + producer +" " + premiere;
    }
}
