package com.example.raluc.spacestation.data.services

import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.location.LocationManager
import com.example.raluc.spacestation.data.repository.RepositoryImpl

class ConnectivityCheck : IntentService("MyIntentService") {
    lateinit var manager : LocationManager
    lateinit var repository : RepositoryImpl


    override fun onHandleIntent(intent: Intent?) {

        val response = intent?.getStringExtra("response")



    }



    private fun checkConnection(): Boolean{
        manager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        return manager.isProviderEnabled(LocationManager.GPS_PROVIDER)
    }


}