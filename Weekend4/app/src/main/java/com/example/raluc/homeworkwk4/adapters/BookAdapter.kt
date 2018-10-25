package com.example.raluc.homeworkwk4.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.raluc.homeworkwk4.models.Book
import com.example.raluc.homeworkwk4.R
import com.example.raluc.homeworkwk4.adapters.BookAdapter.MyViewHolder
import kotlinx.android.synthetic.main.book_list.view.*

class BookAdapter (val bookList : ArrayList<Book>, val context : Context) : RecyclerView.Adapter<MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(context).inflate(R.layout.book_list, parent, false))


    override fun getItemCount(): Int = bookList.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bookName?.text = bookList.get(position).name
        holder.bookAuthor?.text = bookList.get(position).author
        holder.bookYear?.text = bookList.get(position).year.toString()
        holder.bookPrice?.text = bookList.get(position).price.toString()
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val bookName = view.bookName
        val bookAuthor = view.bookAuthor
        val bookYear = view.bookYear
        val bookPrice = view.bookPrice
    }
}