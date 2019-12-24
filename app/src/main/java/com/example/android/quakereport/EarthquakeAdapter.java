package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter {
    public EarthquakeAdapter(Context context, ArrayList<EarthQuake> earthquake) {
        super(context, 0, earthquake);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Info} object located at this position in the list
        EarthQuake currentEarthquakeAdapter = (EarthQuake) getItem(position);

        // Find the TextView in the list_item.xml layout with name
        TextView intensityTextView = (TextView) listItemView.findViewById(R.id.intensity_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        intensityTextView.setText(currentEarthquakeAdapter.getIntensity());

        // Find the TextView in the list_item.xml layout with the location
        TextView townTextView = (TextView) listItemView.findViewById(R.id.town_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        townTextView.setText(currentEarthquakeAdapter.getTown());

        // Find the TextView in the list_item.xml layout with the location
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        dateTextView.setText(currentEarthquakeAdapter.getDate());



        return listItemView;
    }
}