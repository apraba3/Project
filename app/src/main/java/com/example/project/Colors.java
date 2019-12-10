package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
//import android.support.v7.app.AppCompatActivity;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> color = new ArrayList<Word>();
        color.add(new Word("Red", "Rouge", R.mipmap.ic_launcher));
        //
        color.add(new Word("Orange", "Orange", R.mipmap.ic_launcher));
        //
        color.add(new Word("Yellow", "Jaune", R.mipmap.ic_launcher));
        //
        color.add(new Word("Green", "Vert", R.mipmap.ic_launcher));
        //
        color.add(new Word("Blue", "Bleu", R.mipmap.ic_launcher));
        //
        color.add(new Word("Purple", "Violet", R.mipmap.ic_launcher));
        //
        color.add(new Word("Pink", "Rose", R.mipmap.ic_launcher));
        //
        //Custom Array Adapter to hold Word ArrayList
        WordAdapter iA = new WordAdapter(this, color);
        //
        ListView listView = (ListView) findViewById(R.id.wordList);
        listView.setAdapter(iA);
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
