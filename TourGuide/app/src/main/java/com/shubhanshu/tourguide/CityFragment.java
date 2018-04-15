package com.shubhanshu.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.AdapterView;

import java.util.ArrayList;

/**
 * Created by Babu on 20-02-2018.
 */

public class CityFragment extends Fragment {
    public CityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.Bangkok, R.string.Thailand, R.drawable.bangkok_thailand));
        tours.add(new Tour(R.string.London, R.string.England, R.drawable.london_england));
        tours.add(new Tour(R.string.Chicago, R.string.U_S_A, R.drawable.chicaho_us));
        tours.add(new Tour(R.string.Los_Angeles, R.string.U_S_A, R.drawable.losangeles_us));
        tours.add(new Tour(R.string.Buenos, R.string.Argentina, R.drawable.buenos_argentina));
        tours.add(new Tour(R.string.Berlin, R.string.Germanu, R.drawable.berlin_germany));
        tours.add(new Tour(R.string.BurjKhalifa, R.string.dubai, R.drawable.burjkhalifa_dubai));
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_state);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}
