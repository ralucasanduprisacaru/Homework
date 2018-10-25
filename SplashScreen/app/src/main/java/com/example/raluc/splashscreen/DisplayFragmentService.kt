package com.example.raluc.splashscreen

import android.app.IntentService
import android.content.Intent

class DisplayFragmentService : IntentService("DisplayFragmentService") {
    override fun onHandleIntent(intent: Intent?) {
        when (intent?.getAction()){
            "start" ->{

            }


            "stop" ->{

            }

        }
    }
}