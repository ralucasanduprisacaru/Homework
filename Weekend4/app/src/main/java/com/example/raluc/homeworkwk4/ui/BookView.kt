package com.example.raluc.homeworkwk4.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.raluc.homeworkwk4.models.Book
import com.example.raluc.homeworkwk4.adapters.BookAdapter
import com.example.raluc.homeworkwk4.R

class BookView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_view)

        // get list of books

        val intent = intent
        val bookList = intent.getParcelableArrayListExtra<Book>("bookList")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclewView)

        recyclerView.adapter = BookAdapter(bookList, this)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}
