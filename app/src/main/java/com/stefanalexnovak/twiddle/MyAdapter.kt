package com.stefanalexnovak.twiddle

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<TweetListViewHolder>() {

    private val tempStrings = arrayOf("Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan",
        "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan",
        "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan", "Stefan")

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_view_holder, parent, false)
        return TweetListViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: TweetListViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

        holder.listPositionTextView.text = (position + 1).toString()
        holder.listTitleTextView.text = tempStrings[position]
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = tempStrings.size
}