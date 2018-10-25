package com.ralu.week3daily2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Main";
    private ListView lvMain;
    private List<String> celebNames = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // binding data

        lvMain = findViewById(R.id.lvMain);

        // populate the list

        celebNames.add("Michelle Pfeiffer");
        celebNames.add("Tom Cruise");
        celebNames.add("Lionel Messi");
        celebNames.add("Freddy Mercury");
        celebNames.add("Queen Elisabeth");


        // link the String list to a layout in an adapter
        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, celebNames);
        // link the adapter to the listview
        lvMain.setAdapter(listAdapter);

        // set onclick listner

        lvMain.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent (MainActivity.this, Celebrity_detail.class);
                        intent.putExtra("position", position);
                        startActivity(intent);
                    }
                }

        );






    }




}
