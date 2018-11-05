package com.example.raluc.spacestation.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import android.util.Log
import com.example.raluc.spacestation.adapters.StationAdapter
import com.example.raluc.spacestation.data.remote.RemoteServiceHelper
import com.example.raluc.spacestation.data.repository.RepositoryImpl
import com.example.raluc.spacestation.model.Station

class MainViewModel : ViewModel() {
    private val TAG = "MainViewModel"
    lateinit var repository: RepositoryImpl
    lateinit var remoteServiceHelper: RemoteServiceHelper
    lateinit var getStationData: MutableLiveData<List<Station>>


    init {

        remoteServiceHelper = RemoteServiceHelper()
        getStationData = MutableLiveData()
        repository = RepositoryImpl(remoteServiceHelper, getStationData)
        Log.d(TAG, "insideViewmodel")
    }

    fun getStation(): LiveData<StationAdapter> {
        return Transformations.map(repository.getStation()) {
            StationAdapter(it)
        }
    }
}