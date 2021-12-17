package com.micha.evereview

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.micha.evereview.models.Review
import com.micha.evereview.util.Converters
import kotlinx.serialization.ExperimentalSerializationApi

@ExperimentalSerializationApi
@Database(entities = [Review::class], version = 1)
@TypeConverters(Converters::class)
abstract class ReviewsDatabase : RoomDatabase() {
    abstract fun reviewsDao(): ReviewsDao
}
