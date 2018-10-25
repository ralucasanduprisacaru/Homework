package com.example.raluc.amazonbooks.data.repository

import android.arch.lifecycle.MutableLiveData
import android.util.Log
import com.example.raluc.amazonbooks.data.remote.RemoteServiceHelper
import com.example.raluc.amazonbooks.models.Book
import com.google.gson.Gson
import kotlinx.coroutines.experimental.CoroutineExceptionHandler
import kotlinx.coroutines.experimental.launch
import okhttp3.ResponseBody
import retrofit2.HttpException
import javax.inject.Inject

class RepositoryImpl (

    val remoteServiceHelper: RemoteServiceHelper,
    val getBookLiveData: MutableLiveData< List<Book>>

) : Repository {
    private val TAG: String = "RepositoryIMpl"

    override fun getBooks(): MutableLiveData< List<Book>> {

        val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
            if (throwable is HttpException) {
                Log.d("Main", "In HttpException")
            } else {
                Log.d("Main", "In other error")
                throwable.printStackTrace()
            }
        }

        launch(exceptionHandler) {
            val getBookResponse = remoteServiceHelper.getBooks().await()
            getBookLiveData.postValue(getBookResponse)
        }
        return getBookLiveData
    }


}
