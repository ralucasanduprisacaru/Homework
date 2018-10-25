package com.example.raluc.amazonbooks.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.raluc.amazonbooks.R
import com.example.raluc.amazonbooks.models.Book
import com.example.raluc.amazonbooks.ui.MainActivity

class BookAdapter(private val books: List<Book>) : RecyclerView.Adapter<BookAdapter.ViewHolder>() {
    private val TAG = "Adapter"


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val book = books[position]
        val context : Context = holder.itemView.context

        holder.apply {
            tvTitle.text = book.title
            Glide.with(context).load(book.imageURL).into(tvImage)

            tvAuthor.text = book.author

        }

        Log.d(TAG, "onBindViewHolder")
    }


    override fun onCreateViewHolder(parent: ViewGroup, int: Int): BookAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.book_detail, null)
        Log.d(TAG, "onCreateViewHolder")
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = books.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle : TextView = view.findViewById(R.id.tvTitle)
        val tvImage : ImageView = view.findViewById(R.id.ivImage)
        val tvAuthor : TextView = view.findViewById(R.id.tvAuthor)
    }



}