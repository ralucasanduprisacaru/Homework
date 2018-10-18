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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate");

        rvMain = findViewById(R.id.rvMain);
        celebrities = Celebrity.celebrityList;
        Celebrity.initList();

        layoutManager = new LinearLayoutManager(getApplicationContext());
        celebrityListAdapter = new CelebrityListAdapter(celebrities);

        rvMain.setLayoutManager(layoutManager);
        rvMain.setAdapter(celebrityListAdapter);




    }
}
