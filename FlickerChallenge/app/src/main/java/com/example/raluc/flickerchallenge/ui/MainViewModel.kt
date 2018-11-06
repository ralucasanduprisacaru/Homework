package com.example.raluc.flickerchallenge.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.example.raluc.flickerchallenge.adapter.PictureAdapter
import com.example.raluc.flickerchallenge.data.remote.RemoteServiceHelper
import com.example.raluc.flickerchallenge.data.repository.RepositoryImpl
import com.example.raluc.flickerchallenge.models.Picture

class MainViewModel() : ViewModel() {
    private val TAG = "ViewModel"
    lateinit var repository: RepositoryImpl
    lateinit var remoteServiceHelper: RemoteServiceHelper
    lateinit var getPicturesLiveData: MutableLiveData<List<Picture>>

    init {
        remoteServiceHelper = RemoteServiceHelper()
        getPicturesLiveData = MutableLiveData()
        repository = RepositoryImpl(remoteServiceHelper, getPicturesLiveData)
        Log.d(TAG, "onInit")
    }

    fun getPictures(): LiveData<PictureAdapter> {
        return Transformations.map(repository.getPictures()) {
            PictureAdapter(it)
        }
        Log.d(TAG, "onMap")
    }

}