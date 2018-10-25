package com.example.raluc.splashscreen.counter


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.raluc.splashscreen.R


class ButtonFragment : Fragment() {
    private val TAG = "CounterFrag1"
    var seconds: Int = 0
    var running = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView Frag1")
        runTimer()
        Log.d(TAG, "onCreateView Frag1 after runTimer")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_button, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d(TAG, "onAttach Frag1")


    }

    fun btnClick(view: View) {
        Log.d(TAG, "Button Clicked Frag1")
        var button = ""
        when (view.id) {
            R.id.btnStart -> {
                button = "start"
            }

            R.id.btnStop -> {
                button = "stop"
            }

            R.id.btnRestart -> {
                button = "reset"
            }
        }

        Log.d(TAG, "inside bt clicked Frag1")
        val intent = Intent(context, Helper::class.java)
        intent.putExtra("buttonId", button)
        Log.d(TAG, "intent created Frag1")
        context?.startService(intent)
    }

    fun runTimer() {
        Log.d(TAG, "inside runTimer Frag1")
        val view: View? = this.view

        val timeView = view?.findViewById<TextView>(R.id.timerView)
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val secs = seconds % 60
        val time = String.format("%d : %02d : %02d", hours, minutes, secs)

        timeView?.setText(time)

        if (running) {
            seconds++
        }

    }


}
