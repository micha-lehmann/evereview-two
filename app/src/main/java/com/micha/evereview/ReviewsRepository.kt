package com.micha.evereview

import androidx.lifecycle.LiveData
import com.micha.evereview.models.Review
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ReviewsRepository @Inject constructor(
    private val reviewsDao: ReviewsDao
) {
    fun get() = runBlocking(Dispatchers.IO) {
        reviewsDao.get()
    }

    fun get(vararg reviewIds: Int) = runBlocking(Dispatchers.IO) {
        reviewsDao.get(*reviewIds)
    }

    fun add(vararg reviews: Review) = runBlocking(Dispatchers.IO) {
        reviewsDao.add(*reviews)
    }

    fun remove(vararg reviews: Review) = runBlocking(Dispatchers.IO) {
        reviewsDao.remove(*reviews)
    }

    fun remove(vararg reviewIds: Int) = runBlocking(Dispatchers.IO) {
        reviewsDao.remove(*reviewIds)
    }

    fun edit(vararg reviews: Review) = runBlocking(Dispatchers.IO) {
        reviewsDao.edit(*reviews)
    }

    fun getLive(): LiveData<List<Review>> = runBlocking(Dispatchers.IO) {
        reviewsDao.getLive()
    }
}
