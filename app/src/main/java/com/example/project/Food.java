package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> foods = new ArrayList<Word>();
        foods.add(new Word("Bell Pepper", "Chile pimiento", R.mipmap.ic_launcher));
        foods.add(new Word("Onion", "Cebolla", R.mipmap.ic_launcher));
        foods.add(new Word("Spinach", "Espinaca", R.mipmap.ic_launcher));
        foods.add(new Word("Beef", "Carne de res", R.mipmap.ic_launcher));
        foods.add(new Word("Lamb", "Cordero", R.mipmap.ic_launcher));
        foods.add(new Word("Chicken", "Pollo", R.mipmap.ic_launcher));
        foods.add(new Word("Lettuce", "Lechuga", R.mipmap.ic_launcher));
        foods.add(new Word("Tomato", "Tomate", R.mipmap.ic_launcher));
        foods.add(new Word("Pickles", "Pepinillos", R.mipmap.ic_launcher));
        foods.add(new Word("Beans", "Frijoles", R.mipmap.ic_launcher));

        //Custom Array Adapter to hold Word ArrayList
        WordAdapter itemsAdapter = new WordAdapter(this, foods);

        ListView listView = (ListView) findViewById(R.id.wordList);

        listView.setAdapter(itemsAdapter);

        //Back button to take you back one screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
