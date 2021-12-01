package com.micha.evereview.models

import java.util.*

data class Review(
    val text: String,
    val time: Date,
    val metadata: Map<String, Any?>,
    val itemTitle: String,
    val itemMetadata: Map<String, Any?>
)
