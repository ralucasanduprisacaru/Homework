package com.example.raluc.flickerchallenge.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.raluc.flickerchallenge.R

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    lateinit var mainViewModel: MainViewModel
    lateinit var recycler: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "layout inflated")

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recycler = findViewById(R.id.recycler_layout)

        mainViewModel.getPictures().observe(this, Observer {
            recycler.layoutManager = LinearLayoutManager(this)
            recycler.adapter = it
        })
        Log.d(TAG, "adapter set")


    }
}
