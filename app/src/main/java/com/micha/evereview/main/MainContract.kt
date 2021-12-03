package com.micha.evereview.main

import com.micha.evereview.models.Review

interface MainContract {
    interface View

    interface Presenter {
        val reviewsAdapter: ReviewsAdapter

        fun addReview(review: Review)

        fun addReviews(reviews: Iterable<Review>)

        fun removeReview(review: Review)
    }
}
