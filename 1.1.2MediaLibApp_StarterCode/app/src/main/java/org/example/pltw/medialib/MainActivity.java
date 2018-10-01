package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
        ;
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        //outputText.setText("none");

        double totalCost = 0;
        int numSongs = 0;
        int ratings = 0;
        double aveCost;
        double aveRating;


        outputText.setText("SONGS");
        outputText.append("\n");

        Song song1 = new Song();
        song1.setTitle("Photograph");
        outputText.append(song1.getTitle());
        outputText.append("\n");
        outputText.append("\n");

        Song song2 = new Song("Beth", 1.99, 8);
        totalCost = totalCost + (song2.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song2.getRating());

        Song song3 = new Song("Two out of three ain't bad", 1.29, 9);
        totalCost = totalCost + (song3.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song3.getRating());

        Song song4 = new Song("Baby Shark Song", 2.99, 10);
        totalCost = totalCost + (song4.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song4.getRating());

        Song song5 = new Song("Thriller", .99, 7);
        totalCost = totalCost + (song5.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song5.getRating());

        Song song6 = new Song("True Blue", 1.29, 8);
        totalCost = totalCost + (song6.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song6.getRating());

        Song song7 = new Song("Rock of Ages", 1.19, 7);
        totalCost = totalCost + (song7.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song7.getRating());

        Song song8 = new Song("Time after Time", .99, 6);
        totalCost = totalCost + (song8.getPrice());
        numSongs = numSongs + 1;
        ratings = ratings + (song8.getRating());

        outputText.append("MOVIES");
        outputText.append("\n");
        Movies movie1 = new Movies();
        movie1.setTitle("Rocky");
        outputText.append(movie1.getTitle());
        outputText.append("\n");
        outputText.append("\n");


        outputText.append("BOOKS");
        outputText.append("\n");
        Books book1 = new Books();
        book1.setTitle("Grapes of Wrath");
        outputText.append(book1.getTitle());

        outputText.append("TOTAL COSTS");
        //outputText.append(totalCost);
        outputText.append("\n");

        aveCost = totalCost / numSongs;
        outputText.append("AVERAGE COSTS");
        //outputText.append(aveCost);
        outputText.append("\n");

        aveRating = ratings / numSongs;
        outputText.append("AVERAGE RATING");
        //outputText.append("%.2f", aveRating);

    }
}
