package com.example.raluc.amazonbooks.data.repository

import android.arch.lifecycle.MutableLiveData
import com.example.raluc.amazonbooks.models.Book

interface Repository {

    fun getBooks(): MutableLiveData< List<Book>>
}