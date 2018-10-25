package com.ralu.celebapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main";
    private RecyclerView rvMain;
    private List<Celebrity> celebrities;
    private RecyclerView.LayoutManager layoutManager;
    private CelebrityListAdapter celebrityListAdapter;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

        Celebrity celeb1 = new Celebrity(1, "Michelle Pfeiffer", "description", "56", "Actress", R.drawable.michellepf);
        Celebrity celeb2 = new Celebrity(2, "Tom Cruise", "description", "56", "Actor", R.drawable.tom);
        Celebrity celeb3 = new Celebrity(3, "Lionel Messi", "description", "31", "Football player", R.drawable.messi);
        Celebrity celeb4 = new Celebrity(4, "Freddy Mercury", "description", "56", "Singer", R.drawable.freddy);
        Celebrity celeb5 = new Celebrity(5, "Queen Elisabeth", "description", "1000", "The Queen", R.drawable.queen);

        db.saveNewCeleb(celeb1);
        db.saveNewCeleb(celeb2);
        db.saveNewCeleb(celeb3);
        db.saveNewCeleb(celeb4);
        db.saveNewCeleb(celeb5);

        Log.d(TAG, "onCreate");

        rvMain = findViewById(R.id.rvMain);
        //celebrities = Celebrity.celebrityList;
      // Celebrity.initList();

        celebrities = db.getCelebList();

        layoutManager = new LinearLayoutManager(getApplicationContext());
        celebrityListAdapter = new CelebrityListAdapter(celebrities);

        rvMain.setLayoutManager(layoutManager);
        rvMain.setAdapter(celebrityListAdapter);


    }
}
