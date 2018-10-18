package com.example.raluc.splashscreen

import android.app.*
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.view.View
import com.example.raluc.splashscreen.pdf_viewer.PdfViewer

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    var NOTIFICATION_ID: Int = 1717
    var TAG: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun doSomething(view: View) {
        when (view.id) {
            R.id.btnPdfViewer -> {
                val intent = Intent(view.context, PdfViewer::class.java)
                startActivity(intent)
            }
            R.id.btnCounter -> {
                // alert
                showAlert()
            }
            R.id.btnNotification -> {

                showNotification()

                // this will be deleted if notification works
                // alert with list
                val intent = Intent(this, Tickets::class.java)
                startActivity(intent)

            }
        }
    }

    private fun showNotification() {
        var NOTIFICATION_ID = 1717
        var CHANNEL_ID: String = "01"
        var CHANNEL_NAME: String = "Channel 01"
        var IMPORTANCE = NotificationManager.IMPORTANCE_DEFAULT
        var DESCRIPTION: String = "My channel 01"


        val builder = NotificationCompat.Builder(this)
            .setSmallIcon(android.R.drawable.sym_def_app_icon)
            .setContentTitle(getString(R.string.notificationText))
            .setContentText(getString(R.string.notificationContentText))
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setAutoCancel(true)

        val actionIntent = Intent(this, Tickets::class.java)
        val pendingIntent = PendingIntent.getActivity(this, 0, actionIntent, PendingIntent.FLAG_UPDATE_CURRENT)

        builder.setContentIntent(pendingIntent)


        var notificationManager: NotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationManager.notify(1717, builder.build())
    }


    fun showAlert(){

        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            val intent = Intent(this, Counter::class.java)
            startActivity(intent)
        })
        builder.setMessage("Are you sure you want to see the timer ? Click \"OK\" to confirm")

        val dialog = builder.create()
        dialog.show()

    }

}
