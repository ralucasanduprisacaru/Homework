package com.example.raluc.fridaytest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;


public class CarListFragment extends ListFragment {
    private static final String TAG = "CarList";

    public CarListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        List<String> carList = new ArrayList<>();

        for (Car c : Car.cars) {
            String s = c.getModel() + " " + c.getType() + " " + c.getYear();
            carList.add(s);
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                carList
        );

        setListAdapter(adapter);
        Log.d(TAG, "adapter set");


        Log.d(TAG, "list car inflated");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_car_list, container, false);
    }

}
