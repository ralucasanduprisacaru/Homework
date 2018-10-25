package com.example.raluc.amazonbooks.data.remote

import android.content.ContentValues.TAG
import android.util.Log
import com.example.raluc.amazonbooks.Constants
import com.example.raluc.amazonbooks.models.Book
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory
import kotlinx.coroutines.experimental.Deferred
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteServiceHelper : RemoteService {

    private val LOG = "RemoteService"

    override fun getBooks(): Deferred< List<Book>> {
        val retrofit = getRetrofit()
        val service = retrofit.create(RemoteService::class.java)
        Log.d(TAG, "service: " + service.getBooks().toString())
        return service.getBooks()
    }

    fun getRetrofit() : Retrofit {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()

        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }


}