package com.stefanalexnovak.twiddle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.lists_recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter()

        newTweetButton.setOnClickListener { _ ->
            showTweetDialog()
        }
    }

    private fun showTweetDialog() {

        val dialogTitle = getString(R.string.tweet_dialog_title)
        val positiveButtonTitle = getString(R.string.tweet)
        val myDialog = AlertDialog.Builder(this)
        val tweetEditText = EditText(this)

        myDialog.setTitle(dialogTitle)
        myDialog.setView(tweetEditText)

        myDialog.setPositiveButton(positiveButtonTitle) {
                dialog, _ ->
            val adapter = recyclerView.adapter as MyAdapter
            adapter.addNewItem(tweetEditText.text.toString())
            dialog.dismiss()
        }
        myDialog.create().show()
    }
}