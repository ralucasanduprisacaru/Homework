package com.ralu.zooapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Categories extends AppCompatActivity {

    private static final String TAG = "Categories";
    private final String[] categoryList = {"Mammals", "Bird", "Fish", "Reptiles", "Other"};
    private ListView listCategories;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        listCategories = (ListView) findViewById(R.id.lv_categories);

        ListAdapter listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, categoryList);

        listCategories.setAdapter(listAdapter);

        listCategories.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick (AdapterView<?> parent, View view, int position, long id){
                         Intent intent = new Intent(Categories.this, AnimalList.class);
                         intent.putExtra("position", position);
                         Log.d(TAG, "Item clicked. Position " + position);
                         startActivity(intent);

                    }
                }

        );

    }


}
