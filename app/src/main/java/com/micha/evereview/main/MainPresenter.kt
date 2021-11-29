package com.micha.evereview.main

import com.micha.evereview.models.Review

class MainPresenter(
    private val view: View
) {
    val reviewsAdapter = ReviewsAdapter()

    fun addReview(review: Review) = reviewsAdapter.addReview(review)

    fun addReviews(reviews: Iterable<Review>) = reviewsAdapter.addReviews(reviews)

    fun removeReview(review: Review) = reviewsAdapter.removeReview(review)

    interface View
}
