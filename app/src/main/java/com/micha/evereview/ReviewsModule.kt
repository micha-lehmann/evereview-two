package com.micha.evereview

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import javax.inject.Singleton


@ExperimentalSerializationApi
@Module
@InstallIn(SingletonComponent::class)
object ReviewsModule {
    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context): ReviewsDatabase {
        return Room.databaseBuilder(
            context,
            ReviewsDatabase::class.java, "review"
        ).build()
    }

    @Singleton
    @Provides
    fun provideDao(db: ReviewsDatabase): ReviewsDao {
        return db.reviewsDao()
    }
}
