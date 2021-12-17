package com.micha.evereview

import androidx.room.Dao
import androidx.room.Query
import com.micha.evereview.models.Review

@Dao
interface ReviewsDao {
    @Query("SELECT * FROM reviews")
    fun getAll(): List<Review>
}
