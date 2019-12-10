package com.example.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> phrases = new ArrayList<Word>();
        //
        phrases.add(new Word(getString(R.string.phraseEnglish1), getString(R.string.phraseFrench1)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish2), getString(R.string.phraseFrench2)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish3), getString(R.string.phraseFrench3)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish4), getString(R.string.phraseFrench4)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish5), getString(R.string.phraseFrench5)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish6), getString(R.string.phraseFrench6)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish7), getString(R.string.phraseFrench7)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish8), getString(R.string.phraseFrench8)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish9), getString(R.string.phraseFrench9)));
        //
        phrases.add(new Word(getString(R.string.phraseEnglish10), getString(R.string.phraseFrench10)));
        //Custom Array Adapter to hold Word ArrayList
        WordAdapter itemsAdapter = new WordAdapter(this, phrases);
        //
        ListView lV = (ListView) findViewById(R.id.wordList);
        lV.setAdapter(itemsAdapter);
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
