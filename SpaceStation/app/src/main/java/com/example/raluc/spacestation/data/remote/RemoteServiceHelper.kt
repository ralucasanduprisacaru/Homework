package com.example.raluc.spacestation.data.remote

import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.util.Log
import com.example.raluc.spacestation.Constants
import com.example.raluc.spacestation.data.services.MyBroadcastReceiver
import com.example.raluc.spacestation.model.Station
import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteServiceHelper : RemoteService {
    private val TAG = "RemoteService"

    override fun getStation(): Deferred<List<Station>> {
        val retrofit = getRetrofit()
        val service = retrofit.create(RemoteService::class.java)
        return service.getStation()
    }


    fun getRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder().addInterceptor(interceptor).build()
        Log.d(TAG, "interceptor")

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }



}