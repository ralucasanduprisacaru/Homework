package com.example.raluc.flickerchallenge.data.remote

import com.example.raluc.flickerchallenge.Constants
import com.example.raluc.flickerchallenge.models.Picture
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteServiceHelper : RemoteService {
    override fun getPictures(): Deferred<List<Picture>> {
        val retrofit = getRetrofit()
        val service = retrofit.create(RemoteService::class.java)
        return service.getPictures()
    }

    private fun getRetrofit(): Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val ohHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()


        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(ohHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }
}