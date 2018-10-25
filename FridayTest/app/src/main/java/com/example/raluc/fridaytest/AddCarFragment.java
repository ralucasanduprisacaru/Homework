package com.example.raluc.fridaytest;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class AddCarFragment extends Fragment {
    private static final String TAG = "AddCar";
    private EditText etModel, etType, etAge;
    private Button btnSave;
    private Listener listener;


    public AddCarFragment() {
        // Required empty public constructor
    }

    public interface Listener {
        public void btnClicked(View view);
    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
        listener = (Listener) context;
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_car, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
    }


}
