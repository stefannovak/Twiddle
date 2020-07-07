package com.stefanalexnovak.twiddle

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<TweetListViewHolder>() {

    private val tempStrings = mutableListOf("Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan",
        "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan",
        "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan",
        "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan")

    private val defaultTweet0 = Tweet("mystdota", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweet1 = Tweet("longtext", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweet2 = Tweet("dreams of peaches", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweet3 = Tweet("edgyguy", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweet4 = Tweet("howaboudat", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweet5 = Tweet("thetrump", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
            "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.")
    private val defaultTweetList = mutableListOf<Tweet>(defaultTweet0, defaultTweet1, defaultTweet2, defaultTweet3, defaultTweet4, defaultTweet5)

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    fun addNewItem(tweet: String = "") {
        if (tweet.isEmpty()) {
            println("Invalid Tweet")
        } else {
            defaultTweetList.add(defaultTweetList.size, Tweet("Stefan Novak", tweet))
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_view_holder, parent, false)
        return TweetListViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: TweetListViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

//        holder.tweetUserTextView.text = (position + 1).toString()
//        holder.tweetBodyTextView.text = tempStrings[position]

        holder.tweetUserTextView.text = defaultTweetList[position].user
        holder.tweetBodyTextView.text = defaultTweetList[position].tweet
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = defaultTweetList.size
}