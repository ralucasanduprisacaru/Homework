package com.example.raluc.spacestation.data.services

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.raluc.spacestation.Constants

class MyBroadcastReceiver : BroadcastReceiver() {
    private val TAG = "MyBroadcastReceiver"


    override fun onReceive(context: Context?, intent: Intent?) {

        val response = intent?.getStringExtra(Constants.KEY.RESPONSE)

        if (Intent.ACTION_PROVIDER_CHANGED.equals(intent?.action)) {
            val pushIntent = Intent(context, ConnectivityCheck::class.java)
            pushIntent.putExtra("response", response)
            context?.startService(pushIntent)
        }
    }
}