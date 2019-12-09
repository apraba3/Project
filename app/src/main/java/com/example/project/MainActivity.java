package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*
        TextView phrasesTextView = (TextView) findViewById(R.id.phrases);

        phrasesTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(phrasesIntent);

                Toast.makeText(MainActivity.this, getString(R.string.phrasesToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

 */

        TextView numbersTextView = (TextView) findViewById(R.id.numbers);

        numbersTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);

                Toast.makeText(MainActivity.this, getString(R.string.numbersToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView colorsTextView = (TextView) findViewById(R.id.colors);

        colorsTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(colorsIntent);

                Toast.makeText(MainActivity.this, getString(R.string.colorsToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView foodTextView = (TextView) findViewById(R.id.food);

        foodTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this, Food.class);
                startActivity(foodIntent);

                Toast.makeText(MainActivity.this, getString(R.string.foodToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView googleTextView = (TextView) findViewById(R.id.googleTranslate);

        googleTextView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent googleIntent = new Intent(MainActivity.this, GoogleTranslate.class);
                startActivity(googleIntent);

                Toast.makeText(MainActivity.this, getString(R.string.googleToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
