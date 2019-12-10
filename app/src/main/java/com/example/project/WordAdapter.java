package com.example.project;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

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

        ImageView wIV = (ImageView) listItemView.findViewById(R.id.wIV);
        TextView eTV = (TextView) listItemView.findViewById(R.id.englishTV);
        TextView tTV = (TextView) listItemView.findViewById(R.id.transTV);

        wIV.setImageResource(currentWord.getImageId());
        eTV.setText(currentWord.getEnglish());
        tTV.setText(currentWord.getTranslation());

        return listItemView;
    }
}
