package com.example.donna.newsapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


/**
 * An {@link ArticleAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Article} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {
    /**
     * Constructs a new {@link ArticleAdapter}.
     *
     * @param context  of the app
     * @param articles is the list of earthquakes, which is the data source of the adapter
     */
    public ArticleAdapter(Context context, List<Article> articles) {
        super(context, 0, articles);
    }

    /**
     * Returns a list item view that displays information about the article
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.contents_list, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Article currentArticle = getItem(position);

        // Find the TextView with view ID magnitude
        TextView titleView = listItemView.findViewById(R.id.webTitle);
        // Display the magnitude of the current earthquake in that TextView
        titleView.setText(currentArticle.getWebTitle());

        // Find the TextView with view ID location
        TextView pubView = listItemView.findViewById(R.id.date);
        // Display the location of the current earthquake in that TextView
        pubView.setText(currentArticle.getWebPublicationDate());

        // Find the TextView with view ID date
        TextView sectionView = listItemView.findViewById(R.id.sectionName);
        // Display the date of the current earthquake in that TextView
        sectionView.setText(currentArticle.getSectionName());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}


