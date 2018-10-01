package org.example.pltw.medialib;

/**
 * Created by MVR3 on 9/11/2018.
 */

public class Books
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Books()
    {
        // initialise instance variables
        rating = 0;
        title = "";
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


}

