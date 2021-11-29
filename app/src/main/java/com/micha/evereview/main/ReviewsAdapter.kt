package com.micha.evereview.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.micha.evereview.databinding.ItemReviewBinding
import com.micha.evereview.models.Review

class ReviewsAdapter : RecyclerView.Adapter<ReviewsViewHolder>() {
    private val reviews = arrayListOf<Review>()

    fun addReview(review: Review) {
        reviews.add(review)
        notifyItemInserted(reviews.size - 1)
    }

    fun addReviews(reviewsToAdd: Iterable<Review>) {
        val prevSize = reviews.size
        reviews.addAll(reviewsToAdd)
        notifyItemRangeInserted(prevSize, reviews.size - prevSize)
    }

    fun removeReview(review: Review) {
        val index = reviews.indexOf(review)
        if (index < 0) return

        reviews.removeAt(index)
        notifyItemRemoved(index)
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
