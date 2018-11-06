package com.example.raluc.flickerchallenge.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.raluc.flickerchallenge.R
import com.example.raluc.flickerchallenge.models.Picture
import kotlinx.android.synthetic.main.picture_list_detail.view.*

class PictureAdapter (private val pictures: List<Picture>): RecyclerView.Adapter<PictureAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_list_detail, null)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = pictures.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val picture = pictures.get(position)
        val context : Context = holder.itemView.context

        holder.apply {
            title.text = picture.title
            description.text = picture.link
            Glide.with(context).load(picture.link).into(image)
        }
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title = view.tv_title
        val image = view.iv_Image
        val description = view.tv_description

    }
}