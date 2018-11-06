package com.example.raluc.flickerchallenge.data.repository

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.example.raluc.flickerchallenge.data.remote.RemoteServiceHelper
import com.example.raluc.flickerchallenge.models.Picture
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import retrofit2.HttpException

class RepositoryImpl (

    val remoteServiceHelper: RemoteServiceHelper,
    val getPictureLiveData: MutableLiveData< List<Picture>>

) : Repository {
    override fun getPictures(): MutableLiveData<List<Picture>> {
        val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            if (throwable is HttpException) {
                Log.d("MainActivity", "In HttpException")
            } else {
                Log.d("MainActivity", "In other error")
                throwable.printStackTrace()
            }
        }

        launch(exceptionHandler){
            val getPictureResponse = remoteServiceHelper.getPictures().await()
            getPictureLiveData.postValue(getPictureResponse)
        }
        return getPictureLiveData
    }

}