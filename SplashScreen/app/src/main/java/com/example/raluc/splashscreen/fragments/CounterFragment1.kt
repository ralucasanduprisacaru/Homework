package com.example.raluc.splashscreen.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.raluc.splashscreen.R


class CounterFragment1 : Fragment() {

    var seconds: Int = 0
    var running = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter_fragment1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fun btnClick(view: View) {
            when (view.id) {
                R.id.btnStart -> {
                    running = true
                }

                R.id.btnStop -> {
                    running = false
                }

                R.id.btnRestart -> {
                    running = false
                    seconds = 0
                }
            }


        }

    }









}
