package com.micha.evereview.models

data class Review(
    val itemTitle: String,
    val rating: Int,
    val text: String,
    val itemMetadata: Map<String, Any?> = emptyMap(),
    val metadata: Map<String, Any?> = emptyMap()
)
