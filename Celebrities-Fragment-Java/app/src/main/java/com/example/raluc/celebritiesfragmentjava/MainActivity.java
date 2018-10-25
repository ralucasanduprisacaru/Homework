package com.example.raluc.celebritiesfragmentjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements CelebListFragment.Listener {
    private static final String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void itemClicked(long id) {
        Intent intent = new Intent (this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_CELEB_ID, (int) id);
        startActivity(intent);
        Log.d(TAG, "intent sent");

    }
}
