package com.example.raluc.amazonbooks.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer

import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.raluc.amazonbooks.R
import com.example.raluc.amazonbooks.adapters.BookAdapter
import com.example.raluc.amazonbooks.data.remote.RemoteServiceHelper
import com.example.raluc.amazonbooks.data.repository.Repository
import com.example.raluc.amazonbooks.data.repository.RepositoryImpl
import com.example.raluc.amazonbooks.models.Book
import com.google.gson.Gson
import okhttp3.ResponseBody
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val TAG = "Main"

    lateinit var mainViewModel: MainViewModel
    lateinit var recycler: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        recycler = findViewById(R.id.recycler)


        mainViewModel.getBooks().observe(this, Observer {

            recycler.layoutManager = LinearLayoutManager(this)
            recycler.adapter = it

        })

    }
}

