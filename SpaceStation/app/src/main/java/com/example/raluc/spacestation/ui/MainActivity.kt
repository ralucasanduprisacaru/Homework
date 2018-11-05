package com.example.raluc.spacestation.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.BroadcastReceiver
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.raluc.spacestation.R
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity() {

    private val TAG = "Main"

    lateinit var mainViewModel: MainViewModel
    lateinit var recycler: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var client : FusedLocationProviderClient
    lateinit var broadcastReceiver: BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate")

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recycler = findViewById(R.id.recyclerView)
        client = LocationServices.getFusedLocationProviderClient(this)


        mainViewModel.getStation().observe(this, Observer {
            recycler.layoutManager = LinearLayoutManager(this)
            recycler.adapter = it
            Log.d(TAG, "main created")
        })


    }
}
