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

import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;
//import android.support.v7.app.AppCompatActivity;

public class GoogleTranslate extends AppCompatActivity {
    private TextView searchTxt;
    private final int requestCode = 1;
    private static final String API_KEY = "125e3da22003d8daa447d58ff8c6ba7742d6cbe3";
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_translate);
        //
        Button transButton = (Button) findViewById(R.id.translate);
        transButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trans = searchTxt.getText().toString();
                String tranURL = "https://translate.google.ca/#en/es/" + trans;
                tranURL = tranURL.replaceAll(" ", "%20");

                Intent bIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(tranURL));
                startActivity(bIntent);
            }
        });
        //
        searchTxt = (EditText) findViewById(R.id.userEnter);
        Button vlBTN = (Button) findViewById(R.id.listen);
        vlBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speechListener();
            }
        });
    }
    private void speechListener() {
        Intent sIentent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        sIentent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        sIentent.putExtra(RecognizerIntent.EXTRA_PROMPT, R.string.listenToast);
        System.out.println(10001);
        try {
            startActivityForResult(sIentent, requestCode);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(GoogleTranslate.this, "Speech to Text Not Available",
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int rCode, int reCode, Intent data) {
        super.onActivityResult(rCode, reCode, data);
        System.out.println(100002);
        switch (rCode) {
            case requestCode: {
                System.out.println(100004);
                if(reCode == RESULT_OK && data != null) {
                    System.out.println(100003);
                    ArrayList<String> res = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    searchTxt.setText(res.get(0));
                }
                break;
            }
        }
    }


}
