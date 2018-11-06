package com.example.raluc.flickerchallenge.data.remote


import com.example.raluc.flickerchallenge.models.Picture
import kotlinx.coroutines.Deferred
import retrofit2.http.GET


interface RemoteService {
    @GET("?format=json")
    fun getPictures() : Deferred <List<Picture>>
}