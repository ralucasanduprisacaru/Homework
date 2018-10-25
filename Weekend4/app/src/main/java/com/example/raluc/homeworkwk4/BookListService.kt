package com.example.raluc.homeworkwk4

import android.app.IntentService
import android.content.Intent
import android.util.Log
import com.example.raluc.homeworkwk4.models.Book
import com.example.raluc.homeworkwk4.ui.BookView


class BookListService : IntentService("BookListService") {
    private val TAG = "BookListService"

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d(TAG, "onStartCommand: ")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleIntent(intent: Intent?) {
        Log.d(TAG, "onHandleIntent: ")
        // get the list of books
        val bookList = getBooks()
        val intent = Intent(this, BookView::class.java)
        intent.putExtra("booList", bookList)
        startActivity(intent)
    }

    fun getBooks(): ArrayList<Book> {
        val bookList = arrayListOf<Book>()

        // connect and get list of books
        bookList.apply {
            this.add(Book("Name1", "Author1", 500.00, 1979))
            this.add(Book("Name2", "Author2", 500.00, 1979))
            this.add(Book("Name3", "Author3", 500.00, 1979))
            this.add(Book("Name4", "Author4", 500.00, 1979))
            this.add(Book("Name5", "Author5", 500.00, 1979))
        }

        return bookList
    }
}
