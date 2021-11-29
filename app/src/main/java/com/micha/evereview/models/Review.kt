package com.micha.evereview.models

import java.util.*

data class Review(
    val item: ReviewItem,
    val description: String,
    val time: Date,
    val metadata: Map<String, Any?>
)
