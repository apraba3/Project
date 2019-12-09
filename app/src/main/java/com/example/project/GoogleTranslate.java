package com.example.project;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GoogleTranslate extends AppCompatActivity {
    private TextView searchTxt;
    private final int requestCode = 1;

    private static final String API_KEY = "125e3da22003d8daa447d58ff8c6ba7742d6cbe3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_translate);

        searchTxt = (EditText) findViewById(R.id.searchText);
        Button voiceListenBtn = (Button) findViewById(R.id.listenButton);
        voiceListenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speechListener();
            }
        });

        Button translateBtn = (Button) findViewById(R.id.translateButton);
        translateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String translate = searchTxt.getText().toString();
                String translateURL = "https://translate.google.ca/#en/es/" + translate;
                translateURL = translateURL.replaceAll(" ", "%20");

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(translateURL));
                startActivity(browserIntent);
            }
        });
    }

    private void speechListener() {
        Intent speechIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        speechIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        speechIntent.putExtra(RecognizerIntent.EXTRA_PROMPT, R.string.listenToast);
        System.out.println(10001);
        try {
            startActivityForResult(speechIntent, requestCode);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(GoogleTranslate.this, "Speech to Text Not Available",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int reqCode, int resCode, Intent data) {
        super.onActivityResult(reqCode, resCode, data);
        System.out.println(100002);
        switch (reqCode) {
            case requestCode: {
                System.out.println(100004);
                if(resCode == RESULT_OK && data != null) {
                    System.out.println(100003);
                    ArrayList<String> res = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    searchTxt.setText(res.get(0));
                }
                break;
            }
        }
    }


}
