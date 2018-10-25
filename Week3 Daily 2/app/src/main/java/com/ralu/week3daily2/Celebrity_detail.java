package com.ralu.week3daily2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Celebrity_detail extends AppCompatActivity {
    public static final String TAG = "CelebrityDetail";

    List<Celebrity> celebList = new ArrayList<>();
    RecyclerView rvCelebList;
    RecyclerView.LayoutManager layoutManager;
    CelebAdapter celebAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrity_detail);

        // binding data
        rvCelebList = findViewById(R.id.rvCelebList);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        celebAdapter = new CelebAdapter(celebList);

        Log.d(TAG, "onCreate");

        rvCelebList.setLayoutManager(layoutManager);
        rvCelebList.setAdapter(celebAdapter);


        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        Log.d(TAG, "intent caught");

        switch (position){
            case 0:
                celebList = (List<Celebrity>) Celebrity.celebrityList.get(0);
                break;

        }


    }
}
