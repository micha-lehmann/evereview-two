package com.micha.evereview

import com.micha.evereview.models.Review
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ReviewsRepository @Inject constructor() {
    fun getReviews(): List<Review> {
        return listOf(
            Review(
                "Avengers",
                8,
                "Pretty good."
            ),
            Review(
                "The Incredible Hulk",
                3,
                "What an abomination... get it?"
            ),
            Review(
                "Die Eiskönigin: Völlig Unverfroren (Frozen)",
                6,
                "Actually not that bad tbh."
            )
        )
    }
}
