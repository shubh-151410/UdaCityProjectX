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

import java.util.ArrayList;

/**
 * Created by Babu on 19-02-2018.
 */

public class FoodFragment extends Fragment {
   public FoodFragment()
   {

   }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        ArrayList<Tour> tours = new ArrayList<Tour>();

        tours.add(new Tour(R.string.Baada_Pao,R.string.mumbai,R.drawable.badda_pao));
        tours.add(new Tour(R.string.Batti_Chokha,R.string.Uttar_Pradesh,R.drawable.batti_chokha));
        tours.add(new Tour(R.string.Briyani,R.string.Hyderabad,R.drawable.briyani));
        tours.add(new Tour(R.string.Choola_Bhatura,R.string.Punjab,R.drawable.choola_bhatura));
        tours.add(new Tour(R.string.jalebi,R.string.Varanasi,R.drawable.jalebi));
        tours.add(new Tour(R.string.Paan,R.string.Varanasi,R.drawable.paan));
        tours.add(new Tour(R.string.Paav_Bhaji,R.string.Mumbai,R.drawable.paav_bhaji));
        tours.add(new Tour(R.string.TikkiChola,R.string.lko,R.drawable.tikki_chola));
        tours.add(new Tour(R.string.TokriChat,R.string.lko,R.drawable.tokri_chaat));

        TourAdapter tour = new TourAdapter(getActivity(),tours,R.color.category_food);
        ListView listView  = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(tour);
        return rootView;

    }
}
