package com.ralu.zooapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnimalList extends AppCompatActivity {

    private static final String TAG = "AnimalList";


    //MediaPlayer mp = MediaPlayer.create(this, R.raw.lioncub2);

    Animal lion = new Animal("Lion", "Lion description", "100kg", R.drawable.lion);
    Animal tiger = new Animal("Tiger", "Tiger description", "80kg", R.drawable.tiger);
    Animal bear = new Animal("Bear", "Bear description", "200kg", R.drawable.bear);
    Animal cheetah = new Animal("Cheetah", "Cheetah description", "50kg", R.drawable.cheetah);
    Animal fox = new Animal("Fox", "Fox description", "10kg", R.drawable.fox);
    Animal leopard = new Animal("Leopard", "Leopard description", "60kg", R.drawable.leopard);

   Animal[] animalsList;

   Animal []mammalList = {lion, tiger, bear, cheetah, fox, leopard};

    RecyclerView rvAnimalList;
    RecyclerView.LayoutManager layoutManager;
    AnimalListAdapter animalListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_list);

        Intent getIntent = getIntent();

        int position = getIntent.getIntExtra("position", 0);

        switch (position){
            case 0:
                animalsList = mammalList;
                break;
        }

        rvAnimalList =  findViewById(R.id.rvAnimalList);
        animalListAdapter = new AnimalListAdapter(Arrays.asList(animalsList));
        layoutManager = new LinearLayoutManager(getApplicationContext());

        rvAnimalList.setLayoutManager(layoutManager);
        rvAnimalList.setAdapter(animalListAdapter);

        Log.d(TAG, "onCreate");




    }
}
