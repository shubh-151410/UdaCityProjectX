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

public class HistoricalFragment extends Fragment {

    public HistoricalFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.gateway_of_india,R.string.Mumbai, R.drawable.gateway_of_india_mumbai));
        tours.add(new Tour(R.string.goldenoftemple, R.string.Amritsar, R.drawable.golden_temple));
        tours.add(new Tour(R.string.hawa_mahal, R.string.Jaipur, R.drawable.hawa_mahal));
        tours.add(new Tour(R.string.Lotus_Temple, R.string.Delhi, R.drawable.lotus_temple));
        tours.add(new Tour(R.string.Vishwanath_Temple, R.string.Varanasi, R.drawable.vishwanath_temple));
        tours.add(new Tour(R.string.TajMahal, R.string.Agra, R.drawable.taj_mahal));
        tours.add(new Tour(R.string.QutubMina, R.string.Delhi, R.drawable.qutubminar));
        tours.add(new Tour(R.string.BuddhistCircuit, R.string.Varanasi, R.drawable.buddhist_circuit));
        tours.add(new Tour(R.string.Flora_Mountanin, R.string.Kerela, R.drawable.flora_mountain));
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tours, R.color.category_historical);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}
