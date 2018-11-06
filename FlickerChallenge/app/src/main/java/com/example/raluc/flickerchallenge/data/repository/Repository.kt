package com.example.raluc.flickerchallenge.data.repository

import android.arch.lifecycle.MutableLiveData
import com.example.raluc.flickerchallenge.models.Picture

interface Repository {
    fun getPictures() : MutableLiveData<List<Picture>>
}