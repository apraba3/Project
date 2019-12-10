package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("Zero", "Cero", R.mipmap.ic_launcher));
        numbers.add(new Word("One", "Uno", R.mipmap.ic_launcher));
        numbers.add(new Word("Two", "Dos", R.mipmap.ic_launcher));
        numbers.add(new Word("Thre", "Tres", R.mipmap.ic_launcher));
        numbers.add(new Word("Four", "Cuatro", R.mipmap.ic_launcher));
        numbers.add(new Word("Five", "Cinco", R.mipmap.ic_launcher));
        numbers.add(new Word("Six", "Seis", R.mipmap.ic_launcher));
        numbers.add(new Word("Seven", "Siete", R.mipmap.ic_launcher));
        numbers.add(new Word("Eight", "Ocho", R.mipmap.ic_launcher));
        numbers.add(new Word("Nine", "Nueve", R.mipmap.ic_launcher));
        numbers.add(new Word("Ten", "Diez", R.mipmap.ic_launcher));
        //
        //Custom Array Adapter to hold Word ArrayList
        WordAdapter adapt = new WordAdapter(this, numbers);
        //
        ListView lV = (ListView) findViewById(R.id.wordList);
        lV.setAdapter(adapt);
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
