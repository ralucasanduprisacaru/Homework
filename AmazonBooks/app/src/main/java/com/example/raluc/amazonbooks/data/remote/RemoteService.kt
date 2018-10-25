package com.example.raluc.amazonbooks.data.remote

import com.example.raluc.amazonbooks.models.Book
import kotlinx.coroutines.experimental.Deferred
import retrofit2.http.GET

interface RemoteService {
    @GET("books.json")
    fun getBooks() : Deferred< List<Book>>
}