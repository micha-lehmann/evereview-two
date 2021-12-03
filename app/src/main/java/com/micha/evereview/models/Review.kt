package com.micha.evereview.models

data class Review(
    val text: String,
    val metadata: Map<String, Any?>,
    val itemTitle: String,
    val itemMetadata: Map<String, Any?>
)
