package com.example.raluc.splashscreen.pdf_viewer

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentTransaction
import android.view.View
import com.example.raluc.splashscreen.MainActivity
import com.example.raluc.splashscreen.R
import com.example.raluc.splashscreen.fragments.DialogFragmentTicket
import com.github.barteksc.pdfviewer.PDFView
import java.lang.Exception


class PdfViewer : AppCompatActivity() {

    val TAG: String = "PdfViewer"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_viewer)

        val pdfViewer : PDFView = findViewById(R.id.pdfViewer)
        pdfViewer.fromAsset("stadium.pdf").load()

    }




    fun goBack(view: View) {

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun clickMe(view : View){
        val ft : FragmentTransaction? = getSupportFragmentManager().beginTransaction()
        val prev : android.support.v4.app.Fragment? = getSupportFragmentManager().findFragmentByTag("dialog")

        if (prev != null) {
            ft?.remove(prev);
        }
        ft?.addToBackStack(null);

        val dialogFragment : DialogFragment = DialogFragmentTicket()
        dialogFragment.show(ft, "dialog")

        Thread {
            try {
                Thread.sleep(3000)
            }catch (e: Exception){
                e.printStackTrace()
            }finally {
                dialogFragment.dismiss()
            }
        }.start()

    }

}


