package com.example.raluc.celebritiesfragmentjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_CELEB_ID = "id";
    private static final String TAG = "SECOND";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "in the second");
        CelebDetailFrag frag = (CelebDetailFrag) getSupportFragmentManager().findFragmentById(R.id.celebDetailFrag);
        int id = (int) getIntent().getExtras().get(EXTRA_CELEB_ID);
        frag.setId(id);



        Toast.makeText(this, "second created", Toast.LENGTH_LONG).show();
    }
}
