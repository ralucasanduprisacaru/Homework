package com.example.raluc.homeworkwk4.ui

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.util.Log
import com.example.raluc.homeworkwk4.BookListService
import com.example.raluc.homeworkwk4.R

class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID = "channel1"
    private val TAG = "Main"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createNotificationChannel()

        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.sym_def_app_icon)
            .setContentTitle("Notification")
            .setContentText("Retrieving book list")
            .setAutoCancel(true)

        // start service
        val intent = Intent(this, BookListService::class.java)
        val pendingIntent = PendingIntent.getActivity(this,0, intent, PendingIntent.FLAG_UPDATE_CURRENT)
        builder.setContentIntent(pendingIntent)
        Log.d(TAG, "onSendingIntent")
       val notificationManager : NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
       notificationManager.notify(1717, builder.build())
    }

    override fun onStart() {
        super.onStart()
    }

    fun createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Channel 1",
                NotificationManager.IMPORTANCE_HIGH
            )

            channel.description = "This is a channel"
            val manager : NotificationManager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannel(channel)

        }
    }

}
