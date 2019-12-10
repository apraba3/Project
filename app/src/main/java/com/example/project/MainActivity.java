package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView pTV = (TextView) findViewById(R.id.phrases);
        pTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pIntent = new Intent(MainActivity.this, Phrases.class);
                startActivity(pIntent);
                Toast.makeText(MainActivity.this, getString(R.string.phrasesToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView nTV = (TextView) findViewById(R.id.nums);
        nTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(nIntent);
                Toast.makeText(MainActivity.this, getString(R.string.numbersToast),
                        Toast.LENGTH_SHORT).show();
            }
        });

        TextView cTV= (TextView) findViewById(R.id.colors);
        cTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cIntent = new Intent(MainActivity.this, Colors.class);
                startActivity(cIntent);
                Toast.makeText(MainActivity.this, getString(R.string.colorsToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
        TextView fTV = (TextView) findViewById(R.id.food);
        fTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fIntent = new Intent(MainActivity.this, Food.class);
                startActivity(fIntent);
                Toast.makeText(MainActivity.this, getString(R.string.foodToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
        TextView gTV = (TextView) findViewById(R.id.googleTranslate);
        gTV.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gIntent = new Intent(MainActivity.this, GoogleTranslate.class);
                startActivity(gIntent);
                Toast.makeText(MainActivity.this, getString(R.string.googleToast),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
