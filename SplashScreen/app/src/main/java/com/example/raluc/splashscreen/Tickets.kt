package com.example.raluc.splashscreen

import android.Manifest
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.SmsManager
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.support.constraint.solver.widgets.ResolutionDimension
import android.util.Log
import android.view.View
import android.support.v4.app.ActivityCompat
import android.content.pm.PackageManager
import android.support.v4.content.ContextCompat
import android.Manifest.permission
import android.Manifest.permission.READ_SMS
import android.support.annotation.NonNull






class Tickets : AppCompatActivity() {

    private val TAG = "Tickets"
    var message : String? = ""
    var phone : String? = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tickets)

         message = findViewById<EditText>(R.id.etMessage).toString()
         phone = findViewById<EditText>(R.id.etPhone).toString()
    }

    fun sendText(view : View){
        requestPermission()
        Log.d(TAG, message.toString())

        Log.d(TAG, "before")
        val smsManager = SmsManager.getDefault()
        smsManager.sendTextMessage(phone, null, message, null, null)
        Log.d(TAG, "sendText")
        Toast.makeText(this, "Message sent", Toast.LENGTH_LONG).show()

    }

    fun requestPermission (){
        val permission = Manifest.permission.READ_SMS
        val grant = ContextCompat.checkSelfPermission(this, permission)
        if (grant != PackageManager.PERMISSION_GRANTED) {
            val permission_list = arrayOfNulls<String>(1)
            permission_list[0] = permission
            ActivityCompat.requestPermissions(this, permission_list, 1)
        }
    }


}
