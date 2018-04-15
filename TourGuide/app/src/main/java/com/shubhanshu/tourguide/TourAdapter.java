package com.shubhanshu.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Babu on 19-02-2018.
 */

public class TourAdapter extends ArrayAdapter<Tour> {
    private int mcolourREsourceId;

    public TourAdapter(@NonNull Context context, ArrayList<Tour> tours, int colourResourceId) {
        super(context, 0, tours);
        mcolourREsourceId = colourResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Tour currentTour = getItem(position);
        TextView tour_txt_view = (TextView) listItemView.findViewById(R.id.tour_text_view);
        tour_txt_view.setText(currentTour.getname());
        TextView tour_guide_textView = (TextView) listItemView.findViewById(R.id.tour_guide_text_view);
        tour_guide_textView.setText(currentTour.getplace());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentTour.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTour.getImageResourceID());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mcolourREsourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
