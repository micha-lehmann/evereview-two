package com.micha.evereview.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.micha.evereview.databinding.ItemReviewBinding
import com.micha.evereview.models.Review

@SuppressLint("NotifyDataSetChanged")
class ReviewsAdapter(
    private val data: LiveData<List<Review>>
) : RecyclerView.Adapter<ReviewsViewHolder>() {
    private val reviews get() = data.value ?: emptyList()

    init {
        data.observeForever {
            notifyDataSetChanged()
        }
    }

    override fun getItemCount() = reviews.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val layout = ItemReviewBinding.inflate(layoutInflater, parent, false)

        return ReviewsViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ReviewsViewHolder, position: Int) {
        holder.fill(reviews[position])
    }
}
