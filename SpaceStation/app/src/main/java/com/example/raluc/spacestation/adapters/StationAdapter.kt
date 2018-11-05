package com.example.raluc.spacestation.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.raluc.spacestation.R
import com.example.raluc.spacestation.model.Station
import kotlinx.android.synthetic.main.location_detail.view.*

class StationAdapter (private val list: List <Station>) : RecyclerView.Adapter<StationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): StationAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.location_detail, null)
        return StationAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val station = list.get(position)


        holder.apply {
            latitude.text = station.request.latitude.toString()
            longitude.text = station.request.longitude.toString()
            altitude.text = station.request.altitude.toString()
            passes.text = station.request.passes.toString()
            duration.text = station.response.get(0).toString()
            raiseTime.text = station.response.get(1).toString()
        }

    }


    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        val latitude = view.findViewById<TextView>(R.id.latitude)
        val longitude = view.findViewById<TextView>(R.id.longitude)
        val altitude = view.findViewById<TextView>(R.id.altitude)

        val passes = view.findViewById<TextView>(R.id.passes)
        val duration = view.findViewById<TextView>(R.id.duration)
        val raiseTime = view.findViewById<TextView>(R.id.raiseTime)
    }
}