package com.example.miwoklanguage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.android.miwok.Word;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter <com.example.android.miwok.Word> {

    private int Color_id;
    public WordAdapter(Context context, ArrayList<Word> words,int colorId) {
        super(context, 0, words);
        Color_id=colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getDefaultTranslation());


        ImageView imageView=(ImageView)listItemView.findViewById(R.id.imageview);
       if(currentWord.hasImage())
       {
           imageView.setImageResource(currentWord.getmImageIdResource());
           imageView.setVisibility(View.VISIBLE);
       }
       else
       {
           imageView.setVisibility(View.GONE);
       }
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.

        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), Color_id);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
