package com.shubhanshu.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Babu on 20-02-2018.
 */

public class IslandFragment extends Fragment {
    public IslandFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.EasterIsland, R.string.Chile, R.drawable.easterisland_chile));
        tours.add(new Tour(R.string.boracay_philippine,R.string.Philipine, R.drawable.boracay_philippine));
        tours.add(new Tour(R.string.Bora,R.string.Romanic, R.drawable.bora_romanicisland));
        tours.add(new Tour(R.string.Columbia,R.string.SouthAmerica, R.drawable.columbia_southamerica));
        tours.add(new Tour(R.string.GreekIslands,R.string.Mynkonos, R.drawable.greekisland_mynkonos));
        tours.add(new Tour(R.string.Naheel_Tower,R.string.dubai, R.drawable.nakheeltower_dubai));
        tours.add(new Tour(R.string.Maldivies,R.string.Maldivies, R.drawable.maldives));
        tours.add(new Tour(R.string.Lefkas,R.string.greece, R.drawable.lefkas_greece));
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_language);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}
