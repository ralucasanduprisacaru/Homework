package com.example.raluc.spacestation.data.repository

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import android.widget.Toast
import com.example.raluc.spacestation.data.remote.RemoteServiceHelper
import com.example.raluc.spacestation.model.Station
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import retrofit2.HttpException

class RepositoryImpl (val remoteServiceHelper: RemoteServiceHelper , val getStationLiveData : MutableLiveData<List<Station>>) : Repository{

    private val TAG = "RepositoryImpl"

    override fun getStation(): MutableLiveData<List<Station>> {

        val exceptionHandler = CoroutineExceptionHandler {
            _, throwable ->
                if (throwable is HttpException) {
                  Log.d(TAG, "HttpException")
                }else {
                    Log.d(TAG, "Other error")
                    throwable.printStackTrace()
                }

        }

        launch(exceptionHandler) {
            val getStationResponse = remoteServiceHelper.getStation().await()
            getStationLiveData.postValue(getStationResponse)
        }
        Log.d(TAG, "getStationLiveData")
        return getStationLiveData
    }


}