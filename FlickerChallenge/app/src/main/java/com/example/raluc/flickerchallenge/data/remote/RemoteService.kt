package com.example.raluc.flickerchallenge.data.remote

import retrofit2.http.GET

interface RemoteService {

    @GET("")
    fun getPictures() : Deffered <List<Photo>>
}