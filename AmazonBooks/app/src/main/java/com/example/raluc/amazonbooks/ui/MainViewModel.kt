package com.example.raluc.amazonbooks.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.util.Log
import android.widget.Toast
import com.example.raluc.amazonbooks.adapters.BookAdapter
import com.example.raluc.amazonbooks.data.remote.RemoteServiceHelper
import com.example.raluc.amazonbooks.data.repository.Repository
import com.example.raluc.amazonbooks.data.repository.RepositoryImpl
import com.example.raluc.amazonbooks.models.Book
import java.security.AccessController.getContext


class MainViewModel()  : ViewModel() {
    private val TAG = "MainView"
    lateinit var repository : RepositoryImpl

    lateinit var remoteServiceHelper: RemoteServiceHelper
    lateinit var getBookLiveData: MutableLiveData<List<Book>>

    init {
        remoteServiceHelper = RemoteServiceHelper()
        getBookLiveData = MutableLiveData()
        repository = RepositoryImpl(remoteServiceHelper,getBookLiveData )
    }

    fun getBooks():LiveData<BookAdapter> {

        Log.d(TAG, " after transformations")
        return Transformations.map(repository.getBooks()){
            BookAdapter(it)
        }

    }
}