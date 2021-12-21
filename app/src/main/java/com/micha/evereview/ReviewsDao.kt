package com.micha.evereview

import androidx.lifecycle.LiveData
import androidx.room.*
import com.micha.evereview.models.Review

@Dao
interface ReviewsDao {
    @Query("SELECT * FROM reviews")
    fun get(): List<Review>

    @Query("SELECT * FROM reviews WHERE id IN(:reviewIds)")
    fun get(vararg reviewIds: Int): List<Review>

    @Insert
    fun add(vararg reviews: Review)

    @Delete
    fun remove(vararg reviews: Review)

    @Query("DELETE FROM reviews WHERE id IN(:reviewIds)")
    fun remove(vararg reviewIds: Int)

    @Update
    fun edit(vararg reviews: Review)

    @Query("SELECT * FROM reviews")
    fun getLive(): LiveData<List<Review>>
}
