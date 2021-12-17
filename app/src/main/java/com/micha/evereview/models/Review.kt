package com.micha.evereview.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "reviews")
data class Review(
    val itemTitle: String,
    val rating: Int,
    val text: String,
    val itemMetadata: Map<String, Serializable> = emptyMap(),
    val metadata: Map<String, Serializable> = emptyMap(),

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0
)
