package com.example.project;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //ArrayList containing the phrases that will be displayed to the user
        ArrayList<Word> phrases = new ArrayList<Word>();
        phrases.add(new Word(getString(R.string.phraseEnglish1), getString(R.string.phraseSpanish1)));
        phrases.add(new Word(getString(R.string.phraseEnglish2), getString(R.string.phraseSpanish2)));
        phrases.add(new Word(getString(R.string.phraseEnglish3), getString(R.string.phraseSpanish3)));
        phrases.add(new Word(getString(R.string.phraseEnglish4), getString(R.string.phraseSpanish4)));
        phrases.add(new Word(getString(R.string.phraseEnglish5), getString(R.string.phraseSpanish5)));
        phrases.add(new Word(getString(R.string.phraseEnglish6), getString(R.string.phraseSpanish6)));
        phrases.add(new Word(getString(R.string.phraseEnglish7), getString(R.string.phraseSpanish7)));
        phrases.add(new Word(getString(R.string.phraseEnglish8), getString(R.string.phraseSpanish8)));
        phrases.add(new Word(getString(R.string.phraseEnglish9), getString(R.string.phraseSpanish9)));
        phrases.add(new Word(getString(R.string.phraseEnglish10), getString(R.string.phraseSpanish10)));
        phrases.add(new Word(getString(R.string.phraseEnglish11), getString(R.string.phraseSpanish11)));
        phrases.add(new Word(getString(R.string.phraseEnglish12), getString(R.string.phraseSpanish12)));
        phrases.add(new Word(getString(R.string.phraseEnglish13), getString(R.string.phraseSpanish13)));
        phrases.add(new Word(getString(R.string.phraseEnglish14), getString(R.string.phraseSpanish14)));
        phrases.add(new Word(getString(R.string.phraseEnglish15), getString(R.string.phraseSpanish15)));
        phrases.add(new Word(getString(R.string.phraseEnglish16), getString(R.string.phraseSpanish16)));

        //Custom Array Adapter to hold Word ArrayList
        WordAdapter itemsAdapter = new WordAdapter(this, phrases);

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
