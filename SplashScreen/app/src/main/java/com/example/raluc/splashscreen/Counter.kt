package com.example.raluc.splashscreen

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction
import android.view.View
import android.widget.TextView
import com.example.raluc.splashscreen.fragments.CounterFragment1
import com.example.raluc.splashscreen.fragments.CounterFragment2

class Counter : AppCompatActivity() {

    private var seconds: Int = 0
    private var running = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        val fragment1 = CounterFragment1()
        val fragment2 = CounterFragment2()

        val transaction: FragmentTransaction = getSupportFragmentManager().beginTransaction()

        transaction.add(R.id.counterFragment1, fragment1)
        transaction.add(R.id.counterFragment2, fragment2)
        transaction.commit()





    }

    fun runTimer() {

        val timeView = findViewById<TextView>(R.id.timerView)
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val secs = seconds % 60
        val time = String.format("%d : %02d : %02d", hours, minutes, secs)

        timeView?.setText(time)

        if (running){
            seconds++
        }

    }

}
