package com.example.raluc.fridaytestkotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_item.*

class ItemFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_item, container, false);
        return view
    }

    fun carsaved (car : Car){
        etModel. = car.model
        etType.text = car.type
    }
}