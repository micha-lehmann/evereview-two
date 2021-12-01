package com.micha.evereview.main

import androidx.recyclerview.widget.RecyclerView
import com.micha.evereview.databinding.ItemReviewBinding
import com.micha.evereview.models.Review

class ReviewsViewHolder(
    private val layout: ItemReviewBinding
) : RecyclerView.ViewHolder(layout.root) {
    fun fill(review: Review) {
        layout.description.text = review.text
        layout.title.text = review.itemTitle
    }
}
