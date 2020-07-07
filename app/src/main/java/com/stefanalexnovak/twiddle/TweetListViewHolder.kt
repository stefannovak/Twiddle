package com.stefanalexnovak.twiddle

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//    var listPositionTextView = itemView.findViewById<TextView>(R.id.itemNumber)
//    var listTitleTextView = itemView.findViewById<TextView>(R.id.itemString)

    var tweetUserTextView = itemView.findViewById<TextView>(R.id.tweetUser)
    var tweetBodyTextView = itemView.findViewById<TextView>(R.id.tweetBody)
}