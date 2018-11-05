package com.example.raluc.spacestation.data.remote

import com.example.raluc.spacestation.model.Station
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface RemoteService {
    @GET("iss-pass.json")
    fun getStation(): Deferred<List<Station>>
}