package com.micha.evereview.main

import com.micha.evereview.ReviewsRepository
import com.micha.evereview.models.Review
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val view: MainContract.View,
    private val repo: ReviewsRepository
) : MainContract.Presenter {
    override val reviewsAdapter = ReviewsAdapter(repo.getLive())

    override fun addReview(review: Review) = repo.add(review)

    override fun removeReview(review: Review) = repo.remove(review)

    override fun editReview(review: Review) = repo.edit(review)

    override fun onAddPressed() {
        addReview(Review("Test", 10, "This is a test"))
    }
}
