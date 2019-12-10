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
        food.add(new Word("Beef", "Carne de res", R.mipmap.ic_launcher));
        //
        food.add(new Word("Lamb", "Cordero", R.mipmap.ic_launcher));
        //
        food.add(new Word("Chicken", "Pollo", R.mipmap.ic_launcher));
        //
        food.add(new Word("Lettuce", "Lechuga", R.mipmap.ic_launcher));
        //
        food.add(new Word("Tomato", "Tomate", R.mipmap.ic_launcher));
        //
        food.add(new Word("Pickles", "Pepinillos", R.mipmap.ic_launcher));
        //
        food.add(new Word("Beans", "Frijoles", R.mipmap.ic_launcher));
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
