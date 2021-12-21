package com.micha.evereview.models

import java.io.Serializable

data class ReviewItem(
    val title: String = "",
    val metadata: Map<String, Serializable> = emptyMap()
)
