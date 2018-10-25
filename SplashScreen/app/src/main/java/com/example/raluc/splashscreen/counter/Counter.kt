package com.example.raluc.splashscreen.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.util.Log
import android.widget.TextView
import com.example.raluc.splashscreen.R

class Counter : AppCompatActivity() {

    private var seconds: Int = 0
    private var running = true
    private val TAG = "Counter"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        Log.d(TAG, "")

        val buttonFragment = ButtonFragment()
        val timerFragment = TimerFragment()


        val transaction: FragmentTransaction = getSupportFragmentManager().beginTransaction()

        transaction.add(R.id.buttonFragment, buttonFragment)
        transaction.add(R.id.timerFragment, timerFragment)
        transaction.commit()

       val textView = findViewById<TextView>(R.id.timerView)


    }

}
