package com.example.raluc.fridaytest;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AddCarFragment.Listener {
    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "main activity created");

        // initialise car list
        Car.cars.add( new Car("Tesla 3", "electric", "2018"));
        Car.cars.add( new Car("Tesla S", "electric", "2018"));
        Car.cars.add( new Car("Tesla X", "electric", "2018"));
        Car.cars.add( new Car("Skoda Superb", "diesel", "2009"));
        Car.cars.add( new Car("BMW 5", "petrol", "2010"));


        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flFrag1, new AddCarFragment());
        ft.commit();

        Log.d(TAG, "first fragment loaded");

        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
        ft2.replace(R.id.flFrag2, new CarListFragment());
        ft2.commit();

        Log.d(TAG, "second fragment loaded");


    }



    @Override
    public void btnClicked(View view) {
        Log.d(TAG, "button clicked");

        Context context = getApplicationContext();
        view = findViewById(R.id.llMain);


        EditText etModel =  view.findViewById(R.id.etModel);
        EditText etType =  view.findViewById(R.id.etType);
        EditText etAge = view.findViewById(R.id.etYear);

        Car.cars.add(new Car(etModel.toString(), etType.toString(), etAge.toString()));

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.flFrag2, new CarListFragment() );
        ft.commit();



    }
}
