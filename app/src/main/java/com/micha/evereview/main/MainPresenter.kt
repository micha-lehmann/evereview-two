package com.micha.evereview.main

import com.micha.evereview.ReviewsRepository
import com.micha.evereview.models.Review
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val view: MainContract.View,
    private val repo: ReviewsRepository
) : MainContract.Presenter {
    override val reviewsAdapter = ReviewsAdapter()

    override fun addReview(review: Review) = reviewsAdapter.addReview(review)

    override fun addReviews(reviews: Iterable<Review>) = reviewsAdapter.addReviews(reviews)

    override fun removeReview(review: Review) = reviewsAdapter.removeReview(review)
}
