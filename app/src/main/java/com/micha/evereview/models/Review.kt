package com.micha.evereview.models

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "reviews")
data class Review(
    val rating: Int = 0,
    val text: String = "",
    val metadata: Map<String, Serializable> = emptyMap(),

    @Embedded(prefix = "item_")
    val item: ReviewItem = ReviewItem(),

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
