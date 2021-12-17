package com.micha.evereview

import com.micha.evereview.models.Review
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ReviewsRepository @Inject constructor(
    private val reviewsDao: ReviewsDao
) {
    fun getReviews(): List<Review> = runBlocking(Dispatchers.IO) {
        reviewsDao.getAll() + listOf(
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
