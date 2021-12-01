package com.micha.evereview.main

import com.micha.evereview.models.Review
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

interface MainContract {
    interface View {

    }

    interface Presenter {
        val reviewsAdapter: ReviewsAdapter

        fun addReview(review: Review)

        fun addReviews(reviews: Iterable<Review>)

        fun removeReview(review: Review)
    }
}



@Module
@InstallIn(ActivityComponent::class)
abstract class MainModule {
    @Binds
    abstract fun bindView(activity: MainActivity): MainContract.View

    @Binds
    abstract fun bindPresenter(presenter: MainPresenter): MainContract.Presenter
}
