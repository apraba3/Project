package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

//import android.support.v7.app.AppCompatActivity;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //
        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> food = new ArrayList<Word>();
        //
        food.add(new Word("Beef", "Du boeuf", R.mipmap.ic_launcher));
        //
        food.add(new Word("Lamb", "Agneau", R.mipmap.ic_launcher));
        //
        food.add(new Word("Chicken", "Poulette", R.mipmap.ic_launcher));
        //
        food.add(new Word("Lettuce", "Salade", R.mipmap.ic_launcher));
        //
        food.add(new Word("Tomato", "Tomate", R.mipmap.ic_launcher));
        //
        food.add(new Word("Pickles", "Cornichons", R.mipmap.ic_launcher));
        //
        food.add(new Word("Beans", "Haricot", R.mipmap.ic_launcher));
        //
        //Custom Array Adapter to hold Word ArrayList
        WordAdapter iAr = new WordAdapter(this, food);
        //
        ListView lV = (ListView) findViewById(R.id.wordList);
        lV.setAdapter(iAr);
        //Back button to take you back one screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem i) {
        if (i.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(i);
    }
}
