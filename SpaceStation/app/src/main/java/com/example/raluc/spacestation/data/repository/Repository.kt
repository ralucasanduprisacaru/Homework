package com.example.raluc.spacestation.data.repository

import android.arch.lifecycle.MutableLiveData
import com.example.raluc.spacestation.model.Station

interface Repository {

    fun getStation() : MutableLiveData<List<Station>>;
}