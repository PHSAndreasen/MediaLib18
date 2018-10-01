package org.example.pltw.medialib;

/**
 * Created by MVR3 on 9/11/2018.
 */

public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
    }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;

    }

    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r){
        rating = r;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double p){
        price = p;
    }

    public void addToFavorites() {
        favorite = true;
    }

    public void changeFavorite(boolean add) {
        favorite = add;
    }


}