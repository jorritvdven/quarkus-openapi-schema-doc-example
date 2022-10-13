package com.jdriven.blog.model

import java.time.LocalDate

data class Post(
    val author: Author,
    val tags: List<String>,
    val publishedOn: LocalDate,
    val title: String,
    val post: String,
    val comments: List<Comment>
)
