package com.example.project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shrey Patel on 2018-02-25.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,
                    parent, false);
        }

        Word currentWord = getItem(position);

        ImageView wordImageView = (ImageView) listItemView.findViewById(R.id.wordImageView);
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishTextView);
        TextView translationTextView = (TextView) listItemView.findViewById(R.id.translationTextView);

        wordImageView.setImageResource(currentWord.getImageId());
        englishTextView.setText(currentWord.getEnglish());
        translationTextView.setText(currentWord.getTranslation());

        return listItemView;
    }
}
