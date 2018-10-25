package com.example.raluc.celebritiesfragmentjava;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class CelebListFragment extends ListFragment {
    private static final String TAG = "CelebList";

     static interface Listener {
       void itemClicked (long id);
     };


    private Listener listener;


    public CelebListFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
        Log.d(TAG, "celeblist attached");
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        String [] names = {"Michelle Pfeiffer", "Tom Cruise", "Lionel Messi", "Queen Elisabeth"};


        ArrayAdapter <String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                names
        );

        setListAdapter(adapter);
        Log.d(TAG, "view created");

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick(ListView listView, View itemview, int position, long id) {

        if (listener != null) {
            listener.itemClicked(id);
        }
        super.onListItemClick(listView, itemview, position, id);
    }



}
